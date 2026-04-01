package net.me.skycore_supermod.deprecated.benimod.entities;

import net.me.skycore_supermod.deprecated.benimod.entities.ai.entity_goals.MessUpTurfGoal;
import net.me.skycore_supermod.deprecated.benimod.entities.ai.entity_goals.SpitAttackGoal;
import net.me.skycore_supermod.deprecated.benimod.BenimodRegistries;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.RangedAttackMob;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

@Deprecated
public class NativeVillagerEntity extends PassiveEntity implements RangedAttackMob {
    private boolean friendly = false;
    public boolean canSpit = true;
    public NativeVillagerEntity(EntityType<? extends PassiveEntity> entityType, World world) {
        super(entityType, world);
    }
    public static DefaultAttributeContainer.Builder setAttributes() {
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2.0f);
    }
    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new EscapeDangerGoal(this, 0.75F));
        this.goalSelector.add(1, new MeleeAttackGoal(this, 0.5f, false));
        this.goalSelector.add(1, new SpitAttackGoal(this, 0.5F, 40, 20.0F));
        this.goalSelector.add(4, new MessUpTurfGoal(this));
        this.goalSelector.add(4, new GoToWalkTargetGoal(this, 0.35));
        this.goalSelector.add(8, new WanderAroundFarGoal(this, 0.35));
        this.goalSelector.add(9, new StopAndLookAtEntityGoal(this, PlayerEntity.class, 3.0F, 1.0F));
        this.goalSelector.add(10, new LookAtEntityGoal(this, MobEntity.class, 8.0F));

        this.targetSelector.add(2, new RevengeGoal(this, this.getClass()).setGroupRevenge());
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, MobEntity.class, 5, false, false, (entity) -> entity instanceof Monster && !(entity instanceof CreeperEntity) && !(entity instanceof SilverfishEntity)));
        this.targetSelector.add(3, new ActiveTargetGoal<>(this, PlayerEntity.class, 10, true, true, this::shouldAngerAt));
        this.targetSelector.add(3, new ActiveTargetGoal<>(this, VillagerEntity.class, 10, true, true, this::shouldAngerAt));
    }
    @Override
    public Brain<?> getBrain() {
        return super.getBrain();
    }

    @Override
    protected void mobTick() {
        super.mobTick();
        if (this.getRandom().nextInt(150) == 0) {
            this.canSpit = true;
        }
    }
    private boolean shouldAngerAt(LivingEntity entity) {
        if (this.friendly || (entity instanceof PlayerEntity player/* && player.getInventory().getArmorStack(2).isOf(BenimodRegistries.Beni_Items.BENIMOD__NATIVE_VILLAGER_CLOTH)*/)) {
            return false;
        } else return true;
    }
    @Override
    public float getPathfindingFavor(BlockPos pos, WorldView world) {
        BlockState blockState = world.getBlockState(pos);
        if (blockState.isOf(Blocks.BOOKSHELF) || blockState.isOf(Blocks.CHISELED_BOOKSHELF)) {
            return -1.0F;
        } else {
            return world.getBlockState(pos.down()).isOf(Blocks.COARSE_DIRT) ? 3.0F : 0.0F;
        }
    }

    @Override
    public @Nullable PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }

    @Override
    public void shootAt(LivingEntity target, float pullProgress) {
        this.spitAt(target);
    }
    private void spitAt(LivingEntity target) {
        SpitEntity spitEntity = new SpitEntity(this.getWorld(), this);
        double d = target.getX() - this.getX();
        double e = target.getBodyY(0.3333333333333333) - spitEntity.getY();
        double f = target.getZ() - this.getZ();
        double g = Math.sqrt(d * d + f * f) * (double)0.2F;
        spitEntity.setVelocity(d, e + g, f, 1.5F, 10.0F);
        if (!this.isSilent()) {
            this.getWorld().playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.ENTITY_LLAMA_SPIT, this.getSoundCategory(), 1.0F, 1.0F + (this.random.nextFloat() - this.random.nextFloat()) * 0.2F);
        }

        this.getWorld().spawnEntity(spitEntity);
        this.canSpit = false;
    }
    @Override
    public boolean canImmediatelyDespawn(double distanceSquared) {
        return false;
    }
    //TODO
    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
    }
    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
    }
}
