package net.me.skyblock.items.mcd.mcd_artifact;

import net.me.skyblock.items.mcd.McdArtifactItem;
import net.me.skyblock.registries.SkyBlockRegistries;
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
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.List;

public class IronSkinItem extends McdArtifactItem {
    public int distance = 15;
    public int duration = 200;
    public int amplifier = 2;
    public String rarityTooltip = "tooltip.skyblock.rarity.rare";

    public IronSkinItem(Settings settings) {
        super(settings);
    }


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient() && hand == Hand.MAIN_HAND ) {
            user.getItemCooldownManager().set(this, 500);
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, duration, amplifier, false, false, true));
            world.playSoundFromEntity(null, user, SkyBlockRegistries.SoundRegistries.MCD__IRON_HIDE_AMULET_USE, SoundCategory.PLAYERS, 1.0F, 1.0F);
            user.getStackInHand(hand).damage(1, user, LivingEntity.getSlotForHand(hand));
        } else if (!world.isClient() && hand == Hand.OFF_HAND ) {
            user.getItemCooldownManager().set(this, 500);
            world.playSoundFromEntity(null, user, SkyBlockRegistries.SoundRegistries.MCD__IRON_HIDE_AMULET_USE, SoundCategory.PLAYERS, 1.0F, 1.0F);
            user.getStackInHand(hand).damage(1, user, LivingEntity.getSlotForHand(hand));
            int j = distance;
            int k = user.getBlockPos().getX();
            int l = user.getBlockPos().getY();
            int m = user.getBlockPos().getZ();
            Box box = (new Box(k, l, m, k + 1, l + 1, m + 1)).expand(j).stretch(0.0, world.getHeight(), 0.0);
            List<PlayerEntity> list = world.getNonSpectatingEntities(PlayerEntity.class, box);
            if (!list.isEmpty()) {
                for (PlayerEntity playerEntity : list) {
                    if (user.getBlockPos().isWithinDistance(playerEntity.getBlockPos(), j)) {
                        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, duration, amplifier, false, false, true));
                    }
                }
            }
        }
        return TypedActionResult.success(user.getStackInHand(hand), true);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.skyblock.minecraft_dungeons_header").setStyle(Style.EMPTY.withBold(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.artifact_iron_hide_amulet.tooltip1").setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.artifact_iron_hide_amulet.tooltip2").setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.artifact_iron_hide_amulet.tooltip3").setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable(rarityTooltip));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
