package net.me.skyblock.util;

import net.me.skyblock.client.render.ModRenderLayer;
import net.me.skyblock.client.render.item.ModItemRenderer;
import net.me.skyblock.item.not_important_rn.ModItemStack;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.*;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.ResourceReloader;

public interface IItemRendererContext {
    /*ModItemRenderer getRedDirectItemGlintConsumer();
    ModItemRenderer getRedDynamicDisplayGlintConsumer();
    ModItemRenderer getRedDirectDynamicDisplayGlintConsumer();
    ModItemRenderer getRedItemGlintConsumer();*/

    void injected(ItemStack stack, ModItemStack modstack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, BakedModel model);
}
