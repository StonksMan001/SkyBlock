package net.me.skyblock__innermod.registries;

import net.me.bosc_innermod.blocks.SculkJawBlock;
import net.me.skyblock__innermod.blocks.*;
import net.me.skyblock__innermod.blocks.crops.BlueberryBush;
import net.me.skyblock__innermod.blocks.crops.ChilliPepperBlock;
import net.me.skyblock__innermod.blocks.crops.PuffballMushroom;
import net.me.skyblock__innermod.blocks.crops.PuffballMushroomBlock;
import net.me.skycore_supermod.ModStairsBlock;
import net.me.skycore_supermod.registries.SkyCore;
import net.me.skycore_supermod.BaseShortPlantBlock;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

public class SB_Blocks {
    //TODO:
    // -MapColors
    // -SKYBLOCK__OBSIDIAN_PILLAR
    // -BN__BLUE_OBSIDIAN_PILLAR


    public static final Block SKYBLOCK__ANT_JAM_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__ant_jam_block",
            new SlimeBlock(AbstractBlock.Settings
                    .copy(Blocks.HONEY_BLOCK)
                    .mapColor(MapColor.LIGHT_GRAY)));
    public static final Block SKYBLOCK__SWEET_BERRY_JAM_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__sweet_berry_jam_block",
            new SlimeBlock(AbstractBlock.Settings
                    .copy(Blocks.HONEY_BLOCK)
                    .mapColor(MapColor.DARK_RED)));
    public static final Block SKYBLOCK__SUSPICIOUS_COARSE_DIRT = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__suspicious_coarse_dirt",
            new SuspiciousCoarseDirt(AbstractBlock.Settings
                    .copy(Blocks.COARSE_DIRT)
                    .strength(0.5f)
                    .mapColor(MapColor.DIRT_BROWN)));


    //BUNCH O' SCULK
    //SKYBLOCK - SCULK
    public static final Block SKYBLOCK__RED_SCULK = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__red_sculk",
            new SculkBlock(AbstractBlock.Settings
                    .copy(Blocks.SCULK)
                    .mapColor(MapColor.BLACK)));
    public static final Block SKYBLOCK__RED_SCULK_JAW = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__red_sculk_jaw",
            new SculkJawBlock(AbstractBlock.Settings
                    .copy(Blocks.SCULK)
                    .strength(1f)
                    .mapColor(MapColor.BLACK), SB_Blocks.SKYBLOCK__RED_SCULK));
    public static final Block SKYBLOCK__SCULK_SPROUTS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__sculk_sprouts",
            new BaseShortPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)
                    .mapColor(MapColor.DIAMOND_BLUE), SB_BlockTags.SKYBLOCK__SCULK_GROUND));
    public static final Block SKYBLOCK__RED_SCULK_SPROUTS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__red_sculk_sprouts",
            new BaseShortPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)
                    .mapColor(MapColor.DARK_RED), SB_BlockTags.SKYBLOCK__RED_SCULK_GROUND));
    //SKYBLOCK - SCULK
    //SKYBLOCK - UNKNOWN VEGETATION
    public static final Block SKYBLOCK__UNKNOWN_DIRT_NYLIUM = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__unknown_dirt_nylium",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DIRT))); //TODO: MAPCOLOR
    public static final Block SKYBLOCK__UNKNOWN_DIRT = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__unknown_dirt",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DIRT))); //TODO: MAPCOLOR
    public static final Block SKYBLOCK__UNKNOWN_SPROUTS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__unknown_sprouts",
            new BaseShortPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS), SB_Blocks.SKYBLOCK__UNKNOWN_DIRT_NYLIUM)); //TODO: MAPCOLOR
    public static final Block SKYBLOCK__UNKNOWN_VEGETATION = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__unknown_vegetation",
            new BaseShortPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_ROOTS), SB_Blocks.SKYBLOCK__UNKNOWN_DIRT_NYLIUM)); //TODO: MAPCOLOR
    //SKYBLOCK - UNKNOWN VEGETATION
    //SKYBLOCK VANILLA+
    public static final Block SKYBLOCK__DUCKWEED = SkyCore.BuiltinRegistries.registerBlock("skyblock__duckweed",
            new WaterDecorPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.LILY_PAD)
                    .noCollision()
                    .noBlockBreakParticles()
                    .nonOpaque()
                    .mapColor(MapColor.DARK_GREEN)));
    public static final Block SKYBLOCK__SMALL_LILY_PADS = SkyCore.BuiltinRegistries.registerBlock("skyblock__small_lily_pads",
            new WaterDecorPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.LILY_PAD)
                    .noCollision()
                    .noBlockBreakParticles()
                    .nonOpaque()
                    .mapColor(MapColor.DARK_GREEN)));
    public static final Block SKYBLOCK__CLOVER = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__clover",
            new CloverBlock(AbstractBlock.Settings
                    .copy(Blocks.SHORT_GRASS)
                    .offset(AbstractBlock.OffsetType.NONE)
                    .noBlockBreakParticles()
                    .sounds(BlockSoundGroup.CAVE_VINES)
                    .mapColor(MapColor.DARK_GREEN)));
    // crops

    public static final Block SKYBLOCK__CHILLI_PEPPER_CROP = SkyCore.BuiltinRegistries.registerBlock("skyblock__chilli_pepper_crop",
            new ChilliPepperBlock(AbstractBlock.Settings
                    .copy(Blocks.CARROTS)
                    .sounds(BlockSoundGroup.CAVE_VINES)
                    .mapColor(MapColor.GREEN)));

    // crops

    public static final Block SKYBLOCK__DEEPSLATE_PLATINUM_ORE = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__deepslate_platinum_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DEEPSLATE_DIAMOND_ORE))); //TODO: MAPCOLOR
    public static final Block SKYBLOCK__DEEPSLATE_TITANIUM_ORE = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__deepslate_titanium_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DEEPSLATE_DIAMOND_ORE) //TODO: MAPCOLOR
                    .strength(Blocks.OBSIDIAN.getHardness(), Blocks.OBSIDIAN.getBlastResistance())));
    public static final Block SKYBLOCK__WHITE_MUSHROOM_STEM = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__white_mushroom_stem",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_STEM)
                    .strength(2.0f)
                    .mapColor(MapColor.WHITE_GRAY)));
    public static final Block SKYBLOCK__WHITE_MUSHROOM_HYPHAE = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__white_mushroom_hyphae",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_HYPHAE)
                    .strength(2.0f)
                    .mapColor(MapColor.WHITE_GRAY)));
    public static final Block SKYBLOCK__STRIPPED_MUSHROOM_STEM = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__stripped_mushroom_stem",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_CRIMSON_STEM)
                    .strength(2.0f)
                    .mapColor(MapColor.OAK_TAN)));
    public static final Block SKYBLOCK__STRIPPED_MUSHROOM_HYPHAE = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__stripped_mushroom_hyphae",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_CRIMSON_HYPHAE)
                    .strength(2.0f)
                    .mapColor(MapColor.OAK_TAN)));
    public static final Block SKYBLOCK__MUSHROOM_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__mushroom_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_PLANKS)
                    .strength(2.0f)
                    .mapColor(MapColor.OAK_TAN)));
    public static final Block SKYBLOCK__CARVED_MUSHROOM_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__carved_mushroom_planks",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_PLANKS)
                    .strength(2.0f)
                    .mapColor(MapColor.OAK_TAN)));
    public static final Block SKYBLOCK__VERTICAL_MUSHROOM_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__vertical_mushroom_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_PLANKS)
                    .strength(2.0f)
                    .mapColor(MapColor.OAK_TAN)));
    public static final Block SKYBLOCK__MUSHROOM_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__mushroom_stairs",
            new ModStairsBlock(SB_Blocks.SKYBLOCK__MUSHROOM_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_STAIRS)
                    .strength(2.0f)
                    .mapColor(MapColor.OAK_TAN)));
    public static final Block SKYBLOCK__MUSHROOM_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__mushroom_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_SLAB)
                    .strength(2.0f)
                    .mapColor(MapColor.OAK_TAN)));
    public static final Block SKYBLOCK__BOGGED_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__bogged_log",
            new BoggedWoodBlock(AbstractBlock.Settings
                    .copy(Blocks.MANGROVE_LOG)
                    .strength(2.0f)
                    .mapColor(MapColor.PALE_GREEN)));
    public static final Block SKYBLOCK__BOGGED_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__bogged_wood",
            new BoggedWoodBlock(AbstractBlock.Settings
                    .copy(Blocks.MANGROVE_WOOD)
                    .strength(2.0f)
                    .mapColor(MapColor.PALE_GREEN)));
    public static final Block SKYBLOCK__STRIPPED_BOGGED_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__stripped_bogged_log",
            new BoggedWoodBlock(AbstractBlock.Settings
                    .copy(Blocks.MANGROVE_LOG)
                    .strength(2.0f)
                    .mapColor(MapColor.PALE_GREEN)));
    public static final Block SKYBLOCK__STRIPPED_BOGGED_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__stripped_bogged_wood",
            new BoggedWoodBlock(AbstractBlock.Settings
                    .copy(Blocks.MANGROVE_WOOD)
                    .strength(2.0f)
                    .mapColor(MapColor.PALE_GREEN)));
    public static final Block SKYBLOCK__BOGGED_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__bogged_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.MANGROVE_PLANKS)
                    .strength(2.0f)
                    .mapColor(MapColor.PALE_GREEN)));
    public static final Block SKYBLOCK__CARVED_BOGGED_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__carved_bogged_planks",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.MANGROVE_PLANKS)
                    .strength(2.0f)
                    .mapColor(MapColor.PALE_GREEN)));
    public static final Block SKYBLOCK__VERTICAL_BOGGED_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__vertical_bogged_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.MANGROVE_PLANKS)
                    .strength(2.0f)
                    .mapColor(MapColor.PALE_GREEN)));
    public static final Block SKYBLOCK__BOGGED_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__bogged_stairs",
            new ModStairsBlock(SB_Blocks.SKYBLOCK__BOGGED_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.MANGROVE_STAIRS)
                    .strength(2.0f)
                    .mapColor(MapColor.PALE_GREEN)));
    public static final Block SKYBLOCK__BOGGED_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__bogged_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.MANGROVE_SLAB)
                    .strength(2.0f)
                    .mapColor(MapColor.PALE_GREEN)));
    public static final Block SKYBLOCK__FIR_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__fir_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_LOG)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block SKYBLOCK__FIR_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__fir_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_WOOD)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block SKYBLOCK__STRIPPED_FIR_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__stripped_fir_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_SPRUCE_LOG)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block SKYBLOCK__STRIPPED_FIR_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__stripped_fir_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_SPRUCE_WOOD)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block SKYBLOCK__FIR_LEAVES = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__fir_leaves",
            new LeavesBlock(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_LEAVES)
                    .mapColor(MapColor.DARK_GREEN)));
    public static final Block SKYBLOCK__FIR_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__fir_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_PLANKS)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block SKYBLOCK__CARVED_FIR_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__carved_fir_planks",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_PLANKS)
                    .mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block SKYBLOCK__VERTICAL_FIR_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__vertical_fir_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_PLANKS)
                    .mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block SKYBLOCK__FIR_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__fir_stairs",
            new ModStairsBlock(SB_Blocks.SKYBLOCK__FIR_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_STAIRS)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block SKYBLOCK__FIR_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__fir_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_SLAB)
                    .strength(2.0f)
                    .mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block SKYBLOCK__AUTUMN_FIR_LEAVES = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__autumn_fir_leaves",
            new LeavesBlock(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_LEAVES)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SKYBLOCK__AUTUMN_BIRCH_LEAVES = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__autumn_birch_leaves",
            new LeavesBlock(AbstractBlock.Settings
                    .copy(Blocks.BIRCH_LEAVES)
                    .mapColor(MapColor.YELLOW)));
    public static final Block SKYBLOCK__ANCIENT_PEDESTAL = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__ancient_pedestal",
            new AncientPedestalBlock(AbstractBlock.Settings
                    .copy(Blocks.BEDROCK)
                    .mapColor(MapColor.STONE_GRAY)));
    public static final Block SKYBLOCK__BLUE_BORDER_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__blue_border_block",
            new TransparentBlock(AbstractBlock.Settings
                    .copy(Blocks.BEDROCK)
                    .nonOpaque()
                    .allowsSpawning(SkyCore.BuiltinRegistries::neverPredicate)
                    .mapColor(MapColor.CLEAR)));
    public static final Block SKYBLOCK__RED_BORDER_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__red_border_block",
            new TransparentBlock(AbstractBlock.Settings
                    .copy(Blocks.BEDROCK)
                    .nonOpaque()
                    .allowsSpawning(SkyCore.BuiltinRegistries::neverPredicate)
                    .mapColor(MapColor.CLEAR)));
    public static final Block SKYBLOCK__GREEN_BORDER_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__green_border_block",
            new TransparentBlock(AbstractBlock.Settings
                    .copy(Blocks.BEDROCK)
                    .nonOpaque()
                    .allowsSpawning(SkyCore.BuiltinRegistries::neverPredicate)
                    .mapColor(MapColor.CLEAR)));
    public static final Block SKYBLOCK__BLUEBERRY_BUSH = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__blueberry_bush",
            new BlueberryBush(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_LEAVES)
                    .sounds(BlockSoundGroup.AZALEA_LEAVES)
                    .mapColor(MapColor.CYAN)));
    public static final Block SKYBLOCK__BLUEBERRY_SACK = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__blueberry_sack",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)
                    .mapColor(MapColor.LIGHT_BLUE)));
    public static final Block SKYBLOCK__CHILLI_PEPPER_CRATE = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__chilli_pepper_crate",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)
                    .mapColor(MapColor.RED)));
    public static final Block SKYBLOCK__GOLDEN_CHILLI_PEPPER_CRATE = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__golden_chilli_pepper_crate",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)
                    .mapColor(MapColor.YELLOW)));
    public static final Block SKYBLOCK__PUFFBALL_MUSHROOM = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__puffball_mushroom",
            new PuffballMushroom(AbstractBlock.Settings
                    .copy(Blocks.BROWN_MUSHROOM)
                    .sounds(BlockSoundGroup.FUNGUS)
                    .mapColor(MapColor.WHITE_GRAY)));
    public static final Block SKYBLOCK__PUFFBALL_MUSHROOM_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__puffball_mushroom_block",
            new PuffballMushroomBlock(AbstractBlock.Settings
                    .copy(Blocks.MUSHROOM_STEM)
                    .sounds(BlockSoundGroup.FUNGUS)
                    .mapColor(MapColor.WHITE_GRAY)));
    public static final Block SKYBLOCK__BLOCK_OF_EXPERIENCE = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__block_of_experience",
            new Block(AbstractBlock.Settings
                    .create()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .luminance(state -> 3)
                    .emissiveLighting(SkyCore.BuiltinRegistries::alwaysPredicate)
                    .mapColor(MapColor.EMERALD_GREEN)));
    public static final Block SKYBLOCK__CHERT = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__chert",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.DEEPSLATE)
                    .mapColor(MapColor.CYAN)));
    public static final Block SKYBLOCK__COBBLED_CHERT = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__cobbled_chert",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.COBBLED_DEEPSLATE)
                    .mapColor(MapColor.CYAN)));
    public static final Block SKYBLOCK__COBBLED_CHERT_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__cobbled_chert_stairs",
            new ModStairsBlock(SB_Blocks.SKYBLOCK__COBBLED_CHERT.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.COBBLED_DEEPSLATE_STAIRS)
                    .mapColor(MapColor.CYAN)));
    public static final Block SKYBLOCK__COBBLED_CHERT_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__cobbled_chert_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.COBBLED_DEEPSLATE_SLAB)
                    .mapColor(MapColor.CYAN)));
    public static final Block SKYBLOCK__CHERT_BRICKS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__chert_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.CYAN)));
    public static final Block SKYBLOCK__CHERT_BRICK_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__chert_brick_stairs",
            new ModStairsBlock(SB_Blocks.SKYBLOCK__CHERT_BRICKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.DEEPSLATE_BRICK_STAIRS)
                    .mapColor(MapColor.CYAN)));
    public static final Block SKYBLOCK__CHERT_BRICK_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__chert_brick_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.DEEPSLATE_BRICK_SLAB)
                    .mapColor(MapColor.CYAN)));
    public static final Block SKYBLOCK__CHISELED_CHERT = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__chiseled_chert",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.CHISELED_DEEPSLATE)
                    .mapColor(MapColor.CYAN)));
    public static final Block SKYBLOCK__POLISHED_CHERT = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__polished_chert",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_DEEPSLATE)
                    .mapColor(MapColor.CYAN)));
    public static final Block SKYBLOCK__POLISHED_CHERT_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__polished_chert_stairs",
            new ModStairsBlock(SB_Blocks.SKYBLOCK__POLISHED_CHERT.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.POLISHED_DEEPSLATE)
                    .mapColor(MapColor.CYAN)));
    public static final Block SKYBLOCK__POLISHED_CHERT_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__polished_chert_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_DEEPSLATE)
                    .mapColor(MapColor.CYAN)));
    public static final Block SKYBLOCK__CHERT_PILLAR = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__chert_pillar",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_DEEPSLATE)
                    .mapColor(MapColor.CYAN)));
    public static final Block SKYBLOCK__DRIED_TANGLY_COBBLESTONE = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__dried_tangly_cobblestone",
            new TanglyStoneBlock(AbstractBlock.Settings
                    .copy(Blocks.MOSSY_COBBLESTONE)
                    .mapColor(MapColor.STONE_GRAY), Items.DRIED_KELP, Blocks.COBBLESTONE));
    public static final Block SKYBLOCK__DRIED_TANGLY_COBBLESTONE_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__dried_tangly_cobblestone_stairs",
            new TanglyStoneStairsBlock(SB_Blocks.SKYBLOCK__DRIED_TANGLY_COBBLESTONE.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.MOSSY_COBBLESTONE_STAIRS)
                    .mapColor(MapColor.STONE_GRAY), Items.DRIED_KELP, Blocks.COBBLESTONE_STAIRS));
    public static final Block SKYBLOCK__DRIED_TANGLY_COBBLESTONE_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__dried_tangly_cobblestone_slab",
            new TanglyStoneSlabBlock(AbstractBlock.Settings
                    .copy(Blocks.MOSSY_COBBLESTONE_SLAB)
                    .mapColor(MapColor.STONE_GRAY), Items.DRIED_KELP, Blocks.COBBLESTONE_SLAB));
    public static final Block SKYBLOCK__DRIED_TANGLY_STONE_BRICKS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__dried_tangly_stone_bricks",
            new TanglyStoneBlock(AbstractBlock.Settings
                    .copy(Blocks.MOSSY_STONE_BRICKS)
                    .mapColor(MapColor.STONE_GRAY), Items.DRIED_KELP, Blocks.STONE_BRICKS));
    public static final Block SKYBLOCK__DRIED_TANGLY_STONE_BRICK_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__dried_tangly_stone_brick_stairs",
            new TanglyStoneStairsBlock(SB_Blocks.SKYBLOCK__DRIED_TANGLY_STONE_BRICKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.MOSSY_STONE_BRICK_STAIRS)
                    .mapColor(MapColor.STONE_GRAY), Items.DRIED_KELP, Blocks.STONE_BRICK_STAIRS));
    public static final Block SKYBLOCK__DRIED_TANGLY_STONE_BRICK_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__dried_tangly_stone_brick_slab",
            new TanglyStoneSlabBlock(AbstractBlock.Settings
                    .copy(Blocks.MOSSY_STONE_BRICK_SLAB)
                    .mapColor(MapColor.STONE_GRAY), Items.DRIED_KELP, Blocks.STONE_BRICK_SLAB));
    public static final Block SKYBLOCK__TANGLY_COBBLESTONE = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__tangly_cobblestone",
            new TanglyStoneBlock(AbstractBlock.Settings
                    .copy(Blocks.MOSSY_COBBLESTONE)
                    .mapColor(MapColor.STONE_GRAY), Items.KELP, Blocks.COBBLESTONE, SB_Blocks.SKYBLOCK__DRIED_TANGLY_COBBLESTONE));
    public static final Block SKYBLOCK__TANGLY_COBBLESTONE_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__tangly_cobblestone_stairs",
            new TanglyStoneStairsBlock(SB_Blocks.SKYBLOCK__TANGLY_COBBLESTONE.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.MOSSY_COBBLESTONE_STAIRS)
                    .mapColor(MapColor.STONE_GRAY), Items.KELP, Blocks.COBBLESTONE_STAIRS, SB_Blocks.SKYBLOCK__DRIED_TANGLY_COBBLESTONE_STAIRS));
    public static final Block SKYBLOCK__TANGLY_COBBLESTONE_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__tangly_cobblestone_slab",
            new TanglyStoneSlabBlock(AbstractBlock.Settings
                    .copy(Blocks.MOSSY_COBBLESTONE_SLAB)
                    .mapColor(MapColor.STONE_GRAY), Items.KELP, Blocks.COBBLESTONE_SLAB, SB_Blocks.SKYBLOCK__DRIED_TANGLY_COBBLESTONE_SLAB));
    public static final Block SKYBLOCK__TANGLY_STONE_BRICKS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__tangly_stone_bricks",
            new TanglyStoneBlock(AbstractBlock.Settings
                    .copy(Blocks.MOSSY_STONE_BRICKS)
                    .mapColor(MapColor.STONE_GRAY), Items.KELP, Blocks.STONE_BRICKS, SB_Blocks.SKYBLOCK__DRIED_TANGLY_STONE_BRICKS));
    public static final Block SKYBLOCK__TANGLY_STONE_BRICK_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__tangly_stone_brick_stairs",
            new TanglyStoneStairsBlock(SB_Blocks.SKYBLOCK__TANGLY_STONE_BRICKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.MOSSY_STONE_BRICK_STAIRS)
                    .mapColor(MapColor.STONE_GRAY), Items.KELP, Blocks.STONE_BRICK_STAIRS, SB_Blocks.SKYBLOCK__DRIED_TANGLY_STONE_BRICK_STAIRS));
    public static final Block SKYBLOCK__TANGLY_STONE_BRICK_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__tangly_stone_brick_slab",
            new TanglyStoneSlabBlock(AbstractBlock.Settings
                    .copy(Blocks.MOSSY_STONE_BRICK_SLAB)
                    .mapColor(MapColor.STONE_GRAY), Items.KELP, Blocks.STONE_BRICK_SLAB, SB_Blocks.SKYBLOCK__DRIED_TANGLY_STONE_BRICK_SLAB));
    //SPORE PLANTER BOXES
    public static final Block SKYBLOCK__SPORE_PLANTER_BOX = SkyCore.BuiltinRegistries.registerBlock("skyblock__spore_planter_box",
            new EmptySporePlanterBox(AbstractBlock.Settings
                    .copy(Blocks.COARSE_DIRT)
                    .sounds(BlockSoundGroup.WOOD)
                    .mapColor(MapColor.DIRT_BROWN)));
    public static final Block SKYBLOCK__PUFFBALL_SPORE_PLANTER_BOX = SkyCore.BuiltinRegistries.registerBlock("skyblock__puffball_spore_planter_box",
            new SporePlanterBox(AbstractBlock.Settings
                    .copy(Blocks.COARSE_DIRT)
                    .sounds(BlockSoundGroup.WOOD)
                    .mapColor(MapColor.WHITE_GRAY), SB_Blocks.SKYBLOCK__PUFFBALL_MUSHROOM, 2, false));
    public static final Block SKYBLOCK__RED_MUSHROOM_SPORE_PLANTER_BOX = SkyCore.BuiltinRegistries.registerBlock("skyblock__red_mushroom_spore_planter_box",
            new SporePlanterBox(AbstractBlock.Settings
                    .copy(Blocks.COARSE_DIRT)
                    .sounds(BlockSoundGroup.WOOD)
                    .mapColor(MapColor.RED), Blocks.RED_MUSHROOM, 0.5, true));
    public static final Block SKYBLOCK__BROWN_MUSHROOM_SPORE_PLANTER_BOX = SkyCore.BuiltinRegistries.registerBlock("skyblock__brown_mushroom_spore_planter_box",
            new SporePlanterBox(AbstractBlock.Settings
                    .copy(Blocks.COARSE_DIRT)
                    .sounds(BlockSoundGroup.WOOD)
                    .mapColor(MapColor.BROWN), Blocks.BROWN_MUSHROOM, 0.5, true));
    //SPORE PLANTER BOXES
    //---1.21.1+
    public static final Block SKYBLOCK__COMPRESSED_STEEL = SkyCore.BuiltinRegistries.registerBlock("skyblock__compressed_steel",
            new CompressedSteelBlock(AbstractBlock.Settings
                    .create()
                    .mapColor(MapColor.GRAY)
                    .sounds(BlockSoundGroup.HEAVY_CORE)
                    .pistonBehavior(PistonBehavior.BLOCK)
                    .strength(Blocks.OBSIDIAN.getHardness() * 2, Blocks.OBSIDIAN.getBlastResistance())
                    .mapColor(MapColor.IRON_GRAY)));
    public static final Block SKYBLOCK__CARVED_PALE_OAK_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__carved_pale_oak_planks",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_PLANKS)
                    .mapColor(MapColor.WHITE_GRAY)));
    //---1.21.4+
    //SKYBLOCK VANILLA+
    //SKYBLOCK TROPHIES
    public static final Block SKYBLOCK__PESTILENT_TROPHY = SkyCore.BuiltinRegistries.registerBlock("skyblock__pestilent_trophy",
            new TrophyBlock(AbstractBlock.Settings
                    .create()
                    .strength(Blocks.IRON_BLOCK.getHardness(), Blocks.IRON_BLOCK.getBlastResistance())
                    .noBlockBreakParticles()
                    .sounds(BlockSoundGroup.NETHERITE)
                    .mapColor(MapColor.PALE_GREEN)));
    //SKYBLOCK TROPHIES
    //SKYBLOCK - CARVED PLANKS
    public static final Block SKYBLOCK__CARVED_OAK_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__carved_oak_planks",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_PLANKS)
                    .mapColor(MapColor.OAK_TAN)));
    public static final Block SKYBLOCK__CARVED_SPRUCE_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__carved_spruce_planks",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_PLANKS)
                    .mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block SKYBLOCK__CARVED_DARK_OAK_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__carved_dark_oak_planks",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.DARK_OAK_PLANKS)
                    .mapColor(MapColor.BROWN)));

    //HALLOWEEN 2023
    //WINTER
    public static final Block SKYBLOCK__SNOWY_SHORT_GRASS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__snowy_short_grass",
            new SnowyShortGrassBlock(AbstractBlock.Settings
                    .copy(Blocks.SHORT_GRASS)
                    .mapColor(MapColor.DIAMOND_BLUE)));
    public static final Block SKYBLOCK__FROSTSLATE = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__frostslate",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OBSIDIAN)
                    .mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block SKYBLOCK__FROSTSLATE_PILLAR = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__frostslate_pillar",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.OBSIDIAN)
                    .mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block SKYBLOCK__FROSTSLATE_BRICKS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__frostslate_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OBSIDIAN)
                    .mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block SKYBLOCK__FROSTSLATE_BRICK_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__frostslate_brick_stairs",
            new ModStairsBlock(SB_Blocks.SKYBLOCK__FROSTSLATE_BRICKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.OBSIDIAN)
                    .mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block SKYBLOCK__FROSTSLATE_BRICK_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("skyblock__frostslate_brick_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.OBSIDIAN)
                    .mapColor(MapColor.TERRACOTTA_CYAN)));
    //WINTER
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering Blocks for \"SkyBlock\" innermod");
    }
}
