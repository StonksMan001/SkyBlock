package net.me.mcd_innermod.entities.rendering;

import net.me.skycore_supermod.registries.SkyCore;
import net.me.mcd_innermod.entities.WispEntity;
import net.minecraft.util.Identifier;

@Deprecated
public class WispModel {
    public Identifier getModelResource(WispEntity animatable) {
        return Identifier.of(SkyCore.MOD_ID, "geo/wisp.geo.json");
    }
    public Identifier getTextureResource(WispEntity animatable) {
        return Identifier.of(SkyCore.MOD_ID, "textures/entity/wisp.png");
    }
    public Identifier getAnimationResource(WispEntity animatable) {
        return Identifier.of(SkyCore.MOD_ID, "animations/wisp.animation.json");
    }
}
