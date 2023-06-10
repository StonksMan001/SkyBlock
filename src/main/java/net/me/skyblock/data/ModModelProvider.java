package net.me.skyblock.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.me.skyblock.block.ModBlocks;
import net.me.skyblock.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import software.bernie.shadowed.eliotlash.mclib.math.functions.classic.Mod;

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

        blockStateModelGenerator.registerLog(ModBlocks.BLUISHE_STEM).log(ModBlocks.BLUISHE_STEM).wood(ModBlocks.BLUISHE_HYPHAE);
        blockStateModelGenerator.registerLog(ModBlocks.BLUISHE_LIGHT_STEM).log(ModBlocks.BLUISHE_LIGHT_STEM).wood(ModBlocks.BLUISHE_LIGHT_HYPHAE);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BLUISHE_STEM).log(ModBlocks.STRIPPED_BLUISHE_STEM).wood(ModBlocks.STRIPPED_BLUISHE_HYPHAE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUISHE_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.BLARU_LOG).log(ModBlocks.BLARU_LOG).wood(ModBlocks.BLARU_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BLARU_LOG).log(ModBlocks.STRIPPED_BLARU_LOG).wood(ModBlocks.STRIPPED_BLARU_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLARU_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.FROZEN_LOG).log(ModBlocks.FROZEN_LOG).wood(ModBlocks.FROZEN_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_FROZEN_LOG).log(ModBlocks.STRIPPED_FROZEN_LOG).wood(ModBlocks.STRIPPED_FROZEN_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FROZEN_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.SLIMED_LOG).log(ModBlocks.SLIMED_LOG).wood(ModBlocks.SLIMED_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_SLIMED_LOG).log(ModBlocks.STRIPPED_SLIMED_LOG).wood(ModBlocks.STRIPPED_SLIMED_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SLIMED_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.VIGILANT_LOG).log(ModBlocks.VIGILANT_LOG).wood(ModBlocks.VIGILANT_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_VIGILANT_LOG).log(ModBlocks.STRIPPED_VIGILANT_LOG).wood(ModBlocks.STRIPPED_VIGILANT_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VIGILANT_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.ABYSCULK_LOG).log(ModBlocks.ABYSCULK_LOG).wood(ModBlocks.ABYSCULK_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ABYSCULK_LOG).log(ModBlocks.STRIPPED_ABYSCULK_LOG).wood(ModBlocks.STRIPPED_ABYSCULK_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ABYSCULK_PLANKS);

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

        blockStateModelGenerator.registerLog(ModBlocks.CALLERY_LOG).log(ModBlocks.CALLERY_LOG).wood(ModBlocks.CALLERY_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_CALLERY_LOG).log(ModBlocks.STRIPPED_CALLERY_LOG).wood(ModBlocks.STRIPPED_CALLERY_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CALLERY_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.STICK_BLOCK).log(ModBlocks.STICK_BLOCK);
        blockStateModelGenerator.registerLog(ModBlocks.SUGAR_CANE_BLOCK).log(ModBlocks.SUGAR_CANE_BLOCK);
        blockStateModelGenerator.registerLog(ModBlocks.CACTUS_BLOCK).log(ModBlocks.CACTUS_BLOCK);
        blockStateModelGenerator.registerLog(ModBlocks.CHORUS_FRUIT_BLOCK).log(ModBlocks.CHORUS_FRUIT_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.FYBERITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDMERALD, Models.GENERATED);
    }
}
