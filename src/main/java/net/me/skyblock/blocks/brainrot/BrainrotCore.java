package net.me.skyblock.blocks.brainrot;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HeavyCoreBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class BrainrotCore extends HeavyCoreBlock implements BrainrotInfectionBlock {
    public static final EnumProperty<Type> TYPE = EnumProperty.of("type", Type.class);
    public BrainrotCore(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(BrainrotInfectionBlock.CAN_INFECT, true));
    }
    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        BrainrotInfectionBlock.super.appendProperties(builder);
        super.appendProperties(builder);
        builder.add(TYPE);
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
    public enum Type implements StringIdentifiable {
        DEFAULT("default"),
        SKIBIDI("skibidi"),
        OHIO("ohio"),
        FIDESZ("fidesz"),
        SUSSY("sussy");

        private Type(String name) {
            this.name = name;
        }
        private final String name;
        @Override
        public String asString() {
            return this.name;
        }
        @Override
        public String toString() {
            return this.name;
        }
    }
}
