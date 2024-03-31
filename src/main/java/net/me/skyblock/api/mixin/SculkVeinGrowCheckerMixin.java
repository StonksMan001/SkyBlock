package net.me.skyblock.api.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.me.skyblock.api.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets = "net.minecraft.block.SculkVeinBlock$SculkVeinGrowChecker")
public class SculkVeinGrowCheckerMixin {
    @WrapOperation(method = "canGrow(Lnet/minecraft/world/BlockView;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Direction;Lnet/minecraft/block/BlockState;)Z", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z", ordinal = 0))
    public boolean isAlsoOf(BlockState state, Block block, Operation<Boolean> original) {
        return original.call(state, block) || state.isIn(ModTags.Blocks.SKYBLOCK__SCULK_VEIN_CANT_COVER);
    }
    /** @Redirect kitörli az összes eredeti paramétert */
    /*@Redirect(method = "canGrow(Lnet/minecraft/world/BlockView;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Direction;Lnet/minecraft/block/BlockState;)Z", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"))
    public boolean isAlsoOf(BlockState instance, Block block) {
        return instance.isIn(ModTags.Blocks.SKYBLOCK__SCULK_VEIN_CANT_COVER);
    }*/
}
