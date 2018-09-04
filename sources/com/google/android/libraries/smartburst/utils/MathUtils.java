package com.google.android.libraries.smartburst.utils;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.NavigableSet;
import p000.jri;
import p000.jzn;
import p000.jzp;
import p000.khb;
import p000.kmj;

/* compiled from: PG */
public class MathUtils {
    public static final double SQRT_TWO_PI = Math.sqrt(6.283185307179586d);

    public static float[] applyBilateralFilter1D(float[] fArr, int i, float f, float f2) {
        int length = fArr.length;
        if (length == 0) {
            return new float[0];
        }
        float[] gaussianKernel1D = getGaussianKernel1D(i, f);
        float[] a = m1359a(fArr, i);
        float[] fArr2 = new float[length];
        for (length = 0; length < fArr.length; length++) {
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (int i2 = 0; i2 < (i + i) + 1; i2++) {
                int i3 = length + i2;
                float gaussian = gaussianKernel1D[i2] * gaussian(a[i3] - a[length + i], 0.0f, f2);
                f3 += a[i3] * gaussian;
                f4 += gaussian;
            }
            fArr2[length] = f3 / f4;
        }
        return fArr2;
    }

    public static float[] applyGaussianKernel1D(float[] fArr, int i, float f) {
        if (fArr != null) {
            int length = fArr.length;
            if (length != 0) {
                float[] gaussianKernel1D = getGaussianKernel1D(i, f);
                float[] a = m1359a(fArr, i);
                float[] fArr2 = new float[length];
                for (length = 0; length < fArr.length; length++) {
                    float f2 = 0.0f;
                    for (int i2 = 0; i2 < (i + i) + 1; i2++) {
                        f2 += a[length + i2] * gaussianKernel1D[i2];
                    }
                    fArr2[length] = f2;
                }
                return fArr2;
            }
        }
        return new float[0];
    }

    public static float[] applyMedianFilter1D(float[] fArr, int i) {
        int i2 = 0;
        if (fArr != null) {
            int length = fArr.length;
            if (length != 0) {
                float[] a = m1359a(fArr, i);
                float[] fArr2 = new float[length];
                while (i2 < fArr.length) {
                    float[] copyOfRange = Arrays.copyOfRange(a, i2, ((i + i) + i2) + 1);
                    Arrays.sort(copyOfRange);
                    fArr2[i2] = copyOfRange[i];
                    i2++;
                }
                return fArr2;
            }
        }
        return new float[0];
    }

    public static jzn calcSigmoidParams(float f, float f2, float f3, float f4) {
        Math.log((1.0d / ((double) f4)) - 4.0d);
        Math.log((1.0d / ((double) f2)) - 4.0d);
        return new jzn();
    }

