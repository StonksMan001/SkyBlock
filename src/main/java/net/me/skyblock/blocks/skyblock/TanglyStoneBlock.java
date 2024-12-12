package net.me.skyblock.blocks.skyblock;

import net.me.skyblock.registries.v1.SkyBlockRegistries;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class TanglyStoneBlock extends Block {
    private final Block convertsTo;
    @Nullable
    private Block driesTo;
    private final Item item;
    public TanglyStoneBlock(Settings settings, Item item, Block convertsTo) {
        super(settings);
        this.item = item;
        this.convertsTo = convertsTo;
    }
    public TanglyStoneBlock(Settings settings, Item item, Block convertsTo, @Nullable Block driesTo) {
        super(settings);
        this.item = item;
        this.convertsTo = convertsTo;
        this.driesTo = driesTo;
    }
    private void dropItem(World world, BlockPos pos) {
        BeehiveBlock.dropStack(world, pos, new ItemStack(item, 1));
    }

    @Override
    protected boolean hasRandomTicks(BlockState state) {
        if (driesTo != null) return true;
        else return super.hasRandomTicks(state);
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!world.isClient && driesTo != null) {
            boolean wet = false;
            for (Direction direction : Direction.values()) {
                if (world.getFluidState(pos.offset(direction)).isIn(FluidTags.WATER)) {
                    wet = true;
                }
            }
            if (!wet) world.setBlockState(pos, driesTo.getDefaultState());
        }
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(Items.SHEARS)) {
            this.dropItem(world, pos);
            world.playSound(null, (double)pos.getX() + 0.5, (double)pos.getY() + 0.5, (double)pos.getZ() + 0.5, SoundEvents.BLOCK_WET_GRASS_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);
            itemStack.damage(1, player, LivingEntity.getSlotForHand(hand));
            world.setBlockState(pos, convertsTo.getDefaultState());
            return ItemActionResult.SUCCESS;
        }
        return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
    }
}
