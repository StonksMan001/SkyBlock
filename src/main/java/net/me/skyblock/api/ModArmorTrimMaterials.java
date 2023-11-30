package net.me.skyblock.api;

import net.me.skyblock.blocks_and_items.ModItems;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class ModArmorTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> ENDERITE = ModArmorTrimMaterials.of("enderite");
    public static final RegistryKey<ArmorTrimMaterial> FYBERITE = ModArmorTrimMaterials.of("fyberite");
    public static final RegistryKey<ArmorTrimMaterial> END_EMERALD = ModArmorTrimMaterials.of("end_emerald");

    public static void bootstrap(Registerable<ArmorTrimMaterial> registry) {
    }
    public static void oneTwentyBootstrap(Registerable<ArmorTrimMaterial> registry) {
        ModArmorTrimMaterials.register(registry, ENDERITE, ModItems.SP5__ENDERITE_INGOT, Style.EMPTY.withColor(10116294), 1.0f);
        ModArmorTrimMaterials.register(registry, FYBERITE, ModItems.SKYBLOCK__FYBERITE, Style.EMPTY.withColor(10116294), 1.0f);
    }
    private static void register(Registerable<ArmorTrimMaterial> registry, RegistryKey<ArmorTrimMaterial> key, Item ingredient, Style style, float itemModelIndex) {
        ModArmorTrimMaterials.register(registry, key, ingredient, style, itemModelIndex, Map.of());
    }

    private static void register(Registerable<ArmorTrimMaterial> registry, RegistryKey<ArmorTrimMaterial> key, Item ingredient, Style style, float itemModelIndex, Map<ArmorMaterials, String> overrideArmorMaterials) {
        ArmorTrimMaterial armorTrimMaterial = ArmorTrimMaterial.of(key.getValue().getPath(), ingredient, itemModelIndex, Text.translatable(Util.createTranslationKey("trim_material", key.getValue())).fillStyle(style), overrideArmorMaterials);
        registry.register(key, armorTrimMaterial);
    }
    private static RegistryKey<ArmorTrimMaterial> of(String id) {
        return RegistryKey.of(RegistryKeys.TRIM_MATERIAL, new Identifier(id));
    }
}
