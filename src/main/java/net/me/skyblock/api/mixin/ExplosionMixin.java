package net.me.skyblock.api.mixin;

import net.me.skyblock.api.skycore.ComplexBlock;
import net.me.skyblock.blocks_and_items.ModBlocks;
import net.me.skyblock.blocks_and_items.blocks.skyblock.CompressedSteelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Set;

@Mixin(Explosion.class)
public abstract class ExplosionMixin {
    @Shadow @Final private World world;
    @Inject(method = "collectBlocksAndDamageEntities", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;getFluidState(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/fluid/FluidState;", shift = At.Shift.AFTER), locals = LocalCapture.CAPTURE_FAILHARD)
    public void collectBlocksAndDamageEntities(CallbackInfo ci, Set set, int i, int j, int k, int l, double d, double e, double f, double g, float h, double m, double n, double o, float p, BlockPos blockPos, BlockState blockState) {
        if (world.getBlockState(blockPos).isOf(ModBlocks.SKYBLOCK__COMPRESSED_STEEL)) {
            CompressedSteelBlock.getRedPulse(ModBlocks.SKYBLOCK__COMPRESSED_STEEL.getDefaultState(), world, blockPos);
        }
    }
}
