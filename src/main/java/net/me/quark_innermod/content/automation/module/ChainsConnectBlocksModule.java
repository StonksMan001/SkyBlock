package net.me.quark_innermod.content.automation.module;

import net.me.quark_innermod.internal_zeta.org.ZetaModule;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class ChainsConnectBlocksModule extends ZetaModule {

    Item chain = Items.CHAIN; /**Note from ProjectF>F: unused for some reason*/
    public static boolean isEnabled = false;

    @Override
    public void register() {
        isEnabled = true;
    }
    @Override
    public void registerClient() {
    }

    /**Note from ProjectF>F: might add custom tag check for chain-like linking blocks (from other mods) here in the future*/
    public static boolean isStateChainBlock(BlockState state) {
        return state.isOf(Blocks.CHAIN);
    }
}
