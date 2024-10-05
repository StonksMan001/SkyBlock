package net.me.skyblock.blocks_and_items;

import net.me.skyblock.SkyBlock;
import net.me.skyblock.api.skycore.BaseShortPlantBlock;
import net.me.skyblock.api.skycore.BaseTallPlantBlock;
import net.me.skyblock.blocks_and_items.blocks.abyss.AbyssVegetation;
import net.me.skyblock.blocks_and_items.blocks.abyss.BlueVigilantGrass;
import net.me.skyblock.blocks_and_items.blocks.bosc.SculkJawBlock;
import net.me.skyblock.blocks_and_items.blocks.end.BluisheLightStemBlock;
import net.me.skyblock.blocks_and_items.blocks.end.EndFlower;
import net.me.skyblock.blocks_and_items.blocks.end.EndVegetation;
import net.me.skyblock.blocks_and_items.blocks.end.EnderBlock;
import net.me.skyblock.blocks_and_items.blocks.mcd.MossyOakPlanks;
import net.me.skyblock.blocks_and_items.blocks.mcd.PopFlowerBlock;
import net.me.skyblock.blocks_and_items.blocks.mcd.echoing_void.StrongholdDecorBlock;
import net.me.skyblock.blocks_and_items.blocks.mcd.echoing_void.VoidBlock;
import net.me.skyblock.blocks_and_items.blocks.skyblock.*;
import net.me.skyblock.blocks_and_items.blocks.skyblock.crops.BlueberryBush;
import net.me.skyblock.blocks_and_items.blocks.skyblock.crops.ChilliPepperBlock;
import net.me.skyblock.blocks_and_items.blocks.skyblock.crops.PuffballMushroom;
import net.me.skyblock.blocks_and_items.blocks.skyblock.crops.PuffballMushroomBlock;
import net.me.skyblock.blocks_and_items.blocks.skyblock.vegetations.unknown.UnknownDirt;
import net.me.skyblock.blocks_and_items.blocks.skyblock.vegetations.unknown.UnknownDirtNylium;
import net.me.skyblock.blocks_and_items.blocks.util.ModStairsBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.sound.BlockSoundGroup;

public class ModBlocks {

