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
    public static final RegistryKey<World> THE_ABYSS_KEY = SkyBlock.BuiltinRegistries.ofMinecraftWorldRegistry("the_abyss_fabric");
    public static final RegistryKey<World> UNKNOWN_KEY = SkyBlock.BuiltinRegistries.ofMinecraftWorldRegistry("unknown");
    public static final RegistryKey<DimensionType> THE_ABYSS_TYPE_KEY = SkyBlock.BuiltinRegistries.ofDimensionTypeRegistry(THE_ABYSS_KEY.getValue());

    public static void register() {
        SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering Dimensions for " + SkyBlock.MOD_ID);
    }
}
