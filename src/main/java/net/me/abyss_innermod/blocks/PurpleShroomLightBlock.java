package net.me.abyss_innermod.blocks;

import net.me.skycore_supermod.registries.SkyCore;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.TntEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

//TODO
public class PurpleShroomLightBlock extends Block {
    //public static final BooleanProperty ACTIVATED = BooleanProperty.of("activated");
    public PurpleShroomLightBlock(Settings settings) {
        super(settings);
        //this.setDefaultState(this.getDefaultState().with(ACTIVATED, false));
    }

    /*@Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ACTIVATED);
    }

    @Override
    protected void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        super.neighborUpdate(state, world, pos, sourceBlock, sourcePos, notify);
        if (state.get(ACTIVATED) && isObsidian(world.getBlockState(sourcePos))) {
            world.removeBlock(pos, false);
            Entity fakeTnt = new TntEntity(world, pos.getX(), pos.getY(), pos.getZ(), null);
            world.createExplosion(fakeTnt, pos.getX(), pos.getY(), pos.getZ(), 10f, World.ExplosionSourceType.BLOCK);
        }
    }*/
    public boolean isObsidian(BlockState blockState) {
        return blockState.isOf(Blocks.OBSIDIAN) ||
                blockState.isOf(Blocks.CRYING_OBSIDIAN) ||
                blockState.getBlock().getName().getString().equals("betternether:weeping_obsidian") ||
                blockState.getBlock().getName().getString().equals("betternether:obsidian_bricks") ||
                blockState.getBlock().getName().getString().equals("betternether:obsidian_bricks_slab") ||
                blockState.getBlock().getName().getString().equals("betternether:obsidian_bricks_stairs") ||
                blockState.getBlock().getName().getString().equals("betternether:obsidian_glass") ||
                blockState.getBlock().getName().getString().equals("betternether:obsidian_glass_pane") ||
                blockState.getBlock().getName().getString().equals("betternether:obsidian_rod_tiles") ||
                blockState.getBlock().getName().getString().equals("betternether:obsidian_tile") ||
                blockState.getBlock().getName().getString().equals("betternether:obsidian_tile_slab") ||
                blockState.getBlock().getName().getString().equals("betternether:obsidian_tile_small") ||
                blockState.getBlock().getName().getString().equals("betternether:obsidian_tile_stairs") ||

                blockState.getBlock().getName().getString().equals("betternether:blue_obsidian") ||
                blockState.getBlock().getName().getString().equals("betternether:blue_crying_obsidian") ||
                blockState.getBlock().getName().getString().equals("betternether:blue_weeping_obsidian") ||
                blockState.getBlock().getName().getString().equals("betternether:blue_obsidian_bricks") ||
                blockState.getBlock().getName().getString().equals("betternether:blue_obsidian_bricks_slab") ||
                blockState.getBlock().getName().getString().equals("betternether:blue_obsidian_bricks_stairs") ||
                blockState.getBlock().getName().getString().equals("betternether:blue_obsidian_glass") ||
                blockState.getBlock().getName().getString().equals("betternether:blue_obsidian_glass_pane") ||
                blockState.getBlock().getName().getString().equals("betternether:blue_obsidian_rod_tiles") ||
                blockState.getBlock().getName().getString().equals("betternether:blue_obsidian_tile") ||
                blockState.getBlock().getName().getString().equals("betternether:blue_obsidian_tile_slab") ||
                blockState.getBlock().getName().getString().equals("betternether:blue_obsidian_tile_small") ||
                blockState.getBlock().getName().getString().equals("betternether:blue_obsidian_tile_stairs");
    }
}
