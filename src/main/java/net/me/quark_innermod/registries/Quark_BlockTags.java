package net.me.quark_innermod.registries;

import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.Block;
import net.minecraft.registry.tag.TagKey;

public class Quark_BlockTags {
    public static TagKey<Block> QUARK__HOLLOW_LOGS = SkyCore.BuiltinRegistries.createBlockTag("quark__hollow_logs");
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering BlockTags for \"Quark\" innermod");
    }
}
