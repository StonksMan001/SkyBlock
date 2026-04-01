package net.me.quark_innermod.internal_zeta.org;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

@Deprecated
public interface ICollateralMover { /**Note from ProjectF>F: Serves no purpose currently (and probably never will)*/

    default boolean isCollateralMover(World world, BlockPos source, Direction moveDirection, BlockPos pos) {
        return true;
    }

    MoveResult getCollateralMovement(World var1, BlockPos var2, Direction var3, Direction var4, BlockPos var5);

    public static enum MoveResult {
        MOVE,
        BREAK,
        SKIP,
        PREVENT;

        private MoveResult() {
        }
    }
}
