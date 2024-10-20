package net.me.skyblock.client;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.client.gui.screen_handlers.AncientPedestalScreenHandler;
import net.minecraft.screen.Generic3x3ContainerScreenHandler;
import net.minecraft.screen.ScreenHandlerType;

public class ModScreenHandlers {
    public static final ScreenHandlerType<AncientPedestalScreenHandler> SKYBLOCK__ANCIENT_PEDESTAL_SCREEN_HANDLER = null; //SkyBlock.BuiltinRegistries.registerScreenHandler("skyblock__ancient_pedestal_screen_handler",
            //new ExtendedScreenHandlerType<>(AncientPedestalScreenHandler::new)); //TODO: this

    public static void register() {
        SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering Screen Handlers for " + SkyBlock.MOD_ID);
    }
}
