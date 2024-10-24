package net.me.skyblock.api.mixin;

import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PaneBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.SpectralArrowEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PaneBlock.class)
public class PaneBlockMixin extends Block {
    public PaneBlockMixin(Settings settings) {
        super(settings);
    }
    protected Block[] BLOCKS = {
            Blocks.GLASS_PANE,
            Blocks.GRAY_STAINED_GLASS_PANE,
            Blocks.BLACK_STAINED_GLASS_PANE,
            Blocks.BLUE_STAINED_GLASS_PANE,
            Blocks.PINK_STAINED_GLASS_PANE,
            Blocks.BROWN_STAINED_GLASS_PANE,
            Blocks.CYAN_STAINED_GLASS_PANE,
            Blocks.GREEN_STAINED_GLASS_PANE,
            Blocks.PURPLE_STAINED_GLASS_PANE,
            Blocks.LIGHT_BLUE_STAINED_GLASS_PANE,
            Blocks.LIGHT_GRAY_STAINED_GLASS_PANE,
            Blocks.LIME_STAINED_GLASS_PANE,
            Blocks.MAGENTA_STAINED_GLASS_PANE,
            Blocks.ORANGE_STAINED_GLASS_PANE,
            Blocks.RED_STAINED_GLASS_PANE,
            Blocks.WHITE_STAINED_GLASS_PANE,
            Blocks.YELLOW_STAINED_GLASS_PANE
    };

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        super.onEntityCollision(state, world, pos, entity);
        if (world instanceof ServerWorld && world.getGameRules().getBoolean(SkyBlockRegistries.GameRuleRegistries.SKYBLOCK__DO_ARROWS_BREAK_GLASS_BLOCKS)) {
            if (entity instanceof ArrowEntity || entity instanceof SpectralArrowEntity) {
                Block block = world.getBlockState(pos).getBlock();
                if (
                        block == Blocks.GLASS_PANE ||
                                block == Blocks.GRAY_STAINED_GLASS_PANE ||
                                block == Blocks.BLACK_STAINED_GLASS_PANE ||
                                block == Blocks.BLUE_STAINED_GLASS_PANE ||
                                block == Blocks.PINK_STAINED_GLASS_PANE ||
                                block == Blocks.BROWN_STAINED_GLASS_PANE ||
                                block == Blocks.CYAN_STAINED_GLASS_PANE ||
                                block == Blocks.GREEN_STAINED_GLASS_PANE ||
                                block == Blocks.PURPLE_STAINED_GLASS_PANE ||
                                block == Blocks.LIGHT_BLUE_STAINED_GLASS_PANE ||
                                block == Blocks.LIGHT_GRAY_STAINED_GLASS_PANE ||
                                block == Blocks.LIME_STAINED_GLASS_PANE ||
                                block == Blocks.MAGENTA_STAINED_GLASS_PANE ||
                                block == Blocks.ORANGE_STAINED_GLASS_PANE ||
                                block == Blocks.RED_STAINED_GLASS_PANE ||
                                block == Blocks.WHITE_STAINED_GLASS_PANE ||
                                block == Blocks.YELLOW_STAINED_GLASS_PANE
                ) {
                    world.breakBlock(new BlockPos(pos), true, entity);
                    entity.kill();
                }
            }
        }
    }
}
