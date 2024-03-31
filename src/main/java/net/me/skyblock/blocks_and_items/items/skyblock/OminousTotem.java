package net.me.skyblock.blocks_and_items.items.skyblock;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;

public class OminousTotem extends Item {
    private static final String GROUP_COUNT_KEY = "GroupCount";
    public OminousTotem(Settings settings) {
        super(settings);
    }
    public static void setGroupCount(ItemStack stack, int count) {
        NbtCompound nbtCompound = stack.getOrCreateNbt();
        nbtCompound.putInt(GROUP_COUNT_KEY, count);
    }
    public static int getGroupCount(ItemStack stack) {
        NbtCompound nbtCompound = stack.getNbt();
        if (nbtCompound != null) {
            return nbtCompound.getInt(GROUP_COUNT_KEY);
        } else {
            return 0;
        }
    }
}
