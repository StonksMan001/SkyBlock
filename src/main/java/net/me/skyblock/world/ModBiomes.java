package net.me.skyblock.world;

import net.me.skyblock.SkyBlock;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public class ModBiomes {
    public static final RegistryKey<Biome> BP__PALE_GARDEN = SkyBlock.BuiltinRegistries.ofBiomeRegistry("bp__pale_garden");


    public static void register() {
        SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering Biomes for " + SkyBlock.MOD_ID);
    }
}
