package net.me.skyblock.items.skyblock;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class SporePlanterBoxItem extends BlockItem {
    private final String sporeTypeTooltip;
    public SporePlanterBoxItem(Block block, Settings settings, String sporeTypeTooltip) {
        super(block, settings);
        this.sporeTypeTooltip = sporeTypeTooltip;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(
                Text.translatable("tooltip.skyblock.skyblock__spore_type").formatted(Formatting.GRAY)
                .append(Text.literal(": ").formatted(Formatting.GRAY))
                .append(Text.translatable(sporeTypeTooltip).formatted(Formatting.GRAY)));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
