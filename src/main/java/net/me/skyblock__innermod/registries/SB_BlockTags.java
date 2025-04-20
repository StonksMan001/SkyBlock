package net.me.skyblock__innermod.registries;

import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.Block;
import net.minecraft.registry.tag.TagKey;

public class SB_BlockTags {
    public static final TagKey<Block> SKYBLOCK__SCULK_GROUND = SkyCore.BuiltinRegistries.createBlockTag("skyblock__sculk_ground");
    public static final TagKey<Block> SKYBLOCK__RED_SCULK_GROUND = SkyCore.BuiltinRegistries.createBlockTag("skyblock__red_sculk_ground");
    public static final TagKey<Block> SKYBLOCK__SCULK_VEIN_CANT_COVER = SkyCore.BuiltinRegistries.createBlockTag("skyblock__sculk_vein_cant_cover");
    public static final TagKey<Block> SKYBLOCK__SPORE_PLANTER_BOXES = SkyCore.BuiltinRegistries.createBlockTag("skyblock__spore_planter_boxes");
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering BlockTags for \"SkyBlock\" innermod");
    }
}
