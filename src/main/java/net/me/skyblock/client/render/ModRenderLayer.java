package net.me.skyblock.client.render;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.client.render.item.ModItemRenderer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderPhase;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.item.ItemRenderer;

public class ModRenderLayer extends RenderLayer {
    private static final RenderLayer RED_GLINT_TRANSLUCENT;
    private static final RenderLayer RED_GLINT;
    private static final RenderLayer RED_DIRECT_GLINT;
    public ModRenderLayer(String name, VertexFormat vertexFormat, VertexFormat.DrawMode drawMode, int expectedBufferSize, boolean hasCrumbling, boolean translucent, Runnable startAction, Runnable endAction) {
        super(name, vertexFormat, drawMode, expectedBufferSize, hasCrumbling, translucent, startAction, endAction);
    }
    public static RenderLayer getRedGlint() {
        return RED_GLINT;
    }
    public static RenderLayer getRedGlintTranslucent() { return RED_GLINT_TRANSLUCENT; }
    public static RenderLayer getRedDirectGlint() { return RED_DIRECT_GLINT; }
    static {
        RED_GLINT_TRANSLUCENT = of("red_glint_translucent", VertexFormats.POSITION_TEXTURE, VertexFormat.DrawMode.QUADS, 256, RenderLayer.MultiPhaseParameters.builder().program(TRANSLUCENT_GLINT_PROGRAM).texture(new RenderPhase.Texture(ModItemRenderer.RED_ITEM_ENCHANTMENT_GLINT, true, false)).writeMaskState(COLOR_MASK).cull(DISABLE_CULLING).depthTest(EQUAL_DEPTH_TEST).transparency(GLINT_TRANSPARENCY).texturing(GLINT_TEXTURING).target(ITEM_ENTITY_TARGET).build(false));
        RED_GLINT = of("red_glint", VertexFormats.POSITION_TEXTURE, VertexFormat.DrawMode.QUADS, 256, RenderLayer.MultiPhaseParameters.builder().program(GLINT_PROGRAM).texture(new RenderPhase.Texture(ModItemRenderer.RED_ITEM_ENCHANTMENT_GLINT, true, false)).writeMaskState(COLOR_MASK).cull(DISABLE_CULLING).depthTest(EQUAL_DEPTH_TEST).transparency(GLINT_TRANSPARENCY).texturing(GLINT_TEXTURING).build(false));
        RED_DIRECT_GLINT = of("red_glint_direct", VertexFormats.POSITION_TEXTURE, VertexFormat.DrawMode.QUADS, 256, RenderLayer.MultiPhaseParameters.builder().program(DIRECT_GLINT_PROGRAM).texture(new RenderPhase.Texture(ModItemRenderer.RED_ITEM_ENCHANTMENT_GLINT, true, false)).writeMaskState(COLOR_MASK).cull(DISABLE_CULLING).depthTest(EQUAL_DEPTH_TEST).transparency(GLINT_TRANSPARENCY).texturing(GLINT_TEXTURING).build(false));
    }
    public static void register() {
        SkyBlock.LOGGER.debug("Registering ModRenderLayers for " + SkyBlock.MOD_ID);
    }
}
