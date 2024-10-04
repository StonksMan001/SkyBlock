package net.me.skyblock.component;

import net.me.skyblock.SkyBlock;
import net.me.skyblock.component.util.SimpleByteValueComponent;
import net.minecraft.component.ComponentType;

public class ModDataComponentTypes {
    public static ComponentType<SimpleByteValueComponent> SIMPLE_BYTE_VALUE_COMPONENT = SkyBlock.BuiltinRegistries.registerComponentType("z__null_component", nullComponentBuilder -> nullComponentBuilder.codec(SimpleByteValueComponent.CODEC));

    public static void register() {
        SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering DataComponentTypes for " + SkyBlock.MOD_ID);
    }
}
