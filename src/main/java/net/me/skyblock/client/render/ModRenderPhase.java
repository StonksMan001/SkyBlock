package net.me.skyblock.client.render;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.SkyBlockClient;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderPhase;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import org.joml.Matrix4f;

import java.util.Optional;

public abstract class ModRenderPhase {
    protected final String name;
    private final Runnable beginAction;
    private final Runnable endAction;
    public static final Texturing RED_GLINT_TEXTURING = new Texturing("glint_texturing", () -> ModRenderPhase.setupGlintTexturing(8.0f), () -> RenderSystem.resetTextureMatrix());

    public ModRenderPhase(String name, Runnable beginAction, Runnable endAction) {
        this.name = name;
        this.beginAction = beginAction;
        this.endAction = endAction;
    }

    protected static class Texturing
            extends RenderPhase {
        public Texturing(String string, Runnable runnable, Runnable runnable2) {
            super(string, runnable, runnable2);
        }
    }
    private static void setupGlintTexturing(float scale) {
        long l = (long)((double) Util.getMeasuringTimeMs() * MinecraftClient.getInstance().options.getGlintSpeed().getValue() * 8.0);
        float f = (float)(l % 110000L) / 110000.0f;
        float g = (float)(l % 30000L) / 30000.0f;
        Matrix4f matrix4f = new Matrix4f().translation(-f, g, 0.0f);
        matrix4f.rotateZ(0.17453292f).scale(scale);
        RenderSystem.setTextureMatrix(matrix4f);
    }
    @Environment(value= EnvType.CLIENT)
    protected static class Texture
            extends ModRenderPhase.TextureBase {
        private final Optional<Identifier> id;
        private final boolean blur;
        private final boolean mipmap;

        public Texture(Identifier id, boolean blur, boolean mipmap) {
            super(() -> {
                TextureManager textureManager = MinecraftClient.getInstance().getTextureManager();
                textureManager.getTexture(id).setFilter(blur, mipmap);
                RenderSystem.setShaderTexture(0, id);
            }, () -> {});
            this.id = Optional.of(id);
            this.blur = blur;
            this.mipmap = mipmap;
        }

        @Override
        public String toString() {
            return this.name + "[" + this.id + "(blur=" + this.blur + ", mipmap=" + this.mipmap + ")]";
        }

        @Override
        protected Optional<Identifier> getId() {
            return this.id;
        }
    }
    @Environment(value=EnvType.CLIENT)
    protected static class TextureBase
            extends ModRenderPhase {
        public TextureBase(Runnable apply, Runnable unapply) {
            super("texture", apply, unapply);
        }

        TextureBase() {
            super("texture", () -> {}, () -> {});
        }

        protected Optional<Identifier> getId() {
            return Optional.empty();
        }
    }
    public static void register() {
        SkyBlock.LOGGER.debug("Registering ModRenderPhases for " + SkyBlock.MOD_ID);
    }
}
