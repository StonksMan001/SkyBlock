package net.me.skyblock.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.me.skyblock.block.ModBlocks;
import net.me.skyblock.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VOID_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.INFUSED_MAGMA);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDMERALD_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDMERALD_ORE);
        blockStateModelGenerator.registerTintableCross(ModBlocks.BLARU_GRASS, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(ModBlocks.END_STEM).log(ModBlocks.END_STEM).wood(ModBlocks.END_HYPHAE);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_END_STEM).log(ModBlocks.STRIPPED_END_STEM).wood(ModBlocks.STRIPPED_END_HYPHAE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.END_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.BLARU_LOG).log(ModBlocks.BLARU_LOG).wood(ModBlocks.BLARU_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BLARU_LOG).log(ModBlocks.STRIPPED_BLARU_LOG).wood(ModBlocks.STRIPPED_BLARU_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLARU_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.FROZEN_LOG).log(ModBlocks.FROZEN_LOG).wood(ModBlocks.FROZEN_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_FROZEN_LOG).log(ModBlocks.STRIPPED_FROZEN_LOG).wood(ModBlocks.STRIPPED_FROZEN_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FROZEN_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.SLIMED_LOG).log(ModBlocks.SLIMED_LOG).wood(ModBlocks.SLIMED_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_SLIMED_LOG).log(ModBlocks.STRIPPED_SLIMED_LOG).wood(ModBlocks.STRIPPED_SLIMED_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SLIMED_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.BOG_SHROOM_LOG).log(ModBlocks.BOG_SHROOM_LOG).wood(ModBlocks.BOG_SHROOM_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BOG_SHROOM_LOG).log(ModBlocks.STRIPPED_BOG_SHROOM_LOG).wood(ModBlocks.STRIPPED_BOG_SHROOM_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BOG_SHROOM_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.SAL_SHROOM_LOG).log(ModBlocks.SAL_SHROOM_LOG).wood(ModBlocks.SAL_SHROOM_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_SAL_SHROOM_LOG).log(ModBlocks.STRIPPED_SAL_SHROOM_LOG).wood(ModBlocks.STRIPPED_SAL_SHROOM_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SAL_SHROOM_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.ABYSS_JUNGLE_LOG).log(ModBlocks.ABYSS_JUNGLE_LOG).wood(ModBlocks.ABYSS_JUNGLE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ABYSS_JUNGLE_LOG).log(ModBlocks.STRIPPED_ABYSS_JUNGLE_LOG).wood(ModBlocks.STRIPPED_ABYSS_JUNGLE_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ABYSS_JUNGLE_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.AZALEA_LOG).log(ModBlocks.AZALEA_LOG).wood(ModBlocks.AZALEA_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_AZALEA_LOG).log(ModBlocks.STRIPPED_AZALEA_LOG).wood(ModBlocks.STRIPPED_AZALEA_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AZALEA_PLANKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.FYBERITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDMERALD, Models.GENERATED);
    }
}
