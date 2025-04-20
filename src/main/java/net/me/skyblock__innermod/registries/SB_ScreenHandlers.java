package net.me.skyblock__innermod.registries;

import net.me.skyblock__innermod.screen_handlers.AncientPedestalScreenHandler;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.screen.ScreenHandlerType;

public class SB_ScreenHandlers {
    public static final ScreenHandlerType<AncientPedestalScreenHandler> SKYBLOCK__ANCIENT_PEDESTAL_SCREEN_HANDLER = null; //SkyBlock.BuiltinRegistries.registerScreenHandler("skyblock__ancient_pedestal_screen_handler",
    //new ExtendedScreenHandlerType<>(AncientPedestalScreenHandler::new)); //TODO: this

    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering ScreenHandlers for \"SkyBlock\" innermod");
    }
}
