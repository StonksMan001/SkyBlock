package net.me.skyblock.particle.halloween;

import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;

@Deprecated
public class NodeTracker extends SpriteBillboardParticle {

    protected NodeTracker(ClientWorld clientWorld, double d, double e, double f) {
        super(clientWorld, d, e, f);
    }

    @Override
    public ParticleTextureSheet getType() {
        return null;
    }
}
