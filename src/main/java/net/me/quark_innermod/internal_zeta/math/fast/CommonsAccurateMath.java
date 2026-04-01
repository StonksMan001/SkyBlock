package net.me.quark_innermod.internal_zeta.math.fast;

final class CommonsAccurateMath {
    private static final long HEX_40000000 = 1073741824L;
    private static final boolean RECOMPUTE_TABLES_AT_RUNTIME = false;
    static final int EXP_INT_TABLE_MAX_INDEX = 750;
    static final int EXP_INT_TABLE_LEN = 1500;
    static final int LN_MANT_LEN = 1024;
    static final int EXP_FRAC_TABLE_LEN = 1025;
    private static final double LOG_MAX_VALUE = StrictMath.log(Double.MAX_VALUE);

    CommonsAccurateMath() {
    }

    private static double exp_(double x, double extra, double[] hiPrec) {
        double intPartA;
        double intPartB;
        int intVal;
        if (x < 0.0) {
            intVal = (int)(-x);
            if (intVal > 746) {
                if (hiPrec != null) {
                    hiPrec[0] = 0.0;
                    hiPrec[1] = 0.0;
                }

                return 0.0;
            }

            double result;
            if (intVal > 709) {
                result = exp_(x + 40.19140625, extra, hiPrec) / 2.85040095144011776E17;
                if (hiPrec != null) {
                    hiPrec[0] /= 2.85040095144011776E17;
                    hiPrec[1] /= 2.85040095144011776E17;
                }

                return result;
            }

            if (intVal == 709) {
                result = exp_(x + 1.494140625, extra, hiPrec) / 4.455505956692757;
                if (hiPrec != null) {
                    hiPrec[0] /= 4.455505956692757;
                    hiPrec[1] /= 4.455505956692757;
                }

                return result;
            }

            ++intVal;
            intPartA = ExpIntTable.EXP_INT_TABLE_A[750 - intVal];
            intPartB = ExpIntTable.EXP_INT_TABLE_B[750 - intVal];
            intVal = -intVal;
        } else {
            intVal = (int)x;
            if (intVal > 709) {
                if (hiPrec != null) {
                    hiPrec[0] = Double.POSITIVE_INFINITY;
                    hiPrec[1] = 0.0;
                }

                return Double.POSITIVE_INFINITY;
            }

            intPartA = ExpIntTable.EXP_INT_TABLE_A[750 + intVal];
            intPartB = ExpIntTable.EXP_INT_TABLE_B[750 + intVal];
        }

        int intFrac = (int)((x - (double)intVal) * 1024.0);
        double fracPartA = ExpFracTable.EXP_FRAC_TABLE_A[intFrac];
        double fracPartB = ExpFracTable.EXP_FRAC_TABLE_B[intFrac];
        double epsilon = x - ((double)intVal + (double)intFrac / 1024.0);
        double z = 0.04168701738764507;
        z = z * epsilon + 0.1666666505023083;
        z = z * epsilon + 0.5000000000042687;
        z = z * epsilon + 1.0;
        z = z * epsilon + -3.940510424527919E-20;
        double tempA = intPartA * fracPartA;
        double tempB = intPartA * fracPartB + intPartB * fracPartA + intPartB * fracPartB;
        double tempC = tempB + tempA;
        double result;
        if (extra != 0.0) {
            result = tempC * extra * z + tempC * extra + tempC * z + tempB + tempA;
        } else {
            result = tempC * z + tempB + tempA;
        }

        if (hiPrec != null) {
            hiPrec[0] = tempA;
            hiPrec[1] = tempC * extra * z + tempC * extra + tempC * z + tempB;
        }

        return result;
    }

    static double expm1(double x) {
        return expm1_(x, (double[])null);
    }

