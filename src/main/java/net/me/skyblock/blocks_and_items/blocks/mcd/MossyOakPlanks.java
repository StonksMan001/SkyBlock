package net.me.skyblock.blocks_and_items.blocks.mcd;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;

public class MossyOakPlanks extends Block {

    public static final BooleanProperty MOSSIER = BooleanProperty.of("mossier");

    public MossyOakPlanks(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(MOSSIER);
    }
}