package net.me.skyblock.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.entity.mobs.mcd.WispEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<WispEntity> WISP = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(SkyBlock.MOD_ID, "wisp"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, WispEntity::new)
                    .dimensions(EntityDimensions.fixed(0.35f, 0.6f)).build());

}
