package net.me.skyblock.api.mixin;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.WrittenBookItem;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(WrittenBookItem.class)
public abstract class WrittenBookItemMixin extends Item {
    public WrittenBookItemMixin(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return false;
    }
}
