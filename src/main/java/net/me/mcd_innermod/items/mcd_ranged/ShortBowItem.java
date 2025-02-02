/*
 * Decompiled with CFR 0.2.0 (FabricMC d28b102d).
 */
package net.me.mcd_innermod.items.mcd_ranged;

import net.me.mcd_innermod.items.McdItem;
import net.minecraft.item.*;

public class ShortBowItem extends BowItem {
    public ShortBowItem(Settings settings) {
        super(settings); //TODO: this
    }
    @Override
    public int getItemBarColor(ItemStack stack) {
        return McdItem.getMcdItemBarColor();
    }
}

