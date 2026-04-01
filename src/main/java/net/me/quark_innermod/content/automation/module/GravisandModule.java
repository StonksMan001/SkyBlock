package net.me.quark_innermod.content.automation.module;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.me.quark_innermod.content.automation.block.GravisandBlock;
import net.me.quark_innermod.content.automation.entity.Gravisand;
import net.me.quark_innermod.internal_zeta.org.ZetaModule;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.entity.FallingBlockEntityRenderer;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;

public class GravisandModule extends ZetaModule {
    public static EntityType<Gravisand> gravisandEntityType;
    public static Block gravisandBlock;
    @Override
    public void register() {
        gravisandBlock = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__gravisand",
                new GravisandBlock(AbstractBlock.Settings
                        .copy(Blocks.SAND)));
        gravisandEntityType = SkyCore.BuiltinRegistries.registerEntityType("quark__gravisand",
                EntityType.Builder.<Gravisand>create(Gravisand::new, SpawnGroup.MISC)
                        .dimensions(0.98F, 0.98F)
                        .maxTrackingRange(10)
                        .trackingTickInterval(20) // update interval
                        .build());
    }
    @Override
    public void registerClient() {
        EntityRendererRegistry.register(gravisandEntityType, FallingBlockEntityRenderer::new);
    }
}
