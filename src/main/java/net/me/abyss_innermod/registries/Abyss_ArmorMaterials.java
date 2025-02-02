package net.me.abyss_innermod.registries;

import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Util;

import java.util.EnumMap;

public class Abyss_ArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> ABERYTHE = SkyCore.BuiltinRegistries.registerArmorMaterial("abyss__aberythe",
            Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 5);
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 4);
            }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.2f, 0.2f, () -> {
                return Ingredient.ofItems(new ItemConvertible[]{Abyss_Items.ABYSS__ABERYTHE_GEM});
            });
}
