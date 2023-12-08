package net.me.skyblock.blocks_and_items.items.util;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class NullItem extends Item {
    public static final byte[] VALUES = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static final String NULL_KEY = "Spaces";
    public static final String VALUE_KEY = "Values";

    private final Block block;
    public NullItem(Block block, Item.Settings settings) {
        super(settings);
        this.block = block;
    }

    @Override
    public String getTranslationKey() {
        return this.block.getTranslationKey();
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        this.block.appendTooltip(stack, world, tooltip, context);
    }
    public static void setSpaces(ItemStack stack, byte value) {
        stack.getOrCreateSubNbt(NULL_KEY).putByte(VALUE_KEY, value);
    }
}