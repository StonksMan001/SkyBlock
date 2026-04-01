package net.me.quark_innermod.content.automation.module;

import com.mojang.authlib.GameProfile;
import net.fabricmc.fabric.api.entity.FakePlayer;
import net.me.quark_innermod.base.QuarkFabric;
import net.me.quark_innermod.config.QuarkConfigs;
import net.me.quark_innermod.content.automation.block.FeedingTroughBlock;
import net.me.quark_innermod.content.automation.block_entity.FeedingTroughBlockEntity;
import net.me.quark_innermod.internal_zeta.org.ZetaModule;
import net.me.skycore_supermod.mixin.quark.TemptGoalAccessor;
import net.me.skycore_supermod.mixin.quark.TemptationsSensorAccessor;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.ai.brain.sensor.TemptationsSensor;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.screen.Generic3x3ContainerScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.poi.PointOfInterestStorage;
import net.minecraft.world.poi.PointOfInterestType;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Predicate;

@Deprecated
public class FeedingTroughModule extends ZetaModule {

    // final stuff
    private static final RegistryKey<PointOfInterestType> FEEDING_TROUGH_POI_KEY = SkyCore.BuiltinRegistries.poiRegistryKey("feeding_trough");
    private static final Set<FakePlayer> FREE_FAKE_PLAYERS = new HashSet<>();
    /**Note from original
     * fake players created are either stored here above or in the cache below.
     * this way each animal has its own player which is needed as they are moved in diff pos*/
    private static final WeakHashMap<AnimalEntity, TroughPointer> NEARBY_TROUGH_CACHE = new WeakHashMap<>();
    private static final ThreadLocal<Boolean> breedingOccurred = ThreadLocal.withInitial(() -> false);

    // other
    private static int fakePlayersCount = 0;
    public static BlockEntityType<FeedingTroughBlockEntity> feedingTroughBlockEntityType;
    /**Note from ProjectF>F
     * Unused ScreenHandlerType from the original, might be used in the future (unlikely)*/
    public static ScreenHandlerType<Generic3x3ContainerScreenHandler> feedingTroughScreenHandlerType;
    public static Block feedingTroughBlock;
    public static PointOfInterestType feedingTroughPoiType;

    // configs
    public static int cooldown = QuarkConfigs.Automation.FeedingTrough.cooldown;
    public static int maxAnimals = QuarkConfigs.Automation.FeedingTrough.maxAnimals;
    public static double loveChance = QuarkConfigs.Automation.FeedingTrough.loveChance;
    public static double range = QuarkConfigs.Automation.FeedingTrough.range;
    public static double lookChance = QuarkConfigs.Automation.FeedingTrough.lookChance;

    //TODO: not sure this works properly. it only cancels the first orb
    public void onBreed(/*ZBabyEntitySpawn.Lowest event*/) {
        /**Note from ProjectF>F: not implemented*/
    }
    public void onOrbSpawn(/*ZEntityJoinLevel event*/) {
        /**Note from ProjectF>F: not implemented*/
    }
    /**Note from original

     * Both TempingSensor and TemptGoal work by keeping track of a nearby player who is holding food.
     * The Feeding Trough causes mobs to pathfind to it by injecting a fakeplayer into these AI goals, who stands at the
     * location of the Trough and holds food they like.

     * The "realPlayer" parameter represents a real player located by existing TemptingSensor/TemptGoal code.
     * If there is a real player, and they are holding food, we don't swap them for a fakeplayer, so that animals path to
     * real players before they consider pathing to the Trough.
     * We now only call these if a valid realPlayer is not there, hence why we don't need that parameter anymore*/
    public static @Nullable PlayerEntity modifyTemptingSensor(TemptationsSensor sensor, AnimalEntity animalEntity, ServerWorld world) {
        return modifyTempt(world, animalEntity, ((TemptationsSensorAccessor) sensor).quark$getPredicate());
    }

