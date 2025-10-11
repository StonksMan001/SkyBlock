package net.me.quark_innermod.content.automation.block;

import net.me.quark_innermod.content.automation.entity.Gravisand;
import net.me.quark_innermod.internal_zeta.org.BlockUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LandingBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class GravisandBlock extends Block implements LandingBlock {

    public GravisandBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        checkRedstone(world, pos);
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        checkRedstone(world, pos);
    }

    private void checkRedstone(World world, BlockPos pos) {
        boolean powered = world.isReceivingRedstonePower(pos);

        if(powered)
            world.scheduleBlockTick(pos, this, 2);
    }

    @Override
    public boolean hasComparatorOutput(BlockState state) {
        return true;
    }

    @Override
    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        return 15;
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if(!world.isClient) {
            if(checkFallable(state, world, pos))
                for(Direction face : Direction.values()) {
                    BlockPos offPos = pos.offset(face);
                    BlockState offState = world.getBlockState(offPos);

                    if(offState.getBlock() == this)
                        world.scheduleBlockTick(offPos, this, 2);
                }
        }
    }

    private boolean checkFallable(BlockState state, World world, BlockPos pos) {
        if(!world.isClient) {
            if(tryFall(state, world, pos, Direction.DOWN))
                return true;
            else
                return tryFall(state, world, pos, Direction.UP);
        }

        return false;
    }

    private boolean tryFall(BlockState state, World world, BlockPos pos, Direction facing) {
        BlockPos target = pos.offset(facing);
        if((world.isAir(target) || BlockUtils.canFallThrough(world.getBlockState(target))) && world.isInBuildLimit(pos)) {
            if (facing == Direction.UP) {
                Entity entity = new Gravisand(world, pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D, facing.getOffsetY());
                world.setBlockState(pos, state.getFluidState().getBlockState(), 3);
                world.spawnEntity(entity);
            } else FallingBlockEntity.spawnFromBlock(world, pos, state);
            return true;
        }

        return false;
    }
}