    //ABYSS
    public static final Block ABYSS__UNSTABLE_OBSIDIAN = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__unstable_obsidian",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OBSIDIAN)
                    .strength(50.0f, 1200.0f)
                    .requiresTool()
                    .luminance(state -> 10)));
    public static final Block ABYSS__ABYSS_DIRT = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_dirt",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DIRT)
                    .sounds(BlockSoundGroup.MUD)
                    .strength(0.5f)));
    public static final Block ABYSS__ROMA_MUD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__roma_mud",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.MUD)
                    .sounds(BlockSoundGroup.MUD)
                    .strength(0.5f)));
    public static final Block ABYSS__ROMA_MUD_CURSED = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__roma_mud_2",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.MUD)
                    .sounds(BlockSoundGroup.MUD)
                    .strength(0.5f)));
    public static final Block ABYSS__ABYSS_GRAVEL = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_gravel",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DIRT)
                    .sounds(BlockSoundGroup.GRAVEL)
                    .strength(0.6f)));
    public static final Block ABYSS__INFECTED_PEAT = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__infected_peat",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DIRT)
                    .sounds(BlockSoundGroup.MUD)
                    .strength(0.5f)));
    public static final Block ABYSS__STONE_RACKLE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stone_rackle",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.STONE)
                    .strength(1.5f, 6.0f)
                    .requiresTool()));
    public static final Block ABYSS__BLARU_MOSS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blaru_moss",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DIRT)
                    .sounds(BlockSoundGroup.ROOTED_DIRT)
                    .strength(0.5f)));
    public static final Block ABYSS__GLOWING_BLARU_MOSS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__glowing_blaru_moss",
            new CarpetBlock(AbstractBlock.Settings
                    .copy(Blocks.MOSS_CARPET)
                    .sounds(BlockSoundGroup.MOSS_CARPET)
                    .luminance(state -> 6)));
    public static final Block ABYSS__BLARU_GRASS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blaru_grass",
            new AbyssVegetation(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.NETHER_SPROUTS)));
    public static final Block ABYSS__ABYSS_SPORES = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_spores",
            new AbyssVegetation(AbstractBlock.Settings
                    .copy(Blocks.WARPED_ROOTS)
                    .sounds(BlockSoundGroup.ROOTS)));
    public static final Block ABYSS__TESLA_FLOWER = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__tesla_flower",
            new AbyssVegetation(AbstractBlock.Settings
                    .copy(Blocks.WARPED_ROOTS)
                    .sounds(BlockSoundGroup.ROOTS)));
    public static final Block ABYSS__VIGILANT_VERSA = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_versa",
            new AbyssVegetation(AbstractBlock.Settings
                    .copy(Blocks.WARPED_ROOTS)
                    .sounds(BlockSoundGroup.ROOTS)
                    .luminance(state -> 7)));
    public static final Block ABYSS__EXOLIUS_MAXIMUS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__exolius_maximus",
            new AbyssVegetation(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.ROOTS)
                    .luminance(state -> 3)));
    public static final Block ABYSS__YOUNG_EXOLIUS_MAXIMUS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__young_exolius_maximus",
            new AbyssVegetation(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.ROOTS)
                    .luminance(state -> 3)));
    public static final Block ABYSS__VIGILANT_GRASS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_grass",
            new AbyssVegetation(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.NETHER_SPROUTS)));
    public static final Block ABYSS__BLUE_VIGILANT_GRASS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blue_vigilant_grass",
            new BlueVigilantGrass(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.ROOTS)
                    .luminance(state -> state.get(BlueVigilantGrass.LIT) ? 10 : 6)));
    public static final Block ABYSS__VIGILANT_MOSS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_moss",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DIRT)
                    .sounds(BlockSoundGroup.ROOTED_DIRT)
                    .strength(0.5f)));
    public static final Block ABYSS__INFUSED_MAGMA = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__infused_magma",
            new MagmaBlock(AbstractBlock.Settings
                    .copy(Blocks.MAGMA_BLOCK)
                    .strength(0.5f)
                    .luminance(state -> 3)
                    .requiresTool()
                    .emissiveLighting(SkyBlock.BuiltinRegistries::alwaysPredicate)));
    public static final Block ABYSS__ABYSS_STONE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_stone",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.STONE)
                    .strength(1.5f, 6.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_STONE_OG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_stone_og",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.STONE)
                    .strength(1.5f, 6.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_DIAMOND_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_diamond_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DIAMOND_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_EMERALD_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_emerald_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.EMERALD_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_GOLD_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_gold_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.GOLD_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_IRON_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_iron_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_IGNISITHE_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_ignisithe_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_ABERYTHE_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_aberythe_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_ABORANYS_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_aboranys_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_FUSION_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_fusion_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_GARNITE_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_garnite_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_GLACERYTHE_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_glacerythe_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_INCORYTHE_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_incorythe_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_LORAN_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_loran_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__PURPLE_SHROOMLIGHT = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__purple_shroomlight",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.SHROOMLIGHT)
                    .strength(1.0f)));
    public static final Block ABYSS__DARK_BLUE_SHROOMLIGHT = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__dark_blue_shroomlight",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.SHROOMLIGHT)
                    .strength(1.0f)));
    public static final Block ABYSS__BLUE_SHROOMLIGHT = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blue_shroomlight",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.SHROOMLIGHT)
                    .strength(1.0f)));


    public static final Block ABYSS__ABYSS_JUNGLE_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_jungle_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__ABYSS_JUNGLE_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_jungle_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_ABYSS_JUNGLE_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_abyss_jungle_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_ABYSS_JUNGLE_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_abyss_jungle_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__ABYSS_JUNGLE_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_jungle_leaves",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OAK_LEAVES)));
    public static final Block ABYSS__ABYSS_JUNGLE_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_jungle_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f)));
    public static final Block ABYSS__ABYSS_JUNGLE_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_jungle_stairs",
            new ModStairsBlock(ModBlocks.ABYSS__ABYSS_JUNGLE_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block ABYSS__ABYSS_JUNGLE_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_jungle_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));


    public static final Block ABYSS__BLARU_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blaru_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM).strength(2.0f)));
    public static final Block ABYSS__BLARU_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blaru_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE).strength(2.0f)));
    public static final Block ABYSS__STRIPPED_BLARU_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_blaru_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_BLARU_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_blaru_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__BLARU_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blaru_leaves",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OAK_LEAVES)));
    public static final Block ABYSS__BLARU_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blaru_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS).strength(2.0f)));
    public static final Block ABYSS__BLARU_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blaru_stairs",
            new ModStairsBlock(ModBlocks.ABYSS__BLARU_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block ABYSS__BLARU_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__blaru_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));


    public static final Block ABYSS__FROZEN_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__frozen_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__FROZEN_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__frozen_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_FROZEN_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_frozen_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_FROZEN_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_frozen_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__FROZEN_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__frozen_leaves",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OAK_LEAVES)));
    public static final Block ABYSS__FROZEN_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__frozen_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f)));
    public static final Block ABYSS__VERTICAL_FROZEN_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vertical_frozen_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f)));
    public static final Block ABYSS__CARVED_FROZEN_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__carved_frozen_planks",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)));
    public static final Block ABYSS__FROZEN_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__frozen_stairs",
            new ModStairsBlock(ModBlocks.ABYSS__FROZEN_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block ABYSS__FROZEN_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__frozen_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));


    public static final Block ABYSS__SLIMED_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__slimed_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__SLIMED_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__slimed_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_SLIMED_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_slimed_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_SLIMED_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_slimed_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__ABYSS_SLIME_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abyss_slime_block",
            new SlimeBlock(AbstractBlock.Settings
                    .copy(Blocks.SLIME_BLOCK)
                    .strength(0.01f)));
    public static final Block ABYSS__SLIMED_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__slimed_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f)));
    public static final Block ABYSS__SLIMED_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__slimed_stairs",
            new ModStairsBlock(ModBlocks.ABYSS__SLIMED_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block ABYSS__SLIMED_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__slimed_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));


    public static final Block ABYSS__VIGILANT_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__VIGILANT_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_VIGILANT_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_vigilant_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_VIGILANT_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_vigilant_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__VIGILANT_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_leaves",
            new LeavesBlock(AbstractBlock.Settings
                    .copy(Blocks.BUBBLE_CORAL_BLOCK)
                    .strength(1.0f)));
    public static final Block ABYSS__VIGILANT_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f)));
    public static final Block ABYSS__VIGILANT_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_stairs",
            new ModStairsBlock(ModBlocks.ABYSS__VIGILANT_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block ABYSS__VIGILANT_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));


    public static final Block ABYSS__ABYSCULK_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abysculk_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__ABYSCULK_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abysculk_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_ABYSCULK_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_abysculk_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_ABYSCULK_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_abysculk_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__ABYSCULK_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abysculk_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f)));
    public static final Block ABYSS__ABYSCULK_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abysculk_stairs",
            new ModStairsBlock(ModBlocks.ABYSS__ABYSCULK_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block ABYSS__ABYSCULK_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__abysculk_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));


    public static final Block ABYSS__BOG_SHROOM_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__bog_shroom_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__BOG_SHROOM_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__bog_shroom_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_BOG_SHROOM_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_bog_shroom_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_BOG_SHROOM_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_bog_shroom_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__BOG_SHROOM_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__bog_shroom_leaves",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.BRAIN_CORAL_BLOCK)
                    .luminance(state -> 10)));
    public static final Block ABYSS__BOG_SHROOM_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__bog_shroom_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f)));
    public static final Block ABYSS__BOG_SHROOM_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__bog_shroom_stairs",
            new ModStairsBlock(ModBlocks.ABYSS__BOG_SHROOM_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block ABYSS__BOG_SHROOM_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__bog_shroom_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));


    public static final Block ABYSS__SAL_SHROOM_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__sal_shroom_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__SAL_SHROOM_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__sal_shroom_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_SAL_SHROOM_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_sal_shroom_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_SAL_SHROOM_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__stripped_sal_shroom_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__SAL_SHROOM_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__sal_shroom_leaves",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.BUBBLE_CORAL_BLOCK)
                    .luminance(state -> 10)));
    public static final Block ABYSS__SAL_SHROOM_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__sal_shroom_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f)));
    public static final Block ABYSS__SAL_SHROOM_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__sal_shroom_stairs",
            new ModStairsBlock(ModBlocks.ABYSS__SAL_SHROOM_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block ABYSS__SAL_SHROOM_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("abyss__sal_shroom_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));
    //ABYSS
    //SKYBLOCK MAIN-BLOCK
    public static final Block MCD__VOID_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__void_block",
            new VoidBlock(AbstractBlock.Settings
                    .copy(Blocks.SCULK)
                    .strength(3.0f)
                    .requiresTool()));
    public static final Block SP5__ENDMERALD_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_emerald_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE)
                    .strength(4.0f)
                    .requiresTool()));
    public static final Block SP5__ENDMERALD_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_emerald_block",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.EMERALD_BLOCK)
                    .strength(4.0f)
                    .requiresTool()));
    public static final Block SP5__ENDERITE_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__enderite_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE)
                    .strength(4.0f)
                    .requiresTool()));
    public static final Block SP5__ENDERITE_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__enderite_block",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.EMERALD_BLOCK)
                    .strength(4.0f)
                    .requiresTool()));
    public static final Block SP5__ASTEROID_RESIDUES = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__asteroid_residues",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE)
                    .strength(4.0f)
                    .requiresTool()));
    public static final Block SP5__SOLID_ROCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__solid_rock",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE)
                    .strength(4.0f)
                    .requiresTool()));
    public static final Block MCD__OG_PURPUR_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__og_purpur_block",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.PURPUR_BLOCK)
                    .mapColor(MapColor.MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));
    public static final Block SP5__END_GRASS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_grass",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE)
                    .sounds(BlockSoundGroup.GRASS)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 7.5F)));
    public static final Block SP5__BLUISHE_GRASS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_end_stone",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 9.0F)));
    public static final Block SP5__END_GRASS_VEGETATION = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__ender_grass",
            new EndVegetation(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.GRASS)));
    public static final Block SP5__END_MUSHROOM = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_fungus",
            new EndVegetation(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_FUNGUS)
                    .sounds(BlockSoundGroup.FUNGUS)));
    public static final Block SP5__BLUISHE_BUSH = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_bush",
            new EndVegetation(AbstractBlock.Settings
                    .copy(Blocks.WARPED_FUNGUS)
                    .sounds(BlockSoundGroup.GRASS)));
    public static final Block SP5__BLUISHE_MUSHROOM = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_fungus",
            new EndVegetation(AbstractBlock.Settings
                    .copy(Blocks.WARPED_FUNGUS)
                    .sounds(BlockSoundGroup.FUNGUS)));
    public static final Block SP5__END_BUSH = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_bush",
            new EndVegetation(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.GRASS)));
    public static final Block SP5__END_FLOWER = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_flower",
            new EndFlower(AbstractBlock.Settings
                    .copy(Blocks.DANDELION)
                    .sounds(BlockSoundGroup.SPORE_BLOSSOM)));
    public static final Block SP5__WARPED_NAVI_PLANT = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__warped_navi_plant",
            new BaseTallPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.TALL_GRASS)
                    .offset(AbstractBlock.OffsetType.NONE), ModBlocks.SP5__END_GRASS));
    public static final Block SKYBLOCK__ANT_JAM_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__ant_jam_block",
            new SlimeBlock(AbstractBlock.Settings
                    .copy(Blocks.HONEY_BLOCK)));
    public static final Block SKYBLOCK__SWEET_BERRY_JAM_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__sweet_berry_jam_block",
            new SlimeBlock(AbstractBlock.Settings
                    .copy(Blocks.HONEY_BLOCK)));
    public static final Block SKYBLOCK__SUSPICIOUS_COARSE_DIRT = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__suspicious_coarse_dirt",
            new SuspiciousCoarseDirt(AbstractBlock.Settings
                    .copy(Blocks.COARSE_DIRT)
                    .strength(0.5f)));
    public static final Block SP5__TRANSPARENT_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__transparent_block",
            new TransparentBlock(AbstractBlock.Settings
                    .copy(Blocks.BLACK_STAINED_GLASS)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(0.5f)));
    public static final Block SP5__END_WART_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_wart_block",
            new TransparentBlock(AbstractBlock.Settings
                    .copy(Blocks.BLACK_STAINED_GLASS)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)));
    public static final Block SP5__BLUE_WART = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__blue_wart",
            new TransparentBlock(AbstractBlock.Settings
                    .copy(Blocks.BLACK_STAINED_GLASS)
                    .sounds(BlockSoundGroup.MOSS_BLOCK)
                    .strength(0.5f)));
    public static final Block SP5__CRACKED_END_STONE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__cracked_end_stone_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__WARPED_END_STONE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__warped_end_stone_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__END_STONE_PILLAR = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_stone_pillar",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__END_STONE_TILES = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_stone_tiles",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__SMALL_END_STONE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__small_end_stone_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__SMOOTH_END_STONE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__smooth_end_stone",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__CHISELED_END_STONE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__chiseled_end_stone",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__CHISELED_END_STONE_CUBIC = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__chiseled_end_stone_cubic",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__CHISELED_END_STONE_MAZE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__chiseled_end_stone_maze",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__PURPLE_END_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__purple_end_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__PURPLE_END_BRICK_PILLAR = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__purple_end_brick_pillar",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(1.5f, 6.0f)));
    public static final Block SP5__WARPED_PURPLE_END_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__warped_purple_end_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__PURPLE_END_BRICK_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__purple_end_brick_stairs",
            new StairsBlock(ModBlocks.SP5__PURPLE_END_BRICKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICK_STAIRS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__PURPLE_END_BRICK_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__purple_end_brick_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICK_SLAB)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__END_PURPLE_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_purple_block",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.PURPUR_BLOCK)
                    .strength(1.5f, 6.0f)));
    public static final Block SP5__END_PURPLE_PILLAR = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_purple_pillar",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(1.5f, 6.0f)));
    public static final Block SP5__ENDER_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__ender_block",
            new EnderBlock(AbstractBlock.Settings
                    .copy(Blocks.PURPUR_BLOCK)
                    .strength(1.5f, 6.0f)));
    public static final Block SP5__END_PURPLE_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_purple_stairs",
            new StairsBlock(ModBlocks.SP5__END_PURPLE_BLOCK.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.PURPUR_STAIRS)
                    .strength(1.5f, 6.0f)));
    public static final Block SP5__END_PURPLE_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_purple_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.PURPUR_SLAB)
                    .strength(1.5f, 6.0f)));
    public static final Block SP5__END_STEM = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_stem",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_STEM)
                    .strength(2.0f)));
    public static final Block SP5__END_HYPHAE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_hyphae",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_HYPHAE)
                    .strength(2.0f)));
    public static final Block SP5__STRIPPED_END_STEM = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__stripped_end_stem",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_CRIMSON_STEM)
                    .strength(2.0f)));
    public static final Block SP5__STRIPPED_END_HYPHAE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__stripped_end_hyphae",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_CRIMSON_HYPHAE)
                    .strength(2.0f)));
    public static final Block SP5__ENDLIGHT = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__endlight",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.SHROOMLIGHT)
                    .strength(1.0f)));
    public static final Block SP5__END_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_PLANKS)
                    .strength(2.0f)));
    public static final Block SP5__END_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_stairs",
            new ModStairsBlock(ModBlocks.SP5__END_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block SP5__END_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__end_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));


    public static final Block SP5__BLUISHE_STEM = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_stem",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block SP5__BLUISHE_HYPHAE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_hyphae",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block SP5__BLUISHE_LIGHT_STEM = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_light_stem",
            new BluisheLightStemBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block SP5__BLUISHE_LIGHT_HYPHAE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_light_hyphae",
            new BluisheLightStemBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block SP5__STRIPPED_BLUISHE_STEM = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__stripped_bluishe_stem",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)));
    public static final Block SP5__STRIPPED_BLUISHE_HYPHAE = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__stripped_bluishe_hyphae",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block SP5__BLUISHE_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f)));
    public static final Block SP5__BLUISHE_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_stairs",
            new ModStairsBlock(ModBlocks.SP5__BLUISHE_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block SP5__BLUISHE_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("sp5__bluishe_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));
    public static final Block FLOGICAL__AZALEA_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("flogical__azalea_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_LOG)
                    .strength(2.0f)));
    public static final Block FLOGICAL__AZALEA_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("flogical__azalea_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_WOOD)
                    .strength(2.0f)));
    public static final Block FLOGICAL__STRIPPED_AZALEA_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("flogical__stripped_azalea_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(2.0f)));
    public static final Block FLOGICAL__STRIPPED_AZALEA_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("flogical__stripped_azalea_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(2.0f)));
    public static final Block FLOGICAL__AZALEA_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("flogical__azalea_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OAK_PLANKS)
                    .strength(2.0f)));
    public static final Block FLOGICAL__AZALEA_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("flogical__azalea_stairs",
            new ModStairsBlock(ModBlocks.FLOGICAL__AZALEA_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.OAK_STAIRS)
                    .strength(2.0f)));
    public static final Block FLOGICAL__AZALEA_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("flogical__azalea_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_SLAB)
                    .strength(2.0f)));
    //BUNCH O' SCULK
    public static final Block BOSC__SCULK_JAW = SkyBlock.BuiltinRegistries.registerBlockAndItem("bosc__sculk_jaw",
            new SculkJawBlock(AbstractBlock.Settings
                    .copy(Blocks.SCULK)
                    .strength(1f), Blocks.SCULK));
    public static final Block BOSC__DEAD_SCULK = SkyBlock.BuiltinRegistries.registerBlockAndItem("bosc__dead_sculk",
            new SculkBlock(AbstractBlock.Settings
                    .copy(Blocks.SCULK)
                    .sounds(BlockSoundGroup.CORAL)));
    public static final Block BOSC__DEAD_SCULK_JAW = SkyBlock.BuiltinRegistries.registerBlockAndItem("bosc__dead_sculk_jaw",
            new SculkBlock(AbstractBlock.Settings
                    .copy(Blocks.SCULK)
                    .sounds(BlockSoundGroup.CORAL)));
    public static final Block BOSC__DEAD_SCULK_SPROUTS = SkyBlock.BuiltinRegistries.registerBlockAndItem("bosc__dead_sculk_sprouts",
            new BaseShortPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS), ModTags.Blocks.BOSC__DEAD_SCULK_GROUND));
    //BUNCH O' SCULK
    //SKYBLOCK - SCULK
    public static final Block SKYBLOCK__RED_SCULK = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__red_sculk",
            new SculkBlock(AbstractBlock.Settings
                    .copy(Blocks.SCULK)));
    public static final Block SKYBLOCK__RED_SCULK_JAW = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__red_sculk_jaw",
            new SculkJawBlock(AbstractBlock.Settings
                    .copy(Blocks.SCULK)
                    .strength(1f), ModBlocks.SKYBLOCK__RED_SCULK));
    public static final Block SKYBLOCK__SCULK_SPROUTS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__sculk_sprouts",
            new BaseShortPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS), ModTags.Blocks.SKYBLOCK__SCULK_GROUND));
    public static final Block SKYBLOCK__RED_SCULK_SPROUTS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__red_sculk_sprouts",
            new BaseShortPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS), ModTags.Blocks.SKYBLOCK__RED_SCULK_GROUND));
    //SKYBLOCK - SCULK
    //SKYBLOCK - UNKNOWN VEGETATION
    public static final Block SKYBLOCK__UNKNOWN_DIRT_NYLIUM = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__unknown_dirt_nylium",
            new UnknownDirtNylium(AbstractBlock.Settings
                    .copy(Blocks.DIRT),1));
    public static final Block SKYBLOCK__UNKNOWN_DIRT = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__unknown_dirt",
            new UnknownDirt(AbstractBlock.Settings
                    .copy(Blocks.DIRT),1));
    public static final Block SKYBLOCK__UNKNOWN_SPROUTS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__unknown_sprouts",
            new BaseShortPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS), ModBlocks.SKYBLOCK__UNKNOWN_DIRT_NYLIUM));
    public static final Block SKYBLOCK__UNKNOWN_VEGETATION = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__unknown_vegetation",
            new BaseShortPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_ROOTS), ModBlocks.SKYBLOCK__UNKNOWN_DIRT_NYLIUM));
    //SKYBLOCK - UNKNOWN VEGETATION
    //SKYBLOCK VANILLA+
    public static final Block SKYBLOCK__DUCKWEED = SkyBlock.BuiltinRegistries.registerBlock("skyblock__duckweed",
            new WaterDecorPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.LILY_PAD)
                    .noCollision()
                    .noBlockBreakParticles()
                    .nonOpaque()));
    public static final Block SKYBLOCK__SMALL_LILY_PADS = SkyBlock.BuiltinRegistries.registerBlock("skyblock__small_lily_pads",
            new WaterDecorPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.LILY_PAD)
                    .noCollision()
                    .noBlockBreakParticles()
                    .nonOpaque()));
    public static final Block SKYBLOCK__CLOVER = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__clover",
            new CloverBlock(AbstractBlock.Settings
                    .copy(Blocks.SHORT_GRASS)
                    .offset(AbstractBlock.OffsetType.NONE)
                    .noBlockBreakParticles()
                    .sounds(BlockSoundGroup.CAVE_VINES)));
    // crops

    public static final Block SKYBLOCK__CHILLI_PEPPER_CROP = SkyBlock.BuiltinRegistries.registerBlock("skyblock__chilli_pepper_crop",
            new ChilliPepperBlock(AbstractBlock.Settings
                    .copy(Blocks.CARROTS)
                    .sounds(BlockSoundGroup.CAVE_VINES)));

    // crops

    public static final Block SKYBLOCK__DEEPSLATE_PLATINUM_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__deepslate_platinum_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final Block SKYBLOCK__DEEPSLATE_TITANIUM_ORE = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__deepslate_titanium_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DEEPSLATE_DIAMOND_ORE)
                    .strength(Blocks.OBSIDIAN.getHardness(), Blocks.OBSIDIAN.getBlastResistance())));
    public static final Block SKYBLOCK__WHITE_MUSHROOM_STEM = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__white_mushroom_stem",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_STEM)
                    .strength(2.0f)));
    public static final Block SKYBLOCK__WHITE_MUSHROOM_HYPHAE = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__white_mushroom_hyphae",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_HYPHAE)
                    .strength(2.0f)));
    public static final Block SKYBLOCK__STRIPPED_MUSHROOM_STEM = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__stripped_mushroom_stem",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_CRIMSON_STEM)
                    .strength(2.0f)));
    public static final Block SKYBLOCK__STRIPPED_MUSHROOM_HYPHAE = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__stripped_mushroom_hyphae",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_CRIMSON_HYPHAE)
                    .strength(2.0f)));
    public static final Block SKYBLOCK__MUSHROOM_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__mushroom_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_PLANKS)
                    .strength(2.0f)));
    public static final Block SKYBLOCK__CARVED_MUSHROOM_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__carved_mushroom_planks",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_PLANKS)));
    public static final Block SKYBLOCK__VERTICAL_MUSHROOM_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__vertical_mushroom_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_PLANKS)));
    public static final Block SKYBLOCK__MUSHROOM_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__mushroom_stairs",
            new ModStairsBlock(ModBlocks.SKYBLOCK__MUSHROOM_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_STAIRS)
                    .strength(2.0f)));
    public static final Block SKYBLOCK__MUSHROOM_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__mushroom_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_SLAB)
                    .strength(2.0f)));
    public static final Block SKYBLOCK__BOGGED_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__bogged_log",
            new BoggedWoodBlock(AbstractBlock.Settings
                    .copy(Blocks.MANGROVE_LOG)
                    .strength(2.0f)));
    public static final Block SKYBLOCK__BOGGED_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__bogged_wood",
            new BoggedWoodBlock(AbstractBlock.Settings
                    .copy(Blocks.MANGROVE_WOOD)
                    .strength(2.0f)));
    public static final Block SKYBLOCK__BOGGED_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__bogged_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.MANGROVE_PLANKS)
                    .strength(2.0f)));
    public static final Block SKYBLOCK__BOGGED_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__bogged_stairs",
            new ModStairsBlock(ModBlocks.SKYBLOCK__BOGGED_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.MANGROVE_STAIRS)
                    .strength(2.0f)));
    public static final Block SKYBLOCK__BOGGED_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__bogged_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.MANGROVE_SLAB)
                    .strength(2.0f)));
    public static final Block SKYBLOCK__FIR_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__fir_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_LOG)
                    .strength(2.0f)));
    public static final Block SKYBLOCK__FIR_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__fir_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_WOOD)
                    .strength(2.0f)));
    public static final Block SKYBLOCK__STRIPPED_FIR_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__stripped_fir_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_SPRUCE_LOG)
                    .strength(2.0f)));
    public static final Block SKYBLOCK__STRIPPED_FIR_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__stripped_fir_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_SPRUCE_WOOD)
                    .strength(2.0f)));
    public static final  Block SKYBLOCK__FIR_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__fir_leaves",
            new LeavesBlock(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_LEAVES)));
    public static final Block SKYBLOCK__FIR_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__fir_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_PLANKS)
                    .strength(2.0f)));
    public static final Block SKYBLOCK__CARVED_FIR_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__carved_fir_planks",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_PLANKS)));
    public static final Block SKYBLOCK__VERTICAL_FIR_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__vertical_fir_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_PLANKS)));
    public static final Block SKYBLOCK__FIR_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__fir_stairs",
            new ModStairsBlock(ModBlocks.SKYBLOCK__FIR_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_STAIRS)
                    .strength(2.0f)));
    public static final Block SKYBLOCK__FIR_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__fir_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_SLAB)
                    .strength(2.0f)));
    public static final  Block SKYBLOCK__AUTUMN_FIR_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__autumn_fir_leaves",
            new LeavesBlock(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_LEAVES)));
    public static final  Block SKYBLOCK__AUTUMN_BIRCH_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__autumn_birch_leaves",
            new LeavesBlock(AbstractBlock.Settings
                    .copy(Blocks.BIRCH_LEAVES)));
    public static final Block SKYBLOCK__ANCIENT_PEDESTAL = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__ancient_pedestal",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.BEDROCK)));
    public static final Block SKYBLOCK__BLUEBERRY_BUSH = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__blueberry_bush",
            new BlueberryBush(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_LEAVES)
                    .sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block SKYBLOCK__BLUEBERRY_SACK = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__blueberry_sack",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)));
    public static final Block SKYBLOCK__CHILLI_PEPPER_CRATE = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__chilli_pepper_crate",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block SKYBLOCK__GOLDEN_CHILLI_PEPPER_CRATE = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__golden_chilli_pepper_crate",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block SKYBLOCK__PUFFBALL_MUSHROOM = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__puffball_mushroom",
            new PuffballMushroom(AbstractBlock.Settings
                    .copy(Blocks.BROWN_MUSHROOM)
                    .sounds(BlockSoundGroup.FUNGUS)));
    public static final Block SKYBLOCK__PUFFBALL_MUSHROOM_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__puffball_mushroom_block",
            new PuffballMushroomBlock(AbstractBlock.Settings
                    .copy(Blocks.MUSHROOM_STEM)
                    .sounds(BlockSoundGroup.FUNGUS)));
    public static final Block SKYBLOCK__SPORE_PLANTER_BOX = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__spore_planter_box",
            new EmptySporePlanterBox(AbstractBlock.Settings
                    .copy(Blocks.COARSE_DIRT)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block SKYBLOCK__PUFFBALL_SPORE_PLANTER_BOX = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__puffball_spore_planter_box",
            new SporePlanterBox(AbstractBlock.Settings
                    .copy(Blocks.COARSE_DIRT)
                    .sounds(BlockSoundGroup.WOOD), ModBlocks.SKYBLOCK__PUFFBALL_MUSHROOM, 2, false));
    public static final Block SKYBLOCK__RED_MUSHROOM_SPORE_PLANTER_BOX = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__red_mushroom_spore_planter_box",
            new SporePlanterBox(AbstractBlock.Settings
                    .copy(Blocks.COARSE_DIRT)
                    .sounds(BlockSoundGroup.WOOD), Blocks.RED_MUSHROOM, 0.5, true));
    //1.21.1+
    public static final Block SKYBLOCK__COMPRESSED_STEEL = SkyBlock.BuiltinRegistries.registerBlock("skyblock__compressed_steel",
            new CompressedSteelBlock(AbstractBlock.Settings
                    .create()
                    .mapColor(MapColor.BLACK)
                    .sounds(BlockSoundGroup.HEAVY_CORE)
                    .pistonBehavior(PistonBehavior.BLOCK)
                    .strength(Blocks.OBSIDIAN.getHardness(), Blocks.OBSIDIAN.getBlastResistance())));
    //1.21.1+
    //1.22.0+
    public static final Block BP__PALE_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__pale_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_LOG)));
    public static final Block BP__PALE_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__pale_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_WOOD)));
    public static final Block BP__STRIPPED_PALE_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__stripped_pale_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block BP__STRIPPED_PALE_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__stripped_pale_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block BP__PALE_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__pale_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OAK_PLANKS)));
    public static final Block SKYBLOCK__CARVED_PALE_OAK_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__carved_pale_oak_planks",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_PLANKS)));
    public static final Block QUARK__VERTICAL_PALE_OAK_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_pale_oak_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OAK_PLANKS)));
    public static final Block BP__PALE_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__pale_stairs",
            new ModStairsBlock(ModBlocks.BP__PALE_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.OAK_STAIRS)
                    .strength(2.0f)));
    public static final Block BP__PALE_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__pale_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_SLAB)
                    .strength(2.0f)));
    public static final Block BP__PALE_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__pale_leaves",
            new LeavesBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_LEAVES)));
    public static final Block BP__PALE_MOSS_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__pale_moss_block",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.MOSS_BLOCK)));
    public static final Block BP__PALE_MOSS_CARPET = SkyBlock.BuiltinRegistries.registerBlockAndItem("bp__pale_moss_carpet",
            new CarpetBlock(AbstractBlock.Settings
                    .copy(Blocks.MOSS_CARPET)));
    //1.22.0+
    //SKYBLOCK VANILLA+
    //SKYBLOCK TROPHIES
    public static final Block SKYBLOCK__PESTILENT_TROPHY = SkyBlock.BuiltinRegistries.registerBlock("skyblock__pestilent_trophy",
            new TrophyBlock(AbstractBlock.Settings
                    .copy(Blocks.NETHERITE_BLOCK)
                    .strength(Blocks.IRON_BLOCK.getHardness(), Blocks.IRON_BLOCK.getBlastResistance())
                    .noBlockBreakParticles()));
    //SKYBLOCK TROPHIES
    //SKYBLOCK - CARVED PLANKS
    public static final Block SKYBLOCK__CARVED_OAK_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__carved_oak_planks",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_PLANKS)));
    public static final Block SKYBLOCK__CARVED_SPRUCE_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__carved_spruce_planks",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_PLANKS)));
    public static final Block SKYBLOCK__CARVED_DARK_OAK_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__carved_dark_oak_planks",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.DARK_OAK_PLANKS)));
    //SKYBLOCK - CARVED PLANKS
    //SKYBLOCK MAIN-BLOCK
    //MCD
    public static final Block MCD__MOSSIER_COBBLESTONE = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__mossier_cobblestone",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.COBBLESTONE)
                    .strength(2.0F, 6.0F)));
    public static final Block MCD__MOSSIER_OAK_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__mossier_oak_planks",
            new MossyOakPlanks(AbstractBlock.Settings
                    .copy(Blocks.OAK_PLANKS)
                    .strength(2.0f, 3.0f)));
    public static final Block MCD__MOSSIER_SPRUCE_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__mossier_spruce_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_PLANKS)
                    .strength(2.0f, 3.0f)));
    public static final Block MCD__BARREN_GRASS_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__barren_grass_block",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.END_STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 9.0F)));
    public static final Block MCD__MIDNIGHT_MOSS_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__midnight_moss_block",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.MOSS_BLOCK)));
    public static final Block MCD__MIDNIGHT_MOSS_CARPET = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__midnight_moss_carpet",
            new CarpetBlock(AbstractBlock.Settings
                    .copy(Blocks.MOSS_CARPET)));
    public static final Block MCD__MIDNIGHT_SPROUTS = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__midnight_sprouts",
            new ShortPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)));
    public static final Block MCD__POP_FLOWER = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__pop_flower",
            new PopFlowerBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_ROOTS)));
    //MCD
    //CUSTOM WORLD BLOCKS
    public static final Block MCD__STRONGHOLD_DECOR = SkyBlock.BuiltinRegistries.registerBlockAndItem("mcd__stronghold_decor",
            new StrongholdDecorBlock(AbstractBlock.Settings
                    .copy(Blocks.BEDROCK)));
    //CUSTOM WORLD BLOCKS
    //PEARFECTION
    public static final Block DIGPEAR__CALLERY_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("digpear__callery_leaves",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.AZALEA_LEAVES)));
    public static final Block DIGPEAR__FLOWERING_CALLERY_LEAVES = SkyBlock.BuiltinRegistries.registerBlockAndItem("digpear__flowering_callery_leaves",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.FLOWERING_AZALEA_LEAVES)));
    public static final Block DIGPEAR__CALLERY_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("digpear__callery_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_LOG)
                    .strength(2.0f)));
    public static final Block DIGPEAR__CALLERY_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("digpear__callery_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_WOOD)
                    .strength(2.0f)));
    public static final Block DIGPEAR__STRIPPED_CALLERY_LOG = SkyBlock.BuiltinRegistries.registerBlockAndItem("digpear__stripped_callery_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(2.0f)));
    public static final Block DIGPEAR__STRIPPED_CALLERY_WOOD = SkyBlock.BuiltinRegistries.registerBlockAndItem("digpear__stripped_callery_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(2.0f)));
    public static final Block DIGPEAR__CALLERY_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("digpear__callery_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OAK_PLANKS)
                    .strength(2.0f)));
    public static final Block DIGPEAR__CALLERY_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("digpear__callery_stairs",
            new ModStairsBlock(ModBlocks.DIGPEAR__CALLERY_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.OAK_STAIRS)
                    .strength(2.0f)));
    public static final Block DIGPEAR__CALLERY_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("digpear__callery_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.OAK_SLAB)
                    .strength(2.0f)));
    //PEARFECTION
    //QUARK
    public static final Block QUARK__APPLE_CRATE = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__apple_crate",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block QUARK__BEETROOT_CRATE = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__beetroot_crate",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block QUARK__CARROT_CRATE = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__carrot_crate",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block QUARK__POTATO_CRATE = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__potato_crate",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block QUARK__GOLDEN_APPLE_CRATE = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__golden_apple_crate",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block QUARK__GOLDEN_CARROT_CRATE = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__golden_carrot_crate",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block QUARK__SWEET_BERRY_SACK = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__sweet_berry_sack",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)));
    public static final Block QUARK__GLOW_BERRY_SACK = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__glow_berry_sack",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)));
    public static final Block QUARK__COCOA_BEAN_SACK = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__cocoa_bean_sack",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)));
    public static final Block QUARK__GUNPOWDER_SACK = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__gunpowder_sack",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)));
    public static final Block QUARK__NETHER_WART_SACK = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__nether_wart_sack",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)));
    public static final Block QUARK__STICK_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__stick_block",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)
                    .strength(1.0f)));
    public static final Block QUARK__SUGAR_CANE_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__sugar_cane_block",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)
                    .strength(1.0f)));
    public static final Block QUARK__CACTUS_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__cactus_block",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOL)
                    .strength(1.0f)));
    public static final Block QUARK__CHORUS_FRUIT_BLOCK = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__chorus_fruit_block",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block QUARK__ANDESITE_PILLAR = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__andesite_pillar",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_ANDESITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_ANDESITE.getHardness(), Blocks.POLISHED_ANDESITE.getBlastResistance())));
    public static final Block QUARK__ANDESITE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__andesite_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_ANDESITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_ANDESITE.getHardness(), Blocks.POLISHED_ANDESITE.getBlastResistance())));
    public static final Block QUARK__CHISELED_ANDESITE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__chiseled_andesite_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_ANDESITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_ANDESITE.getHardness(), Blocks.POLISHED_ANDESITE.getBlastResistance())));
    public static final Block QUARK__ANDESITE_BRICK_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__andesite_brick_stairs",
            new ModStairsBlock(ModBlocks.QUARK__ANDESITE_BRICKS.getDefaultState(),AbstractBlock.Settings
                    .copy(Blocks.POLISHED_ANDESITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_ANDESITE.getHardness(), Blocks.POLISHED_ANDESITE.getBlastResistance())));
    public static final Block QUARK__ANDESITE_BRICK_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__andesite_brick_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_ANDESITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_ANDESITE.getHardness(), Blocks.POLISHED_ANDESITE.getBlastResistance())));
    public static final Block QUARK__DIORITE_PILLAR = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__diorite_pillar",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_DIORITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_DIORITE.getHardness(), Blocks.POLISHED_DIORITE.getBlastResistance())));
    public static final Block QUARK__DIORITE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__diorite_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_DIORITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_DIORITE.getHardness(), Blocks.POLISHED_DIORITE.getBlastResistance())));
    public static final Block QUARK__CHISELED_DIORITE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__chiseled_diorite_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_DIORITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_DIORITE.getHardness(), Blocks.POLISHED_DIORITE.getBlastResistance())));
    public static final Block QUARK__DIORITE_BRICK_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__diorite_brick_stairs",
            new ModStairsBlock(ModBlocks.QUARK__DIORITE_BRICKS.getDefaultState(),AbstractBlock.Settings
                    .copy(Blocks.POLISHED_DIORITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_DIORITE.getHardness(), Blocks.POLISHED_DIORITE.getBlastResistance())));
    public static final Block QUARK__DIORITE_BRICK_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__diorite_brick_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_DIORITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_DIORITE.getHardness(), Blocks.POLISHED_DIORITE.getBlastResistance())));
    public static final Block QUARK__GRANITE_PILLAR = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__granite_pillar",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_GRANITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_GRANITE.getHardness(), Blocks.POLISHED_GRANITE.getBlastResistance())));
    public static final Block QUARK__GRANITE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__granite_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_GRANITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_GRANITE.getHardness(), Blocks.POLISHED_GRANITE.getBlastResistance())));
    public static final Block QUARK__CHISELED_GRANITE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__chiseled_granite_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_GRANITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_GRANITE.getHardness(), Blocks.POLISHED_GRANITE.getBlastResistance())));
    public static final Block QUARK__GRANITE_BRICK_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__granite_brick_stairs",
            new ModStairsBlock(ModBlocks.QUARK__GRANITE_BRICKS.getDefaultState(),AbstractBlock.Settings
                    .copy(Blocks.POLISHED_GRANITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_GRANITE.getHardness(), Blocks.POLISHED_GRANITE.getBlastResistance())));
    public static final Block QUARK__GRANITE_BRICK_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__granite_brick_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.POLISHED_GRANITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(Blocks.POLISHED_GRANITE.getHardness(), Blocks.POLISHED_GRANITE.getBlastResistance())));
    public static final Block QUARK__DRIPSTONE_PILLAR = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__dripstone_pillar",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())));
    public static final Block QUARK__DRIPSTONE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__dripstone_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())));
    public static final Block QUARK__CHISELED_DRIPSTONE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__chiseled_dripstone_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())));
    public static final Block QUARK__POLISHED_DRIPSTONE = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__polished_dripstone",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())));

    public static final Block QUARK__DRIPSTONE_BRICK_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__dripstone_brick_stairs",
            new ModStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(),AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())));
    public static final Block QUARK__DRIPSTONE_BRICK_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__dripstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())));
    public static final Block QUARK__POLISHED_DRIPSTONE_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__polished_dripstone_stairs",
            new ModStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(),AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())));
    public static final Block QUARK__POLISHED_DRIPSTONE_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__polished_dripstone_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())));
    public static final Block QUARK__DRIPSTONE_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__dripstone_stairs",
            new ModStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(),AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())));
    public static final Block QUARK__DRIPSTONE_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__dripstone_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(Blocks.DRIPSTONE_BLOCK.getHardness(), Blocks.DRIPSTONE_BLOCK.getBlastResistance())));
    public static final Block QUARK__CALCITE_PILLAR = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__calcite_pillar",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(1.5f, 6.0f)));
    public static final Block QUARK__CALCITE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__calcite_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(1.5f, 6.0f)));
    public static final Block QUARK__CHISELED_CALCITE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__chiseled_calcite_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(1.5f, 6.0f)));
    public static final Block QUARK__POLISHED_CALCITE = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__polished_calcite",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(1.5f, 6.0f)));
    public static final Block QUARK__CALCITE_BRICK_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__calcite_brick_stairs",
            new ModStairsBlock(Blocks.CALCITE.getDefaultState(),AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(Blocks.CALCITE.getHardness(), Blocks.CALCITE.getBlastResistance())));
    public static final Block QUARK__CALCITE_BRICK_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__calcite_brick_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(Blocks.CALCITE.getHardness(), Blocks.CALCITE.getBlastResistance())));
    public static final Block QUARK__POLISHED_CALCITE_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__polished_calcite_stairs",
            new ModStairsBlock(Blocks.CALCITE.getDefaultState(),AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(Blocks.CALCITE.getHardness(), Blocks.CALCITE.getBlastResistance())));
    public static final Block QUARK__POLISHED_CALCITE_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__polished_calcite_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(Blocks.CALCITE.getHardness(), Blocks.CALCITE.getBlastResistance())));
    public static final Block QUARK__CALCITE_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__calcite_stairs",
            new ModStairsBlock(Blocks.CALCITE.getDefaultState(),AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(Blocks.CALCITE.getHardness(), Blocks.CALCITE.getBlastResistance())));
    public static final Block QUARK__CALCITE_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__calcite_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.CALCITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(Blocks.CALCITE.getHardness(), Blocks.CALCITE.getBlastResistance())));
    public static final Block QUARK__CAVE_ROOTS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__cave_roots",
            new VineBlock(AbstractBlock.Settings
                    .copy(Blocks.VINE)
                    .noCollision()
                    .ticksRandomly()
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.VINE)));
    //QUARK - VERTICAL PLANKS
    public static final Block QUARK__VERTICAL_OAK_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_oak_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OAK_PLANKS)));
    public static final Block QUARK__VERTICAL_SPRUCE_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_spruce_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.SPRUCE_PLANKS)));
    public static final Block QUARK__VERTICAL_BIRCH_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_birch_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.BIRCH_PLANKS)));
    public static final Block QUARK__VERTICAL_JUNGLE_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_jungle_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.JUNGLE_PLANKS)));
    public static final Block QUARK__VERTICAL_ACACIA_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_acacia_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.ACACIA_PLANKS)));
    public static final Block QUARK__VERTICAL_DARK_OAK_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_dark_oak_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block QUARK__VERTICAL_MANGROVE_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_mangrove_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.MANGROVE_PLANKS)));
    public static final Block QUARK__VERTICAL_CHERRY_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_cherry_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.CHERRY_PLANKS)));
    public static final Block QUARK__VERTICAL_BAMBOO_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_bamboo_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.BAMBOO_PLANKS)));
    public static final Block QUARK__VERTICAL_CRIMSON_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_crimson_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.CRIMSON_PLANKS)));
    public static final Block QUARK__VERTICAL_WARPED_PLANKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("quark__vertical_warped_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)));
    //QUARK - VERTICAL PLANKS
    //QUARK
    //HALLOWEEN 2023
    public static final Block H__NODE = SkyBlock.BuiltinRegistries.registerBlockAndItem("h__node",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OBSIDIAN)));
    //HALLOWEEN 2023
    //CHRISTMAS 2023
    public static final Block SKYBLOCK__SNOWY_SHORT_GRASS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__snowy_short_grass",
            new BaseShortPlantBlock(AbstractBlock.Settings
                    .copy(Blocks.SHORT_GRASS)));
    public static final Block SKYBLOCK__FROSTSLATE = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__frostslate",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OBSIDIAN)));
    public static final Block SKYBLOCK__FROSTSLATE_PILLAR = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__frostslate_pillar",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.OBSIDIAN)));
    public static final Block SKYBLOCK__FROSTSLATE_BRICKS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__frostslate_bricks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OBSIDIAN)));
    public static final Block SKYBLOCK__FROSTSLATE_BRICK_STAIRS = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__frostslate_brick_stairs",
            new ModStairsBlock(ModBlocks.SKYBLOCK__FROSTSLATE_BRICKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.OBSIDIAN)));
    public static final Block SKYBLOCK__FROSTSLATE_BRICK_SLAB = SkyBlock.BuiltinRegistries.registerBlockAndItem("skyblock__frostslate_brick_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.OBSIDIAN)));
    //CHRISTMAS 2023
    
    public static void register() {
        SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering Blocks for " + SkyBlock.MOD_ID);
    }
}
