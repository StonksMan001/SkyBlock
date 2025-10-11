package net.me.quark_innermod.internal_zeta.org;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.me.quark_innermod.base.QuarkFabric;
import net.me.quark_innermod.base.QuarkFabricClient;

public abstract class ZetaModule {
    public abstract void register();

    public abstract void registerClient();

    public static <T, E extends ZetaModule> void setup(T instance, E obj) {

        if (instance instanceof QuarkFabric) obj.register();
        if (instance instanceof QuarkFabricClient) obj.registerClient();
    }
}
