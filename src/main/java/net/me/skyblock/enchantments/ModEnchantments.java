package net.me.skyblock.enchantments;

import net.me.skyblock.SkyBlock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.World;
import org.betterx.wover.enchantment.api.EnchantmentUtils;

import javax.swing.text.html.Option;
import java.util.Objects;
import java.util.Optional;

public class ModEnchantments {
    public static RegistryKey<Enchantment> PRIMITIVENESS_CURSE = SkyBlock.BuiltinRegistries.ofEnchantmentRegistry("primitiveness_curse");

    public static void register() {
        System.out.println("[SkyBlock MultiMod] Registering Enchantments for " + SkyBlock.MOD_ID);
    }
    public static class Helper {
        public static void addEnchantmentToStack(ItemStack itemStack, RegistryWrapper.WrapperLookup wrapper, RegistryKey<Enchantment> enchantment, int level) {
            EnchantmentUtils.enchantInWorld(itemStack, enchantment, level, wrapper);
        }
    }
}
