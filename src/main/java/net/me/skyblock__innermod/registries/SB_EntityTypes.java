package net.me.skyblock__innermod.registries;

import net.me.skyblock__innermod.entities.OminousEvokerEntity;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;

public class SB_EntityTypes {
    /*public static final EntityType<WispEntity> MCD__WISP = SkyBlock.BuiltinRegistries.registerEntityType("mcd__wisp",
            EntityType.Builder.create(WispEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.35f, 0.6f).build());*/ //TODO: this
    public static final EntityType<OminousEvokerEntity> SKYBLOCK__OMINOUS_EVOKER = SkyCore.BuiltinRegistries.registerEntityType("skyblock__ominous_evoker",
            EntityType.Builder.create(OminousEvokerEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.6F, 1.95F).build());
}
