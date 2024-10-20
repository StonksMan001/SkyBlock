package net.me.skyblock.blocks_and_items.items.util.custom_unenchantable;

import net.me.skyblock.api.skycore.ToolAPI;
import net.me.skyblock.enchantments.ModEnchantments;
import net.minecraft.entity.Entity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.world.World;
import org.betterx.wover.common.item.api.ItemWithCustomStack;

public class UnenchantableAxeItem extends ToolAPI.AxeItem implements ItemWithCustomStack {
    public UnenchantableAxeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
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
