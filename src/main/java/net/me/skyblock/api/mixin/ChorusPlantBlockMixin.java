package net.me.skyblock.api.mixin;

import net.me.skyblock.registries.v1.SkyBlockRegistries;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChorusPlantBlock;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChorusPlantBlock.class)
public abstract class ChorusPlantBlockMixin extends Block {
    public ChorusPlantBlockMixin(Settings settings) {
        super(settings);
    }

    @Inject(method = "canPlaceAt", at = @At("HEAD"), cancellable = true)
    private void canSurvive(BlockState state, WorldView world, BlockPos pos, CallbackInfoReturnable<Boolean> info) {
        BlockState down = world.getBlockState(pos.down());
        if (down.isOf(SkyBlockRegistries.BlockRegistries.SP5__BLUISHE_GRASS) ||down.isOf(SkyBlockRegistries.BlockRegistries.MCD__BARREN_GRASS_BLOCK) ||down.isOf(SkyBlockRegistries.BlockRegistries.SP5__END_GRASS) || down.isOf(Blocks.END_STONE)) {
            info.setReturnValue(true);
        }
    }
    @Inject(method = "getStateForNeighborUpdate", at = @At("RETURN"), cancellable = true)
    private void getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom, CallbackInfoReturnable<BlockState> info) {
        BlockState plant = info.getReturnValue();
        if (plant.isOf(Blocks.CHORUS_PLANT) && world.getBlockState(pos.down()).isOf(SkyBlockRegistries.BlockRegistries.SP5__END_GRASS)) {
            plant = plant.with(Properties.DOWN, true);
            info.setReturnValue(plant);
        }
        if (plant.isOf(Blocks.CHORUS_PLANT) && world.getBlockState(pos.down()).isOf(SkyBlockRegistries.BlockRegistries.SP5__BLUISHE_GRASS)) {
            plant = plant.with(Properties.DOWN, true);
            info.setReturnValue(plant);
        }
        if (plant.isOf(Blocks.CHORUS_PLANT) && world.getBlockState(pos.down()).isOf(SkyBlockRegistries.BlockRegistries.MCD__BARREN_GRASS_BLOCK)) {
            plant = plant.with(Properties.DOWN, true);
            info.setReturnValue(plant);
        }
    }
}
