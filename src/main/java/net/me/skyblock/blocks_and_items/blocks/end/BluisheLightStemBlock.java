package net.me.skyblock.blocks_and_items.blocks.end;

import com.mojang.serialization.MapCodec;
import net.me.skyblock.blocks_and_items.ModItems;
import net.me.skyblock.blocks_and_items.blocks.abyss.AbyssVegetation;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.PlantBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BluisheLightStemBlock extends PillarBlock {
    public BluisheLightStemBlock(Settings settings) {
        super(settings);
    }
    public static void dropSheel(World world, BlockPos pos) {
        BeehiveBlock.dropStack(world, pos, new ItemStack(ModItems.SP5__BLUISHE_LIGHT_SHEEL, (int)(Math.random() * 3) +2));
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isIn(ItemTags.AXES)) {
            BluisheLightStemBlock.dropSheel(world, pos);itemStack.damage(1, player, playerx -> playerx.sendToolBreakStatus(hand));
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }
}
