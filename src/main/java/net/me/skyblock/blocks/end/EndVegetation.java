package net.me.skyblock.blocks.end;

import com.mojang.serialization.MapCodec;
import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class EndVegetation
        extends PlantBlock {
    public static final MapCodec<EndVegetation> CODEC = createCodec(EndVegetation::new);
    @Override
    protected MapCodec<? extends PlantBlock> getCodec() {
        return CODEC;
    }
    protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

    public EndVegetation(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(SkyBlockRegistries.BlockRegistries.SP5__END_GRASS) || floor.isOf(SkyBlockRegistries.BlockRegistries.SP5__BLUISHE_GRASS);
    }
}
