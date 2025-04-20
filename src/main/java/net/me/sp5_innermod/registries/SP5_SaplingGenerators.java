package net.me.sp5_innermod.registries;

import net.me.skycore_supermod.common_registries.SkyCore_ConfiguredFeatures;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class SP5_SaplingGenerators {
    public static final SaplingGenerator SP5__BLUISHE = new SaplingGenerator("bluishe",
            0f,
            Optional.empty(),
            Optional.empty(),
            Optional.of(SkyCore_ConfiguredFeatures.BLUISHE_TREE_KEY),
            Optional.empty(),
            Optional.empty(),
            Optional.empty());
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering SaplingGenerators for \"Enderite Addon\" innermod");
    }
}