    private static double expm1_(double x, double[] hiPrecOut) {
        if (!Double.isNaN(x) && x != 0.0) {
            if (!(x <= -1.0) && !(x >= 1.0)) {
                boolean negative = false;
                if (x < 0.0) {
                    x = -x;
                    negative = true;
                }

                int intFrac = (int)(x * 1024.0);
                double tempA = ExpFracTable.EXP_FRAC_TABLE_A[intFrac] - 1.0;
                double tempB = ExpFracTable.EXP_FRAC_TABLE_B[intFrac];
                double temp = tempA + tempB;
                tempB = -(temp - tempA - tempB);
                tempA = temp;
                temp *= 1.073741824E9;
                double baseA = tempA + temp - temp;
                double baseB = tempB + (tempA - baseA);
                double epsilon = x - (double)intFrac / 1024.0;
                double zb = 0.008336750013465571;
                zb = zb * epsilon + 0.041666663879186654;
                zb = zb * epsilon + 0.16666666666745392;
                zb = zb * epsilon + 0.49999999999999994;
                zb *= epsilon;
                zb *= epsilon;
                double temp2 = epsilon + zb;
                zb = -(temp2 - epsilon - zb);
                double za = temp2;
                temp2 *= 1.073741824E9;
                temp2 = za + temp2 - temp2;
                zb += za - temp2;
                za = temp2;
                double ya = temp2 * baseA;
                temp2 = ya + temp2 * baseB;
                double yb = -(temp2 - ya - za * baseB);
                ya = temp2;
                temp2 += zb * baseA;
                yb += -(temp2 - ya - zb * baseA);
                ya = temp2;
                temp2 += zb * baseB;
                yb += -(temp2 - ya - zb * baseB);
                ya = temp2;
                temp2 += baseA;
                yb += -(temp2 - baseA - ya);
                ya = temp2;
                temp2 += za;
                yb += -(temp2 - ya - za);
                ya = temp2;
                temp2 += baseB;
                yb += -(temp2 - ya - baseB);
                ya = temp2;
                temp2 += zb;
                yb += -(temp2 - ya - zb);
                ya = temp2;
                if (negative) {
                    double denom = 1.0 + temp2;
                    double denomr = 1.0 / denom;
                    double denomb = -(denom - 1.0 - temp2) + yb;
                    double ratio = temp2 * denomr;
                    temp2 = ratio * 1.073741824E9;
                    double ra = ratio + temp2 - temp2;
                    double rb = ratio - ra;
                    temp2 = denom * 1.073741824E9;
                    za = denom + temp2 - temp2;
                    zb = denom - za;
                    rb += (ya - za * ra - za * rb - zb * ra - zb * rb) * denomr;
                    rb += yb * denomr;
                    rb += -ya * denomb * denomr * denomr;
                    ya = -ra;
                    yb = -rb;
                }

                if (hiPrecOut != null) {
                    hiPrecOut[0] = ya;
                    hiPrecOut[1] = yb;
                }

                return ya + yb;
            } else {
                double[] hiPrec = new double[2];
                exp_(x, 0.0, hiPrec);
                if (x > 0.0) {
                    return -1.0 + hiPrec[0] + hiPrec[1];
                } else {
                    double ra = -1.0 + hiPrec[0];
                    double rb = -(ra + 1.0 - hiPrec[0]);
                    rb += hiPrec[1];
                    return ra + rb;
                }
            }
        } else {
            return x;
        }
    }

    static double cosh(double x) {
        if (Double.isNaN(x)) {
            return x;
        } else {
            double t;
            if (x > 20.0) {
                if (x >= LOG_MAX_VALUE) {
                    t = Math.exp(0.5 * x);
                    return 0.5 * t * t;
                } else {
                    return 0.5 * Math.exp(x);
                }
            } else if (x < -20.0) {
                if (x <= -LOG_MAX_VALUE) {
                    t = Math.exp(-0.5 * x);
                    return 0.5 * t * t;
                } else {
                    return 0.5 * Math.exp(-x);
                }
            } else {
                double[] hiPrec = new double[2];
                if (x < 0.0) {
                    x = -x;
                }

                exp_(x, 0.0, hiPrec);
                double ya = hiPrec[0] + hiPrec[1];
                double yb = -(ya - hiPrec[0] - hiPrec[1]);
                double temp = ya * 1.073741824E9;
                double yaa = ya + temp - temp;
                double yab = ya - yaa;
                double recip = 1.0 / ya;
                temp = recip * 1.073741824E9;
                double recipa = recip + temp - temp;
                double recipb = recip - recipa;
                recipb += (1.0 - yaa * recipa - yaa * recipb - yab * recipa - yab * recipb) * recip;
                recipb += -yb * recip * recip;
                temp = ya + recipa;
                yb += -(temp - ya - recipa);
                ya = temp;
                temp += recipb;
                yb += -(temp - ya - recipb);
                double result = temp + yb;
                result *= 0.5;
                return result;
            }
        }
    }

