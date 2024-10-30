package net.me.skyblock.items.util;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class NullItem extends Item {
    public static final byte[] VALUES = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static final String NULL_KEY = "Spaces";
    public static final String VALUE_KEY = "Values";

    public NullItem(Settings settings) {
        super(settings);
    }
}