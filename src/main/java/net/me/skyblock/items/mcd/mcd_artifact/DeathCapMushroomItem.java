package net.me.skyblock.items.mcd.mcd_artifact;

import net.me.skyblock.api.skycore.SkyblockHelpers;
import net.me.skyblock.component.McdRarity;
import net.me.skyblock.items.mcd.McdArtifactItem;
import net.me.skyblock.registries.v1.SkyBlockRegistries;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class DeathCapMushroomItem extends McdArtifactItem {
    public DeathCapMushroomItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        McdRarity mcdRarity = stack.get(SkyBlockRegistries.DataComponentTypeRegistries.MCD__RARITY);
        int duration = 0;
        int amplifier = 0;
        switch (mcdRarity) {
            case COMMON -> {
                duration = 200;
            }
            case RARE -> {
                duration = 300;
                amplifier = 1;
            }
            case null, default -> {}
        }
        if (!world.isClient && duration != 0) {
            user.getItemCooldownManager().set(this, 600);
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, duration, amplifier, false, true, true));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, duration, amplifier, false, true, true));
            world.playSoundFromEntity(null, user, SkyBlockRegistries.SoundRegistries.MCD__DEATH_CAP_MUSHROOM_USE, SoundCategory.PLAYERS, 1.0F, 1.0F);
            stack.damage(1, user, LivingEntity.getSlotForHand(hand));
        }
        return TypedActionResult.success(stack, true);
    }
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.skyblock.minecraft_dungeons_header").setStyle(Style.EMPTY.withBold(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.mcd__artifact_death_cap_mushroom.tooltip1").setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.mcd__artifact_death_cap_mushroom.tooltip2").setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
        SkyblockHelpers.appendMcdRarity(stack, tooltip);
        tooltip.add(Text.translatable("tooltip.skyblock.mcd__artifact_death_cap_mushroom.tooltip3").setStyle(Style.EMPTY.withFormatting(Formatting.GREEN).withItalic(true)));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
