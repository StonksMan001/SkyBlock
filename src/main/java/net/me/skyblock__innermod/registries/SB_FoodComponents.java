package net.me.skyblock__innermod.registries;

import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;

public class SB_FoodComponents {
    public static final FoodComponent SKYBLOCK__STEAM_DUMPLING = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(1.1f)
            .build();
    public static final FoodComponent SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER = new FoodComponent.Builder()
            .nutrition(7)
            .saturationModifier(1.4f)
            .build();
    public static final FoodComponent SKYBLOCK__STEAM_DUMPLING_WITH_MOLTEN_BUTTER_AND_SUGAR_POPPY_MIXTURE = new FoodComponent.Builder()
            .nutrition(9)
            .saturationModifier(1.9f)
            .build();
    public static final FoodComponent SKYBLOCK__BLUEBERRIES = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2400, 4), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodComponent SKYBLOCK__CHILLI_PEPPER = new FoodComponent.Builder().nutrition(6).saturationModifier(1.0f)
            .build();
    public static final FoodComponent SKYBLOCK__GOLDEN_CHILLI_PEPPER = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(1.75f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2400, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 2), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodComponent SKYBLOCK__PUFFBALL_MUSHROOM_FLESH = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 0), 0.4f)
            .alwaysEdible()
            .build();
    public static final FoodComponent SKYBLOCK__COOKED_PUFFBALL_MUSHROOM_FLESH = new FoodComponent.Builder()
            .nutrition(10)
            .saturationModifier(1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 0), 0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 200, 0), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodComponent SKYBLOCK__PUFFBALL_MUSHROOM_STEW = new FoodComponent.Builder()
            .nutrition(10)
            .saturationModifier(1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 0), 0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200, 0), 1.0f)
            .usingConvertsTo(Items.BOWL)
            .alwaysEdible()
            .build();
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering FoodComponents for \"SkyBlock\" innermod");
    }
}
