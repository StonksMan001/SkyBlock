package net.me.skyblock.blocks.skyblock;

import com.mojang.serialization.MapCodec;
import net.me.skyblock.api.skycore.BlockEntityAPI;
import net.me.skyblock.block_entities.skyblock.AncientPedestalBlockEntity;
import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class AncientPedestalBlock extends Block implements BlockEntityProvider {
    public static EnumProperty<AncientPedestalBlock.Type> TYPE = EnumProperty.of("type", AncientPedestalBlock.Type.class);
    public static IntProperty OCCUPIED_SLOTS = IntProperty.of("occupied_slots", 1, 3);
    public static IntProperty NUGGET_OF_EXPERIENCE_CONVERTIBLE = IntProperty.of("nugget_of_experience_convertible", 0, 64);

    public static final MapCodec<AncientPedestalBlock> CODEC = createCodec(AncientPedestalBlock::new);
    public AncientPedestalBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(SkyBlockRegistries.ItemRegistries.MCD__ANCIENT_GOLD_INGOT) && !world.isClient) {
            if (state.get(TYPE) == Type.DEFAULT) {
                world.setBlockState(pos, state
                        .with(TYPE, Type.WITH_ANCIENT_GOLD)
                        .with(OCCUPIED_SLOTS, 1)
                        .with(NUGGET_OF_EXPERIENCE_CONVERTIBLE, 64));
                stack.decrementUnlessCreative(1, player);
                world.playSound(null, (double)pos.getX() + 0.5, (double)pos.getY() + 0.5, (double)pos.getZ() + 0.5, SkyBlockRegistries.SoundRegistries.MCD__ANCIENT_GOLD_PICK_UP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ItemActionResult.SUCCESS;
            } else if (state.get(TYPE) == Type.WITH_ANCIENT_GOLD) {
                if (state.get(OCCUPIED_SLOTS) != 3) {
                    world.setBlockState(pos, state.with(OCCUPIED_SLOTS, state.get(OCCUPIED_SLOTS) + 1));
                    stack.decrementUnlessCreative(1, player);
                    world.playSound(null, (double)pos.getX() + 0.5, (double)pos.getY() + 0.5, (double)pos.getZ() + 0.5, SkyBlockRegistries.SoundRegistries.MCD__ANCIENT_GOLD_PICK_UP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ItemActionResult.SUCCESS;
                } else if (state.get(NUGGET_OF_EXPERIENCE_CONVERTIBLE) != 64) {
                    world.setBlockState(pos, state.with(NUGGET_OF_EXPERIENCE_CONVERTIBLE, 64));
                    stack.decrementUnlessCreative(1, player);
                    world.playSound(null, (double)pos.getX() + 0.5, (double)pos.getY() + 0.5, (double)pos.getZ() + 0.5, SkyBlockRegistries.SoundRegistries.MCD__ANCIENT_GOLD_PICK_UP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ItemActionResult.SUCCESS;
                }
            }
        }
        return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TYPE, OCCUPIED_SLOTS, NUGGET_OF_EXPERIENCE_CONVERTIBLE);
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
    public enum Type implements StringIdentifiable {
        DEFAULT("default"),
        WITH_ANCIENT_GOLD("with_ancient_gold");

        private Type(String name) {
            this.name = name;
        }
        private final String name;
        @Override
        public String asString() {
            return this.name;
        }
        @Override
        public String toString() {
            return this.name;
        }
    }
}