    public static @Nullable PlayerEntity modifyTemptGoal(TemptGoal goal, AnimalEntity animalEntity, ServerWorld world) {
        return modifyTempt(world, animalEntity, ((TemptGoalAccessor) goal).quark$getFoodPredicate());
    }
    private static @Nullable PlayerEntity modifyTempt(ServerWorld serverWorld, AnimalEntity animalEntity, Predicate<ItemStack> temptations) {
        //early-exit conditions
        if (!QuarkConfigs.Automation.feedingTrough ||
                !animalEntity.canEat() ||
                animalEntity.getBreedingAge() != 0
        ) {
            return null;
        }

        //do we already know about a nearby trough?
        var iterator = NEARBY_TROUGH_CACHE.entrySet().iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            TroughPointer pointer = entry.getValue();
            if (!pointer.valid(entry.getKey())) {
                iterator.remove();
                // add fake player back to the list
                FREE_FAKE_PLAYERS.add(pointer.fakePlayer);
            }
        }
        TroughPointer pointer = NEARBY_TROUGH_CACHE.get(animalEntity);

        //There's no cached trough nearby.
        //Randomize whether we actually look for a new trough, to hopefully not eat all the tick time.
        if (pointer == null && serverWorld.random.nextFloat() <= lookChance*20) {
            pointer = TroughPointer.find(serverWorld, animalEntity, temptations);
            if (pointer != null){
                NEARBY_TROUGH_CACHE.put(animalEntity, pointer);
                // remove from free players list
                FREE_FAKE_PLAYERS.remove(pointer.fakePlayer);
            }
        }

        //did we find one?
        if (pointer != null) {
            pointer.tryEatingOrTickCooldown(animalEntity);

            if (!pointer.isOnCooldown()) {

                //if the animal can see it, direct the animal to this trough's fakeplayer
                BlockPos location = pointer.pos;
                Vec3d eyesPos = animalEntity.getPos().add(0, animalEntity.getEyeHeight(animalEntity.getPose()), 0);
                Vec3d targetPos = new Vec3d(location.getX(), location.getY(), location.getZ()).add(0.5, 0.0625, 0.5);
                BlockHitResult ray = serverWorld.raycast(new RaycastContext(eyesPos, targetPos, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, animalEntity));
                if (ray.getType() == HitResult.Type.BLOCK && ray.getBlockPos().equals(location)) {
                    return pointer.fakePlayer;
                }
            }
        }

