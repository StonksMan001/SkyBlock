package net.me.skycore_supermod.deprecated.benimod.entities.ai.entity_goals;

import net.me.skycore_supermod.deprecated.benimod.BenimodRegistries;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

@Deprecated
public class MessUpTurfGoal extends Goal {
    private final LivingEntity livingEntity;
    private final Random random = new Random();

    public MessUpTurfGoal(LivingEntity mob) {
        this.livingEntity = mob;
    }
    @Override
    public boolean canStart() {
        World world = livingEntity.getWorld();
        BlockPos pos = livingEntity.getBlockPos().down();
        return world.getBlockState(pos).isOf(Blocks.GRASS_BLOCK) || world.getBlockState(pos).isOf(Blocks.DIRT);
    }
    @Override
    public void tick() {
        /*
        World world = livingEntity.getWorld();
        BlockPos pos = livingEntity.getBlockPos().down();
        if ((world.getBlockState(pos).isOf(Blocks.GRASS_BLOCK) || world.getBlockState(pos).isOf(Blocks.DIRT)) && random.nextInt(world.getGameRules().getInt(BenimodRegistries.Beni_GameRules.BENIMOD__MESS_UP_TURF_CHANCE) * 2) == 0) {
            world.playSound(null, pos, world.getBlockState(pos).getSoundGroup().getBreakSound(), SoundCategory.BLOCKS);
            world.setBlockState(pos, Blocks.COARSE_DIRT.getDefaultState());
        }
        */
    }
}
