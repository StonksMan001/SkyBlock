package net.me.skycore_supermod.item_utils.custom_unenchantable;

import net.me.skycore_supermod.ToolAPI;
import net.me.skycore_supermod.SkyblockHelpers;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.world.World;
import org.betterx.wover.common.item.api.ItemWithCustomStack;

public class UnenchantablePickaxeItem extends ToolAPI.PickaxeItem implements ItemWithCustomStack, SkyblockHelpers {
    public UnenchantablePickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
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
