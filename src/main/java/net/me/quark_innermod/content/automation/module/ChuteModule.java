package net.me.quark_innermod.content.automation.module;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.me.quark_innermod.base.QuarkFabric;
import net.me.quark_innermod.content.automation.block.ChuteBlock;
import net.me.quark_innermod.content.automation.block_entity.ChuteBlockEntity;
import net.me.quark_innermod.internal_zeta.org.ZetaModule;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.sound.BlockSoundGroup;

public class ChuteModule extends ZetaModule {
    public static BlockEntityType<ChuteBlockEntity> chuteBlockEntityType;
    public static Block chuteBlock;
    @Override
    public void register() {
        chuteBlock = SkyCore.BuiltinRegistries.registerBlockAndItem("quark__chute",
                new ChuteBlock(AbstractBlock.Settings
                        .create().mapColor(MapColor.OAK_TAN)
                        .strength(2.5F)
                        .sounds(BlockSoundGroup.WOOD)
                        .burnable()));
        chuteBlockEntityType = SkyCore.BuiltinRegistries.registerBlockEntityType("quark__chute",
                BlockEntityType.Builder.create(ChuteBlockEntity::new, chuteBlock).build());
        QuarkFabric.addFlammableZetaBlock(chuteBlock);
    }
    @Override
    public void registerClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(chuteBlock, RenderLayer.getCutoutMipped());
    }
}
