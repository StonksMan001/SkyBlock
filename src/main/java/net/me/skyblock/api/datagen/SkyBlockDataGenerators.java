package net.me.skyblock.api.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.*;
import net.me.skyblock.registries.ArchivedRegistries;
import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class SkyBlockDataGenerators {
    public static class WorldDataGenerator extends FabricDynamicRegistryProvider {
        public WorldDataGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {

        }

        @Override
        public String getName() {
            return "World Gen";
        }
    }

    public static class RecipeDataGenerator extends FabricRecipeProvider {

        public RecipeDataGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        public void generate(RecipeExporter exporter) {

        }
    }

    public static class ModelDataGenerator extends FabricModelProvider {
        public ModelDataGenerator(FabricDataOutput output) {
            super(output);
        }

        @Override
        public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        }

        @Override
        public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        }
    }

    public static class LootTableDataGenerator extends FabricBlockLootTableProvider {
        public LootTableDataGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
            super(dataOutput, registryLookup);
        }

        @Override
        public void generate() {
        }
    }

    public static class ItemTagDataGenerator extends FabricTagProvider.ItemTagProvider {
        public ItemTagDataGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup arg) {
            /*getOrCreateTagBuilder(ItemTags.SWORDS)
                    .add(ArchivedRegistries.ArchivedItemRegistries.ENDERITE_SWORD)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__ENDERITE_SWORD)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__END_WOODEN_SWORD)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__END_STONE_SWORD)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__BLUISHE_SWORD)
                    .add(SkyBlockRegistries.ItemRegistries.H__ANOMALITE_SWORD)
                    .add(SkyBlockRegistries.ItemRegistries.ABYSS__ABERYTHE_SWORD)

                    .add(SkyBlockRegistries.ItemRegistries.SKYBLOCK__LIGHTNING_SWORD)
                    .add(SkyBlockRegistries.ItemRegistries.MCD__ROUGH_DIAMOND_SWORD)
                    .add(SkyBlockRegistries.ItemRegistries.SKYBLOCK__FIRWOOD_MACE)

                    .add(SkyBlockRegistries.ItemRegistries.MCD__DIAMOND_RAPIER)
                    .add(SkyBlockRegistries.ItemRegistries.MCD__GOLDEN_RAPIER)
                    .add(SkyBlockRegistries.ItemRegistries.MCD__IRON_RAPIER)
                    .add(SkyBlockRegistries.ItemRegistries.MCD__STONE_RAPIER)
                    .add(SkyBlockRegistries.ItemRegistries.MCD__NETHERITE_RAPIER)
                    .add(SkyBlockRegistries.ItemRegistries.MCD__WOODEN_RAPIER)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__END_WOODEN_RAPIER)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__END_STONE_RAPIER)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__BLUISHE_RAPIER)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__ENDERITE_RAPIER);
            getOrCreateTagBuilder(ItemTags.AXES)
                    .add(ArchivedRegistries.ArchivedItemRegistries.ENDERITE_AXE)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__ENDERITE_AXE)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__END_WOODEN_AXE)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__END_STONE_AXE)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__BLUISHE_AXE)
                    .add(SkyBlockRegistries.ItemRegistries.H__ANOMALITE_AXE)
                    .add(SkyBlockRegistries.ItemRegistries.ABYSS__ABERYTHE_AXE);
            getOrCreateTagBuilder(ItemTags.PICKAXES)
                    .add(ArchivedRegistries.ArchivedItemRegistries.ENDERITE_PICKAXE)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__ENDERITE_PICKAXE)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__END_WOODEN_PICKAXE)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__END_STONE_PICKAXE)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__BLUISHE_PICKAXE)
                    .add(SkyBlockRegistries.ItemRegistries.H__ANOMALITE_PICKAXE)
                    .add(SkyBlockRegistries.ItemRegistries.ABYSS__ABERYTHE_PICKAXE);
            getOrCreateTagBuilder(ItemTags.SHOVELS)
                    .add(ArchivedRegistries.ArchivedItemRegistries.ENDERITE_SHOVEL)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__ENDERITE_SHOVEL)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__END_WOODEN_SHOVEL)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__END_STONE_SHOVEL)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__BLUISHE_SHOVEL)
                    .add(SkyBlockRegistries.ItemRegistries.ABYSS__ABERYTHE_SHOVEL);
            getOrCreateTagBuilder(ItemTags.HOES)
                    .add(ArchivedRegistries.ArchivedItemRegistries.ENDERITE_HOE)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__ENDERITE_HOE)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__END_WOODEN_HOE)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__END_STONE_HOE)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__BLUISHE_HOE)
                    .add(SkyBlockRegistries.ItemRegistries.ABYSS__ABERYTHE_HOE);


            getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                    .add(ArchivedRegistries.ArchivedItemRegistries.ENDERITE_HELMET)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__ENDERITE_HELMET)
                    .add(SkyBlockRegistries.ItemRegistries.ABYSS__ABERYTHE_HELMET)
                    .add(SkyBlockRegistries.ItemRegistries.H__ANOMALITE_HELMET);
            getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                    .add(ArchivedRegistries.ArchivedItemRegistries.ENDERITE_CHESTPLATE)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__ENDERITE_CHESTPLATE)
                    .add(SkyBlockRegistries.ItemRegistries.ABYSS__ABERYTHE_CHESTPLATE)
                    .add(SkyBlockRegistries.ItemRegistries.H__ANOMALITE_CHESTPLATE);
            getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                    .add(ArchivedRegistries.ArchivedItemRegistries.ENDERITE_LEGGINGS)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__ENDERITE_LEGGINGS)
                    .add(SkyBlockRegistries.ItemRegistries.ABYSS__ABERYTHE_LEGGINGS)
                    .add(SkyBlockRegistries.ItemRegistries.H__ANOMALITE_LEGGINGS);
            getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                    .add(ArchivedRegistries.ArchivedItemRegistries.ENDERITE_BOOTS)
                    .add(SkyBlockRegistries.ItemRegistries.SP5__ENDERITE_BOOTS)
                    .add(SkyBlockRegistries.ItemRegistries.ABYSS__ABERYTHE_BOOTS)
                    .add(SkyBlockRegistries.ItemRegistries.H__ANOMALITE_BOOTS);

            getOrCreateTagBuilder(ItemTags.BOW_ENCHANTABLE)
                    .add(SkyBlockRegistries.ItemRegistries.MCD__TWIN_BOW);

            getOrCreateTagBuilder(ItemTags.CROSSBOW_ENCHANTABLE)
                    .add(SkyBlockRegistries.ItemRegistries.MCD__AUTO_CROSSBOW);

            getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                    .add(SkyBlockRegistries.ItemRegistries.MCD__ARTIFACT_IRON_HIDE_AMULET)
                    .add(SkyBlockRegistries.ItemRegistries.MCD__ARTIFACT_DEATH_CAP_MUSHROOM);*/

        }
    }

    public static class BlockTagDataGenerator extends FabricTagProvider.BlockTagProvider {
        public BlockTagDataGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup arg) {

        }
    }
}
