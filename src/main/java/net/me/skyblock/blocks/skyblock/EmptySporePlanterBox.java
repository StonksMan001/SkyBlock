package net.me.skyblock.blocks.skyblock;

import net.me.skyblock.blocks.skyblock.crops.PuffballMushroomBlock;
import net.me.skyblock.registries.v1.SkyBlockRegistries;
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
                Map.entry(Blocks.RED_MUSHROOM_BLOCK, SkyBlockRegistries.BlockRegistries.SKYBLOCK__RED_MUSHROOM_SPORE_PLANTER_BOX),
                Map.entry(Blocks.BROWN_MUSHROOM_BLOCK, SkyBlockRegistries.BlockRegistries.SKYBLOCK__BROWN_MUSHROOM_SPORE_PLANTER_BOX),
                Map.entry(SkyBlockRegistries.BlockRegistries.SKYBLOCK__PUFFBALL_MUSHROOM_BLOCK, SkyBlockRegistries.BlockRegistries.SKYBLOCK__PUFFBALL_SPORE_PLANTER_BOX)
        );
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        int infecting_quality = world.getGameRules().getInt(SkyBlockRegistries.GameRuleRegistries.SKYBLOCK__RARE_MUSHROOM_GROWTH_CHANCE);
        BlockPos[] blockPosArray = {
                pos.north(), pos.south(), pos.east(), pos.west(), pos.up(), pos.down(),

                pos.north().east(), pos.north().west(), pos.south().east(), pos.south().west(),
                pos.north().up(), pos.south().up(), pos.east().up(), pos.west().up(),
                pos.north().down(), pos.south().down(), pos.east().down(), pos.west().down()
        };
        Block[] blockKeyArray = shroom_planter_box_pairs().keySet().toArray(new Block[0]);

        if (random.nextInt(infecting_quality * 2) == 0) {
            int i = random.nextInt(blockPosArray.length);
            BlockPos pos1 = blockPosArray[i];
            BlockState state1 = world.getBlockState(pos1);
            if (List.of(blockKeyArray).contains(state1.getBlock())) {
                if (state1.getBlock() instanceof PuffballMushroomBlock && state1.get(PuffballMushroomBlock.NATURAL) && !state1.get(PuffballMushroomBlock.DEAD)) {
                    world.setBlockState(pos, shroom_planter_box_pairs().get(state1.getBlock()).getDefaultState());
                    world.setBlockState(pos1, state1.with(PuffballMushroomBlock.DEAD, true));
                } else if (!(state1.getBlock() instanceof  PuffballMushroomBlock)) {
                    world.setBlockState(pos, shroom_planter_box_pairs().get(state1.getBlock()).getDefaultState());
                }
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
