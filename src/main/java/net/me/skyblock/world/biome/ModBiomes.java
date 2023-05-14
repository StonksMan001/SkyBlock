package net.me.skyblock.world.biome;

import net.me.skyblock.SkyBlock;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import org.betterx.betterend.world.biome.cave.EmptyEndCaveBiome;

public class ModBiomes {
    public static final RegistryKey<Biome> BLARU_FOREST_KEY = registerKey("blaru_forest");

    public static RegistryKey<Biome> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.BIOME, new Identifier(SkyBlock.MOD_ID, name));
    }
}
