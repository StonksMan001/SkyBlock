package net.me.skyblock.api.datafixer;

import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.schemas.Schema;
import net.me.skyblock.SkyBlock;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import org.betterx.bclib.api.v2.datafixer.DataFixerAPI;
import org.betterx.bclib.api.v2.datafixer.ForcedLevelPatch;
import org.betterx.bclib.api.v2.datafixer.MigrationProfile;
import org.betterx.bclib.api.v2.datafixer.Patch;
import org.betterx.bclib.api.v2.levelgen.LevelGenUtil;
import org.betterx.bclib.interfaces.PatchBiFunction;
import org.betterx.bclib.interfaces.PatchFunction;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;


public class DataFixer {
    public static void register() {
        SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering BCLib Data Patches for " + SkyBlock.MOD_ID);
        DataFixerAPI.registerPatch(Patcher_1::new);
        DataFixerAPI.registerPatch(Patcher_2::new);

    }
}
class Patcher_2 extends Patch {
    public Patcher_2() {
        super(SkyBlock.MOD_ID, "1.2.1-1.20.1");
    }

    @Override
    public Map<String, String> getIDReplacements() {
        return Map.ofEntries(
                Map.entry("skyblock:h__anomalite_sword1", "skyblock:h__anomalite_sword"),
                Map.entry("skyblock:h__anomalite_sword2", "skyblock:h__anomalite_sword"),
                Map.entry("skyblock:h__anomalite_pickaxe1", "skyblock:h__anomalite_pickaxe"),
                Map.entry("skyblock:h__anomalite_pickaxe2", "skyblock:h__anomalite_pickaxe")
        );
    }
}
class Patcher_1 extends Patch {
    public Patcher_1() {
        super(SkyBlock.MOD_ID, "1.2.0-1.20.1");
    }
    @Override
    public Map<String, String> getIDReplacements() {
        return Map.ofEntries(
                // BLOCKS //
                Map.entry("skyblock:unstable_obsidian", "skyblock:abyss__unstable_obsidian"),
                Map.entry("skyblock:abyss_dirt", "skyblock:abyss__abyss_dirt"),
                Map.entry("skyblock:roma_mud", "skyblock:abyss__roma_mud"),
                Map.entry("skyblock:roma_mud_2", "skyblock:abyss__roma_mud_2"),
                Map.entry("skyblock:gravel", "skyblock:abyss__gravel"),
                Map.entry("skyblock:infected_peat", "skyblock:abyss__infected_peat"),
                Map.entry("skyblock:stone_rackle", "skyblock:abyss__stone_rackle"),
                Map.entry("skyblock:blaru_moss", "skyblock:abyss__blaru_moss"),
                Map.entry("skyblock:glowing_blaru_moss", "skyblock:abyss__glowing_blaru_moss"),
                Map.entry("skyblock:blaru_grass", "skyblock:abyss__blaru_grass"),
                Map.entry("skyblock:abyss_spores", "skyblock:abyss__abyss_spores"),
                Map.entry("skyblock:tesla_flower", "skyblock:abyss__tesla_flower"),
                Map.entry("skyblock:vigilant_versa", "skyblock:abyss__vigilant_versa"),
                Map.entry("skyblock:exolius_maximus", "skyblock:abyss__exolius_maximus"),
                Map.entry("skyblock:young_exolius_maximus", "skyblock:abyss__young_exolius_maximus"),
                Map.entry("skyblock:vigilant_grass", "skyblock:abyss__vigilant_grass"),
                Map.entry("skyblock:blue_vigilant_grass", "skyblock:abyss__blue_vigilant_grass"),
                Map.entry("skyblock:vigilant_moss", "skyblock:abyss__vigilant_moss"),
                Map.entry("skyblock:infused_magma", "skyblock:abyss__infused_magma"),
                Map.entry("skyblock:abyss_stone", "skyblock:abyss__abyss_stone"),
                Map.entry("skyblock:abyss_stone_og", "skyblock:abyss__abyss_stone_og"),
                Map.entry("skyblock:abyss_diamond_ore", "skyblock:abyss__abyss_diamond_ore"),
                Map.entry("skyblock:abyss_emerald_ore", "skyblock:abyss__abyss_emerald_ore"),
                Map.entry("skyblock:abyss_gold_ore", "skyblock:abyss__abyss_gold_ore"),
                Map.entry("skyblock:abyss_iron_ore", "skyblock:abyss__abyss_iron_ore"),
                Map.entry("skyblock:abyss_ignisithe_ore", "skyblock:abyss__abyss_ignisithe_ore"),
                Map.entry("skyblock:abyss_aberythe_ore", "skyblock:abyss__abyss_aberythe_ore"),
                Map.entry("skyblock:abyss_aboranys_ore", "skyblock:abyss__abyss_aboranys_ore"),
                Map.entry("skyblock:abyss_fusion_ore", "skyblock:abyss__abyss_fusion_ore"),
                Map.entry("skyblock:abyss_garnite_ore", "skyblock:abyss__abyss_garnite_ore"),
                Map.entry("skyblock:abyss_glacerythe_ore", "skyblock:abyss__abyss_glacerythe_ore"),
                Map.entry("skyblock:abyss_incorythe_ore", "skyblock:abyss__abyss_incorythe_ore"),
                Map.entry("skyblock:abyss_loran_ore", "skyblock:abyss__abyss_loran_ore"),
                Map.entry("skyblock:purple_shroomlight", "skyblock:abyss__purple_shroomlight"),
                Map.entry("skyblock:dark_blue_shroomlight", "skyblock:abyss__dark_blue_shroomlight"),
                Map.entry("skyblock:blue_shroomlight", "skyblock:abyss__blue_shroomlight"),

                Map.entry("skyblock:abyss_jungle_log", "skyblock:abyss__abyss_jungle_log"),
                Map.entry("skyblock:abyss_jungle_wood", "skyblock:abyss__abyss_jungle_wood"),
                Map.entry("skyblock:stripped_abyss_jungle_log", "skyblock:abyss__stripped_abyss_jungle_log"),
                Map.entry("skyblock:stripped_abyss_jungle_wood", "skyblock:abyss__stripped_abyss_jungle_wood"),
                Map.entry("skyblock:abyss_jungle_leaves", "skyblock:abyss__abyss_jungle_leaves"),
                Map.entry("skyblock:abyss_jungle_planks", "skyblock:abyss__abyss_jungle_planks"),
                Map.entry("skyblock:abyss_jungle_stairs", "skyblock:abyss__abyss_jungle_stairs"),
                Map.entry("skyblock:abyss_jungle_slab", "skyblock:abyss__abyss_jungle_slab"),

                Map.entry("skyblock:blaru_log", "skyblock:abyss__blaru_log"),
                Map.entry("skyblock:blaru_wood", "skyblock:abyss__blaru_wood"),
                Map.entry("skyblock:stripped_blaru_log", "skyblock:abyss__stripped_blaru_log"),
                Map.entry("skyblock:stripped_blaru_wood", "skyblock:abyss__stripped_blaru_wood"),
                Map.entry("skyblock:blaru_leaves", "skyblock:abyss__blaru_leaves"),
                Map.entry("skyblock:blaru_planks", "skyblock:abyss__blaru_planks"),
                Map.entry("skyblock:blaru_stairs", "skyblock:abyss__blaru_stairs"),
                Map.entry("skyblock:blaru_slab", "skyblock:abyss__blaru_slab"),

                Map.entry("skyblock:frozen_log", "skyblock:abyss__frozen_log"),
                Map.entry("skyblock:frozen_wood", "skyblock:abyss__frozen_wood"),
                Map.entry("skyblock:stripped_frozen_log", "skyblock:abyss__stripped_frozen_log"),
                Map.entry("skyblock:stripped_frozen_wood", "skyblock:abyss__stripped_frozen_wood"),
                Map.entry("skyblock:frozen_leaves", "skyblock:abyss__frozen_leaves"),
                Map.entry("skyblock:frozen_planks", "skyblock:abyss__frozen_planks"),
                Map.entry("skyblock:frozen_stairs", "skyblock:abyss__frozen_stairs"),
                Map.entry("skyblock:frozen_slab", "skyblock:abyss__frozen_slab"),

                Map.entry("skyblock:slimed_log", "skyblock:abyss__slimed_log"),
                Map.entry("skyblock:slimed_wood", "skyblock:abyss__slimed_wood"),
                Map.entry("skyblock:stripped_slimed_log", "skyblock:abyss__stripped_slimed_log"),
                Map.entry("skyblock:stripped_slimed_wood", "skyblock:abyss__stripped_slimed_wood"),
                Map.entry("skyblock:abyss_slime_block", "skyblock:abyss__abyss_slime_block"),
                Map.entry("skyblock:slimed_planks", "skyblock:abyss__slimed_planks"),
                Map.entry("skyblock:slimed_stairs", "skyblock:abyss__slimed_stairs"),
                Map.entry("skyblock:slimed_slab", "skyblock:abyss__slimed_slab"),

                Map.entry("skyblock:vigilant_log", "skyblock:abyss__vigilant_log"),
                Map.entry("skyblock:vigilant_wood", "skyblock:abyss__vigilant_wood"),
                Map.entry("skyblock:stripped_vigilant_log", "skyblock:abyss__stripped_vigilant_log"),
                Map.entry("skyblock:stripped_vigilant_wood", "skyblock:abyss__stripped_vigilant_wood"),
                Map.entry("skyblock:vigilant_leaves", "skyblock:abyss__vigilant_leaves"),
                Map.entry("skyblock:vigilant_planks", "skyblock:abyss__vigilant_planks"),
                Map.entry("skyblock:vigilant_stairs", "skyblock:abyss__vigilant_stairs"),
                Map.entry("skyblock:vigilant_slab", "skyblock:abyss__vigilant_slab"),

                Map.entry("skyblock:abysculk_log", "skyblock:abyss__abysculk_log"),
                Map.entry("skyblock:abysculk_wood", "skyblock:abyss__abysculk_wood"),
                Map.entry("skyblock:stripped_abysculk_log", "skyblock:abyss__stripped_abysculk_log"),
                Map.entry("skyblock:stripped_abysculk_wood", "skyblock:abyss__stripped_abysculk_wood"),
                Map.entry("skyblock:abysculk_planks", "skyblock:abyss__abysculk_planks"),
                Map.entry("skyblock:abysculk_stairs", "skyblock:abyss__abysculk_stairs"),
                Map.entry("skyblock:abysculk_slab", "skyblock:abyss__abysculk_slab"),

                Map.entry("skyblock:bog_shroom_log", "skyblock:abyss__bog_shroom_log"),
                Map.entry("skyblock:bog_shroom_wood", "skyblock:abyss__bog_shroom_wood"),
                Map.entry("skyblock:stripped_bog_shroom_log", "skyblock:abyss__stripped_bog_shroom_log"),
                Map.entry("skyblock:stripped_bog_shroom_wood", "skyblock:abyss__stripped_bog_shroom_wood"),
                Map.entry("skyblock:bog_shroom_leaves", "skyblock:abyss__bog_shroom_leaves"),
                Map.entry("skyblock:bog_shroom_planks", "skyblock:abyss__bog_shroom_planks"),
                Map.entry("skyblock:bog_shroom_stairs", "skyblock:abyss__bog_shroom_stairs"),
                Map.entry("skyblock:bog_shroom_slab", "skyblock:abyss__bog_shroom_slab"),

                Map.entry("skyblock:sal_shroom_log", "skyblock:abyss__sal_shroom_log"),
                Map.entry("skyblock:sal_shroom_wood", "skyblock:abyss__sal_shroom_wood"),
                Map.entry("skyblock:stripped_sal_shroom_log", "skyblock:abyss__stripped_sal_shroom_log"),
                Map.entry("skyblock:stripped_sal_shroom_wood", "skyblock:abyss__stripped_sal_shroom_wood"),
                Map.entry("skyblock:sal_shroom_leaves", "skyblock:abyss__sal_shroom_leaves"),
                Map.entry("skyblock:sal_shroom_planks", "skyblock:abyss__sal_shroom_planks"),
                Map.entry("skyblock:sal_shroom_stairs", "skyblock:abyss__sal_shroom_stairs"),
                Map.entry("skyblock:sal_shroom_slab", "skyblock:abyss__sal_shroom_slab"),

                Map.entry("skyblock:void_block", "skyblock:mcd__void_block"),
                Map.entry("skyblock:og_purpur_block", "skyblock:mcd__og_purpur_block"),
                Map.entry("skyblock:end_emerald_ore", "skyblock:sp5__end_emerald_ore"),
                Map.entry("skyblock:end_emerald_block", "skyblock:sp5__end_emerald_block"),
                Map.entry("skyblock:enderite_ore", "skyblock:sp5__enderite_ore"),
                Map.entry("skyblock:enderite_block", "skyblock:sp5__enderite_block"),
                Map.entry("skyblock:asteroid_residues", "skyblock:sp5__asteroid_residues"),
                Map.entry("skyblock:solid_rock", "skyblock:sp5__solid_rock"),
                Map.entry("skyblock:end_grass", "skyblock:sp5__end_grass"),
                Map.entry("skyblock:bluishe_end_stone", "skyblock:sp5__bluishe_end_stone"),
                Map.entry("skyblock:ender_grass", "skyblock:sp5__ender_grass"),
                Map.entry("skyblock:end_fungus", "skyblock:sp5__end_fungus"),
                Map.entry("skyblock:bluishe_bush", "skyblock:sp5__bluishe_bush"),
                Map.entry("skyblock:bluishe_fungus", "skyblock:sp5__bluishe_fungus"),
                Map.entry("skyblock:end_bush", "skyblock:sp5__end_bush"),
                Map.entry("skyblock:end_flower", "skyblock:sp5__end_flower"),
                Map.entry("skyblock:ant_jam_block", "skyblock:skyblock__ant_jam_block"),
                Map.entry("skyblock:sweet_berry_jam_block", "skyblock:skyblock__sweet_berry_jam_block"),
                Map.entry("skyblock:suspicious_coarse_dirt", "skyblock:skyblock__suspicious_coarse_dirt"),
                Map.entry("skyblock:transparent_block", "skyblock:sp5__transparent_block"),
                Map.entry("skyblock:end_wart_block", "skyblock:sp5__end_wart_block"),
                Map.entry("skyblock:blue_wart", "skyblock:sp5__blue_wart"),

                Map.entry("skyblock:end_stem", "skyblock:sp5__end_stem"),
                Map.entry("skyblock:end_hyphae", "skyblock:sp5__end_hyphae"),
                Map.entry("skyblock:stripped_end_stem", "skyblock:sp5__stripped_end_stem"),
                Map.entry("skyblock:stripped_end_hyphae", "skyblock:sp5__stripped_end_hyphae"),
                Map.entry("skyblock:endlight", "skyblock:sp5__endlight"),
                Map.entry("skyblock:end_planks", "skyblock:sp5__end_planks"),
                Map.entry("skyblock:end_stairs", "skyblock:sp5__end_stairs"),
                Map.entry("skyblock:end_slab", "skyblock:sp5__end_slab"),

                Map.entry("skyblock:bluishe_stem", "skyblock:sp5__bluishe_stem"),
                Map.entry("skyblock:bluishe_hyphae", "skyblock:sp5__bluishe_hyphae"),
                Map.entry("skyblock:bluishe_light_stem", "skyblock:sp5__bluishe_light_stem"),
                Map.entry("skyblock:bluishe_light_hyphae", "skyblock:sp5__bluishe_light_hyphae"),
                Map.entry("skyblock:stripped_bluishe_stem", "skyblock:sp5__stripped_bluishe_stem"),
                Map.entry("skyblock:stripped_bluishe_hyphae", "skyblock:sp5__stripped_bluishe_hyphae"),
                Map.entry("skyblock:bluishe_planks", "skyblock:sp5__bluishe_planks"),
                Map.entry("skyblock:bluishe_stairs", "skyblock:sp5__bluishe_stairs"),
                Map.entry("skyblock:bluishe_slab", "skyblock:sp5__bluishe_slab"),

                Map.entry("skyblock:azalea_log", "skyblock:flogical__azalea_log"),
                Map.entry("skyblock:azalea_wood", "skyblock:flogical__azalea_wood"),
                Map.entry("skyblock:stripped_azalea_log", "skyblock:flogical__stripped_azalea_log"),
                Map.entry("skyblock:stripped_azalea_wood", "skyblock:flogical__stripped_azalea_wood"),
                Map.entry("skyblock:azalea_planks", "skyblock:flogical__azalea_planks"),
                Map.entry("skyblock:azalea_stairs", "skyblock:flogical__azalea_stairs"),
                Map.entry("skyblock:azalea_slab", "skyblock:flogical__azalea_slab"),

                Map.entry("skyblock:mossier_cobblestone", "skyblock:mcd__mossier_cobblestone"),
                Map.entry("skyblock:mossier_oak_planks", "skyblock:mcd__mossier_oak_planks"),
                Map.entry("skyblock:mossier_spruce_planks", "skyblock:mcd__mossier_spruce_planks"),
                Map.entry("skyblock:barren_grass_block", "skyblock:mcd__barren_grass_block"),

                Map.entry("skyblock:callery_leaves", "skyblock:digpear__callery_leaves"),
                Map.entry("skyblock:flowering_callery_leaves", "skyblock:digpear__flowering_callery_leaves"),
                Map.entry("skyblock:callery_log", "skyblock:digpear__callery_log"),
                Map.entry("skyblock:callery_wood", "skyblock:digpear__callery_wood"),
                Map.entry("skyblock:stripped_callery_log", "skyblock:digpear__stripped_callery_log"),
                Map.entry("skyblock:stripped_callery_wood", "skyblock:digpear__stripped_callery_wood"),
                Map.entry("skyblock:callery_planks", "skyblock:digpear__callery_planks"),
                Map.entry("skyblock:callery_stairs", "skyblock:digpear__callery_stairs"),
                Map.entry("skyblock:callery_slab", "skyblock:digpear__callery_slab"),

                Map.entry("skyblock:apple_crate", "skyblock:quark__apple_crate"),
                Map.entry("skyblock:beetroot_crate", "skyblock:quark__beetroot_crate"),
                Map.entry("skyblock:carrot_crate", "skyblock:quark__carrot_crate"),
                Map.entry("skyblock:potato_crate", "skyblock:quark__potato_crate"),
                Map.entry("skyblock:golden_apple_crate", "skyblock:quark__golden_apple_crate"),
                Map.entry("skyblock:golden_carrot_crate", "skyblock:quark__golden_carrot_crate"),
                Map.entry("skyblock:sweet_berry_sack", "skyblock:quark__sweet_berry_sack"),
                Map.entry("skyblock:glow_berry_sack", "skyblock:quark__glow_berry_sack"),
                Map.entry("skyblock:cocoa_beans_sack", "skyblock:quark__cocoa_bean_sack"),
                Map.entry("skyblock:gunpowder_sack", "skyblock:quark__gunpowder_sack"),
                Map.entry("skyblock:nether_wart_sack", "skyblock:quark__nether_wart_sack"),
                Map.entry("skyblock:stick_block", "skyblock:quark__stick_block"),
                Map.entry("skyblock:sugar_cane_block", "skyblock:quark__sugar_cane_block"),
                Map.entry("skyblock:cactus_block", "skyblock:quark__cactus_block"),
                Map.entry("skyblock:chorus_fruit_block", "skyblock:quark__chorus_fruit_block"),
                Map.entry("skyblock:andesite_pillar", "skyblock:quark__andesite_pillar"),
                Map.entry("skyblock:diorite_pillar", "skyblock:quark__diorite_pillar"),
                Map.entry("skyblock:granite_pillar", "skyblock:quark__granite_pillar"),
                Map.entry("skyblock:cave_roots", "skyblock:quark__cave_roots"),
                // ITEMS //
                Map.entry("skyblock:fyberite_ingot", "skyblock:skyblock__fyberite_ingot"),
                Map.entry("skyblock:ant_bottle", "skyblock:skyblock__ant_bottle"),
                Map.entry("skyblock:bottle_of_ant_jam", "skyblock:skyblock__bottle_of_ant_jam"),

                Map.entry("skyblock:music_disc_wither_storm_theme", "skyblock:witherstorm__music_disc_witherstorm_theme"),
                Map.entry("skyblock:disc_fragment_wither_storm_theme", "skyblock:witherstorm__disc_fragment_witherstorm_theme"),

                Map.entry("skyblock:enderite_apple", "skyblock:sp5__enderite_apple"),
                Map.entry("skyblock:enchanted_enderite_apple", "skyblock:sp5__enchanted_enderite_apple"),

                Map.entry("skyblock:sugar_poppy_mixture", "skyblock:skyblock__sugar_poppy_mixture"),
                Map.entry("skyblock:steam_dumpling_raw", "skyblock:skyblock__steam_dumpling_raw"),
                Map.entry("skyblock:steam_dumpling", "skyblock:skyblock__steam_dumpling"),
                Map.entry("skyblock:steam_dumpling_with_molten_butter", "skyblock:skyblock__steam_dumpling_with_molten_butter"),
                Map.entry("skyblock:steam_dumpling_with_molten_butter_and_sugar_poppy_mixture", "skyblock:skyblock__steam_dumpling_with_molten_butter_and_sugar_poppy_mixture"),

                Map.entry("skyblock:loran", "skyblock:abyss__loran"),
                Map.entry("skyblock:abyss_portal_activator", "skyblock:abyss__abyss_portal_activator"),

                Map.entry("skyblock:ender_stick", "skyblock:sp5__ender_stick"),
                Map.entry("skyblock:end_emerald", "skyblock:sp5__end_emerald"),
                Map.entry("skyblock:melte_residues", "skyblock:sp5__melted_residues"),
                Map.entry("skyblock:enderite_ingot", "skyblock:sp5__enderite_ingot"),
                Map.entry("skyblock:enderite_helmet", "skyblock:sp5__enderite_helmet"),
                Map.entry("skyblock:enderite_chestplate", "skyblock:sp5__enderite_chestplate"),
                Map.entry("skyblock:enderite_leggings", "skyblock:sp5__enderite_leggings"),
                Map.entry("skyblock:enderite_boots", "skyblock:sp5__enderite_boots"),
                Map.entry("skyblock:enderite_sword", "skyblock:sp5__enderite_sword"),
                Map.entry("skyblock:enderite_axe", "skyblock:sp5__enderite_axe"),
                Map.entry("skyblock:enderite_shovel", "skyblock:sp5__enderite_shovel"),
                Map.entry("skyblock:enderite_hoe", "skyblock:sp5__enderite_hoe"),
                Map.entry("skyblock:enderite_pickaxe", "skyblock:sp5__enderite_pickaxe"),

                Map.entry("skyblock:aberythe_gem", "skyblock:abyss__aberythe_gem"),
                Map.entry("skyblock:aberythe_helmet", "skyblock:abyss__aberythe_helmet"),
                Map.entry("skyblock:aberythe_chestplate", "skyblock:abyss__aberythe_chestplate"),
                Map.entry("skyblock:aberythe_leggings", "skyblock:abyss__aberythe_leggings"),
                Map.entry("skyblock:aberythe_boots", "skyblock:abyss__aberythe_boots"),
                Map.entry("skyblock:aberythe_sword", "skyblock:abyss__aberythe_sword"),
                Map.entry("skyblock:aberythe_axe", "skyblock:abyss__aberythe_axe"),
                Map.entry("skyblock:aberythe_shovel", "skyblock:abyss__aberythe_shovel"),
                Map.entry("skyblock:aberythe_hoe", "skyblock:abyss__aberythe_hoe"),
                Map.entry("skyblock:aberythe_pickaxe", "skyblock:abyss__aberythe_pickaxe"),

                Map.entry("skyblock:lightning_sword", "skyblock:skyblock__lightning_sword"),

                Map.entry("skyblock:shortbow", "skyblock:mcd__shortbow"),
                Map.entry("skyblock:longbow", "skyblock:mcd__longbow"),
                Map.entry("skyblock:twin_bow", "skyblock:mcd__twin_bow"),
                Map.entry("skyblock:auto_crossbow", "skyblock:mcd__auto_crossbow"),
                Map.entry("skyblock:diamond_rapier", "skyblock:mcd__diamond_rapier"),
                Map.entry("skyblock:golden_rapier", "skyblock:mcd__golden_rapier"),
                Map.entry("skyblock:iron_rapier", "skyblock:mcd__iron_rapier"),
                Map.entry("skyblock:netherite_rapier", "skyblock:mcd__netherite_rapier"),
                Map.entry("skyblock:stone_rapier", "skyblock:mcd__stone_rapier"),
                Map.entry("skyblock:wooden_rapier", "skyblock:mcd__wooden_rapier")
        );
    }
}
