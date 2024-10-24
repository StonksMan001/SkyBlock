package net.me.skyblock.blocks_and_items.blocks.skyblock;

import net.me.skyblock.SkyBlock;
import net.me.skyblock.blocks_and_items.ModBlocks;
import net.me.skyblock.server.ModGameRules;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Property;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SporePlanterBox extends Block {
    public SporePlanterBox(Settings settings, Block mushroom, double multiplier, boolean isShroomLightSensitive) {
        super(settings);
        this.mushroom = mushroom;
        this.multiplier = multiplier;
        this.isShroomLightSensitive = isShroomLightSensitive;
    }
    public Block mushroom;
    public double multiplier; // higher number = lower growth chance
    public boolean isShroomLightSensitive;
    @Override
    public boolean hasRandomTicks(BlockState state) {
        return true;
    }
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        int appearing_chance = world.getGameRules().getInt(ModGameRules.SKYBLOCK__RARE_MUSHROOM_GROWTH_CHANCE);
        if (random.nextInt((int)(appearing_chance * multiplier)) == 0 && world.getBlockState(pos.up()).isOf(Blocks.AIR) && Objects.nonNull(mushroom)) {
            if (!isShroomLightSensitive || world.getBaseLightLevel(pos.up(), 0) < 13) {
                world.setBlockState(pos.up(), mushroom.getDefaultState(), 2);
            }
        }
        if (world.getBlockState(pos.up()).isIn(BlockTags.FIRE) || world.getBlockState(pos.up()).isOf(Blocks.LAVA) || world.getBlockState(pos.up()).isOf(Blocks.MAGMA_BLOCK)) {
            world.setBlockState(pos, ModBlocks.SKYBLOCK__SPORE_PLANTER_BOX.getDefaultState().with(EmptySporePlanterBox.TYPE, EmptySporePlanterBox.Type.ASHEN));
        }
    }
}
