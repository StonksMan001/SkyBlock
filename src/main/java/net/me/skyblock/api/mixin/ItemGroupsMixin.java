package net.me.skyblock.api.mixin;

import net.me.skyblock.items.util.GhostItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Objects;

@Mixin(ItemGroups.class)
public abstract class ItemGroupsMixin {
    @Shadow @Final public static RegistryKey<ItemGroup> BUILDING_BLOCKS;
    @Shadow @Final public static RegistryKey<ItemGroup> COLORED_BLOCKS;
    @Shadow @Final public static RegistryKey<ItemGroup> NATURAL;
    @Shadow @Final public static RegistryKey<ItemGroup> FUNCTIONAL;
    @Shadow @Final public static RegistryKey<ItemGroup> REDSTONE;
    @Shadow @Final public static RegistryKey<ItemGroup> COMBAT;
    @Shadow @Final public static RegistryKey<ItemGroup> FOOD_AND_DRINK;
    @Shadow @Final public static RegistryKey<ItemGroup> TOOLS;
    @Shadow @Final public static RegistryKey<ItemGroup> INGREDIENTS;
    @Shadow @Final public static RegistryKey<ItemGroup> SPAWN_EGGS;
    @Shadow @Final public static RegistryKey<ItemGroup> OPERATOR;
    @Shadow @Final public static RegistryKey<ItemGroup> INVENTORY;
    @Shadow @Final public static RegistryKey<ItemGroup> HOTBAR;
    @Shadow @Final public static RegistryKey<ItemGroup> SEARCH;

    @Inject(method = "registerAndGetDefault(Lnet/minecraft/registry/Registry;)Lnet/minecraft/item/ItemGroup;", at=@At("RETURN"))
    private static void setCustomIconSupplier(Registry<ItemGroup> registry, CallbackInfoReturnable<ItemGroup> cir) {
        ((ItemGroupIconSupplierAccessor) Objects.requireNonNull(registry.get(BUILDING_BLOCKS))).setIconSupplier(() -> new ItemStack(GhostItems.Z__LOGO_V1));
        ((ItemGroupIconSupplierAccessor) Objects.requireNonNull(registry.get(COLORED_BLOCKS))).setIconSupplier(() -> new ItemStack(GhostItems.Z__LOGO_V2));
        ((ItemGroupIconSupplierAccessor) Objects.requireNonNull(registry.get(NATURAL))).setIconSupplier(() -> new ItemStack(GhostItems.Z__LOGO_V3));
        ((ItemGroupIconSupplierAccessor) Objects.requireNonNull(registry.get(FUNCTIONAL))).setIconSupplier(() -> new ItemStack(GhostItems.Z__LOGO_V4));
        ((ItemGroupIconSupplierAccessor) Objects.requireNonNull(registry.get(REDSTONE))).setIconSupplier(() -> new ItemStack(GhostItems.Z__LOGO_V5));

        /*((ItemGroupIconSupplierAccessor)registry.get(HOTBAR)).setIconSupplier(() -> new ItemStack(GhostItems.Z__LOGO_V6));
        ((ItemGroupIconSupplierAccessor)registry.get(SEARCH)).setIconSupplier(() -> new ItemStack(GhostItems.Z__LOGO_V6));
        ((ItemGroupIconSupplierAccessor)registry.get(TOOLS)).setIconSupplier(() -> new ItemStack(GhostItems.Z__LOGO_V6));
        ((ItemGroupIconSupplierAccessor)registry.get(COMBAT)).setIconSupplier(() -> new ItemStack(GhostItems.Z__LOGO_V6));
        ((ItemGroupIconSupplierAccessor)registry.get(FOOD_AND_DRINK)).setIconSupplier(() -> new ItemStack(GhostItems.Z__LOGO_V6));
        ((ItemGroupIconSupplierAccessor)registry.get(INGREDIENTS)).setIconSupplier(() -> new ItemStack(GhostItems.Z__LOGO_V6));
        ((ItemGroupIconSupplierAccessor)registry.get(SPAWN_EGGS)).setIconSupplier(() -> new ItemStack(GhostItems.Z__LOGO_V6));
        ((ItemGroupIconSupplierAccessor)registry.get(OPERATOR)).setIconSupplier(() -> new ItemStack(GhostItems.Z__LOGO_V6));
        ((ItemGroupIconSupplierAccessor)registry.get(INVENTORY)).setIconSupplier(() -> new ItemStack(GhostItems.Z__LOGO_V6));*/

    }
}