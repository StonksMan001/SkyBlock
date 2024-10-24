package net.me.skyblock.items.mcd;

import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryWrapper;
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
        SkyBlockRegistries.EnchantmentRegistries.Helper.addEnchantmentToStack(stack, provider, SkyBlockRegistries.EnchantmentRegistries.PRIMITIVENESS_CURSE, 1);
    }
}
