package net.me.skyblock.blocks.skyblock;

import net.me.skyblock.registries.SkyBlockRegistries;
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
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
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
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ANT);
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        boolean i = state.get(ANT);
        boolean bl = false;
        if (i) {
            Item item = itemStack.getItem();
            if (itemStack.isOf(Items.GLASS_BOTTLE)) {
                itemStack.decrement(1);
                world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1.0f, 1.0f);
                if (itemStack.isEmpty()) {
                    player.setStackInHand(hand, new ItemStack(SkyBlockRegistries.ItemRegistries.SKYBLOCK__ANT_BOTTLE));
                } else if (!player.getInventory().insertStack(new ItemStack(SkyBlockRegistries.ItemRegistries.SKYBLOCK__ANT_BOTTLE))) {
                    player.dropItem(new ItemStack(SkyBlockRegistries.ItemRegistries.SKYBLOCK__ANT_BOTTLE), false);
                }
                bl = true;
                world.emitGameEvent((Entity)player, GameEvent.FLUID_PICKUP, pos);
                world.setBlockState(pos, state.cycle(ANT));
            }
            if (!world.isClient() && bl) {
                player.incrementStat(Stats.USED.getOrCreateStat(item));
            }
        }
        return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
    }
}