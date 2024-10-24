package net.me.skyblock.entity.mobs.mcd.rendering;

import net.me.skyblock.registries.SkyBlock;
import net.me.skyblock.entity.mobs.mcd.WispEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

@Deprecated
public class WispRenderer {
    private static final Identifier TEXTURE = SkyBlock.identifierOfSkyBlock("textures/entity/wisp.png");
    private static final Identifier EMISSIVE = SkyBlock.identifierOfSkyBlock("textures/entity/wisp_e.png");
    public WispRenderer(EntityRendererFactory.Context renderManager) {
    }
    public Identifier getTextureLocation(WispEntity animatable) {
        return TEXTURE;
    }
    @SuppressWarnings("all")
    public void render(WispEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        //super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
    protected int getBlockLight(WispEntity allayEntity, BlockPos blockPos) {
        return 15;
    }
}
