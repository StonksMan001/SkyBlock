package net.me.skyblock.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.me.skyblock.block.ModBlocks;
import net.me.skyblock.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModBlocks.ENDMERALD_BLOCK), RecipeCategory.MISC, ModItems.ENDMERALD,
                0.7f, 300, "fyberite");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ENDMERALD, RecipeCategory.MISC, ModBlocks.ENDMERALD_ORE);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.APPLE, RecipeCategory.MISC, ModBlocks.APPLE_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BEETROOT, RecipeCategory.MISC, ModBlocks.BEETROOT_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CARROT, RecipeCategory.MISC, ModBlocks.CARROT_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.POTATO, RecipeCategory.MISC, ModBlocks.POTATO_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GOLDEN_APPLE, RecipeCategory.MISC, ModBlocks.GOLDEN_APPLE_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GOLDEN_CARROT, RecipeCategory.MISC, ModBlocks.GOLDEN_CARROT_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SWEET_BERRIES, RecipeCategory.MISC, ModBlocks.SWEET_BERRY_SACK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GLOW_BERRIES, RecipeCategory.MISC, ModBlocks.GLOW_BERRY_SACK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.COCOA_BEANS, RecipeCategory.MISC, ModBlocks.COCOA_BEANS_SACK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GUNPOWDER, RecipeCategory.MISC, ModBlocks.GUNPOWDER_SACK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.NETHER_WART, RecipeCategory.MISC, ModBlocks.NETHER_WART_SACK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.STICK, RecipeCategory.MISC, ModBlocks.STICK_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SUGAR_CANE, RecipeCategory.MISC, ModBlocks.SUGAR_CANE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CACTUS, RecipeCategory.MISC, ModBlocks.CACTUS_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CHORUS_FRUIT, RecipeCategory.MISC, ModBlocks.CHORUS_FRUIT_BLOCK);
    }
}
