package net.me.skycore_supermod.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.ProjectileAttackGoal;
import net.minecraft.entity.mob.MobEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ProjectileAttackGoal.class)
public interface ProjectileAttackGoalAccessor {
    @Accessor
    public LivingEntity getTarget();
    @Accessor
    public MobEntity getMob();
    @Accessor
    public float getMaxShootRange();
}
