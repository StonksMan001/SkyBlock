package net.me.skyblock.enchantments.misc;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class PrimitivenessCurse extends Enchantment {
    public PrimitivenessCurse(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, target, slotTypes);
    }
    public boolean canAccept(Enchantment other) {
        return false;
    }

    @Override
    public boolean isCursed() {
        return true;
    }
}
