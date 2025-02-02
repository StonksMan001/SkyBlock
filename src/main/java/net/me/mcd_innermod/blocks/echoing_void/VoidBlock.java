package net.me.mcd_innermod.blocks.echoing_void;

import com.mojang.serialization.MapCodec;
import net.me.mcd_innermod.block_entities.echoing_void.VoidBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class VoidBlock extends BlockWithEntity {
    public static final MapCodec<VoidBlock> CODEC = createCodec(VoidBlock::new);
    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }
    public VoidBlock(Settings settings) {
        super(settings);
    }
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new VoidBlockEntity(pos, state);
    }
}
