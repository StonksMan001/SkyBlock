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
    }
}
