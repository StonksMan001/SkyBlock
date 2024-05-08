package net.me.skyblock.recipes;

import net.me.skyblock.api.ModTags;
import net.me.skyblock.blocks_and_items.ModBlocks;
import net.me.skyblock.blocks_and_items.ModItems;
import net.minecraft.inventory.RecipeInputInventory;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.recipe.book.CraftingRecipeCategory;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.world.World;

public class FirwoodMaceRecipe extends SpecialCraftingRecipe {

    public FirwoodMaceRecipe(CraftingRecipeCategory category) {
        super(category);
    }

    @Override
    public boolean matches(RecipeInputInventory inventory, World world) {
        int log_place = 0;
        int stick_place = 0;
        boolean leaves_exist = false;
        boolean can_craft = false;
        for(int i = 0; i < inventory.size(); ++i) {
            ItemStack stack = inventory.getStack(i);
            if (stack.isIn(ModTags.Items.SKYBLOCK__FIR_LOGS)) {
                    log_place = i;
            }
            if (stack.isOf(Items.STICK)) {
                stick_place = i;
            }
            if (
                    stack.isOf(ModBlocks.SKYBLOCK__FIR_LEAVES.asItem()) ||
                    stack.isOf(ModBlocks.SKYBLOCK__AUTUMN_FIR_LEAVES.asItem())
            ) {
                leaves_exist = true;
            }
        }
        if (inventory.size() == 8) {
            if ((log_place + 3 == stick_place) && leaves_exist) {
                can_craft = true;
            }
        } else if (inventory.size() == 3) {
            if ((log_place + 2 == stick_place) && leaves_exist) {
                can_craft = true;
            }
        }
        return can_craft;
    }

    @Override
    public ItemStack craft(RecipeInputInventory inventory, DynamicRegistryManager registryManager) {
        return null;
    }

    @Override
    public boolean fits(int width, int height) {
        return false;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return null;
    }
}
