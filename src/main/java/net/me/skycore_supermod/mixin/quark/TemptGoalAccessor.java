package net.me.skycore_supermod.mixin.quark;

import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.function.Predicate;

@Mixin(TemptGoal.class)
public interface TemptGoalAccessor {

    @Accessor("foodPredicate")
    Predicate<ItemStack> quark$getFoodPredicate();
}
