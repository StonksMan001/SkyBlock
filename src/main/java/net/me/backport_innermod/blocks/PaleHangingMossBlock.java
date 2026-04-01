package net.me.backport_innermod.blocks;

import com.mojang.serialization.MapCodec;
import net.me.backport_innermod.registries.BP_Blocks;
import net.me.backport_innermod.registries.BP_Items;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class PaleHangingMossBlock {
    private static final VoxelShape SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

    public static class Body extends AbstractPlantBlock implements Fertilizable{
        public static final MapCodec<Body> CODEC = createCodec(Body::new);

        public Body(AbstractBlock.Settings settings) {
            super(settings, Direction.DOWN, SHAPE, false);
            this.setDefaultState(this.stateManager.getDefaultState());
        }
        public MapCodec<Body> getCodec() {
            return CODEC;
        }
        protected AbstractPlantStemBlock getStem() {
            return (AbstractPlantStemBlock)BP_Blocks.BP__PALE_HANGING_MOSS;
        }
        public ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state) {
            return new ItemStack(BP_Items.BP__PALE_HANGING_MOSS);
        }
        public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
            return true;
        }
        @Override
        protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
            if (world.getBlockState(pos.offset(this.growthDirection.getOpposite())).getBlock() instanceof LeavesBlock) return true;
            return super.canPlaceAt(state, world, pos);
        }
    }
    public static class Head extends AbstractPlantStemBlock {
        public static final MapCodec<Head> CODEC = createCodec(Head::new);

        public Head(AbstractBlock.Settings settings) {
            super(settings, Direction.DOWN, SHAPE, false, 0.1);
            this.setDefaultState(this.stateManager.getDefaultState().with(AGE, 0));
        }
        public MapCodec<Head> getCodec() {
            return CODEC;
        }
        protected int getGrowthLength(Random random) {
            return 1;
        }
        protected boolean chooseStemState(BlockState state) {
            return state.isAir();
        }
        protected Block getPlant() {
            return BP_Blocks.BP__PALE_HANGING_MOSS_PLANT;
        }
        public ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state) {
            return new ItemStack(BP_Items.BP__PALE_HANGING_MOSS);
        }
        public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
            return true;
        }
        @Override
        protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
            if (world.getBlockState(pos.offset(this.growthDirection.getOpposite())).getBlock() instanceof LeavesBlock) return true;
            return super.canPlaceAt(state, world, pos);
        }
    }
}
