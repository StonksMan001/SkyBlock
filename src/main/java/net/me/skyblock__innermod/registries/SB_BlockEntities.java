package net.me.skyblock__innermod.registries;

import net.me.skyblock__innermod.block_entities.AncientPedestalBlockEntity;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.entity.BlockEntityType;

public class SB_BlockEntities {
    public static final BlockEntityType<AncientPedestalBlockEntity> SKYBLOCK__ANCIENT_PEDESTAL_BLOCK_ENTITY = SkyCore.BuiltinRegistries.registerBlockEntityType("skyblock__ancient_pedestal__blockentity",
            BlockEntityType.Builder.create(AncientPedestalBlockEntity::new, SB_Blocks.SKYBLOCK__ANCIENT_PEDESTAL).build());
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering BlockEntities for \"SkyBlock\" innermod");
    }
}
