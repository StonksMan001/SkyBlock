package net.me.skyblock.blocks.skyblock.crops;

import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;

public class PuffballMushroomBlock extends Block {
    public static BooleanProperty NATURAL = BooleanProperty.of("natural");
    public static BooleanProperty DEAD = BooleanProperty.of("dead");
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(NATURAL, DEAD);
    }
    public PuffballMushroomBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(NATURAL, false).with(DEAD, false));
    }
    public int getOpacity(BlockState state, BlockView world, BlockPos pos) {
        return 1;
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        int infecting_quality = world.getGameRules().getInt(SkyBlockRegistries.GameRuleRegistries.SKYBLOCK__RARE_MUSHROOM_GROWTH_CHANCE);
        if (random.nextInt(infecting_quality * 3) == 0 && state.get(NATURAL) && !state.get(DEAD)) {
            world.setBlockState(pos, state.with(DEAD, true));
        }
    }
}
