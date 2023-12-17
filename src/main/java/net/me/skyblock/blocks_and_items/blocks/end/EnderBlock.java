package net.me.skyblock.blocks_and_items.blocks.end;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityStatuses;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class EnderBlock extends Block {
    public EnderBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!world.isClient && entity instanceof LivingEntity livingEntity) {
            double d = livingEntity.getX();
            double e = livingEntity.getY();
            double f = livingEntity.getZ();
            for (int i = 0; i < 16; ++i) {
                double g = livingEntity.getX() + (livingEntity.getRandom().nextDouble() - 0.5) * 16.0;
                double h = MathHelper.clamp(livingEntity.getY() + (double) (livingEntity.getRandom().nextInt(16) - 8), (double) world.getBottomY(), (double) (world.getBottomY() + ((ServerWorld) world).getLogicalHeight() - 1));
                double j = livingEntity.getZ() + (livingEntity.getRandom().nextDouble() - 0.5) * 16.0;
                if (livingEntity.hasVehicle()) {
                    livingEntity.stopRiding();
                }
                Vec3d vec3d = livingEntity.getPos();
                if (!livingEntity.teleport(g, h, j, true)) continue;
                world.emitGameEvent(GameEvent.TELEPORT, vec3d, GameEvent.Emitter.of(livingEntity));
                SoundEvent soundEvent = livingEntity instanceof FoxEntity ? SoundEvents.ENTITY_FOX_TELEPORT : SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT;
                world.playSound(null, d, e, f, soundEvent, SoundCategory.PLAYERS, 1.0f, 1.0f);
                livingEntity.playSound(soundEvent, 1.0f, 1.0f);
                break;
            }
        }
        super.onSteppedOn(world, pos, state, entity);
    }
}
