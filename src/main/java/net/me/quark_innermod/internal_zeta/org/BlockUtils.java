package net.me.quark_innermod.internal_zeta.org;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

public class BlockUtils {
    public static boolean canFallThrough(BlockState state) {
        Block block = state.getBlock();
        return state.isAir() || block == Blocks.FIRE || state.isLiquid() || state.isReplaceable();
    }
}
