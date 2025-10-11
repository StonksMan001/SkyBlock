package net.me.skycore_supermod.common_registries;

import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;

public class SkyCore_ConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUISHE_TREE_KEY = registerKey("bluishe_tree");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        /*register(context, BLUISHE_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.SP5__BLUISHE_STEM),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.of(ModBlocks.SP5__BLUE_WART),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
                new TwoLayersFeatureSize(1, 0, 2)).build());*/
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(SkyCore.MOD_ID, name));
    }
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering ConfiguredFeatures for SkyCore supermod (common registries)");
    }
}
