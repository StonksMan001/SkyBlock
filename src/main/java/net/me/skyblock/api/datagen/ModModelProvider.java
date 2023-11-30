package net.me.skyblock.api.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.me.skyblock.blocks_and_items.ModBlocks;
import net.me.skyblock.blocks_and_items.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MCD__VOID_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ABYSS__INFUSED_MAGMA);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SP5__ENDMERALD_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SP5__ENDMERALD_ORE);
        blockStateModelGenerator.registerTintableCross(ModBlocks.ABYSS__BLARU_GRASS, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(ModBlocks.SP5__END_STEM).log(ModBlocks.SP5__END_STEM).wood(ModBlocks.SP5__END_HYPHAE);
        blockStateModelGenerator.registerLog(ModBlocks.SP5__STRIPPED_END_STEM).log(ModBlocks.SP5__STRIPPED_END_STEM).wood(ModBlocks.SP5__STRIPPED_END_HYPHAE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SP5__END_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.SP5__BLUISHE_STEM).log(ModBlocks.SP5__BLUISHE_STEM).wood(ModBlocks.SP5__BLUISHE_HYPHAE);
        blockStateModelGenerator.registerLog(ModBlocks.SP5__BLUISHE_LIGHT_STEM).log(ModBlocks.SP5__BLUISHE_LIGHT_STEM).wood(ModBlocks.SP5__BLUISHE_LIGHT_HYPHAE);
        blockStateModelGenerator.registerLog(ModBlocks.SP5__STRIPPED_BLUISHE_STEM).log(ModBlocks.SP5__STRIPPED_BLUISHE_STEM).wood(ModBlocks.SP5__STRIPPED_BLUISHE_HYPHAE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SP5__BLUISHE_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.ABYSS__BLARU_LOG).log(ModBlocks.ABYSS__BLARU_LOG).wood(ModBlocks.ABYSS__BLARU_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.ABYSS__STRIPPED_BLARU_LOG).log(ModBlocks.ABYSS__STRIPPED_BLARU_LOG).wood(ModBlocks.ABYSS__STRIPPED_BLARU_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ABYSS__BLARU_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.ABYSS__FROZEN_LOG).log(ModBlocks.ABYSS__FROZEN_LOG).wood(ModBlocks.ABYSS__FROZEN_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.ABYSS__STRIPPED_FROZEN_LOG).log(ModBlocks.ABYSS__STRIPPED_FROZEN_LOG).wood(ModBlocks.ABYSS__STRIPPED_FROZEN_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ABYSS__FROZEN_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.ABYSS__SLIMED_LOG).log(ModBlocks.ABYSS__SLIMED_LOG).wood(ModBlocks.ABYSS__SLIMED_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.ABYSS__STRIPPED_SLIMED_LOG).log(ModBlocks.ABYSS__STRIPPED_SLIMED_LOG).wood(ModBlocks.ABYSS__STRIPPED_SLIMED_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ABYSS__SLIMED_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.ABYSS__VIGILANT_LOG).log(ModBlocks.ABYSS__VIGILANT_LOG).wood(ModBlocks.ABYSS__VIGILANT_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.ABYSS__STRIPPED_VIGILANT_LOG).log(ModBlocks.ABYSS__STRIPPED_VIGILANT_LOG).wood(ModBlocks.ABYSS__STRIPPED_VIGILANT_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ABYSS__VIGILANT_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.ABYSS__ABYSCULK_LOG).log(ModBlocks.ABYSS__ABYSCULK_LOG).wood(ModBlocks.ABYSS__ABYSCULK_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.ABYSS__STRIPPED_ABYSCULK_LOG).log(ModBlocks.ABYSS__STRIPPED_ABYSCULK_LOG).wood(ModBlocks.ABYSS__STRIPPED_ABYSCULK_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ABYSS__ABYSCULK_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.ABYSS__BOG_SHROOM_LOG).log(ModBlocks.ABYSS__BOG_SHROOM_LOG).wood(ModBlocks.ABYSS__BOG_SHROOM_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.ABYSS__STRIPPED_BOG_SHROOM_LOG).log(ModBlocks.ABYSS__STRIPPED_BOG_SHROOM_LOG).wood(ModBlocks.ABYSS__STRIPPED_BOG_SHROOM_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ABYSS__BOG_SHROOM_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.ABYSS__SAL_SHROOM_LOG).log(ModBlocks.ABYSS__SAL_SHROOM_LOG).wood(ModBlocks.ABYSS__SAL_SHROOM_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.ABYSS__STRIPPED_SAL_SHROOM_LOG).log(ModBlocks.ABYSS__STRIPPED_SAL_SHROOM_LOG).wood(ModBlocks.ABYSS__STRIPPED_SAL_SHROOM_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ABYSS__SAL_SHROOM_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.ABYSS__ABYSS_JUNGLE_LOG).log(ModBlocks.ABYSS__ABYSS_JUNGLE_LOG).wood(ModBlocks.ABYSS__ABYSS_JUNGLE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.ABYSS__STRIPPED_ABYSS_JUNGLE_LOG).log(ModBlocks.ABYSS__STRIPPED_ABYSS_JUNGLE_LOG).wood(ModBlocks.ABYSS__STRIPPED_ABYSS_JUNGLE_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ABYSS__ABYSS_JUNGLE_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.FLOGICAL__AZALEA_LOG).log(ModBlocks.FLOGICAL__AZALEA_LOG).wood(ModBlocks.FLOGICAL__AZALEA_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.FLOGICAL__STRIPPED_AZALEA_LOG).log(ModBlocks.FLOGICAL__STRIPPED_AZALEA_LOG).wood(ModBlocks.FLOGICAL__STRIPPED_AZALEA_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FLOGICAL__AZALEA_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.DIGPEAR__CALLERY_LOG).log(ModBlocks.DIGPEAR__CALLERY_LOG).wood(ModBlocks.DIGPEAR__CALLERY_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.DIGPEAR__STRIPPED_CALLERY_LOG).log(ModBlocks.DIGPEAR__STRIPPED_CALLERY_LOG).wood(ModBlocks.DIGPEAR__STRIPPED_CALLERY_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIGPEAR__CALLERY_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.QUARK__STICK_BLOCK).log(ModBlocks.QUARK__STICK_BLOCK);
        blockStateModelGenerator.registerLog(ModBlocks.QUARK__SUGAR_CANE_BLOCK).log(ModBlocks.QUARK__SUGAR_CANE_BLOCK);
        blockStateModelGenerator.registerLog(ModBlocks.QUARK__CACTUS_BLOCK).log(ModBlocks.QUARK__CACTUS_BLOCK);
        blockStateModelGenerator.registerLog(ModBlocks.QUARK__CHORUS_FRUIT_BLOCK).log(ModBlocks.QUARK__CHORUS_FRUIT_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SKYBLOCK__FYBERITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SP5__ENDMERALD, Models.GENERATED);
    }
}
