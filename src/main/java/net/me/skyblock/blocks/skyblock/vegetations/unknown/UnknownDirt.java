package net.me.skyblock.blocks.skyblock.vegetations.unknown;

import net.me.skyblock.blocks.skyblock.vegetations.UnknownInfectionFamily;
import net.me.skyblock.registries.SkyBlockRegistries;
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
                world.getBlockState(pos.north()).isOf(SkyBlockRegistries.BlockRegistries.SKYBLOCK__UNKNOWN_DIRT_NYLIUM) ||
                world.getBlockState(pos.south()).isOf(SkyBlockRegistries.BlockRegistries.SKYBLOCK__UNKNOWN_DIRT_NYLIUM) ||
                world.getBlockState(pos.east()).isOf(SkyBlockRegistries.BlockRegistries.SKYBLOCK__UNKNOWN_DIRT_NYLIUM) ||
                world.getBlockState(pos.west()).isOf(SkyBlockRegistries.BlockRegistries.SKYBLOCK__UNKNOWN_DIRT_NYLIUM) ||
                world.getBlockState(pos.down()).isOf(SkyBlockRegistries.BlockRegistries.SKYBLOCK__UNKNOWN_DIRT_NYLIUM)
        ) {
            world.setBlockState(pos, SkyBlockRegistries.BlockRegistries.SKYBLOCK__UNKNOWN_DIRT_NYLIUM.getDefaultState());
        }
        super.randomTick(state, world, pos, random);
    }
}
