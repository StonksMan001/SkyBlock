package net.me.sp5_innermod.registries;

import net.me.mcd_innermod.items.RapierItem;
import net.me.skycore_supermod.common_registries.SkyCore_ToolMaterials;
import net.me.skycore_supermod.ArmorAPI;
import net.me.skycore_supermod.ToolAPI;
import net.me.skycore_supermod.registries.SkyCore;
import net.me.sp5_innermod.items.EnchantedEnderiteAppleItem;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ChorusFruitItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Rarity;

public class SP5_Items {
    public static final Item SP5__ENDERITE_APPLE = SkyCore.BuiltinRegistries.registerItem("sp5__enderite_apple",
            new Item(new Item.Settings().food(SP5_FoodComponents.SP5__ENDERITE_APPLE)));
    public static final Item SP5__ENCHANTED_ENDERITE_APPLE = SkyCore.BuiltinRegistries.registerItem("sp5__enchanted_enderite_apple",
            new EnchantedEnderiteAppleItem(new Item.Settings().food(SP5_FoodComponents.SP5__ENCHANTED_ENDERITE_APPLE)));
    public static final Item SP5__ENDER_STICK = SkyCore.BuiltinRegistries.registerItem("sp5__ender_stick",
            new Item(new Item.Settings()));
    public static final Item SP5__ENDMERALD = SkyCore.BuiltinRegistries.registerItem("sp5__end_emerald",
            new Item(new Item.Settings()));
    public static final Item SP5__MELTED_RESIDUES = SkyCore.BuiltinRegistries.registerItem("sp5__melted_residues",
            new Item(new Item.Settings()));
    public static final Item SP5__ENDERITE_INGOT = SkyCore.BuiltinRegistries.registerItem("sp5__enderite_ingot",
            new Item(new Item.Settings()));
    public static final Item SP5__ENDERITE_CHORUS_FRUIT = SkyCore.BuiltinRegistries.registerItem("sp5__enderite_chorus_fruit",
            new ChorusFruitItem(new Item.Settings().food(FoodComponents.CHORUS_FRUIT)));
    public static final Item SP5__POPPED_ENDERITE_CHORUS_FRUIT = SkyCore.BuiltinRegistries.registerItem("sp5__popped_enderite_chorus_fruit",
            new Item(new Item.Settings()));
    public static final Item SP5__BLUISHE_LIGHT_SHEEL = SkyCore.BuiltinRegistries.registerItem("sp5__bluishe_light_sheel",
            new Item(new Item.Settings()));
    public static final Item SP5__ENDERITE_HELMET = SkyCore.BuiltinRegistries.registerItem("sp5__enderite_helmet",
            new ArmorAPI.ArmorItem(SP5_ArmorMaterials.ENDERITE, ArmorItem.Type.HELMET, new Item.Settings(), 45));
    public static final Item SP5__ENDERITE_CHESTPLATE = SkyCore.BuiltinRegistries.registerItem("sp5__enderite_chestplate",
            new ArmorAPI.ArmorItem(SP5_ArmorMaterials.ENDERITE, ArmorItem.Type.CHESTPLATE, new Item.Settings(), 45));
    public static final Item SP5__ENDERITE_LEGGINGS = SkyCore.BuiltinRegistries.registerItem("sp5__enderite_leggings",
            new ArmorAPI.ArmorItem(SP5_ArmorMaterials.ENDERITE, ArmorItem.Type.LEGGINGS, new Item.Settings(), 45));
    public static final Item SP5__ENDERITE_BOOTS = SkyCore.BuiltinRegistries.registerItem("sp5__enderite_boots",
            new ArmorAPI.ArmorItem(SP5_ArmorMaterials.ENDERITE, ArmorItem.Type.BOOTS, new Item.Settings(), 45));
    public static final Item SP5__ENDERITE_SWORD = SkyCore.BuiltinRegistries.registerItem("sp5__enderite_sword",
            new ToolAPI.SwordItem(SkyCore_ToolMaterials.ENDERITE, 9, 1.6f - 4f, new Item.Settings()));
    public static final Item SP5__ENDERITE_AXE = SkyCore.BuiltinRegistries.registerItem("sp5__enderite_axe",
            new ToolAPI.AxeItem(SkyCore_ToolMaterials.ENDERITE, 11, 1f - 4f, new Item.Settings()));
    public static final Item SP5__ENDERITE_SHOVEL = SkyCore.BuiltinRegistries.registerItem("sp5__enderite_shovel",
            new ToolAPI.ShovelItem(SkyCore_ToolMaterials.ENDERITE, 8, 1f - 4f, new Item.Settings()));
    public static final Item SP5__ENDERITE_HOE = SkyCore.BuiltinRegistries.registerItem("sp5__enderite_hoe",
            new ToolAPI.HoeItem(SkyCore_ToolMaterials.ENDERITE, 3, 5.5f - 4f, new Item.Settings()));
    public static final Item SP5__ENDERITE_PICKAXE = SkyCore.BuiltinRegistries.registerItem("sp5__enderite_pickaxe",
            new ToolAPI.PickaxeItem(SkyCore_ToolMaterials.ENDERITE, 7, 1.2f - 4f, new Item.Settings()));
    public static final Item SP5__END_WOODEN_SWORD = SkyCore.BuiltinRegistries.registerItem("sp5__end_wooden_sword",
            new ToolAPI.SwordItem(ToolMaterials.STONE, 5 - 2, 1.6f - 4f, new Item.Settings()));
    public static final Item SP5__END_WOODEN_AXE = SkyCore.BuiltinRegistries.registerItem("sp5__end_wooden_axe",
            new ToolAPI.AxeItem(ToolMaterials.STONE, 9 - 2, 0.8f - 4f, new Item.Settings()));
    public static final Item SP5__END_WOODEN_SHOVEL = SkyCore.BuiltinRegistries.registerItem("sp5__end_wooden_shovel",
            new ToolAPI.ShovelItem(ToolMaterials.STONE, 3.5f - 2, 1f - 4f, new Item.Settings()));
    public static final Item SP5__END_WOODEN_HOE = SkyCore.BuiltinRegistries.registerItem("sp5__end_wooden_hoe",
            new ToolAPI.HoeItem(ToolMaterials.STONE, 1 - 2, 2f - 4f, new Item.Settings()));
    public static final Item SP5__END_WOODEN_PICKAXE = SkyCore.BuiltinRegistries.registerItem("sp5__end_wooden_pickaxe",
            new ToolAPI.PickaxeItem(ToolMaterials.STONE, 3 - 2, 1.2f - 4f, new Item.Settings()));
    public static final Item SP5__BLUISHE_SWORD = SkyCore.BuiltinRegistries.registerItem("sp5__bluishe_sword",
            new ToolAPI.SwordItem(ToolMaterials.IRON, 6 - 3, 1.6f - 4f, new Item.Settings()));
    public static final Item SP5__BLUISHE_AXE = SkyCore.BuiltinRegistries.registerItem("sp5__bluishe_axe",
            new ToolAPI.AxeItem(ToolMaterials.IRON, 9 - 3, 0.9f - 4f, new Item.Settings()));
    public static final Item SP5__BLUISHE_SHOVEL = SkyCore.BuiltinRegistries.registerItem("sp5__bluishe_shovel",
            new ToolAPI.ShovelItem(ToolMaterials.IRON, 4.5f - 3, 1f - 4f, new Item.Settings()));
    public static final Item SP5__BLUISHE_HOE = SkyCore.BuiltinRegistries.registerItem("sp5__bluishe_hoe",
            new ToolAPI.HoeItem(ToolMaterials.IRON, 1 - 3, 3f - 4f, new Item.Settings()));
    public static final Item SP5__BLUISHE_PICKAXE = SkyCore.BuiltinRegistries.registerItem("sp5__bluishe_pickaxe",
            new ToolAPI.PickaxeItem(ToolMaterials.IRON, 4 - 3, 1.2f - 4f, new Item.Settings()));
    public static final Item SP5__END_STONE_SWORD = SkyCore.BuiltinRegistries.registerItem("sp5__end_stone_sword",
            new ToolAPI.SwordItem(ToolMaterials.IRON, 6 - 3, 1.6f - 4f, new Item.Settings()));
    public static final Item SP5__END_STONE_AXE = SkyCore.BuiltinRegistries.registerItem("sp5__end_stone_axe",
            new ToolAPI.AxeItem(ToolMaterials.IRON, 9 - 3, 0.9f - 4f, new Item.Settings()));
    public static final Item SP5__END_STONE_SHOVEL = SkyCore.BuiltinRegistries.registerItem("sp5__end_stone_shovel",
            new ToolAPI.ShovelItem(ToolMaterials.IRON, 4.5f - 3, 1f - 4f, new Item.Settings()));
    public static final Item SP5__END_STONE_HOE = SkyCore.BuiltinRegistries.registerItem("sp5__end_stone_hoe",
            new ToolAPI.HoeItem(ToolMaterials.IRON, 1 - 3, 3f - 4f, new Item.Settings()));
    public static final Item SP5__END_STONE_PICKAXE = SkyCore.BuiltinRegistries.registerItem("sp5__end_stone_pickaxe",
            new ToolAPI.PickaxeItem(ToolMaterials.IRON, 4 - 3, 1.2f - 4f, new Item.Settings()));
    public static final Item SP5__ENDERITE_RAPIER = SkyCore.BuiltinRegistries.registerItem("sp5__enderite_rapier",
            new RapierItem(SkyCore_ToolMaterials.ENDERITE, 8, Float.MAX_VALUE, new Item.Settings()));
    public static final Item SP5__END_WOODEN_RAPIER = SkyCore.BuiltinRegistries.registerItem("sp5__end_wooden_rapier",
            new RapierItem(ToolMaterials.STONE, 2, Float.MAX_VALUE, new Item.Settings()));
    public static final Item SP5__END_STONE_RAPIER = SkyCore.BuiltinRegistries.registerItem("sp5__end_stone_rapier",
            new RapierItem(ToolMaterials.IRON, 2, Float.MAX_VALUE, new Item.Settings()));
    public static final Item SP5__BLUISHE_RAPIER = SkyCore.BuiltinRegistries.registerItem("sp5__bluishe_rapier",
            new RapierItem(ToolMaterials.IRON, 2, Float.MAX_VALUE, new Item.Settings()));
    public static final Item SP5__FORBIDDEN_POTION = SkyCore.BuiltinRegistries.registerItem("sp5__forbidden_potion",
            new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1))); //TODO
    public static final Item SP5__GOD_POTION = SkyCore.BuiltinRegistries.registerItem("sp5__god_potion",
            new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1))); //TODO
    public static final Item SP5__END_CAKE = SkyCore.BuiltinRegistries.registerItem("sp5__end_cake",
            new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1))); //TODO
    public static final Item SP5__END_MILK = SkyCore.BuiltinRegistries.registerItem("sp5__end_milk",
            new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1))); //TODO
    public static final Item SP5__CORCODUS_FRUIT = SkyCore.BuiltinRegistries.registerItem("sp5__corcodus_fruit",
            new Item(new Item.Settings().rarity(Rarity.EPIC))); //TODO
    public static final Item SP5__END_VINES = SkyCore.BuiltinRegistries.registerItem("sp5__end_vines",
            new Item(new Item.Settings().rarity(Rarity.EPIC))); //TODO
    public static final Item SP5__END_BREAD = SkyCore.BuiltinRegistries.registerItem("sp5__end_bread",
            new Item(new Item.Settings().rarity(Rarity.EPIC))); //TODO
    public static final Item SP5__END_WHEAT = SkyCore.BuiltinRegistries.registerItem("sp5__end_wheat",
            new Item(new Item.Settings().rarity(Rarity.EPIC))); //TODO
    public static final Item SP5__END_WHEAT_SEEDS = SkyCore.BuiltinRegistries.registerItem("sp5__end_wheat_seeds",
            new Item(new Item.Settings().rarity(Rarity.EPIC))); //TODO
    public static final Item SP5__NAVI_FRUIT = SkyCore.BuiltinRegistries.registerItem("sp5__navi_fruit",
            new Item(new Item.Settings().rarity(Rarity.EPIC))); //TODO
    public static final Item SP5__END_BEEF = SkyCore.BuiltinRegistries.registerItem("sp5__end_beef",
            new Item(new Item.Settings().rarity(Rarity.EPIC))); //TODO
    public static final Item SP5__COOKED_END_BEEF = SkyCore.BuiltinRegistries.registerItem("sp5__cooked_end_beef",
            new Item(new Item.Settings().rarity(Rarity.EPIC))); //TODO
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering Items for \"Enderite Addon\" innermod");
    }
}
