package net.me.sp5_innermod.registries;

import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class SP5_FoodComponents {
    public static final FoodComponent SP5__ENDERITE_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 900, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 2000, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1200, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3200, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 4400, 4), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodComponent SP5__ENCHANTED_ENDERITE_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1600, 4), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 7000, 4), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 9000, 4), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 7200, 4), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 9000, 4), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 10000, 4), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 9000, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 5000, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 4400, 4), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 8000, 4), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 7000, 4), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 5000, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 5000, 0), 1.0f)
            .alwaysEdible()
            .build();
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering FoodComponents for \"Enderite Addon\" innermod");
    }
}
