package net.me.quark_innermod.registries;

import net.me.quark_innermod.blocks.CaveRootsBlock;
import net.me.skycore_supermod.ModStairsBlock;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.sound.BlockSoundGroup;

public class Quark_Blocks {
    public static final Block QUARK__VERTICAL_PALE_OAK_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__vertical_pale_oak_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OAK_PLANKS)
                    .mapColor(MapColor.WHITE_GRAY)));
    //PEARFECTION
    //QUARK
    public static final Block QUARK__APPLE_CRATE = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__apple_crate",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)
                    .mapColor(MapColor.RED)));
    public static final Block QUARK__BEETROOT_CRATE = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__beetroot_crate",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block QUARK__CARROT_CRATE = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__carrot_crate",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block QUARK__POTATO_CRATE = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__potato_crate",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)
                    .mapColor(MapColor.OAK_TAN)));
    public static final Block QUARK__GOLDEN_APPLE_CRATE = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__golden_apple_crate",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)
                    .mapColor(MapColor.GOLD)));
    public static final Block QUARK__GOLDEN_CARROT_CRATE = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__golden_carrot_crate",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)
                    .mapColor(MapColor.GOLD)));
    public static final Block QUARK__SWEET_BERRY_SACK = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__sweet_berry_sack",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)
                    .mapColor(MapColor.DARK_RED)));
    public static final Block QUARK__GLOW_BERRY_SACK = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__glow_berry_sack",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)
                    .mapColor(MapColor.YELLOW)));
    public static final Block QUARK__COCOA_BEAN_SACK = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__cocoa_bean_sack",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)
                    .mapColor(MapColor.BROWN)));
    public static final Block QUARK__GUNPOWDER_SACK = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__gunpowder_sack",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)
                    .mapColor(MapColor.DEEPSLATE_GRAY)));
    public static final Block QUARK__NETHER_WART_SACK = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__nether_wart_sack",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)
                    .mapColor(MapColor.DARK_RED)));
    public static final Block QUARK__STICK_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__stick_block",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)
                    .strength(1.0f)
                    .mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block QUARK__SUGAR_CANE_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__sugar_cane_block",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)
                    .strength(1.0f)
                    .mapColor(MapColor.EMERALD_GREEN)));
    public static final Block QUARK__CACTUS_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__cactus_block",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOL)
                    .strength(1.0f)
                    .mapColor(MapColor.DARK_GREEN)));
    public static final Block QUARK__CHORUS_FRUIT_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__chorus_fruit_block",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)
                    .mapColor(MapColor.PURPLE)));
    public static final Block QUARK__ANDESITE_PILLAR = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__andesite_pillar",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_ANDESITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_ANDESITE.getHardness(), Blocks.POLISHED_ANDESITE.getBlastResistance())
                    .mapColor(MapColor.STONE_GRAY)));
    public static final Block QUARK__ANDESITE_BRICKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__andesite_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_ANDESITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_ANDESITE.getHardness(), Blocks.POLISHED_ANDESITE.getBlastResistance())
                    .mapColor(MapColor.STONE_GRAY)));
    public static final Block QUARK__ANDESITE_BRICK_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__andesite_brick_stairs",
            new ModStairsBlock(QUARK__ANDESITE_BRICKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.POLISHED_ANDESITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_ANDESITE.getHardness(), Blocks.POLISHED_ANDESITE.getBlastResistance())
                    .mapColor(MapColor.STONE_GRAY)));
    public static final Block QUARK__CHISELED_ANDESITE_BRICKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__chiseled_andesite_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_ANDESITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_ANDESITE.getHardness(), Blocks.POLISHED_ANDESITE.getBlastResistance())
                    .mapColor(MapColor.STONE_GRAY)));
    public static final Block QUARK__ANDESITE_BRICK_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__andesite_brick_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_ANDESITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_ANDESITE.getHardness(), Blocks.POLISHED_ANDESITE.getBlastResistance())
                    .mapColor(MapColor.STONE_GRAY)));
    public static final Block QUARK__DIORITE_PILLAR = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__diorite_pillar",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_DIORITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_DIORITE.getHardness(), Blocks.POLISHED_DIORITE.getBlastResistance())
                    .mapColor(MapColor.OFF_WHITE)));
    public static final Block QUARK__DIORITE_BRICKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__diorite_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_DIORITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_DIORITE.getHardness(), Blocks.POLISHED_DIORITE.getBlastResistance())
                    .mapColor(MapColor.OFF_WHITE)));
    public static final Block QUARK__DIORITE_BRICK_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__diorite_brick_stairs",
            new ModStairsBlock(QUARK__DIORITE_BRICKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.POLISHED_DIORITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_DIORITE.getHardness(), Blocks.POLISHED_DIORITE.getBlastResistance())
                    .mapColor(MapColor.OFF_WHITE)));
    public static final Block QUARK__CHISELED_DIORITE_BRICKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__chiseled_diorite_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_DIORITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_DIORITE.getHardness(), Blocks.POLISHED_DIORITE.getBlastResistance())
                    .mapColor(MapColor.OFF_WHITE)));
    public static final Block QUARK__DIORITE_BRICK_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__diorite_brick_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_DIORITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_DIORITE.getHardness(), Blocks.POLISHED_DIORITE.getBlastResistance())
                    .mapColor(MapColor.OFF_WHITE)));
    public static final Block QUARK__GRANITE_PILLAR = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__granite_pillar",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_GRANITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_GRANITE.getHardness(), Blocks.POLISHED_GRANITE.getBlastResistance())
                    .mapColor(MapColor.DIRT_BROWN)));
    public static final Block QUARK__GRANITE_BRICKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__granite_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_GRANITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_GRANITE.getHardness(), Blocks.POLISHED_GRANITE.getBlastResistance())
                    .mapColor(MapColor.DIRT_BROWN)));
    public static final Block QUARK__GRANITE_BRICK_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__granite_brick_stairs",
            new ModStairsBlock(QUARK__GRANITE_BRICKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.POLISHED_GRANITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_GRANITE.getHardness(), Blocks.POLISHED_GRANITE.getBlastResistance())
                    .mapColor(MapColor.DIRT_BROWN)));
    public static final Block QUARK__CHISELED_GRANITE_BRICKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__chiseled_granite_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_GRANITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_GRANITE.getHardness(), Blocks.POLISHED_GRANITE.getBlastResistance())
                    .mapColor(MapColor.DIRT_BROWN)));
    public static final Block QUARK__GRANITE_BRICK_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__granite_brick_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_GRANITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_GRANITE.getHardness(), Blocks.POLISHED_GRANITE.getBlastResistance())
                    .mapColor(MapColor.DIRT_BROWN)));
    public static final Block QUARK__DRIPSTONE_PILLAR = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__dripstone_pillar",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                    .mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block QUARK__DRIPSTONE_BRICKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__dripstone_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                    .mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block QUARK__CHISELED_DRIPSTONE_BRICKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__chiseled_dripstone_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                    .mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block QUARK__POLISHED_DRIPSTONE = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__polished_dripstone",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                    .mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block QUARK__DRIPSTONE_BRICK_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__dripstone_brick_stairs",
            new ModStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                    .mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block QUARK__DRIPSTONE_BRICK_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__dripstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                    .mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block QUARK__POLISHED_DRIPSTONE_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__polished_dripstone_stairs",
            new ModStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                    .mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block QUARK__POLISHED_DRIPSTONE_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__polished_dripstone_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                    .mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block QUARK__DRIPSTONE_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__dripstone_stairs",
            new ModStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                    .mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block QUARK__DRIPSTONE_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__dripstone_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())
                    .mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block QUARK__CALCITE_PILLAR = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__calcite_pillar",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(1.5f, 6.0f)
                    .mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block QUARK__CALCITE_BRICKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__calcite_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(1.5f, 6.0f)
                    .mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block QUARK__CHISELED_CALCITE_BRICKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__chiseled_calcite_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(1.5f, 6.0f)
                    .mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block QUARK__POLISHED_CALCITE = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__polished_calcite",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(1.5f, 6.0f)
                    .mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block QUARK__CALCITE_BRICK_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__calcite_brick_stairs",
            new ModStairsBlock(Blocks.CALCITE.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(Blocks.CALCITE.getHardness(), Blocks.CALCITE.getBlastResistance())
                    .mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block QUARK__CALCITE_BRICK_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__calcite_brick_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(Blocks.CALCITE.getHardness(), Blocks.CALCITE.getBlastResistance())
                    .mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block QUARK__POLISHED_CALCITE_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__polished_calcite_stairs",
            new ModStairsBlock(Blocks.CALCITE.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(Blocks.CALCITE.getHardness(), Blocks.CALCITE.getBlastResistance())
                    .mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block QUARK__POLISHED_CALCITE_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__polished_calcite_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(Blocks.CALCITE.getHardness(), Blocks.CALCITE.getBlastResistance())
                    .mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block QUARK__CALCITE_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__calcite_stairs",
            new ModStairsBlock(Blocks.CALCITE.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(Blocks.CALCITE.getHardness(), Blocks.CALCITE.getBlastResistance())
                    .mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block QUARK__CALCITE_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__calcite_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(Blocks.CALCITE.getHardness(), Blocks.CALCITE.getBlastResistance())
                    .mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block QUARK__CAVE_ROOTS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__cave_roots",
            new CaveRootsBlock(AbstractBlock.Settings
                    .copy(Blocks.VINE)
                    .replaceable()
                    .sounds(BlockSoundGroup.MANGROVE_ROOTS)
                    .noCollision()
                    .ticksRandomly()
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.VINE)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .mapColor(MapColor.OAK_TAN)));
    //QUARK - VERTICAL PLANKS
    public static final Block QUARK__VERTICAL_OAK_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__vertical_oak_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OAK_PLANKS)
                    .mapColor(MapColor.OAK_TAN)));
    public static final Block QUARK__VERTICAL_SPRUCE_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__vertical_spruce_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_PLANKS)
                    .mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block QUARK__VERTICAL_BIRCH_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__vertical_birch_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.BIRCH_PLANKS)
                    .mapColor(MapColor.PALE_YELLOW)));
    public static final Block QUARK__VERTICAL_JUNGLE_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__vertical_jungle_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.JUNGLE_PLANKS)
                    .mapColor(MapColor.DIRT_BROWN)));
    public static final Block QUARK__VERTICAL_ACACIA_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__vertical_acacia_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.ACACIA_PLANKS)
                    .mapColor(MapColor.ORANGE)));
    public static final Block QUARK__VERTICAL_DARK_OAK_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__vertical_dark_oak_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DARK_OAK_PLANKS)
                    .mapColor(MapColor.BROWN)));
    public static final Block QUARK__VERTICAL_MANGROVE_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__vertical_mangrove_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.MANGROVE_PLANKS)
                    .mapColor(MapColor.RED)));
    public static final Block QUARK__VERTICAL_CHERRY_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__vertical_cherry_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.CHERRY_PLANKS)
                    .mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block QUARK__VERTICAL_BAMBOO_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__vertical_bamboo_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.BAMBOO_PLANKS)
                    .mapColor(MapColor.YELLOW)));
    public static final Block QUARK__VERTICAL_CRIMSON_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__vertical_crimson_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_PLANKS)
                    .mapColor(MapColor.DULL_PINK)));
    public static final Block QUARK__VERTICAL_WARPED_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__vertical_warped_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)
                    .mapColor(MapColor.DARK_AQUA)));
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering Blocks for \"Quark\" innermod");
    }
}
