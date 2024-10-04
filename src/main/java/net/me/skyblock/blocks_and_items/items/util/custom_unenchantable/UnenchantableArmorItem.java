package net.me.skyblock.blocks_and_items.items.util.custom_unenchantable;

import net.me.skyblock.api.skycore.ArmorAPI;
import net.me.skyblock.enchantments.ModEnchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.World;
import org.betterx.wover.common.item.api.ItemWithCustomStack;
import software.bernie.geckolib.event.GeoRenderEvent;

import java.util.Objects;

public class UnenchantableArmorItem extends ArmorAPI.ArmorItem implements ItemWithCustomStack {

    public UnenchantableArmorItem(RegistryEntry<ArmorMaterial> material, Type type, Settings settings, int durrabilityMultiplier) {
        super(material, type, settings, durrabilityMultiplier);
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
