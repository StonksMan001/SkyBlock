package net.me.skyblock.items.skyblock;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.World;

public class BondedTotemOfUndying extends Item {
    //public static final String GROUP_COUNT_KEY = "GroupCount";
    public BondedTotemOfUndying(Settings settings) {
        super(settings);
    }

    /*@Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (stack.getNbt() == null) {
            setGroupCount(stack, 2);
        }
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
    }*/
}
