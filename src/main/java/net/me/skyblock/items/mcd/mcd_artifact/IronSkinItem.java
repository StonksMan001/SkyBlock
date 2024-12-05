package net.me.skyblock.items.mcd.mcd_artifact;

import net.me.skyblock.api.skycore.SkyblockHelpers;
import net.me.skyblock.component.McdRarity;
import net.me.skyblock.items.mcd.McdArtifactItem;
import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.StackReference;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.ClickType;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public class IronSkinItem extends McdArtifactItem {
    public IronSkinItem(Settings settings) {
        super(settings);
    }
    @Override
    public boolean onClicked(ItemStack stack, ItemStack otherStack, Slot slot, ClickType clickType, PlayerEntity player, StackReference cursorStackReference) {
        if (clickType == ClickType.RIGHT && SkyBlockRegistries.DataComponentTypeRegistries.MCD__IRON_HIDE_AMULET_PERSONAL_TOGGLE != null) {
            stack.set(SkyBlockRegistries.DataComponentTypeRegistries.MCD__IRON_HIDE_AMULET_PERSONAL_TOGGLE, Boolean.FALSE.equals(stack.get(SkyBlockRegistries.DataComponentTypeRegistries.MCD__IRON_HIDE_AMULET_PERSONAL_TOGGLE)));
            return true;
        } else {
            return super.onClicked(stack, otherStack, slot, clickType, player, cursorStackReference);
        }
    }
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (stack.get(SkyBlockRegistries.DataComponentTypeRegistries.MCD__IRON_HIDE_AMULET_PERSONAL_TOGGLE) == null) {
            stack.set(SkyBlockRegistries.DataComponentTypeRegistries.MCD__IRON_HIDE_AMULET_PERSONAL_TOGGLE, false);
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        McdRarity mcdRarity = stack.get(SkyBlockRegistries.DataComponentTypeRegistries.MCD__RARITY);
        int distance = 0;
        int duration = 0;
        int amplifier = 2;
        switch (mcdRarity) {
            case COMMON -> {
                distance = 10;
                duration = 200;
            }
            case RARE -> {
                distance = 15;
                duration = 260;
            }
            case null, default -> {}
        }
        if (!world.isClient && duration != 0) {
            if (Boolean.TRUE.equals(stack.get(SkyBlockRegistries.DataComponentTypeRegistries.MCD__IRON_HIDE_AMULET_PERSONAL_TOGGLE))) {
                user.getItemCooldownManager().set(this, 500);
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, duration, amplifier, false, true, true));
                world.playSoundFromEntity(null, user, SkyBlockRegistries.SoundRegistries.MCD__IRON_HIDE_AMULET_USE, SoundCategory.PLAYERS, 1.0F, 1.0F);
                stack.damage(1, user, LivingEntity.getSlotForHand(hand));
            } else if (Boolean.FALSE.equals(stack.get(SkyBlockRegistries.DataComponentTypeRegistries.MCD__IRON_HIDE_AMULET_PERSONAL_TOGGLE))) {
                user.getItemCooldownManager().set(this, 500);
                world.playSoundFromEntity(null, user, SkyBlockRegistries.SoundRegistries.MCD__IRON_HIDE_AMULET_USE, SoundCategory.PLAYERS, 1.0F, 1.0F);
                stack.damage(1, user, LivingEntity.getSlotForHand(hand));
                int j = distance;
                int k = user.getBlockPos().getX();
                int l = user.getBlockPos().getY();
                int m = user.getBlockPos().getZ();
                Box box = (new Box(k, l, m, k + 1, l + 1, m + 1)).expand(j).stretch(0.0, world.getHeight(), 0.0);
                List<PlayerEntity> list = world.getNonSpectatingEntities(PlayerEntity.class, box);
                if (!list.isEmpty()) {
                    for (PlayerEntity playerEntity : list) {
                        if (user.getBlockPos().isWithinDistance(playerEntity.getBlockPos(), j)) {
                            if (playerEntity.getScoreboardTeam() != user.getScoreboardTeam() ||
                                    (playerEntity.getScoreboardTeam() == null && user.getScoreboardTeam() == null)
                            ) {
                            playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, duration, amplifier, false, true, true));
                            }
                        }
                    }
                }
            }
        }
        return TypedActionResult.success(stack, true);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.skyblock.minecraft_dungeons_header").setStyle(Style.EMPTY.withBold(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.artifact_iron_hide_amulet.tooltip1").setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.artifact_iron_hide_amulet.tooltip2").setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.artifact_iron_hide_amulet.tooltip3").setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
        SkyblockHelpers.appendMcdRarity(stack, tooltip);
        tooltip.add(Text.translatable("tooltip.skyblock.mcd__artifact_iron_hide_amulet.personal")
                .append(Text.literal(": ")
                        .append(Boolean.TRUE.equals(stack.get(SkyBlockRegistries.DataComponentTypeRegistries.MCD__IRON_HIDE_AMULET_PERSONAL_TOGGLE)) ?
                                Text.translatable("options.on").formatted(Formatting.GREEN):
                                Text.translatable("options.off").formatted(Formatting.RED))));
        tooltip.add(Text.translatable("tooltip.skyblock.artifact_iron_hide_amulet.tooltip4").setStyle(Style.EMPTY.withFormatting(Formatting.GREEN).withItalic(true)));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
