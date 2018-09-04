package com.google.googlex.gcam.androidutils;

/* compiled from: PG */
public class MathUtils {
    public static float clamp(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        if (f > f3) {
            return f3;
        }
        return f;
    }

    public static int clamp(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        if (i > i3) {
            return i3;
        }
        return i;
    }

    public static float divideToFloat(int i, int i2) {
        return ((float) i) / ((float) i2);
    }

    public static float linearRescaleRanges(float f, float f2, float f3, float f4, float f5) {
        return (((f - f2) / (f3 - f2)) * (f5 - f4)) + f4;
    }

    public static int linearRescaleRangesAndRound(float f, float f2, float f3, float f4, float f5) {
        return (int) (((((f - f2) / (f3 - f2)) * (f5 - f4)) + f4) + 0.5f);
    }

    public static int mod(int i, int i2) {
        return ((i % i2) + i2) % i2;
    }

    public static int numBins(int i, int i2) {
        return (int) Math.ceil((double) (((float) i) / ((float) i2)));
    }

    public static int roundToInt(float f) {
        return (int) (0.5f + f);
    }

    public static int unsignedShortAsInt(short s) {
        return (char) s;
    }
}
