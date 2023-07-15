package net.me.skyblock.client.render.item;

import net.me.skyblock.SkyBlock;
import net.me.skyblock.client.render.ModRenderLayer;
import net.me.skyblock.item.not_important_rn.ModItemStack;
import net.minecraft.block.Block;
import net.minecraft.block.StainedGlassPaneBlock;
import net.minecraft.block.TransparentBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.*;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.SynchronousResourceReloader;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MatrixUtil;
import net.minecraft.util.profiler.Profiler;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class ModItemRenderer implements SynchronousResourceReloader {

    public static final Identifier RED_ITEM_ENCHANTMENT_GLINT = new Identifier("textures/misc/enchanted_glint_item.png");

    @Override
    public CompletableFuture<Void> reload(Synchronizer synchronizer, ResourceManager manager, Profiler prepareProfiler, Profiler applyProfiler, Executor prepareExecutor, Executor applyExecutor) {
        return SynchronousResourceReloader.super.reload(synchronizer, manager, prepareProfiler, applyProfiler, prepareExecutor, applyExecutor);
    }

    @Override
    public void reload(ResourceManager manager) {

    }
    public static VertexConsumer getRedDirectItemGlintConsumer(VertexConsumerProvider provider, RenderLayer layer, boolean solid, boolean glint) {
        if (glint) {
            return VertexConsumers.union(provider.getBuffer(ModRenderLayer.getRedGlint()), provider.getBuffer(layer));
        }
        return provider.getBuffer(layer);
    }
    public static VertexConsumer getRedDynamicDisplayGlintConsumer(VertexConsumerProvider provider, RenderLayer layer, MatrixStack.Entry entry) {
        return VertexConsumers.union(new OverlayVertexConsumer(provider.getBuffer(ModRenderLayer.getRedGlint()), entry.getPositionMatrix(), entry.getNormalMatrix(), 0.0078125F), provider.getBuffer(layer));
    }
    public static VertexConsumer getRedDirectDynamicDisplayGlintConsumer(VertexConsumerProvider provider, RenderLayer layer, MatrixStack.Entry entry) {
        return VertexConsumers.union(new OverlayVertexConsumer(provider.getBuffer(ModRenderLayer.getRedDirectGlint()), entry.getPositionMatrix(), entry.getNormalMatrix(), 0.0078125F), provider.getBuffer(layer));
    }
    public static VertexConsumer getRedItemGlintConsumer(VertexConsumerProvider vertexConsumers, RenderLayer layer, boolean solid, boolean glint) {
        if (glint) {
            return MinecraftClient.isFabulousGraphicsOrBetter() && layer == TexturedRenderLayers.getItemEntityTranslucentCull() ? VertexConsumers.union(vertexConsumers.getBuffer(ModRenderLayer.getRedGlintTranslucent()), vertexConsumers.getBuffer(layer)) : VertexConsumers.union(vertexConsumers.getBuffer(ModRenderLayer.getRedGlint()), vertexConsumers.getBuffer(layer));
        } else {
            return vertexConsumers.getBuffer(layer);
        }
    }
    public static void register() {
        SkyBlock.LOGGER.debug("Registering ModItemRenderer for " + SkyBlock.MOD_ID);
    }
}
