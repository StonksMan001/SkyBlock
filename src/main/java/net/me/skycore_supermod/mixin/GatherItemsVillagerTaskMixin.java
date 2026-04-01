package net.me.skycore_supermod.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.me.skyblock__innermod.registries.SB_Items;
import net.minecraft.entity.ai.brain.task.GatherItemsVillagerTask;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Mixin(GatherItemsVillagerTask.class)
public abstract class GatherItemsVillagerTaskMixin {
    @WrapOperation(method = "keepRunning(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/passive/VillagerEntity;J)V", at = @At(value = "INVOKE", target = "Ljava/util/Map;keySet()Ljava/util/Set;"))
    public Set<Item> setAdditionalKeys(Map<Item, Integer> instance, Operation<Set<Item>> original) {
        return Stream.concat(original.call(instance).stream(), Set.of(SB_Items.SKYBLOCK__CHILLI_PEPPER).stream()).collect(Collectors.toUnmodifiableSet());
    }
}
