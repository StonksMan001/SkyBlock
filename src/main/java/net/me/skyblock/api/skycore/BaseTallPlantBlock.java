package net.me.skyblock.api.skycore;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShortPlantBlock;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class BaseTallPlantBlock extends TallPlantBlock {
    public BaseTallPlantBlock(Settings settings, Block block) {
        super(settings);
        this.block = block;
    }
    public BaseTallPlantBlock(Settings settings, TagKey<Block> blockTagKey) {
        super(settings);
        this.blockTagKey = blockTagKey;
    }
    public TagKey<Block> blockTagKey;
    public Block block;
    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        if (block != null) {
            return floor.isOf(block);
        } else if (blockTagKey != null) {
            return floor.isIn(blockTagKey);
        } else {
            return false;
        }
    }
}
