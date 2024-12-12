package net.me.skyblock.blocks.brainrot;

import net.me.skyblock.registries.v1.SkyBlockRegistries;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class BrainrottenSoilBlock extends Block implements BrainrotInfectionBlock {
    public static final BooleanProperty CAN_GROW = BooleanProperty.of("can_grow");
    public BrainrottenSoilBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(BrainrotInfectionBlock.CAN_INFECT, false).with(CAN_GROW, false));
    }
    @Override
    public BlockState infectionState(BlockState state) {
        if (state.getProperties().contains(CAN_GROW)) {
            return BrainrotInfectionBlock.super.infectionState(state).with(CAN_GROW, true);
        } else return BrainrotInfectionBlock.super.infectionState(state);
    }
    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        BrainrotInfectionBlock.super.appendProperties(builder);
        super.appendProperties(builder);
        builder.add(CAN_GROW);
    }
    @Override
    public boolean hasRandomTicks(BlockState state) {
        return BrainrotInfectionBlock.super.hasRandomTicks(state);
    }
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BrainrotInfectionBlock.super.randomTick(state, world, pos, random);
        super.randomTick(state, world, pos, random);
        if (!world.isClient && random.nextInt(world.getGameRules().getInt(SkyBlockRegistries.GameRuleRegistries.BRAINROT__BRAINROT_SPREAD_CHANCE)) == 0 && state.get(CAN_GROW)) {
            world.setBlockState(pos, state.with(CAN_GROW, false));
            if (random.nextInt(3) == 0 && world.getBlockState(pos.up()).isAir()) world.setBlockState(pos.up(), SkyBlockRegistries.BlockRegistries.BRAINROT__BRAINROTTEN_SPROUTS.getDefaultState());
        }
    }
}
