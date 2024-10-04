package net.me.skyblock.blocks_and_items.items.mcd;

import net.me.skyblock.SkyBlock;
import net.me.skyblock.enchantments.ModEnchantments;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.world.World;
import org.betterx.wover.common.item.api.ItemWithCustomStack;

public class McdArtifactItem extends Item implements ItemWithCustomStack {
    public static final byte[] RARITY = new byte[]{1, 2, 3};
    public McdArtifactItem(Settings settings) {
        super(settings);
    }
    @Override
    public boolean isEnchantable(ItemStack stack) {
        return false;
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return false;
    }
    @Override
    public void setupItemStack(ItemStack stack, RegistryWrapper.WrapperLookup provider) {
        ModEnchantments.Helper.addEnchantmentToStack(stack, provider, ModEnchantments.PRIMITIVENESS_CURSE, 1);
    }
}
