package net.me.skyblock.items.mcd;

import net.me.skyblock.items.util.SkyblockEnchantmentHelper;
import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.BuiltinRegistries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.world.World;
import org.betterx.wover.common.item.api.ItemWithCustomStack;

public class McdArtifactItem extends McdItem implements ItemWithCustomStack, SkyblockEnchantmentHelper {
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
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        enchantStackWithPrimitiveness(stack, world.getRegistryManager());
    }

    @Override
    public void setupItemStack(ItemStack stack, RegistryWrapper.WrapperLookup provider) {
        enchantStackWithPrimitiveness(stack, provider);
    }
}
