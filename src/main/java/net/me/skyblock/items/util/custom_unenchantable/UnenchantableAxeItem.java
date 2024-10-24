package net.me.skyblock.items.util.custom_unenchantable;

import net.me.skyblock.api.skycore.ToolAPI;
import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.RegistryWrapper;
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
        SkyBlockRegistries.EnchantmentRegistries.Helper.addEnchantmentToStack(stack, provider, SkyBlockRegistries.EnchantmentRegistries.PRIMITIVENESS_CURSE, 1);
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return false;
    }
}
