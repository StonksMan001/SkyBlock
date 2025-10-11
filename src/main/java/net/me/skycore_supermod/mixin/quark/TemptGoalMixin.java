package net.me.skycore_supermod.mixin.quark;

import net.me.quark_innermod.content.automation.module.FeedingTroughModule;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TemptGoal.class)
public abstract class TemptGoalMixin {

    @Shadow
    protected PlayerEntity closestPlayer;

    @Shadow
    @Final
    protected PathAwareEntity mob;

    @Inject(method = "canStart", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/ai/goal/TemptGoal;closestPlayer:Lnet/minecraft/entity/player/PlayerEntity;", ordinal = 0, shift = At.Shift.AFTER))
    private void findTroughs(CallbackInfoReturnable<Boolean> ci) {
        if (closestPlayer == null && mob.getWorld() instanceof ServerWorld world && mob instanceof AnimalEntity animalEntity) {
            // here valid players with food have already been selected
            closestPlayer = FeedingTroughModule.modifyTemptGoal((TemptGoal) (Object) this, animalEntity, world);
        }
    }
}
