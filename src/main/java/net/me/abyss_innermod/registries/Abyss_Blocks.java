package net.me.abyss_innermod.registries;

import net.me.abyss_innermod.blocks.AbyssVegetation;
import net.me.abyss_innermod.blocks.BlueVigilantGrass;
import net.me.skycore_supermod.ModStairsBlock;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

public class Abyss_Blocks {
    //ABYSS
    public static final Block ABYSS__UNSTABLE_OBSIDIAN = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__unstable_obsidian",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OBSIDIAN)
                    .strength(50.0f, 1200.0f)
                    .requiresTool()
                    .luminance(state -> 10))); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_DIRT = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_dirt",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DIRT)
                    .sounds(BlockSoundGroup.MUD)
                    .strength(0.5f))); //TODO: MAPCOLOR
    public static final Block ABYSS__ROMA_MUD = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__roma_mud",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.MUD)
                    .sounds(BlockSoundGroup.MUD)
                    .strength(0.5f))); //TODO: MAPCOLOR
    public static final Block ABYSS__ROMA_MUD_CURSED = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__roma_mud_2",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.MUD)
                    .sounds(BlockSoundGroup.MUD)
                    .strength(0.5f))); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_GRAVEL = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_gravel",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DIRT)
                    .sounds(BlockSoundGroup.GRAVEL)
                    .strength(0.6f))); //TODO: MAPCOLOR
    public static final Block ABYSS__INFECTED_PEAT = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__infected_peat",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DIRT)
                    .sounds(BlockSoundGroup.MUD)
                    .strength(0.5f))); //TODO: MAPCOLOR
    public static final Block ABYSS__STONE_RACKLE = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__stone_rackle",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.STONE)
                    .strength(1.5f, 6.0f)
                    .requiresTool())); //TODO: MAPCOLOR
    public static final Block ABYSS__BLARU_MOSS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__blaru_moss",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DIRT)
                    .sounds(BlockSoundGroup.ROOTED_DIRT)
                    .strength(0.5f))); //TODO: MAPCOLOR
    public static final Block ABYSS__GLOWING_BLARU_MOSS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__glowing_blaru_moss",
            new CarpetBlock(AbstractBlock.Settings
                    .copy(Blocks.MOSS_CARPET)
                    .sounds(BlockSoundGroup.MOSS_CARPET)
                    .luminance(state -> 6))); //TODO: MAPCOLOR
    public static final Block ABYSS__BLARU_GRASS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__blaru_grass",
            new AbyssVegetation(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.NETHER_SPROUTS))); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_SPORES = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_spores",
            new AbyssVegetation(AbstractBlock.Settings
                    .copy(Blocks.WARPED_ROOTS)
                    .sounds(BlockSoundGroup.ROOTS))); //TODO: MAPCOLOR
    public static final Block ABYSS__TESLA_FLOWER = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__tesla_flower",
            new AbyssVegetation(AbstractBlock.Settings
                    .copy(Blocks.WARPED_ROOTS)
                    .sounds(BlockSoundGroup.ROOTS))); //TODO: MAPCOLOR
    public static final Block ABYSS__VIGILANT_VERSA = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_versa",
            new AbyssVegetation(AbstractBlock.Settings
                    .copy(Blocks.WARPED_ROOTS)
                    .sounds(BlockSoundGroup.ROOTS)
                    .luminance(state -> 7))); //TODO: MAPCOLOR
    public static final Block ABYSS__EXOLIUS_MAXIMUS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__exolius_maximus",
            new AbyssVegetation(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.ROOTS)
                    .luminance(state -> 3))); //TODO: MAPCOLOR
    public static final Block ABYSS__YOUNG_EXOLIUS_MAXIMUS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__young_exolius_maximus",
            new AbyssVegetation(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.ROOTS)
                    .luminance(state -> 3))); //TODO: MAPCOLOR
    public static final Block ABYSS__VIGILANT_GRASS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_grass",
            new AbyssVegetation(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.NETHER_SPROUTS))); //TODO: MAPCOLOR
    public static final Block ABYSS__BLUE_VIGILANT_GRASS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__blue_vigilant_grass",
            new BlueVigilantGrass(AbstractBlock.Settings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.ROOTS)
                    .luminance(state -> state.get(BlueVigilantGrass.LIT) ? 10 : 6))); //TODO: MAPCOLOR
    public static final Block ABYSS__VIGILANT_MOSS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_moss",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DIRT)
                    .sounds(BlockSoundGroup.ROOTED_DIRT)
                    .strength(0.5f))); //TODO: MAPCOLOR
    public static final Block ABYSS__INFUSED_MAGMA = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__infused_magma",
            new MagmaBlock(AbstractBlock.Settings
                    .copy(Blocks.MAGMA_BLOCK)
                    .strength(0.5f)
                    .luminance(state -> 3)
                    .requiresTool()
                    .emissiveLighting(SkyCore.BuiltinRegistries::alwaysPredicate))); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_STONE = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_stone",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.STONE)
                    .strength(1.5f, 6.0f)
                    .requiresTool())); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_STONE_OG = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_stone_og",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.STONE)
                    .strength(1.5f, 6.0f)
                    .requiresTool())); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_DIAMOND_ORE = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_diamond_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.DIAMOND_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool())); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_EMERALD_ORE = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_emerald_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.EMERALD_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool())); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_GOLD_ORE = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_gold_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.GOLD_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool())); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_IRON_ORE = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_iron_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool())); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_IGNISITHE_ORE = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_ignisithe_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool())); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_ABERYTHE_ORE = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_aberythe_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool())); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_ABORANYS_ORE = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_aboranys_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool())); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_FUSION_ORE = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_fusion_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool())); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_GARNITE_ORE = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_garnite_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool())); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_GLACERYTHE_ORE = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_glacerythe_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool())); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_INCORYTHE_ORE = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_incorythe_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool())); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_LORAN_ORE = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_loran_ore",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool())); //TODO: MAPCOLOR
    public static final Block ABYSS__PURPLE_SHROOMLIGHT = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__purple_shroomlight",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.SHROOMLIGHT)
                    .strength(1.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__DARK_BLUE_SHROOMLIGHT = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__dark_blue_shroomlight",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.SHROOMLIGHT)
                    .strength(1.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__BLUE_SHROOMLIGHT = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__blue_shroomlight",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.SHROOMLIGHT)
                    .strength(1.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_JUNGLE_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_jungle_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_JUNGLE_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_jungle_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__STRIPPED_ABYSS_JUNGLE_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__stripped_abyss_jungle_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__STRIPPED_ABYSS_JUNGLE_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__stripped_abyss_jungle_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_JUNGLE_LEAVES = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_jungle_leaves",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OAK_LEAVES))); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_JUNGLE_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_jungle_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_JUNGLE_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_jungle_stairs",
            new ModStairsBlock(ABYSS__ABYSS_JUNGLE_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_JUNGLE_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_jungle_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__BLARU_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__blaru_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM).strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__BLARU_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__blaru_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE).strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__STRIPPED_BLARU_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__stripped_blaru_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__STRIPPED_BLARU_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__stripped_blaru_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__BLARU_LEAVES = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__blaru_leaves",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OAK_LEAVES))); //TODO: MAPCOLOR
    public static final Block ABYSS__BLARU_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__blaru_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS).strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__BLARU_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__blaru_stairs",
            new ModStairsBlock(ABYSS__BLARU_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__BLARU_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__blaru_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__FROZEN_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__frozen_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__FROZEN_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__frozen_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__STRIPPED_FROZEN_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__stripped_frozen_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__STRIPPED_FROZEN_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__stripped_frozen_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__FROZEN_LEAVES = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__frozen_leaves",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.OAK_LEAVES))); //TODO: MAPCOLOR
    public static final Block ABYSS__FROZEN_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__frozen_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__FROZEN_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__frozen_stairs",
            new ModStairsBlock(ABYSS__FROZEN_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__VERTICAL_FROZEN_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__vertical_frozen_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__CARVED_FROZEN_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__carved_frozen_planks",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS))); //TODO: MAPCOLOR
    public static final Block ABYSS__FROZEN_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__frozen_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__SLIMED_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__slimed_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__SLIMED_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__slimed_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__STRIPPED_SLIMED_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__stripped_slimed_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__STRIPPED_SLIMED_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__stripped_slimed_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSS_SLIME_BLOCK = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abyss_slime_block",
            new SlimeBlock(AbstractBlock.Settings
                    .copy(Blocks.SLIME_BLOCK)
                    .strength(0.01f))); //TODO: MAPCOLOR
    public static final Block ABYSS__SLIMED_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__slimed_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__SLIMED_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__slimed_stairs",
            new ModStairsBlock(ABYSS__SLIMED_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__SLIMED_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__slimed_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__VIGILANT_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__VIGILANT_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__STRIPPED_VIGILANT_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__stripped_vigilant_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__STRIPPED_VIGILANT_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__stripped_vigilant_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__VIGILANT_LEAVES = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_leaves",
            new LeavesBlock(AbstractBlock.Settings
                    .copy(Blocks.BUBBLE_CORAL_BLOCK)
                    .strength(1.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__VIGILANT_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__VIGILANT_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_stairs",
            new ModStairsBlock(ABYSS__VIGILANT_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__VIGILANT_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__vigilant_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSCULK_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abysculk_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSCULK_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abysculk_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__STRIPPED_ABYSCULK_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__stripped_abysculk_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__STRIPPED_ABYSCULK_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__stripped_abysculk_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSCULK_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abysculk_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSCULK_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abysculk_stairs",
            new ModStairsBlock(ABYSS__ABYSCULK_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__ABYSCULK_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__abysculk_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__BOG_SHROOM_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__bog_shroom_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__BOG_SHROOM_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__bog_shroom_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__STRIPPED_BOG_SHROOM_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__stripped_bog_shroom_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__STRIPPED_BOG_SHROOM_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__stripped_bog_shroom_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__BOG_SHROOM_LEAVES = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__bog_shroom_leaves",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.BRAIN_CORAL_BLOCK)
                    .luminance(state -> 10))); //TODO: MAPCOLOR
    public static final Block ABYSS__BOG_SHROOM_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__bog_shroom_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__BOG_SHROOM_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__bog_shroom_stairs",
            new ModStairsBlock(ABYSS__BOG_SHROOM_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__BOG_SHROOM_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__bog_shroom_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__SAL_SHROOM_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__sal_shroom_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__SAL_SHROOM_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__sal_shroom_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__STRIPPED_SAL_SHROOM_LOG = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__stripped_sal_shroom_log",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__STRIPPED_SAL_SHROOM_WOOD = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__stripped_sal_shroom_wood",
            new PillarBlock(AbstractBlock.Settings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__SAL_SHROOM_LEAVES = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__sal_shroom_leaves",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.BUBBLE_CORAL_BLOCK)
                    .luminance(state -> 10))); //TODO: MAPCOLOR
    public static final Block ABYSS__SAL_SHROOM_PLANKS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__sal_shroom_planks",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__SAL_SHROOM_STAIRS = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__sal_shroom_stairs",
            new ModStairsBlock(ABYSS__SAL_SHROOM_PLANKS.getDefaultState(), AbstractBlock.Settings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static final Block ABYSS__SAL_SHROOM_SLAB = SkyCore.BuiltinRegistries.registerBlockAndItem("abyss__sal_shroom_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f))); //TODO: MAPCOLOR
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering Blocks for \"Abyss\" innermod");
    }
}
