package net.me.quark_innermod.internal_zeta.org;

import org.slf4j.Logger;

public class FabricZeta extends Zeta {
    public FabricZeta(String id, Logger logger) {
        super(id, logger);
    }

    @Override
    public ItemExtensionFactory createItemExtensions() {
        return (stack) -> IFabricItemExtensions.INSTANCE;
    }

    @Override
    public RaytracingUtil createRayTracingUtil() {
        return new FabricRaytracingUtil();
    }
}
