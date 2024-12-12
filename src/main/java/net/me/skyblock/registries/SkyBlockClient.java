package net.me.skyblock.registries;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.me.skyblock.entity.mobs.skyblock.rendering.OminousEvokerRenderer;
import net.me.skyblock.registries.v1.ArchivedRegistries;
import net.me.skyblock.registries.v1.SkyBlockRegistries;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.world.biome.GrassColors;

public class SkyBlockClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {
        // Should never touch
        BlockRenderLayerMap.INSTANCE.putBlock(ArchivedRegistries.ArchivedBlockRegistries.ANT_JAM_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ArchivedRegistries.ArchivedBlockRegistries.SWEET_BERRY_JAM_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ArchivedRegistries.ArchivedBlockRegistries.TRANSPARENT_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ArchivedRegistries.ArchivedBlockRegistries.BLUE_WART, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ArchivedRegistries.ArchivedBlockRegistries.CAVE_ROOTS, RenderLayer.getCutout());
        // Should never touch

        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SKYBLOCK__DUCKWEED, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SKYBLOCK__SMALL_LILY_PADS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SKYBLOCK__CLOVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SKYBLOCK__CHILLI_PEPPER_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SKYBLOCK__SNOWY_SHORT_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SKYBLOCK__ANT_JAM_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SKYBLOCK__SWEET_BERRY_JAM_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SKYBLOCK__SCULK_SPROUTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.BOSC__DEAD_SCULK_SPROUTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.BRAINROT__BRAINROTTEN_SPROUTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.BRAINROT__GRIMACE_SHAKE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SKYBLOCK__RED_SCULK_SPROUTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SKYBLOCK__UNKNOWN_SPROUTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SKYBLOCK__UNKNOWN_VEGETATION, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SP5__TRANSPARENT_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.ABYSS__ABYSS_SLIME_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SP5__BLUE_WART, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.ABYSS__BLARU_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.ABYSS__VIGILANT_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.ABYSS__BLUE_VIGILANT_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.ABYSS__BLARU_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.ABYSS__FROZEN_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.ABYSS__ABYSS_JUNGLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.ABYSS__EXOLIUS_MAXIMUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.ABYSS__YOUNG_EXOLIUS_MAXIMUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.ABYSS__ABYSS_SPORES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.ABYSS__VIGILANT_VERSA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.ABYSS__TESLA_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.DIGPEAR__CALLERY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.DIGPEAR__FLOWERING_CALLERY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SKYBLOCK__FIR_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SKYBLOCK__AUTUMN_FIR_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SKYBLOCK__AUTUMN_BIRCH_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SKYBLOCK__BLUEBERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SKYBLOCK__PESTILENT_TROPHY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.BP__PALE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.QUARK__CAVE_ROOTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SP5__END_GRASS_VEGETATION, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SP5__END_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SP5__BLUISHE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SP5__BLUISHE_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SP5__END_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SP5__END_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SP5__WARPED_NAVI_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.MCD__VOID_BLOCK, RenderLayer.getEndGateway());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.MCD__POP_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.MCD__MIDNIGHT_SPROUTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SKYBLOCK__BLUE_BORDER_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SKYBLOCK__RED_BORDER_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyBlockRegistries.BlockRegistries.SKYBLOCK__GREEN_BORDER_BLOCK, RenderLayer.getTranslucent());


        //EntityRendererRegistry.register(ModEntities.MCD__WISP, WispRenderer::new); //TODO: this
        EntityRendererRegistry.register(SkyBlockRegistries.EntityTypeRegistries.SKYBLOCK__OMINOUS_EVOKER, OminousEvokerRenderer::new);
        SkyBlockRegistries.ModelPredicateProviderRegistries.registerModModels();
        SkyBlockRegistries.BlockEntityRendererFactoryRegistries.registerModBlockEntityRendererFactories();

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getGrassColor(world, pos)
                : GrassColors.getDefaultColor(), SkyBlockRegistries.BlockRegistries.SKYBLOCK__CLOVER);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), SkyBlockRegistries.BlockRegistries.SKYBLOCK__CLOVER);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), SkyBlockRegistries.BlockRegistries.SKYBLOCK__SMALL_LILY_PADS);
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? 2129968 : 7455580, SkyBlockRegistries.BlockRegistries.SKYBLOCK__SMALL_LILY_PADS);

        //HandledScreens.register(ModScreenHandlers.SKYBLOCK__ANCIENT_PEDESTAL_SCREEN_HANDLER, AncientPedestalScreen::new); //TODO: this
    }
}
