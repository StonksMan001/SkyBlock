package net.me.skyblock.entity.mobs.mcd.rendering;

import net.me.skyblock.SkyBlock;
import net.me.skyblock.entity.mobs.mcd.WispEntity;
import net.minecraft.util.Identifier;

@Deprecated
public class WispModel {
    public Identifier getModelResource(WispEntity animatable) {
        return Identifier.of(SkyBlock.MOD_ID, "geo/wisp.geo.json");
    }
    public Identifier getTextureResource(WispEntity animatable) {
        return Identifier.of(SkyBlock.MOD_ID, "textures/entity/wisp.png");
    }
    public Identifier getAnimationResource(WispEntity animatable) {
        return Identifier.of(SkyBlock.MOD_ID, "animations/wisp.animation.json");
    }
}
