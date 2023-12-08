package net.me.skyblock.blocks_and_items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.archived.ArchivedBlocks;
import net.me.skyblock.archived.ArchivedItems;
import net.me.skyblock.blocks_and_items.items.util.GhostItems;
import net.me.skyblock.blocks_and_items.items.util.NullItem;
import net.me.skyblock.blocks_and_items.items.util.TileBlankItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModCreativeInventoryGroups {
    public static ItemGroup SKYBLOCK = Registry.register(Registries.ITEM_GROUP, new Identifier(SkyBlock.MOD_ID, "citrine"),
            FabricItemGroup.builder().displayName(Text.literal("SkyBlock-Multimod")).icon(() -> new ItemStack(GhostItems.Z__LOGO1)).entries((displayContext, entries) -> {
                entries.add(GhostItems.Z__TILE_SKYBLOCK_1, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(GhostItems.Z__TILE_SKYBLOCK_2, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(GhostItems.Z__TILE_SKYBLOCK_3, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(GhostItems.Z__TILE_SKYBLOCK_4, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(GhostItems.Z__TILE_SKYBLOCK_5, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(GhostItems.Z__TILE_SKYBLOCK_6, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(GhostItems.Z__TILE_SKYBLOCK_7, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(GhostItems.Z__TILE_SKYBLOCK_8, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(GhostItems.Z__TILE_SKYBLOCK_9, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ModItems.SKYBLOCK__ANT_BOTTLE);
                entries.add(ModItems.SKYBLOCK__BOTTLE_OF_ANT_JAM);
                entries.add(ModBlocks.SKYBLOCK__ANT_JAM_BLOCK);
                entries.add(ModBlocks.SKYBLOCK__SUSPICIOUS_COARSE_DIRT);
                entries.add(ModItems.SKYBLOCK__DUCKWEED);
                ModCreativeInventoryGroups.addSpaces(entries, ItemGroup.StackVisibility.PARENT_TAB_ONLY, 0, 4);
                entries.add(ModBlocks.H__NODE);
                entries.add(ModItems.H__NODE_CORE);
                entries.add(ModItems.H__PEARL_OF_DARKNESS);
                entries.add(ModItems.H__PLASMA_1);
                entries.add(ModItems.H__PLASMA_2);
                entries.add(ModItems.H__ANOMALITE_FRAGMENT);
                entries.add(ModItems.H__ANOMALITE_HANDLE);
                entries.add(ModItems.H__ANOMALITE_SWORD);
                entries.add(ModItems.H__ANOMALITE_SWORD1);
                entries.add(ModItems.H__ANOMALITE_SWORD2);
                entries.add(ModItems.H__ANOMALITE_PICKAXE);
                entries.add(ModItems.H__ANOMALITE_PICKAXE1);
                entries.add(ModItems.H__ANOMALITE_PICKAXE2);
                entries.add(ModItems.H__ANOMALITE_HELMET);
                entries.add(ModItems.H__ANOMALITE_CHESTPLATE);
                entries.add(ModItems.H__ANOMALITE_LEGGINGS);
                entries.add(ModItems.H__ANOMALITE_BOOTS);
                ModCreativeInventoryGroups.addSpaces(entries, ItemGroup.StackVisibility.PARENT_TAB_ONLY, 4, 1);
                ModCreativeInventoryGroups.addTiles(entries, ItemGroup.StackVisibility.PARENT_TAB_ONLY, 0, 9);
                entries.add(ModItems.SP5__ENDERITE_INGOT);
                entries.add(ModItems.SP5__ENDERITE_APPLE);
                entries.add(ModItems.SP5__ENCHANTED_ENDERITE_APPLE);
                entries.add(ModItems.SP5__ENDER_STICK);
                entries.add(ModItems.SP5__ENDMERALD);
                entries.add(ModItems.SP5__MELTED_RESIDUES);
                entries.add(ModItems.SP5__ENDERITE_HELMET);
                entries.add(ModItems.SP5__ENDERITE_CHESTPLATE);
                entries.add(ModItems.SP5__ENDERITE_LEGGINGS);
                entries.add(ModItems.SP5__ENDERITE_BOOTS);
                entries.add(ModItems.SP5__ENDERITE_SWORD);
                entries.add(ModItems.SP5__ENDERITE_AXE);
                entries.add(ModItems.SP5__ENDERITE_SHOVEL);
                entries.add(ModItems.SP5__ENDERITE_HOE);
                entries.add(ModItems.SP5__ENDERITE_PICKAXE);
                entries.add(ModBlocks.SP5__ENDMERALD_ORE);
                entries.add(ModBlocks.SP5__ENDMERALD_BLOCK);
                entries.add(ModBlocks.SP5__ENDERITE_ORE);
                entries.add(ModBlocks.SP5__ENDERITE_BLOCK);
                entries.add(ModBlocks.SP5__ASTEROID_RESIDUES);
                entries.add(ModBlocks.SP5__SOLID_ROCK);
                entries.add(ModBlocks.SP5__END_GRASS);
                entries.add(ModBlocks.SP5__BLUISHE_GRASS);
                entries.add(ModBlocks.SP5__TRANSPARENT_BLOCK);
                entries.add(ModBlocks.SP5__END_WART_BLOCK);
                entries.add(ModBlocks.SP5__BLUE_WART);
                entries.add(ModBlocks.SP5__END_STEM);
                entries.add(ModBlocks.SP5__END_HYPHAE);
                entries.add(ModBlocks.SP5__STRIPPED_END_STEM);
                entries.add(ModBlocks.SP5__STRIPPED_END_HYPHAE);
                entries.add(ModBlocks.SP5__END_PLANKS);
                entries.add(ModBlocks.SP5__END_STAIRS);
                entries.add(ModBlocks.SP5__END_SLAB);
                entries.add(ModBlocks.SP5__ENDLIGHT);
                entries.add(ModBlocks.SP5__BLUISHE_STEM);
                entries.add(ModBlocks.SP5__BLUISHE_HYPHAE);
                entries.add(ModBlocks.SP5__BLUISHE_LIGHT_STEM);
                entries.add(ModBlocks.SP5__BLUISHE_LIGHT_HYPHAE);
                entries.add(ModBlocks.SP5__STRIPPED_BLUISHE_STEM);
                entries.add(ModBlocks.SP5__STRIPPED_BLUISHE_HYPHAE);
                entries.add(ModBlocks.SP5__BLUISHE_PLANKS);
                entries.add(ModBlocks.SP5__BLUISHE_STAIRS);
                entries.add(ModBlocks.SP5__BLUISHE_SLAB);
                entries.add(ModBlocks.SP5__END_GRASS_VEGETATION);
                entries.add(ModBlocks.SP5__END_MUSHROOM);
                entries.add(ModBlocks.SP5__BLUISHE_BUSH);
                entries.add(ModBlocks.SP5__BLUISHE_MUSHROOM);
                entries.add(ModBlocks.SP5__END_BUSH);
                entries.add(ModBlocks.SP5__END_FLOWER);
                ModCreativeInventoryGroups.addSpaces(entries, ItemGroup.StackVisibility.PARENT_TAB_ONLY, 5, 5);
                ModCreativeInventoryGroups.addTiles(entries, ItemGroup.StackVisibility.PARENT_TAB_ONLY, 9, 9);
                entries.add(ModBlocks.FLOGICAL__AZALEA_LOG);
                entries.add(ModBlocks.FLOGICAL__AZALEA_WOOD);
                entries.add(ModBlocks.FLOGICAL__STRIPPED_AZALEA_LOG);
                entries.add(ModBlocks.FLOGICAL__STRIPPED_AZALEA_WOOD);
                entries.add(ModBlocks.FLOGICAL__AZALEA_PLANKS);
                entries.add(ModBlocks.FLOGICAL__AZALEA_STAIRS);
                entries.add(ModBlocks.FLOGICAL__AZALEA_SLAB);
                ModCreativeInventoryGroups.addSpaces(entries, ItemGroup.StackVisibility.PARENT_TAB_ONLY, 10, 2);
                ModCreativeInventoryGroups.addTiles(entries, ItemGroup.StackVisibility.PARENT_TAB_ONLY, 18, 9);
                entries.add(ModBlocks.DIGPEAR__CALLERY_LOG);
                entries.add(ModBlocks.DIGPEAR__CALLERY_WOOD);
                entries.add(ModBlocks.DIGPEAR__STRIPPED_CALLERY_LOG);
                entries.add(ModBlocks.DIGPEAR__STRIPPED_CALLERY_WOOD);
                entries.add(ModBlocks.DIGPEAR__CALLERY_PLANKS);
                entries.add(ModBlocks.DIGPEAR__CALLERY_STAIRS);
                entries.add(ModBlocks.DIGPEAR__CALLERY_SLAB);
                entries.add(ModBlocks.DIGPEAR__CALLERY_LEAVES);
                entries.add(ModBlocks.DIGPEAR__FLOWERING_CALLERY_LEAVES);
                ModCreativeInventoryGroups.addTiles(entries, ItemGroup.StackVisibility.PARENT_TAB_ONLY, 27, 9);
            }).build());
    public static ItemGroup MCD = Registry.register(Registries.ITEM_GROUP, new Identifier(SkyBlock.MOD_ID,"minecraft_dungeons"),
            FabricItemGroup.builder().displayName(Text.literal("Sky Block: Minecraft Dungeons (ilosemypotato)")).icon(() -> new ItemStack(GhostItems.Z__LOGO2)).entries((displayContext, entries) -> {
                entries.add(ModItems.MCD__SHORTBOW);
                //entries.add(ModItems.MCD__LONGBOW);
                entries.add(ModItems.MCD__TWIN_BOW);
                entries.add(ModItems.MCD__AUTO_CROSSBOW);
                entries.add(ModItems.MCD__WOODEN_RAPIER);
                entries.add(ModItems.MCD__STONE_RAPIER);
                entries.add(ModItems.MCD__IRON_RAPIER);
                entries.add(ModItems.MCD__GOLDEN_RAPIER);
                entries.add(ModItems.MCD__DIAMOND_RAPIER);
                entries.add(ModItems.MCD__NETHERITE_RAPIER);
                entries.add(ModBlocks.MCD__MOSSIER_COBBLESTONE);
                entries.add(ModBlocks.MCD__MOSSIER_OAK_PLANKS);
                entries.add(ModBlocks.MCD__MOSSIER_SPRUCE_PLANKS);
                entries.add(ModBlocks.MCD__BARREN_GRASS_BLOCK);
                entries.add(ModBlocks.MCD__OG_PURPUR_BLOCK);
                entries.add(ModItems.MCD__ARTIFACT_IRON_HIDE_AMULET);
            }).build());
    public static ItemGroup UNUSED = Registry.register(Registries.ITEM_GROUP, new Identifier(SkyBlock.MOD_ID,"unused"),
            FabricItemGroup.builder().displayName(Text.literal("Sky Block: Unused (Qbaesz13)")).icon(() -> new ItemStack(GhostItems.Z__LOGO5)).entries((displayContext, entries) -> {
                entries.add(ModItems.WITHERSTORM__MUSIC_DISC_WITHERSTORM);
                entries.add(ModItems.WITHERSTORM__DISC_FRAGMENT_WITHERSTORM);
                entries.add(ModItems.SKYBLOCK__FYBERITE);
                entries.add(ModItems.SKYBLOCK__SUGAR_POPPY_MIXTURE);
                entries.add(ModItems.SKYBLOCK__STEAM_DUMPLING_FRESH);
                entries.add(ModItems.SKYBLOCK__STEAM_DUMPLING);
                entries.add(ModItems.SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER);
                entries.add(ModItems.SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER_AND_SUGAR_POPPY_MIXTURE);
                entries.add(ModBlocks.MCD__VOID_BLOCK);
                entries.add(ModBlocks.ABYSS__ABYSS_STONE_OG);
                //entries.add(ModBlocks.STRIPPED_ABYSCULK_LOG);
                //entries.add(ModBlocks.STRIPPED_ABYSCULK_WOOD);
                entries.add(ModBlocks.SKYBLOCK__SWEET_BERRY_JAM_BLOCK);
                entries.add(ModItems.SKYBLOCK__LIGHTNING_SWORD);
                entries.add(ArchivedBlocks.ENDMERALD_ORE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.ENDMERALD_BLOCK, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.ENDERITE_ORE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.ENDERITE_BLOCK, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.ASTEROID_RESIDUES, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.SOLID_ROCK, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.END_GRASS, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.BLUISHE_GRASS, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.ANT_JAM_BLOCK, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.SWEET_BERRY_JAM_BLOCK, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.SUSPICIOUS_COARSE_DIRT, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.TRANSPARENT_BLOCK, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.END_WART_BLOCK, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.BLUE_WART, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.END_STEM, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.END_HYPHAE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.STRIPPED_END_STEM, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.STRIPPED_END_HYPHAE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.ENDLIGHT, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.END_PLANKS, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.END_STAIRS, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.END_SLAB, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.BLUISHE_STEM, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.BLUISHE_HYPHAE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.BLUISHE_LIGHT_STEM, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.BLUISHE_LIGHT_HYPHAE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.STRIPPED_BLUISHE_STEM, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.STRIPPED_BLUISHE_HYPHAE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.BLUISHE_PLANKS, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.BLUISHE_STAIRS, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.BLUISHE_SLAB, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.AZALEA_LOG, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.AZALEA_WOOD, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.STRIPPED_AZALEA_LOG, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.STRIPPED_AZALEA_WOOD, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.AZALEA_PLANKS, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.AZALEA_STAIRS, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.AZALEA_SLAB, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.MOSSIER_COBBLESTONE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.MOSSIER_OAK_PLANKS, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.MOSSIER_SPRUCE_PLANKS, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.APPLE_CRATE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.BEETROOT_CRATE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.CARROT_CRATE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.POTATO_CRATE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.GOLDEN_APPLE_CRATE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.GOLDEN_CARROT_CRATE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.SWEET_BERRY_SACK, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.GLOW_BERRY_SACK, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.COCOA_BEANS_SACK, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.GUNPOWDER_SACK, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.NETHER_WART_SACK, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.STICK_BLOCK, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.SUGAR_CANE_BLOCK, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.CACTUS_BLOCK, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.CHORUS_FRUIT_BLOCK, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.ANDESITE_PILLAR, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.DIORITE_PILLAR, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.GRANITE_PILLAR, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedBlocks.CAVE_ROOTS, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedItems.ANT_BOTTLE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedItems.BOTTLE_OF_ANT_JAM, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedItems.MUSIC_DISC_WITHERSTORM, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedItems.DISC_FRAGMENT_WITHERSTORM, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedItems.ENDERITE_APPLE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedItems.ENCHANTED_ENDERITE_APPLE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedItems.ENDER_STICK, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedItems.ENDMERALD, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedItems.MELTE_RESIDUES, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedItems.ENDERITE_INGOT, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedItems.ENDERITE_HELMET, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedItems.ENDERITE_CHESTPLATE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedItems.ENDERITE_LEGGINGS, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedItems.ENDERITE_BOOTS, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedItems.ENDERITE_SWORD, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedItems.ENDERITE_AXE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedItems.ENDERITE_SHOVEL, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedItems.ENDERITE_HOE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ArchivedItems.ENDERITE_PICKAXE, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
            }).build());
    public static ItemGroup ABYSS = Registry.register(Registries.ITEM_GROUP, new Identifier(SkyBlock.MOD_ID,"classified"),
            FabricItemGroup.builder().displayName(Text.literal("The Abyss Chapter II: Feature (Y3Z0N)")).icon(() -> new ItemStack(GhostItems.Z__LOGO3)).entries((displayContext, entries) -> {
                entries.add(ModItems.ABYSS__ABERYTHE_GEM);
                entries.add(ModItems.ABYSS__ABERYTHE_HELMET);
                entries.add(ModItems.ABYSS__ABERYTHE_CHESTPLATE);
                entries.add(ModItems.ABYSS__ABERYTHE_LEGGINGS);
                entries.add(ModItems.ABYSS__ABERYTHE_BOOTS);
                entries.add(ModItems.ABYSS__ABERYTHE_SWORD);
                entries.add(ModItems.ABYSS__ABERYTHE_AXE);
                entries.add(ModItems.ABYSS__ABERYTHE_SHOVEL);
                entries.add(ModItems.ABYSS__ABERYTHE_HOE);
                entries.add(ModItems.ABYSS__ABERYTHE_PICKAXE);
                entries.add(ModItems.ABYSS__LORAN);
                entries.add(ModItems.ABYSS__ABYSS_PORTAL_ACTIVATOR);
                entries.add(ModBlocks.ABYSS__UNSTABLE_OBSIDIAN);
                entries.add(ModBlocks.ABYSS__ABYSS_DIRT);
                entries.add(ModBlocks.ABYSS__ROMA_MUD);
                entries.add(ModBlocks.ABYSS__ROMA_MUD_CURSED);
                entries.add(ModBlocks.ABYSS__ABYSS_GRAVEL);
                entries.add(ModBlocks.ABYSS__INFECTED_PEAT);
                entries.add(ModBlocks.ABYSS__STONE_RACKLE);
                entries.add(ModBlocks.ABYSS__BLARU_MOSS);
                entries.add(ModBlocks.ABYSS__GLOWING_BLARU_MOSS);
                entries.add(ModBlocks.ABYSS__BLARU_GRASS);
                entries.add(ModBlocks.ABYSS__ABYSS_SPORES);
                entries.add(ModBlocks.ABYSS__TESLA_FLOWER);
                entries.add(ModBlocks.ABYSS__VIGILANT_VERSA);
                entries.add(ModBlocks.ABYSS__EXOLIUS_MAXIMUS);
                entries.add(ModBlocks.ABYSS__YOUNG_EXOLIUS_MAXIMUS);
                entries.add(ModBlocks.ABYSS__VIGILANT_GRASS);
                entries.add(ModBlocks.ABYSS__BLUE_VIGILANT_GRASS);
                entries.add(ModBlocks.ABYSS__VIGILANT_MOSS);
                entries.add(ModBlocks.ABYSS__INFUSED_MAGMA);
                entries.add(ModBlocks.ABYSS__ABYSS_STONE);
                entries.add(ModBlocks.ABYSS__ABYSS_DIAMOND_ORE);
                entries.add(ModBlocks.ABYSS__ABYSS_EMERALD_ORE);
                entries.add(ModBlocks.ABYSS__ABYSS_GOLD_ORE);
                entries.add(ModBlocks.ABYSS__ABYSS_IRON_ORE);
                entries.add(ModBlocks.ABYSS__ABYSS_IGNISITHE_ORE);
                entries.add(ModBlocks.ABYSS__ABYSS_ABERYTHE_ORE);
                entries.add(ModBlocks.ABYSS__ABYSS_ABORANYS_ORE);
                entries.add(ModBlocks.ABYSS__ABYSS_FUSION_ORE);
                entries.add(ModBlocks.ABYSS__ABYSS_GARNITE_ORE);
                entries.add(ModBlocks.ABYSS__ABYSS_GLACERYTHE_ORE);
                entries.add(ModBlocks.ABYSS__ABYSS_INCORYTHE_ORE);
                entries.add(ModBlocks.ABYSS__ABYSS_LORAN_ORE);
                entries.add(ModBlocks.ABYSS__PURPLE_SHROOMLIGHT);
                entries.add(ModBlocks.ABYSS__DARK_BLUE_SHROOMLIGHT);
                entries.add(ModBlocks.ABYSS__BLUE_SHROOMLIGHT);
                entries.add(ModBlocks.ABYSS__ABYSS_JUNGLE_LOG);
                entries.add(ModBlocks.ABYSS__ABYSS_JUNGLE_WOOD);
                entries.add(ModBlocks.ABYSS__STRIPPED_ABYSS_JUNGLE_LOG);
                entries.add(ModBlocks.ABYSS__STRIPPED_ABYSS_JUNGLE_WOOD);
                entries.add(ModBlocks.ABYSS__ABYSS_JUNGLE_PLANKS);
                entries.add(ModBlocks.ABYSS__ABYSS_JUNGLE_STAIRS);
                entries.add(ModBlocks.ABYSS__ABYSS_JUNGLE_SLAB);
                entries.add(ModBlocks.ABYSS__ABYSS_JUNGLE_LEAVES);
                entries.add(ModBlocks.ABYSS__BLARU_LOG);
                entries.add(ModBlocks.ABYSS__BLARU_WOOD);
                entries.add(ModBlocks.ABYSS__STRIPPED_BLARU_LOG);
                entries.add(ModBlocks.ABYSS__STRIPPED_BLARU_WOOD);
                entries.add(ModBlocks.ABYSS__BLARU_PLANKS);
                entries.add(ModBlocks.ABYSS__BLARU_STAIRS);
                entries.add(ModBlocks.ABYSS__BLARU_SLAB);
                entries.add(ModBlocks.ABYSS__BLARU_LEAVES);
                entries.add(ModBlocks.ABYSS__FROZEN_LOG);
                entries.add(ModBlocks.ABYSS__FROZEN_WOOD);
                entries.add(ModBlocks.ABYSS__STRIPPED_FROZEN_LOG);
                entries.add(ModBlocks.ABYSS__STRIPPED_FROZEN_WOOD);
                entries.add(ModBlocks.ABYSS__FROZEN_PLANKS);
                entries.add(ModBlocks.ABYSS__FROZEN_STAIRS);
                entries.add(ModBlocks.ABYSS__FROZEN_SLAB);
                entries.add(ModBlocks.ABYSS__FROZEN_LEAVES);
                entries.add(ModBlocks.ABYSS__SLIMED_LOG);
                entries.add(ModBlocks.ABYSS__SLIMED_WOOD);
                entries.add(ModBlocks.ABYSS__STRIPPED_SLIMED_LOG);
                entries.add(ModBlocks.ABYSS__STRIPPED_SLIMED_WOOD);
                entries.add(ModBlocks.ABYSS__SLIMED_PLANKS);
                entries.add(ModBlocks.ABYSS__SLIMED_STAIRS);
                entries.add(ModBlocks.ABYSS__SLIMED_SLAB);
                entries.add(ModBlocks.ABYSS__ABYSS_SLIME_BLOCK);
                entries.add(ModBlocks.ABYSS__VIGILANT_LOG);
                entries.add(ModBlocks.ABYSS__VIGILANT_WOOD);
                entries.add(ModBlocks.ABYSS__STRIPPED_VIGILANT_LOG);
                entries.add(ModBlocks.ABYSS__STRIPPED_VIGILANT_WOOD);
                entries.add(ModBlocks.ABYSS__VIGILANT_PLANKS);
                entries.add(ModBlocks.ABYSS__VIGILANT_STAIRS);
                entries.add(ModBlocks.ABYSS__VIGILANT_SLAB);
                entries.add(ModBlocks.ABYSS__VIGILANT_LEAVES);
                entries.add(ModBlocks.ABYSS__BOG_SHROOM_LOG);
                entries.add(ModBlocks.ABYSS__BOG_SHROOM_WOOD);
                entries.add(ModBlocks.ABYSS__STRIPPED_BOG_SHROOM_LOG);
                entries.add(ModBlocks.ABYSS__STRIPPED_BOG_SHROOM_WOOD);
                entries.add(ModBlocks.ABYSS__BOG_SHROOM_PLANKS);
                entries.add(ModBlocks.ABYSS__BOG_SHROOM_STAIRS);
                entries.add(ModBlocks.ABYSS__BOG_SHROOM_SLAB);
                entries.add(ModBlocks.ABYSS__BOG_SHROOM_LEAVES);
                entries.add(ModBlocks.ABYSS__SAL_SHROOM_LOG);
                entries.add(ModBlocks.ABYSS__SAL_SHROOM_WOOD);
                entries.add(ModBlocks.ABYSS__STRIPPED_SAL_SHROOM_LOG);
                entries.add(ModBlocks.ABYSS__STRIPPED_SAL_SHROOM_WOOD);
                entries.add(ModBlocks.ABYSS__SAL_SHROOM_PLANKS);
                entries.add(ModBlocks.ABYSS__SAL_SHROOM_STAIRS);
                entries.add(ModBlocks.ABYSS__SAL_SHROOM_SLAB);
                entries.add(ModBlocks.ABYSS__SAL_SHROOM_LEAVES);
                entries.add(ModBlocks.ABYSS__ABYSCULK_LOG);
                entries.add(ModBlocks.ABYSS__ABYSCULK_WOOD);
                entries.add(ModBlocks.ABYSS__ABYSCULK_PLANKS);
                entries.add(ModBlocks.ABYSS__ABYSCULK_STAIRS);
                entries.add(ModBlocks.ABYSS__ABYSCULK_SLAB);
            }).build());
    public static ItemGroup QUARK = Registry.register(Registries.ITEM_GROUP, new Identifier(SkyBlock.MOD_ID,"quark"),
            FabricItemGroup.builder().displayName(Text.literal("Quark: Features (Vazkii)")).icon(() -> new ItemStack(GhostItems.Z__LOGO4)).entries((displayContext, entries) -> {
                entries.add(ModBlocks.QUARK__APPLE_CRATE);
                entries.add(ModBlocks.QUARK__BEETROOT_CRATE);
                entries.add(ModBlocks.QUARK__CARROT_CRATE);
                entries.add(ModBlocks.QUARK__POTATO_CRATE);
                entries.add(ModBlocks.QUARK__GOLDEN_APPLE_CRATE);
                entries.add(ModBlocks.QUARK__GOLDEN_CARROT_CRATE);
                entries.add(ModBlocks.QUARK__SWEET_BERRY_SACK);
                entries.add(ModBlocks.QUARK__GLOW_BERRY_SACK);
                entries.add(ModBlocks.QUARK__COCOA_BEAN_SACK);
                entries.add(ModBlocks.QUARK__GUNPOWDER_SACK);
                entries.add(ModBlocks.QUARK__NETHER_WART_SACK);
                entries.add(ModBlocks.QUARK__STICK_BLOCK);
                entries.add(ModBlocks.QUARK__SUGAR_CANE_BLOCK);
                entries.add(ModBlocks.QUARK__CACTUS_BLOCK);
                entries.add(ModBlocks.QUARK__CHORUS_FRUIT_BLOCK);
                entries.add(ModBlocks.QUARK__ANDESITE_PILLAR);
                entries.add(ModBlocks.QUARK__DIORITE_PILLAR);
                entries.add(ModBlocks.QUARK__GRANITE_PILLAR);
                entries.add(ModBlocks.QUARK__CAVE_ROOTS);
            }).build());

    public static void registerItemGroups() {}
    private static void addSpaces(ItemGroup.Entries entries, ItemGroup.StackVisibility visibility, int used_spaces, int spaces) {
        for (byte b : NullItem.VALUES) {
            if (spaces != 0) {
                ItemStack itemStack = new ItemStack(GhostItems.Z__NULL);
                NullItem.setSpaces(itemStack, (byte) (used_spaces + b));
                spaces = spaces-1;
            entries.add(itemStack, visibility);
            }
        }
    }
    private static void addTiles(ItemGroup.Entries entries, ItemGroup.StackVisibility visibility, int used_tiles, int tiles) {
        for (byte b : NullItem.VALUES) {
            if (tiles != 0) {
                ItemStack itemStack = new ItemStack(GhostItems.Z__TILE_BLANK);
                TileBlankItem.setTiles(itemStack, (byte) (used_tiles + b));
                tiles = tiles-1;
                entries.add(itemStack, visibility);
            }
        }
    }
}
