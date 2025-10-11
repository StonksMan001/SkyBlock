package net.me.quark_innermod.content.automation.block;

import net.me.quark_innermod.content.automation.block_entity.ChuteBlockEntity;
import net.me.quark_innermod.content.automation.module.ChuteModule;
import net.me.quark_innermod.internal_zeta.org.ZetaBock;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ChuteBlock extends ZetaBock implements BlockEntityProvider {

    private static final VoxelShape INPUT_SHAPE = Block.createCuboidShape(0.0D, 10.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    private static final VoxelShape MIDDLE_SHAPE = Block.createCuboidShape(4.0D, 4.0D, 4.0D, 12.0D, 10.0D, 12.0D);
    private static final VoxelShape CHUTE_TOP_SHAPE = VoxelShapes.union(MIDDLE_SHAPE, INPUT_SHAPE);
    private static final VoxelShape DOWN_SHAPE = VoxelShapes.union(CHUTE_TOP_SHAPE, Block.createCuboidShape(6.0D, 0.0D, 6.0D, 10.0D, 4.0D, 10.0D));

    public static final BooleanProperty ENABLED = Properties.ENABLED;

    public ChuteBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(ENABLED, true));
    }

    @Override
    public @Nullable <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return createTickerHelper(type, ChuteModule.chuteBlockEntityType, ChuteBlockEntity::serverTick);
    }
    @Override
    public int getFlammabilityZeta() {
        return super.getFlammabilityZeta();
    }

    @Override
    public int getFireSpreadSpeedZeta() {
        return super.getFireSpreadSpeedZeta();
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        boolean flag = !world.isReceivingRedstonePower(pos);

        if (flag != state.get(ENABLED)) world.setBlockState(pos, state.with(ENABLED, flag), 2 | 4);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return DOWN_SHAPE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ENABLED);
    }

    @Override
    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        return false;
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ChuteBlockEntity(pos, state);
    }
}
