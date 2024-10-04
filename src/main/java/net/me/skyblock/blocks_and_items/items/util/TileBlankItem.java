package net.me.skyblock.blocks_and_items.items.util;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TileBlankItem extends Item {
    public static final byte[] VALUES = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static final String TILE_KEY = "Tiles";
    public static final String VALUE_KEY = "Values";

    public TileBlankItem(Settings settings) {
        super(settings);
    }
}