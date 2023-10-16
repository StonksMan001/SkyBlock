package net.me.skyblock.blocks_and_items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.blocks_and_items.items.end.EnchantedEnderiteAppleItem;
import net.me.skyblock.blocks_and_items.items.abyss.Loran;
import net.me.skyblock.blocks_and_items.items.util.ModFoodComponents;
import net.me.skyblock.blocks_and_items.items.util.ModToolMaterials;
import net.me.skyblock.blocks_and_items.items.mcd.mcd_artifact.IronSkinItem_Common;
import net.me.skyblock.blocks_and_items.items.util.ModArmorMaterials;
import net.me.skyblock.blocks_and_items.items.util.ModAxeItem;
import net.me.skyblock.blocks_and_items.items.mcd.mcd_artifact.IronSkinItem_Rare;
import net.me.skyblock.blocks_and_items.items.mcd.mcd_ranged.ShortBowItem;
import net.me.skyblock.sound.ModSounds;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item FYBERITE = registerItem("fyberite_ingot",
            new Item(new FabricItemSettings()));
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
    //ENDERITE
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
            new SwordItem(ModToolMaterials.ENDERITE, 2, -2.4f, new FabricItemSettings()));
    public static final Item ENDERITE_AXE = registerItem("enderite_axe",
            new ModAxeItem(ModToolMaterials.ENDERITE, 4, -3.0f, new FabricItemSettings()));
    public static final Item ENDERITE_SHOVEL = registerItem("enderite_shovel",
            new ShovelItem(ModToolMaterials.ENDERITE, 1, -3.0f, new FabricItemSettings()));
    public static final Item ENDERITE_HOE = registerItem("enderite_hoe",
            new HoeItem(ModToolMaterials.ENDERITE, -4, 1.5f, new FabricItemSettings()));
    public static final Item ENDERITE_PICKAXE = registerItem("enderite_pickaxe",
            new PickaxeItem(ModToolMaterials.ENDERITE, 0, -2.8f, new FabricItemSettings()));
    //ENDERITE
    //ABERYTHE
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
            new SwordItem(ModToolMaterials.ENDERITE, 2, -2.4f, new FabricItemSettings()));
    public static final Item ABERYTHE_AXE = registerItem("aberythe_axe",
            new ModAxeItem(ModToolMaterials.ENDERITE, 4, -3.0f, new FabricItemSettings()));
    public static final Item ABERYTHE_SHOVEL = registerItem("aberythe_shovel",
            new ShovelItem(ModToolMaterials.ENDERITE, 1, -3.0f, new FabricItemSettings()));
    public static final Item ABERYTHE_HOE = registerItem("aberythe_hoe",
            new HoeItem(ModToolMaterials.ENDERITE, -4, 0.2f, new FabricItemSettings()));
    public static final Item ABERYTHE_PICKAXE = registerItem("aberythe_pickaxe",
            new PickaxeItem(ModToolMaterials.ENDERITE, 0, -2.8f, new FabricItemSettings()));
    //ABERYTHE
    public static final Item ANT_BOTTLE = registerItem("ant_bottle",
            new Item(new FabricItemSettings()));
    public static final Item BOTTLE_OF_ANT_JAM = registerItem("bottle_of_ant_jam",
            new Item(new FabricItemSettings().recipeRemainder(Items.GLASS_BOTTLE)));
    //MCD
    public static final Item SHORTBOW = registerItem("shortbow",
            new ShortBowItem(new FabricItemSettings().maxDamage(384)));
    public static final Item LONGBOW = registerItem("longbow",
            new ShortBowItem(new FabricItemSettings().maxDamage(384)));
    public static final Item TWIN_BOW = registerItem("twin_bow",
            new BowItem(new FabricItemSettings().maxDamage(384)));
    public static final Item AUTO_CROSSBOW = registerItem("auto_crossbow",
            new CrossbowItem(new FabricItemSettings().maxDamage(384)));
    public static final Item ARTIFACT_IRON_HIDE_AMULET_COMMON= registerItem("artifact_iron_hide_amulet_common",
            new IronSkinItem_Common( new FabricItemSettings().maxCount(1).maxDamage(10)));
    public static final Item ARTIFACT_IRON_HIDE_AMULET_RARE= registerItem("artifact_iron_hide_amulet_rare",
            new IronSkinItem_Rare( new FabricItemSettings().maxCount(1).maxDamage(15)));
    //MCD
    public static final Item LIGHTNING_SWORD = registerItem("lightning_sword",
            new SwordItem(ModToolMaterials.BENIKARD, 2, -0.5f, new FabricItemSettings()));

    //RAPIERS
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
    //RAPIERS

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SkyBlock.MOD_ID, name), item);
    }
    public static void registerModItems () {
        SkyBlock.LOGGER.debug("Registering Mod Items for " + SkyBlock.MOD_ID);
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
