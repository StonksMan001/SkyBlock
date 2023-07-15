package net.me.skyblock.item.not_important_rn;

import net.me.skyblock.SkyBlock;
import net.me.skyblock.item.not_important_rn.ModItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public abstract class ModItem extends Item {
    public ModItem(Settings settings) {
        super(settings);
    }

    public boolean hasRedGlint(ModItemStack stack) {
        return stack.hasEnchantments();
    }
    public static void register() {
        SkyBlock.LOGGER.debug("Registering ModItem for " + SkyBlock.MOD_ID);
    }

    public abstract boolean hasRedGlint(ItemStack stack);
}
