package net.me.skycore_supermod.mixin;

import net.me.mcd_innermod.items.mcd_ranged.TwinBowItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Objects;

@Mixin(ProjectileEntity.class)
public abstract class ArrowEntityMixin {
    @Inject(method = "onDeflected", at = @At(value = "HEAD"))
    public void discardIfWeaponIsTwinBow(Entity deflector, boolean fromAttack, CallbackInfo ci) {
        if ((Object)this instanceof PersistentProjectileEntity persistentProjectileEntity) {
            ItemStack weaponStack = persistentProjectileEntity.getWeaponStack();
            if (Objects.nonNull(weaponStack) && weaponStack.getItem() instanceof TwinBowItem) {
                persistentProjectileEntity.discard();
            }
        }
    }
}
