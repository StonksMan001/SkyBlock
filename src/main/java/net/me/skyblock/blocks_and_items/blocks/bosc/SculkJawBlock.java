package net.me.skyblock.blocks_and_items.blocks.bosc;

import net.me.skyblock.SkyBlock;
import net.me.skyblock.blocks_and_items.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SculkBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.WardenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;


public class SculkJawBlock extends SculkBlock {
    public static final IntProperty TEETH_STATE = IntProperty.of("teeth_state", 0, 3);
    public static final BooleanProperty AGGROVATED = BooleanProperty.of("aggrovated");
    public static final BooleanProperty BL1 = BooleanProperty.of("bl1");
    public Block assimilation_block;
    public SculkJawBlock(Settings settings, Block block) {
        super(settings);
        this.setDefaultState(getDefaultState().with(TEETH_STATE, 0).with(AGGROVATED, false));
        this.assimilation_block = block;
    }
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TEETH_STATE, AGGROVATED, BL1);
    }
    @Override
    public boolean hasRandomTicks(BlockState state) {
        return true;
    }
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        world.setBlockState(pos, state.with(AGGROVATED, false));
        if (random.nextDouble() < 0.75f) {
            assimilateToNeighbour(world, pos);
        }
    }

    @Override
    public void onBlockBreakStart(BlockState state, World world, BlockPos pos, PlayerEntity player) {
        if (!world.isClient && world instanceof ServerWorld serverWorld) {
            BlockPos playerStandingOn = player.getBlockPos().down();
            if (world.getBlockState(playerStandingOn).isOf(assimilation_block)) {
                world.setBlockState(pos, assimilation_block.getDefaultState());
                world.setBlockState(playerStandingOn, this.asBlock().getDefaultState().with(AGGROVATED, true));
            } else {
                assimilateToNeighbour(serverWorld, pos);
                player.damage(serverWorld.getDamageSources().magic(), 3f);
            }
        }
    }

    public void assimilateToNeighbour(ServerWorld world, BlockPos pos) {
        java.util.Random random = new java.util.Random();
        int rand1 = random.nextInt(8);
        BlockPos[] blockPosArray1 = {
                pos.east(), pos.west(), pos.north(), pos.south(),
                pos.west().south(), pos.west().north(), pos.east().south(), pos.east().north()
        };
        BlockPos pos1 = blockPosArray1[rand1];
        if (world.getBlockState(pos1).isOf(assimilation_block)) {
            world.setBlockState(blockPosArray1[rand1], this.asBlock().getDefaultState());
            world.setBlockState(pos, assimilation_block.getDefaultState());
        }
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!world.isClient) {
            if (entity instanceof LivingEntity && !(entity instanceof WardenEntity)) {
                if (!world.getBlockState(pos).get(AGGROVATED)) {
                    entity.damage(world.getDamageSources().magic(), 2.0f);
                } else {
                    entity.damage(world.getDamageSources().magic(), 4.0f);
                }
            }
            if (entity instanceof ItemEntity) {
                entity.damage(world.getDamageSources().cactus(), 1f);
            }
            if (state.get(AGGROVATED)) {
                world.scheduleBlockTick(pos, state.getBlock(), 1);
            } else {
                world.scheduleBlockTick(pos, state.getBlock(), 2);
            }
            super.onSteppedOn(world, pos, state, entity);
        }
    }
    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        int teeth_state = state.get(TEETH_STATE);
        boolean bl1 = state.get(BL1);
        boolean aggro = state.get(AGGROVATED);
        int new_teeth_state;
        boolean new_bl1 = true;
        if (bl1) {
            if (teeth_state < 3) {
                new_teeth_state = teeth_state+1;
            } else {
                new_teeth_state = teeth_state;
                new_bl1 = false;
            }
        } else {
            if (teeth_state > 0) {
                new_teeth_state = teeth_state-1;
                new_bl1 = false;
            } else {
                new_teeth_state = teeth_state;
            }
        }
        BlockState new_state = state.with(TEETH_STATE, new_teeth_state).with(BL1, new_bl1);
        world.setBlockState(pos, new_state);
        if (new_teeth_state != 0) {
            if (aggro) {
                world.scheduleBlockTick(pos, new_state.getBlock(), 1);
            } else {
                world.scheduleBlockTick(pos, new_state.getBlock(), 2);
            }
        }
    }
}
