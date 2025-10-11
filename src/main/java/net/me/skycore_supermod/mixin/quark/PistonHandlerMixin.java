package net.me.skycore_supermod.mixin.quark;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.me.quark_innermod.content.automation.module.ChainsConnectBlocksModule;
import net.minecraft.block.BlockState;
import net.minecraft.block.piston.PistonHandler;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PistonHandler.class)
public abstract class PistonHandlerMixin { //TODO: TEMP
    @Shadow
    protected abstract boolean tryMove(BlockPos pos, Direction dir);
    @Final
    @Shadow
    private World world;
    @Shadow
    private static boolean isBlockSticky(BlockState state) {
        throw new AssertionError();
    }

    /**Note from ProjectF>F: Own implementation for chain linkage*/
    @WrapOperation(method = "calculatePush", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/piston/PistonHandler;isBlockSticky(Lnet/minecraft/block/BlockState;)Z"))
    private boolean alwaysTrue0(BlockState state, Operation<Boolean> original) {
        if (ChainsConnectBlocksModule.isEnabled) return true;
        else return original.call(state);
    }
    @WrapOperation(method = "tryMove", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/piston/PistonHandler;isBlockSticky(Lnet/minecraft/block/BlockState;)Z", ordinal = 1))
    private boolean alwaysTrue1(BlockState state, Operation<Boolean> original) {
        if (ChainsConnectBlocksModule.isEnabled) return true;
        else return original.call(state);
    }
    @Inject(method = "tryMoveAdjacentBlock", at = @At(value = "HEAD"), cancellable = true)
    private void tryMoveChainLinkedStuff(BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if (ChainsConnectBlocksModule.isEnabled) {
            for (Direction direction1 : Direction.values()) {
                BlockPos pos0 = pos.offset(direction1);

                BlockState blockState0 = world.getBlockState(pos0);
                BlockState blockState = world.getBlockState(pos);

                boolean isChain0 = ChainsConnectBlocksModule.isStateChainBlock(blockState0);
                boolean isChain = ChainsConnectBlocksModule.isStateChainBlock(blockState);

                Direction.Axis axis0 = isChain0 ? world.getBlockState(pos0).get(Properties.AXIS) : null;
                Direction.Axis axis = isChain ? world.getBlockState(pos).get(Properties.AXIS) : null;

                boolean axisMatch0 = axis0 == direction1.getAxis();
                boolean axisMatch = axis == direction1.getAxis();

                boolean chainLinkageCheck = isChain && axis == axis0 && axis0 != null;
                if ((axisMatch0 && chainLinkageCheck) || (isChain && !isChain0 && axisMatch) || (!isChain && isChain0 && axisMatch0)) {
                    if (!tryMove(pos0, direction1)) {
                        cir.setReturnValue(false);
                        return;
                    }
                }
            }
            if (!isBlockSticky(world.getBlockState(pos))) {
                cir.setReturnValue(true);
            }
        }
    }
}
