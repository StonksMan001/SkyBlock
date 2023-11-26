package net.me.skyblock.blocks_and_items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.blocks_and_items.items.util.NullItem;
import net.me.skyblock.blocks_and_items.items.util.TileBlankItem;
import net.minecraft.item.FireworkRocketItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModCreativeInventoryGroups {
    public static ItemGroup SKYBLOCK = Registry.register(Registries.ITEM_GROUP, new Identifier(SkyBlock.MOD_ID, "citrine"),
            FabricItemGroup.builder().displayName(Text.literal("SkyBlock-Multimod")).icon(() -> new ItemStack(ModItems.Z__LOGO1)).entries((displayContext, entries) -> {
                entries.add(ModItems.Z__TILE_SKYBLOCK_1, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ModItems.Z__TILE_SKYBLOCK_2, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ModItems.Z__TILE_SKYBLOCK_3, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ModItems.Z__TILE_SKYBLOCK_4, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ModItems.Z__TILE_SKYBLOCK_5, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ModItems.Z__TILE_SKYBLOCK_6, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ModItems.Z__TILE_SKYBLOCK_7, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ModItems.Z__TILE_SKYBLOCK_8, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ModItems.Z__TILE_SKYBLOCK_9, ItemGroup.StackVisibility.PARENT_TAB_ONLY);
                entries.add(ModItems.BOTTLE_OF_ANT_JAM);
                entries.add(ModBlocks.ANT_JAM_BLOCK);
                entries.add(ModBlocks.SUSPICIOUS_COARSE_DIRT);
                ModCreativeInventoryGroups.addSpaces(entries, ItemGroup.StackVisibility.PARENT_TAB_ONLY, 0, 6);
                ModCreativeInventoryGroups.addTiles(entries, ItemGroup.StackVisibility.PARENT_TAB_ONLY, 0, 9);
                entries.add(ModItems.ENDERITE_INGOT);
                entries.add(ModItems.ENDERITE_APPLE);
                entries.add(ModItems.ENCHANTED_ENDERITE_APPLE);
                entries.add(ModItems.ENDER_STICK);
                entries.add(ModItems.ENDMERALD);
                entries.add(ModItems.MELTE_RESIDUES);
                entries.add(ModItems.ENDERITE_HELMET);
                entries.add(ModItems.ENDERITE_CHESTPLATE);
                entries.add(ModItems.ENDERITE_LEGGINGS);
                entries.add(ModItems.ENDERITE_BOOTS);
                entries.add(ModItems.ENDERITE_SWORD);
                entries.add(ModItems.ENDERITE_AXE);
                entries.add(ModItems.ENDERITE_SHOVEL);
                entries.add(ModItems.ENDERITE_HOE);
                entries.add(ModItems.ENDERITE_PICKAXE);
                entries.add(ModBlocks.ENDMERALD_ORE);
                entries.add(ModBlocks.ENDMERALD_BLOCK);
                entries.add(ModBlocks.ENDERITE_ORE);
                entries.add(ModBlocks.ENDERITE_BLOCK);
                entries.add(ModBlocks.ASTEROID_RESIDUES);
                entries.add(ModBlocks.SOLID_ROCK);
                entries.add(ModBlocks.END_GRASS);
                entries.add(ModBlocks.BLUISHE_GRASS);
                entries.add(ModBlocks.TRANSPARENT_BLOCK);
                entries.add(ModBlocks.END_WART_BLOCK);
                entries.add(ModBlocks.BLUE_WART);
                entries.add(ModBlocks.END_STEM);
                entries.add(ModBlocks.END_HYPHAE);
                entries.add(ModBlocks.STRIPPED_END_STEM);
                entries.add(ModBlocks.STRIPPED_END_HYPHAE);
                entries.add(ModBlocks.END_PLANKS);
                entries.add(ModBlocks.END_STAIRS);
                entries.add(ModBlocks.END_SLAB);
                entries.add(ModBlocks.ENDLIGHT);
                entries.add(ModBlocks.BLUISHE_STEM);
                entries.add(ModBlocks.BLUISHE_HYPHAE);
                entries.add(ModBlocks.BLUISHE_LIGHT_STEM);
                entries.add(ModBlocks.BLUISHE_LIGHT_HYPHAE);
                entries.add(ModBlocks.STRIPPED_BLUISHE_STEM);
                entries.add(ModBlocks.STRIPPED_BLUISHE_HYPHAE);
                entries.add(ModBlocks.BLUISHE_PLANKS);
                entries.add(ModBlocks.BLUISHE_STAIRS);
                entries.add(ModBlocks.BLUISHE_SLAB);
                entries.add(ModBlocks.AZALEA_LOG);
                entries.add(ModBlocks.AZALEA_WOOD);
                entries.add(ModBlocks.STRIPPED_AZALEA_LOG);
                entries.add(ModBlocks.STRIPPED_AZALEA_WOOD);
                entries.add(ModBlocks.AZALEA_PLANKS);
                entries.add(ModBlocks.AZALEA_STAIRS);
                entries.add(ModBlocks.AZALEA_SLAB);
                entries.add(ModBlocks.END_GRASS_VEGETATION);
                entries.add(ModBlocks.END_MUSHROOM);
                entries.add(ModBlocks.BLUISHE_BUSH);
                entries.add(ModBlocks.BLUISHE_MUSHROOM);
                entries.add(ModBlocks.END_BUSH);
                entries.add(ModBlocks.END_FLOWER);
                ModCreativeInventoryGroups.addSpaces(entries, ItemGroup.StackVisibility.PARENT_TAB_ONLY, 6, 7);
                ModCreativeInventoryGroups.addTiles(entries, ItemGroup.StackVisibility.PARENT_TAB_ONLY, 9, 9);
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
                ModCreativeInventoryGroups.addSpaces(entries, ItemGroup.StackVisibility.PARENT_TAB_ONLY, 13, 1);
                ModCreativeInventoryGroups.addTiles(entries, ItemGroup.StackVisibility.PARENT_TAB_ONLY, 18, 9);
            }).build());
    public static ItemGroup MCD = Registry.register(Registries.ITEM_GROUP, new Identifier(SkyBlock.MOD_ID,"minecraft_dungeons"),
            FabricItemGroup.builder().displayName(Text.literal("Sky Block: Minecraft Dungeons (ilosemypotato)")).icon(() -> new ItemStack(ModItems.Z__LOGO2)).entries((displayContext, entries) -> {
                entries.add(ModItems.SHORTBOW);
                //entries.add(ModItems.LONGBOW);
                entries.add(ModItems.TWIN_BOW);
                entries.add(ModItems.AUTO_CROSSBOW);
                entries.add(ModItems.WOODEN_RAPIER);
                entries.add(ModItems.STONE_RAPIER);
                entries.add(ModItems.IRON_RAPIER);
                entries.add(ModItems.GOLDEN_RAPIER);
                entries.add(ModItems.DIAMOND_RAPIER);
                entries.add(ModItems.NETHERITE_RAPIER);
                entries.add(ModBlocks.MOSSIER_COBBLESTONE);
                entries.add(ModBlocks.MOSSIER_OAK_PLANKS);
                entries.add(ModBlocks.MOSSIER_SPRUCE_PLANKS);
                entries.add(ModBlocks.BARREN_GRASS_BLOCK);
                entries.add(ModBlocks.OG_PURPUR_BLOCK);
                entries.add(ModItems.MCD__ARTIFACT_IRON_HIDE_AMULET);
            }).build());
    public static ItemGroup UNUSED = Registry.register(Registries.ITEM_GROUP, new Identifier(SkyBlock.MOD_ID,"unused"),
            FabricItemGroup.builder().displayName(Text.literal("Sky Block: Unused (Qbaesz13)")).icon(() -> new ItemStack(ModItems.Z__LOGO5)).entries((displayContext, entries) -> {
                entries.add(ModItems.MUSIC_DISC_WITHERSTORM);
                entries.add(ModItems.DISC_FRAGMENT_WITHERSTORM);
                entries.add(ModItems.FYBERITE);
                entries.add(ModItems.SUGAR_POPPY_MIXTURE);
                entries.add(ModItems.STEAM_DUMPLING_FRESH);
                entries.add(ModItems.STEAM_DUMPLING);
                entries.add(ModItems.STEAM_DUMPLING_WITH_MOLTEN_BUTTER);
                entries.add(ModItems.STEAM_DUMPLING_WITH_MOLTEN_BUTTER_AND_SUGAR_POPPY_MIXTURE);
                entries.add(ModBlocks.VOID_BLOCK);
                entries.add(ModBlocks.ABYSS_STONE_OG);
                //entries.add(ModBlocks.STRIPPED_ABYSCULK_LOG);
                //entries.add(ModBlocks.STRIPPED_ABYSCULK_WOOD);
                entries.add(ModBlocks.SWEET_BERRY_JAM_BLOCK);
                entries.add(ModItems.LIGHTNING_SWORD);
            }).build());
    public static ItemGroup ABYSS = Registry.register(Registries.ITEM_GROUP, new Identifier(SkyBlock.MOD_ID,"classified"),
            FabricItemGroup.builder().displayName(Text.literal("The Abyss Chapter II: Feature (Y3Z0N)")).icon(() -> new ItemStack(ModItems.Z__LOGO3)).entries((displayContext, entries) -> {
                entries.add(ModItems.ABERYTHE_GEM);
                entries.add(ModItems.ABERYTHE_HELMET);
                entries.add(ModItems.ABERYTHE_CHESTPLATE);
                entries.add(ModItems.ABERYTHE_LEGGINGS);
                entries.add(ModItems.ABERYTHE_BOOTS);
                entries.add(ModItems.ABERYTHE_SWORD);
                entries.add(ModItems.ABERYTHE_AXE);
                entries.add(ModItems.ABERYTHE_SHOVEL);
                entries.add(ModItems.ABERYTHE_HOE);
                entries.add(ModItems.ABERYTHE_PICKAXE);
                entries.add(ModItems.LORAN);
                entries.add(ModItems.ABYSS_PORTAL_ACTIVATOR);
                entries.add(ModBlocks.UNSTABLE_OBSIDIAN);
                entries.add(ModBlocks.ABYSS_DIRT);
                entries.add(ModBlocks.ROMA_MUD);
                entries.add(ModBlocks.ROMA_MUD_CURSED);
                entries.add(ModBlocks.ABYSS_GRAVEL);
                entries.add(ModBlocks.INFECTED_PEAT);
                entries.add(ModBlocks.STONE_RACKLE);
                entries.add(ModBlocks.BLARU_MOSS);
                entries.add(ModBlocks.GLOWING_BLARU_MOSS);
                entries.add(ModBlocks.BLARU_GRASS);
                entries.add(ModBlocks.ABYSS_SPORES);
                entries.add(ModBlocks.TESLA_FLOWER);
                entries.add(ModBlocks.VIGILANT_VERSA);
                entries.add(ModBlocks.EXOLIUS_MAXIMUS);
                entries.add(ModBlocks.YOUNG_EXOLIUS_MAXIMUS);
                entries.add(ModBlocks.VIGILANT_GRASS);
                entries.add(ModBlocks.BLUE_VIGILANT_GRASS);
                entries.add(ModBlocks.VIGILANT_MOSS);
                entries.add(ModBlocks.INFUSED_MAGMA);
                entries.add(ModBlocks.ABYSS_STONE);
                entries.add(ModBlocks.ABYSS_DIAMOND_ORE);
                entries.add(ModBlocks.ABYSS_EMERALD_ORE);
                entries.add(ModBlocks.ABYSS_GOLD_ORE);
                entries.add(ModBlocks.ABYSS_IRON_ORE);
                entries.add(ModBlocks.ABYSS_IGNISITHE_ORE);
                entries.add(ModBlocks.ABYSS_ABERYTHE_ORE);
                entries.add(ModBlocks.ABYSS_ABORANYS_ORE);
                entries.add(ModBlocks.ABYSS_FUSION_ORE);
                entries.add(ModBlocks.ABYSS_GARNITE_ORE);
                entries.add(ModBlocks.ABYSS_GLACERYTHE_ORE);
                entries.add(ModBlocks.ABYSS_INCORYTHE_ORE);
                entries.add(ModBlocks.ABYSS_LORAN_ORE);
                entries.add(ModBlocks.PURPLE_SHROOMLIGHT);
                entries.add(ModBlocks.DARK_BLUE_SHROOMLIGHT);
                entries.add(ModBlocks.BLUE_SHROOMLIGHT);
                entries.add(ModBlocks.ABYSS_JUNGLE_LOG);
                entries.add(ModBlocks.ABYSS_JUNGLE_WOOD);
                entries.add(ModBlocks.STRIPPED_ABYSS_JUNGLE_LOG);
                entries.add(ModBlocks.STRIPPED_ABYSS_JUNGLE_WOOD);
                entries.add(ModBlocks.ABYSS_JUNGLE_PLANKS);
                entries.add(ModBlocks.ABYSS_JUNGLE_STAIRS);
                entries.add(ModBlocks.ABYSS_JUNGLE_SLAB);
                entries.add(ModBlocks.ABYSS_JUNGLE_LEAVES);
                entries.add(ModBlocks.BLARU_LOG);
                entries.add(ModBlocks.BLARU_WOOD);
                entries.add(ModBlocks.STRIPPED_BLARU_LOG);
                entries.add(ModBlocks.STRIPPED_BLARU_WOOD);
                entries.add(ModBlocks.BLARU_PLANKS);
                entries.add(ModBlocks.BLARU_STAIRS);
                entries.add(ModBlocks.BLARU_SLAB);
                entries.add(ModBlocks.BLARU_LEAVES);
                entries.add(ModBlocks.FROZEN_LOG);
                entries.add(ModBlocks.FROZEN_WOOD);
                entries.add(ModBlocks.STRIPPED_FROZEN_LOG);
                entries.add(ModBlocks.STRIPPED_FROZEN_WOOD);
                entries.add(ModBlocks.FROZEN_PLANKS);
                entries.add(ModBlocks.FROZEN_STAIRS);
                entries.add(ModBlocks.FROZEN_SLAB);
                entries.add(ModBlocks.FROZEN_LEAVES);
                entries.add(ModBlocks.SLIMED_LOG);
                entries.add(ModBlocks.SLIMED_WOOD);
                entries.add(ModBlocks.STRIPPED_SLIMED_LOG);
                entries.add(ModBlocks.STRIPPED_SLIMED_WOOD);
                entries.add(ModBlocks.SLIMED_PLANKS);
                entries.add(ModBlocks.SLIMED_STAIRS);
                entries.add(ModBlocks.SLIMED_SLAB);
                entries.add(ModBlocks.ABYSS_SLIME_BLOCK);
                entries.add(ModBlocks.VIGILANT_LOG);
                entries.add(ModBlocks.VIGILANT_WOOD);
                entries.add(ModBlocks.STRIPPED_VIGILANT_LOG);
                entries.add(ModBlocks.STRIPPED_VIGILANT_WOOD);
                entries.add(ModBlocks.VIGILANT_PLANKS);
                entries.add(ModBlocks.VIGILANT_STAIRS);
                entries.add(ModBlocks.VIGILANT_SLAB);
                entries.add(ModBlocks.VIGILANT_LEAVES);
                entries.add(ModBlocks.BOG_SHROOM_LOG);
                entries.add(ModBlocks.BOG_SHROOM_WOOD);
                entries.add(ModBlocks.STRIPPED_BOG_SHROOM_LOG);
                entries.add(ModBlocks.STRIPPED_BOG_SHROOM_WOOD);
                entries.add(ModBlocks.BOG_SHROOM_PLANKS);
                entries.add(ModBlocks.BOG_SHROOM_STAIRS);
                entries.add(ModBlocks.BOG_SHROOM_SLAB);
                entries.add(ModBlocks.BOG_SHROOM_LEAVES);
                entries.add(ModBlocks.SAL_SHROOM_LOG);
                entries.add(ModBlocks.SAL_SHROOM_WOOD);
                entries.add(ModBlocks.STRIPPED_SAL_SHROOM_LOG);
                entries.add(ModBlocks.STRIPPED_SAL_SHROOM_WOOD);
                entries.add(ModBlocks.SAL_SHROOM_PLANKS);
                entries.add(ModBlocks.SAL_SHROOM_STAIRS);
                entries.add(ModBlocks.SAL_SHROOM_SLAB);
                entries.add(ModBlocks.SAL_SHROOM_LEAVES);
                entries.add(ModBlocks.ABYSCULK_LOG);
                entries.add(ModBlocks.ABYSCULK_WOOD);
                entries.add(ModBlocks.ABYSCULK_PLANKS);
                entries.add(ModBlocks.ABYSCULK_STAIRS);
                entries.add(ModBlocks.ABYSCULK_SLAB);
            }).build());
    public static ItemGroup QUARK = Registry.register(Registries.ITEM_GROUP, new Identifier(SkyBlock.MOD_ID,"quark"),
            FabricItemGroup.builder().displayName(Text.literal("Quark: Features (Vazkii)")).icon(() -> new ItemStack(ModItems.Z__LOGO4)).entries((displayContext, entries) -> {
                entries.add(ModBlocks.APPLE_CRATE);
                entries.add(ModBlocks.BEETROOT_CRATE);
                entries.add(ModBlocks.CARROT_CRATE);
                entries.add(ModBlocks.POTATO_CRATE);
                entries.add(ModBlocks.GOLDEN_APPLE_CRATE);
                entries.add(ModBlocks.GOLDEN_CARROT_CRATE);
                entries.add(ModBlocks.SWEET_BERRY_SACK);
                entries.add(ModBlocks.GLOW_BERRY_SACK);
                entries.add(ModBlocks.COCOA_BEANS_SACK);
                entries.add(ModBlocks.GUNPOWDER_SACK);
                entries.add(ModBlocks.NETHER_WART_SACK);
                entries.add(ModBlocks.STICK_BLOCK);
                entries.add(ModBlocks.SUGAR_CANE_BLOCK);
                entries.add(ModBlocks.CACTUS_BLOCK);
                entries.add(ModBlocks.CHORUS_FRUIT_BLOCK);
                entries.add(ModBlocks.ANDESITE_PILLAR);
                entries.add(ModBlocks.DIORITE_PILLAR);
                entries.add(ModBlocks.GRANITE_PILLAR);
                entries.add(ModBlocks.CAVE_ROOTS);
            }).build());
    public static ItemGroup PEARFECTION = Registry.register(Registries.ITEM_GROUP, new Identifier(SkyBlock.MOD_ID,"pearfection"),
            FabricItemGroup.builder().displayName(Text.literal("Pearfection: Feature (DigitalPear_11)")).icon(() -> new ItemStack(ModItems.Z__LOGO6)).entries((displayContext, entries) -> {
                entries.add(ModBlocks.CALLERY_LOG);
                entries.add(ModBlocks.CALLERY_WOOD);
                entries.add(ModBlocks.STRIPPED_CALLERY_LOG);
                entries.add(ModBlocks.STRIPPED_CALLERY_WOOD);
                entries.add(ModBlocks.CALLERY_PLANKS);
                entries.add(ModBlocks.CALLERY_STAIRS);
                entries.add(ModBlocks.CALLERY_SLAB);
                entries.add(ModBlocks.CALLERY_LEAVES);
                entries.add(ModBlocks.FLOWERING_CALLERY_LEAVES);
            }).build());

    public static void registerItemGroups() {}
    private static void addSpaces(ItemGroup.Entries entries, ItemGroup.StackVisibility visibility, int used_spaces, int spaces) {
        for (byte b : NullItem.VALUES) {
            if (spaces != 0) {
                ItemStack itemStack = new ItemStack(ModItems.Z__NULL);
                NullItem.setSpaces(itemStack, (byte) (used_spaces + b));
                spaces = spaces-1;
            entries.add(itemStack, visibility);
            }
        }
    }
    private static void addTiles(ItemGroup.Entries entries, ItemGroup.StackVisibility visibility, int used_tiles, int tiles) {
        for (byte b : NullItem.VALUES) {
            if (tiles != 0) {
                ItemStack itemStack = new ItemStack(ModItems.Z__TILE_BLANK);
                TileBlankItem.setTiles(itemStack, (byte) (used_tiles + b));
                tiles = tiles-1;
                entries.add(itemStack, visibility);
            }
        }
    }
}
