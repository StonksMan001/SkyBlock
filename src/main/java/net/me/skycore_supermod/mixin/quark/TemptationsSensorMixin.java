package net.me.skycore_supermod.mixin.quark;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.me.quark_innermod.content.automation.module.FeedingTroughModule;
import net.minecraft.entity.ai.brain.sensor.TemptationsSensor;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.List;

@Mixin(TemptationsSensor.class)
public abstract class TemptationsSensorMixin {

    @ModifyExpressionValue(
            method = "sense(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/mob/PathAwareEntity;)V",
            at = @At(value = "INVOKE", target = "Ljava/util/stream/Stream;collect(Ljava/util/stream/Collector;)Ljava/lang/Object;")
    )
    //Mixin doesn't statically know the type and defaults to Object for some reason. I think the injector matches before a CHECKCAST.
    public Object quark$findTroughs(Object playersErased, ServerWorld world, PathAwareEntity mob) {
        @SuppressWarnings("unchecked")
        List<PlayerEntity> players = (List<PlayerEntity>) playersErased;

        if (mob instanceof AnimalEntity animalEntity) {
            PlayerEntity first = players.isEmpty() ? null : players.get(0);
            // If first is there, it's already a valid temptation. We do not attempt to modify
            if(first == null) {
                PlayerEntity replacement = FeedingTroughModule.modifyTemptingSensor((TemptationsSensor) (Object) this, animalEntity, world);

                //Collectors.toList returns a mutable list, so it's okay to modify it. This is technically a Java implementation detail.
                if (replacement != null) players.add(replacement);
            }
        }
        return players;
    }
}
