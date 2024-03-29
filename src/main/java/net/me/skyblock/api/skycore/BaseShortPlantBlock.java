package net.me.skyblock.api.skycore;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShortPlantBlock;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class BaseShortPlantBlock extends ShortPlantBlock {
    public BaseShortPlantBlock(Settings settings, Block block) {
        super(settings);
        this.block = block;
    }
    public BaseShortPlantBlock(Settings settings, TagKey<Block> blockTagKey) {
        super(settings);
        this.blockTagKey = blockTagKey;
    }
    public TagKey<Block> blockTagKey;
    public Block block;
    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(block) || floor.isIn(blockTagKey);
    }
}
