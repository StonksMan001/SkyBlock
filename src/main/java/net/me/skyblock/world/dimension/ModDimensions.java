package net.me.skyblock.world.dimension;

import net.me.skyblock.SkyBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class ModDimensions {
    public static final RegistryKey<World> THE_ABYSS_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(SkyBlock.MOD_ID, "the_abyss_fabric.json"));
    public static final RegistryKey<World> UNKNOWN_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(SkyBlock.MOD_ID, "unknown.json"));
    public static final RegistryKey<DimensionType> THE_ABYSS_TYPE_KEY = RegistryKey.of(RegistryKeys.DIMENSION_TYPE, THE_ABYSS_KEY.getValue());

    public static void register() {
        SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering Dimensions for " + SkyBlock.MOD_ID);
    }
}
