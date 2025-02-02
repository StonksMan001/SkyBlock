package net.me.skycore_supermod.common_registries;

import net.me.skycore_supermod.SimpleByteValueComponent;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.component.ComponentType;

public class SkyCore_DataComponentTypes {
    public static final ComponentType<SimpleByteValueComponent> SIMPLE_BYTE_VALUE_COMPONENT = SkyCore.BuiltinRegistries.registerComponentType("z__null_component", nullComponentBuilder -> {
        return nullComponentBuilder.codec(SimpleByteValueComponent.CODEC);
    });

    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering DataComponentTypes for " + SkyCore.MOD_ID);
    }
}
