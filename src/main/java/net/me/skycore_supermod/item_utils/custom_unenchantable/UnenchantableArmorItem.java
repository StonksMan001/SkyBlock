package net.me.skycore_supermod.item_utils.custom_unenchantable;

import net.me.skycore_supermod.ArmorAPI;
import net.me.skycore_supermod.SkyblockHelpers;
import net.minecraft.entity.Entity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.World;
import org.betterx.wover.common.item.api.ItemWithCustomStack;

public class UnenchantableArmorItem extends ArmorAPI.ArmorItem implements ItemWithCustomStack, SkyblockHelpers {

    public UnenchantableArmorItem(RegistryEntry<ArmorMaterial> material, Type type, Settings settings, int durrabilityMultiplier) {
        super(material, type, settings, durrabilityMultiplier);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
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
    @Override
    public boolean hasGlint(ItemStack stack) {
        return false;
    }
}
