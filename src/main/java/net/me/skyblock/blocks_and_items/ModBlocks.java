package net.me.skyblock.blocks_and_items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.blocks_and_items.blocks.abyss.AbyssVegetation;
import net.me.skyblock.blocks_and_items.blocks.abyss.BlueVigilantGrass;
import net.me.skyblock.blocks_and_items.blocks.end.BluisheLightStemBlock;
import net.me.skyblock.blocks_and_items.blocks.end.EndFlower;
import net.me.skyblock.blocks_and_items.blocks.end.EndVegetation;
import net.me.skyblock.blocks_and_items.blocks.end.EnderBlock;
import net.me.skyblock.blocks_and_items.blocks.mcd.MossyOakPlanks;
import net.me.skyblock.blocks_and_items.blocks.skyblock.DuckweedBlock;
import net.me.skyblock.blocks_and_items.blocks.skyblock.SuspiciousCoarseDirt;
import net.me.skyblock.blocks_and_items.blocks.util.ModStairsBlock;
import net.me.skyblock.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ModBlocks {

    //ABYSS
    public static final Block ABYSS__UNSTABLE_OBSIDIAN = registerBlock("abyss__unstable_obsidian",
            new Block(FabricBlockSettings
                    .copy(Blocks.OBSIDIAN)
                    .strength(50.0f, 1200.0f)
                    .requiresTool()
                    .luminance(state -> 10)));
    public static final Block ABYSS__ABYSS_DIRT = registerBlock("abyss__abyss_dirt",
            new Block(FabricBlockSettings
                    .copy(Blocks.DIRT)
                    .sounds(BlockSoundGroup.MUD)
                    .strength(0.5f)));
    public static final Block ABYSS__ROMA_MUD = registerBlock("abyss__roma_mud",
            new Block(FabricBlockSettings
                    .copy(Blocks.MUD)
                    .sounds(BlockSoundGroup.MUD)
                    .strength(0.5f)));
    public static final Block ABYSS__ROMA_MUD_CURSED = registerBlock("abyss__roma_mud_2",
            new Block(FabricBlockSettings
                    .copy(Blocks.MUD)
                    .sounds(BlockSoundGroup.MUD)
                    .strength(0.5f)));
    public static final Block ABYSS__ABYSS_GRAVEL = registerBlock("abyss__abyss_gravel",
            new Block(FabricBlockSettings
                    .copy(Blocks.DIRT)
                    .sounds(BlockSoundGroup.GRAVEL)
                    .strength(0.6f)));
    public static final Block ABYSS__INFECTED_PEAT = registerBlock("abyss__infected_peat",
            new Block(FabricBlockSettings
                    .copy(Blocks.DIRT)
                    .sounds(BlockSoundGroup.MUD)
                    .strength(0.5f)));
    public static final Block ABYSS__STONE_RACKLE = registerBlock("abyss__stone_rackle",
            new Block(FabricBlockSettings
                    .copy(Blocks.STONE)
                    .strength(1.5f, 6.0f)
                    .requiresTool()));
    public static final Block ABYSS__BLARU_MOSS = registerBlock("abyss__blaru_moss",
            new Block(FabricBlockSettings
                    .copy(Blocks.DIRT)
                    .sounds(BlockSoundGroup.ROOTED_DIRT)
                    .strength(0.5f)));
    public static final Block ABYSS__GLOWING_BLARU_MOSS = registerBlock("abyss__glowing_blaru_moss",
            new CarpetBlock(FabricBlockSettings
                    .copy(Blocks.MOSS_CARPET)
                    .sounds(BlockSoundGroup.MOSS_CARPET)
                    .luminance(state -> 6)));
    public static final Block ABYSS__BLARU_GRASS = registerBlock("abyss__blaru_grass",
            new AbyssVegetation(FabricBlockSettings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.NETHER_SPROUTS)));
    public static final Block ABYSS__ABYSS_SPORES = registerBlock("abyss__abyss_spores",
            new AbyssVegetation(FabricBlockSettings
                    .copy(Blocks.WARPED_ROOTS)
                    .sounds(BlockSoundGroup.ROOTS)));
    public static final Block ABYSS__TESLA_FLOWER = registerBlock("abyss__tesla_flower",
            new AbyssVegetation(FabricBlockSettings
                    .copy(Blocks.WARPED_ROOTS)
                    .sounds(BlockSoundGroup.ROOTS)));
    public static final Block ABYSS__VIGILANT_VERSA = registerBlock("abyss__vigilant_versa",
            new AbyssVegetation(FabricBlockSettings
                    .copy(Blocks.WARPED_ROOTS)
                    .sounds(BlockSoundGroup.ROOTS)
                    .luminance(state -> 7)));
    public static final Block ABYSS__EXOLIUS_MAXIMUS = registerBlock("abyss__exolius_maximus",
            new AbyssVegetation(FabricBlockSettings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.ROOTS)
                    .luminance(state -> 3)));
    public static final Block ABYSS__YOUNG_EXOLIUS_MAXIMUS = registerBlock("abyss__young_exolius_maximus",
            new AbyssVegetation(FabricBlockSettings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.ROOTS)
                    .luminance(state -> 3)));
    public static final Block ABYSS__VIGILANT_GRASS = registerBlock("abyss__vigilant_grass",
            new AbyssVegetation(FabricBlockSettings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.NETHER_SPROUTS)));
    public static final Block ABYSS__BLUE_VIGILANT_GRASS = registerBlock("abyss__blue_vigilant_grass",
            new BlueVigilantGrass(FabricBlockSettings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.ROOTS)
                    .luminance(state -> state.get(BlueVigilantGrass.LIT) ? 10 : 6)));
    public static final Block ABYSS__VIGILANT_MOSS = registerBlock("abyss__vigilant_moss",
            new Block(FabricBlockSettings
                    .copy(Blocks.DIRT)
                    .sounds(BlockSoundGroup.ROOTED_DIRT)
                    .strength(0.5f)));
    public static final Block ABYSS__INFUSED_MAGMA = registerBlock("abyss__infused_magma",
            new MagmaBlock(FabricBlockSettings
                    .copy(Blocks.MAGMA_BLOCK)
                    .strength(0.5f)
                    .luminance(state -> 3).requiresTool()
                    .emissiveLighting(ModBlocks::always)));
    public static final Block ABYSS__ABYSS_STONE = registerBlock("abyss__abyss_stone",
            new Block(FabricBlockSettings
                    .copy(Blocks.STONE)
                    .strength(1.5f, 6.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_STONE_OG = registerBlock("abyss__abyss_stone_og",
            new Block(FabricBlockSettings
                    .copy(Blocks.STONE)
                    .strength(1.5f, 6.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_DIAMOND_ORE = registerBlock("abyss__abyss_diamond_ore",
            new Block(FabricBlockSettings
                    .copy(Blocks.DIAMOND_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_EMERALD_ORE = registerBlock("abyss__abyss_emerald_ore",
            new Block(FabricBlockSettings
                    .copy(Blocks.EMERALD_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_GOLD_ORE = registerBlock("abyss__abyss_gold_ore",
            new Block(FabricBlockSettings
                    .copy(Blocks.GOLD_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_IRON_ORE = registerBlock("abyss__abyss_iron_ore",
            new Block(FabricBlockSettings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_IGNISITHE_ORE = registerBlock("abyss__abyss_ignisithe_ore",
            new Block(FabricBlockSettings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_ABERYTHE_ORE = registerBlock("abyss__abyss_aberythe_ore",
            new Block(FabricBlockSettings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_ABORANYS_ORE = registerBlock("abyss__abyss_aboranys_ore",
            new Block(FabricBlockSettings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_FUSION_ORE = registerBlock("abyss__abyss_fusion_ore",
            new Block(FabricBlockSettings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_GARNITE_ORE = registerBlock("abyss__abyss_garnite_ore",
            new Block(FabricBlockSettings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_GLACERYTHE_ORE = registerBlock("abyss__abyss_glacerythe_ore",
            new Block(FabricBlockSettings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_INCORYTHE_ORE = registerBlock("abyss__abyss_incorythe_ore",
            new Block(FabricBlockSettings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__ABYSS_LORAN_ORE = registerBlock("abyss__abyss_loran_ore",
            new Block(FabricBlockSettings
                    .copy(Blocks.IRON_ORE)
                    .strength(3.0f, 3.0f)
                    .requiresTool()));
    public static final Block ABYSS__PURPLE_SHROOMLIGHT = registerBlock("abyss__purple_shroomlight",
            new Block(FabricBlockSettings
                    .copy(Blocks.SHROOMLIGHT)
                    .strength(1.0f)));
    public static final Block ABYSS__DARK_BLUE_SHROOMLIGHT = registerBlock("abyss__dark_blue_shroomlight",
            new Block(FabricBlockSettings
                    .copy(Blocks.SHROOMLIGHT)
                    .strength(1.0f)));
    public static final Block ABYSS__BLUE_SHROOMLIGHT = registerBlock("abyss__blue_shroomlight",
            new Block(FabricBlockSettings
                    .copy(Blocks.SHROOMLIGHT)
                    .strength(1.0f)));


    public static final Block ABYSS__ABYSS_JUNGLE_LOG = registerBlock("abyss__abyss_jungle_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__ABYSS_JUNGLE_WOOD = registerBlock("abyss__abyss_jungle_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_ABYSS_JUNGLE_LOG = registerBlock("abyss__stripped_abyss_jungle_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_ABYSS_JUNGLE_WOOD = registerBlock("abyss__stripped_abyss_jungle_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__ABYSS_JUNGLE_LEAVES = registerBlock("abyss__abyss_jungle_leaves",
            new Block(FabricBlockSettings
                    .copy(Blocks.OAK_LEAVES)));
    public static final Block ABYSS__ABYSS_JUNGLE_PLANKS = registerBlock("abyss__abyss_jungle_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f)));
    public static final Block ABYSS__ABYSS_JUNGLE_STAIRS = registerBlock("abyss__abyss_jungle_stairs",
            new ModStairsBlock(ModBlocks.ABYSS__ABYSS_JUNGLE_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block ABYSS__ABYSS_JUNGLE_SLAB = registerBlock("abyss__abyss_jungle_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));


    public static final Block ABYSS__BLARU_LOG = registerBlock("abyss__blaru_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_STEM).strength(2.0f)));
    public static final Block ABYSS__BLARU_WOOD = registerBlock("abyss__blaru_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_HYPHAE).strength(2.0f)));
    public static final Block ABYSS__STRIPPED_BLARU_LOG = registerBlock("abyss__stripped_blaru_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_BLARU_WOOD = registerBlock("abyss__stripped_blaru_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__BLARU_LEAVES = registerBlock("abyss__blaru_leaves",
            new Block(FabricBlockSettings
                    .copy(Blocks.OAK_LEAVES)));
    public static final Block ABYSS__BLARU_PLANKS = registerBlock("abyss__blaru_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.WARPED_PLANKS).strength(2.0f)));
    public static final Block ABYSS__BLARU_STAIRS = registerBlock("abyss__blaru_stairs",
            new ModStairsBlock(ModBlocks.ABYSS__BLARU_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block ABYSS__BLARU_SLAB = registerBlock("abyss__blaru_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));


    public static final Block ABYSS__FROZEN_LOG = registerBlock("abyss__frozen_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__FROZEN_WOOD = registerBlock("abyss__frozen_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_FROZEN_LOG = registerBlock("abyss__stripped_frozen_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_FROZEN_WOOD = registerBlock("abyss__stripped_frozen_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__FROZEN_LEAVES = registerBlock("abyss__frozen_leaves",
            new Block(FabricBlockSettings
                    .copy(Blocks.OAK_LEAVES)));
    public static final Block ABYSS__FROZEN_PLANKS = registerBlock("abyss__frozen_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f)));
    public static final Block ABYSS__FROZEN_STAIRS = registerBlock("abyss__frozen_stairs",
            new ModStairsBlock(ModBlocks.ABYSS__FROZEN_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block ABYSS__FROZEN_SLAB = registerBlock("abyss__frozen_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));


    public static final Block ABYSS__SLIMED_LOG = registerBlock("abyss__slimed_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__SLIMED_WOOD = registerBlock("abyss__slimed_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_SLIMED_LOG = registerBlock("abyss__stripped_slimed_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_SLIMED_WOOD = registerBlock("abyss__stripped_slimed_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__ABYSS_SLIME_BLOCK = registerBlock("abyss__abyss_slime_block",
            new SlimeBlock(FabricBlockSettings
                    .copy(Blocks.SLIME_BLOCK)
                    .strength(0.01f)));
    public static final Block ABYSS__SLIMED_PLANKS = registerBlock("abyss__slimed_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f)));
    public static final Block ABYSS__SLIMED_STAIRS = registerBlock("abyss__slimed_stairs",
            new ModStairsBlock(ModBlocks.ABYSS__SLIMED_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block ABYSS__SLIMED_SLAB = registerBlock("abyss__slimed_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));


    public static final Block ABYSS__VIGILANT_LOG = registerBlock("abyss__vigilant_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__VIGILANT_WOOD = registerBlock("abyss__vigilant_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_VIGILANT_LOG = registerBlock("abyss__stripped_vigilant_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_VIGILANT_WOOD = registerBlock("abyss__stripped_vigilant_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__VIGILANT_LEAVES = registerBlock("abyss__vigilant_leaves",
            new LeavesBlock(FabricBlockSettings
                    .copy(Blocks.BUBBLE_CORAL_BLOCK)
                    .strength(1.0f)));
    public static final Block ABYSS__VIGILANT_PLANKS = registerBlock("abyss__vigilant_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f)));
    public static final Block ABYSS__VIGILANT_STAIRS = registerBlock("abyss__vigilant_stairs",
            new ModStairsBlock(ModBlocks.ABYSS__VIGILANT_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block ABYSS__VIGILANT_SLAB = registerBlock("abyss__vigilant_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));


    public static final Block ABYSS__ABYSCULK_LOG = registerBlock("abyss__abysculk_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__ABYSCULK_WOOD = registerBlock("abyss__abysculk_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_ABYSCULK_LOG = registerBlock("abyss__stripped_abysculk_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_ABYSCULK_WOOD = registerBlock("abyss__stripped_abysculk_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__ABYSCULK_PLANKS = registerBlock("abyss__abysculk_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f)));
    public static final Block ABYSS__ABYSCULK_STAIRS = registerBlock("abyss__abysculk_stairs",
            new ModStairsBlock(ModBlocks.ABYSS__ABYSCULK_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block ABYSS__ABYSCULK_SLAB = registerBlock("abyss__abysculk_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));


    public static final Block ABYSS__BOG_SHROOM_LOG = registerBlock("abyss__bog_shroom_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__BOG_SHROOM_WOOD = registerBlock("abyss__bog_shroom_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_BOG_SHROOM_LOG = registerBlock("abyss__stripped_bog_shroom_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_BOG_SHROOM_WOOD = registerBlock("abyss__stripped_bog_shroom_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__BOG_SHROOM_LEAVES = registerBlock("abyss__bog_shroom_leaves",
            new Block(FabricBlockSettings
                    .copy(Blocks.BRAIN_CORAL_BLOCK)
                    .luminance(state -> 10)));
    public static final Block ABYSS__BOG_SHROOM_PLANKS = registerBlock("abyss__bog_shroom_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f)));
    public static final Block ABYSS__BOG_SHROOM_STAIRS = registerBlock("abyss__bog_shroom_stairs",
            new ModStairsBlock(ModBlocks.ABYSS__BOG_SHROOM_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block ABYSS__BOG_SHROOM_SLAB = registerBlock("abyss__bog_shroom_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));


    public static final Block ABYSS__SAL_SHROOM_LOG = registerBlock("abyss__sal_shroom_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__SAL_SHROOM_WOOD = registerBlock("abyss__sal_shroom_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_SAL_SHROOM_LOG = registerBlock("abyss__stripped_sal_shroom_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)));
    public static final Block ABYSS__STRIPPED_SAL_SHROOM_WOOD = registerBlock("abyss__stripped_sal_shroom_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block ABYSS__SAL_SHROOM_LEAVES = registerBlock("abyss__sal_shroom_leaves",
            new Block(FabricBlockSettings
                    .copy(Blocks.BUBBLE_CORAL_BLOCK)
                    .luminance(state -> 10)));
    public static final Block ABYSS__SAL_SHROOM_PLANKS = registerBlock("abyss__sal_shroom_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f)));
    public static final Block ABYSS__SAL_SHROOM_STAIRS = registerBlock("abyss__sal_shroom_stairs",
            new ModStairsBlock(ModBlocks.ABYSS__SAL_SHROOM_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block ABYSS__SAL_SHROOM_SLAB = registerBlock("abyss__sal_shroom_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));
    //ABYSS
    //SKYBLOCK MAIN-BLOCK
    public static final Block SKYBLOCK__DUCKWEED = registerBlockWithoutItem("skyblock__duckweed",
            new DuckweedBlock(FabricBlockSettings
                    .copyOf(Blocks.LILY_PAD)
                    .noCollision()
                    .noBlockBreakParticles()
                    .nonOpaque()));
    public static final Block MCD__VOID_BLOCK = registerBlock("mcd__void_block",
            new Block(FabricBlockSettings
                    .copy(Blocks.SCULK)
                    .strength(3.0f)
                    .luminance(state -> 1)
                    .requiresTool()
                    .emissiveLighting(ModBlocks::always)));
    public static final Block SP5__ENDMERALD_ORE = registerBlock("sp5__end_emerald_ore",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.END_STONE)
                    .strength(4.0f)
                    .requiresTool()));
    public static final Block SP5__ENDMERALD_BLOCK = registerBlock("sp5__end_emerald_block",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.EMERALD_BLOCK)
                    .strength(4.0f)
                    .requiresTool()));
    public static final Block SP5__ENDERITE_ORE = registerBlock("sp5__enderite_ore",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.END_STONE)
                    .strength(4.0f)
                    .requiresTool()));
    public static final Block SP5__ENDERITE_BLOCK = registerBlock("sp5__enderite_block",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.EMERALD_BLOCK)
                    .strength(4.0f)
                    .requiresTool()));
    public static final Block SP5__ASTEROID_RESIDUES = registerBlock("sp5__asteroid_residues",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.END_STONE)
                    .strength(4.0f)
                    .requiresTool()));
    public static final Block SP5__SOLID_ROCK = registerBlock("sp5__solid_rock",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.END_STONE)
                    .strength(4.0f)
                    .requiresTool()));
    public static final Block MCD__OG_PURPUR_BLOCK = registerBlock("mcd__og_purpur_block",
            new Block(FabricBlockSettings
                    .copy(Blocks.PURPUR_BLOCK)
                    .mapColor(MapColor.MAGENTA)
                    .instrument(Instrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));
    public static final Block SP5__END_GRASS = registerBlock("sp5__end_grass",
            new Block(FabricBlockSettings
                    .copy(Blocks.END_STONE)
                    .sounds(BlockSoundGroup.GRASS)
                    .instrument(Instrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 7.5F)));
    public static final Block SP5__BLUISHE_GRASS = registerBlock("sp5__bluishe_end_stone",
            new Block(FabricBlockSettings
                    .copy(Blocks.END_STONE)
                    .instrument(Instrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 9.0F)));
    public static final Block SP5__END_GRASS_VEGETATION = registerBlock("sp5__ender_grass",
            new EndVegetation(FabricBlockSettings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.GRASS)));
    public static final Block SP5__END_MUSHROOM = registerBlock("sp5__end_fungus",
            new EndVegetation(FabricBlockSettings
                    .copy(Blocks.CRIMSON_FUNGUS)
                    .sounds(BlockSoundGroup.FUNGUS)));
    public static final Block SP5__BLUISHE_BUSH = registerBlock("sp5__bluishe_bush",
            new EndVegetation(FabricBlockSettings
                    .copy(Blocks.WARPED_FUNGUS)
                    .sounds(BlockSoundGroup.GRASS)));
    public static final Block SP5__BLUISHE_MUSHROOM = registerBlock("sp5__bluishe_fungus",
            new EndVegetation(FabricBlockSettings
                    .copy(Blocks.WARPED_FUNGUS)
                    .sounds(BlockSoundGroup.FUNGUS)));
    public static final Block SP5__END_BUSH = registerBlock("sp5__end_bush",
            new EndVegetation(FabricBlockSettings
                    .copy(Blocks.NETHER_SPROUTS)
                    .sounds(BlockSoundGroup.GRASS)));
    public static final Block SP5__END_FLOWER = registerBlock("sp5__end_flower",
            new EndFlower(FabricBlockSettings
                    .copy(Blocks.DANDELION)
                    .sounds(BlockSoundGroup.SPORE_BLOSSOM)));
    public static final Block SKYBLOCK__ANT_JAM_BLOCK = registerBlock("skyblock__ant_jam_block",
            new SlimeBlock(FabricBlockSettings
                    .copy(Blocks.HONEY_BLOCK)));
    public static final Block SKYBLOCK__SWEET_BERRY_JAM_BLOCK = registerBlock("skyblock__sweet_berry_jam_block",
            new SlimeBlock(FabricBlockSettings
                    .copy(Blocks.HONEY_BLOCK)));
    public static final Block SKYBLOCK__SUSPICIOUS_COARSE_DIRT = registerBlock("skyblock__suspicious_coarse_dirt",
            new SuspiciousCoarseDirt(FabricBlockSettings
                    .copy(Blocks.COARSE_DIRT)
                    .strength(0.5f)));
    public static final Block SP5__TRANSPARENT_BLOCK = registerBlock("sp5__transparent_block",
            new TransparentBlock(FabricBlockSettings
                    .copy(Blocks.BLACK_STAINED_GLASS)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(0.5f)));
    public static final Block SP5__END_WART_BLOCK = registerBlock("sp5__end_wart_block",
            new TransparentBlock(FabricBlockSettings
                    .copy(Blocks.BLACK_STAINED_GLASS)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)));
    public static final Block SP5__BLUE_WART = registerBlock("sp5__blue_wart",
            new TransparentBlock(FabricBlockSettings
                    .copy(Blocks.BLACK_STAINED_GLASS)
                    .sounds(BlockSoundGroup.MOSS_BLOCK)
                    .strength(0.5f)));
    public static final Block SP5__CRACKED_END_STONE_BRICKS = registerBlock("sp5__cracked_end_stone_bricks",
            new Block(FabricBlockSettings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__WARPED_END_STONE_BRICKS = registerBlock("sp5__warped_end_stone_bricks",
            new Block(FabricBlockSettings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__END_STONE_PILLAR = registerBlock("sp5__end_stone_pillar",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__END_STONE_TILES = registerBlock("sp5__end_stone_tiles",
            new Block(FabricBlockSettings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__SMALL_END_STONE_BRICKS = registerBlock("sp5__small_end_stone_bricks",
            new Block(FabricBlockSettings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__SMOOTH_END_STONE = registerBlock("sp5__smooth_end_stone",
            new Block(FabricBlockSettings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__CHISELED_END_STONE = registerBlock("sp5__chiseled_end_stone",
            new Block(FabricBlockSettings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__CHISELED_END_STONE_CUBIC = registerBlock("sp5__chiseled_end_stone_cubic",
            new Block(FabricBlockSettings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__CHISELED_END_STONE_MAZE = registerBlock("sp5__chiseled_end_stone_maze",
            new Block(FabricBlockSettings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__PURPLE_END_BRICKS = registerBlock("sp5__purple_end_bricks",
            new Block(FabricBlockSettings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__PURPLE_END_BRICK_PILLAR = registerBlock("sp5__purple_end_brick_pillar",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(1.5f, 6.0f)));
    public static final Block SP5__WARPED_PURPLE_END_BRICKS = registerBlock("sp5__warped_purple_end_bricks",
            new Block(FabricBlockSettings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__PURPLE_END_BRICK_STAIRS = registerBlock("sp5__purple_end_brick_stairs",
            new StairsBlock(ModBlocks.SP5__PURPLE_END_BRICKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.END_STONE_BRICK_STAIRS)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__PURPLE_END_BRICK_SLAB = registerBlock("sp5__purple_end_brick_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.END_STONE_BRICK_SLAB)
                    .strength(3.0f, 9.0f)));
    public static final Block SP5__END_PURPLE_BLOCK = registerBlock("sp5__end_purple_block",
            new Block(FabricBlockSettings
                    .copy(Blocks.PURPUR_BLOCK)
                    .strength(1.5f, 6.0f)));
    public static final Block SP5__END_PURPLE_PILLAR = registerBlock("sp5__end_purple_pillar",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.END_STONE_BRICKS)
                    .strength(1.5f, 6.0f)));
    public static final Block SP5__ENDER_BLOCK = registerBlock("sp5__ender_block",
            new EnderBlock(FabricBlockSettings
                    .copy(Blocks.PURPUR_BLOCK)
                    .strength(1.5f, 6.0f)));
    public static final Block SP5__END_PURPLE_STAIRS = registerBlock("sp5__end_purple_stairs",
            new StairsBlock(ModBlocks.SP5__END_PURPLE_BLOCK.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.PURPUR_STAIRS)
                    .strength(1.5f, 6.0f)));
    public static final Block SP5__END_PURPLE_SLAB = registerBlock("sp5__end_purple_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.PURPUR_SLAB)
                    .strength(1.5f, 6.0f)));
    public static final Block SP5__END_STEM = registerBlock("sp5__end_stem",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.CRIMSON_STEM)
                    .strength(2.0f)));
    public static final Block SP5__END_HYPHAE = registerBlock("sp5__end_hyphae",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.CRIMSON_HYPHAE)
                    .strength(2.0f)));
    public static final Block SP5__STRIPPED_END_STEM = registerBlock("sp5__stripped_end_stem",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_CRIMSON_STEM)
                    .strength(2.0f)));
    public static final Block SP5__STRIPPED_END_HYPHAE = registerBlock("sp5__stripped_end_hyphae",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_CRIMSON_HYPHAE)
                    .strength(2.0f)));
    public static final Block SP5__ENDLIGHT = registerBlock("sp5__endlight",
            new Block(FabricBlockSettings
                    .copy(Blocks.SHROOMLIGHT)
                    .strength(1.0f)));
    public static final Block SP5__END_PLANKS = registerBlock("sp5__end_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.CRIMSON_PLANKS)
                    .strength(2.0f)));
    public static final Block SP5__END_STAIRS = registerBlock("sp5__end_stairs",
            new ModStairsBlock(ModBlocks.SP5__END_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block SP5__END_SLAB = registerBlock("sp5__end_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));


    public static final Block SP5__BLUISHE_STEM = registerBlock("sp5__bluishe_stem",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block SP5__BLUISHE_HYPHAE = registerBlock("sp5__bluishe_hyphae",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block SP5__BLUISHE_LIGHT_STEM = registerBlock("sp5__bluishe_light_stem",
            new BluisheLightStemBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_STEM)
                    .strength(2.0f)));
    public static final Block SP5__BLUISHE_LIGHT_HYPHAE = registerBlock("sp5__bluishe_light_hyphae",
            new BluisheLightStemBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block SP5__STRIPPED_BLUISHE_STEM = registerBlock("sp5__stripped_bluishe_stem",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_STEM)
                    .strength(2.0f)));
    public static final Block SP5__STRIPPED_BLUISHE_HYPHAE = registerBlock("sp5__stripped_bluishe_hyphae",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_WARPED_HYPHAE)
                    .strength(2.0f)));
    public static final Block SP5__BLUISHE_PLANKS = registerBlock("sp5__bluishe_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.WARPED_PLANKS)
                    .strength(2.0f)));
    public static final Block SP5__BLUISHE_STAIRS = registerBlock("sp5__bluishe_stairs",
            new ModStairsBlock(ModBlocks.SP5__BLUISHE_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.WARPED_STAIRS)
                    .strength(2.0f)));
    public static final Block SP5__BLUISHE_SLAB = registerBlock("sp5__bluishe_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.WARPED_SLAB)
                    .strength(2.0f)));


    public static final Block FLOGICAL__AZALEA_LOG = registerBlock("flogical__azalea_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.OAK_LOG)
                    .strength(2.0f)));
    public static final Block FLOGICAL__AZALEA_WOOD = registerBlock("flogical__azalea_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.OAK_WOOD)
                    .strength(2.0f)));
    public static final Block FLOGICAL__STRIPPED_AZALEA_LOG = registerBlock("flogical__stripped_azalea_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(2.0f)));
    public static final Block FLOGICAL__STRIPPED_AZALEA_WOOD = registerBlock("flogical__stripped_azalea_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(2.0f)));
    public static final Block FLOGICAL__AZALEA_PLANKS = registerBlock("flogical__azalea_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.OAK_PLANKS)
                    .strength(2.0f)));
    public static final Block FLOGICAL__AZALEA_STAIRS = registerBlock("flogical__azalea_stairs",
            new ModStairsBlock(ModBlocks.FLOGICAL__AZALEA_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.OAK_STAIRS)
                    .strength(2.0f)));
    public static final Block FLOGICAL__AZALEA_SLAB = registerBlock("flogical__azalea_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.OAK_SLAB)
                    .strength(2.0f)));
    //SKYBLOCK - CARVED PLANKS
    public static final Block SKYBLOCK__CARVED_OAK_PLANKS = registerBlock("skyblock__carved_oak_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block SKYBLOCK__CARVED_SPRUCE_PLANKS = registerBlock("skyblock__carved_spruce_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block SKYBLOCK__CARVED_DARK_OAK_PLANKS = registerBlock("skyblock__carved_dark_oak_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS)));
    //SKYBLOCK - CARVED PLANKS
    //SKYBLOCK MAIN-BLOCK
    //MCD
    public static final Block MCD__MOSSIER_COBBLESTONE = registerBlock("mcd__mossier_cobblestone",
            new Block(FabricBlockSettings
                    .copy(Blocks.COBBLESTONE)
                    .strength(2.0F, 6.0F)));
    public static final Block MCD__MOSSIER_OAK_PLANKS = registerBlock("mcd__mossier_oak_planks",
            new MossyOakPlanks(FabricBlockSettings
                    .copy(Blocks.OAK_PLANKS)
                    .strength(2.0f, 3.0f)));
    public static final Block MCD__MOSSIER_SPRUCE_PLANKS = registerBlock("mcd__mossier_spruce_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.SPRUCE_PLANKS)
                    .strength(2.0f, 3.0f)));
    public static final Block MCD__BARREN_GRASS_BLOCK = registerBlock("mcd__barren_grass_block",
            new Block(FabricBlockSettings
                    .copy(Blocks.END_STONE)
                    .instrument(Instrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 9.0F)));
    //MCD
    //PEARFECTION
    public static final Block DIGPEAR__CALLERY_LEAVES = registerBlock("digpear__callery_leaves",
            new Block(FabricBlockSettings
                    .copy(Blocks.AZALEA_LEAVES)));
    public static final Block DIGPEAR__FLOWERING_CALLERY_LEAVES = registerBlock("digpear__flowering_callery_leaves",
            new Block(FabricBlockSettings
                    .copy(Blocks.FLOWERING_AZALEA_LEAVES)));
    public static final Block DIGPEAR__CALLERY_LOG = registerBlock("digpear__callery_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.OAK_LOG)
                    .strength(2.0f)));
    public static final Block DIGPEAR__CALLERY_WOOD = registerBlock("digpear__callery_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.OAK_WOOD)
                    .strength(2.0f)));
    public static final Block DIGPEAR__STRIPPED_CALLERY_LOG = registerBlock("digpear__stripped_callery_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(2.0f)));
    public static final Block DIGPEAR__STRIPPED_CALLERY_WOOD = registerBlock("digpear__stripped_callery_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(2.0f)));
    public static final Block DIGPEAR__CALLERY_PLANKS = registerBlock("digpear__callery_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.OAK_PLANKS)
                    .strength(2.0f)));
    public static final Block DIGPEAR__CALLERY_STAIRS = registerBlock("digpear__callery_stairs",
            new ModStairsBlock(ModBlocks.DIGPEAR__CALLERY_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.OAK_STAIRS)
                    .strength(2.0f)));
    public static final Block DIGPEAR__CALLERY_SLAB = registerBlock("digpear__callery_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.OAK_SLAB)
                    .strength(2.0f)));
    //PEARFECTION
    //QUARK
    public static final Block QUARK__APPLE_CRATE = registerBlock("quark__apple_crate",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block QUARK__BEETROOT_CRATE = registerBlock("quark__beetroot_crate",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block QUARK__CARROT_CRATE = registerBlock("quark__carrot_crate",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block QUARK__POTATO_CRATE = registerBlock("quark__potato_crate",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block QUARK__GOLDEN_APPLE_CRATE = registerBlock("quark__golden_apple_crate",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block QUARK__GOLDEN_CARROT_CRATE = registerBlock("quark__golden_carrot_crate",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block QUARK__SWEET_BERRY_SACK = registerBlock("quark__sweet_berry_sack",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)));
    public static final Block QUARK__GLOW_BERRY_SACK = registerBlock("quark__glow_berry_sack",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)));
    public static final Block QUARK__COCOA_BEAN_SACK = registerBlock("quark__cocoa_bean_sack",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)));
    public static final Block QUARK__GUNPOWDER_SACK = registerBlock("quark__gunpowder_sack",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)));
    public static final Block QUARK__NETHER_WART_SACK = registerBlock("quark__nether_wart_sack",
            new Block(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .strength(1.0f)));
    public static final Block QUARK__STICK_BLOCK = registerBlock("quark__stick_block",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)
                    .strength(1.0f)));
    public static final Block QUARK__SUGAR_CANE_BLOCK = registerBlock("quark__sugar_cane_block",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)
                    .strength(1.0f)));
    public static final Block QUARK__CACTUS_BLOCK = registerBlock("quark__cactus_block",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOL)
                    .strength(1.0f)));
    public static final Block QUARK__CHORUS_FRUIT_BLOCK = registerBlock("quark__chorus_fruit_block",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.HAY_BLOCK)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1.0f)));
    public static final Block QUARK__ANDESITE_PILLAR = registerBlock("quark__andesite_pillar",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.ANDESITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(1.5f, 6.0f)));
    public static final Block QUARK__DIORITE_PILLAR = registerBlock("quark__diorite_pillar",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.DIORITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(1.5f, 6.0f)));
    public static final Block QUARK__GRANITE_PILLAR = registerBlock("quark__granite_pillar",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.GRANITE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(1.5f, 6.0f)));
    public static final Block QUARK__CAVE_ROOTS = registerBlock("quark__cave_roots",
            new VineBlock(FabricBlockSettings
                    .copyOf(Blocks.VINE)
                    .noCollision()
                    .ticksRandomly()
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.VINE)));
    //QUARK - VERTICAL PLANKS
    public static final Block QUARK__VERTICAL_OAK_PLANKS = registerBlock("quark__vertical_oak_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block QUARK__VERTICAL_SPRUCE_PLANKS = registerBlock("quark__vertical_spruce_planks",
            new Block(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block QUARK__VERTICAL_BIRCH_PLANKS = registerBlock("quark__vertical_birch_planks",
            new Block(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block QUARK__VERTICAL_JUNGLE_PLANKS = registerBlock("quark__vertical_jungle_planks",
            new Block(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block QUARK__VERTICAL_ACACIA_PLANKS = registerBlock("quark__vertical_acacia_planks",
            new Block(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block QUARK__VERTICAL_DARK_OAK_PLANKS = registerBlock("quark__vertical_dark_oak_planks",
            new Block(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block QUARK__VERTICAL_MANGROVE_PLANKS = registerBlock("quark__vertical_mangrove_planks",
            new Block(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block QUARK__VERTICAL_CHERRY_PLANKS = registerBlock("quark__vertical_cherry_planks",
            new Block(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block QUARK__VERTICAL_BAMBOO_PLANKS = registerBlock("quark__vertical_bamboo_planks",
            new Block(FabricBlockSettings.copy(Blocks.BAMBOO_PLANKS)));
    public static final Block QUARK__VERTICAL_CRIMSON_PLANKS = registerBlock("quark__vertical_crimson_planks",
            new Block(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block QUARK__VERTICAL_WARPED_PLANKS = registerBlock("quark__vertical_warped_planks",
            new Block(FabricBlockSettings.copy(Blocks.WARPED_PLANKS)));
    //QUARK - VERTICAL PLANKS
    //QUARK
    //HALLOWEEN 2023
    public static final Block H__NODE = registerBlock("h__node",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.OBSIDIAN)));
    //HALLOWEEN 2023

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(SkyBlock.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SkyBlock.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(SkyBlock.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    private static boolean always(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }
    private static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }
    public static void registerModBlocks() {
        SkyBlock.LOGGER.info("Registering Blocks for " + SkyBlock.MOD_ID);
    }
}
