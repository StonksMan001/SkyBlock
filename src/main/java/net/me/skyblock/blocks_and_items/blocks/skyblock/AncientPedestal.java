package net.me.skyblock.blocks_and_items.blocks.skyblock;

import com.mojang.serialization.MapCodec;
import net.me.skyblock.blocks_and_items.ModBlockEntities;
import net.me.skyblock.blocks_and_items.block_entities.skyblock.AncientPedestalBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class AncientPedestal extends BlockWithEntity implements BlockEntityProvider {
    public static final MapCodec<AncientPedestal> CODEC = createCodec(AncientPedestal::new);
    public AncientPedestal(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new AncientPedestalBlockEntity(pos, state);
    }
    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
