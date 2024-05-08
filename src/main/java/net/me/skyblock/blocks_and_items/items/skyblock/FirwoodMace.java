package net.me.skyblock.blocks_and_items.items.skyblock;

import net.me.skyblock.blocks_and_items.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Objects;

public class FirwoodMace extends SwordItem {
    public static final String LEAVES_KEY = "Leaves";
    public FirwoodMace(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (stack.getNbt() == null) {
            setLeaves(stack, "green");
        }
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        ItemStack itemStack = context.getStack();
        if (blockState.isOf(ModBlocks.SKYBLOCK__FIR_LEAVES) && !Objects.equals(getLeaves(itemStack), "green")) {
            setLeaves(itemStack, "green");
            return ActionResult.SUCCESS;
        } else if (blockState.isOf(ModBlocks.SKYBLOCK__AUTUMN_FIR_LEAVES) && !Objects.equals(getLeaves(itemStack), "orange")) {
            setLeaves(itemStack, "orange");
            return ActionResult.SUCCESS;
        } else return ActionResult.PASS;
    }

    public static void setLeaves(ItemStack stack, String type) {
        NbtCompound nbtCompound = stack.getOrCreateNbt();
        nbtCompound.putString(LEAVES_KEY, type);
    }
    public static String getLeaves(ItemStack stack) {
        NbtCompound nbtCompound = stack.getNbt();
        if (nbtCompound != null) {
            return nbtCompound.getString(LEAVES_KEY);
        } else {
            return "";
        }
    }
}
