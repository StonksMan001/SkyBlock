package net.me.skyblock.api.mixin;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.function.Supplier;

@Mixin(ItemGroup.class)
public interface ItemGroupIconSupplierAccessor {
    @Accessor
    @Mutable
    @Final
    void setIconSupplier(Supplier<ItemStack> supplier);
}
