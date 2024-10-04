package net.me.skyblock.blocks_and_items;

import net.me.skyblock.SkyBlock;
import net.me.skyblock.api.skycore.ArmorAPI;
import net.me.skyblock.api.skycore.ToolAPI;
import net.me.skyblock.blocks_and_items.items.end.EnchantedEnderiteAppleItem;
import net.me.skyblock.blocks_and_items.items.abyss.Loran;
import net.me.skyblock.blocks_and_items.items.mcd.RapierItem;
import net.me.skyblock.blocks_and_items.items.skyblock.ChilliPepper;
import net.me.skyblock.blocks_and_items.items.skyblock.FirwoodMace;
import net.me.skyblock.blocks_and_items.items.util.AnomaliteArmorItem;
import net.me.skyblock.blocks_and_items.items.util.basic.ModFoodComponents;
import net.me.skyblock.blocks_and_items.items.util.basic.ModToolMaterials;
import net.me.skyblock.blocks_and_items.items.mcd.mcd_artifact.IronSkinItem_Common;
import net.me.skyblock.blocks_and_items.items.util.basic.ModArmorMaterials;
import net.me.skyblock.blocks_and_items.items.mcd.mcd_ranged.ShortBowItem;
import net.me.skyblock.blocks_and_items.items.util.custom_unenchantable.UnenchantableAxeItem;
import net.me.skyblock.blocks_and_items.items.util.custom_unenchantable.UnenchantablePickaxeItem;
import net.me.skyblock.blocks_and_items.items.util.custom_unenchantable.UnenchantableSwordItem;
import net.me.skyblock.sound.ModJukeBoxSongs;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.*;
import net.minecraft.util.Rarity;

