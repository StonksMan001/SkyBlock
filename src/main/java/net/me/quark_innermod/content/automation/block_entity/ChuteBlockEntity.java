package net.me.quark_innermod.content.automation.block_entity;

import net.me.quark_innermod.content.automation.block.ChuteBlock;
import net.me.quark_innermod.content.automation.module.ChuteModule;
import net.me.quark_innermod.content.building.module.GrateModule;
import net.me.quark_innermod.internal_zeta.org.ZetaBlockEntity;
import net.me.quark_innermod.registries.Quark_BlockTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.entity.*;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;


public class ChuteBlockEntity extends ZetaBlockEntity implements Inventory {
    private DefaultedList<ItemStack> inventory = DefaultedList.ofSize(1, ItemStack.EMPTY);

    public ChuteBlockEntity(BlockPos pos, BlockState state) {
        super(ChuteModule.chuteBlockEntityType, pos, state);
    }
    private boolean canDropItem() {
        World world1 = this.getWorld();
        if(world1 != null && world1.getBlockState(this.getPos()).get(ChuteBlock.ENABLED)) {
            BlockPos below = this.getPos().down();
            BlockState state = world1.getBlockState(below);
            return state.isAir() || state.getCollisionShape(world1, below).isEmpty()
                    || state.isOf(GrateModule.grateBlock)
                    || (state.isIn(Quark_BlockTags.QUARK__HOLLOW_LOGS) && state.get(PillarBlock.AXIS) == Direction.Axis.Y);
        }

        return false;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return this.inventory.stream().allMatch(ItemStack::isEmpty);
    }

    @Override
    public ItemStack getStack(int slot) {
        return this.inventory.get(slot);
    }

    @Override
    public ItemStack removeStack(int slot, int amount) {
        ItemStack itemStack = Inventories.splitStack(this.inventory, slot, amount);
        if (!itemStack.isEmpty()) {
            this.markDirty();
        }
        return itemStack;
    }

    @Override
    public boolean isValid(int slot, ItemStack stack) {
        return this.canDropItem();
    }

    @Override
    public int getMaxCountPerStack() {
        return 1;
    }

    @Override
    public ItemStack removeStack(int slot) {
        return Inventories.removeStack(this.inventory, slot);
    }

    @Override
    public void setStack(int slot, ItemStack stack) {
        this.inventory.set(slot, stack);
        if (stack.getCount() > this.getMaxCountPerStack()) {
            stack.setCount(this.getMaxCountPerStack());
        }
        this.markDirty();
    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return false;
    }

    @Override
    public void clear() {
        this.inventory.clear();
    }

    public static <T extends BlockEntity> void serverTick(World world, BlockPos blockPos, BlockState blockState, T t) {

        if (world.getBlockEntity(blockPos) instanceof ChuteBlockEntity chuteBlockEntity) {
            ItemStack stack = chuteBlockEntity.getStack(0);
            if (world != null && !stack.isEmpty()) {
                ItemEntity entity = new ItemEntity(world, blockPos.getX() + 0.5, blockPos.getY() - 0.5, blockPos.getZ() + 0.5, stack.copyWithCount(1));
                entity.setVelocity(0, 0, 0);
                chuteBlockEntity.removeStack(0, 1);
                world.spawnEntity(entity);
            }
        }
    }
}
