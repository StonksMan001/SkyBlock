package net.me.skyblock.blocks.brainrot;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.TransparentBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class GrimaceShakeBlock extends TransparentBlock implements BrainrotInfectionBlock {
    public GrimaceShakeBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(BrainrotInfectionBlock.CAN_INFECT, false));
    }
    protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        Vec3d vec3d = new Vec3d(0.50, 0.50, 0.50);
        entity.slowMovement(state, vec3d);
        if (world.random.nextInt(5) == 0) {
            entity.playSound(SoundEvents.BLOCK_HONEY_BLOCK_SLIDE, 1.0F, 1.0F);
        }
    }
    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        BrainrotInfectionBlock.super.appendProperties(builder);
        super.appendProperties(builder);
    }
    @Override
    public boolean hasRandomTicks(BlockState state) {
        return BrainrotInfectionBlock.super.hasRandomTicks(state);
    }

    @Override
    public BlockState infectionState(BlockState state) {
        return BrainrotInfectionBlock.super.infectionState(state);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BrainrotInfectionBlock.super.randomTick(state, world, pos, random);
        super.randomTick(state, world, pos, random);
    }
}
