package net.me.skyblock.api.skycore;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class ComplexBlock extends Block {
    public ComplexBlock(Settings settings) {
        super(settings);
        this.setDefaultState(getDefaultState());
    }
    public static void onExplosionImpacted(BlockState state, World world, BlockPos pos) {
    }
}
