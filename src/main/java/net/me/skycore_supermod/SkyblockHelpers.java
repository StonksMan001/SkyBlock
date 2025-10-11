package net.me.skycore_supermod;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import net.me.halloween_innermod.registries.H_Enchantments;
import net.me.mcd_innermod.components.McdRarity;
import net.me.mcd_innermod.registries.MCD_DataComponentTypes;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.betterx.wover.enchantment.api.EnchantmentUtils;

import java.util.List;

public interface SkyblockHelpers {
    default void enchantStackWithPrimitiveness(ItemStack stack, RegistryWrapper.WrapperLookup provider) {
        addEnchantmentToStack(stack, provider, H_Enchantments.H__PRIMITIVENESS_CURSE, 1);
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
    static void appendMcdRarity(ItemStack stack, List<Text> tooltip) {
        McdRarity mcdRarity = stack.get(MCD_DataComponentTypes.MCD__RARITY);
        if (mcdRarity != null) {
            switch (mcdRarity) {
                case McdRarity.COMMON -> tooltip.add(Text.translatable("tooltip.skyblock.rarity.common"));
                case McdRarity.RARE -> tooltip.add(Text.translatable("tooltip.skyblock.rarity.rare"));
                case McdRarity.UNIQUE -> tooltip.add(Text.translatable("tooltip.skyblock.rarity.unique"));
                default -> tooltip.add(Text.translatable("tooltip.skyblock.rarity.common")
                        .append(Text.literal(" "))
                        .append(Text.translatable("tooltip.skyblock.rarity_info_extended.custom")));
            }
        } else {
            tooltip.add(Text.translatable("tooltip.skyblock.rarity.common")
                    .append(Text.literal(" "))
                    .append(Text.translatable("tooltip.skyblock.rarity_info_extended.custom")));
        }
    }
    static void addEnchantmentToStack(ItemStack itemStack, RegistryWrapper.WrapperLookup wrapper, RegistryKey<Enchantment> enchantment, int level) {
        EnchantmentUtils.enchantInWorld(itemStack, enchantment, level, wrapper);
    }
    static RegistryEntry<Enchantment> getEnchantmentRegistryEntry(World world, RegistryKey<Enchantment> enchantment) {
        return world.getRegistryManager().get(RegistryKeys.ENCHANTMENT).getEntry(enchantment).orElseThrow();
    }
}
