package net.me.skyblock.blocks.brainrot;

import net.me.skyblock.registries.v1.SkyBlockRegistries;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ColoredFallingBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ColorCode;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class BrainrottenSandBlock extends ColoredFallingBlock implements BrainrotInfectionBlock {
    public BrainrottenSandBlock(ColorCode color, Settings settings) {
        super(color, settings);
        this.setDefaultState(this.getDefaultState().with(BrainrotInfectionBlock.CAN_INFECT, false));
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
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BrainrotInfectionBlock.super.randomTick(state, world, pos, random);
        super.randomTick(state, world, pos, random);
    }
}
