package net.me.skyblock.client;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.client.gui.screen_handlers.AncientPedestalScreenHandler;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<AncientPedestalScreenHandler> SKYBLOCK__ANCIENT_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(SkyBlock.MOD_ID, "skyblock__ancient_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(AncientPedestalScreenHandler::new));

    public static void registerScreenHandlers() {
        SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering Screen Handlers for " + SkyBlock.MOD_ID);
    }
}
