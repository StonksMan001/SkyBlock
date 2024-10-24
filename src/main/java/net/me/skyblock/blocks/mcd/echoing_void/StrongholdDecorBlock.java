package net.me.skyblock.blocks.mcd.echoing_void;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;

public class StrongholdDecorBlock extends Block {
    public static final IntProperty TYPE = IntProperty.of("type", 1, 7);
    public StrongholdDecorBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TYPE);
    }
}
