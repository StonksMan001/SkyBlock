package net.me.skyblock.api.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.me.skyblock.blocks_and_items.ModBlocks;
import net.me.skyblock.blocks_and_items.ModItems;
import net.minecraft.block.Blocks;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SUSPICIOUS_COARSE_DIRT, Blocks.COARSE_DIRT);
        addDrop(ModBlocks.ANT_JAM_BLOCK);
        addDrop(ModBlocks.ENDMERALD_BLOCK);
        addDrop(ModBlocks.VOID_BLOCK,ModItems.FYBERITE);
        addDrop(ModBlocks.ENDMERALD_ORE,oreDrops(ModBlocks.ENDMERALD_ORE, ModItems.ENDMERALD));

        addDrop(ModBlocks.BLUISHE_STEM);
        addDrop(ModBlocks.BLUISHE_HYPHAE);
        addDrop(ModBlocks.STRIPPED_BLUISHE_STEM);
        addDrop(ModBlocks.STRIPPED_BLUISHE_HYPHAE);
        addDrop(ModBlocks.BLUISHE_PLANKS);
        addDrop(ModBlocks.MOSSIER_OAK_PLANKS);
        addDrop(ModBlocks.MOSSIER_SPRUCE_PLANKS);
        addDrop(ModBlocks.APPLE_CRATE);
        addDrop(ModBlocks.CARROT_CRATE);
        addDrop(ModBlocks.BEETROOT_CRATE);
        addDrop(ModBlocks.POTATO_CRATE);
        addDrop(ModBlocks.GOLDEN_APPLE_CRATE);
        addDrop(ModBlocks.GOLDEN_CARROT_CRATE);
        addDrop(ModBlocks.SWEET_BERRY_SACK);
        addDrop(ModBlocks.GLOW_BERRY_SACK);
        addDrop(ModBlocks.GUNPOWDER_SACK);
        addDrop(ModBlocks.NETHER_WART_SACK);
        addDrop(ModBlocks.COCOA_BEANS_SACK);
        addDrop(ModBlocks.SUGAR_CANE_BLOCK);
        addDrop(ModBlocks.STICK_BLOCK);
        addDrop(ModBlocks.CACTUS_BLOCK);
        addDrop(ModBlocks.CHORUS_FRUIT_BLOCK);

        addDrop(ModBlocks.END_STAIRS);
        addDrop(ModBlocks.END_SLAB);
        addDrop(ModBlocks.BLUISHE_STAIRS);
        addDrop(ModBlocks.BLUISHE_SLAB);
        addDrop(ModBlocks.AZALEA_STAIRS);
        addDrop(ModBlocks.AZALEA_SLAB);
        addDrop(ModBlocks.ABYSS_JUNGLE_STAIRS);
        addDrop(ModBlocks.ABYSS_JUNGLE_SLAB);
        addDrop(ModBlocks.BLARU_STAIRS);
        addDrop(ModBlocks.BLARU_SLAB);
        addDrop(ModBlocks.FROZEN_STAIRS);
        addDrop(ModBlocks.FROZEN_SLAB);
        addDrop(ModBlocks.SLIMED_STAIRS);
        addDrop(ModBlocks.SLIMED_SLAB);
        addDrop(ModBlocks.VIGILANT_STAIRS);
        addDrop(ModBlocks.VIGILANT_SLAB);
        addDrop(ModBlocks.ABYSCULK_STAIRS);
        addDrop(ModBlocks.ABYSCULK_SLAB);
        addDrop(ModBlocks.BOG_SHROOM_STAIRS);
        addDrop(ModBlocks.BOG_SHROOM_SLAB);
        addDrop(ModBlocks.SAL_SHROOM_STAIRS);
        addDrop(ModBlocks.SAL_SHROOM_SLAB);
        addDrop(ModBlocks.CALLERY_STAIRS);
        addDrop(ModBlocks.CALLERY_SLAB);
        addDrop(ModBlocks.ANDESITE_PILLAR);
        addDrop(ModBlocks.GRANITE_PILLAR);
        addDrop(ModBlocks.DIORITE_PILLAR);

        oreDrops(ModBlocks.MOSSIER_OAK_PLANKS, Blocks.OAK_PLANKS.asItem());
        oreDrops(ModBlocks.MOSSIER_SPRUCE_PLANKS, Blocks.SPRUCE_PLANKS.asItem());
    }
}
