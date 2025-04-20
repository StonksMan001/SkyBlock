package net.me.mcd_innermod.blocks;

import net.me.mcd_innermod.registries.MCD_GameRules;
import net.me.mcd_innermod.registries.MCD_Sounds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.random.Random;

import java.util.List;

public class AncientLodestone extends Block {
    public AncientLodestone(Settings settings) {
        super(settings);
    }
    @Override
    protected boolean hasRandomTicks(BlockState state) {
        return true;
    }
    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.randomTick(state, world, pos, random);
        int range = world.getGameRules().getInt(MCD_GameRules.MCD__ANCIENT_LODESTONE_RANGE);
        Box box = (new Box(pos.getX(), pos.getY(), pos.getZ(), pos.getX() + 1, pos.getY() + 1, pos.getZ() + 1)).expand(range);
        List<PlayerEntity> list = world.getNonSpectatingEntities(PlayerEntity.class, box);
        if (!list.isEmpty() && random.nextInt(world.getGameRules().getInt(MCD_GameRules.MCD__ANCIENT_LODESTONE_MUSIC_CHANCE)) == 0) {
            for (PlayerEntity playerEntity : list) {
                if (pos.isWithinDistance(playerEntity.getBlockPos(), range)) {
                    playerEntity.playSoundToPlayer(MCD_Sounds.MCD__WANDERLUST, SoundCategory.MUSIC, 1.0f, 1.0f);
                }
            }
        }
    }
}
