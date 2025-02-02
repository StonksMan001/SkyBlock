package net.me.mcd_innermod.registries;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;

public class MCD_GameRules {
    public static final GameRules.Key<GameRules.BooleanRule> MCD__POP_FLOWERS_ALWAYS_HIDE = GameRuleRegistry.register("mcd__popFlowersAlwaysHide", GameRules.Category.UPDATES, GameRuleFactory.createBooleanRule(false));
}
