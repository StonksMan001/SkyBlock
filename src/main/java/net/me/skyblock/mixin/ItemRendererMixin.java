package net.me.skyblock.mixin;

import com.google.common.collect.Sets;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.client.render.ModRenderLayer;
import net.me.skyblock.client.render.item.ModItemRenderer;
import net.me.skyblock.item.not_important_rn.ModItemStack;
import net.me.skyblock.util.IItemRendererContext;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StainedGlassPaneBlock;
import net.minecraft.block.TransparentBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.render.*;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.client.render.item.ItemModels;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.BakedModelManager;
import net.minecraft.client.render.model.BakedQuad;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MatrixUtil;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static net.minecraft.client.render.item.ItemRenderer.*;

@Mixin(ItemRenderer.class)
public class ItemRendererMixin implements IItemRendererContext {
    @Shadow
    private static final Set<Item> WITHOUT_MODELS;
    @Shadow
    private static final ModelIdentifier TRIDENT;
    @Shadow
    public static final ModelIdentifier TRIDENT_IN_HAND;
    @Shadow
    private static final ModelIdentifier SPYGLASS;
    @Shadow
    public static final ModelIdentifier SPYGLASS_IN_HAND;
    @Shadow
    private final MinecraftClient client;
    @Shadow
    private final TextureManager textureManager;
    @Shadow
    private final ItemModels models;
    @Shadow
    private final ItemColors colors;
    @Shadow
    private final BuiltinModelItemRenderer builtinModelItemRenderer;

    static {
        WITHOUT_MODELS = Sets.newHashSet(new Item[]{Items.AIR});
        TRIDENT = ModelIdentifier.ofVanilla("trident", "inventory");
        TRIDENT_IN_HAND = ModelIdentifier.ofVanilla("trident_in_hand", "inventory");
        SPYGLASS = ModelIdentifier.ofVanilla("spyglass", "inventory");
        SPYGLASS_IN_HAND = ModelIdentifier.ofVanilla("spyglass_in_hand", "inventory");
    }
    public ItemRendererMixin(MinecraftClient client, TextureManager manager, BakedModelManager bakery, ItemColors colors, BuiltinModelItemRenderer builtinModelItemRenderer) {
        this.client = client;
        this.textureManager = manager;
        this.models = new ItemModels(bakery);
        this.builtinModelItemRenderer = builtinModelItemRenderer;
        Iterator var6 = Registries.ITEM.iterator();

        while(var6.hasNext()) {
            Item item = (Item)var6.next();
            if (!WITHOUT_MODELS.contains(item)) {
                this.models.putModel(item, new ModelIdentifier(Registries.ITEM.getId(item), "inventory"));
            }
        }

        this.colors = colors;
    }
    @Shadow
    private static boolean usesDynamicDisplay(ItemStack stack) {
        return stack.isIn(ItemTags.COMPASSES) || stack.isOf(Items.CLOCK);
    }

    @Override
    public void injected(ItemStack stack, ModItemStack modstack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, BakedModel model) {
        if (!stack.isEmpty()) {
            matrices.push();
            boolean bl = renderMode == ModelTransformationMode.GUI || renderMode == ModelTransformationMode.GROUND || renderMode == ModelTransformationMode.FIXED;
            if (bl) {
                if (stack.isOf(Items.TRIDENT)) {
                    model = this.models.getModelManager().getModel(TRIDENT);
                } else if (stack.isOf(Items.SPYGLASS)) {
                    model = this.models.getModelManager().getModel(SPYGLASS);
                }
            }

            model.getTransformation().getTransformation(renderMode).apply(leftHanded, matrices);
            matrices.translate(-0.5F, -0.5F, -0.5F);
            if (!model.isBuiltin() && (!stack.isOf(Items.TRIDENT) || bl)) {
                boolean bl2;
                if (renderMode != ModelTransformationMode.GUI && !renderMode.isFirstPerson() && stack.getItem() instanceof BlockItem) {
                    Block block = ((BlockItem)stack.getItem()).getBlock();
                    bl2 = !(block instanceof TransparentBlock) && !(block instanceof StainedGlassPaneBlock);
                } else {
                    bl2 = true;
                }

                RenderLayer renderLayer = RenderLayers.getItemLayer(stack, bl2);
                VertexConsumer vertexConsumer;
                if (usesDynamicDisplay(stack) && modstack.hasRedGlint()) {
                    matrices.push();
                    MatrixStack.Entry entry = matrices.peek();
                    if (renderMode == ModelTransformationMode.GUI) {
                        MatrixUtil.scale(entry.getPositionMatrix(), 0.5F);
                    } else if (renderMode.isFirstPerson()) {
                        MatrixUtil.scale(entry.getPositionMatrix(), 0.75F);
                    }

                    if (bl2) {
                        vertexConsumer = ModItemRenderer.getRedDirectDynamicDisplayGlintConsumer(vertexConsumers, renderLayer, entry);
                    } else {
                        vertexConsumer = ModItemRenderer.getRedDynamicDisplayGlintConsumer(vertexConsumers, renderLayer, entry);
                    }

                    matrices.pop();
                } else if (bl2) {
                    vertexConsumer = ModItemRenderer.getRedDirectItemGlintConsumer(vertexConsumers, renderLayer, true, stack.hasGlint());
                } else {
                    vertexConsumer = ModItemRenderer.getRedItemGlintConsumer(vertexConsumers, renderLayer, true, stack.hasGlint());
                }

                this.renderBakedItemModel(model, stack, light, overlay, matrices, vertexConsumer);
            } else {
                this.builtinModelItemRenderer.render(stack, renderMode, matrices, vertexConsumers, light, overlay);
            }

            matrices.pop();
        }
    }
    @Shadow
    private void renderBakedItemModel(BakedModel model, ItemStack stack, int light, int overlay, MatrixStack matrices, VertexConsumer vertices) {
        Random random = Random.create();
        long l = 42L;
        Direction[] var10 = Direction.values();
        int var11 = var10.length;

        for(int var12 = 0; var12 < var11; ++var12) {
            Direction direction = var10[var12];
            random.setSeed(42L);
            this.renderBakedItemQuads(matrices, vertices, model.getQuads((BlockState)null, direction, random), stack, light, overlay);
        }

        random.setSeed(42L);
        this.renderBakedItemQuads(matrices, vertices, model.getQuads((BlockState)null, (Direction)null, random), stack, light, overlay);
    }
    @Shadow
    private void renderBakedItemQuads(MatrixStack matrices, VertexConsumer vertices, List<BakedQuad> quads, ItemStack stack, int light, int overlay) {
        boolean bl = !stack.isEmpty();
        MatrixStack.Entry entry = matrices.peek();
        Iterator var9 = quads.iterator();

        while(var9.hasNext()) {
            BakedQuad bakedQuad = (BakedQuad)var9.next();
            int i = -1;
            if (bl && bakedQuad.hasColor()) {
                i = this.colors.getColor(stack, bakedQuad.getColorIndex());
            }

            float f = (float)(i >> 16 & 255) / 255.0F;
            float g = (float)(i >> 8 & 255) / 255.0F;
            float h = (float)(i & 255) / 255.0F;
            vertices.quad(entry, bakedQuad, f, g, h, light, overlay);
        }

    }
}
