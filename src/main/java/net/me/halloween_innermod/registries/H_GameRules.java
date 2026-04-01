package net.me.halloween_innermod.registries;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.world.GameRules;

public class H_GameRules {
    public static final GameRules.Key<GameRules.BooleanRule> H__ENABLE_HALLOWEEN_EFFECTS = GameRuleRegistry.register("h__enableHalloweenEffects", GameRules.Category.UPDATES, GameRuleFactory.createBooleanRule(false));

    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering GameRules for  \"Halloween\" innermod");
    }
}
