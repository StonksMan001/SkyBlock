package net.me.skyblock.items.skyblock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class Trophy {

    public static class Item extends net.minecraft.item.Item {
        public String[] information;
        public String[] backgroundInformation;
        public Item(Settings settings, String[] information, String[] backgroundInformation) {
            super(settings.maxCount(1));
            this.information = information;
            this.backgroundInformation = backgroundInformation;
        }
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            for (String string : information) {
                tooltip.add(Text.translatable(string).setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
            }
            tooltip.add(Text.translatable("tooltip.skyblock.skyblock__trophy_background_info_header").setStyle(Style.EMPTY.withBold(true).withFormatting(Formatting.GRAY)));
            for (String string : backgroundInformation) {
                tooltip.add(Text.translatable(string).setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
            }
            super.appendTooltip(stack, context, tooltip, type);
        }
    }
    public static class BlockItem extends net.minecraft.item.BlockItem {
        public String[] information;
        public String[] backgroundInformation;
        public BlockItem(Block block, Settings settings, String[] information, String[] backgroundInformation) {
            super(block, settings.maxCount(1));
            this.information = information;
            this.backgroundInformation = backgroundInformation;
        }
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            for (String string : information) {
                tooltip.add(Text.translatable(string).setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
            }
            tooltip.add(Text.translatable("tooltip.skyblock.skyblock__trophy_background_info_header").setStyle(Style.EMPTY.withBold(true).withFormatting(Formatting.GRAY)));
            for (String string : backgroundInformation) {
                tooltip.add(Text.translatable(string).setStyle(Style.EMPTY.withItalic(true).withFormatting(Formatting.GRAY)));
            }
            super.appendTooltip(stack, context, tooltip, type);
        }
    }
}

