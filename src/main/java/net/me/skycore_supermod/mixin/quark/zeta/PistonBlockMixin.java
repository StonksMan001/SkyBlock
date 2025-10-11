package net.me.skycore_supermod.mixin.quark.zeta;

import net.minecraft.block.PistonBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(PistonBlock.class)
public abstract class PistonBlockMixin { /**Note from ProjectF>F: UNUSED*/
    /*
    @ModifyExpressionValue(
            method = {"tryMove", "move"},
            at = {@At(
                    value = "NEW",
                    target = "(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Direction;Z)Lnet/minecraft/block/piston/PistonHandler;")}
    )
    private PistonHandler transformStructureHelper(PistonHandler prev) {
        return new ZetaPistonStructureResolver(prev);
    }
    */

    @Unique
    private void unused() {
    }
}
