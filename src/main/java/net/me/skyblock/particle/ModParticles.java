package net.me.skyblock.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.me.skyblock.SkyBlock;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {
    public static final DefaultParticleType HALLOWEEN__NODE_TRACKER = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(SkyBlock.MOD_ID, "h__node_tracker"),
                HALLOWEEN__NODE_TRACKER);
    }
}
