package net.me.skyblock.blocks.end;

import net.me.skyblock.registries.v1.SkyBlockRegistries;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BluisheLightStemBlock extends PillarBlock {
    public BluisheLightStemBlock(Settings settings) {
        super(settings);
    }
    private static void dropSheel(World world, BlockPos pos) {
        BeehiveBlock.dropStack(world, pos, new ItemStack(SkyBlockRegistries.ItemRegistries.SP5__BLUISHE_LIGHT_SHEEL, (int)(Math.random() * 3) +2));
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isIn(ItemTags.AXES)) {
            dropSheel(world, pos);
            world.playSound(null, (double)pos.getX() + 0.5, (double)pos.getY() + 0.5, (double)pos.getZ() + 0.5, SoundEvents.BLOCK_BEEHIVE_SHEAR, SoundCategory.BLOCKS, 1.0F, 1.0F);
            itemStack.damage(1, player, LivingEntity.getSlotForHand(hand));
        }
        return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
    }
}
