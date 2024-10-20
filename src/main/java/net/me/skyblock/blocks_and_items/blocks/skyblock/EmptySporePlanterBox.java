package net.me.skyblock.blocks_and_items.blocks.skyblock;

import net.me.skyblock.blocks_and_items.ModBlocks;
import net.me.skyblock.blocks_and_items.blocks.skyblock.crops.PuffballMushroomBlock;
import net.me.skyblock.server.ModGameRules;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

import java.util.List;
import java.util.Map;

public class EmptySporePlanterBox extends Block {
    public static EnumProperty<Type> TYPE = EnumProperty.of("type", Type.class);

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TYPE);
    }

    public EmptySporePlanterBox(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(TYPE, Type.DEFAULT));
    }
    public Map<Block, Block> shroom_planter_box_pairs() {
        return Map.ofEntries(
                Map.entry(Blocks.RED_MUSHROOM_BLOCK, ModBlocks.SKYBLOCK__RED_MUSHROOM_SPORE_PLANTER_BOX),
                Map.entry(ModBlocks.SKYBLOCK__PUFFBALL_MUSHROOM_BLOCK, ModBlocks.SKYBLOCK__PUFFBALL_SPORE_PLANTER_BOX)
        );
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        /*
        int infecting_quality = world.getGameRules().getInt(ModGameRules.SKYBLOCK__RARE_MUSHROOM_GROWTH_CHANCE);
        if (random.nextInt(infecting_quality * 3) == 0 && state.get(NATURAL) && !state.get(DEAD)) {
            if (random.nextInt(2) == 0) {
                BlockPos[] blockPosArray = {pos.north(), pos.south(), pos.east(), pos.west(), pos.north().east(), pos.north().west(), pos.south().east(), pos.south().west()};
                int i = random.nextInt(8);
                if (world.getBlockState(blockPosArray[i]).isOf(ModBlocks.SKYBLOCK__SPORE_PLANTER_BOX)) {
                    world.setBlockState(blockPosArray[i], ModBlocks.SKYBLOCK__PUFFBALL_SPORE_PLANTER_BOX.getDefaultState());
                    world.setBlockState(pos, state.with(DEAD, true));
                }
            } else world.setBlockState(pos, state.with(DEAD, true));
        }*/
        int infecting_quality = world.getGameRules().getInt(ModGameRules.SKYBLOCK__RARE_MUSHROOM_GROWTH_CHANCE);
        BlockPos[] blockPosArray = {
                pos.north(), pos.south(), pos.east(), pos.west(), pos.up(), pos.down(),

                pos.north().east(), pos.north().west(), pos.south().east(), pos.south().west(),
                pos.north().up(), pos.south().up(), pos.east().up(), pos.west().up(),
                pos.north().down(), pos.south().down(), pos.east().down(), pos.west().down()
        };
        Block[] blockKeyArray = shroom_planter_box_pairs().keySet().toArray(new Block[0]);
        boolean ifUniqueCanExecute = state.getBlock() instanceof PuffballMushroomBlock && state.get(PuffballMushroomBlock.NATURAL) && !state.get(PuffballMushroomBlock.DEAD);




        if (random.nextInt(infecting_quality * 3) == 0) {
            int i = random.nextInt(blockPosArray.length);
            Block block1 = world.getBlockState(blockPosArray[i]).getBlock();
            if (List.of(blockKeyArray).contains(block1)) {
                world.setBlockState(pos, shroom_planter_box_pairs().get(block1).getDefaultState());
            }
        }
    }
    public enum Type implements StringIdentifiable {
        DEFAULT("default"),
        ASHEN("ashen");

        private Type(String name) {
            this.name = name;
        }
        private final String name;
        @Override
        public String asString() {
            return this.name;
        }
        @Override
        public String toString() {
            return this.name;
        }
    }
}
