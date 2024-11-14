package net.me.skyblock.items.mcd.mcd_ranged;

import net.me.skyblock.items.mcd.McdItem;
import net.minecraft.item.*;

public class AutoCrossbowItem extends CrossbowItem {
    public AutoCrossbowItem(Settings settings) {
        super(settings); //TODO: this
    }

    @Override
    public int getItemBarColor(ItemStack stack) {
        return McdItem.getMcdItemBarColor();
    }
}
