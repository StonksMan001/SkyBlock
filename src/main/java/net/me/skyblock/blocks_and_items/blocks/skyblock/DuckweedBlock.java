package net.me.skyblock.blocks_and_items.blocks.skyblock;

import com.mojang.serialization.MapCodec;
import net.me.skyblock.blocks_and_items.blocks.abyss.AbyssVegetation;
import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

public class DuckweedBlock extends PlantBlock {
    public static final MapCodec<DuckweedBlock> CODEC = createCodec(DuckweedBlock::new);
    @Override
    protected MapCodec<? extends PlantBlock> getCodec() {
        return CODEC;
    }
    protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);

    public DuckweedBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        FluidState fluidState = world.getFluidState(pos.down());
        FluidState fluidState2 = world.getFluidState(pos);
        return (fluidState.getFluid() == Fluids.WATER || state.getBlock() instanceof IceBlock) && fluidState2.getFluid() == Fluids.EMPTY;
    }
    // rendering
    @Override
    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }
}
