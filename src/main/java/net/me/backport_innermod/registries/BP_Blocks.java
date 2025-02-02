package net.me.backport_innermod.registries;

import net.me.skycore_supermod.ModStairsBlock;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.*;

public class BP_Blocks {
    //---1.21.1+
    //---1.21.4+
    public static final Block BP__PALE_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("bp__pale_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_LOG)
                    .mapColor(MapColor.DIRT_BROWN)));
    public static final Block BP__PALE_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("bp__pale_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_WOOD)
                    .mapColor(MapColor.DIRT_BROWN)));
    public static final Block BP__STRIPPED_PALE_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("bp__stripped_pale_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_OAK_LOG)
                    .mapColor(MapColor.WHITE_GRAY)));
    public static final Block BP__STRIPPED_PALE_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("bp__stripped_pale_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_OAK_WOOD)
                    .mapColor(MapColor.WHITE_GRAY)));
    public static final Block BP__PALE_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("bp__pale_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OAK_PLANKS)
                    .mapColor(MapColor.WHITE_GRAY)));
    public static final Block BP__PALE_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("bp__pale_stairs",
            new ModStairsBlock(BP__PALE_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.OAK_STAIRS)
                    .strength(2.0f)
                    .mapColor(MapColor.WHITE_GRAY)));
    public static final Block BP__PALE_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("bp__pale_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_SLAB)
                    .strength(2.0f)
                    .mapColor(MapColor.WHITE_GRAY)));
    public static final Block BP__PALE_LEAVES = SkyCore.BuiltinRegistries.registerBlockAndItem("bp__pale_leaves",
            new LeavesBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_LEAVES)
                    .mapColor(MapColor.WHITE_GRAY)));
    public static final Block BP__PALE_MOSS_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("bp__pale_moss_block",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.MOSS_BLOCK)
                    .mapColor(MapColor.LIGHT_GRAY)));
    public static final Block BP__PALE_MOSS_CARPET = SkyCore.BuiltinRegistries.registerBlockAndItem("bp__pale_moss_carpet",
            new CarpetBlock(AbstractBlock.Settings
                    .copy(Blocks.MOSS_CARPET)
                    .mapColor(MapColor.LIGHT_GRAY)));
}
