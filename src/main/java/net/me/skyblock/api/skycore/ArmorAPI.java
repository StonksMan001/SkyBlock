package net.me.skyblock.api.skycore;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.registry.entry.RegistryEntry;

public class ArmorAPI {
    public static class ArmorItem extends net.minecraft.item.ArmorItem {
        public ArmorItem(RegistryEntry<ArmorMaterial> material, Type type, Settings settings, int durrabilityMultiplier) {
            super(material, type, settings.maxDamage(type.getMaxDamage(durrabilityMultiplier)));
        }
    }
}
