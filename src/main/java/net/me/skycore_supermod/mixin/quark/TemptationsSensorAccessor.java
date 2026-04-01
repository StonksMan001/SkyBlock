package net.me.skycore_supermod.mixin.quark;

import net.minecraft.entity.ai.brain.sensor.TemptationsSensor;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.function.Predicate;

@Mixin(TemptationsSensor.class)
public interface TemptationsSensorAccessor {
    @Accessor("predicate")
    Predicate<ItemStack> quark$getPredicate();
}
