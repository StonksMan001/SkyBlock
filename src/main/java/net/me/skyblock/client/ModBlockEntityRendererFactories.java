package net.me.skyblock.client;

import com.google.common.collect.Maps;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.blocks_and_items.ModBlockEntities;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.block.entity.*;

import java.util.Map;

@Environment(value= EnvType.CLIENT)
public class ModBlockEntityRendererFactories {
    private static final Map<BlockEntityType<?>, BlockEntityRendererFactory<?>> FACTORIES = Maps.newHashMap();

    public static <T extends BlockEntity> void register(BlockEntityType<? extends T> type, BlockEntityRendererFactory<T> factory) {
        FACTORIES.put(type, factory);
    }
    static {
        BlockEntityRendererFactories.register(ModBlockEntities.MCD__VOID_BLOCK_ENTITY, VoidBlockEntityRenderer::new);
    }
    public static void registerModBlockEntityRendererFactories () {
        SkyBlock.LOGGER.info("[SkyBlock MultiMod] Registering BlockEntityRendererFactories for " + SkyBlock.MOD_ID);
    }
}
