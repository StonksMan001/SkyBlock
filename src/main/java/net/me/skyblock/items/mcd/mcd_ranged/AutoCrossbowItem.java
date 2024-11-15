package net.me.skyblock.items.mcd.mcd_ranged;

import net.me.skyblock.api.mixin.CrossbowItemAccessors;
import net.me.skyblock.items.mcd.McdItem;
import net.me.skyblock.registries.SkyBlock;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ChargedProjectilesComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

import java.util.List;

public class AutoCrossbowItem extends CrossbowItem {
    private static final float RELOAD_DECREASE_PERCENT = 0.09f; //12%
    private static final float MIN_RELOAD_TIME = 0.25f; // 150% cap
    private long lastShotTime = 0;
    public float reloadBonus = 1.0f; // reload multiplier.

    public AutoCrossbowItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        long currentTime = world.getTime();
        if (currentTime - lastShotTime > 100) reloadBonus = 1.0f;

        ItemStack itemStack = user.getStackInHand(hand);
        ChargedProjectilesComponent chargedProjectilesComponent = itemStack.get(DataComponentTypes.CHARGED_PROJECTILES);
        if (chargedProjectilesComponent != null && !chargedProjectilesComponent.isEmpty()) {
            this.shootAll(world, user, hand, itemStack, CrossbowItemAccessors.getSpeed(chargedProjectilesComponent), 1.0F, null);
            lastShotTime = currentTime;
            reloadBonus = Math.max(MIN_RELOAD_TIME, reloadBonus - RELOAD_DECREASE_PERCENT);
            return TypedActionResult.consume(itemStack);
        } else if (!user.getProjectileType(itemStack).isEmpty()) {
            ((CrossbowItemAccessors) this).setCharged(false);
            ((CrossbowItemAccessors) this).setLoaded(false);
            user.setCurrentHand(hand);
            return TypedActionResult.consume(itemStack);
        } else {
            return TypedActionResult.fail(itemStack);
        }
    }
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.skyblock.minecraft_dungeons_header").setStyle(Style.EMPTY.withBold(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.mcd__auto_crossbow.tooltip1").setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.mcd__auto_crossbow.tooltip2").setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
        tooltip.add(Text.translatable("tooltip.skyblock.rarity.unique"));
        tooltip.add(Text.translatable("enchantment.skyblock.mcd__accelerate").setStyle(Style.EMPTY.withFormatting(Formatting.GREEN)));
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
}
