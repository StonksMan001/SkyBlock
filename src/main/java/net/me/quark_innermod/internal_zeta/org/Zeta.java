package net.me.quark_innermod.internal_zeta.org;

import org.slf4j.Logger;

public abstract class Zeta {
    public String id;
    public Logger logger;

    public RaytracingUtil raytracingUtil;
    public ItemExtensionFactory itemExtensions;

    public Zeta(String id, Logger logger) {
        this.id = id;
        this.logger = logger;

        this.raytracingUtil = this.createRayTracingUtil();
        this.itemExtensions = this.createItemExtensions();
    }

    public abstract ItemExtensionFactory createItemExtensions();

    public abstract RaytracingUtil createRayTracingUtil();
}
