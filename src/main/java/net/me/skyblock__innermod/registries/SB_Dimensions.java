package net.me.skyblock__innermod.registries;

import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class SB_Dimensions {
    public static final RegistryKey<World> SKYBLOCK__UNKNOWN_KEY = SkyCore.BuiltinRegistries.ofMinecraftWorldRegistry("unknown");
    public static final RegistryKey<DimensionType> SKYBLOCK__UNKNOWN_TYPE_KEY = SkyCore.BuiltinRegistries.ofDimensionTypeRegistry(SKYBLOCK__UNKNOWN_KEY.getValue());

    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering Dimensions for " + SkyCore.MOD_ID);
    }
}
