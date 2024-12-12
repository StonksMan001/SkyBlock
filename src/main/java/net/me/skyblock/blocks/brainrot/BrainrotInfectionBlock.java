package net.me.skyblock.blocks.brainrot;

import net.me.skyblock.registries.v1.SkyBlockRegistries;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;

import java.util.Map;

public interface BrainrotInfectionBlock {
    public static final BooleanProperty CAN_INFECT = BooleanProperty.of("can_infect");
    static Map<Block, Block> brainrotBlockBlockPairs() {
        return Map.ofEntries(
                Map.entry(Blocks.MOSS_CARPET, Blocks.AIR),
                Map.entry(SkyBlockRegistries.BlockRegistries.BP__PALE_MOSS_BLOCK, Blocks.AIR),
                Map.entry(SkyBlockRegistries.BlockRegistries.MCD__MIDNIGHT_MOSS_BLOCK, Blocks.AIR),
                Map.entry(Blocks.WATER, SkyBlockRegistries.BlockRegistries.BRAINROT__GRIMACE_SHAKE),
                Map.entry(Blocks.GRAVEL, SkyBlockRegistries.BlockRegistries.BRAINROT__BRAINROTTEN_SAND),
                Map.entry(Blocks.SUSPICIOUS_GRAVEL, SkyBlockRegistries.BlockRegistries.BRAINROT__BRAINROTTEN_SAND)
        );
    }
    static Map<TagKey<Block>, Block> brainrotBlocktagBlockPairs() {
        return Map.ofEntries(
                Map.entry(BlockTags.DIRT, SkyBlockRegistries.BlockRegistries.BRAINROT__BRAINROTTEN_SOIL),
                Map.entry(BlockTags.SAND, SkyBlockRegistries.BlockRegistries.BRAINROT__BRAINROTTEN_SAND),
                Map.entry(BlockTags.CONCRETE_POWDER, SkyBlockRegistries.BlockRegistries.BRAINROT__BRAINROTTEN_SAND)
        );
    }
    default void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(CAN_INFECT);
    }
    default boolean hasRandomTicks(BlockState state) {
        return true;
    }
    default BlockState infectionState(BlockState state) {
        return state;
    }
    default void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!world.isClient) {
            boolean canInfect = world.getBlockState(pos).get(CAN_INFECT);
            if (random.nextInt(world.getGameRules().getInt(SkyBlockRegistries.GameRuleRegistries.BRAINROT__BRAINROT_SPREAD_CHANCE)) == 0 && canInfect) {
                int i = random.nextInt(6);
                BlockPos infectionTargetPos = i >= 0 && i < Direction.values().length ? pos.offset(Direction.values()[i]) : pos;
                for (Map.Entry<Block, Block> map : brainrotBlockBlockPairs().entrySet()) {
                    if (world.getBlockState(infectionTargetPos).isOf(map.getKey()) && (world.getBlockState(infectionTargetPos).getFluidState().isStill() || world.getBlockState(infectionTargetPos).getFluidState().isEmpty())) {
                        BlockState defState = map.getValue().getDefaultState();
                        world.setBlockState(infectionTargetPos, defState.getProperties().contains(CAN_INFECT) ? infectionState(defState.with(CAN_INFECT, true)) : defState);
                    }
                }
                for (Map.Entry<TagKey<Block>, Block> map : brainrotBlocktagBlockPairs().entrySet()) {
                    if (world.getBlockState(infectionTargetPos).isIn(map.getKey()) && (world.getBlockState(infectionTargetPos).getFluidState().isStill() || world.getBlockState(infectionTargetPos).getFluidState().isEmpty())) {
                        BlockState defState = map.getValue().getDefaultState();
                        world.setBlockState(infectionTargetPos, defState.getProperties().contains(CAN_INFECT) ? infectionState(defState.with(CAN_INFECT, true)) : defState);
                    }
                }
                if (world.getBlockState(infectionTargetPos).getProperties().contains(CAN_INFECT)) {
                    if (!world.getBlockState(infectionTargetPos).get(CAN_INFECT)) {
                        world.setBlockState(infectionTargetPos, infectionState(world.getBlockState(infectionTargetPos).with(CAN_INFECT, true)));
                    }
                }
            }
        }
    }
}
