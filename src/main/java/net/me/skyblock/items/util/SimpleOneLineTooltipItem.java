package net.me.skyblock.items.util;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class SimpleOneLineTooltipItem extends Item {
    private final Text text;
    public SimpleOneLineTooltipItem(Settings settings, Text text) {
        super(settings);
        this.text = text;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(text);
        super.appendTooltip(stack, context, tooltip, type);
    }
}