public class ModItems {
    //SKYBLOCK MAIN-BLOCK
    public static final Item SKYBLOCK__FYBERITE = SkyBlock.BuiltinRegistries.registerItem("skyblock__fyberite_ingot",
            new Item(new Item.Settings()));
    public static final Item SKYBLOCK__ANT_BOTTLE = SkyBlock.BuiltinRegistries.registerItem("skyblock__ant_bottle",
            new Item(new Item.Settings()));
    public static final Item SKYBLOCK__BOTTLE_OF_ANT_JAM = SkyBlock.BuiltinRegistries.registerItem("skyblock__bottle_of_ant_jam",
            new Item(new Item.Settings().recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item WITHERSTORM__MUSIC_DISC_WITHERSTORM = SkyBlock.BuiltinRegistries.registerItem("witherstorm__music_disc_witherstorm_theme",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeBoxSongs.WITHERSTORM_THEME)));
    public static final Item WITHERSTORM__DISC_FRAGMENT_WITHERSTORM = SkyBlock.BuiltinRegistries.registerItem("witherstorm__disc_fragment_witherstorm_theme",
            new DiscFragmentItem(new Item.Settings()));
    public static final Item SP5__ENDERITE_APPLE = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_apple",
            new Item(new Item.Settings().food(ModFoodComponents.SP5__ENDERITE_APPLE)));
    public static final Item SP5__ENCHANTED_ENDERITE_APPLE = SkyBlock.BuiltinRegistries.registerItem("sp5__enchanted_enderite_apple",
            new EnchantedEnderiteAppleItem(new Item.Settings().food(ModFoodComponents.SP5__ENCHANTED_ENDERITE_APPLE)));
    public static final Item SKYBLOCK__SUGAR_POPPY_MIXTURE = SkyBlock.BuiltinRegistries.registerItem("skyblock__sugar_poppy_mixture",
            new Item(new Item.Settings()));
    public static final Item SKYBLOCK__STEAM_DUMPLING_FRESH = SkyBlock.BuiltinRegistries.registerItem("skyblock__steam_dumpling_raw",
            new Item(new Item.Settings()));
    public static final Item SKYBLOCK__STEAM_DUMPLING = SkyBlock.BuiltinRegistries.registerItem("skyblock__steam_dumpling",
            new Item(new Item.Settings().food(ModFoodComponents.SKYBLOCK__STEAM_DUMPLING)));
    public static final Item SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER = SkyBlock.BuiltinRegistries.registerItem("skyblock__steam_dumpling_with_molten_butter",
            new Item(new Item.Settings().food(ModFoodComponents.SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER)));
    public static final Item SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER_AND_SUGAR_POPPY_MIXTURE = SkyBlock.BuiltinRegistries.registerItem("skyblock__steam_dumpling_with_molten_butter_and_sugar_poppy_mixture",
            new Item(new Item.Settings().food(ModFoodComponents.SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER_AND_SUGAR_POPPY_MIXTURE)));
    //SKYBLOCK VANILLA+
    public static final Item SKYBLOCK__PUFFBALL_FLESH = SkyBlock.BuiltinRegistries.registerItem("skyblock__puffball_flesh",
            new Item(new Item.Settings()));
    public static final Item SKYBLOCK__CHILLI_PEPPER_SEEDS = SkyBlock.BuiltinRegistries.registerItem("skyblock__chilli_pepper_seeds",
            new AliasedBlockItem(ModBlocks.SKYBLOCK__CHILLI_PEPPER_CROP, new Item.Settings()));
    public static final Item SKYBLOCK__CHILLI_PEPPER = SkyBlock.BuiltinRegistries.registerItem("skyblock__chilli_pepper",
            new ChilliPepper(new Item.Settings().food(ModFoodComponents.SKYBLOCK__CHILLI_PEPPER)));
    public static final Item SKYBLOCK__GOLDEN_CHILLI_PEPPER = SkyBlock.BuiltinRegistries.registerItem("skyblock__golden_chilli_pepper",
            new Item(new Item.Settings().food(ModFoodComponents.SKYBLOCK__GOLDEN_CHILLI_PEPPER)));
    public static final Item SKYBLOCK__BLUEBERRIES = SkyBlock.BuiltinRegistries.registerItem("skyblock__blueberries",
            new Item(new Item.Settings().food(ModFoodComponents.SKYBLOCK__BLUEBERRIES)));
    public static final Item SKYBLOCK__DUCKWEED = SkyBlock.BuiltinRegistries.registerItemThatHasBlock(
            new PlaceableOnWaterItem(ModBlocks.SKYBLOCK__DUCKWEED, new Item.Settings()));
    public static final Item SKYBLOCK__SMALL_LILY_PADS = SkyBlock.BuiltinRegistries.registerItemThatHasBlock(
            new PlaceableOnWaterItem(ModBlocks.SKYBLOCK__SMALL_LILY_PADS, new Item.Settings()));
    public static final Item SKYBLOCK__FIRWOOD_MACE = SkyBlock.BuiltinRegistries.registerItem("skyblock__firwood_mace",
            new FirwoodMace(ModToolMaterials.FIRWOOD, 10, 0.75f -4f, new Item.Settings()));
    public static final Item SKYBLOCK__RARE_TOKEN = SkyBlock.BuiltinRegistries.registerItem("skyblock__rare_token",
            new Item(new Item.Settings()));
    public static final Item SKYBLOCK__UNCOMMON_TOKEN = SkyBlock.BuiltinRegistries.registerItem("skyblock__uncommon_token",
            new Item(new Item.Settings()));
    public static final Item SKYBLOCK__COMMON_TOKEN = SkyBlock.BuiltinRegistries.registerItem("skyblock__common_token",
            new Item(new Item.Settings()));
    //1.21.1+
    public static final Item SKYBLOCK__BONDED_TOTEM_OF_UNDYING = SkyBlock.BuiltinRegistries.registerItem("skyblock__bonded_totem_of_undying",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.UNCOMMON)));
    public static final Item SKYBLOCK__OMINOUS_LINK = SkyBlock.BuiltinRegistries.registerItem("skyblock__ominous_link",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item SKYBLOCK__COMPRESSED_STEEL = SkyBlock.BuiltinRegistries.registerItemThatHasBlock(
            new BlockItem(ModBlocks.SKYBLOCK__COMPRESSED_STEEL, new Item.Settings()
                    .rarity(Rarity.EPIC)));
    //1.21.1+
    //SKYBLOCK VANILLA+
    //SKYBLOCK TROPHIES
    public static final Item SKYBLOCK__PESTILENT_TROPHY = SkyBlock.BuiltinRegistries.registerItemThatHasBlock(
            new BlockItem(ModBlocks.SKYBLOCK__PESTILENT_TROPHY, new Item.Settings().maxCount(1)));
    //SKYBLOCK TROPHIES

    public static final Item ABYSS__LORAN = SkyBlock.BuiltinRegistries.registerItem("abyss__loran",
            new Loran(new Item.Settings()));
    public static final Item ABYSS__ABYSS_PORTAL_ACTIVATOR = SkyBlock.BuiltinRegistries.registerItem("abyss__abyss_portal_activator",
            new Item(new Item.Settings()));
    public static final Item SP5__ENDER_STICK = SkyBlock.BuiltinRegistries.registerItem("sp5__ender_stick",
            new Item(new Item.Settings()));
    public static final Item SP5__ENDMERALD = SkyBlock.BuiltinRegistries.registerItem("sp5__end_emerald",
            new Item(new Item.Settings()));
    public static final Item SP5__MELTED_RESIDUES = SkyBlock.BuiltinRegistries.registerItem("sp5__melted_residues",
            new Item(new Item.Settings()));
    public static final Item SP5__ENDERITE_INGOT = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_ingot",
            new Item(new Item.Settings()));
    public static final Item SP5__ENDERITE_CHORUS_FRUIT = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_chorus_fruit",
            new ChorusFruitItem(new Item.Settings().food(FoodComponents.CHORUS_FRUIT)));
    public static final Item SP5__POPPED_ENDERITE_CHORUS_FRUIT = SkyBlock.BuiltinRegistries.registerItem("sp5__popped_enderite_chorus_fruit",
            new Item(new Item.Settings()));
    public static final Item SP5__BLUISHE_LIGHT_SHEEL = SkyBlock.BuiltinRegistries.registerItem("sp5__bluishe_light_sheel",
            new Item(new Item.Settings()));
    public static final Item SP5__ENDERITE_HELMET = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_helmet",
            new ArmorAPI.ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.HELMET, new Item.Settings(), 45));
    public static final Item SP5__ENDERITE_CHESTPLATE = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_chestplate",
            new ArmorAPI.ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.CHESTPLATE, new Item.Settings(), 45));
    public static final Item SP5__ENDERITE_LEGGINGS = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_leggings",
            new ArmorAPI.ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.LEGGINGS, new Item.Settings(), 45));
    public static final Item SP5__ENDERITE_BOOTS = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_boots",
            new ArmorAPI.ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.BOOTS, new Item.Settings(), 45));
    public static final Item SP5__ENDERITE_SWORD = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_sword",
            new ToolAPI.SwordItem(ModToolMaterials.ENDERITE, 9, 1.6f -4f, new Item.Settings()));
    public static final Item SP5__ENDERITE_AXE = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_axe",
            new ToolAPI.AxeItem(ModToolMaterials.ENDERITE, 11, 1f -4f, new Item.Settings()));
    public static final Item SP5__ENDERITE_SHOVEL = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_shovel",
            new ToolAPI.ShovelItem(ModToolMaterials.ENDERITE, 8, 1f -4f, new Item.Settings()));
    public static final Item SP5__ENDERITE_HOE = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_hoe",
            new ToolAPI.HoeItem(ModToolMaterials.ENDERITE, 3, 5.5f -4f, new Item.Settings()));
    public static final Item SP5__ENDERITE_PICKAXE = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_pickaxe",
            new ToolAPI.PickaxeItem(ModToolMaterials.ENDERITE, 7, 1.2f -4f, new Item.Settings()));

    public static final Item SP5__END_WOODEN_SWORD = SkyBlock.BuiltinRegistries.registerItem("sp5__end_wooden_sword",
            new ToolAPI.SwordItem(ToolMaterials.STONE, 5-2, 1.6f -4f, new Item.Settings()));
    public static final Item SP5__END_WOODEN_AXE = SkyBlock.BuiltinRegistries.registerItem("sp5__end_wooden_axe",
            new ToolAPI.AxeItem(ToolMaterials.STONE, 9-2, 0.8f -4f, new Item.Settings()));
    public static final Item SP5__END_WOODEN_SHOVEL = SkyBlock.BuiltinRegistries.registerItem("sp5__end_wooden_shovel",
            new ToolAPI.ShovelItem(ToolMaterials.STONE, 3.5f-2, 1f -4f, new Item.Settings()));
    public static final Item SP5__END_WOODEN_HOE = SkyBlock.BuiltinRegistries.registerItem("sp5__end_wooden_hoe",
            new ToolAPI.HoeItem(ToolMaterials.STONE, 1-2, 2f -4f, new Item.Settings()));
    public static final Item SP5__END_WOODEN_PICKAXE = SkyBlock.BuiltinRegistries.registerItem("sp5__end_wooden_pickaxe",
            new ToolAPI.PickaxeItem(ToolMaterials.STONE, 3-2, 1.2f -4f, new Item.Settings()));


    public static final Item SP5__BLUISHE_SWORD = SkyBlock.BuiltinRegistries.registerItem("sp5__bluishe_sword",
            new ToolAPI.SwordItem(ToolMaterials.IRON, 6-3, 1.6f -4f, new Item.Settings()));
    public static final Item SP5__BLUISHE_AXE = SkyBlock.BuiltinRegistries.registerItem("sp5__bluishe_axe",
            new ToolAPI.AxeItem(ToolMaterials.IRON, 9-3, 0.9f -4f, new Item.Settings()));
    public static final Item SP5__BLUISHE_SHOVEL = SkyBlock.BuiltinRegistries.registerItem("sp5__bluishe_shovel",
            new ToolAPI.ShovelItem(ToolMaterials.IRON, 4.5f-3, 1f -4f, new Item.Settings()));
    public static final Item SP5__BLUISHE_HOE = SkyBlock.BuiltinRegistries.registerItem("sp5__bluishe_hoe",
            new ToolAPI.HoeItem(ToolMaterials.IRON, 1-3, 3f -4f, new Item.Settings()));
    public static final Item SP5__BLUISHE_PICKAXE = SkyBlock.BuiltinRegistries.registerItem("sp5__bluishe_pickaxe",
            new ToolAPI.PickaxeItem(ToolMaterials.IRON, 4-3, 1.2f -4f, new Item.Settings()));
    public static final Item SP5__END_STONE_SWORD = SkyBlock.BuiltinRegistries.registerItem("sp5__end_stone_sword",
            new ToolAPI.SwordItem(ToolMaterials.IRON, 6-3, 1.6f -4f, new Item.Settings()));
    public static final Item SP5__END_STONE_AXE = SkyBlock.BuiltinRegistries.registerItem("sp5__end_stone_axe",
            new ToolAPI.AxeItem(ToolMaterials.IRON, 9-3, 0.9f -4f, new Item.Settings()));
    public static final Item SP5__END_STONE_SHOVEL = SkyBlock.BuiltinRegistries.registerItem("sp5__end_stone_shovel",
            new ToolAPI.ShovelItem(ToolMaterials.IRON, 4.5f-3, 1f -4f, new Item.Settings()));
    public static final Item SP5__END_STONE_HOE = SkyBlock.BuiltinRegistries.registerItem("sp5__end_stone_hoe",
            new ToolAPI.HoeItem(ToolMaterials.IRON, 1-3, 3f -4f, new Item.Settings()));
    public static final Item SP5__END_STONE_PICKAXE = SkyBlock.BuiltinRegistries.registerItem("sp5__end_stone_pickaxe",
            new ToolAPI.PickaxeItem(ToolMaterials.IRON, 4-3, 1.2f -4f, new Item.Settings()));
    //SKYBLOCK MAIN-BLOCK
    //ABYSS
    public static final Item ABYSS__ABERYTHE_GEM = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_gem",
            new Item(new Item.Settings()));
    public static final Item ABYSS__ABERYTHE_HELMET = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_helmet",
            new ArmorAPI.ArmorItem(ModArmorMaterials.ABERYTHE, ArmorItem.Type.HELMET, new Item.Settings(), 41));
    public static final Item ABYSS__ABERYTHE_CHESTPLATE = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_chestplate",
            new ArmorAPI.ArmorItem(ModArmorMaterials.ABERYTHE, ArmorItem.Type.CHESTPLATE, new Item.Settings(), 41));
    public static final Item ABYSS__ABERYTHE_LEGGINGS = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_leggings",
            new ArmorAPI.ArmorItem(ModArmorMaterials.ABERYTHE, ArmorItem.Type.LEGGINGS, new Item.Settings(), 41));
    public static final Item ABYSS__ABERYTHE_BOOTS = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_boots",
            new ArmorAPI.ArmorItem(ModArmorMaterials.ABERYTHE, ArmorItem.Type.BOOTS, new Item.Settings(), 41));
    public static final Item ABYSS__ABERYTHE_SWORD = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_sword",
            new ToolAPI.SwordItem(ModToolMaterials.ENDERITE, 1, 1.6f -4f, new Item.Settings()));
    public static final Item ABYSS__ABERYTHE_AXE = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_axe",
            new ToolAPI.AxeItem(ModToolMaterials.ENDERITE, 1, 1f -4f, new Item.Settings()));
    public static final Item ABYSS__ABERYTHE_SHOVEL = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_shovel",
            new ToolAPI.ShovelItem(ModToolMaterials.ENDERITE, 1, 1f -4f, new Item.Settings()));
    public static final Item ABYSS__ABERYTHE_HOE = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_hoe",
            new ToolAPI.HoeItem(ModToolMaterials.ENDERITE, 1, 5f -4f, new Item.Settings()));
    public static final Item ABYSS__ABERYTHE_PICKAXE = SkyBlock.BuiltinRegistries.registerItem("abyss__aberythe_pickaxe",
            new ToolAPI.PickaxeItem(ModToolMaterials.ENDERITE, 1, 1.2f -4f, new Item.Settings()));
    //ABYSS
    //MCD
    public static final Item MCD__SHORTBOW = SkyBlock.BuiltinRegistries.registerItem("mcd__shortbow",
            new ShortBowItem(new Item.Settings().maxDamage(384)));
    public static final Item MCD__LONGBOW = SkyBlock.BuiltinRegistries.registerItem("mcd__longbow",
            new ShortBowItem(new Item.Settings().maxDamage(384)));
    public static final Item MCD__TWIN_BOW = SkyBlock.BuiltinRegistries.registerItem("mcd__twin_bow",
            new BowItem(new Item.Settings().maxDamage(384)));
    public static final Item MCD__AUTO_CROSSBOW = SkyBlock.BuiltinRegistries.registerItem("mcd__auto_crossbow",
            new CrossbowItem(new Item.Settings().maxDamage(384)));
    public static final Item MCD__ARTIFACT_IRON_HIDE_AMULET= SkyBlock.BuiltinRegistries.registerItem("mcd__artifact_iron_hide_amulet",
            new IronSkinItem_Common(new Item.Settings().maxCount(1).maxDamage(10)));
    public static final Item SKYBLOCK__LIGHTNING_SWORD = SkyBlock.BuiltinRegistries.registerItem("skyblock__lightning_sword",
            new ToolAPI.SwordItem(ModToolMaterials.BENIKARD, 3, 3.5f -4f, new Item.Settings()));
    public static final Item MCD__DIAMOND_RAPIER = SkyBlock.BuiltinRegistries.registerItem("mcd__diamond_rapier",
            new RapierItem(ToolMaterials.DIAMOND, 2, Float.MAX_VALUE, new Item.Settings()));
    public static final Item MCD__GOLDEN_RAPIER = SkyBlock.BuiltinRegistries.registerItem("mcd__golden_rapier",
            new RapierItem(ToolMaterials.GOLD, 2, Float.MAX_VALUE, new Item.Settings()));
    public static final Item MCD__IRON_RAPIER = SkyBlock.BuiltinRegistries.registerItem("mcd__iron_rapier",
            new RapierItem(ToolMaterials.IRON, 2, Float.MAX_VALUE, new Item.Settings()));
    public static final Item MCD__NETHERITE_RAPIER = SkyBlock.BuiltinRegistries.registerItem("mcd__netherite_rapier",
            new RapierItem(ToolMaterials.NETHERITE, 2, Float.MAX_VALUE, new Item.Settings()));
    public static final Item MCD__STONE_RAPIER = SkyBlock.BuiltinRegistries.registerItem("mcd__stone_rapier",
            new RapierItem(ToolMaterials.STONE, 2, Float.MAX_VALUE, new Item.Settings()));
    public static final Item MCD__WOODEN_RAPIER = SkyBlock.BuiltinRegistries.registerItem("mcd__wooden_rapier",
            new RapierItem(ToolMaterials.WOOD, 2, Float.MAX_VALUE, new Item.Settings()));

    public static final Item SP5__ENDERITE_RAPIER = SkyBlock.BuiltinRegistries.registerItem("sp5__enderite_rapier",
            new RapierItem(ModToolMaterials.ENDERITE, 8, Float.MAX_VALUE, new Item.Settings()));
    public static final Item SP5__END_WOODEN_RAPIER = SkyBlock.BuiltinRegistries.registerItem("sp5__end_wooden_rapier",
            new RapierItem(ToolMaterials.STONE, 2, Float.MAX_VALUE, new Item.Settings()));
    public static final Item SP5__END_STONE_RAPIER = SkyBlock.BuiltinRegistries.registerItem("sp5__end_stone_rapier",
            new RapierItem(ToolMaterials.IRON, 2, Float.MAX_VALUE, new Item.Settings()));
    public static final Item SP5__BLUISHE_RAPIER = SkyBlock.BuiltinRegistries.registerItem("sp5__bluishe_rapier",
            new RapierItem(ToolMaterials.IRON, 2, Float.MAX_VALUE, new Item.Settings()));
    //MCD
    // <BACKPORTED FEATURES>
    /** Ominous Bottle (1.21 Feature) */
    @Deprecated
    public static final Item BP__OMINOUS_BOTTLE = SkyBlock.BuiltinRegistries.registerItem("bp__ominous_bottle",
            new OminousBottleItem(new Item.Settings().food(FoodComponents.OMINOUS_BOTTLE).component(DataComponentTypes.OMINOUS_BOTTLE_AMPLIFIER, 0)));
    // <BACKPORTED FEATURES>
    //HALLOWEEN (UNIVERSAL)
    public static final Item H__ANOMALITE_FRAGMENT = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_fragment",
            new Item(new Item.Settings()));
    public static final Item H__ANOMALITE_HANDLE = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_handle",
            new Item(new Item.Settings()));
    public static final Item H__NODE_CORE = SkyBlock.BuiltinRegistries.registerItem("h__node_core",
            new Item(new Item.Settings()));
    public static final Item H__PEARL_OF_DARKNESS = SkyBlock.BuiltinRegistries.registerItem("h__pearl_of_darkness",
            new Item(new Item.Settings()));
    public static final Item H__ANOMALITE_AXE = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_axe",
            new UnenchantableAxeItem(ModToolMaterials.H__ANOMALITE, 10, 1.0f -4f, new Item.Settings()));
    public static final Item H__ANOMALITE_SWORD = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_sword",
            new UnenchantableSwordItem(ModToolMaterials.H__ANOMALITE, 8, 1.6f -4f, new Item.Settings()));
    public static final Item H__ANOMALITE_PICKAXE = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_pickaxe",
            new UnenchantablePickaxeItem(ModToolMaterials.H__ANOMALITE, 6, 1.2f -4f, new Item.Settings()));
    public static final Item H__ANOMALITE_HELMET = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_helmet",
            new AnomaliteArmorItem(ModArmorMaterials.H__ANOMALITE, ArmorItem.Type.HELMET, new Item.Settings(), 40));
    public static final Item H__ANOMALITE_CHESTPLATE = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_chestplate",
            new AnomaliteArmorItem(ModArmorMaterials.H__ANOMALITE, ArmorItem.Type.CHESTPLATE, new Item.Settings(), 40));
    public static final Item H__ANOMALITE_LEGGINGS = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_leggings",
            new AnomaliteArmorItem(ModArmorMaterials.H__ANOMALITE, ArmorItem.Type.LEGGINGS, new Item.Settings(), 40));
    public static final Item H__ANOMALITE_BOOTS = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_boots",
            new AnomaliteArmorItem(ModArmorMaterials.H__ANOMALITE, ArmorItem.Type.BOOTS, new Item.Settings(), 40));
    // <HALLOWEEN 2023 EXCLUSIVE>
    @Deprecated
    public static final Item H__ANOMALITE_SWORD1 = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_sword1",
            new UnenchantableSwordItem(ModToolMaterials.H__ANOMALITE, 8, 1.6f -4f, new Item.Settings()));
    @Deprecated
    public static final Item H__ANOMALITE_SWORD2 = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_sword2",
            new UnenchantableSwordItem(ModToolMaterials.H__ANOMALITE, 8, 1.6f -4f, new Item.Settings()));
    @Deprecated
    public static final Item H__ANOMALITE_PICKAXE1 = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_pickaxe1",
            new UnenchantablePickaxeItem(ModToolMaterials.H__ANOMALITE, 6, 1.2f -4f, new Item.Settings()));
    @Deprecated
    public static final Item H__ANOMALITE_PICKAXE2 = SkyBlock.BuiltinRegistries.registerItem("h__anomalite_pickaxe2",
            new UnenchantablePickaxeItem(ModToolMaterials.H__ANOMALITE, 6, 1.2f -4f, new Item.Settings()));
    @Deprecated
    public static final Item H__PLASMA_1 = SkyBlock.BuiltinRegistries.registerItem("h__plasma_1",
            new Item(new Item.Settings()));
    @Deprecated
    public static final Item H__PLASMA_2 = SkyBlock.BuiltinRegistries.registerItem("h__plasma_2",
            new Item(new Item.Settings()));
    // <HALLOWEEN 2023 EXCLUSIVE>
    // <HALLOWEEN 2024 EXCLUSIVE>
    // <HALLOWEEN 2024 EXCLUSIVE>
    //HALLOWEEN (UNIVERSAL)
    //unimplemented TODO
    public static final Item MCD__VILLAGER_STATUE = SkyBlock.BuiltinRegistries.registerItem("mcd__villager_statue",
            new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item SP5__FORBIDDEN_POTION = SkyBlock.BuiltinRegistries.registerItem("sp5__forbidden_potion",
            new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1)));
    public static final Item SP5__GOD_POTION = SkyBlock.BuiltinRegistries.registerItem("sp5__god_potion",
            new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1)));
    public static final Item SP5__END_CAKE = SkyBlock.BuiltinRegistries.registerItem("sp5__end_cake",
            new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item SP5__END_MILK = SkyBlock.BuiltinRegistries.registerItem("sp5__end_milk",
            new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1)));
    public static final Item SP5__CORCODUS_FRUIT = SkyBlock.BuiltinRegistries.registerItem("sp5__corcodus_fruit",
            new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item SP5__END_VINES = SkyBlock.BuiltinRegistries.registerItem("sp5__end_vines",
            new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item MCD__DIAMOND_KEY = SkyBlock.BuiltinRegistries.registerItem("mcd__diamond_key",
            new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1)));
    public static final Item MCD__GOLD_KEY = SkyBlock.BuiltinRegistries.registerItem("mcd__gold_key",
            new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1)));
    public static final Item SP5__END_BREAD = SkyBlock.BuiltinRegistries.registerItem("sp5__end_bread",
            new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item SP5__END_WHEAT = SkyBlock.BuiltinRegistries.registerItem("sp5__end_wheat",
            new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item SP5__END_WHEAT_SEEDS = SkyBlock.BuiltinRegistries.registerItem("sp5__end_wheat_seeds",
            new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item SP5__NAVI_FRUIT = SkyBlock.BuiltinRegistries.registerItem("sp5__navi_fruit",
            new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item SP5__END_BEEF = SkyBlock.BuiltinRegistries.registerItem("sp5__end_beef",
            new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item SP5__COOKED_END_BEEF = SkyBlock.BuiltinRegistries.registerItem("sp5__cooked_end_beef",
            new Item(new Item.Settings().rarity(Rarity.EPIC)));
    //unimplemented
    public static void register() {
        SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering Items for " + SkyBlock.MOD_ID);
    }
}
