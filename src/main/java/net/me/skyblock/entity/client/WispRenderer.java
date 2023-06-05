package net.me.skyblock.entity.client;

import net.me.skyblock.SkyBlock;
import net.me.skyblock.entity.custom.WispEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.passive.AllayEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class WispRenderer extends GeoEntityRenderer<WispEntity> {
    private static final Identifier TEXTURE = new Identifier( SkyBlock.MOD_ID, "textures/entity/wisp.png");
    private static final Identifier EMISSIVE = new Identifier(SkyBlock.MOD_ID, "textures/entity/wisp_e.png");
    public WispRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new WispModel());
    }

    @Override
    public Identifier getTextureLocation(WispEntity animatable) {
        return TEXTURE;
    }

    @Override
    public void render(WispEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);

    }
    @Override
    protected int getBlockLight(WispEntity allayEntity, BlockPos blockPos) {
        return 15;
    }
}
