package net.me.skyblock.blocks_and_items.items.util.custom_unenchantable;

import net.me.skyblock.enchantments.ModEnchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.world.World;

public class UnenchantableSwordItem extends SwordItem {
    public UnenchantableSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return false;
    }
    @Override
    public void onCraft(ItemStack stack, World world) {
        stack.addEnchantment(ModEnchantments.PRIMITIVENESS_CURSE, 1);
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return false;
    }
}
