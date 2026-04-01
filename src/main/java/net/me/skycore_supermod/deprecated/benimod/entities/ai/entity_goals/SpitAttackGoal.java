package net.me.skycore_supermod.deprecated.benimod.entities.ai.entity_goals;

import net.me.skycore_supermod.deprecated.benimod.entities.NativeVillagerEntity;
import net.minecraft.entity.ai.goal.ProjectileAttackGoal;

@Deprecated
public class SpitAttackGoal extends ProjectileAttackGoal {
    private final NativeVillagerEntity nativeVillagerEntity;
    public SpitAttackGoal(NativeVillagerEntity nativeVillagerEntity, double mobSpeed, int intervalTicks, float maxShootRange) {
        super(nativeVillagerEntity, mobSpeed, intervalTicks, maxShootRange);
        this.nativeVillagerEntity = nativeVillagerEntity;
    }

    @Override
    public boolean canStart() {
        if (!nativeVillagerEntity.canSpit) {
            return false;
        } else return super.canStart();
    }
}
