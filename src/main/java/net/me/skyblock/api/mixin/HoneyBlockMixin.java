package net.me.skyblock.api.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HoneyBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(HoneyBlock.class)
public abstract class HoneyBlockMixin extends Block {
    public HoneyBlockMixin(Settings settings) {
        super(settings);
    }
    @Shadow
    @Final
    @Mutable
    protected static final VoxelShape SHAPE = Block.createCuboidShape(1.0, 1.0, 1.0, 15.0, 15.0, 15.0);
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
