package net.me.mcd_innermod.block_entities;

import net.me.mcd_innermod.blocks.PopFlowerBlock;
import net.me.mcd_innermod.registries.MCD_BlockEntities;
import net.me.mcd_innermod.registries.MCD_GameRules;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class PopFlowerBlockEntity extends BlockEntity {
    public PopFlowerBlockEntity( BlockPos pos, BlockState state) {
        super(MCD_BlockEntities.MCD__POP_FLOWER_BLOCK_ENTITY, pos, state);
    }
    public static void serverTick(World world, BlockPos pos, BlockState state, PopFlowerBlockEntity blockEntity) {
        if (!world.isClient) {
            boolean hide = false;
            for (PlayerEntity playerEntity : world.getPlayers()) {
                if (!playerEntity.isSpectator() && Vec3d.ofCenter(pos).squaredDistanceTo(playerEntity.getPos()) <= Math.pow(PopFlowerBlock.HIDE_DISTANCE, 2))
                    hide = true;
            }
            if (hide || world.isDay() || world.getGameRules().getBoolean(MCD_GameRules.MCD__POP_FLOWERS_ALWAYS_HIDE)) {
                PopFlowerBlock.decrease(world, pos);
            } else PopFlowerBlock.increase(world, pos);
        }
    }
}
