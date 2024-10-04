package net.me.skyblock.entity;

import net.me.skyblock.SkyBlock;
import net.me.skyblock.entity.mobs.mcd.WispEntity;
import net.me.skyblock.entity.mobs.skyblock.OminousEvokerEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;

public class ModEntities {
    /*public static final EntityType<WispEntity> MCD__WISP = SkyBlock.BuiltinRegistries.registerEntityType("mcd__wisp",
            EntityType.Builder.create(WispEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.35f, 0.6f).build());*/ //TODO: this
    public static final EntityType<OminousEvokerEntity> SKYBLOCK__OMINOUS_EVOKER = SkyBlock.BuiltinRegistries.registerEntityType("skyblock__ominous_evoker",
            EntityType.Builder.create(OminousEvokerEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.6F, 1.95F).build());
}
