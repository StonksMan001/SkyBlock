package net.me.quark_innermod.content.automation.entity;

import net.me.quark_innermod.content.automation.module.GravisandModule;
import net.me.skycore_supermod.mixin.quark.FallingBlockEntityAccessor;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.item.AutomaticItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.server.network.EntityTrackerEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class Gravisand extends FallingBlockEntity {
    private static final TrackedData<Float> DIRECTION = DataTracker.registerData(Gravisand.class,
            TrackedDataHandlerRegistry.FLOAT);

    private static final String TAG_DIRECTION = "fallDirection";

    public Gravisand(EntityType<? extends Gravisand> type, World world) {
        super(type, world);
        ((FallingBlockEntityAccessor)Gravisand.this).setBlockState(GravisandModule.gravisandBlock.getDefaultState());
    }

    public Gravisand(World world, double x, double y, double z, float direction) {
        this((EntityType<? extends Gravisand>) GravisandModule.gravisandEntityType, world);
        ((FallingBlockEntityAccessor)Gravisand.this).setBlockState(GravisandModule.gravisandBlock.getDefaultState());
        this.intersectionChecked = true;
        this.setPos(x, y + (double)((1.0F - this.getHeight()) / 2.0F), z);
        this.setVelocity(Vec3d.ZERO);
        this.prevX = x;
        this.prevY = y;
        this.prevZ = z;
        this.setFallingBlockPos(new BlockPos(getBlockPos()));
        this.dataTracker.set(DIRECTION, direction);
    }

    @Override
    public void tick() {
        super.tick();

        // vanilla copy for falling upwards stuff
        BlockPos blockpos1 = this.getBlockPos();
        World world = this.getWorld();

        boolean aboveHasCollision = !world.getBlockState(blockpos1.up()).getCollisionShape(world, blockpos1.up()).isEmpty();

        if(!world.isClient && getFallDirection() > 0 && !isRemoved() && aboveHasCollision) {
            Block block = this.getBlockState().getBlock();
            BlockState blockstate = world.getBlockState(blockpos1);
            this.setVelocity(this.getVelocity().multiply(0.7D, 0.5D, 0.7D));

            boolean flag2 = blockstate.canReplace(new AutomaticItemPlacementContext(world, blockpos1, Direction.UP, ItemStack.EMPTY, Direction.DOWN));
            boolean flag3 = FallingBlock.canFallThrough(world.getBlockState(blockpos1.up()));
            boolean flag4 = this.getBlockState().canPlaceAt(world, blockpos1) && !flag3;

            if(flag2 && flag4) {
                if(world.setBlockState(blockpos1, this.getBlockState(), Block.NOTIFY_ALL)) {
                    ((ServerWorld) world).getChunkManager().sendToOtherNearbyPlayers(this, new BlockUpdateS2CPacket(blockpos1, world.getBlockState(blockpos1)));
                    this.discard();
                } else if(this.dropItem && world.getGameRules().getBoolean(GameRules.DO_ENTITY_DROPS)) {
                    this.discard();
                    this.onDestroyedOnLanding(block, blockpos1);
                    this.dropStack(new ItemStack(block));
                }
            } else {
                this.discard();
                if(this.dropItem && world.getGameRules().getBoolean(GameRules.DO_ENTITY_DROPS)) {
                    this.onDestroyedOnLanding(block, blockpos1);
                    this.dropStack(new ItemStack(block));
                }
            }
        }
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
        builder.add(DIRECTION, 0F);
    }

    @Override
    public void move(MovementType movementType, Vec3d movement) {
        if(movementType == MovementType.SELF)
            super.move(movementType, movement.multiply(getFallDirection() * -1));
        else
            super.move(movementType, movement);
    }

    @Override
    public boolean handleFallDamage(float fallDistance, float damageMultiplier, DamageSource damageSource) {
        return false;
    }

    private float getFallDirection() {
        return this.dataTracker.get(DIRECTION);
    }

    @Override
    protected void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);

        nbt.putFloat(TAG_DIRECTION, getFallDirection());
    }

    @Override
    protected void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);

        this.dataTracker.set(DIRECTION, nbt.getFloat(TAG_DIRECTION));
    }
    @NotNull
    @Override
    public Packet<ClientPlayPacketListener> createSpawnPacket(EntityTrackerEntry entityTrackerEntry) {
        return super.createSpawnPacket(entityTrackerEntry);
    }
}
