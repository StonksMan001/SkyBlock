package net.me.skyblock.items.mcd.mcd_meele;

import net.me.skyblock.api.skycore.SkyblockHelpers;
import net.me.skyblock.api.skycore.ToolAPI;
import net.me.skyblock.items.mcd.McdItem;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Attackable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.betterx.wover.common.item.api.ItemWithCustomStack;

import java.util.List;

public class RoughDiamondPickaxe extends ToolAPI.PickaxeItem implements ItemWithCustomStack {
    public RoughDiamondPickaxe(ToolMaterial toolMaterial, float baseAttackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, baseAttackDamage, attackSpeed, settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.skyblock.minecraft_dungeons_header").setStyle(Style.EMPTY.withBold(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.rarity.unique"));
        super.appendTooltip(stack, context, tooltip, type);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (target.isDead()) {
            //TODO
        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        SkyblockHelpers.addEnchantmentToStack(stack, world.getRegistryManager(), Enchantments.SHARPNESS, 5);
    }
    @Override
    public void setupItemStack(ItemStack stack, RegistryWrapper.WrapperLookup provider) {
        SkyblockHelpers.addEnchantmentToStack(stack, provider, Enchantments.SHARPNESS, 5);
    }
    @Override
    public int getItemBarColor(ItemStack stack) {
        return McdItem.getMcdItemBarColor();
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return false;
    }
    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return false;
    }
}
