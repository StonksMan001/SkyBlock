package net.me.skyblock.enchantments;

import net.me.skyblock.SkyBlock;
import net.me.skyblock.enchantments.misc.PrimitivenessCurse;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {
    public static Enchantment PRIMITIVENESS_CURSE = register("primitiveness_curse", new PrimitivenessCurse(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.BREAKABLE ,EquipmentSlot.values()));
    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(SkyBlock.MOD_ID, name), enchantment);
    }
    public static void registerModEnchantments() {
        System.out.println("[SkyBlock MultiMod] Registering Enchantments for " + SkyBlock.MOD_ID);
    }
}
