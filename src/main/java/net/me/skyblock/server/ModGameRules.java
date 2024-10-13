package net.me.skyblock.server;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.me.skyblock.SkyBlock;
import net.minecraft.world.GameRules;

public class ModGameRules {
    public static final GameRules.Key<GameRules.IntRule> SKYBLOCK__GOLDEN_CROP_GROWTH_CHANCE = GameRuleRegistry.register("skyblock__goldenCropGrowthChance", GameRules.Category.UPDATES, GameRuleFactory.createIntRule(25));
    public static final GameRules.Key<GameRules.IntRule> SKYBLOCK__RARE_MUSHROOM_GROWTH_CHANCE = GameRuleRegistry.register("skyblock__rareMushroomGrowthChance", GameRules.Category.UPDATES, GameRuleFactory.createIntRule(30));
    public static final GameRules.Key<GameRules.BooleanRule> SKYBLOCK__DO_ARROWS_BREAK_GLASS_BLOCKS = GameRuleRegistry.register("skyblock__doArrowsBreakGlassBlocks", GameRules.Category.UPDATES, GameRuleFactory.createBooleanRule(true));
    public static final GameRules.Key<GameRules.BooleanRule> MCD__POP_FLOWERS_ALWAYS_HIDE = GameRuleRegistry.register("mcd__popFlowersAlwaysHide", GameRules.Category.UPDATES, GameRuleFactory.createBooleanRule(false));

    public static void register() {
        SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering GameRules for " + SkyBlock.MOD_ID);
    }
}
