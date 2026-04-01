package net.me.skyblock__innermod.blocks;

import net.me.skyblock__innermod.registries.SB_Blocks;
import net.minecraft.block.*;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldView;

public class BoggedWoodBlock extends PillarBlock {
    public BoggedWoodBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return true;
    }
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.randomTick(state, world, pos, random);
        if (isWaterNearby(world, pos)) {
            if (world.getBlockState(pos.up()).isAir() && random.nextInt(7) == 0) {
                world.setBlockState(pos.up(), Blocks.MOSS_CARPET.getDefaultState());
            }
            if (world.getBlockState(pos.down()).isAir() && random.nextInt(7) == 0) {
                world.setBlockState(pos.down(), Blocks.CAVE_VINES.getDefaultState());
            }
            if (world.getBlockState(pos.up()).isOf(Blocks.WATER) && world.getBlockState(pos.up(2)).isAir() && random.nextInt(7) == 0) {
                world.setBlockState(pos.up(2), SB_Blocks.SKYBLOCK__DUCKWEED.getDefaultState());
            }
        }
    }
    private static boolean isWaterNearby(WorldView world, BlockPos pos) {
        for(BlockPos blockPos : BlockPos.iterate(pos.add(-4, 0, -4), pos.add(4, 1, 4))) {
            if (world.getFluidState(blockPos).isIn(FluidTags.WATER)) {
                return true;
            }
        }
        return false;
    }
}
