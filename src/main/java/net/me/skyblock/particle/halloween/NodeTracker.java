package net.me.skyblock.particle.halloween;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;

public class NodeTracker extends SpriteBillboardParticle {
    protected NodeTracker(ClientWorld level, double xCoord, double yCoord, double zCoord,
                          SpriteProvider spriteSet, double xd, double yd, double zd){
        super(level, xCoord, yCoord, zCoord, xd, yd, zd);

        this.velocityMultiplier = 0.0f;
        this.x = xd;
        this.y = yd;
        this.z = zd;
        this.scale *= 0.75f;
        this.maxAge = 20;
        this.setSpriteForAge(spriteSet);
        this.collidesWithWorld = false;

        this.red = 1f;
        this.green = 1f;
        this.blue = 1f;
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }
    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider sprites;

        public Factory(SpriteProvider spriteSet){
            this.sprites = spriteSet;
        }
        public Particle createParticle(DefaultParticleType particleType, ClientWorld level,
                                       double x, double y, double z,
                                       double dx, double dy, double dz) {
            return new NodeTracker(level, x, y, z, this.sprites, dx, dy, dz);
        }
    }
}
