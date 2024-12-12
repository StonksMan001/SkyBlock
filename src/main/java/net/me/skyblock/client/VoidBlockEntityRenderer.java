package net.me.skyblock.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.me.skyblock.block_entities.mcd.echoing_void.VoidBlockEntity;
import net.me.skyblock.registries.v1.SkyBlockRegistries;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import org.joml.Matrix4f;

@Environment(value=EnvType.CLIENT)
public class VoidBlockEntityRenderer<T extends VoidBlockEntity> implements BlockEntityRenderer<T> {
    public static final Identifier SKY_TEXTURE = Identifier.of("textures/environment/end_sky.png");
    public static final Identifier PORTAL_TEXTURE = Identifier.of("skyblock:textures/entity/void_stars.png");

    public VoidBlockEntityRenderer(BlockEntityRendererFactory.Context context) {
    }



    @Override
    public void render(T endPortalBlockEntity, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, int j) {
        Matrix4f matrix4f = matrixStack.peek().getPositionMatrix();
        this.renderSides(endPortalBlockEntity, matrix4f, vertexConsumerProvider.getBuffer(this.getLayer()));
    }

    private void renderSides(T entity, Matrix4f matrix, VertexConsumer vertexConsumer) {
        float f = this.getBottomYOffset();
        float g = this.getTopYOffset();
        this.renderSide(entity, matrix, vertexConsumer, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, Direction.SOUTH);
        this.renderSide(entity, matrix, vertexConsumer, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, Direction.NORTH);
        this.renderSide(entity, matrix, vertexConsumer, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, Direction.EAST);
        this.renderSide(entity, matrix, vertexConsumer, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, Direction.WEST);
        this.renderSide(entity, matrix, vertexConsumer, 0.0f, 1.0f, f, f, 0.0f, 0.0f, 1.0f, 1.0f, Direction.DOWN);
        this.renderSide(entity, matrix, vertexConsumer, 0.0f, 1.0f, g, g, 1.0f, 1.0f, 0.0f, 0.0f, Direction.UP);
    }

    private void renderSide(T entity, Matrix4f model, VertexConsumer vertices, float x1, float x2, float y1, float y2, float z1, float z2, float z3, float z4, Direction side) {
        if (entity.shouldDrawSide(side)) {
            vertices.vertex(model, x1, y1, z1);
            vertices.vertex(model, x2, y1, z2);
            vertices.vertex(model, x2, y2, z3);
            vertices.vertex(model, x1, y2, z4);
        }
    }
    protected float getTopYOffset() {
        return 1.0f;
    }
    protected float getBottomYOffset() {
        return 0.0f;
    }
    protected RenderLayer getLayer() {
        return SkyBlockRegistries.RenderLayerRegistries.getVoidBlock();
    }

    public int getRenderDistance() {
        return 256;
    }
}