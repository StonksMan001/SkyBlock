package net.me.skyblock.api.skycore;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryWrapper;

public interface SkyblockHelpers {
    default void enchantStackWithPrimitiveness(ItemStack stack, RegistryWrapper.WrapperLookup provider) {
        SkyBlockRegistries.EnchantmentRegistries.Helper.addEnchantmentToStack(stack, provider, SkyBlockRegistries.EnchantmentRegistries.PRIMITIVENESS_CURSE, 1);
    }
    static boolean wrapRangedWeaponHardcodedCallsIfPresent(ItemStack instance, Item item, Operation<Boolean> original) {
        if (item instanceof BowItem) {
            return original.call(instance, item) || instance.getItem() instanceof BowItem;
        }
        if (item instanceof CrossbowItem) {
            return original.call(instance, item) || instance.getItem() instanceof CrossbowItem;
        }
        return original.call(instance, item);
    }
}
