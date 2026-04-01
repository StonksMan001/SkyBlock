package net.me.skycore_supermod.deprecated.benimod.items;

import net.me.skycore_supermod.ArmorAPI;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.registry.entry.RegistryEntry;

@Deprecated
public class NativeVillagerCloth extends ArmorAPI.ArmorItem { //TODO
    public NativeVillagerCloth(RegistryEntry<ArmorMaterial> material, Type type, Settings settings, int durrabilityMultiplier) {
        super(material, type, settings, durrabilityMultiplier);
    }
}