        return null;
    }

    @Override
    public void register() {
        feedingTroughBlock = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__feeding_trough",
                new FeedingTroughBlock(AbstractBlock.Settings
                        .create()
                        .mapColor(MapColor.OAK_TAN)
                        .burnable()
                        .strength(0.6f)
                        .sounds(BlockSoundGroup.WOOD)));

        feedingTroughBlockEntityType = SkyCore.BuiltinRegistries.registerBlockEntityType("quark__feeding_trough",
                BlockEntityType.Builder.create(FeedingTroughBlockEntity::new, feedingTroughBlock).build(null));

        feedingTroughPoiType = SkyCore.BuiltinRegistries.registerPointOfInterest("quark__feeding_trough", 1, 32, feedingTroughBlock);

        QuarkFabric.addFlammableZetaBlock(feedingTroughBlock);
    }

    @Override
    public void registerClient() {
    }

    private static final class TroughPointer {
        private final BlockPos pos;
        private final FakePlayer fakePlayer;
        private final Predicate<ItemStack> temptations;
        private int eatCooldown = 0; /**Note from original: Ideally cooldown should be per entity... Assuming troughs don't change much this is fine*/
        private int giveUpCooldown = 20 * 20; /**Note from original: max seconds till we give up*/

        private TroughPointer(BlockPos pos, FakePlayer player, Predicate<ItemStack> temptations) {
            this.pos = pos;
            this.fakePlayer = player;
            this.temptations = temptations;
        }
        /**Note from original
         * This is a bit ugly. 0 = new pointer, 1 = end of life, other = ticking cooldown
         * Once a through is found and an animal is fed, its considered valid until cooldown runs out.
         * Then its invalidated so animals can find possibly closer ones
         */
        boolean valid(AnimalEntity animalEntity) {
            if (animalEntity.isRemoved() || !animalEntity.isAlive() || fakePlayer.getWorld() != animalEntity.getWorld() || pos.getSquaredDistance(animalEntity.getPos()) > range * range) {
                return false;
            }
            if (eatCooldown == 1){
                return false;
            }
            if (giveUpCooldown <= 0){
                return false;
            }
            if (eatCooldown != 0) return true;

            //check if it has food and tile is valid
            if(animalEntity.getWorld().getBlockEntity(pos) instanceof FeedingTroughBlockEntity trough){
                //this should be called in tick, but we save one tile call by doing this...
                trough.updateFoodHolder(animalEntity, temptations, fakePlayer);
                //if it still has food
                return !fakePlayer.getMainHandStack().isEmpty();
            }
            return false;
        }

        void tryEatingOrTickCooldown(AnimalEntity animalEntity) {
            giveUpCooldown--;
            if (eatCooldown == 0) {
                float feedDistance = 0.5f +animalEntity.getWidth()*1.8f;
                if (pos.getSquaredDistance(animalEntity.getPos()) < (feedDistance * feedDistance)) {
                    if (animalEntity.getWorld().getBlockEntity(pos) instanceof FeedingTroughBlockEntity trough) {
                        switch (trough.tryFeedingAnimal(animalEntity)) {
                            case FED -> eatCooldown = cooldown; // just fed. set normal cooldown
                            case SECS -> eatCooldown = 1; // remove immediately, as it will use animal own love cooldown for feeding again
                        }
                    }
                }
            } else eatCooldown--;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            var that = (TroughPointer) obj;
            return Objects.equals(this.pos, that.pos) &&
                    Objects.equals(this.fakePlayer, that.fakePlayer);
        }
        @Override
        public int hashCode() {
            return Objects.hash(pos, fakePlayer);
        }

        /**Note from original

         * If animal cant eat.
         * Pointer won't be erased
         * until cooldown is 0. Maybe would have been better with entity nbt data like it was so it persisted
         */
        public boolean isOnCooldown() {
            return eatCooldown != 0;
        }

        @Nullable
        static TroughPointer find(ServerWorld serverWorld, AnimalEntity animalEntity, Predicate<ItemStack> predicate) {
            // this is an expensive part
            BlockPos position = animalEntity.getSteppingPos();
            Optional<BlockPos> opt = serverWorld.getPointOfInterestStorage().getNearestPosition(
                    /**Note from ProjectF>F
                     * Not sure if this works properly, it looks like it does*/
                    registryEntry -> registryEntry.matchesId(FEEDING_TROUGH_POI_KEY.getValue()), p -> p.getSquaredDistance(position) <= range * range,
                    position, (int) range, PointOfInterestStorage.OccupationStatus.ANY);
            if (opt.isPresent()) {
                BlockPos pos = opt.get();

                if (serverWorld.getBlockEntity(pos) instanceof FeedingTroughBlockEntity trough) {
                    //only returns if it has the right food
                    FakePlayer foodHolder = getOrCreateFakePlayer(serverWorld);
                    if (foodHolder != null) {
                        trough.updateFoodHolder(animalEntity, predicate, foodHolder);
                        // if it has a food item
                        if (!foodHolder.getMainHandStack().isEmpty()) {
                            return new TroughPointer(pos, foodHolder, predicate);
                        }
                    }
                    return null;
                }
            }
            return null;
        }
    }
    private static FakePlayer getOrCreateFakePlayer(ServerWorld serverWorld){
        Optional<FakePlayer> any = FREE_FAKE_PLAYERS.stream().findAny();
        if(any.isEmpty()){
            GameProfile dummyProfile = new GameProfile(UUID.randomUUID(), "[FeedingTrough-"+ ++fakePlayersCount+"]");
            var p = FakePlayer.get(serverWorld, dummyProfile);
            FREE_FAKE_PLAYERS.add(p);
            return p;
        }
        else {
            return any.get();
        }
    }
}
