package net.me.skyblock.entity.mobs.skyblock;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.EvokerEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.SpellcastingIllagerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class OminousEvokerEntity extends EvokerEntity {
    public OminousEvokerEntity(EntityType<? extends EvokerEntity> entityType, World world) {
        super(entityType, world);
    }
    public static DefaultAttributeContainer.Builder setAttributes() {
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.75)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 20.0)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 100.0);
    }
    @Override
    protected void initGoals() {
        super.initGoals();
        this.goalSelector.add(3, new SpreadOminousInfectionGoal());
    }
    private class SpreadOminousInfectionGoal extends Goal {
        SpreadOminousInfectionGoal() {
        }
        @Override
        public boolean canStart() {
            LivingEntity livingEntity = OminousEvokerEntity.this;
            World world = livingEntity.getWorld();
            return world.getBlockState(livingEntity.getBlockPos().down()).isOf(Blocks.GRASS_BLOCK);
        }

        @Override
        public void start() {
            LivingEntity livingEntity = OminousEvokerEntity.this;
            World world = livingEntity.getWorld();
            if (world.getBlockState(livingEntity.getBlockPos().down()).isOf(Blocks.GRASS_BLOCK)) {
                world.setBlockState(livingEntity.getBlockPos().down(), Blocks.CRIMSON_NYLIUM.getDefaultState());
            }
        }
    }
}