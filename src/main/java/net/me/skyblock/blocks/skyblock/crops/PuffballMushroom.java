package net.me.skyblock.blocks.skyblock.crops;

import net.me.skyblock.api.skycore.BaseShortPlantBlock;
import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class PuffballMushroom extends BaseShortPlantBlock {
    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    public static final IntProperty AGE = IntProperty.of("age", 0, 6);
    public static final int MAX_AGE = 6;
    private static final VoxelShape[] AGE_TO_SHAPE = new VoxelShape[]{
            Block.createCuboidShape(7.0, 1.0, 7.0, 9.0, 3.0, 9.0),
            Block.createCuboidShape(6.0, 2.0, 6.0, 10.0, 6.0, 10.0),
            Block.createCuboidShape(5.0, 2.0, 5.0, 11.0, 8.0, 11.0),
            Block.createCuboidShape(4.0, 2.0, 4.0, 12.0, 10.0, 12.0),
            Block.createCuboidShape(3.0, 2.0, 3.0, 13.0, 12.0, 13.0),
            Block.createCuboidShape(2.0, 2.0, 2.0, 14.0, 14.0, 14.0),
            Block.createCuboidShape(1.0, 1.0, 1.0, 15.0, 15.0, 15.0)};

    public PuffballMushroom(Settings settings) {
        super(settings);
    }

    public int getAge(BlockState state) {
        return state.get(this.getAgeProperty());
    }
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        int soil_quality = world.getGameRules().getInt(SkyBlockRegistries.GameRuleRegistries.SKYBLOCK__RARE_MUSHROOM_GROWTH_CHANCE);
        BlockState state1 = world.getBlockState(pos.down());
        if (state1.isOf(Blocks.PODZOL)) soil_quality = (int)((float)soil_quality / 5f * 2f);
        else if (state1.isOf(Blocks.ROOTED_DIRT)) soil_quality = (int)((float)soil_quality / 5f * 3f);
        else if (state1.isOf(Blocks.COARSE_DIRT) || state1.isIn(SkyBlockRegistries.TagRegistries.Blocks.SKYBLOCK__SPORE_PLANTER_BOXES)) soil_quality = (int)((float)soil_quality / 2f);
        else if (state1.isOf(Blocks.MYCELIUM)) soil_quality = (int)((float)soil_quality / 3f);
        else if (state1.isOf(Blocks.MOSS_BLOCK)) soil_quality = (int)((float)soil_quality / 3f * 2f);
        if (soil_quality < 1) soil_quality = 1;
        int i = this.getAge(state);
        if (i <= this.getMaxAge()) {
            if (random.nextInt(soil_quality) == 0) {
                if (i == this.getMaxAge()) {
                    if (world.getBlockState(pos.down()).isIn(SkyBlockRegistries.TagRegistries.Blocks.SKYBLOCK__SPORE_PLANTER_BOXES)) world.setBlockState(pos, SkyBlockRegistries.BlockRegistries.SKYBLOCK__PUFFBALL_MUSHROOM_BLOCK.getDefaultState().with(PuffballMushroomBlock.NATURAL, false), 2);
                    else world.setBlockState(pos, SkyBlockRegistries.BlockRegistries.SKYBLOCK__PUFFBALL_MUSHROOM_BLOCK.getDefaultState().with(PuffballMushroomBlock.NATURAL, true), 2);
                }
                else world.setBlockState(pos, this.withAge(i + 1), 2);
            }
        }
    }
    public BlockState withAge(int age) {
        return (BlockState)this.getDefaultState().with(this.getAgeProperty(), age);
    }
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return true;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return AGE_TO_SHAPE[this.getAge(state)];
    }
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (this.getAge(state) > 1) return AGE_TO_SHAPE[this.getAge(state)];
        else return VoxelShapes.empty();
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }
}
