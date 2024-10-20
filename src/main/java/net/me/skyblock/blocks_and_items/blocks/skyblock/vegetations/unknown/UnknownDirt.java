package net.me.skyblock.blocks_and_items.blocks.skyblock.vegetations.unknown;

import net.me.skyblock.blocks_and_items.ModBlocks;
import net.me.skyblock.blocks_and_items.blocks.skyblock.vegetations.UnknownInfectionFamily;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class UnknownDirt extends UnknownInfectionFamily {
    public UnknownDirt(Settings settings, double growthChance) {
        super(settings, growthChance);
    }
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (
                world.getBlockState(pos.north()).isOf(ModBlocks.SKYBLOCK__UNKNOWN_DIRT_NYLIUM) ||
                world.getBlockState(pos.south()).isOf(ModBlocks.SKYBLOCK__UNKNOWN_DIRT_NYLIUM) ||
                world.getBlockState(pos.east()).isOf(ModBlocks.SKYBLOCK__UNKNOWN_DIRT_NYLIUM) ||
                world.getBlockState(pos.west()).isOf(ModBlocks.SKYBLOCK__UNKNOWN_DIRT_NYLIUM) ||
                world.getBlockState(pos.down()).isOf(ModBlocks.SKYBLOCK__UNKNOWN_DIRT_NYLIUM)
        ) {
            world.setBlockState(pos, ModBlocks.SKYBLOCK__UNKNOWN_DIRT_NYLIUM.getDefaultState());
        }
        super.randomTick(state, world, pos, random);
    }
}
