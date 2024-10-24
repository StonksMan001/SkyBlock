package net.me.skyblock.api.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    @Inject(method = "tryUseTotem", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;copy()Lnet/minecraft/item/ItemStack;", shift = At.Shift.BEFORE))
    public void tryUseTotem(DamageSource source, CallbackInfoReturnable<Boolean> cir, @Local Hand hand, @Local ItemStack itemStack2) {
        if (itemStack2.isOf(SkyBlockRegistries.ItemRegistries.SKYBLOCK__BONDED_TOTEM_OF_UNDYING)) {
            ItemStack itemStack3 = new ItemStack(Items.TOTEM_OF_UNDYING);
            if ((Object)this instanceof LivingEntity livingEntity) {
                livingEntity.setStackInHand(hand, itemStack3);
            }
        } else { itemStack2.decrement(1); }
    }
    @WrapOperation(method = "tryUseTotem", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
    public boolean isAlsoOf(ItemStack itemStack, Item item, Operation<Boolean> original) {
        return original.call(itemStack, item) || itemStack.isOf(SkyBlockRegistries.ItemRegistries.SKYBLOCK__BONDED_TOTEM_OF_UNDYING);
    }
    @Redirect(method = "tryUseTotem", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;decrement(I)V"))
    public void decrement(ItemStack instance, int amount) {
        instance.decrement(0);
    }
}
