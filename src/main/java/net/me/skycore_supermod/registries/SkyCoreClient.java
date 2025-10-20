package net.me.skycore_supermod.registries;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.me.abyss_innermod.registries.Abyss_Blocks;
import net.me.backport_innermod.registries.BP_Blocks;
import net.me.mcd_innermod.registries.MCD_RenderLayers;
import net.me.skycore_supermod.deprecated.benimod.entities.rendering.NativeVillagerRenderer;
import net.me.bosc_innermod.registries.BOSC_Blocks;
import net.me.brainrot_innermod.registries.Brainrot_Blocks;
import net.me.mcd_innermod.registries.MCD_Blocks;
import net.me.pearfection_innermod.registries.Pearfection_Blocks;
import net.me.quark_innermod.base.QuarkFabricClient;
import net.me.quark_innermod.registries.Quark_Blocks;
import net.me.skyblock__innermod.entities.rendering.OminousEvokerRenderer;
import net.me.skycore_supermod.common_registries.SkyCore_BlockEntityRendererFactories;
import net.me.skyblock__innermod.registries.SB_Blocks;
import net.me.skyblock__innermod.registries.SB_EntityTypes;
import net.me.skycore_supermod.common_registries.SkyCore_ModelPredicateProviders;
import net.me.skycore_supermod.deprecated.benimod.BenimodRegistries;
import net.me.sp5_innermod.registries.SP5_Blocks;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.world.biome.GrassColors;

public class SkyCoreClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {
        //QuarkFabricClient quarkClient = new QuarkFabricClient();
        //quarkClient.onInitializeClient();

        MCD_RenderLayers.register();
        // Should never touch
        BlockRenderLayerMap.INSTANCE.putBlock(ArchivedRegistries.ArchivedBlockRegistries.ANT_JAM_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ArchivedRegistries.ArchivedBlockRegistries.SWEET_BERRY_JAM_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ArchivedRegistries.ArchivedBlockRegistries.TRANSPARENT_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ArchivedRegistries.ArchivedBlockRegistries.BLUE_WART, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ArchivedRegistries.ArchivedBlockRegistries.CAVE_ROOTS, RenderLayer.getCutout());
        // Should never touch

        BlockRenderLayerMap.INSTANCE.putBlock(BP_Blocks.BP__PALE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BP_Blocks.BP__PALE_HANGING_MOSS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BP_Blocks.BP__PALE_HANGING_MOSS_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__DUCKWEED, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__SMALL_LILY_PADS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__CLOVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__CHILLI_PEPPER_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__GOLDEN_CARROT_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__SNOWY_SHORT_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__ANT_JAM_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__SWEET_BERRY_JAM_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__SCULK_SPROUTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BOSC_Blocks.BOSC__DEAD_SCULK_SPROUTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Brainrot_Blocks.BRAINROT__BRAINROTTEN_SPROUTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Brainrot_Blocks.BRAINROT__GRIMACE_SHAKE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__RED_SCULK_SPROUTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__UNKNOWN_SPROUTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__UNKNOWN_VEGETATION, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SP5_Blocks.SP5__TRANSPARENT_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Abyss_Blocks.ABYSS__ABYSS_SLIME_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SP5_Blocks.SP5__BLUE_WART, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Abyss_Blocks.ABYSS__BLARU_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Abyss_Blocks.ABYSS__VIGILANT_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Abyss_Blocks.ABYSS__BLUE_VIGILANT_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Abyss_Blocks.ABYSS__BLARU_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Abyss_Blocks.ABYSS__FROZEN_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Abyss_Blocks.ABYSS__ABYSS_JUNGLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Abyss_Blocks.ABYSS__EXOLIUS_MAXIMUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Abyss_Blocks.ABYSS__YOUNG_EXOLIUS_MAXIMUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Abyss_Blocks.ABYSS__ABYSS_SPORES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Abyss_Blocks.ABYSS__VIGILANT_VERSA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Abyss_Blocks.ABYSS__TESLA_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Pearfection_Blocks.DIGPEAR__CALLERY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Pearfection_Blocks.DIGPEAR__FLOWERING_CALLERY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__FIR_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__AUTUMN_FIR_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__AUTUMN_BIRCH_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__BLUEBERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__PESTILENT_TROPHY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Quark_Blocks.QUARK__CAVE_ROOTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SP5_Blocks.SP5__END_GRASS_VEGETATION, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SP5_Blocks.SP5__END_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SP5_Blocks.SP5__BLUISHE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SP5_Blocks.SP5__BLUISHE_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SP5_Blocks.SP5__END_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SP5_Blocks.SP5__END_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SP5_Blocks.SP5__WARPED_NAVI_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MCD_Blocks.MCD__VOID_BLOCK, RenderLayer.getEndGateway());
        BlockRenderLayerMap.INSTANCE.putBlock(MCD_Blocks.MCD__POP_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MCD_Blocks.MCD__MIDNIGHT_SPROUTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__BLUE_BORDER_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__RED_BORDER_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SB_Blocks.SKYBLOCK__GREEN_BORDER_BLOCK, RenderLayer.getTranslucent());

        //EntityRendererRegistry.register(ModEntities.MCD__WISP, WispRenderer::new); //TODO: this
        EntityRendererRegistry.register(SB_EntityTypes.SKYBLOCK__OMINOUS_EVOKER, OminousEvokerRenderer::new);
        SkyCore_ModelPredicateProviders.registerModModels();
        SkyCore_BlockEntityRendererFactories.registerModBlockEntityRendererFactories();

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getGrassColor(world, pos)
                : GrassColors.getDefaultColor(), SB_Blocks.SKYBLOCK__CLOVER);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), SB_Blocks.SKYBLOCK__CLOVER);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), SB_Blocks.SKYBLOCK__SMALL_LILY_PADS);
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? 2129968 : 7455580, SB_Blocks.SKYBLOCK__SMALL_LILY_PADS);

        //HandledScreens.register(ModScreenHandlers.SKYBLOCK__ANCIENT_PEDESTAL_SCREEN_HANDLER, AncientPedestalScreen::new); //TODO: this
    }
}
