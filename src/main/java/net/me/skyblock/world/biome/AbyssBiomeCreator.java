package net.me.skyblock.world.biome;

import net.me.skyblock.sound.ModSounds;
import net.minecraft.client.sound.MusicType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.MusicSound;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import org.jetbrains.annotations.Nullable;

public class AbyssBiomeCreator extends OverworldBiomeCreator {
    protected static final int DEFAULT_WATER_COLOR = 4159204;
    protected static final int DEFAULT_WATER_FOG_COLOR = 329011;
    private static final int DEFAULT_FOG_COLOR = 12638463;
    @Nullable
    private static final ModSounds DEFAULT_MUSIC = null;

    public static int getSkyColor(float temperature) {
        float f = temperature;
        f /= 3.0f;
        f = MathHelper.clamp(f, -1.0f, 1.0f);
        return MathHelper.hsvToRgb(0.62222224f - f * 0.05f, 0.5f + f * 0.1f, 1.0f);
    }

    private static Biome createBiome(boolean precipitation, float temperature, float downfall, SpawnSettings.Builder spawnSettings, GenerationSettings.LookupBackedBuilder generationSettings, @Nullable MusicSound music) {
        return AbyssBiomeCreator.createBiome(precipitation, temperature, downfall, 4159204, 329011, null, null, spawnSettings, generationSettings, music);
    }

    private static Biome createBiome(boolean precipitation, float temperature, float downfall, int waterColor, int waterFogColor, @Nullable Integer grassColor, @Nullable Integer foliageColor, SpawnSettings.Builder spawnSettings, GenerationSettings.LookupBackedBuilder generationSettings, @Nullable MusicSound music) {
        BiomeEffects.Builder builder = new BiomeEffects.Builder().waterColor(waterColor).waterFogColor(waterFogColor).fogColor(12638463).skyColor(OverworldBiomeCreator.getSkyColor(temperature)).moodSound(BiomeMoodSound.CAVE).music(music);
        if (grassColor != null) {
            builder.grassColor(grassColor);
        }
        if (foliageColor != null) {
            builder.foliageColor(foliageColor);
        }
        return new Biome.Builder().precipitation(precipitation).temperature(temperature).downfall(downfall).effects(builder.build()).spawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

    private static void addBasicFeatures(GenerationSettings.LookupBackedBuilder generationSettings) {
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addAmethystGeodes(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addSprings(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
    }
    public static Biome createBlaruForest(RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup, boolean spruce) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.WOLF, 8, 4, 4));
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 4, 2, 3));
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.FOX, 8, 2, 4));
        if (spruce) {
            DefaultBiomeFeatures.addBatsAndMonsters(builder);
        } else {
            DefaultBiomeFeatures.addCaveMobs(builder);
            DefaultBiomeFeatures.addMonsters(builder, 100, 25, 100, false);
        }
        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        AbyssBiomeCreator.addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addMossyRocks(lookupBackedBuilder);
        DefaultBiomeFeatures.addLargeFerns(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultOres(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultDisks(lookupBackedBuilder);
        lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, spruce ? VegetationPlacedFeatures.TREES_OLD_GROWTH_SPRUCE_TAIGA : VegetationPlacedFeatures.TREES_OLD_GROWTH_PINE_TAIGA);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addGiantTaigaGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addSweetBerryBushes(lookupBackedBuilder);
        MusicSound musicSound = MusicType.createIngameMusic(SoundEvents.MUSIC_OVERWORLD_OLD_GROWTH_TAIGA);
        return AbyssBiomeCreator.createBiome(true, spruce ? 0.25f : 0.3f, 0.8f, builder, lookupBackedBuilder, musicSound);
    }
}
