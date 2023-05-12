/*
 * Decompiled with CFR 0.2.0 (FabricMC d28b102d).
 */
package net.me.skyblock.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Loran
extends Item {
    public Loran(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}

