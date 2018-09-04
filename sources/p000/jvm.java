package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: jvm */
public final class jvm {
    /* renamed from: a */
    public final float[] f8000a;
    /* renamed from: b */
    public final long[] f8001b;
    /* renamed from: c */
    public final List f8002c;
    /* renamed from: d */
    public final int f8003d;
    /* renamed from: e */
    private final float[] f8004e;
    /* renamed from: f */
    private final jvk f8005f;
    /* renamed from: g */
    private final float f8006g;

    protected jvm(float[] fArr, float[] fArr2, long[] jArr, List list, jvk jvk, float f, float f2) {
        this.f8000a = fArr;
        this.f8004e = fArr2;
        this.f8001b = jArr;
        this.f8002c = list;
        this.f8005f = jvk;
        this.f8006g = f;
        this.f8003d = (int) Math.ceil((double) (10.0f * f2));
    }

    /* renamed from: a */
    final double m4651a(int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException("Cluster must have at least one element!");
        }
        double[] a = jvm.m4650a(this.f8000a, i, i2);
        double[] a2 = jvm.m4650a(this.f8004e, i, i2);
        int length = a2.length;
        if (length != a.length) {
            throw new IllegalArgumentException("Input arrays must have the same dimension!");
        }
        Object obj;
        int i3;
        if (a2 == null) {
            obj = 1;
        } else if (length >= 2) {
            for (i3 = 1; i3 < a2.length; i3++) {
                if (a2[i3 - 1] > a2[i3]) {
                    obj = null;
                    break;
                }
            }
            obj = 1;
        } else {
            obj = 1;
        }
        if (obj == null) {
            throw new IllegalArgumentException("Input array for the first dimension must be sorted!");
        }
        double d;
        if (length > 1) {
            double d2;
            double d3;
            double d4;
            double d5;
            int i4 = -1;
            d = Double.NEGATIVE_INFINITY;
            i3 = 0;
            while (i3 < a.length) {
                d2 = a[i3];
                if (d2 > d) {
                    d3 = d2;
                } else {
                    d3 = d;
                }
                if (d2 > d) {
                    i4 = i3;
                }
                i3++;
                d = d3;
            }
            d3 = a[i4];
            if (Double.compare(a2[i4], a2[0]) > 0) {
                d = a[0];
                d2 = a2[i4];
                d4 = a2[0];
                d2 = (d3 - d) / (d2 - d4);
                d4 = (d4 * (-d2)) + d;
                d = 0.0d;
                for (i3 = 0; i3 < i4; i3++) {
                    d5 = ((a2[i3] * d2) + d4) - a[i3];
                    d += d5 * d5;
                }
            } else {
                d = 0.0d;
            }
            i3 = length - 1;
            if (Double.compare(a2[i3], a2[i4]) > 0) {
                d2 = a[i3];
                d4 = a2[i3];
                d5 = a2[i4];
                d3 = (d2 - d3) / (d4 - d5);
                d2 = ((-d3) * d5) + a[i4];
                while (i4 < length) {
                    d4 = ((a2[i4] * d3) + d2) - a[i4];
                    d += d4 * d4;
                    i4++;
                }
            }
        } else {
            d = 0.0d;
        }
        return ((double) this.f8006g) + d;
    }

    /* renamed from: a */
    private static double[] m4650a(float[] fArr, int i, int i2) {
        if (fArr.length <= i2 || i > i2 || i < 0) {
            throw new IllegalArgumentException("Illegal indices for list.");
        }
        double[] dArr = new double[((i2 - i) + 1)];
        for (int i3 = 0; i3 < dArr.length; i3++) {
            dArr[i3] = (double) fArr[i + i3];
        }
        return dArr;
    }
}
