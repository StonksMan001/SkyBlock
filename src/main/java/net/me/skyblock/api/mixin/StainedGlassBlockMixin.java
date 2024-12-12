package net.me.skyblock.api.mixin;

import net.me.skyblock.registries.v1.SkyBlockRegistries;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.StainedGlassBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.SpectralArrowEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(StainedGlassBlock.class)
public class StainedGlassBlockMixin extends Block{
    protected Block[] BLOCKS = {
            Blocks.GRAY_STAINED_GLASS,
            Blocks.BLACK_STAINED_GLASS,
            Blocks.BLUE_STAINED_GLASS,
            Blocks.PINK_STAINED_GLASS,
            Blocks.BROWN_STAINED_GLASS,
            Blocks.CYAN_STAINED_GLASS,
            Blocks.GREEN_STAINED_GLASS,
            Blocks.PURPLE_STAINED_GLASS,
            Blocks.LIGHT_BLUE_STAINED_GLASS,
            Blocks.LIGHT_GRAY_STAINED_GLASS,
            Blocks.LIME_STAINED_GLASS,
            Blocks.MAGENTA_STAINED_GLASS,
            Blocks.ORANGE_STAINED_GLASS,
            Blocks.RED_STAINED_GLASS,
            Blocks.WHITE_STAINED_GLASS,
            Blocks.YELLOW_STAINED_GLASS
    };
    public StainedGlassBlockMixin(Settings settings) {
        super(settings);
    }
    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        super.onEntityCollision(state, world, pos, entity);
        if (world instanceof ServerWorld && world.getGameRules().getBoolean(SkyBlockRegistries.GameRuleRegistries.SKYBLOCK__DO_ARROWS_BREAK_GLASS_BLOCKS)) {
            if (entity instanceof ArrowEntity || entity instanceof SpectralArrowEntity) {
                Block block = world.getBlockState(pos).getBlock();
                if (
                        block == Blocks.GRAY_STAINED_GLASS ||
                                block == Blocks.BLACK_STAINED_GLASS ||
                                block == Blocks.BLUE_STAINED_GLASS ||
                                block == Blocks.PINK_STAINED_GLASS ||
                                block == Blocks.BROWN_STAINED_GLASS ||
                                block == Blocks.CYAN_STAINED_GLASS ||
                                block == Blocks.GREEN_STAINED_GLASS ||
                                block == Blocks.PURPLE_STAINED_GLASS ||
                                block == Blocks.LIGHT_BLUE_STAINED_GLASS ||
                                block == Blocks.LIGHT_GRAY_STAINED_GLASS ||
                                block == Blocks.LIME_STAINED_GLASS ||
                                block == Blocks.MAGENTA_STAINED_GLASS ||
                                block == Blocks.ORANGE_STAINED_GLASS ||
                                block == Blocks.RED_STAINED_GLASS ||
                                block == Blocks.WHITE_STAINED_GLASS ||
                                block == Blocks.YELLOW_STAINED_GLASS
                ) {
                    world.breakBlock(new BlockPos(pos), true, entity);
                    entity.kill();
                }
            }
        }
    }
}
