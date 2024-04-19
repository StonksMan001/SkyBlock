package net.me.skyblock.blocks_and_items.blocks.skyblock;

import net.me.skyblock.api.skycore.ComplexBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class CompressedSteelBlock extends ComplexBlock {
    public static final BooleanProperty IS_PULSING = BooleanProperty.of("is_pulsing");
    public static final IntProperty PULSE_TYPE = IntProperty.of("pulse_type", 1, 2);
    public CompressedSteelBlock(Settings settings) {
        super(settings);
        this.setDefaultState(getDefaultState().with(IS_PULSING, false));
    }
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(IS_PULSING, PULSE_TYPE);
    }
    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (state.get(IS_PULSING)) {
            world.setBlockState(pos, state.with(IS_PULSING, false));
        }
    }
    @Override
    public void onExplosionImpacted(BlockState state, World world, BlockPos pos) {
        world.setBlockState(pos, state.with(IS_PULSING, true).with(PULSE_TYPE, 2)); // red
        world.scheduleBlockTick(pos, state.getBlock(), 5);
    }

    @Override
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        entity.handleFallDamage(fallDistance, 1.9F, world.getDamageSources().fall());
        if (fallDistance > 2) {
            world.setBlockState(pos, state.with(IS_PULSING, true).with(PULSE_TYPE, 1)); // blue
            world.scheduleBlockTick(pos, state.getBlock(), 5);
        }
    }
}
