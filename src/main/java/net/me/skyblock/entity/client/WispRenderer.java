package net.me.skyblock.entity.client;

import net.me.skyblock.SkyBlock;
import net.me.skyblock.entity.custom.WispEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class WispRenderer extends GeoEntityRenderer<WispEntity> {
    public WispRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new WispModel());
    }

    @Override
    public Identifier getTextureLocation(WispEntity animatable) {
        return new Identifier(SkyBlock.MOD_ID, "textures/entity/wisp.png");
    }

    @Override
    public void render(WispEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
