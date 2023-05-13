package net.me.skyblock.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.block.custom.AbyssVegetation;
import net.me.skyblock.block.custom.BlueVigilantGrass;
import net.me.skyblock.block.custom.SuspiciousCoarseDirt;
import net.me.skyblock.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block VOID_BLOCK = registerBlock("void_block",
            new Block(FabricBlockSettings.of(Material.SCULK).strength(3.0f)), ModItemGroup.UNUSED);



    //ABYSS
    public static final Block UNSTABLE_OBSIDIAN = registerBlock("unstable_obsidian",
            new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN).strength(50.0f, 1200.0f).requiresTool().luminance(state -> 10)), ModItemGroup.ABYSS);
    public static final Block ABYSS_DIRT = registerBlock("abyss_dirt",
            new Block(FabricBlockSettings.copy(Blocks.DIRT).sounds(BlockSoundGroup.MUD).strength(0.5f)), ModItemGroup.ABYSS);
    public static final Block BLARU_MOSS = registerBlock("blaru_moss",
            new Block(FabricBlockSettings.copy(Blocks.DIRT).sounds(BlockSoundGroup.ROOTED_DIRT).strength(0.5f)), ModItemGroup.ABYSS);
    public static final Block BLARU_GRASS = registerBlock("blaru_grass",
            new AbyssVegetation(FabricBlockSettings.copy(Blocks.NETHER_SPROUTS).sounds(BlockSoundGroup.NETHER_SPROUTS)), ModItemGroup.ABYSS);
    public static final Block ABYSS_SPORES = registerBlock("abyss_spores",
            new AbyssVegetation(FabricBlockSettings.copy(Blocks.WARPED_ROOTS).sounds(BlockSoundGroup.ROOTS)), ModItemGroup.ABYSS);
    public static final Block VIGILANT_VERSA = registerBlock("vigilant_versa",
            new AbyssVegetation(FabricBlockSettings.copy(Blocks.WARPED_ROOTS).sounds(BlockSoundGroup.ROOTS).luminance(state -> 7)), ModItemGroup.ABYSS);
    public static final Block EXOLIUS_MAXIMUS = registerBlock("exolius_maximus",
            new AbyssVegetation(FabricBlockSettings.copy(Blocks.NETHER_SPROUTS).sounds(BlockSoundGroup.ROOTS).luminance(state -> 5)), ModItemGroup.ABYSS);
    public static final Block YOUNG_EXOLIUS_MAXIMUS = registerBlock("young_exolius_maximus",
            new AbyssVegetation(FabricBlockSettings.copy(Blocks.NETHER_SPROUTS).sounds(BlockSoundGroup.ROOTS).luminance(state -> 5)), ModItemGroup.ABYSS);
    public static final Block VIGILANT_GRASS = registerBlock("vigilant_grass",
            new AbyssVegetation(FabricBlockSettings.copy(Blocks.NETHER_SPROUTS).sounds(BlockSoundGroup.NETHER_SPROUTS)), ModItemGroup.ABYSS);
    public static final Block BLUE_VIGILANT_GRASS = registerBlock("blue_vigilant_grass",
            new BlueVigilantGrass(FabricBlockSettings.copy(Blocks.NETHER_SPROUTS).sounds(BlockSoundGroup.ROOTS).luminance(state -> state.get(BlueVigilantGrass.LIT) ? 10 : 6)), ModItemGroup.ABYSS);
    public static final Block VIGILANT_MOSS = registerBlock("vigilant_moss",
            new Block(FabricBlockSettings.copy(Blocks.DIRT).sounds(BlockSoundGroup.ROOTED_DIRT).strength(0.5f)), ModItemGroup.ABYSS);
    public static final Block ABYSS_STONE = registerBlock("abyss_stone",
            new Block(FabricBlockSettings.copy(Blocks.STONE).strength(1.5f, 6.0f).requiresTool()), ModItemGroup.ABYSS);
    public static final Block ABYSS_DIAMOND_ORE = registerBlock("abyss_diamond_ore",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_ORE).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.ABYSS);
    public static final Block ABYSS_EMERALD_ORE = registerBlock("abyss_emerald_ore",
            new Block(FabricBlockSettings.copy(Blocks.EMERALD_ORE).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.ABYSS);
    public static final Block ABYSS_GOLD_ORE = registerBlock("abyss_gold_ore",
            new Block(FabricBlockSettings.copy(Blocks.GOLD_ORE).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.ABYSS);
    public static final Block ABYSS_IRON_ORE = registerBlock("abyss_iron_ore",
            new Block(FabricBlockSettings.copy(Blocks.IRON_ORE).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.ABYSS);




    public static final Block ABYSS_JUNGLE_LOG = registerBlock("abyss_jungle_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.WARPED_STEM).strength(2.0f)), ModItemGroup.ABYSS);
    public static final Block ABYSS_JUNGLE_WOOD = registerBlock("abyss_jungle_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.WARPED_HYPHAE).strength(2.0f)), ModItemGroup.ABYSS);
    public static final Block STRIPPED_ABYSS_JUNGLE_LOG = registerBlock("stripped_abyss_jungle_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_WARPED_STEM).strength(2.0f)), ModItemGroup.ABYSS);
    public static final Block STRIPPED_ABYSS_JUNGLE_WOOD = registerBlock("stripped_abyss_jungle_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_WARPED_HYPHAE).strength(2.0f)), ModItemGroup.ABYSS);
    public static final Block ABYSS_JUNGLE_LEAVES = registerBlock("abyss_jungle_leaves",
            new Block(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.ABYSS);
    public static final Block ABYSS_JUNGLE_PLANKS = registerBlock("abyss_jungle_planks",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS).strength(2.0f)), ModItemGroup.ABYSS);




    public static final Block BLARU_LOG = registerBlock("blaru_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.WARPED_STEM).strength(2.0f)), ModItemGroup.ABYSS);
    public static final Block BLARU_WOOD = registerBlock("blaru_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.WARPED_HYPHAE).strength(2.0f)), ModItemGroup.ABYSS);
    public static final Block STRIPPED_BLARU_LOG = registerBlock("stripped_blaru_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_WARPED_STEM).strength(2.0f)), ModItemGroup.ABYSS);
    public static final Block STRIPPED_BLARU_WOOD = registerBlock("stripped_blaru_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_WARPED_HYPHAE).strength(2.0f)), ModItemGroup.ABYSS);
    public static final Block BLARU_LEAVES = registerBlock("blaru_leaves",
            new Block(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.ABYSS);
    public static final Block BLARU_PLANKS = registerBlock("blaru_planks",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS).strength(2.0f)), ModItemGroup.ABYSS);



    public static final Block BOG_SHROOM_LOG = registerBlock("bog_shroom_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.WARPED_STEM).strength(2.0f)), ModItemGroup.ABYSS);
    public static final Block BOG_SHROOM_WOOD = registerBlock("bog_shroom_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.WARPED_HYPHAE).strength(2.0f)), ModItemGroup.ABYSS);
    public static final Block STRIPPED_BOG_SHROOM_LOG = registerBlock("stripped_bog_shroom_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_WARPED_STEM).strength(2.0f)), ModItemGroup.ABYSS);
    public static final Block STRIPPED_BOG_SHROOM_WOOD = registerBlock("stripped_bog_shroom_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_WARPED_HYPHAE).strength(2.0f)), ModItemGroup.ABYSS);
    public static final Block BOG_SHROOM_LEAVES = registerBlock("bog_shroom_leaves",
            new Block(FabricBlockSettings.copy(Blocks.BRAIN_CORAL_BLOCK).luminance(state -> 10)), ModItemGroup.ABYSS);
    public static final Block BOG_SHROOM_PLANKS = registerBlock("bog_shroom_planks",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS).strength(2.0f)), ModItemGroup.ABYSS);
    //ABYSS



    //MATERIALS
    public static final Block ENDMERALD_ORE = registerBlock("end_emerald_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.FYBERITE);
    public static final Block ENDMERALD_BLOCK = registerBlock("end_emerald_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.FYBERITE);
    public static final Block ENDERITE_ORE = registerBlock("enderite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.FYBERITE);
    public static final Block ENDERITE_BLOCK = registerBlock("enderite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.FYBERITE);
    public static final Block ASTEROID_RESIDUES = registerBlock("asteroid_residues",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.FYBERITE);
    //MATERIALS
    public static final Block SOLID_ROCK = registerBlock("solid_rock",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.FYBERITE);
    //END VEGETATION
    public static final Block END_GRASS = registerBlock("end_grass",
            new Block(FabricBlockSettings.copy(Blocks.END_STONE).sounds(BlockSoundGroup.GRASS).strength(2.0f).requiresTool()), ModItemGroup.FYBERITE);
    public static final Block BLUISHE_GRASS = registerBlock("bluishe_end_stone",
            new Block(FabricBlockSettings.copy(Blocks.END_STONE).strength(3.0f).requiresTool()), ModItemGroup.FYBERITE);
    //END VEGETATION
    public static final Block ANT_JAM_BLOCK = registerBlock("ant_jam_block",
            new HoneyBlock(FabricBlockSettings.copy(Blocks.HONEY_BLOCK).strength(0.01f)), ModItemGroup.FYBERITE);
    public static final Block SUSPICIOUS_COARSE_DIRT = registerBlock("suspicious_coarse_dirt",
            new SuspiciousCoarseDirt(FabricBlockSettings.copy(Blocks.COARSE_DIRT).strength(0.5f).luminance(state -> state.get(SuspiciousCoarseDirt.ANT) ? 0 : 0)), ModItemGroup.FYBERITE);
    //END WARTS
    public static final Block TRANSPARENT_BLOCK = registerBlock("transparent_block",
            new GlassBlock(FabricBlockSettings.copy(Blocks.BLACK_STAINED_GLASS).sounds(BlockSoundGroup.WART_BLOCK).strength(0.5f)), ModItemGroup.FYBERITE);
    public static final Block END_WART_BLOCK = registerBlock("end_wart_block",
            new GlassBlock(FabricBlockSettings.copy(Blocks.BLACK_STAINED_GLASS).sounds(BlockSoundGroup.WART_BLOCK).strength(1.0f)), ModItemGroup.FYBERITE);
    public static final Block BLUE_WART = registerBlock("blue_wart",
            new GlassBlock(FabricBlockSettings.copy(Blocks.BLACK_STAINED_GLASS).sounds(BlockSoundGroup.MOSS_BLOCK).strength(0.5f)), ModItemGroup.FYBERITE);
    //END WARTS
    //END TREE
    public static final Block END_STEM = registerBlock("end_stem",
            new PillarBlock(FabricBlockSettings.copy(Blocks.CRIMSON_STEM).strength(2.0f)), ModItemGroup.FYBERITE);
    public static final Block END_HYPHAE = registerBlock("end_hyphae",
            new PillarBlock(FabricBlockSettings.copy(Blocks.CRIMSON_HYPHAE).strength(2.0f)), ModItemGroup.FYBERITE);
    public static final Block STRIPPED_END_STEM = registerBlock("stripped_end_stem",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_CRIMSON_STEM).strength(2.0f)), ModItemGroup.FYBERITE);
    public static final Block STRIPPED_END_HYPHAE = registerBlock("stripped_end_hyphae",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).strength(2.0f)), ModItemGroup.FYBERITE);
    public static final Block ENDLIGHT = registerBlock("endlight",
            new Block(FabricBlockSettings.copy(Blocks.SHROOMLIGHT).strength(1.0f)), ModItemGroup.FYBERITE);
    public static final Block END_PLANKS = registerBlock("end_planks",
            new Block(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS).strength(2.0f)), ModItemGroup.FYBERITE);
    //END TREE
    //AZALEA TREE
    public static final Block AZALEA_LOG = registerBlock("azalea_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(2.0f)), ModItemGroup.FYBERITE);
    public static final Block AZALEA_WOOD = registerBlock("azalea_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(2.0f)), ModItemGroup.FYBERITE);
    public static final Block STRIPPED_AZALEA_LOG = registerBlock("stripped_azalea_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0f)), ModItemGroup.FYBERITE);
    public static final Block STRIPPED_AZALEA_WOOD = registerBlock("stripped_azalea_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0f)), ModItemGroup.FYBERITE);
    public static final Block AZALEA_PLANKS = registerBlock("azalea_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(2.0f)), ModItemGroup.FYBERITE);
    //AZALEA TREE

    //MCD
    public static final Block MOSSIER_COBBLESTONE = registerBlock("mossier_cobblestone",
            new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).strength(2.0F, 6.0F)), ModItemGroup.MCD);
    //MCD
    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(SkyBlock.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(SkyBlock.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(SkyBlock.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    public static void registerModBlocks() {
        SkyBlock.LOGGER.info("Registering ModBlocks for " + SkyBlock.MOD_ID);
    }
}
