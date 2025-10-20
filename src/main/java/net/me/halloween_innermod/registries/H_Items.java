package net.me.halloween_innermod.registries;

import net.me.halloween_innermod.items.AnomaliteSwordItem;
import net.me.skycore_supermod.common_registries.SkyCore_ToolMaterials;
import net.me.skycore_supermod.item_utils.AnomaliteArmorItem;
import net.me.skycore_supermod.item_utils.SimpleOneLineTooltipItem;
import net.me.skycore_supermod.item_utils.custom_unenchantable.UnenchantableAxeItem;
import net.me.skycore_supermod.item_utils.custom_unenchantable.UnenchantablePickaxeItem;
import net.me.skycore_supermod.item_utils.custom_unenchantable.UnenchantableSwordItem;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class H_Items {
    public static final Item H__ANOMALITE_FRAGMENT = SkyCore.BuiltinRegistries.registerItem("h__anomalite_fragment",
            new SimpleOneLineTooltipItem(new Item.Settings(),
                    Text.translatable("tooltip.skyblock.special_resource").setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY))));
    public static final Item H__ANOMALITE_HANDLE = SkyCore.BuiltinRegistries.registerItem("h__anomalite_handle",
            new Item(new Item.Settings()));
    public static final Item H__NODE_CORE = SkyCore.BuiltinRegistries.registerItem("h__node_core",
            new Item(new Item.Settings()));
    public static final Item H__PEARL_OF_DARKNESS = SkyCore.BuiltinRegistries.registerItem("h__pearl_of_darkness",
            new Item(new Item.Settings()));
    public static final Item H__ANOMALITE_AXE = SkyCore.BuiltinRegistries.registerItem("h__anomalite_axe",
            new UnenchantableAxeItem(SkyCore_ToolMaterials.H__ANOMALITE, 10, 1.0f - 4f, new Item.Settings()));
    public static final Item H__ANOMALITE_SWORD = SkyCore.BuiltinRegistries.registerItem("h__anomalite_sword",
            new AnomaliteSwordItem(SkyCore_ToolMaterials.H__ANOMALITE, 8, 1.6f - 4f, new Item.Settings()));
    public static final Item H__ANOMALITE_PICKAXE = SkyCore.BuiltinRegistries.registerItem("h__anomalite_pickaxe",
            new UnenchantablePickaxeItem(SkyCore_ToolMaterials.H__ANOMALITE, 6, 1.2f - 4f, new Item.Settings()));
    public static final Item H__ANOMALITE_HELMET = SkyCore.BuiltinRegistries.registerItem("h__anomalite_helmet",
            new AnomaliteArmorItem(H_ArmorMaterials.H__ANOMALITE, ArmorItem.Type.HELMET, new Item.Settings(), 40));
    public static final Item H__ANOMALITE_CHESTPLATE = SkyCore.BuiltinRegistries.registerItem("h__anomalite_chestplate",
            new AnomaliteArmorItem(H_ArmorMaterials.H__ANOMALITE, ArmorItem.Type.CHESTPLATE, new Item.Settings(), 40));
    public static final Item H__ANOMALITE_LEGGINGS = SkyCore.BuiltinRegistries.registerItem("h__anomalite_leggings",
            new AnomaliteArmorItem(H_ArmorMaterials.H__ANOMALITE, ArmorItem.Type.LEGGINGS, new Item.Settings(), 40));
    public static final Item H__ANOMALITE_BOOTS = SkyCore.BuiltinRegistries.registerItem("h__anomalite_boots",
            new AnomaliteArmorItem(H_ArmorMaterials.H__ANOMALITE, ArmorItem.Type.BOOTS, new Item.Settings(), 40));
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering Items for \"Halloween\" innermod");
    }
}
