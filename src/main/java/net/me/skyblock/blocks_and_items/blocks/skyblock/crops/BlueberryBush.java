package net.me.skyblock.blocks_and_items.blocks.skyblock.crops;

import net.me.skyblock.blocks_and_items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class BlueberryBush extends LeavesBlock {
    public static final BooleanProperty HAS_BERRIES = BooleanProperty.of("has_berries");
    public BlueberryBush(Settings settings) {
        super(settings);
        this.setDefaultState(getDefaultState().with(HAS_BERRIES, false));
    }
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(HAS_BERRIES);
    }
    @Override
    public boolean hasRandomTicks(BlockState state) {
        return true;
    }
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        boolean bl1 = false;
        BlockPos[] posArray = {pos.up(), pos.down(), pos.north(), pos.south(), pos.east(), pos.west()};
        for (BlockPos pos1: posArray) {
            if (!world.getBlockState(pos1).isFullCube(world, pos1)) {
                bl1 = true;
            }
        }
        if ((random.nextInt(20) == 0) && !state.get(HAS_BERRIES) && bl1) {
            world.setBlockState(pos, state.with(HAS_BERRIES, true));
        }
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        boolean bl = state.get(HAS_BERRIES);
        if (!bl) {
            return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
        } else {
            int j = 1 + world.random.nextInt(2);
            dropStack(world, pos, new ItemStack(ModItems.SKYBLOCK__BLUEBERRIES, j + 1));
            world.playSound((PlayerEntity)null, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
            BlockState blockState = state.with(HAS_BERRIES, false);
            world.setBlockState(pos, blockState, 2);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, blockState));
            return ItemActionResult.success(world.isClient);
        }
    }
}
