package net.me.skyblock.blocks_and_items.blocks.end;

import com.mojang.serialization.MapCodec;
import net.me.skyblock.blocks_and_items.ModBlocks;
import net.me.skyblock.blocks_and_items.blocks.abyss.AbyssVegetation;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.client.render.DimensionEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class EndFlower
        extends PlantBlock {
    public static final MapCodec<EndFlower> CODEC = createCodec(EndFlower::new);
    @Override
    protected MapCodec<? extends PlantBlock> getCodec() {
        return CODEC;
    }
    protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 5.0, 16.0);

    public EndFlower(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(ModBlocks.SP5__END_GRASS) || floor.isOf(ModBlocks.SP5__BLUISHE_GRASS);
    }
}
