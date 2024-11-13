package net.me.skyblock.items.util;

import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryWrapper;

public interface SkyblockEnchantmentHelper {
    default void enchantStackWithPrimitiveness(ItemStack stack, RegistryWrapper.WrapperLookup provider) {
        SkyBlockRegistries.EnchantmentRegistries.Helper.addEnchantmentToStack(stack, provider, SkyBlockRegistries.EnchantmentRegistries.PRIMITIVENESS_CURSE, 1);
    }
}
