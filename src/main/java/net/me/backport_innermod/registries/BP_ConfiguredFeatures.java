package net.me.backport_innermod.registries;

import net.me.backport_innermod.blocks.PaleHangingMossBlock;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.ThreeLayersFeatureSize;
import net.minecraft.world.gen.foliage.DarkOakFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.RandomizedIntBlockStateProvider;
import net.minecraft.world.gen.treedecorator.AttachedToLeavesTreeDecorator;
import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;

import java.util.List;
import java.util.OptionalInt;

public class BP_ConfiguredFeatures {
    //public static final RegistryKey<ConfiguredFeature<?, ?>> BP__PALE_OAK = SkyCore.BuiltinRegistries.ofConfiguredFeatureRegistry("bp__pale_oak");
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        /*
        SkyCore.BuiltinRegistries.registerConfiguredFeature(context, BP__PALE_OAK, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BP_Blocks.BP__PALE_LOG),
                new DarkOakTrunkPlacer(6, 2, 1),
                BlockStateProvider.of(BP_Blocks.BP__PALE_LEAVES),
                new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
        ).decorators(List.of(
                new AttachedToLeavesTreeDecorator(0.14F, 1, 0, new RandomizedIntBlockStateProvider(BlockStateProvider.of(BP_Blocks.BP__PALE_HANGING_MOSS.getDefaultState()), PaleHangingMossBlock.Head.AGE, UniformIntProvider.create(0, 4)), 2, List.of(Direction.DOWN))
        )).ignoreVines().build());
        */
    }
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering ConfiguredFeatures for \"Backport\" innermod");
    }
}
