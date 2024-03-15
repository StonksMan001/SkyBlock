package net.me.skyblock.api.mixin;

import net.me.skyblock.SkyBlock;
import net.me.skyblock.client.ModRenderLayer;
import net.minecraft.client.render.*;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WorldRenderer.class)
public abstract class WorldRendererMixin {
    @Mutable
    @Final
    @Shadow
    private final BufferBuilderStorage bufferBuilders;

    public WorldRendererMixin(BufferBuilderStorage bufferBuilders) {
        this.bufferBuilders = bufferBuilders;
    }

    @Inject(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/RenderLayer;getEndGateway()Lnet/minecraft/client/render/RenderLayer;"))
    public void render(MatrixStack matrices, float tickDelta, long limitTime, boolean renderBlockOutline, Camera camera, GameRenderer gameRenderer, LightmapTextureManager lightmapTextureManager, Matrix4f projectionMatrix, CallbackInfo ci) {
        VertexConsumerProvider.Immediate immediate = this.bufferBuilders.getEntityVertexConsumers();
        immediate.draw(ModRenderLayer.getVoidBlock());
    }
}
