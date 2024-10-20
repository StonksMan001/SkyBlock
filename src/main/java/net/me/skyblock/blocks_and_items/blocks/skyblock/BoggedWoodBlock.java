package net.me.skyblock.blocks_and_items.blocks.skyblock;

import net.me.skyblock.blocks_and_items.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

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
        if (world.getBlockState(pos.up()).isAir() && random.nextInt(7) == 0) {
            world.setBlockState(pos.up(), Blocks.MOSS_CARPET.getDefaultState());
        }
        if (world.getBlockState(pos.down()).isAir() && random.nextInt(7) == 0) {
            world.setBlockState(pos.down(), Blocks.CAVE_VINES.getDefaultState());
        }
        if (world.getBlockState(pos.up()).isOf(Blocks.WATER) && world.getBlockState(pos.up(2)).isAir() && random.nextInt(7) == 0) {
            world.setBlockState(pos.up(2), ModBlocks.SKYBLOCK__DUCKWEED.getDefaultState());
        }
    }
}
