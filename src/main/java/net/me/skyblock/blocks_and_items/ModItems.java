package net.me.skyblock.blocks_and_items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.blocks_and_items.items.end.EnchantedEnderiteAppleItem;
import net.me.skyblock.blocks_and_items.items.abyss.Loran;
import net.me.skyblock.blocks_and_items.items.util.AnomaliteArmorItem;
import net.me.skyblock.blocks_and_items.items.util.NullItem;
import net.me.skyblock.blocks_and_items.items.util.TileBlankItem;
import net.me.skyblock.blocks_and_items.items.util.basic.ModFoodComponents;
import net.me.skyblock.blocks_and_items.items.util.basic.ModToolMaterials;
import net.me.skyblock.blocks_and_items.items.mcd.mcd_artifact.IronSkinItem_Common;
import net.me.skyblock.blocks_and_items.items.util.basic.ModArmorMaterials;
import net.me.skyblock.blocks_and_items.items.util.basic.ModAxeItem;
import net.me.skyblock.blocks_and_items.items.mcd.mcd_artifact.IronSkinItem;
import net.me.skyblock.blocks_and_items.items.mcd.mcd_ranged.ShortBowItem;
import net.me.skyblock.blocks_and_items.items.util.custom_unenchantable.UnenchantablePickaxeItem;
import net.me.skyblock.blocks_and_items.items.util.custom_unenchantable.UnenchantableSwordItem;
import net.me.skyblock.sound.ModSounds;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    //SKYBLOCK MAIN-BLOCK
    public static final Item FYBERITE = registerItem("fyberite_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ANT_BOTTLE = registerItem("ant_bottle",
            new Item(new FabricItemSettings()));
    public static final Item BOTTLE_OF_ANT_JAM = registerItem("bottle_of_ant_jam",
            new Item(new FabricItemSettings().recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item MUSIC_DISC_WITHERSTORM = registerItem("music_disc_wither_storm_theme",
            new MusicDiscItem(6, ModSounds.WITHERSTORM_THEME, new  FabricItemSettings().maxCount(1).rarity(Rarity.RARE),188));
    public static final Item DISC_FRAGMENT_WITHERSTORM = registerItem("disc_fragment_wither_storm_theme",
            new DiscFragmentItem(new FabricItemSettings()));
    public static final Item ENDERITE_APPLE = registerItem("enderite_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.ENDERITE_APPLE)));
    public static final Item ENCHANTED_ENDERITE_APPLE = registerItem("enchanted_enderite_apple",
            new EnchantedEnderiteAppleItem(new FabricItemSettings().food(ModFoodComponents.ENCHANTED_ENDERITE_APPLE)));
    public static final Item SUGAR_POPPY_MIXTURE = registerItem("sugar_poppy_mixture",
            new Item(new FabricItemSettings()));
    public static final Item STEAM_DUMPLING_FRESH = registerItem("steam_dumpling_raw",
            new Item(new FabricItemSettings()));
    public static final Item STEAM_DUMPLING = registerItem("steam_dumpling",
            new Item(new FabricItemSettings().food(ModFoodComponents.STEAM_DUMPLING)));
    public static final Item STEAM_DUMPLING_WITH_MOLTEN_BUTTER = registerItem("steam_dumpling_with_molten_butter",
            new Item(new FabricItemSettings().food(ModFoodComponents.STEAM_DUMPLING_WITH_MOLTEN_BUTTER)));
    public static final Item STEAM_DUMPLING_WITH_MOLTEN_BUTTER_AND_SUGAR_POPPY_MIXTURE = registerItem("steam_dumpling_with_molten_butter_and_sugar_poppy_mixture",
            new Item(new FabricItemSettings().food(ModFoodComponents.STEAM_DUMPLING_WITH_MOLTEN_BUTTER_AND_SUGAR_POPPY_MIXTURE)));
    public static final Item LORAN = registerItem("loran",
            new Loran(new FabricItemSettings()));
    public static final Item ABYSS_PORTAL_ACTIVATOR = registerItem("abyss_portal_activator",
            new Item(new FabricItemSettings()));
    public static final Item ENDER_STICK = registerItem("ender_stick",
            new Item(new FabricItemSettings()));
    public static final Item ENDMERALD = registerItem("end_emerald",
            new Item(new FabricItemSettings()));
    public static final Item MELTE_RESIDUES = registerItem("melte_residues",
            new Item(new FabricItemSettings()));
    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ENDERITE_HELMET = registerItem("enderite_helmet",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ENDERITE_CHESTPLATE = registerItem("enderite_chestplate",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ENDERITE_LEGGINGS = registerItem("enderite_leggings",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ENDERITE_BOOTS = registerItem("enderite_boots",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item ENDERITE_SWORD = registerItem("enderite_sword",
            new SwordItem(ModToolMaterials.ENDERITE, 9, 1.6f -4f, new FabricItemSettings()));
    public static final Item ENDERITE_AXE = registerItem("enderite_axe",
            new ModAxeItem(ModToolMaterials.ENDERITE, 11, 1f -4f, new FabricItemSettings()));
    public static final Item ENDERITE_SHOVEL = registerItem("enderite_shovel",
            new ShovelItem(ModToolMaterials.ENDERITE, 8, 1f -4f, new FabricItemSettings()));
    public static final Item ENDERITE_HOE = registerItem("enderite_hoe",
            new HoeItem(ModToolMaterials.ENDERITE, 3, 5.5f -4f, new FabricItemSettings()));
    public static final Item ENDERITE_PICKAXE = registerItem("enderite_pickaxe",
            new PickaxeItem(ModToolMaterials.ENDERITE, 7, 1.2f -4f, new FabricItemSettings()));
    //SKYBLOCK MAIN-BLOCK
    //ABYSS
    public static final Item ABERYTHE_GEM = registerItem("aberythe_gem",
            new Item(new FabricItemSettings()));
    public static final Item ABERYTHE_HELMET = registerItem("aberythe_helmet",
            new ArmorItem(ModArmorMaterials.ABERYTHE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ABERYTHE_CHESTPLATE = registerItem("aberythe_chestplate",
            new ArmorItem(ModArmorMaterials.ABERYTHE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ABERYTHE_LEGGINGS = registerItem("aberythe_leggings",
            new ArmorItem(ModArmorMaterials.ABERYTHE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ABERYTHE_BOOTS = registerItem("aberythe_boots",
            new ArmorItem(ModArmorMaterials.ABERYTHE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item ABERYTHE_SWORD = registerItem("aberythe_sword",
            new SwordItem(ModToolMaterials.ENDERITE, 1, 1.6f -4f, new FabricItemSettings()));
    public static final Item ABERYTHE_AXE = registerItem("aberythe_axe",
            new ModAxeItem(ModToolMaterials.ENDERITE, 1, 1f -4f, new FabricItemSettings()));
    public static final Item ABERYTHE_SHOVEL = registerItem("aberythe_shovel",
            new ShovelItem(ModToolMaterials.ENDERITE, 1, 1f -4f, new FabricItemSettings()));
    public static final Item ABERYTHE_HOE = registerItem("aberythe_hoe",
            new HoeItem(ModToolMaterials.ENDERITE, 1, 5f -4f, new FabricItemSettings()));
    public static final Item ABERYTHE_PICKAXE = registerItem("aberythe_pickaxe",
            new PickaxeItem(ModToolMaterials.ENDERITE, 1, 1.2f -4f, new FabricItemSettings()));
    //ABYSS
    //MCD
    public static final Item SHORTBOW = registerItem("shortbow",
            new ShortBowItem(new FabricItemSettings().maxDamage(384)));
    public static final Item LONGBOW = registerItem("longbow",
            new ShortBowItem(new FabricItemSettings().maxDamage(384)));
    public static final Item TWIN_BOW = registerItem("twin_bow",
            new BowItem(new FabricItemSettings().maxDamage(384)));
    public static final Item AUTO_CROSSBOW = registerItem("auto_crossbow",
            new CrossbowItem(new FabricItemSettings().maxDamage(384)));
    public static final Item MCD__ARTIFACT_IRON_HIDE_AMULET= registerItem("mcd__artifact_iron_hide_amulet",
            new IronSkinItem_Common( new FabricItemSettings().maxCount(1).maxDamage(10)));
    public static final Item LIGHTNING_SWORD = registerItem("lightning_sword",
            new SwordItem(ModToolMaterials.BENIKARD, 3, 3.5f -4f, new FabricItemSettings()));
    public static final Item DIAMOND_RAPIER = registerItem("diamond_rapier",
            new SwordItem(ToolMaterials.DIAMOND, 2, 3.4028235E38f, new FabricItemSettings()));
    public static final Item GOLDEN_RAPIER = registerItem("golden_rapier",
            new SwordItem(ToolMaterials.GOLD, 2, 3.4028235E38f, new FabricItemSettings()));
    public static final Item IRON_RAPIER = registerItem("iron_rapier",
            new SwordItem(ToolMaterials.IRON, 2, 3.4028235E38f, new FabricItemSettings()));
    public static final Item NETHERITE_RAPIER = registerItem("netherite_rapier",
            new SwordItem(ToolMaterials.NETHERITE, 2, 3.4028235E38f, new FabricItemSettings()));
    public static final Item STONE_RAPIER = registerItem("stone_rapier",
            new SwordItem(ToolMaterials.STONE, 2, 3.4028235E38f, new FabricItemSettings()));
    public static final Item WOODEN_RAPIER = registerItem("wooden_rapier",
            new SwordItem(ToolMaterials.WOOD, 2, 3.4028235E38f, new FabricItemSettings()));
    //MCD
    //HALLOWEEN 2023
    public static final Item H__ANOMALITE_FRAGMENT = registerItem("h__anomalite_fragment",
            new Item(new FabricItemSettings()));
    public static final Item H__ANOMALITE_HANDLE = registerItem("h__anomalite_handle",
            new Item(new FabricItemSettings()));
    public static final Item H__PLASMA_1 = registerItem("h__plasma_1",
            new Item(new FabricItemSettings()));
    public static final Item H__PLASMA_2 = registerItem("h__plasma_2",
            new Item(new FabricItemSettings()));
    public static final Item H__NODE_CORE = registerItem("h__node_core",
            new Item(new FabricItemSettings()));
    public static final Item H__PEARL_OF_DARKNESS = registerItem("h__pearl_of_darkness",
            new Item(new FabricItemSettings()));
    public static final Item H__ANOMALITE_SWORD = registerItem("h__anomalite_sword",
            new UnenchantableSwordItem(ModToolMaterials.H__ANOMALITE, 8, 1.6f -4f, new FabricItemSettings()));
    public static final Item H__ANOMALITE_SWORD1 = registerItem("h__anomalite_sword1",
            new UnenchantableSwordItem(ModToolMaterials.H__ANOMALITE, 8, 1.6f -4f, new FabricItemSettings()));
    public static final Item H__ANOMALITE_SWORD2 = registerItem("h__anomalite_sword2",
            new UnenchantableSwordItem(ModToolMaterials.H__ANOMALITE, 8, 1.6f -4f, new FabricItemSettings()));
    public static final Item H__ANOMALITE_PICKAXE = registerItem("h__anomalite_pickaxe",
            new UnenchantablePickaxeItem(ModToolMaterials.H__ANOMALITE, 6, 1.2f -4f, new FabricItemSettings()));
    public static final Item H__ANOMALITE_PICKAXE1 = registerItem("h__anomalite_pickaxe1",
            new UnenchantablePickaxeItem(ModToolMaterials.H__ANOMALITE, 6, 1.2f -4f, new FabricItemSettings()));
    public static final Item H__ANOMALITE_PICKAXE2 = registerItem("h__anomalite_pickaxe2",
            new UnenchantablePickaxeItem(ModToolMaterials.H__ANOMALITE, 6, 1.2f -4f, new FabricItemSettings()));
    public static final Item H__ANOMALITE_HELMET = registerItem("h__anomalite_helmet",
            new AnomaliteArmorItem(ModArmorMaterials.H__ANOMALITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item H__ANOMALITE_CHESTPLATE = registerItem("h__anomalite_chestplate",
            new AnomaliteArmorItem(ModArmorMaterials.H__ANOMALITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item H__ANOMALITE_LEGGINGS = registerItem("h__anomalite_leggings",
            new AnomaliteArmorItem(ModArmorMaterials.H__ANOMALITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item H__ANOMALITE_BOOTS = registerItem("h__anomalite_boots",
            new AnomaliteArmorItem(ModArmorMaterials.H__ANOMALITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    //HALLOWEEN 2023
    //UNUSED
    public static final Item Z__LOGO_V1 = registerItem("z__logo_v1",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO_V2 = registerItem("z__logo_v2",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO_V3 = registerItem("z__logo_v3",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO_V4 = registerItem("z__logo_v4",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO1 = registerItem("z__logo1",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO2 = registerItem("z__logo2",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO3 = registerItem("z__logo3",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO4 = registerItem("z__logo4",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO5 = registerItem("z__logo5",
            new Item(new FabricItemSettings()));
    public static final Item Z__LOGO6 = registerItem("z__logo6",
            new Item(new FabricItemSettings()));
    public static final Item Z__TILE_BLANK = registerItem("z__tile_blank",
            new TileBlankItem(Blocks.AIR, new FabricItemSettings()));
    public static final Item Z__TILE_SKYBLOCK_1 = registerItem("z__tile_skyblock_1",
            new Item(new FabricItemSettings()));
    public static final Item Z__TILE_SKYBLOCK_2 = registerItem("z__tile_skyblock_2",
            new Item(new FabricItemSettings()));
    public static final Item Z__TILE_SKYBLOCK_3 = registerItem("z__tile_skyblock_3",
            new Item(new FabricItemSettings()));
    public static final Item Z__TILE_SKYBLOCK_4 = registerItem("z__tile_skyblock_4",
            new Item(new FabricItemSettings()));
    public static final Item Z__TILE_SKYBLOCK_5 = registerItem("z__tile_skyblock_5",
            new Item(new FabricItemSettings()));
    public static final Item Z__TILE_SKYBLOCK_6 = registerItem("z__tile_skyblock_6",
            new Item(new FabricItemSettings()));
    public static final Item Z__TILE_SKYBLOCK_7 = registerItem("z__tile_skyblock_7",
            new Item(new FabricItemSettings()));
    public static final Item Z__TILE_SKYBLOCK_8 = registerItem("z__tile_skyblock_8",
            new Item(new FabricItemSettings()));
    public static final Item Z__TILE_SKYBLOCK_9 = registerItem("z__tile_skyblock_9",
            new Item(new FabricItemSettings()));
    public static final Item Z__NULL = registerItem("z__null",
            new NullItem(Blocks.AIR, new FabricItemSettings()));
    //UNUSED

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SkyBlock.MOD_ID, name), item);
    }
    public static void registerModItems () {
        SkyBlock.LOGGER.debug("Registering Items for " + SkyBlock.MOD_ID);
    }
    protected static Item register(Block block, Item item) {
        return ModItems.register(Registries.BLOCK.getId(block), item);
    }
    private static Item register(Identifier id, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registries.ITEM, id, item);
    }
}
