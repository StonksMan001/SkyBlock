/*
 * Decompiled with CFR 0.2.0 (FabricMC d28b102d).
 */
package net.me.skyblock.items.end;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnchantedEnderiteAppleItem
extends Item {
    public EnchantedEnderiteAppleItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}

