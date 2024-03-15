package net.me.skyblock.blocks_and_items.block_entities;


import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.blocks_and_items.ModBlocks;
import net.me.skyblock.blocks_and_items.block_entities.mcd.echoing_void.VoidBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModBlockEntities {
    public static final BlockEntityType<VoidBlockEntity> VOID_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(SkyBlock.MOD_ID, "void_block__blockentity"),
            FabricBlockEntityTypeBuilder.create(VoidBlockEntity::new, ModBlocks.MCD__VOID_BLOCK).build());


    public static void registerModBlockEntities() {
        SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering BlockEntities for " + SkyBlock.MOD_ID);
    }
}
