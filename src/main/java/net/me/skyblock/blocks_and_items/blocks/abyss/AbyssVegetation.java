package net.me.skyblock.blocks_and_items.blocks.abyss;

import com.mojang.serialization.MapCodec;
import net.me.skyblock.blocks_and_items.ModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class AbyssVegetation
        extends PlantBlock {
    public static final MapCodec<AbyssVegetation> CODEC = createCodec(AbyssVegetation::new);
    @Override
    protected MapCodec<? extends PlantBlock> getCodec() {
        return CODEC;
    }

    protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

    public AbyssVegetation(Settings settings) {
        super(settings);
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(ModBlocks.ABYSS__BLARU_MOSS) || floor.isOf(ModBlocks.ABYSS__VIGILANT_MOSS);
    }
}
