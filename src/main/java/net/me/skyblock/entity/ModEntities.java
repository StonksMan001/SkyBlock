package net.me.skyblock.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.entity.mobs.mcd.WispEntity;
import net.me.skyblock.entity.mobs.skyblock.OminousEvokerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.EvokerEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<WispEntity> MCD__WISP = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(SkyBlock.MOD_ID, "mcd__wisp"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, WispEntity::new)
                    .dimensions(EntityDimensions.fixed(0.35f, 0.6f)).build());
    public static final EntityType<OminousEvokerEntity> SKYBLOCK__OMINOUS_EVOKER = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(SkyBlock.MOD_ID, "skyblock__ominous_evoker"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, OminousEvokerEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6F, 1.95F)).build());
}
