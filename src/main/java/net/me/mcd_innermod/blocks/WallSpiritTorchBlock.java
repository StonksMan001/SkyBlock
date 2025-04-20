package net.me.mcd_innermod.blocks;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class WallSpiritTorchBlock extends SpiritTorchBlock {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public WallSpiritTorchBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        Direction direction = state.get(FACING).getOpposite();
        double d = 0.27;
        double e = (double)pos.getX() + (double)0.5F + (random.nextDouble() - (double)0.5F) * 0.2 + 0.27 * (double)direction.getOffsetX();
        double f = (double)pos.getY() + 0.7 + (random.nextDouble() - (double)0.5F) * 0.2 + 0.22;
        double g = (double)pos.getZ() + (double)0.5F + (random.nextDouble() - (double)0.5F) * 0.2 + 0.27 * (double)direction.getOffsetZ();
        world.addParticle(new DustParticleEffect(Vec3d.unpackRgb(65343).toVector3f(), 1.0f), e, f, g, 0.0F, 0.0F, 0.0F);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return WallTorchBlock.getBoundingShape(state);
    }

    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return WallTorchBlock.canPlaceAt(world, pos, state.get(FACING));
    }
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = Blocks.WALL_TORCH.getPlacementState(ctx);
        return blockState == null ? null : this.getDefaultState().with(FACING, blockState.get(FACING));
    }
}
