package net.me.quark_innermod.internal_zeta.org;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import org.apache.commons.lang3.tuple.Pair;

public abstract class RaytracingUtil {
    public abstract double getEntityRange(LivingEntity var1);

    public RaytracingUtil() {
        //empty
    }
    public HitResult rayTrace(Entity entity, World world, PlayerEntity player, RaycastContext.ShapeType shapeType, RaycastContext.FluidHandling fluidHandling) {
        return this.rayTrace(entity, world, player, shapeType, fluidHandling, this.getEntityRange(player));
    }

    public HitResult rayTrace(Entity entity, World world, Entity player, RaycastContext.ShapeType shapeType, RaycastContext.FluidHandling fluidHandling, double range) {
        Pair<Vec3d, Vec3d> params = this.getEntityParams(player);
        return this.rayTrace(entity, world, (Vec3d)params.getLeft(), (Vec3d)params.getRight(), shapeType, fluidHandling, range);
    }

    public HitResult rayTrace(Entity entity, World world, Vec3d startPos, Vec3d ray, RaycastContext.ShapeType shapeType, RaycastContext.FluidHandling fluidHandling, double range) {
        return this.rayTrace(entity, world, startPos, ray.multiply(range), shapeType, fluidHandling);
    }
    public HitResult rayTrace(Entity entity, World world, Vec3d startPos, Vec3d ray, RaycastContext.ShapeType shapeType, RaycastContext.FluidHandling fluidHandling) {
        Vec3d endPos = startPos.add(ray);
        RaycastContext context = new RaycastContext(startPos, endPos, shapeType, fluidHandling, entity);
        return world.raycast(context);
    }
    public Pair<Vec3d, Vec3d> getEntityParams(Entity player) {
        float scale = 1.0F;
        float pitch = player.prevPitch + (player.getPitch() - player.prevPitch) * scale;
        float yaw = player.prevYaw + (player.getYaw() - player.prevYaw) * scale;
        Vec3d pos = player.getPos();
        double posX = player.prevX + (pos.x - player.prevX) * (double)scale;
        double posY = player.prevY + (pos.y - player.prevY) * (double)scale;
        if (player instanceof PlayerEntity playerEntity) {
            posY += (double) playerEntity.getEyeHeight(playerEntity.getPose());
        }

        double posZ = player.prevZ + (pos.z - player.prevZ) * (double)scale;
        Vec3d rayPos = new Vec3d(posX, posY, posZ);
        float zYaw = -MathHelper.cos(yaw * 3.1415927F / 180.0F);
        float xYaw = MathHelper.sin(yaw * 3.1415927F / 180.0F);
        float pitchMod = -MathHelper.cos(pitch * 3.1415927F / 180.0F);
        float azimuth = -MathHelper.sin(pitch * 3.1415927F / 180.0F);
        float xLen = xYaw * pitchMod;
        float yLen = zYaw * pitchMod;
        Vec3d ray = new Vec3d((double)xLen, (double)azimuth, (double)yLen);
        return Pair.of(rayPos, ray);
    }
}
