package net.me.abyss_innermod.registries;

import net.me.abyss_innermod.items.Loran;
import net.me.skycore_supermod.common_registries.SkyCore_ToolMaterials;
import net.me.skycore_supermod.ArmorAPI;
import net.me.skycore_supermod.ToolAPI;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class Abyss_Items {
    public static final Item ABYSS__LORAN = SkyCore.BuiltinRegistries.registerItem("abyss__loran",
            new Loran(new Item.Settings()));
    public static final Item ABYSS__ABYSS_PORTAL_ACTIVATOR = SkyCore.BuiltinRegistries.registerItem("abyss__abyss_portal_activator",
            new Item(new Item.Settings()));
    public static final Item ABYSS__ABERYTHE_GEM = SkyCore.BuiltinRegistries.registerItem("abyss__aberythe_gem",
            new Item(new Item.Settings()));
    public static final Item ABYSS__ABERYTHE_HELMET = SkyCore.BuiltinRegistries.registerItem("abyss__aberythe_helmet",
            new ArmorAPI.ArmorItem(Abyss_ArmorMaterials.ABERYTHE, ArmorItem.Type.HELMET, new Item.Settings(), 41));
    public static final Item ABYSS__ABERYTHE_CHESTPLATE = SkyCore.BuiltinRegistries.registerItem("abyss__aberythe_chestplate",
            new ArmorAPI.ArmorItem(Abyss_ArmorMaterials.ABERYTHE, ArmorItem.Type.CHESTPLATE, new Item.Settings(), 41));
    public static final Item ABYSS__ABERYTHE_LEGGINGS = SkyCore.BuiltinRegistries.registerItem("abyss__aberythe_leggings",
            new ArmorAPI.ArmorItem(Abyss_ArmorMaterials.ABERYTHE, ArmorItem.Type.LEGGINGS, new Item.Settings(), 41));
    public static final Item ABYSS__ABERYTHE_BOOTS = SkyCore.BuiltinRegistries.registerItem("abyss__aberythe_boots",
            new ArmorAPI.ArmorItem(Abyss_ArmorMaterials.ABERYTHE, ArmorItem.Type.BOOTS, new Item.Settings(), 41));
    public static final Item ABYSS__ABERYTHE_SWORD = SkyCore.BuiltinRegistries.registerItem("abyss__aberythe_sword",
            new ToolAPI.SwordItem(SkyCore_ToolMaterials.ENDERITE, 1, 1.6f - 4f, new Item.Settings()));
    public static final Item ABYSS__ABERYTHE_AXE = SkyCore.BuiltinRegistries.registerItem("abyss__aberythe_axe",
            new ToolAPI.AxeItem(SkyCore_ToolMaterials.ENDERITE, 1, 1f - 4f, new Item.Settings()));
    public static final Item ABYSS__ABERYTHE_SHOVEL = SkyCore.BuiltinRegistries.registerItem("abyss__aberythe_shovel",
            new ToolAPI.ShovelItem(SkyCore_ToolMaterials.ENDERITE, 1, 1f - 4f, new Item.Settings()));
    public static final Item ABYSS__ABERYTHE_HOE = SkyCore.BuiltinRegistries.registerItem("abyss__aberythe_hoe",
            new ToolAPI.HoeItem(SkyCore_ToolMaterials.ENDERITE, 1, 5f - 4f, new Item.Settings()));
    public static final Item ABYSS__ABERYTHE_PICKAXE = SkyCore.BuiltinRegistries.registerItem("abyss__aberythe_pickaxe",
            new ToolAPI.PickaxeItem(SkyCore_ToolMaterials.ENDERITE, 1, 1.2f - 4f, new Item.Settings()));
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering Items for \"Abyss\" innermod");
    }
}
