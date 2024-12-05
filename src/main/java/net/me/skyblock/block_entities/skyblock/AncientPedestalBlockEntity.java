package net.me.skyblock.block_entities.skyblock;

import net.me.skyblock.blocks.skyblock.AncientPedestalBlock;
import net.me.skyblock.blocks.skyblock.EmptySporePlanterBox;
import net.me.skyblock.items.create.NuggetOfExperienceItem;
import net.me.skyblock.registries.SkyBlockRegistries;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class AncientPedestalBlockEntity extends BlockEntity {

    public AncientPedestalBlockEntity(BlockPos pos, BlockState state) {
        super(SkyBlockRegistries.BlockEntityRegistries.SKYBLOCK__ANCIENT_PEDESTAL_BLOCK_ENTITY, pos, state);
    }
    public static void serverTick(World world, BlockPos pos, BlockState state, AncientPedestalBlockEntity blockEntity) {
        if (!world.isClient) {
            for (PlayerEntity playerEntity : world.getPlayers()) {
                boolean enoughProgress = playerEntity.experienceLevel != 3 || playerEntity.experienceProgress >= 0.23076922f;
                boolean enoughExperience = playerEntity.experienceLevel >= 3 && enoughProgress;
                if (!playerEntity.isCreative() && !playerEntity.isSpectator() && playerEntity.getBlockPos().equals(pos.up()) && enoughExperience && playerEntity.isSneaking() && world.getBlockState(pos.up()).isAir() && state.get(AncientPedestalBlock.TYPE) == AncientPedestalBlock.Type.WITH_ANCIENT_GOLD) {
                    playerEntity.addExperience(-NuggetOfExperienceItem.EXPERIENCE_POINTS);
                    Vec3d spawnPos = new Vec3d(pos.getX() + 0.5, pos.getY() + 1.0, pos.getZ() + 0.5);
                    ItemEntity itemEntity = new ItemEntity(world, spawnPos.x, spawnPos.y, spawnPos.z, new ItemStack(SkyBlockRegistries.ItemRegistries.CREATE__NUGGET_OF_EXPERIENCE));
                    itemEntity.setVelocity(0.0, 0.2, 0.0);
                    world.spawnEntity(itemEntity);
                    if (state.get(AncientPedestalBlock.NUGGET_OF_EXPERIENCE_CONVERTIBLE) != 1) {
                        world.setBlockState(pos, state.with(AncientPedestalBlock.NUGGET_OF_EXPERIENCE_CONVERTIBLE, state.get(AncientPedestalBlock.NUGGET_OF_EXPERIENCE_CONVERTIBLE) - 1));
                    } else if (state.get(AncientPedestalBlock.OCCUPIED_SLOTS) != 1) {
                        world.setBlockState(pos, state
                                .with(AncientPedestalBlock.OCCUPIED_SLOTS, state.get(AncientPedestalBlock.OCCUPIED_SLOTS) - 1)
                                .with(AncientPedestalBlock.NUGGET_OF_EXPERIENCE_CONVERTIBLE, 64));
                    } else world.setBlockState(pos, state.with(AncientPedestalBlock.TYPE, AncientPedestalBlock.Type.DEFAULT));
                }
            }
        }
    }
}
