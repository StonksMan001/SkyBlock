package net.me.mcd_innermod.registries;

import net.me.mcd_innermod.client.VoidBlockEntityRenderer;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderPhase;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.render.VertexFormats;

public class MCD_RenderLayers extends RenderLayer {
    public MCD_RenderLayers(String name, VertexFormat vertexFormat, VertexFormat.DrawMode drawMode, int expectedBufferSize, boolean hasCrumbling, boolean translucent, Runnable startAction, Runnable endAction) {
        super(name, vertexFormat, drawMode, expectedBufferSize, hasCrumbling, translucent, startAction, endAction);
    }
    private static final RenderLayer MCD__VOID_BLOCK = RenderLayer.of("void_block", VertexFormats.POSITION, VertexFormat.DrawMode.QUADS, 256, false, false, MultiPhaseParameters.builder().program(RenderPhase.END_GATEWAY_PROGRAM).texture(Textures.create().add(VoidBlockEntityRenderer.SKY_TEXTURE, false, false).add(VoidBlockEntityRenderer.PORTAL_TEXTURE, false, false).build()).build(false));
    public static RenderLayer getVoidBlock() {
        return MCD__VOID_BLOCK;
    }
    public static void register() {
        SkyCore.LOGGER.info("[SkyBlock MultiMod] Registering RenderLayers for \"MCD\" innermod");
    }
}
