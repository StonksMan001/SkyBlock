package net.me.skyblock.server;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.me.skyblock.SkyBlock;
import net.minecraft.world.GameRules;

public class ModGameRules {
    public static final GameRules.Key<GameRules.IntRule> SKYBLOCK__GOLDEN_CROP_CHANCE = GameRuleRegistry.register("skyblock__golden_crop_chance", GameRules.Category.UPDATES, GameRuleFactory.createIntRule(25));

    public static void registerModGameRules() {
        SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering GameRules for " + SkyBlock.MOD_ID);
    }
}
