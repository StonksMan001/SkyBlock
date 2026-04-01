package net.me.quark_innermod.internal_zeta.org;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

@Deprecated
public interface IConditionalSticky { /**Note from ProjectF>F: Serves no purpose currently (and probably never will)*/
    boolean canStickToBlock(World var1, BlockPos var2, BlockPos var3, BlockPos var4, BlockState var5, BlockState var6, Direction var7);
}
