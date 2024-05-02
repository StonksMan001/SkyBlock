package net.me.skyblock.api.skycore;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShortPlantBlock;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class BaseShortPlantBlock extends ShortPlantBlock {
    public BaseShortPlantBlock(Settings settings) {
        super(settings);
    }
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
        if (block != null) {
            return floor.isOf(block);
        } else if (blockTagKey != null) {
            return floor.isIn(blockTagKey);
        } else {
            return super.canPlantOnTop(floor, world, pos);
        }
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return false;
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return false;
    }
}
