package net.me.mcd_innermod.block_entities.echoing_void;

import net.me.mcd_innermod.registries.MCD_BlockEntities;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class VoidBlockEntity extends BlockEntity {
    public VoidBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(MCD_BlockEntities.MCD__VOID_BLOCK_ENTITY, blockPos, blockState);
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
