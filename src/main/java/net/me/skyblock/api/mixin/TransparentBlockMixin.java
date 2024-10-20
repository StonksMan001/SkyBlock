package net.me.skyblock.api.mixin;

import net.me.skyblock.server.ModGameRules;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.TransparentBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.SpectralArrowEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;


@Mixin(TransparentBlock.class)
public class TransparentBlockMixin extends Block {
    public TransparentBlockMixin(Settings settings) {
        super(settings);
    }
    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        super.onEntityCollision(state, world, pos, entity);
        if (world instanceof ServerWorld && world.getBlockState(pos).getBlock() == Blocks.GLASS && world.getGameRules().getBoolean(ModGameRules.SKYBLOCK__DO_ARROWS_BREAK_GLASS_BLOCKS)) {
            if (entity instanceof ArrowEntity || entity instanceof SpectralArrowEntity) {
                world.breakBlock(new BlockPos(pos), true, entity);
                entity.kill();
            }
        }
    }
}
