package net.me.skyblock.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.me.skyblock.block.ModBlocks;
import net.me.skyblock.item.ModItems;
import net.minecraft.block.Block;
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
    }
}
