package net.me.skyblock.blocks.skyblock;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShortPlantBlock;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class SnowyShortGrassBlock extends ShortPlantBlock {
    public SnowyShortGrassBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        if (floor.isIn(BlockTags.SNOW) && !floor.isOf(Blocks.SNOW)) {
            return true;
        } else {
            return super.canPlantOnTop(floor, world, pos);
        }
    }
}
