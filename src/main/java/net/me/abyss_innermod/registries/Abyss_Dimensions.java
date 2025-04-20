package net.me.abyss_innermod.registries;

import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class Abyss_Dimensions {
    public static final RegistryKey<World> ABYSS__THE_ABYSS_KEY = SkyCore.BuiltinRegistries.ofMinecraftWorldRegistry("the_abyss_fabric");
    public static final RegistryKey<DimensionType> ABYSS__THE_ABYSS_TYPE_KEY = SkyCore.BuiltinRegistries.ofDimensionTypeRegistry(ABYSS__THE_ABYSS_KEY.getValue());
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering Dimensions for \"Abyss\" innermod");
    }
}
