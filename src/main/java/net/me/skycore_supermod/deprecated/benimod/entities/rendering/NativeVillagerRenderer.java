package net.me.skycore_supermod.deprecated.benimod.entities.rendering;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.me.skycore_supermod.deprecated.benimod.entities.NativeVillagerEntity;
import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.feature.HeadFeatureRenderer;
import net.minecraft.client.render.entity.feature.VillagerHeldItemFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.VillagerResemblingModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

@Deprecated
@Environment(EnvType.CLIENT)
public class NativeVillagerRenderer extends MobEntityRenderer<NativeVillagerEntity, VillagerResemblingModel<NativeVillagerEntity>> {
    private static final Identifier TEXTURE = SkyCore.identifierOfSkyBlock("textures/entity/benimod__native_villager.png");

    public NativeVillagerRenderer(EntityRendererFactory.Context context) {
        super(context, new VillagerResemblingModel<>(context.getPart(EntityModelLayers.WANDERING_TRADER)), 0.5F);
        this.addFeature(new HeadFeatureRenderer<>(this, context.getModelLoader(), context.getHeldItemRenderer()));
        this.addFeature(new VillagerHeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
    }

    public Identifier getTexture(NativeVillagerEntity nativeVillagerEntity) {
        return TEXTURE;
    }

    protected void scale(NativeVillagerEntity nativeVillagerEntity, MatrixStack matrixStack, float f) {
        float g = 0.9375F;
        matrixStack.scale(0.9375F, 0.9375F, 0.9375F);
    }
}
