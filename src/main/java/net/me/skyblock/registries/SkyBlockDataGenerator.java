package net.me.skyblock.registries;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.me.skyblock.api.datagen.*;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class SkyBlockDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(SkyBlockDataGenerators.BlockTagDataGenerator::new);
        pack.addProvider(SkyBlockDataGenerators.ItemTagDataGenerator::new);
        pack.addProvider(SkyBlockDataGenerators.LootTableDataGenerator::new);
        pack.addProvider(SkyBlockDataGenerators.RecipeDataGenerator::new);
        pack.addProvider(SkyBlockDataGenerators.ModelDataGenerator::new);
        pack.addProvider(SkyBlockDataGenerators.WorldDataGenerator::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, SkyBlockRegistries.ConfiguredFeatureRegistries::bootstrap);
    }
}
