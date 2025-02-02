package net.me.skyblock__innermod.registries;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.world.GameRules;

public class SB_GameRules {
    public static final GameRules.Key<GameRules.IntRule> SKYBLOCK__GOLDEN_CROP_GROWTH_CHANCE = GameRuleRegistry.register("skyblock__goldenCropGrowthChance", GameRules.Category.UPDATES, GameRuleFactory.createIntRule(25));
    public static final GameRules.Key<GameRules.IntRule> SKYBLOCK__RARE_MUSHROOM_GROWTH_CHANCE = GameRuleRegistry.register("skyblock__rareMushroomGrowthChance", GameRules.Category.UPDATES, GameRuleFactory.createIntRule(30));
    public static final GameRules.Key<GameRules.BooleanRule> SKYBLOCK__DO_ARROWS_BREAK_GLASS_BLOCKS = GameRuleRegistry.register("skyblock__doArrowsBreakGlassBlocks", GameRules.Category.UPDATES, GameRuleFactory.createBooleanRule(true));
    public static final GameRules.Key<GameRules.BooleanRule> SKYBLOCK__DO_BLUEBERRIES_GROW = GameRuleRegistry.register("skyblock__doBlueberriesGrow", GameRules.Category.UPDATES, GameRuleFactory.createBooleanRule(true));

    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering GameRules for " + SkyCore.MOD_ID);
    }
}
