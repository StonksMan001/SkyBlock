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

import java.util.Set;

@Mixin(VillagerEntity.class)
public class VillagerEntityMixin {
    @Unique
    private final ImmutableSet<Item> SKYBLOCK_GATHERABLE_ITEMS = ImmutableSet.of(SB_Items.SKYBLOCK__CHILLI_PEPPER, SB_Items.SKYBLOCK__CHILLI_PEPPER_SEEDS);
    @WrapOperation(method = "canGather", at = @At(value = "INVOKE", target = "Ljava/util/Set;contains(Ljava/lang/Object;)Z"))
    private boolean canAlsoGatherChilliPepperSeeds0(Set<Item> gatherable_items, Object item, Operation<Boolean> original) {
        return original.call(gatherable_items, item) || original.call(SKYBLOCK_GATHERABLE_ITEMS, item);
    }
}
