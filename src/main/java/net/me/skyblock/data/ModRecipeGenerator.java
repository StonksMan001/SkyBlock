package net.me.skyblock.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.me.skyblock.block.ModBlocks;
import net.me.skyblock.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
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
    }
}
