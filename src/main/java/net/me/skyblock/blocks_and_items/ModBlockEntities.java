package net.me.skyblock.blocks_and_items;


import net.me.skyblock.SkyBlock;
import net.me.skyblock.blocks_and_items.block_entities.mcd.PopFlowerBlockEntity;
import net.me.skyblock.blocks_and_items.block_entities.mcd.echoing_void.VoidBlockEntity;
import net.me.skyblock.blocks_and_items.block_entities.skyblock.AncientPedestalBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;


public class ModBlockEntities {
    public static final BlockEntityType<PopFlowerBlockEntity> MCD__POP_FLOWER_BLOCK_ENTITY = SkyBlock.BuiltinRegistries.registerBlockEntityType("mcd__pop_flower_blockentity",
            BlockEntityType.Builder.create(PopFlowerBlockEntity::new, ModBlocks.MCD__POP_FLOWER).build());
    public static final BlockEntityType<VoidBlockEntity> MCD__VOID_BLOCK_ENTITY = SkyBlock.BuiltinRegistries.registerBlockEntityType("mcd__void_block__blockentity",
            BlockEntityType.Builder.create(VoidBlockEntity::new, ModBlocks.MCD__VOID_BLOCK).build());
    public static final BlockEntityType<AncientPedestalBlockEntity> SKYBLOCK__ANCIENT_PEDESTAL_BLOCK_ENTITY = SkyBlock.BuiltinRegistries.registerBlockEntityType( "skyblock__ancient_pedestal__blockentity",
            BlockEntityType.Builder.create(AncientPedestalBlockEntity::new, ModBlocks.SKYBLOCK__ANCIENT_PEDESTAL).build());

    public static void register() {
        SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering BlockEntities for " + SkyBlock.MOD_ID);
    }
}
