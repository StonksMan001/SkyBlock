package net.me.quark_innermod.content.automation.block;

import net.me.quark_innermod.content.automation.block_entity.EnderWatcherBlockEntity;
import net.me.quark_innermod.content.automation.module.EnderWatcherModule;
import net.me.quark_innermod.internal_zeta.org.ZetaBock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class EnderWatcherBlock extends ZetaBock implements BlockEntityProvider {
    public static final BooleanProperty WATCHED = BooleanProperty.of("watched");
    public static final IntProperty POWER = Properties.POWER;

    public EnderWatcherBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState()
                .with(WATCHED, false)
                .with(POWER, 0));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATCHED, POWER);
    }

    @Override
    public boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    @Override
    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return state.get(POWER);
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new EnderWatcherBlockEntity(pos, state);
    }

    @Override
    public @Nullable <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return createTickerHelper(type, EnderWatcherModule.enderWatcherBlockEntityType, EnderWatcherBlockEntity::serverTick);
    }
}
