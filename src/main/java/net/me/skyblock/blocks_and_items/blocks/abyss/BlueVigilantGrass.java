package net.me.skyblock.blocks_and_items.blocks.abyss;

import com.mojang.serialization.MapCodec;
import net.me.skyblock.blocks_and_items.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class BlueVigilantGrass extends PlantBlock {
    public static final MapCodec<BlueVigilantGrass> CODEC = createCodec(BlueVigilantGrass::new);
    @Override
    protected MapCodec<? extends PlantBlock> getCodec() {
        return CODEC;
    }

    public static final BooleanProperty LIT = BooleanProperty.of("lit");

    public BlueVigilantGrass(Settings settings) {
        super(settings);
    }
    protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player2, Hand hand, BlockHitResult hit) {

        if(!world.isClient() && hand == Hand.MAIN_HAND) {
            world.setBlockState(pos, state.cycle(LIT));
        }

        return super.onUse(state, world, pos, player2, hand, hit);
    }
    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(ModBlocks.ABYSS__BLARU_MOSS) || floor.isOf(ModBlocks.ABYSS__VIGILANT_MOSS) || super.canPlantOnTop(floor, world, pos);
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }
}