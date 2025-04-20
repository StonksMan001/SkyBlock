package net.me.sp5_innermod.registries;

import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Util;

import java.util.EnumMap;

public class SP5_ArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> ENDERITE = SkyCore.BuiltinRegistries.registerArmorMaterial("sp5__enderite",
            Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 5);
                map.put(ArmorItem.Type.LEGGINGS, 8);
                map.put(ArmorItem.Type.CHESTPLATE, 10);
                map.put(ArmorItem.Type.HELMET, 5);
                map.put(ArmorItem.Type.BODY, 12);
            }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.5f, 0.25f, () -> {
                return Ingredient.ofItems(new ItemConvertible[]{SP5_Items.SP5__ENDERITE_INGOT});
            });
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering ArmorMaterials for \"Enderite Addon\" innermod");
    }
}
