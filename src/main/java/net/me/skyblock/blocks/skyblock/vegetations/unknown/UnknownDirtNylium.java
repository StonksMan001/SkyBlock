package net.me.skyblock.blocks.skyblock.vegetations.unknown;

import net.me.skyblock.blocks.skyblock.vegetations.UnknownInfectionFamily;
import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SnowBlock;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;

public class UnknownDirtNylium extends UnknownInfectionFamily {
    public UnknownDirtNylium(Settings settings, double growthChance) {
        super(settings, growthChance);
    }
    private static boolean canSurvive(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.up();
        BlockState blockState = world.getBlockState(blockPos);
        if (blockState.isOf(Blocks.SNOW) && (Integer)blockState.get(SnowBlock.LAYERS) == 1) {
            return true;
        } else if (blockState.getFluidState().getLevel() == 8) {
            return false;
        } else {
            int i = ChunkLightProvider.getRealisticOpacity(world, state, pos, blockState, blockPos, Direction.UP, blockState.getOpacity(world, blockPos));
            return i < world.getMaxLightLevel();
        }
    }
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canSurvive(state, world, pos)) {
            world.setBlockState(pos, SkyBlockRegistries.BlockRegistries.SKYBLOCK__UNKNOWN_DIRT.getDefaultState());
        }
        if (random.nextDouble() < growthChance/2 && world.getBlockState(pos.up()).isIn(BlockTags.REPLACEABLE)) {
            int random_int = (int)(Math.random() * 4);
            if (random_int == 1) {
                world.setBlockState(pos.up(), SkyBlockRegistries.BlockRegistries.SKYBLOCK__UNKNOWN_VEGETATION.getDefaultState());
            }
            if (random_int > 1) {
                world.setBlockState(pos.up(), SkyBlockRegistries.BlockRegistries.SKYBLOCK__UNKNOWN_SPROUTS.getDefaultState());
            }
        }
        super.randomTick(state, world, pos, random);
    }
}
