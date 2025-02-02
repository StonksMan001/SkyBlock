package net.me.pearfection_innermod.registries;

import net.me.skycore_supermod.ModStairsBlock;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.*;

public class Pearfection_Blocks {
    //CUSTOM WORLD BLOCKS
    //PEARFECTION
    public static final Block DIGPEAR__CALLERY_LEAVES = SkyCore.BuiltinRegistries.registerBlockAndItem("digpear__callery_leaves",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.AZALEA_LEAVES)
                    .mapColor(MapColor.PALE_GREEN)));
    public static final Block DIGPEAR__FLOWERING_CALLERY_LEAVES = SkyCore.BuiltinRegistries.registerBlockAndItem("digpear__flowering_callery_leaves",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.FLOWERING_AZALEA_LEAVES)
                    .mapColor(MapColor.PALE_GREEN)));
    public static final Block DIGPEAR__CALLERY_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("digpear__callery_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_LOG)
                    .strength(2.0f)
                    .mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block DIGPEAR__CALLERY_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("digpear__callery_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_WOOD)
                    .strength(2.0f)
                    .mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block DIGPEAR__STRIPPED_CALLERY_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("digpear__stripped_callery_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block DIGPEAR__STRIPPED_CALLERY_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("digpear__stripped_callery_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block DIGPEAR__CALLERY_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("digpear__callery_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OAK_PLANKS)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block DIGPEAR__CALLERY_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("digpear__callery_stairs",
            new ModStairsBlock(DIGPEAR__CALLERY_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.OAK_STAIRS)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block DIGPEAR__CALLERY_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("digpear__callery_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_SLAB)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_YELLOW)));
}
