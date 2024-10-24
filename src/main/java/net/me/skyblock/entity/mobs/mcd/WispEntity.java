package net.me.skyblock.entity.mobs.mcd;

import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.AllayEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;

public class WispEntity extends AllayEntity {  //TODO: this
    public WispEntity(EntityType<? extends AllayEntity> entityType, World world) {
        super(entityType, world);
    }
    public static DefaultAttributeContainer.Builder setAttributes() {
        return AllayEntity.createAllayAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 15.0)
                .add(EntityAttributes.GENERIC_FLYING_SPEED, 0.1f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.1f)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2.0);
    }

    protected void initGoals() {
        super.initGoals();
    }
    @Override
    protected SoundEvent getAmbientSound() {
        return SkyBlockRegistries.SoundRegistries.WISP_MOTION;
    }

    //@Override
    /*public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
    }*/

    //@Override
    /*public AnimatableInstanceCache getAnimatableInstanceCache() {
        return null;
    }*/

    //@Override
    public double getTick(Object object) {
        return 0;
    }
}
