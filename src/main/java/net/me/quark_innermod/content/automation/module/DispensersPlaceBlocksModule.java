package net.me.quark_innermod.content.automation.module;

import com.google.common.collect.Lists;
import net.me.quark_innermod.config.QuarkConfigs;
import net.me.quark_innermod.internal_zeta.org.ZetaModule;
import net.minecraft.block.Block;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.dispenser.FallibleItemDispenserBehavior;
import net.minecraft.item.AutomaticItemPlacementContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPointer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Deprecated
public class DispensersPlaceBlocksModule extends ZetaModule {

    public static List<String> blacklist = Lists.newArrayList("minecraft:water", "minecraft:lava", "minecraft:fire");

    public static boolean wrapExistingBehaviors = QuarkConfigs.Automation.DispensersPlaceBlocks.wrapExistingBehaviors;

    @Override
    public void register() {
    }
    @Override
    public void registerClient() {
    }

    public static class BlockBehavior extends FallibleItemDispenserBehavior {

        private final FallibleItemDispenserBehavior wrapped;

        public BlockBehavior() {
            this(null);
        }

        public BlockBehavior(FallibleItemDispenserBehavior wrapped) {
            this.wrapped = wrapped;
        }

        @NotNull
        @Override
        protected ItemStack dispenseSilently(BlockPointer pointer, ItemStack stack) {
            if (wrapped != null) {
                ItemStack wrappedResult = wrapped.dispense(pointer, stack);
                if(wrapped.isSuccess()) {
                    setSuccess(true);
                    return wrappedResult;
                }
            }
            setSuccess(false);

            Direction direction = pointer.state().get(DispenserBlock.FACING);
            Direction against = direction;
            BlockPos pos = pointer.pos().offset(direction);

            if (stack.getItem() instanceof BlockItem item) {
                Block block = item.getBlock();
                if (block instanceof StairsBlock && direction.getAxis() != Direction.Axis.Y)
                    direction = direction.getOpposite();
                else if(block instanceof SlabBlock)
                    against = Direction.UP;

                setSuccess(item.place(new NotStupidDirectionalPlaceContext(pointer.world(), pos, direction, stack, against))
                        .isAccepted());
            }

            return stack;
        }
    }

    // DirectionPlaceContext results in infinite loops when using slabs
    private static class NotStupidDirectionalPlaceContext extends AutomaticItemPlacementContext {

        protected boolean replaceClicked;
        protected Direction direction;

        public NotStupidDirectionalPlaceContext(World worldIn, BlockPos pos, Direction facing, ItemStack stack, Direction against) {
            super(worldIn, pos, facing, stack, against);
            replaceClicked = worldIn.getBlockState(getHitResult().getBlockPos()).isReplaceable(); // getHitResult = getRayTraceResult
            this.direction = facing;
        }

        @Override
        public boolean canPlace() {
            return replaceClicked;
        }

        @NotNull
        @Override
        public Direction getPlayerLookDirection() {
            return direction.getOpposite();
        }
    }
}
