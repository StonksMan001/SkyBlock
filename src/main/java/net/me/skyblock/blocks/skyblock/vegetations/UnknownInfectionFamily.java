package net.me.skyblock.blocks.skyblock.vegetations;

import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

import java.util.Map;

public class UnknownInfectionFamily extends Block {
    public final double growthChance;
    public UnknownInfectionFamily(Settings settings, double growthChance) {
        super(settings);
        this.growthChance = growthChance;
    }
    public Map<Block, Block> infectionTwins() {
        return Map.ofEntries(
                Map.entry(Blocks.GRASS_BLOCK, SkyBlockRegistries.BlockRegistries.SKYBLOCK__UNKNOWN_DIRT_NYLIUM),
                Map.entry(Blocks.DIRT, SkyBlockRegistries.BlockRegistries.SKYBLOCK__UNKNOWN_DIRT)
        );
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return true;
    }
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextDouble() < this.growthChance) {
            for (Map.Entry<Block, Block>  map: infectionTwins().entrySet()) {
                if (world.getBlockState(pos.north()).isOf(map.getKey())) {
                    world.setBlockState(pos.north(), map.getValue().getDefaultState());
                }
                if (world.getBlockState(pos.south()).isOf(map.getKey())) {
                    world.setBlockState(pos.south(), map.getValue().getDefaultState());
                }
                if (world.getBlockState(pos.east()).isOf(map.getKey())) {
                    world.setBlockState(pos.east(), map.getValue().getDefaultState());
                }
                if (world.getBlockState(pos.west()).isOf(map.getKey())) {
                    world.setBlockState(pos.west(), map.getValue().getDefaultState());
                }
                if (world.getBlockState(pos.up()).isOf(map.getKey())) {
                    world.setBlockState(pos.up(), map.getValue().getDefaultState());
                }
                if (world.getBlockState(pos.down()).isOf(map.getKey())) {
                    world.setBlockState(pos.down(), map.getValue().getDefaultState());
                }
            }
        }
    }
}
