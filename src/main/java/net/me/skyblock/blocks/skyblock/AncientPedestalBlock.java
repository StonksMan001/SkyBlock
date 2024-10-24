package net.me.skyblock.blocks.skyblock;

import com.mojang.serialization.MapCodec;
import net.me.skyblock.api.skycore.BlockEntityAPI;
import net.me.skyblock.block_entities.skyblock.AncientPedestalBlockEntity;
import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class AncientPedestalBlock extends Block implements BlockEntityProvider {
    public static final MapCodec<AncientPedestalBlock> CODEC = createCodec(AncientPedestalBlock::new);
    public AncientPedestalBlock(Settings settings) {
        super(settings);
    }
    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return BlockEntityAPI.createTickerHelper(type, SkyBlockRegistries.BlockEntityRegistries.SKYBLOCK__ANCIENT_PEDESTAL_BLOCK_ENTITY, AncientPedestalBlockEntity::serverTick);
    }
    @Override
    protected MapCodec<AncientPedestalBlock> getCodec() {
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
