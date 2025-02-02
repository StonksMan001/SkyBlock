package net.me.skycore_supermod.mixin;

import net.me.mcd_innermod.items.mcd_ranged.TwinBowItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ProjectileEntity.class)
public abstract class ArrowEntityMixin {
    @Inject(method = "onDeflected", at = @At(value = "HEAD"))
    public void discardIfWeaponIsTwinBow(Entity deflector, boolean fromAttack, CallbackInfo ci) {
        if ((Object)this instanceof PersistentProjectileEntity persistentProjectileEntity) {
            if (persistentProjectileEntity.getWeaponStack().getItem() instanceof TwinBowItem) {
                persistentProjectileEntity.discard();
            }
        }
    }
}
