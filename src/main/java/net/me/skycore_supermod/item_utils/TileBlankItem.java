package net.me.skycore_supermod.item_utils;

import net.minecraft.item.Item;

public class TileBlankItem extends Item {
    public static final byte[] VALUES = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static final String TILE_KEY = "Tiles";
    public static final String VALUE_KEY = "Values";

    public TileBlankItem(Settings settings) {
        super(settings);
    }
}