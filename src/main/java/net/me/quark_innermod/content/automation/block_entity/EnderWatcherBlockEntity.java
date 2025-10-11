package net.me.quark_innermod.content.automation.block_entity;

import net.me.quark_innermod.base.QuarkFabric;
import net.me.quark_innermod.content.automation.block.EnderWatcherBlock;
import net.me.quark_innermod.content.automation.module.EnderWatcherModule;
import net.me.quark_innermod.internal_zeta.org.ZetaBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import org.joml.Vector3f;

import java.util.List;

public class EnderWatcherBlockEntity extends ZetaBlockEntity {
    public EnderWatcherBlockEntity(BlockPos pos, BlockState state) {
        super(EnderWatcherModule.enderWatcherBlockEntityType, pos, state);
    }
    public static void serverTick(World world, BlockPos pos, BlockState state, EnderWatcherBlockEntity blockEntity) {
        boolean wasLooking = state.get(EnderWatcherBlock.WATCHED);
        int currWatch = state.get(EnderWatcherBlock.POWER);
        int range = 80;

        int newWatch = 0;
        List<PlayerEntity> players = world.getNonSpectatingEntities(PlayerEntity.class, new Box(blockEntity.getPos().add(-range, -range, -range).toCenterPos(), blockEntity.getPos().add(range, range, range).toCenterPos()));

        EndermanEntity fakeEnderman = new EndermanEntity(EntityType.ENDERMAN, world);
        fakeEnderman.setPos(pos.getX() + 0.5, pos.getY() + 0.5 - fakeEnderman.getEyeHeight(fakeEnderman.getPose()), pos.getZ() + 0.5);

        boolean looking = false;
        for(PlayerEntity player : players) {
            ItemStack helm = player.getEquippedStack(EquipmentSlot.HEAD);
            fakeEnderman.lookAtEntity(player, 180, 180);
            if(!helm.isEmpty() && QuarkFabric.ZETA.itemExtensions.get(helm).isEnderMaskZeta(helm, player, fakeEnderman))
                continue;

            HitResult result = QuarkFabric.ZETA.raytracingUtil.rayTrace(player, world, player, RaycastContext.ShapeType.OUTLINE, RaycastContext.FluidHandling.NONE, 64);
            if(result != null && result.getType() == HitResult.Type.BLOCK && ((BlockHitResult) result).getBlockPos().equals(blockEntity.getPos())) {
                looking = true;

                Vec3d vec = result.getPos();
                Direction dir = ((BlockHitResult) result).getSide();
                double x = Math.abs(vec.x - blockEntity.getPos().getX() - 0.5) * (1 - Math.abs(dir.getOffsetX()));
                double y = Math.abs(vec.y - blockEntity.getPos().getY() - 0.5) * (1 - Math.abs(dir.getOffsetY()));
                double z = Math.abs(vec.z - blockEntity.getPos().getZ() - 0.5) * (1 - Math.abs(dir.getOffsetZ()));

                // 0.7071067811865476 being the hypotenuse of an isosceles triangle with cathetus of length 0.5
                double fract = 1 - (Math.sqrt(x * x + y * y + z * z) / 0.7071067811865476);
                int playerWatch = (int) Math.ceil(fract * 15);

                //if(playerWatch == 15 && player instanceof ServerPlayerEntity serverPlayerEntity) EnderWatcherModule.watcherCenterTrigger.trigger(serverPlayerEntity); 
                // ADVANCEMENT TRIGGER FOR FUTURE^
                
                newWatch = Math.max(newWatch, playerWatch);
            }
        }

        if(!world.isClient && (looking != wasLooking || currWatch != newWatch))
            world.setBlockState(blockEntity.getPos(), world.getBlockState(blockEntity.getPos()).with(EnderWatcherBlock.WATCHED, looking).with(EnderWatcherBlock.POWER, newWatch), 1 | 2);

        if(looking) {
            double x = blockEntity.getPos().getX() - 0.1 + Math.random() * 1.2;
            double y = blockEntity.getPos().getY() - 0.1 + Math.random() * 1.2;
            double z = blockEntity.getPos().getZ() - 0.1 + Math.random() * 1.2;

            world.addParticle(new DustParticleEffect(new Vector3f(1.0F, 0.0F, 0.0F), 1.0F), x, y, z, 0.0D, 0.0D, 0.0D);
        }
    }
}
