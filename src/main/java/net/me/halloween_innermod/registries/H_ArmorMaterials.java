package net.me.halloween_innermod.registries;

import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Util;

import java.util.EnumMap;

public class H_ArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> H__ANOMALITE = SkyCore.BuiltinRegistries.registerArmorMaterial("h__anomalite",
            Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.5f, 0.1f, () -> {
                return Ingredient.ofItems(new ItemConvertible[]{H_Items.H__ANOMALITE_FRAGMENT});
            });
}
