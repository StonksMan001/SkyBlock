package net.me.halloween_innermod.registries;

import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;

public class H_Blocks {
    //QUARK - VERTICAL PLANKS
    //QUARK
    //HALLOWEEN 2023
    public static final Block H__NODE = SkyCore.BuiltinRegistries.registerBlockAndItem("h__node",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OBSIDIAN)
                    .mapColor(MapColor.BLACK)));
}
