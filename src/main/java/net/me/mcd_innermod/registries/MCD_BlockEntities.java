package net.me.mcd_innermod.registries;

import net.me.mcd_innermod.block_entities.PopFlowerBlockEntity;
import net.me.mcd_innermod.block_entities.echoing_void.VoidBlockEntity;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.entity.BlockEntityType;

public class MCD_BlockEntities {
    public static final BlockEntityType<PopFlowerBlockEntity> MCD__POP_FLOWER_BLOCK_ENTITY = SkyCore.BuiltinRegistries.registerBlockEntityType("mcd__pop_flower_blockentity",
            BlockEntityType.Builder.create(PopFlowerBlockEntity::new, MCD_Blocks.MCD__POP_FLOWER).build());
    public static final BlockEntityType<VoidBlockEntity> MCD__VOID_BLOCK_ENTITY = SkyCore.BuiltinRegistries.registerBlockEntityType("mcd__void_block__blockentity",
            BlockEntityType.Builder.create(VoidBlockEntity::new, MCD_Blocks.MCD__VOID_BLOCK).build());
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering BlockEntities for \"MCD\" innermod");
    }
}
