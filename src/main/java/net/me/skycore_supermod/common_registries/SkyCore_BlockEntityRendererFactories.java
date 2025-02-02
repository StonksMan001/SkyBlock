package net.me.skycore_supermod.common_registries;

import com.google.common.collect.Maps;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.me.mcd_innermod.client.VoidBlockEntityRenderer;
import net.me.mcd_innermod.registries.MCD_BlockEntities;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;

import java.util.Map;

@Environment(value = EnvType.CLIENT)
public class SkyCore_BlockEntityRendererFactories {
    private static final Map<BlockEntityType<?>, BlockEntityRendererFactory<?>> FACTORIES = Maps.newHashMap();

    public static <T extends BlockEntity> void register(BlockEntityType<? extends T> type, BlockEntityRendererFactory<T> factory) {
        FACTORIES.put(type, factory);
    }
    static {
        BlockEntityRendererFactories.register(MCD_BlockEntities.MCD__VOID_BLOCK_ENTITY, VoidBlockEntityRenderer::new);
    }

    public static void registerModBlockEntityRendererFactories() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering BlockEntityRendererFactories for " + SkyCore.MOD_ID);
    }
}
