package net.me.quark_innermod.content.automation.block_entity;

import net.fabricmc.fabric.api.entity.FakePlayer;
import net.me.quark_innermod.content.automation.block.FeedingTroughBlock;
import net.me.quark_innermod.content.automation.module.FeedingTroughModule;
import net.me.quark_innermod.internal_zeta.org.MiscUtil;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.screen.Generic3x3ContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;

import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class FeedingTroughBlockEntity extends LootableContainerBlockEntity {

    private DefaultedList<ItemStack> stacks;
    private long internalRNG = 0;

    public FeedingTroughBlockEntity(BlockPos pos, BlockState state) {
        super(FeedingTroughModule.feedingTroughBlockEntityType, pos, state);
        this.stacks = DefaultedList.ofSize(9, ItemStack.EMPTY);
    }
    public void updateFoodHolder(AnimalEntity animalEntity, Predicate<ItemStack> predicate, FakePlayer fakePlayer) {
        for ( int i = 0; i < size(); i++) {
            ItemStack stack = this.getStack(i);
            if(predicate.test(stack) && animalEntity.isBreedingItem(stack)) {
                PlayerInventory playerInventory = fakePlayer.getInventory();
                playerInventory.main.set(playerInventory.selectedSlot, stack);
                Vec3d througPos = new Vec3d(pos.getX(), pos.getY(), pos.getZ())
                        .add(0.5, -1, 0.5);
                Vec3d mobPosition = animalEntity.getPos();
                Vec3d direction = mobPosition.subtract(througPos);
                // Yes, this is lossy, however; it runs so frequently that is losses are fine
                // This ends up getting expensive quickly if we use the non-lossy version
                Vec2f angles = MiscUtil.getMinecraftAnglesLossy(direction);

                Vec3d newPos = Vec3d.ZERO;
                // Fake player will always be at most maxDist blocks away from animal.
                // If animal is closer to target, then we will be on target itself.
                float maxDist = 5;
                if(direction.lengthSquared() > (maxDist * maxDist)){
                    newPos = mobPosition.add(direction.normalize().multiply(-maxDist));
                }else{
                    //place slightly behind trough
                    newPos = througPos.add(direction.normalize().multiply(-1));
                }

                fakePlayer.refreshPositionAndAngles(newPos.x, newPos.y, newPos.z, angles.y, angles.x);
                return;
            }
        }
    }
    public enum FeedResult{
        FED,SECS,NONE
    }
    public FeedResult tryFeedingAnimal(AnimalEntity animalEntity) {
        for(int i = 0; i < this.size(); i++) {
            ItemStack stack = this.getStack(i);
            if(animalEntity.isBreedingItem(stack)) {
                SoundEvent soundEvent = animalEntity.getEatSound(stack);
                if (soundEvent != null) { // Null check is kinda required, don't remove :) (why tho, intellij says its never null)
                    animalEntity.playSound(soundEvent, 0.5F + 0.5F * this.getWorld().random.nextInt(2), (this.getWorld().random.nextFloat() - this.getWorld().random.nextFloat()) * 0.2F + 1.0F);
                }

                this.addItemParticles(animalEntity, stack, 16);

                stack.decrement(1);
                this.markDirty();

                if(this.getSpecialRand().nextDouble() < FeedingTroughModule.loveChance) {
                    List<AnimalEntity> animalsAround = this.getWorld().getNonSpectatingEntities(AnimalEntity.class, new Box(this.getPos()).expand(FeedingTroughModule.range));
                    if(animalsAround.size() <= FeedingTroughModule.maxAnimals)
                        animalEntity.lovePlayer(null);
                    return FeedResult.SECS;
                }

                return FeedResult.FED;
            }
        }
        return FeedResult.NONE;
    }

    @Override
    public void markDirty() {
        super.markDirty();
        BlockState state = getCachedState();
        if(this.getWorld() != null && state.getBlock() instanceof FeedingTroughBlock) {
            boolean full = state.get(FeedingTroughBlock.FULL);
            boolean shouldBeFull = !isEmpty();

            if(full != shouldBeFull)
                this.getWorld().setBlockState(this.getPos(), state.with(FeedingTroughBlock.FULL, shouldBeFull), 2);
        }
    }

    private void addItemParticles(Entity entity, ItemStack stack, int count) {
        for(int i = 0; i < count; ++i) {
            Vec3d direction = new Vec3d((entity.getWorld().random.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
            direction = direction.rotateX(-entity.getPitch() * ((float) Math.PI / 180F));
            direction = direction.rotateY(-entity.getYaw() * ((float) Math.PI / 180F));
            double yVelocity = (-entity.getWorld().random.nextFloat()) * 0.6D - 0.3D;
            Vec3d position = new Vec3d((entity.getWorld().random.nextFloat() - 0.5D) * 0.3D, yVelocity, 0.6D);
            Vec3d entityPos = entity.getPos();
            position = position.rotateX(-entity.getPitch() * ((float) Math.PI / 180F));
            position = position.rotateY(-entity.getYaw() * ((float) Math.PI / 180F));
            position = position.add(entityPos.x, entityPos.y + entity.getEyeHeight(entity.getPose()), entityPos.z);
            if(this.getWorld() instanceof ServerWorld serverWorld)
                serverWorld.spawnParticles(new ItemStackParticleEffect(ParticleTypes.ITEM, stack), position.x, position.y, position.z, 1, direction.x, direction.y + 0.05D, direction.z, 0.0D);
            else if(this.getWorld() != null)
                this.getWorld().addParticle(new ItemStackParticleEffect(ParticleTypes.ITEM, stack), position.x, position.y, position.z, direction.x, direction.y + 0.05D, direction.z);
        }
    }

    private Random getSpecialRand() {
        Random specialRand = new Random(internalRNG);
        internalRNG = specialRand.nextLong();
        return specialRand;
    }
    @Override
    public int size() {
        return 9;
    }

    @Override
    public boolean isEmpty() {
        for(int i = 0; i < size(); i++) {
            ItemStack stack = this.getStack(i);
            if(!stack.isEmpty())
                return false;
        }

        return true;
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("quark.container.feeding_trough");
    }

    @Override
    protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.readNbt(nbt, registryLookup);

        this.internalRNG = nbt.getLong("rng");
        this.stacks = DefaultedList.ofSize(this.size(), ItemStack.EMPTY);
        if(!this.readLootTable(nbt)) Inventories.readNbt(nbt, this.stacks, registryLookup);
    }

    @Override
    protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.writeNbt(nbt, registryLookup);

        nbt.putLong("rng", this.internalRNG);
        if(!this.writeLootTable(nbt)) Inventories.writeNbt(nbt, this.stacks, registryLookup);
    }

    @Override
    protected DefaultedList<ItemStack> getHeldStacks() {
        return this.stacks;
    }

    @Override
    protected void setHeldStacks(DefaultedList<ItemStack> inventory) {
        this.stacks = inventory;
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new Generic3x3ContainerScreenHandler(syncId, playerInventory, this) {
            @Override
            public ScreenHandlerType<?> getType() {
                /**
                 *  Note form ProjectF>F
                 *  Original mod uses its own screen handler for the Feeding Trough, not sure why, probably ScreenHandlerType.GENERIC_3X3 wasn't a thing back then
                 */
                return ScreenHandlerType.GENERIC_3X3;
            }
        };
    }

}
