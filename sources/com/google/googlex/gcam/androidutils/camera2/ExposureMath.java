package com.google.googlex.gcam.androidutils.camera2;

import android.util.Range;
import android.util.Rational;

/* compiled from: PG */
public final class ExposureMath {
    private ExposureMath() {
    }

    public static int approximateEVStepsForGain(double d, Rational rational, Range range) {
        int intValue = ((Integer) range.getLower()).intValue();
        int intValue2 = ((Integer) range.getUpper()).intValue();
        int i = -1;
        double d2 = Double.POSITIVE_INFINITY;
        while (intValue <= intValue2) {
            double abs = Math.abs(d - gainForEVStep(intValue, rational));
            double d3 = abs < d2 ? abs : d2;
            if (abs < d2) {
                i = intValue;
            }
            intValue++;
            d2 = d3;
        }
        return i;
    }

    public static double evForGain(double d) {
        return Math.log(d) / Math.log(2.0d);
    }

    public static double gainForEV(double d) {
        return Math.pow(2.0d, d);
    }

    public static double gainForEVStep(int i, Rational rational) {
        return gainForEV(new Rational(rational.getNumerator() * i, rational.getDenominator()).doubleValue());
    }
}
