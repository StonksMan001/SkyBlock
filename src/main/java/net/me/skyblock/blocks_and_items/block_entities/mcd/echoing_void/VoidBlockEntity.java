package net.me.skyblock.blocks_and_items.block_entities.mcd.echoing_void;

import net.me.skyblock.blocks_and_items.block_entities.ModBlockEntities;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class VoidBlockEntity extends BlockEntity {
    public VoidBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModBlockEntities.VOID_BLOCK_ENTITY, blockPos, blockState);
    }
    public boolean shouldDrawSide(Direction direction) {
        return Block.shouldDrawSide(this.getCachedState(), this.world, this.getPos(), direction, this.getPos().offset(direction));
    }
    public int getDrawnSidesCount() {
        int i = 0;
        for (Direction direction : Direction.values()) {
            i += this.shouldDrawSide(direction) ? 1 : 0;
        }
        return i;
    }
}
