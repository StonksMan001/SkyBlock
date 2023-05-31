package net.me.skyblock.client.render.item;

import net.me.skyblock.SkyBlock;
import net.me.skyblock.client.render.ModRenderLayer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexConsumers;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.SynchronousResourceReloader;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class ModItemRenderer implements SynchronousResourceReloader {

    public static final Identifier RED_ITEM_ENCHANTMENT_GLINT = new Identifier("skyblock:textures/misc/enchanted_item_glint_red.png");

    @Override
    public CompletableFuture<Void> reload(Synchronizer synchronizer, ResourceManager manager, Profiler prepareProfiler, Profiler applyProfiler, Executor prepareExecutor, Executor applyExecutor) {
        return SynchronousResourceReloader.super.reload(synchronizer, manager, prepareProfiler, applyProfiler, prepareExecutor, applyExecutor);
    }

    @Override
    public void reload(ResourceManager manager) {

    }
    public static VertexConsumer getDirectItemGlintConsumer(VertexConsumerProvider provider, RenderLayer layer, boolean solid, boolean glint) {
        if (glint) {
            return VertexConsumers.union(provider.getBuffer(solid ? ModRenderLayer.getRedGlint() : ModRenderLayer.getRedGlint()), provider.getBuffer(layer));
        }
        return provider.getBuffer(layer);
    }
    public static void register() {
        SkyBlock.LOGGER.debug("Registering ModItemRenderer for " + SkyBlock.MOD_ID);
    }
}
