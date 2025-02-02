package net.me.azalea_wood_innermod.registries;

import net.me.skycore_supermod.ModStairsBlock;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.*;

public class AzaleaWood_Blocks {
    public static final Block FLOGICAL__AZALEA_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("flogical__azalea_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_LOG)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block FLOGICAL__AZALEA_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("flogical__azalea_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_WOOD)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block FLOGICAL__STRIPPED_AZALEA_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("flogical__stripped_azalea_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block FLOGICAL__STRIPPED_AZALEA_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("flogical__stripped_azalea_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block FLOGICAL__AZALEA_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("flogical__azalea_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OAK_PLANKS)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block FLOGICAL__AZALEA_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("flogical__azalea_stairs",
            new ModStairsBlock(FLOGICAL__AZALEA_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.OAK_STAIRS)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block FLOGICAL__AZALEA_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("flogical__azalea_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_SLAB)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)));
}
