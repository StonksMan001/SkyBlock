package net.me.skyblock.block.custom;

import it.unimi.dsi.fastutil.booleans.BooleanPredicate;
import net.me.skyblock.item.ModItems;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class SuspiciousCoarseDirt extends Block {

    public static final BooleanProperty ANT = BooleanProperty.of("ant");

    public SuspiciousCoarseDirt(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player2, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player2.getStackInHand(hand);
        boolean i = state.get(ANT);
        boolean bl = false;
        if (i) {
            Item item = itemStack.getItem();
            if (itemStack.isOf(Items.GLASS_BOTTLE)) {
                itemStack.decrement(1);
                world.playSound(player2, player2.getX(), player2.getY(), player2.getZ(), SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1.0f, 1.0f);
                if (itemStack.isEmpty()) {
                    player2.setStackInHand(hand, new ItemStack(ModItems.ANT_BOTTLE));
                } else if (!player2.getInventory().insertStack(new ItemStack(ModItems.ANT_BOTTLE))) {
                    player2.dropItem(new ItemStack(ModItems.ANT_BOTTLE), false);
                }
                bl = true;
                world.emitGameEvent((Entity)player2, GameEvent.FLUID_PICKUP, pos);
                world.setBlockState(pos, state.cycle(ANT));
            }
            if (!world.isClient() && bl) {
                player2.incrementStat(Stats.USED.getOrCreateStat(item));
            }
        }

        return super.onUse(state, world, pos, player2, hand, hit);
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ANT);
    }
}