package net.me.skyblock.items.mcd.mcd_meele;

import com.ibm.icu.util.ICUUncheckedIOException;
import net.me.skyblock.api.skycore.SkyblockHelpers;
import net.me.skyblock.api.skycore.ToolAPI;
import net.me.skyblock.component.McdRarity;
import net.me.skyblock.items.mcd.McdItem;
import net.me.skyblock.registries.SkyBlock;
import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class SteelMace extends ToolAPI.SwordItem {
    float baseAttackDamage;
    float attackSpeed;
    public SteelMace(ToolMaterial toolMaterial, float baseAttackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, baseAttackDamage, attackSpeed, settings);
        this.attackSpeed = attackSpeed;
        this.baseAttackDamage = baseAttackDamage;
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        int current_chain_step = stack.getOrDefault(SkyBlockRegistries.DataComponentTypeRegistries.MCD__STEEL_MACE_ATTACK_CHAIN, 1);
        int next_chain_step;
        if (current_chain_step == 1) attacker.getWorld().playSoundFromEntity(null, attacker, SoundEvents.ITEM_MACE_SMASH_GROUND, SoundCategory.NEUTRAL, 1.0F, 1.0F);
        if (current_chain_step == 3) modifySpeedAndAttackDamage(stack, baseAttackDamage + 8d, attackSpeed -1d);
        else modifySpeedAndAttackDamage(stack, baseAttackDamage + 4d, attackSpeed);
        if (!(current_chain_step >= 3)) {
            next_chain_step = current_chain_step + 1;
        } else next_chain_step = 1;
        stack.set(SkyBlockRegistries.DataComponentTypeRegistries.MCD__STEEL_MACE_ATTACK_CHAIN, next_chain_step);
        return super.postHit(stack, target, attacker);
    }

    private void modifySpeedAndAttackDamage(ItemStack stack, double attackDamage, double attackSpeed) {
        McdRarity mcdRarity = stack.get(SkyBlockRegistries.DataComponentTypeRegistries.MCD__RARITY);
        stack.set(DataComponentTypes.ATTRIBUTE_MODIFIERS, stack.getOrDefault(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.DEFAULT)
                .with(
                        EntityAttributes.GENERIC_ATTACK_DAMAGE,
                        new EntityAttributeModifier(BASE_ATTACK_DAMAGE_MODIFIER_ID, mcdRarity == McdRarity.RARE ? attackDamage + 1d : attackDamage, EntityAttributeModifier.Operation.ADD_VALUE),
                        AttributeModifierSlot.MAINHAND)
                .with(
                        EntityAttributes.GENERIC_ATTACK_SPEED,
                        new EntityAttributeModifier(BASE_ATTACK_SPEED_MODIFIER_ID, attackSpeed, EntityAttributeModifier.Operation.ADD_VALUE),
                        AttributeModifierSlot.MAINHAND
                ));
    }
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.skyblock.minecraft_dungeons_header").setStyle(Style.EMPTY.withBold(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.mcd__steel_mace.tooltip1").setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.mcd__steel_mace.tooltip2").setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
        SkyblockHelpers.appendMcdRarity(stack, tooltip);
        tooltip.add(Text.translatable("tooltip.skyblock.mcd__powerful_combo").setStyle(Style.EMPTY.withFormatting(Formatting.GREEN).withItalic(true)));
        super.appendTooltip(stack, context, tooltip, type);
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
