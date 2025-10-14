package net.me.skycore_supermod.mixin;

import net.me.skyblock__innermod.registries.SB_Blocks;
import net.me.skyblock__innermod.registries.SB_GameRules;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CropBlock.class)
public abstract class CropBlockMixin {
    @Shadow @Final public static IntProperty AGE;

    @Shadow public abstract int getAge(BlockState state);

    @Inject(method = "randomTick", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/world/ServerWorld;setBlockState(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;I)Z", shift = At.Shift.AFTER))
    private void goldenCropTicker(BlockState state, ServerWorld world, BlockPos pos, Random random, CallbackInfo ci) {
        if ((Object)this == Blocks.CARROTS && this.getAge(state) == 6 && random.nextInt(world.getGameRules().getInt(SB_GameRules.SKYBLOCK__GOLDEN_CROP_GROWTH_CHANCE)) == 0) world.setBlockState(pos, SB_Blocks.SKYBLOCK__GOLDEN_CARROT_CROP.getDefaultState().with(AGE, 7), 2);
    }
}
