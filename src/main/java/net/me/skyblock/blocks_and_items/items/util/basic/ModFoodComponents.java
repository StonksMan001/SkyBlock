package net.me.skyblock.blocks_and_items.items.util.basic;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent SP5__ENDERITE_APPLE = new FoodComponent.Builder().nutrition(4)
            .saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 900, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 2000, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1200, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3200, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 4400, 4), 1.0f)
            .alwaysEdible().build();
    public static final FoodComponent SP5__ENCHANTED_ENDERITE_APPLE = new FoodComponent.Builder().nutrition(4)
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
            .alwaysEdible().build();
    public static final FoodComponent SKYBLOCK__STEAM_DUMPLING = new FoodComponent.Builder().nutrition(5).saturationModifier(1.1f).build();
    public static final FoodComponent SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER = new FoodComponent.Builder().nutrition(7).saturationModifier(1.4f).build();
    public static final FoodComponent SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER_AND_SUGAR_POPPY_MIXTURE = new FoodComponent.Builder().nutrition(9).saturationModifier(1.9f).build();
    public static final FoodComponent SKYBLOCK__BLUEBERRIES = new FoodComponent.Builder().nutrition(5).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2400, 4), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodComponent SKYBLOCK__CHILLI_PEPPER = new FoodComponent.Builder().nutrition(6).saturationModifier(1.0f)
            .build();
    public static final FoodComponent SKYBLOCK__GOLDEN_CHILLI_PEPPER = new FoodComponent.Builder().nutrition(8).saturationModifier(1.75f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2400, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 2), 1.0f)
            .alwaysEdible()
            .build();
}
