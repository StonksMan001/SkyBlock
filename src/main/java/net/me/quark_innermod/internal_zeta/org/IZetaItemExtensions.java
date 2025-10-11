package net.me.quark_innermod.internal_zeta.org;

import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public interface IZetaItemExtensions {
    default boolean isEnderMaskZeta(ItemStack stack, PlayerEntity playerEntity, EndermanEntity endermanEntity) {
        return stack.getItem() == Items.CARVED_PUMPKIN;
    }
}
