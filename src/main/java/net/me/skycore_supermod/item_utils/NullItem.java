package net.me.skycore_supermod.item_utils;

import net.minecraft.item.Item;

public class NullItem extends Item {
    public static final byte[] VALUES = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static final String NULL_KEY = "Spaces";
    public static final String VALUE_KEY = "Values";

    public NullItem(Settings settings) {
        super(settings);
    }
}