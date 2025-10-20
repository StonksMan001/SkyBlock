package net.me.backport_innermod.registries;

import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;

import java.util.Optional;

public class BP_SaplingGenerators {
    //public static final SaplingGenerator BP__PALE_OAK = new SaplingGenerator("bp__pale_oak", Optional.of(BP_ConfiguredFeatures.BP__PALE_OAK), Optional.empty(), Optional.empty());
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering SaplingGenerators for \"Backport\" innermod");
    }
}
