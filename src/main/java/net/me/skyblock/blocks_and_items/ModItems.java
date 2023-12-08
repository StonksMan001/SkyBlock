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
    public static final Item SKYBLOCK__FYBERITE = registerItem("skyblock__fyberite_ingot",
            new Item(new FabricItemSettings()));
    public static final Item SKYBLOCK__ANT_BOTTLE = registerItem("skyblock__ant_bottle",
            new Item(new FabricItemSettings()));
    public static final Item SKYBLOCK__BOTTLE_OF_ANT_JAM = registerItem("skyblock__bottle_of_ant_jam",
            new Item(new FabricItemSettings().recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item WITHERSTORM__MUSIC_DISC_WITHERSTORM = registerItem("witherstorm__music_disc_witherstorm_theme",
            new MusicDiscItem(6, ModSounds.WITHERSTORM_THEME, new  FabricItemSettings().maxCount(1).rarity(Rarity.RARE),188));
    public static final Item WITHERSTORM__DISC_FRAGMENT_WITHERSTORM = registerItem("witherstorm__disc_fragment_witherstorm_theme",
            new DiscFragmentItem(new FabricItemSettings()));
    public static final Item SP5__ENDERITE_APPLE = registerItem("sp5__enderite_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.ENDERITE_APPLE)));
    public static final Item SP5__ENCHANTED_ENDERITE_APPLE = registerItem("sp5__enchanted_enderite_apple",
            new EnchantedEnderiteAppleItem(new FabricItemSettings().food(ModFoodComponents.ENCHANTED_ENDERITE_APPLE)));
    public static final Item SKYBLOCK__SUGAR_POPPY_MIXTURE = registerItem("skyblock__sugar_poppy_mixture",
            new Item(new FabricItemSettings()));
    public static final Item SKYBLOCK__STEAM_DUMPLING_FRESH = registerItem("skyblock__steam_dumpling_raw",
            new Item(new FabricItemSettings()));
    public static final Item SKYBLOCK__STEAM_DUMPLING = registerItem("skyblock__steam_dumpling",
            new Item(new FabricItemSettings().food(ModFoodComponents.STEAM_DUMPLING)));
    public static final Item SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER = registerItem("skyblock__steam_dumpling_with_molten_butter",
            new Item(new FabricItemSettings().food(ModFoodComponents.STEAM_DUMPLING_WITH_MOLTEN_BUTTER)));
    public static final Item SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER_AND_SUGAR_POPPY_MIXTURE = registerItem("skyblock__steam_dumpling_with_molten_butter_and_sugar_poppy_mixture",
            new Item(new FabricItemSettings().food(ModFoodComponents.STEAM_DUMPLING_WITH_MOLTEN_BUTTER_AND_SUGAR_POPPY_MIXTURE)));
    public static final Item ABYSS__LORAN = registerItem("abyss__loran",
            new Loran(new FabricItemSettings()));
    public static final Item ABYSS__ABYSS_PORTAL_ACTIVATOR = registerItem("abyss__abyss_portal_activator",
            new Item(new FabricItemSettings()));
    public static final Item SP5__ENDER_STICK = registerItem("sp5__ender_stick",
            new Item(new FabricItemSettings()));
    public static final Item SP5__ENDMERALD = registerItem("sp5__end_emerald",
            new Item(new FabricItemSettings()));
    public static final Item SP5__MELTED_RESIDUES = registerItem("sp5__melted_residues",
            new Item(new FabricItemSettings()));
    public static final Item SP5__ENDERITE_INGOT = registerItem("sp5__enderite_ingot",
            new Item(new FabricItemSettings()));
    public static final Item SP5__ENDERITE_HELMET = registerItem("sp5__enderite_helmet",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SP5__ENDERITE_CHESTPLATE = registerItem("sp5__enderite_chestplate",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SP5__ENDERITE_LEGGINGS = registerItem("sp5__enderite_leggings",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SP5__ENDERITE_BOOTS = registerItem("sp5__enderite_boots",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item SP5__ENDERITE_SWORD = registerItem("sp5__enderite_sword",
            new SwordItem(ModToolMaterials.ENDERITE, 9, 1.6f -4f, new FabricItemSettings()));
    public static final Item SP5__ENDERITE_AXE = registerItem("sp5__enderite_axe",
            new ModAxeItem(ModToolMaterials.ENDERITE, 11, 1f -4f, new FabricItemSettings()));
    public static final Item SP5__ENDERITE_SHOVEL = registerItem("sp5__enderite_shovel",
            new ShovelItem(ModToolMaterials.ENDERITE, 8, 1f -4f, new FabricItemSettings()));
    public static final Item SP5__ENDERITE_HOE = registerItem("sp5__enderite_hoe",
            new HoeItem(ModToolMaterials.ENDERITE, 3, 5.5f -4f, new FabricItemSettings()));
    public static final Item SP5__ENDERITE_PICKAXE = registerItem("sp5__enderite_pickaxe",
            new PickaxeItem(ModToolMaterials.ENDERITE, 7, 1.2f -4f, new FabricItemSettings()));
    //SKYBLOCK MAIN-BLOCK
    //ABYSS
    public static final Item ABYSS__ABERYTHE_GEM = registerItem("abyss__aberythe_gem",
            new Item(new FabricItemSettings()));
    public static final Item ABYSS__ABERYTHE_HELMET = registerItem("abyss__aberythe_helmet",
            new ArmorItem(ModArmorMaterials.ABERYTHE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ABYSS__ABERYTHE_CHESTPLATE = registerItem("abyss__aberythe_chestplate",
            new ArmorItem(ModArmorMaterials.ABERYTHE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ABYSS__ABERYTHE_LEGGINGS = registerItem("abyss__aberythe_leggings",
            new ArmorItem(ModArmorMaterials.ABERYTHE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ABYSS__ABERYTHE_BOOTS = registerItem("abyss__aberythe_boots",
            new ArmorItem(ModArmorMaterials.ABERYTHE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item ABYSS__ABERYTHE_SWORD = registerItem("abyss__aberythe_sword",
            new SwordItem(ModToolMaterials.ENDERITE, 1, 1.6f -4f, new FabricItemSettings()));
    public static final Item ABYSS__ABERYTHE_AXE = registerItem("abyss__aberythe_axe",
            new ModAxeItem(ModToolMaterials.ENDERITE, 1, 1f -4f, new FabricItemSettings()));
    public static final Item ABYSS__ABERYTHE_SHOVEL = registerItem("abyss__aberythe_shovel",
            new ShovelItem(ModToolMaterials.ENDERITE, 1, 1f -4f, new FabricItemSettings()));
    public static final Item ABYSS__ABERYTHE_HOE = registerItem("abyss__aberythe_hoe",
            new HoeItem(ModToolMaterials.ENDERITE, 1, 5f -4f, new FabricItemSettings()));
    public static final Item ABYSS__ABERYTHE_PICKAXE = registerItem("abyss__aberythe_pickaxe",
            new PickaxeItem(ModToolMaterials.ENDERITE, 1, 1.2f -4f, new FabricItemSettings()));
    //ABYSS
    //MCD
    public static final Item MCD__SHORTBOW = registerItem("mcd__shortbow",
            new ShortBowItem(new FabricItemSettings().maxDamage(384)));
    public static final Item MCD__LONGBOW = registerItem("mcd__longbow",
            new ShortBowItem(new FabricItemSettings().maxDamage(384)));
    public static final Item MCD__TWIN_BOW = registerItem("mcd__twin_bow",
            new BowItem(new FabricItemSettings().maxDamage(384)));
    public static final Item MCD__AUTO_CROSSBOW = registerItem("mcd__auto_crossbow",
            new CrossbowItem(new FabricItemSettings().maxDamage(384)));
    public static final Item MCD__ARTIFACT_IRON_HIDE_AMULET= registerItem("mcd__artifact_iron_hide_amulet",
            new IronSkinItem_Common( new FabricItemSettings().maxCount(1).maxDamage(10)));
    public static final Item SKYBLOCK__LIGHTNING_SWORD = registerItem("skyblock__lightning_sword",
            new SwordItem(ModToolMaterials.BENIKARD, 3, 3.5f -4f, new FabricItemSettings()));
    public static final Item MCD__DIAMOND_RAPIER = registerItem("mcd__diamond_rapier",
            new SwordItem(ToolMaterials.DIAMOND, 2, 3.4028235E38f, new FabricItemSettings()));
    public static final Item MCD__GOLDEN_RAPIER = registerItem("mcd__golden_rapier",
            new SwordItem(ToolMaterials.GOLD, 2, 3.4028235E38f, new FabricItemSettings()));
    public static final Item MCD__IRON_RAPIER = registerItem("mcd__iron_rapier",
            new SwordItem(ToolMaterials.IRON, 2, 3.4028235E38f, new FabricItemSettings()));
    public static final Item MCD__NETHERITE_RAPIER = registerItem("mcd__netherite_rapier",
            new SwordItem(ToolMaterials.NETHERITE, 2, 3.4028235E38f, new FabricItemSettings()));
    public static final Item MCD__STONE_RAPIER = registerItem("mcd__stone_rapier",
            new SwordItem(ToolMaterials.STONE, 2, 3.4028235E38f, new FabricItemSettings()));
    public static final Item MCD__WOODEN_RAPIER = registerItem("mcd__wooden_rapier",
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
    public static final Item SKYBLOCK__DUCKWEED = registerBlockItem(
            new PlaceableOnWaterItem(ModBlocks.SKYBLOCK__DUCKWEED, new Item.Settings()));



    //HALLOWEEN 2023
    //UNUSED
    //UNUSED

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SkyBlock.MOD_ID, name), item);
    }
    public static void registerModItems () {
        SkyBlock.LOGGER.debug("Registering Items for " + SkyBlock.MOD_ID);
    }
    protected static Item registerBlockAndItem(Block block, Item item) {
        return ModItems.register(Registries.BLOCK.getId(block), item);
    }
    public static Item registerBlockItem(BlockItem item) {
        return Items.register(item.getBlock(), item);
    }
    private static Item register(Identifier id, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registries.ITEM, id, item);
    }
}
