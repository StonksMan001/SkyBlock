/*
 * Decompiled with CFR 0.2.0 (FabricMC d28b102d).
 */
package net.me.skyblock.world.biome;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;

public abstract class ModBiomeKeys extends BiomeKeys {
    public static final RegistryKey<Biome> BLARU_FOREST = ModBiomeKeys.register("blaru_forest");

    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(RegistryKeys.BIOME, new Identifier(name));
    }
}

