package net.me.mcd_innermod.registries;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.world.GameRules;

public class MCD_GameRules {
    public static final GameRules.Key<GameRules.BooleanRule> MCD__POP_FLOWERS_ALWAYS_HIDE = GameRuleRegistry.register("mcd__popFlowersAlwaysHide", GameRules.Category.UPDATES, GameRuleFactory.createBooleanRule(false));
    public static final GameRules.Key<GameRules.IntRule> MCD__ANCIENT_LODESTONE_RANGE = GameRuleRegistry.register("mcd__ancientLodestoneRange", GameRules.Category.UPDATES, GameRuleFactory.createIntRule(15));
    public static final GameRules.Key<GameRules.IntRule> MCD__ANCIENT_LODESTONE_MUSIC_CHANCE = GameRuleRegistry.register("mcd__ancientLodestoneMusicChance", GameRules.Category.UPDATES, GameRuleFactory.createIntRule(5));
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering GameRules for \"MCD\" innermod");
    }
}
