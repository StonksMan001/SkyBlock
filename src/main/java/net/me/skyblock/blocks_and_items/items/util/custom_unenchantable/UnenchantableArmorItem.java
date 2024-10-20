package net.me.skyblock.blocks_and_items.items.util.custom_unenchantable;

import net.me.skyblock.api.skycore.ArmorAPI;
import net.me.skyblock.enchantments.ModEnchantments;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import org.betterx.wover.common.item.api.ItemWithCustomStack;

public class UnenchantableArmorItem extends ArmorAPI.ArmorItem implements ItemWithCustomStack {

    public UnenchantableArmorItem(RegistryEntry<ArmorMaterial> material, Type type, Settings settings, int durrabilityMultiplier) {
        super(material, type, settings, durrabilityMultiplier);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return false;
    }

    @Override
    public void setupItemStack(ItemStack stack, RegistryWrapper.WrapperLookup provider) {
        ModEnchantments.Helper.addEnchantmentToStack(stack, provider, ModEnchantments.PRIMITIVENESS_CURSE, 1);
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return false;
    }
}