    public static float[] clamp(float[] fArr, float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException("Min value cannot be larger than the max value!");
        }
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Math.max(Math.min(fArr[i], f2), f);
        }
        return fArr2;
    }

    public static long closestValue(NavigableSet navigableSet, long j) {
        Long valueOf = Long.valueOf(j);
        Long l = (Long) navigableSet.floor(valueOf);
        valueOf = (Long) navigableSet.ceiling(valueOf);
        if (l == null && valueOf == null) {
            throw new IllegalStateException("No closest value found");
        } else if (l == null) {
            return valueOf.longValue();
        } else {
            if (valueOf == null) {
                return l.longValue();
            }
            if (Math.abs(l.longValue() - j) >= Math.abs(valueOf.longValue() - j)) {
                l = valueOf;
            }
            return l.longValue();
        }
    }

    /* renamed from: a */
    private static int[] m1360a(float[] fArr, boolean z) {
        int i = 1;
        int i2 = 0;
        Collection b = khb.m4885b();
        int length = fArr.length;
        if (length == 0) {
            return new int[0];
        }
        if (length == 1) {
            return new int[]{0};
        }
        if ((z && fArr[0] > fArr[1]) || (!z && fArr[0] < fArr[1])) {
            b.add(Integer.valueOf(0));
        }
        while (true) {
            int i3 = length - 1;
            if (i >= i3) {
                break;
            }
            float f = fArr[i];
            float f2 = fArr[i - 1];
            float f3 = fArr[i + 1];
            if ((z && f >= f2 && f > f3) || ((z && f > f2 && f >= f3) || ((!z && f < f2 && f <= f3) || (!z && f <= f2 && f < f3)))) {
                b.add(Integer.valueOf(i));
            }
            i++;
        }
        if ((z && fArr[i3] > fArr[length - 2]) || (!z && fArr[i3] < fArr[length - 2])) {
            b.add(Integer.valueOf(i3));
        }
        if (b instanceof kmj) {
            kmj kmj = (kmj) b;
            return Arrays.copyOfRange(kmj.f8339a, kmj.f8340b, kmj.f8341c);
        }
        Object[] toArray = b.toArray();
        i3 = toArray.length;
        int[] iArr = new int[i3];
        while (i2 < i3) {
            iArr[i2] = ((Number) jri.m13152b(toArray[i2])).intValue();
            i2++;
        }
        return iArr;
    }

    public static int[] findLocalMaxima(float[] fArr) {
        return m1360a(fArr, true);
    }

    public static int[] findLocalMinima(float[] fArr) {
        return m1360a(fArr, false);
    }

    public static jzp fitSizeAround(jzp jzp, jzp jzp2) {
        int i = jzp.f8150b;
        int i2 = jzp2.f8149a;
        int i3 = i * i2;
        int i4 = jzp2.f8150b;
        int i5 = i3 / i4;
        int i6 = jzp.f8149a;
        if (i5 >= i6) {
            return jzp.m4713a(i2, i3 / i6);
        }
        return jzp.m4713a((i4 * i6) / i, i4);
    }

    public static jzp fitSizeInside(jzp jzp, jzp jzp2) {
        int i = jzp.f8150b;
        int i2 = jzp2.f8149a;
        int i3 = i * i2;
        int i4 = jzp2.f8150b;
        int i5 = i3 / i4;
        int i6 = jzp.f8149a;
        if (i5 >= i6) {
            return jzp.m4713a((i4 * i6) / i, i4);
        }
        return jzp.m4713a(i2, i3 / i6);
    }

    public static float gaussian(float f, float f2, float f3) {
        double d = (double) ((f - f2) / f3);
        return (float) (Math.exp(d * (-0.5d * d)) / (((double) f3) * SQRT_TWO_PI));
    }

    public static float[] getGaussianKernel1D(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("Gaussian kernel size can not be negative!");
        } else if (f <= 0.0f) {
            throw new IllegalArgumentException("Gaussian kernel sigma must be positive!");
        } else {
            int i2;
            float[] fArr = new float[((i + i) + 1)];
            float f2 = 0.0f;
            for (i2 = -i; i2 <= i; i2++) {
                int i3 = i2 + i;
                fArr[i3] = gaussian((float) i2, 0.0f, f);
                f2 += fArr[i3];
            }
            for (i2 = 0; i2 < fArr.length; i2++) {
                fArr[i2] = fArr[i2] / f2;
            }
            return fArr;
        }
    }

    public static float hammingDistance(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return -1.0f;
        }
        float f = 0.0f;
        for (int i = 0; i < byteBuffer.capacity(); i += 4) {
            f += (float) Long.bitCount(((long) (byteBuffer.getInt(i) ^ byteBuffer2.getInt(i))) & 4294967295L);
        }
        return f / ((float) (byteBuffer.capacity() << 3));
    }

    public static float linearMapToRange(float f, float f2, float f3, float f4, float f5) {
        if (f2 > f3) {
            throw new IllegalArgumentException("Min threshold cannot be larger than the max threshold!");
        } else if (f4 > f5) {
            throw new IllegalArgumentException("Min output cannot be larger than the max output!");
        } else if (f <= f2) {
            return f4;
        } else {
            if (f >= f3) {
                return f5;
            }
            return f4 + (((f5 - f4) * (f - f2)) / (f3 - f2));
        }
    }

    public static float[] normalizeToRange(float[] fArr, float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException("Min value cannot be larger than the max value!");
        }
        int length = fArr.length;
        float[] fArr2 = new float[length];
        float f3 = Float.NEGATIVE_INFINITY;
        float f4 = Float.POSITIVE_INFINITY;
        int i = 0;
        while (i < length) {
            float f5 = fArr[i];
            if (f5 > f3) {
                f3 = f5;
            }
            if (f5 >= f4) {
                f5 = f4;
            }
            i++;
            f4 = f5;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (f4 == f3) {
                fArr2[i2] = f;
            } else {
                fArr2[i2] = (((fArr[i2] - f4) / (f3 - f4)) * (f2 - f)) + f;
            }
        }
        return fArr2;
    }

    /* renamed from: a */
    private static float[] m1359a(float[] fArr, int i) {
        int i2;
        Object obj = new float[(fArr.length + (i + i))];
        for (i2 = 0; i2 < i; i2++) {
            obj[i2] = fArr[0];
        }
        for (i2 = 0; i2 < i; i2++) {
            int length = fArr.length;
            obj[(i2 + length) + i] = fArr[length - 1];
        }
        System.arraycopy(fArr, 0, obj, i, fArr.length);
        return obj;
    }

    public static double sigmoid(double d, double d2, double d3) {
        return 1.0d / (Math.exp((d3 - d) * d2) + 1.0d);
    }

    public static float sigmoidf(float f, float f2, float f3) {
        return 1.0f / (((float) Math.exp((double) ((f3 - f) * f2))) + 1.0f);
    }

    public static float[] squeezeToRange(float[] fArr, float f, float f2) {
        int i = 0;
        if (f > f2) {
            throw new IllegalArgumentException("Min value cannot be larger than the max value!");
        }
        float f3;
        int length = fArr.length;
        float[] fArr2 = new float[length];
        float f4 = Float.NEGATIVE_INFINITY;
        float f5 = Float.POSITIVE_INFINITY;
        int i2 = 0;
        while (i2 < length) {
            f3 = fArr[i2];
            if (f3 > f4) {
                f4 = f3;
            }
            if (f3 >= f5) {
                f3 = f5;
            }
            i2++;
            f5 = f3;
        }
        f3 = f4 - f5;
        f4 = f2 - f;
        if (f3 <= f4) {
            for (int i3 = 0; i3 < fArr.length; i3++) {
                fArr2[i3] = (fArr[i3] - f5) + f;
            }
        } else {
            while (i < fArr.length) {
                fArr2[i] = (((fArr[i] - f5) / f3) * f4) + f;
                i++;
            }
        }
        return fArr2;
    }
}
