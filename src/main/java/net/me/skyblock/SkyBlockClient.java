package net.me.skyblock;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.me.skyblock.archived.ArchivedBlocks;
import net.me.skyblock.blocks_and_items.ModBlocks;
import net.me.skyblock.client.ModBlockEntityRendererFactories;
import net.me.skyblock.client.ModScreenHandlers;
import net.me.skyblock.client.gui.screens.AncientPedestalScreen;
import net.me.skyblock.entity.ModEntities;
import net.me.skyblock.entity.mobs.mcd.rendering.WispRenderer;
import net.me.skyblock.api.ModModelPredicateProvider;
import net.me.skyblock.entity.mobs.skyblock.rendering.OminousEvokerRenderer;
import net.me.skyblock.particle.ModParticles;
import net.me.skyblock.particle.halloween.NodeTracker;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EvokerEntityRenderer;
import net.minecraft.item.BlockItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import net.minecraft.world.biome.GrassColors;

public class SkyBlockClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {
        // Should never touch
        BlockRenderLayerMap.INSTANCE.putBlock(ArchivedBlocks.ANT_JAM_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ArchivedBlocks.SWEET_BERRY_JAM_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ArchivedBlocks.TRANSPARENT_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ArchivedBlocks.BLUE_WART, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ArchivedBlocks.CAVE_ROOTS, RenderLayer.getCutout());
        // Should never touch

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKYBLOCK__DUCKWEED, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKYBLOCK__SMALL_LILY_PADS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKYBLOCK__CLOVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKYBLOCK__CHILLI_PEPPER_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKYBLOCK__SNOWY_SHORT_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKYBLOCK__ANT_JAM_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKYBLOCK__SWEET_BERRY_JAM_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKYBLOCK__SCULK_SPROUTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BOSC__DEAD_SCULK_SPROUTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKYBLOCK__RED_SCULK_SPROUTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKYBLOCK__UNKNOWN_SPROUTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKYBLOCK__UNKNOWN_VEGETATION, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SP5__TRANSPARENT_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ABYSS__ABYSS_SLIME_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SP5__BLUE_WART, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ABYSS__BLARU_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ABYSS__VIGILANT_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ABYSS__BLUE_VIGILANT_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ABYSS__BLARU_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ABYSS__FROZEN_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ABYSS__ABYSS_JUNGLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ABYSS__EXOLIUS_MAXIMUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ABYSS__YOUNG_EXOLIUS_MAXIMUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ABYSS__ABYSS_SPORES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ABYSS__VIGILANT_VERSA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ABYSS__TESLA_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DIGPEAR__CALLERY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DIGPEAR__FLOWERING_CALLERY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKYBLOCK__FIR_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKYBLOCK__AUTUMN_FIR_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKYBLOCK__AUTUMN_BIRCH_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKYBLOCK__BLUEBERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKYBLOCK__PESTILENT_TROPHY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BP__PALE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.QUARK__CAVE_ROOTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SP5__END_GRASS_VEGETATION, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SP5__END_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SP5__BLUISHE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SP5__BLUISHE_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SP5__END_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SP5__END_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SP5__WARPED_NAVI_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MCD__VOID_BLOCK, RenderLayer.getEndGateway());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MCD__POP_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MCD__MIDNIGHT_SPROUTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKYBLOCK__BLUE_BORDER_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKYBLOCK__RED_BORDER_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKYBLOCK__GREEN_BORDER_BLOCK, RenderLayer.getTranslucent());


        //EntityRendererRegistry.register(ModEntities.MCD__WISP, WispRenderer::new); //TODO: this
        EntityRendererRegistry.register(ModEntities.SKYBLOCK__OMINOUS_EVOKER, OminousEvokerRenderer::new);
        ModModelPredicateProvider.registerModModels();
        ModBlockEntityRendererFactories.registerModBlockEntityRendererFactories();

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getGrassColor(world, pos)
                : GrassColors.getDefaultColor(), ModBlocks.SKYBLOCK__CLOVER);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.SKYBLOCK__CLOVER);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.SKYBLOCK__SMALL_LILY_PADS);
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? 2129968 : 7455580, ModBlocks.SKYBLOCK__SMALL_LILY_PADS);

        //HandledScreens.register(ModScreenHandlers.SKYBLOCK__ANCIENT_PEDESTAL_SCREEN_HANDLER, AncientPedestalScreen::new); //TODO: this
    }
}
