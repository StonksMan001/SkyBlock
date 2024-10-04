package net.me.skyblock.blocks_and_items.items.util.basic;

import net.me.skyblock.SkyBlock;
import net.me.skyblock.blocks_and_items.ModItems;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Util;

import java.util.EnumMap;
public class ModArmorMaterials {
    /*NETHERITE("netherite", 37, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_INGOT});
    });*/
    public static final RegistryEntry<ArmorMaterial> ENDERITE = SkyBlock.BuiltinRegistries.registerArmorMaterial("enderite",
            Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 1);
        map.put(ArmorItem.Type.LEGGINGS, 2);
        map.put(ArmorItem.Type.CHESTPLATE, 3);
        map.put(ArmorItem.Type.HELMET, 1);
        map.put(ArmorItem.Type.BODY, 3);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.3f, 0.25f, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.SP5__ENDERITE_INGOT});
    });
    //ENDERITE("enderite", 45, Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
    //    map.put(ArmorItem.Type.BOOTS, 6);
    //    map.put(ArmorItem.Type.LEGGINGS, 8);
    //    map.put(ArmorItem.Type.CHESTPLATE, 10);
    //    map.put(ArmorItem.Type.HELMET, 6);
    //}), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.3f, 0.25f, () -> Ingredient.ofItems(ModItems.SP5__ENDERITE_INGOT)),
    public static final RegistryEntry<ArmorMaterial> ABERYTHE = SkyBlock.BuiltinRegistries.registerArmorMaterial("aberythe",
            Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 5);
        map.put(ArmorItem.Type.LEGGINGS, 7);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 4);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.2f, 0.2f, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.ABYSS__ABERYTHE_GEM});
    });
    //ABERYTHE("aberythe", 41, Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
    //    map.put(ArmorItem.Type.BOOTS, 5);
    //    map.put(ArmorItem.Type.LEGGINGS, 7);
    //    map.put(ArmorItem.Type.CHESTPLATE, 8);
    //    map.put(ArmorItem.Type.HELMET, 4);
    //}), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.2f, 0.2f, () -> Ingredient.ofItems(ModItems.ABYSS__ABERYTHE_GEM)),
    public static final RegistryEntry<ArmorMaterial> H__ANOMALITE = SkyBlock.BuiltinRegistries.registerArmorMaterial("h__anomalite",
            Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.3f, 0.25f, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.H__ANOMALITE_FRAGMENT});
    });
    //H__ANOMALITE("h__anomalite", 40, Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
    //    map.put(ArmorItem.Type.BOOTS, 3);
    //    map.put(ArmorItem.Type.LEGGINGS, 6);
    //    map.put(ArmorItem.Type.CHESTPLATE, 8);
    //    map.put(ArmorItem.Type.HELMET, 3);
    //}), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.3f, 0.25f, () -> Ingredient.ofItems(ModItems.H__ANOMALITE_FRAGMENT));
}




