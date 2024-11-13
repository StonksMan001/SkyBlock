package net.me.skyblock.items.util.custom_unenchantable;

import net.me.skyblock.api.skycore.ToolAPI;
import net.me.skyblock.items.util.SkyblockEnchantmentHelper;
import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.BuiltinRegistries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.world.World;
import org.betterx.wover.common.item.api.ItemWithCustomStack;

public class UnenchantableAxeItem extends ToolAPI.AxeItem implements ItemWithCustomStack, SkyblockEnchantmentHelper {
    public UnenchantableAxeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
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