    static double sinh(double x) {
        boolean negate = false;
        if (Double.isNaN(x)) {
            return x;
        } else {
            double result;
            if (x > 20.0) {
                if (x >= LOG_MAX_VALUE) {
                    result = Math.exp(0.5 * x);
                    return 0.5 * result * result;
                } else {
                    return 0.5 * Math.exp(x);
                }
            } else if (x < -20.0) {
                if (x <= -LOG_MAX_VALUE) {
                    result = Math.exp(-0.5 * x);
                    return -0.5 * result * result;
                } else {
                    return -0.5 * Math.exp(-x);
                }
            } else if (x == 0.0) {
                return x;
            } else {
                if (x < 0.0) {
                    x = -x;
                    negate = true;
                }

                double[] hiPrec;
                double ya;
                double yb;
                double temp;
                double yaa;
                double yab;
                double recip;
                double recipa;
                double recipb;
                if (x > 0.25) {
                    hiPrec = new double[2];
                    exp_(x, 0.0, hiPrec);
                    ya = hiPrec[0] + hiPrec[1];
                    yb = -(ya - hiPrec[0] - hiPrec[1]);
                    temp = ya * 1.073741824E9;
                    yaa = ya + temp - temp;
                    yab = ya - yaa;
                    recip = 1.0 / ya;
                    temp = recip * 1.073741824E9;
                    recipa = recip + temp - temp;
                    recipb = recip - recipa;
                    recipb += (1.0 - yaa * recipa - yaa * recipb - yab * recipa - yab * recipb) * recip;
                    recipb += -yb * recip * recip;
                    recipa = -recipa;
                    recipb = -recipb;
                    temp = ya + recipa;
                    yb += -(temp - ya - recipa);
                    ya = temp;
                    temp += recipb;
                    yb += -(temp - ya - recipb);
                    result = temp + yb;
                    result *= 0.5;
                } else {
                    hiPrec = new double[2];
                    expm1_(x, hiPrec);
                    ya = hiPrec[0] + hiPrec[1];
                    yb = -(ya - hiPrec[0] - hiPrec[1]);
                    temp = 1.0 + ya;
                    yaa = 1.0 / temp;
                    yab = -(temp - 1.0 - ya) + yb;
                    recip = ya * yaa;
                    recipa = recip * 1.073741824E9;
                    recipb = recip + recipa - recipa;
                    double rb = recip - recipb;
                    recipa = temp * 1.073741824E9;
                    double za = temp + recipa - recipa;
                    double zb = temp - za;
                    rb += (ya - za * recipb - za * rb - zb * recipb - zb * rb) * yaa;
                    rb += yb * yaa;
                    rb += -ya * yab * yaa * yaa;
                    recipa = ya + recipb;
                    yb += -(recipa - ya - recipb);
                    ya = recipa;
                    recipa += rb;
                    yb += -(recipa - ya - rb);
                    result = recipa + yb;
                    result *= 0.5;
                }

                if (negate) {
                    result = -result;
                }

                return result;
            }
        }
    }

    static double tanh(double x) {
        boolean negate = false;
        if (Double.isNaN(x)) {
            return x;
        } else if (x > 20.0) {
            return 1.0;
        } else if (x < -20.0) {
            return -1.0;
        } else if (x == 0.0) {
            return x;
        } else {
            if (x < 0.0) {
                x = -x;
                negate = true;
            }

            double result;
            double[] hiPrec;
            double ya;
            double yb;
            double temp;
            double da;
            double db;
            double daa;
            double dab;
            double ratio;
            double ratioa;
            double ratiob;
            if (x >= 0.5) {
                hiPrec = new double[2];
                exp_(x * 2.0, 0.0, hiPrec);
                ya = hiPrec[0] + hiPrec[1];
                yb = -(ya - hiPrec[0] - hiPrec[1]);
                double na = -1.0 + ya;
                double nb = -(na + 1.0 - ya);
                temp = na + yb;
                nb += -(temp - na - yb);
                na = temp;
                da = 1.0 + ya;
                db = -(da - 1.0 - ya);
                temp = da + yb;
                db += -(temp - da - yb);
                da = temp;
                temp *= 1.073741824E9;
                daa = da + temp - temp;
                dab = da - daa;
                ratio = na / da;
                temp = ratio * 1.073741824E9;
                ratioa = ratio + temp - temp;
                ratiob = ratio - ratioa;
                ratiob += (na - daa * ratioa - daa * ratiob - dab * ratioa - dab * ratiob) / da;
                ratiob += nb / da;
                ratiob += -db * na / da / da;
                result = ratioa + ratiob;
            } else {
                hiPrec = new double[2];
                expm1_(x * 2.0, hiPrec);
                ya = hiPrec[0] + hiPrec[1];
                yb = -(ya - hiPrec[0] - hiPrec[1]);
                temp = 2.0 + ya;
                da = -(temp - 2.0 - ya);
                db = temp + yb;
                da += -(db - temp - yb);
                temp = db;
                db *= 1.073741824E9;
                daa = temp + db - db;
                dab = temp - daa;
                ratio = ya / temp;
                db = ratio * 1.073741824E9;
                ratioa = ratio + db - db;
                ratiob = ratio - ratioa;
                ratiob += (ya - daa * ratioa - daa * ratiob - dab * ratioa - dab * ratiob) / temp;
                ratiob += yb / temp;
                ratiob += -da * ya / temp / temp;
                result = ratioa + ratiob;
            }

            if (negate) {
                result = -result;
            }

            return result;
        }
    }

    private static final class ExpIntTable {
        static final double[] EXP_INT_TABLE_A = CommonsMathLiterals.loadExpIntA();
        static final double[] EXP_INT_TABLE_B = CommonsMathLiterals.loadExpIntB();

        private ExpIntTable() {
        }
    }

    private static final class ExpFracTable {
        static final double[] EXP_FRAC_TABLE_A = CommonsMathLiterals.loadExpFracA();
        static final double[] EXP_FRAC_TABLE_B = CommonsMathLiterals.loadExpFracB();

        private ExpFracTable() {
        }
    }
}
