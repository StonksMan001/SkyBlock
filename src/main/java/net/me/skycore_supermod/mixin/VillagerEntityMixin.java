package net.me.skycore_supermod.mixin;

import com.google.common.collect.ImmutableSet;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.me.skyblock__innermod.registries.SB_Items;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Mixin(VillagerEntity.class)
public abstract class VillagerEntityMixin {
    @Unique
    private final ImmutableSet<Item> SKYBLOCK_GATHERABLE_ITEMS = ImmutableSet.of(SB_Items.SKYBLOCK__CHILLI_PEPPER, SB_Items.SKYBLOCK__CHILLI_PEPPER_SEEDS);
    @WrapOperation(method = "canGather", at = @At(value = "INVOKE", target = "Ljava/util/Set;contains(Ljava/lang/Object;)Z"))
    private boolean canAlsoGatherChilliPepperSeeds0(Set<Item> gatherable_items, Object item, Operation<Boolean> original) {
        return original.call(gatherable_items, item) || original.call(SKYBLOCK_GATHERABLE_ITEMS, item);
    }
    @WrapOperation(method = "consumeAvailableFood", at = @At(value = "INVOKE", target = "Ljava/util/Map;get(Ljava/lang/Object;)Ljava/lang/Object;"))
    private Object consumeAvailableFood(Map<Item, Integer> instance, Object item, Operation<Integer> original) {
        if (item instanceof Item item0 && item0 == SB_Items.SKYBLOCK__CHILLI_PEPPER) return 1;
        return original.call(instance, item);
    }
    @WrapOperation(method = "getAvailableFood", at = @At(value = "INVOKE", target = "Ljava/util/Map;entrySet()Ljava/util/Set;"))
    private Set<Map.Entry<Item, Integer>> getAvailableFood(Map<Item, Integer> instance, Operation<Set<Map.Entry<Item, Integer>>> original) {
        return Stream.concat(original.call(instance).stream(), Set.of(Map.entry(SB_Items.SKYBLOCK__CHILLI_PEPPER, 1)).stream()).collect(Collectors.toUnmodifiableSet());
    }
}
