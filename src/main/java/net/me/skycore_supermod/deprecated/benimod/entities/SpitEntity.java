package net.me.skycore_supermod.deprecated.benimod.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.LlamaSpitEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

@Deprecated
public class SpitEntity extends LlamaSpitEntity {
    public SpitEntity(World world, LivingEntity owner) {
        super(EntityType.LLAMA_SPIT, world);
        this.setOwner(owner);
        this.setPosition(owner.getX() - (double)(owner.getWidth() + 1.0F) * (double)0.5F * (double)MathHelper.sin(owner.bodyYaw * ((float)Math.PI / 180F)), owner.getEyeY() - (double)0.1F, owner.getZ() + (double)(owner.getWidth() + 1.0F) * (double)0.5F * (double)MathHelper.cos(owner.bodyYaw * ((float)Math.PI / 180F)));
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        if (!(entityHitResult.getEntity() instanceof NativeVillagerEntity)) super.onEntityHit(entityHitResult);
    }
}