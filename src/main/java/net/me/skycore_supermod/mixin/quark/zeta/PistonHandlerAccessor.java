package net.me.skycore_supermod.mixin.quark.zeta;

import net.minecraft.block.BlockState;
import net.minecraft.block.piston.PistonHandler;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(PistonHandler.class)
public interface PistonHandlerAccessor { /**Note from ProjectF>F: UNUSED*/
    @Accessor("retracted")
    boolean zeta$extending();

    @Accessor("world")
    World zeta$level();

    @Accessor("posFrom")
    BlockPos zeta$pistonPos();

    @Accessor("pistonDirection")
    Direction zeta$pistonDirection();

    @Accessor("posTo")
    BlockPos zeta$startPos();

    @Invoker("isBlockSticky")
    public static boolean zeta$isBlockSticky(BlockState state) {
        throw new AssertionError();
    }

    @Invoker("isAdjacentBlockStuck")
    public static boolean zeta$isAdjacentBlockStuck(BlockState state, BlockState adjacentState) {
        throw new AssertionError();
    }
}
