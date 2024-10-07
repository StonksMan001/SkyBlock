package net.me.skyblock.blocks_and_items.block_entities.skyblock;

import net.me.skyblock.SkyBlock;
import net.me.skyblock.blocks_and_items.ModBlockEntities;
import net.me.skyblock.blocks_and_items.ModItems;
import net.me.skyblock.blocks_and_items.items.create.NuggetOfExperienceItem;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class AncientPedestalBlockEntity extends BlockEntity {

    public AncientPedestalBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SKYBLOCK__ANCIENT_PEDESTAL_BLOCK_ENTITY, pos, state);
    }
    public static void serverTick(World world, BlockPos pos, BlockState state, AncientPedestalBlockEntity blockEntity) {
        if (!world.isClient) {
            for (PlayerEntity playerEntity : world.getPlayers()) {
                boolean enoughProgress = playerEntity.experienceLevel != 3 || playerEntity.experienceProgress >= 0.23076922f;
                boolean enoughExperience = playerEntity.experienceLevel >= 3 && enoughProgress;
                if (!playerEntity.isCreative() && !playerEntity.isSpectator() && playerEntity.getBlockPos().equals(pos.up()) && enoughExperience && playerEntity.isSneaking() && world.getBlockState(pos.up()).isAir()) {
                    playerEntity.addExperience(-NuggetOfExperienceItem.EXPERIENCE_POINTS);
                    Vec3d spawnPos = new Vec3d(pos.getX() + 0.5, pos.getY() + 1.0, pos.getZ() + 0.5);
                    ItemEntity itemEntity = new ItemEntity(world, spawnPos.x, spawnPos.y, spawnPos.z, new ItemStack(ModItems.CREATE__NUGGET_OF_EXPERIENCE));
                    itemEntity.setVelocity(0.0, 0.2, 0.0);
                    world.spawnEntity(itemEntity);
                }
            }
        }
    }
}
