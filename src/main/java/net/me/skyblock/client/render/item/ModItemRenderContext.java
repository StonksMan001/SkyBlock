package net.me.skyblock.client.render.item;

import net.fabricmc.fabric.api.renderer.v1.material.BlendMode;
import net.fabricmc.fabric.api.renderer.v1.mesh.Mesh;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.model.FabricBakedModel;
import net.fabricmc.fabric.api.renderer.v1.model.ModelHelper;
import net.fabricmc.fabric.impl.client.indigo.renderer.IndigoRenderer;
import net.fabricmc.fabric.impl.client.indigo.renderer.RenderMaterialImpl;
import net.fabricmc.fabric.impl.client.indigo.renderer.helper.ColorHelper;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.EncodingFormat;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MeshImpl;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MutableQuadViewImpl;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.AbstractQuadRenderer;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.ItemRenderContext;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.item.ModItemStack;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.render.*;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.BakedQuad;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ModItemRenderContext extends ItemRenderContext {
    private static final long ITEM_RANDOM_SEED = 42L;

    public ModItemRenderContext(ItemColors colorMap) {
        super(colorMap);
    }

    @FunctionalInterface
    public interface VanillaQuadHandler {
        void accept(BakedModel model, ItemStack stack, int color, int overlay, MatrixStack matrixStack, VertexConsumer buffer);
    }

    private final Random random = Random.create();
    private final Vector3f normalVec = new Vector3f();

    private final Supplier<Random> randomSupplier = () -> {
        random.setSeed(ITEM_RANDOM_SEED);
        return random;
    };

    private ItemStack itemStack;
    private ModItemStack ModitemStack;
    private ModelTransformationMode transformMode;
    private MatrixStack matrixStack;
    private VertexConsumerProvider vertexConsumerProvider;
    private int lightmap;
    private ItemRenderContext.VanillaQuadHandler vanillaHandler;

    private boolean isDefaultTranslucent;
    private boolean isTranslucentDirect;
    private VertexConsumer translucentVertexConsumer;
    private VertexConsumer cutoutVertexConsumer;
    private VertexConsumer modelVertexConsumer;


    public void renderModel(ItemStack itemStack, ModelTransformationMode transformMode, boolean invert, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int lightmap, int overlay, BakedModel model, ItemRenderContext.VanillaQuadHandler vanillaHandler) {
        this.itemStack = itemStack;
        this.transformMode = transformMode;
        this.matrixStack = matrixStack;
        this.vertexConsumerProvider = vertexConsumerProvider;
        this.lightmap = lightmap;
        this.overlay = overlay;
        this.vanillaHandler = vanillaHandler;
        computeOutputInfo();

        matrix = matrixStack.peek().getPositionMatrix();
        normalMatrix = matrixStack.peek().getNormalMatrix();

        ((FabricBakedModel) model).emitItemQuads(itemStack, randomSupplier, this);

        this.itemStack = null;
        this.matrixStack = null;
        this.vanillaHandler = null;
        translucentVertexConsumer = null;
        cutoutVertexConsumer = null;
        modelVertexConsumer = null;
    }

    private void computeOutputInfo() {
        isDefaultTranslucent = true;
        isTranslucentDirect = true;

        Item item = itemStack.getItem();

        if (item instanceof BlockItem blockItem) {
            BlockState state = blockItem.getBlock().getDefaultState();
            RenderLayer renderLayer = RenderLayers.getBlockLayer(state);

            if (renderLayer != RenderLayer.getTranslucent()) {
                isDefaultTranslucent = false;
            }

            if (transformMode != ModelTransformationMode.GUI && !transformMode.isFirstPerson()) {
                isTranslucentDirect = false;
            }
        }

        modelVertexConsumer = quadVertexConsumer(BlendMode.DEFAULT);
    }

    /**
     * Caches custom blend mode / vertex consumers and mimics the logic
     * in {@code RenderLayers.getEntityBlockLayer}. Layers other than
     * translucent are mapped to cutout.
     */
    private VertexConsumer quadVertexConsumer(BlendMode blendMode) {
        boolean translucent;

        if (blendMode == BlendMode.DEFAULT) {
            translucent = isDefaultTranslucent;
        } else {
            translucent = blendMode == BlendMode.TRANSLUCENT;
        }

        if (translucent) {
            if (translucentVertexConsumer == null) {
                if (isTranslucentDirect) {
                    translucentVertexConsumer = ModItemRenderer.getDirectItemGlintConsumer(vertexConsumerProvider, TexturedRenderLayers.getEntityTranslucentCull(), true, ModitemStack.hasRedGlint());
                } else if (MinecraftClient.isFabulousGraphicsOrBetter()) {
                    translucentVertexConsumer = ModItemRenderer.getDirectItemGlintConsumer(vertexConsumerProvider, TexturedRenderLayers.getItemEntityTranslucentCull(), true, ModitemStack.hasRedGlint());
                } else {
                    translucentVertexConsumer = ModItemRenderer.getDirectItemGlintConsumer(vertexConsumerProvider, TexturedRenderLayers.getEntityTranslucentCull(), true, ModitemStack.hasRedGlint());
                }
            }

            return translucentVertexConsumer;
        } else {
            if (cutoutVertexConsumer == null) {
                cutoutVertexConsumer = ModItemRenderer.getDirectItemGlintConsumer(vertexConsumerProvider, TexturedRenderLayers.getEntityCutout(), true, ModitemStack.hasRedGlint());
            }

            return cutoutVertexConsumer;
        }
    }
    public static void register() {
        SkyBlock.LOGGER.debug("Registering ModItemRenderContext for " + SkyBlock.MOD_ID);
    }
}
