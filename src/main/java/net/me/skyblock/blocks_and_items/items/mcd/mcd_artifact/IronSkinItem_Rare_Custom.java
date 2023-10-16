package net.me.skyblock.blocks_and_items.items.mcd.mcd_artifact;

import net.me.skyblock.sound.ModSounds;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.List;

public class IronSkinItem_Rare_Custom extends Item {
    public IronSkinItem_Rare_Custom(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient() && hand == Hand.MAIN_HAND ) {
            user.getItemCooldownManager().set(this, 500);
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 240, 2, false, false, true));
            world.playSoundFromEntity((PlayerEntity)null, user, ModSounds.ARTIFACT_IRON_HIDE_AMULET_USED, SoundCategory.PLAYERS, 1.0F, 1.0F);
            user.getStackInHand(hand).damage(1, user,
                    playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));
        } else if (!world.isClient() && hand == Hand.OFF_HAND ) {
            user.getItemCooldownManager().set(this, 500);
            world.playSoundFromEntity((PlayerEntity)null, user, ModSounds.ARTIFACT_IRON_HIDE_AMULET_USED, SoundCategory.PLAYERS, 1.0F, 1.0F);
            user.getStackInHand(hand).damage(1, user,
                    playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));
            int j = 20;
            int k = user.getBlockPos().getX();
            int l = user.getBlockPos().getY();
            int m = user.getBlockPos().getZ();
            Box box = (new Box((double)k, (double)l, (double)m, (double)(k + 1), (double)(l + 1), (double)(m + 1))).expand((double)j).stretch(0.0, (double)world.getHeight(), 0.0);
            List<PlayerEntity> list = world.getNonSpectatingEntities(PlayerEntity.class, box);
            if (!list.isEmpty()) {
                Iterator var10 = list.iterator();

                while(var10.hasNext()) {
                    PlayerEntity playerEntity = (PlayerEntity)var10.next();
                    if (user.getBlockPos().isWithinDistance(playerEntity.getBlockPos(), (double)j)) {
                        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 240, 2, false, false, true));
                    }
                }

            }

        }
        return TypedActionResult.success(user.getStackInHand(hand), true);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.skyblock.artifact_iron_hide_amulet.tooltip1").setStyle(Style.EMPTY.withItalic(true)));
        tooltip.add(Text.translatable("tooltip.skyblock.artifact_iron_hide_amulet.tooltip2").setStyle(Style.EMPTY.withItalic(true)));
        tooltip.add(Text.translatable("tooltip.skyblock.artifact_iron_hide_amulet.tooltip3").setStyle(Style.EMPTY.withItalic(true)));
        tooltip.add(Text.translatable("tooltip.skyblock.rarity.rare"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
