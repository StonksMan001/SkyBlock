package net.me.quark_innermod.internal_zeta.org;//

import com.google.common.collect.Lists;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PistonBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.block.piston.PistonHandler;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import org.apache.commons.lang3.tuple.Pair;
import org.jetbrains.annotations.NotNull;

@Deprecated
public class ZetaPistonStructureResolver /*extends PistonHandler*/ { /**Note from ProjectF>F: Serves no purpose currently (and probably never will)*/
    /*
    private final PistonHandler parent;
    private final World world;
    private final BlockPos pistonPos;
    private final BlockPos blockToMove;
    private final Direction moveDirection;
    private final List<BlockPos> toMove = Lists.newArrayList();
    private final List<BlockPos> toDestroy = Lists.newArrayList();

    public ZetaPistonStructureResolver(PistonHandler parent) {
        super(((PistonHandlerAccessor)parent).zeta$level(), ((PistonHandlerAccessor)parent).zeta$pistonPos(), ((PistonHandlerAccessor)parent).zeta$pistonDirection(), ((PistonHandlerAccessor)parent).zeta$extending());
        this.parent = parent;
        this.world = ((PistonHandlerAccessor)parent).zeta$level();
        this.pistonPos = ((PistonHandlerAccessor)parent).zeta$pistonPos();
        this.moveDirection = parent.getMotionDirection();
        this.blockToMove = ((PistonHandlerAccessor)parent).zeta$startPos();
    }

    @Override
    public boolean calculatePush() {
        if (!GlobalSettings.isEnabled()) {
            return this.parent.calculatePush();
        } else {
            this.toMove.clear();
            this.toDestroy.clear();
            BlockState iblockstate = this.world.getBlockState(this.blockToMove);
            if (!PistonBlock.isMovable(iblockstate, this.world, this.blockToMove, this.moveDirection, false, this.moveDirection)) {
                if (iblockstate.getPistonBehavior() == PistonBehavior.DESTROY) {
                    this.toDestroy.add(this.blockToMove);
                    return true;
                } else {
                    return false;
                }
            } else if (!this.addBlockLine(this.blockToMove, this.moveDirection)) {
                return false;
            } else {
                for(int i = 0; i < this.toMove.size(); ++i) {
                    BlockPos blockpos = (BlockPos)this.toMove.get(i);
                    if (this.addBranchingBlocks(this.world, blockpos, this.isBlockBranching(this.world, blockpos)) == ICollateralMover.MoveResult.PREVENT) {
                        return false;
                    }
                }

                return true;
            }
        }
    }

    private boolean addBlockLine(BlockPos origin, Direction face) {
        int max = GlobalSettings.getPushLimit();
        BlockPos target = origin;
        BlockState state = this.world.getBlockState(target);
        if (!state.isAir() && PistonBlock.isMovable(state, this.world, origin, this.moveDirection, false, face) && !origin.equals(this.pistonPos) && !this.toMove.contains(origin)) {
            int lineLen = 1;
            if (lineLen + this.toMove.size() > max) {
                return false;
            } else {
                BlockPos oldPos = origin;
                BlockState oldState = this.world.getBlockState(origin);
                boolean skippingNext = false;

                while(this.isBlockBranching(this.world, target)) {
                    ICollateralMover.MoveResult res = this.getBranchResult(this.world, target);
                    if (res == ICollateralMover.MoveResult.PREVENT) {
                        return false;
                    }

                    if (res != ICollateralMover.MoveResult.MOVE) {
                        skippingNext = true;
                        break;
                    }

                    target = origin.offset(this.moveDirection.getOpposite(), lineLen);
                    state = this.world.getBlockState(target);
                    if (state.isAir() || !PistonBlock.isMovable(state, this.world, target, this.moveDirection, false, this.moveDirection.getOpposite()) || target.equals(this.pistonPos) || this.getStickCompatibility(this.world, state, oldState, target, oldPos) != ICollateralMover.MoveResult.MOVE) {
                        break;
                    }

                    oldState = state;
                    oldPos = target;
                    ++lineLen;
                    if (lineLen + this.toMove.size() > max) {
                        return false;
                    }
                }

                int collisionEnd = 0;

                int offset;
                BlockPos currentPos;
                for(offset = lineLen - 1; offset >= 0; --offset) {
                    currentPos = origin.offset(this.moveDirection.getOpposite(), offset);
                    if (this.toDestroy.contains(currentPos)) {
                        break;
                    }

                    this.toMove.add(currentPos);
                    ++collisionEnd;
                }

                if (skippingNext) {
                    return true;
                } else {
                    offset = 1;

                    boolean doneFinding;
                    do {
                        currentPos = origin.offset(this.moveDirection, offset);
                        int collisionStart = this.toMove.indexOf(currentPos);
                        if (collisionStart > -1) {
                            this.reorderListAtCollision(collisionEnd, collisionStart);

                            for(int i = 0; i <= collisionStart + collisionEnd; ++i) {
                                BlockPos collidingPos = (BlockPos)this.toMove.get(i);
                                if (this.addBranchingBlocks(this.world, collidingPos, this.isBlockBranching(this.world, collidingPos)) == ICollateralMover.MoveResult.PREVENT) {
                                    return false;
                                }
                            }

                            return true;
                        }

                        state = this.world.getBlockState(currentPos);
                        if (state.isAir()) {
                            return true;
                        }

                        if (!PistonBlock.isMovable(state, this.world, currentPos, this.moveDirection, true, this.moveDirection) || currentPos.equals(this.pistonPos)) {
                            return false;
                        }

                        if (state.getPistonBehavior() == PistonBehavior.DESTROY) {
                            this.toDestroy.add(currentPos);
                            this.toMove.remove(currentPos);
                            return true;
                        }

                        doneFinding = false;
                        if (this.isBlockBranching(this.world, currentPos)) {
                            ICollateralMover.MoveResult res = this.getBranchResult(this.world, currentPos);
                            if (res == ICollateralMover.MoveResult.PREVENT) {
                                return false;
                            }

                            if (res != ICollateralMover.MoveResult.MOVE) {
                                doneFinding = true;
                            }
                        }

                        if (this.toMove.size() >= max) {
                            return false;
                        }

                        this.toMove.add(currentPos);
                        ++collisionEnd;
                        ++offset;
                    } while(!doneFinding);

                    return true;
                }
            }
        } else {
            return true;
        }
    }

    private void reorderListAtCollision(int collisionEnd, int collisionStart) {
        List<BlockPos> before = Lists.newArrayList(this.toMove.subList(0, collisionStart));
        List<BlockPos> collision = Lists.newArrayList(this.toMove.subList(this.toMove.size() - collisionEnd, this.toMove.size()));
        List<BlockPos> after = Lists.newArrayList(this.toMove.subList(collisionStart, this.toMove.size() - collisionEnd));
        this.toMove.clear();
        this.toMove.addAll(before);
        this.toMove.addAll(collision);
        this.toMove.addAll(after);
    }

    private ICollateralMover.MoveResult addBranchingBlocks(World world, BlockPos fromPos, boolean isSourceBranching) {
        BlockState state = world.getBlockState(fromPos);
        Block block = state.getBlock();
        Direction opposite = this.moveDirection.getOpposite();
        ICollateralMover.MoveResult retResult = ICollateralMover.MoveResult.SKIP;
        Direction[] var8 = Direction.values();
        int var9 = var8.length;
        int var10 = 0;

        while(var10 < var9) {
            Direction face = var8[var10];
            BlockPos targetPos = fromPos.offset(face);
            BlockState targetState = world.getBlockState(targetPos);
            ICollateralMover.MoveResult res;
            if (!isSourceBranching) {
                IIndirectConnector indirect = getIndirectStickiness(targetState);
                if (indirect != null && indirect.isEnabled() && indirect.canConnectIndirectly(world, targetPos, fromPos, targetState, state)) {
                    res = this.getStickCompatibility(world, state, targetState, fromPos, targetPos);
                } else {
                    res = ICollateralMover.MoveResult.SKIP;
                }
            } else if (block instanceof ICollateralMover) {
                ICollateralMover collateralMover = (ICollateralMover)block;
                res = collateralMover.getCollateralMovement(world, this.pistonPos, this.moveDirection, face, fromPos);
            } else {
                res = this.getStickCompatibility(world, state, targetState, fromPos, targetPos);
            }

            switch (res) {
                case PREVENT:
                    return ICollateralMover.MoveResult.PREVENT;
                case MOVE:
                    if (!this.addBlockLine(targetPos, face)) {
                        return ICollateralMover.MoveResult.PREVENT;
                    }
                case BREAK:
                    if (PistonBlock.isMovable(targetState, world, targetPos, this.moveDirection, true, this.moveDirection)) {
                        this.toDestroy.add(targetPos);
                        this.toMove.remove(targetPos);
                        return ICollateralMover.MoveResult.BREAK;
                    }

                    return ICollateralMover.MoveResult.PREVENT;
                default:
                    if (face == opposite) {
                        retResult = res;
                    }

                    ++var10;
                    break;
            }
        }

        return retResult;
    }

    private boolean isBlockBranching(World world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();
        return block instanceof ICollateralMover ? ((ICollateralMover)block).isCollateralMover(world, this.pistonPos, this.moveDirection, pos) : isBlockSticky(state);
    }

    private ICollateralMover.MoveResult getBranchResult(World world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();
        if (block instanceof ICollateralMover collateralMover) {
            return collateralMover.getCollateralMovement(world, this.pistonPos, this.moveDirection, this.moveDirection, pos);
        } else {
            return ICollateralMover.MoveResult.MOVE;
        }
    }

    private ICollateralMover.MoveResult getStickCompatibility(World world, BlockState state1, BlockState state2, BlockPos pos1, BlockPos pos2) {
        IConditionalSticky stick = this.getStickCondition(state1);
        if (stick != null && !stick.canStickToBlock(world, this.pistonPos, pos1, pos2, state1, state2, this.moveDirection)) {
            return ICollateralMover.MoveResult.SKIP;
        } else {
            stick = this.getStickCondition(state2);
            return stick != null && !stick.canStickToBlock(world, this.pistonPos, pos2, pos1, state2, state1, this.moveDirection) ? ICollateralMover.MoveResult.SKIP : ICollateralMover.MoveResult.MOVE;
        }
    }

    private IConditionalSticky getStickCondition(BlockState state) {
        Block block = state.getBlock();
        if (block instanceof IConditionalSticky sticky) {
            return sticky;
        } else {
            IIndirectConnector indirect = getIndirectStickiness(state);
            if (indirect != null) {
                return indirect.isEnabled() ? indirect.getStickyCondition() : null;
            } else {
                return PistonHandlerAccessor.zeta$isBlockSticky(state) ? DefaultStickCondition.INSTANCE : null;
            }
        }
    }


    @Override
    public @NotNull List<BlockPos> getMovedBlocks() {
        return !GlobalSettings.isEnabled() ? this.parent.getMovedBlocks() : this.toMove;
    }

    @Override
    public @NotNull List<BlockPos> getBrokenBlocks() {
        return !GlobalSettings.isEnabled() ? this.parent.getBrokenBlocks() : this.toDestroy;
    }

    private static IIndirectConnector getIndirectStickiness(BlockState state) {
        Iterator<Pair<Predicate<BlockState>, IIndirectConnector>> var1 = IIndirectConnector.INDIRECT_STICKY_BLOCKS.iterator();

        Pair p;
        do {
            if (!var1.hasNext()) {
                return null;
            }

            p = var1.next();
        } while(!((Predicate)p.getLeft()).test(state));

        return (IIndirectConnector)p.getRight();
    }

    private static boolean isBlockSticky(BlockState state) {
        if (PistonHandlerAccessor.zeta$isBlockSticky(state)) {
            return true;
        } else {
            IIndirectConnector indirect = getIndirectStickiness(state);
            return indirect != null && indirect.isEnabled();
        }
    }

    public static class GlobalSettings {
        private static boolean enabled = true;
        private static int pushLimit = 12;
        private static final Set<String> wantsEnabled = new HashSet<>();
        private static final Object2IntMap<String> wantsPushLimit = new Object2IntOpenHashMap<>();

        public GlobalSettings() {
        }

        public static boolean isEnabled() {
            return enabled;
        }

        public static int getPushLimit() {
            return pushLimit;
        }


//        public static void requestEnabled(String modid, boolean enablePlease) {
//            boolean wasEnabled = enabled;
//            if (enablePlease) {
//                wantsEnabled.add(modid);
//            } else {
//                wantsEnabled.remove(modid);
//            }
//
//            enabled = !wantsEnabled.isEmpty();
//            if (!wasEnabled && enabled) {
//                Zeta.GLOBAL_LOG.info("'{}' is enabling Zeta's piston structure resolver.", modid);
//            } else if (wasEnabled && !enabled) {
//                Zeta.GLOBAL_LOG.info("Zeta's piston structure resolver is now disabled.");
//            }
//
//        }
//
//        public static void requestPushLimit(String modid, int pushLimitPlease) {
//            int wasPushLimit = pushLimit;
//            wantsPushLimit.put(modid, pushLimitPlease);
//            pushLimit = wantsPushLimit.values().intStream().max().orElse(12);
//            if (wasPushLimit < pushLimit) {
//                Zeta.GLOBAL_LOG.info("'{}' is raising Zeta's piston structure resolver push limit to {} blocks.", modid, pushLimit);
//            }
//
//        }
//    }

    private static class DefaultStickCondition implements IConditionalSticky {
        private static final DefaultStickCondition INSTANCE = new DefaultStickCondition();

        private DefaultStickCondition() {
        }

        public boolean canStickToBlock(World world, BlockPos pistonPos, BlockPos pos, BlockPos slimePos, BlockState state, BlockState slimeState, Direction direction) {
            return PistonHandlerAccessor.zeta$isAdjacentBlockStuck(slimeState, state);
        }
    }
    */
}
