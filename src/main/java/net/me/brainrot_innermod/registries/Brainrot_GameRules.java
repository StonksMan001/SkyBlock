package net.me.brainrot_innermod.registries;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;

public class Brainrot_GameRules {
    public static final GameRules.Key<GameRules.IntRule> BRAINROT__BRAINROT_SPREAD_CHANCE = GameRuleRegistry.register("brainrot__brainrotSpreadChance", GameRules.Category.UPDATES, GameRuleFactory.createIntRule(10));
}
