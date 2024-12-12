package net.me.skyblock.blocks.skyblock.crops;

import net.me.skyblock.registries.v1.SkyBlockRegistries;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemConvertible;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

public class ChilliPepperBlock extends CropBlock {
    public static final int MAX_AGE = 2;
    public static final IntProperty AGE = Properties.AGE_2;
    public static final BooleanProperty GOLDEN = BooleanProperty.of("golden_crop");
    private static final VoxelShape[] AGE_TO_SHAPE = new VoxelShape[]{
            Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 8.0, 14.0),
            Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 10.0, 14.0),
            Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 12.0, 14.0)};
    public ChilliPepperBlock(Settings settings) {
        super(settings);
        this.setDefaultState(getDefaultState().with(GOLDEN, false));
    }
    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE, GOLDEN);
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return false;
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public ItemConvertible getSeedsItem() {
        return SkyBlockRegistries.ItemRegistries.SKYBLOCK__CHILLI_PEPPER_SEEDS;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getBaseLightLevel(pos, 0) >= 9) {
            int i = this.getAge(state);
            if (i < this.getMaxAge()) {
                float f = getAvailableMoisture(this, world, pos);
                if (random.nextInt((int)(25.0F / f) + 1) == 0) {
                    if (random.nextInt(2) == 0 && i == 0) world.setBlockState(pos, this.withAge(i + 1), 2);
                    if (random.nextInt(4) == 0 && i == 1) {
                        if (random.nextInt(world.getGameRules().getInt(SkyBlockRegistries.GameRuleRegistries.SKYBLOCK__GOLDEN_CROP_GROWTH_CHANCE)) == 0) {
                            world.setBlockState(pos, this.withAge(i + 1).with(GOLDEN, true), 2);
                        } else world.setBlockState(pos, this.withAge(i + 1), 2);
                    }
                }
            }
        }
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return AGE_TO_SHAPE[this.getAge(state)];
    }
}
