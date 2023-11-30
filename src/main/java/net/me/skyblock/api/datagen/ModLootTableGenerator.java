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
        addDrop(ModBlocks.SKYBLOCK__SUSPICIOUS_COARSE_DIRT, Blocks.COARSE_DIRT);
        addDrop(ModBlocks.SKYBLOCK__ANT_JAM_BLOCK);
        addDrop(ModBlocks.SP5__ENDMERALD_BLOCK);
        addDrop(ModBlocks.MCD__VOID_BLOCK);
        addDrop(ModBlocks.SP5__ENDMERALD_ORE,oreDrops(ModBlocks.SP5__ENDMERALD_ORE, ModItems.SP5__ENDMERALD));

        addDrop(ModBlocks.SP5__BLUISHE_STEM);
        addDrop(ModBlocks.SP5__BLUISHE_HYPHAE);
        addDrop(ModBlocks.SP5__STRIPPED_BLUISHE_STEM);
        addDrop(ModBlocks.SP5__STRIPPED_BLUISHE_HYPHAE);
        addDrop(ModBlocks.SP5__BLUISHE_PLANKS);
        addDrop(ModBlocks.MCD__MOSSIER_OAK_PLANKS);
        addDrop(ModBlocks.MCD__MOSSIER_SPRUCE_PLANKS);
        addDrop(ModBlocks.QUARK__APPLE_CRATE);
        addDrop(ModBlocks.QUARK__CARROT_CRATE);
        addDrop(ModBlocks.QUARK__BEETROOT_CRATE);
        addDrop(ModBlocks.QUARK__POTATO_CRATE);
        addDrop(ModBlocks.QUARK__GOLDEN_APPLE_CRATE);
        addDrop(ModBlocks.QUARK__GOLDEN_CARROT_CRATE);
        addDrop(ModBlocks.QUARK__SWEET_BERRY_SACK);
        addDrop(ModBlocks.QUARK__GLOW_BERRY_SACK);
        addDrop(ModBlocks.QUARK__GUNPOWDER_SACK);
        addDrop(ModBlocks.QUARK__NETHER_WART_SACK);
        addDrop(ModBlocks.QUARK__COCOA_BEANS_SACK);
        addDrop(ModBlocks.QUARK__SUGAR_CANE_BLOCK);
        addDrop(ModBlocks.QUARK__STICK_BLOCK);
        addDrop(ModBlocks.QUARK__CACTUS_BLOCK);
        addDrop(ModBlocks.QUARK__CHORUS_FRUIT_BLOCK);

        addDrop(ModBlocks.SP5__END_STAIRS);
        addDrop(ModBlocks.SP5__END_SLAB);
        addDrop(ModBlocks.SP5__BLUISHE_STAIRS);
        addDrop(ModBlocks.SP5__BLUISHE_SLAB);
        addDrop(ModBlocks.FLOGICAL__AZALEA_STAIRS);
        addDrop(ModBlocks.FLOGICAL__AZALEA_SLAB);
        addDrop(ModBlocks.ABYSS__ABYSS_JUNGLE_STAIRS);
        addDrop(ModBlocks.ABYSS__ABYSS_JUNGLE_SLAB);
        addDrop(ModBlocks.ABYSS__BLARU_STAIRS);
        addDrop(ModBlocks.ABYSS__BLARU_SLAB);
        addDrop(ModBlocks.ABYSS__FROZEN_STAIRS);
        addDrop(ModBlocks.ABYSS__FROZEN_SLAB);
        addDrop(ModBlocks.ABYSS__SLIMED_STAIRS);
        addDrop(ModBlocks.ABYSS__SLIMED_SLAB);
        addDrop(ModBlocks.ABYSS__VIGILANT_STAIRS);
        addDrop(ModBlocks.ABYSS__VIGILANT_SLAB);
        addDrop(ModBlocks.ABYSS__ABYSCULK_STAIRS);
        addDrop(ModBlocks.ABYSS__ABYSCULK_SLAB);
        addDrop(ModBlocks.ABYSS__BOG_SHROOM_STAIRS);
        addDrop(ModBlocks.ABYSS__BOG_SHROOM_SLAB);
        addDrop(ModBlocks.ABYSS__SAL_SHROOM_STAIRS);
        addDrop(ModBlocks.ABYSS__SAL_SHROOM_SLAB);
        addDrop(ModBlocks.DIGPEAR__CALLERY_STAIRS);
        addDrop(ModBlocks.DIGPEAR__CALLERY_SLAB);
        addDrop(ModBlocks.QUARK__ANDESITE_PILLAR);
        addDrop(ModBlocks.QUARK__GRANITE_PILLAR);
        addDrop(ModBlocks.QUARK__DIORITE_PILLAR);

        oreDrops(ModBlocks.MCD__MOSSIER_OAK_PLANKS, Blocks.OAK_PLANKS.asItem());
        oreDrops(ModBlocks.MCD__MOSSIER_SPRUCE_PLANKS, Blocks.SPRUCE_PLANKS.asItem());
    }
}
