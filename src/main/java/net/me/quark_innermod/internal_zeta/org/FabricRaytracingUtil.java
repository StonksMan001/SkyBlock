package net.me.quark_innermod.internal_zeta.org;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeRegistry;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;

public class FabricRaytracingUtil extends RaytracingUtil {
    public FabricRaytracingUtil() {
    }

    @Override
    public double getEntityRange(LivingEntity playerEntity) {
        return playerEntity.getAttributeValue(EntityAttributes.PLAYER_BLOCK_INTERACTION_RANGE);
    }
}
