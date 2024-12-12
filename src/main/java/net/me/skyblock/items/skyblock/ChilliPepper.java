package net.me.skyblock.items.skyblock;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

public class ChilliPepper extends Item {
    public ChilliPepper(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        Random random = new Random();
        if (random.nextInt(2) == 0) user.setOnFireFor(3);
        return super.finishUsing(stack, world, user);
    }
}
