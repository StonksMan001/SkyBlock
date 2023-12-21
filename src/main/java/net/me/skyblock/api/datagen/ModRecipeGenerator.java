package net.me.skyblock.api.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.me.skyblock.blocks_and_items.ModBlocks;
import net.me.skyblock.blocks_and_items.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, List.of(ModBlocks.SP5__ENDMERALD_BLOCK), RecipeCategory.MISC, ModItems.SP5__ENDMERALD,
                0.7f, 300, "fyberite");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.SP5__ENDMERALD, RecipeCategory.MISC, ModBlocks.SP5__ENDMERALD_ORE);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.APPLE, RecipeCategory.MISC, ModBlocks.QUARK__APPLE_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BEETROOT, RecipeCategory.MISC, ModBlocks.QUARK__BEETROOT_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CARROT, RecipeCategory.MISC, ModBlocks.QUARK__CARROT_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.POTATO, RecipeCategory.MISC, ModBlocks.QUARK__POTATO_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GOLDEN_APPLE, RecipeCategory.MISC, ModBlocks.QUARK__GOLDEN_APPLE_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GOLDEN_CARROT, RecipeCategory.MISC, ModBlocks.QUARK__GOLDEN_CARROT_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SWEET_BERRIES, RecipeCategory.MISC, ModBlocks.QUARK__SWEET_BERRY_SACK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GLOW_BERRIES, RecipeCategory.MISC, ModBlocks.QUARK__GLOW_BERRY_SACK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.COCOA_BEANS, RecipeCategory.MISC, ModBlocks.QUARK__COCOA_BEAN_SACK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GUNPOWDER, RecipeCategory.MISC, ModBlocks.QUARK__GUNPOWDER_SACK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.NETHER_WART, RecipeCategory.MISC, ModBlocks.QUARK__NETHER_WART_SACK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.STICK, RecipeCategory.MISC, ModBlocks.QUARK__STICK_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SUGAR_CANE, RecipeCategory.MISC, ModBlocks.QUARK__SUGAR_CANE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CACTUS, RecipeCategory.MISC, ModBlocks.QUARK__CACTUS_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CHORUS_FRUIT, RecipeCategory.MISC, ModBlocks.QUARK__CHORUS_FRUIT_BLOCK);
    }
}
