package net.me.skyblock.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderPhase;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.render.VertexFormats;

public class ModRenderLayer extends RenderLayer {
    public ModRenderLayer(String name, VertexFormat vertexFormat, VertexFormat.DrawMode drawMode, int expectedBufferSize, boolean hasCrumbling, boolean translucent, Runnable startAction, Runnable endAction) {
        super(name, vertexFormat, drawMode, expectedBufferSize, hasCrumbling, translucent, startAction, endAction);
    }
    private static final RenderLayer VOID_BLOCK = RenderLayer.of("void_block", VertexFormats.POSITION, VertexFormat.DrawMode.QUADS, 256, false, false, RenderLayer.MultiPhaseParameters.builder().program(RenderPhase.END_GATEWAY_PROGRAM).texture(RenderPhase.Textures.create().add(VoidBlockEntityRenderer.SKY_TEXTURE, false, false).add(VoidBlockEntityRenderer.PORTAL_TEXTURE, false, false).build()).build(false));

    public static RenderLayer getVoidBlock() {
        return VOID_BLOCK;
    }
}
