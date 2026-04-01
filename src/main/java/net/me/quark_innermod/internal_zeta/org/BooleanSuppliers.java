package net.me.quark_innermod.internal_zeta.org;

import java.util.Objects;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class BooleanSuppliers {
    public static final BooleanSupplier TRUE = () -> {
        return true;
    };
    public static final BooleanSupplier FALSE = () -> {
        return false;
    };
    private static final Supplier<Boolean> BOXED_TRUE = () -> {
        return true;
    };
    private static final Supplier<Boolean> BOXED_FALSE = () -> {
        return false;
    };

    private BooleanSuppliers() {
    }

    public static BooleanSupplier and(BooleanSupplier a, BooleanSupplier b) {
        if (a != FALSE && b != FALSE) {
            if (a == TRUE) {
                return b;
            } else {
                return b == TRUE ? a : () -> {
                    return a.getAsBoolean() && b.getAsBoolean();
                };
            }
        } else {
            return FALSE;
        }
    }

    public static BooleanSupplier or(BooleanSupplier a, BooleanSupplier b) {
        if (a != TRUE && b != TRUE) {
            if (a == FALSE) {
                return b;
            } else {
                return b == FALSE ? a : () -> {
                    return a.getAsBoolean() || b.getAsBoolean();
                };
            }
        } else {
            return TRUE;
        }
    }

    public static BooleanSupplier not(BooleanSupplier x) {
        if (x == TRUE) {
            return FALSE;
        } else {
            return x == FALSE ? TRUE : () -> {
                return !x.getAsBoolean();
            };
        }
    }

    public static Supplier<Boolean> boxed(BooleanSupplier x) {
        if (x == TRUE) {
            return BOXED_TRUE;
        } else if (x == FALSE) {
            return BOXED_FALSE;
        } else {
            Objects.requireNonNull(x);
            return x::getAsBoolean;
        }
    }
}
