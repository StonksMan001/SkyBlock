package net.me.skyblock.api.mixin;

import net.minecraft.block.*;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(SculkBlock.class)
public abstract class SculkBlockMixin {
    /*@Inject(method = "spread", at = @At(value = "INVOKE", target = "Ljava/lang/Math;max(II)I"), locals = LocalCapture.CAPTURE_FAILHARD)
    public void spread(SculkSpreadManager.Cursor cursor, WorldAccess world, BlockPos catalystPos, Random random, SculkSpreadManager spreadManager, boolean shouldConvertToBlock, CallbackInfoReturnable<Integer> cir, int i, BlockPos blockPos, boolean bl, int j) {
        int rand = random.nextInt(11);
        if (rand == 0) {
            world.setBlockState(blockPos, ModBlocks.BOSC__SCULK_JAW.getDefaultState(), Block.NOTIFY_ALL);
        } if (rand > 5) {
            world.setBlockState(blockPos.up(), ModBlocks.SKYBLOCK__SCULK_SPROUTS.getDefaultState(), Block.NOTIFY_ALL);
        }
    }
    @Inject(method = "getExtraBlockState", at = @At(value = "RETURN", shift = At.Shift.BEFORE), locals = LocalCapture.CAPTURE_FAILHARD)
    public void getExtraBlockState(WorldAccess world, BlockPos pos, Random random, boolean allowShrieker, CallbackInfoReturnable<BlockState> cir, BlockState blockState) {
    }*/
}
