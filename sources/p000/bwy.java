package p000;

import android.graphics.Rect;
import android.util.SizeF;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: bwy */
public final class bwy {
    /* renamed from: a */
    public final cde f1669a;
    /* renamed from: b */
    public final int f1670b;
    /* renamed from: c */
    public final iqp f1671c;
    /* renamed from: d */
    public final long f1672d;
    /* renamed from: e */
    private final cdk f1673e;
    /* renamed from: f */
    private final SizeF f1674f;
    /* renamed from: g */
    private final iqp f1675g;
    /* renamed from: h */
    private final float f1676h;
    /* renamed from: i */
    private final Object f1677i;
    /* renamed from: j */
    private final AtomicReference f1678j;

    public bwy(SizeF sizeF, iqp iqp, iqp iqp2, cde cde, cdk cdk) {
        this(sizeF, iqp, iqp2, 12, cde, cdk);
        this.f1677i = new Object();
        this.f1678j = new AtomicReference();
        List arrayList = new ArrayList(12);
        for (int i = 0; i < 12; i++) {
            arrayList.add(0, jdf.m4417a(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}));
        }
        this.f1678j.set(arrayList);
    }

    private bwy(SizeF sizeF, iqp iqp, iqp iqp2, int i, cde cde, cdk cdk) {
        jri.m13143a(true);
        this.f1674f = sizeF;
        this.f1671c = iqp;
        this.f1675g = iqp2;
        this.f1672d = 0;
        this.f1670b = 12;
        this.f1669a = cde;
        this.f1673e = cdk;
        float width = sizeF.getWidth() / sizeF.getHeight();
        float f = ((float) iqp.f7329a) / ((float) iqp.f7330b);
        this.f1676h = ((f / width) - 4.0f) / ((f + f) / width);
    }

    /* renamed from: a */
    public final long m1026a(long j, float[] fArr) {
        float f = this.f1676h;
        return (long) (((1.0f - (f + f)) * ((float) j)) / fArr[1]);
    }

    /* renamed from: a */
    public final long m1025a(long j, long j2, float[] fArr) {
        if (j <= 0) {
            return j;
        }
        float f = (float) j2;
        return (((long) (this.f1676h * f)) + j) + ((long) (f * (0.5f - (0.5f / fArr[1]))));
    }

    /* renamed from: a */
    public static long m1023a(long j, long j2, long j3) {
        return ((j2 + j3) / 2) + j;
    }

    /* renamed from: a */
    public final float m1024a(float f, float f2, float[] fArr) {
        return ((fArr[0] + fArr[1]) * 0.5f) * (((1.0f / ((1.0f / f) - (f2 / 1000.0f))) * ((float) this.f1671c.f7329a)) / this.f1674f.getWidth());
    }

    /* renamed from: a */
    public final float[] m1028a(long j, long j2, long j3, iqp iqp, float[] fArr, boolean z) {
        float[] fArr2 = new float[]{0.0f, 0.0f};
        if (j >= 0) {
            long a = bwy.m1023a(j, j2, j3);
            if (z) {
                fArr2 = this.f1673e.mo646a(a, j3);
            } else {
                fArr2 = this.f1673e.mo645a(a);
            }
        }
        float[] fArr3 = new float[2];
        fArr3[0] = ((float) (iqp.f7329a - 1)) * ((fArr2[0] * fArr[0]) + 0.5f);
        fArr3[1] = ((fArr2[1] * fArr[1]) + 0.5f) * ((float) (iqp.f7330b - 1));
        return fArr3;
    }

    /* renamed from: a */
    public final List m1027a(gid gid) {
        ArrayList arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        long j = gid.f16924b;
        float f = gid.f16927e;
        float f2 = gid.f16928f;
        float[] a = m1029a(gid.f16931i);
        float a2 = m1024a(f, f2, a);
        long j2 = gid.f16923a;
        long j3 = gid.f16925c;
        long j4 = gid.f16930h;
        long a3 = m1025a(j2, j3, a);
        long a4 = m1025a(j4, j3, a);
        long a5 = m1026a(j3, a);
        float[] fArr = null;
        int i = 0;
        while (true) {
            int i2 = this.f1670b;
            if (i >= i2) {
                break;
            }
            j4 = ((long) i) * a5;
            long j5 = (long) i2;
            j5 = bwy.m1023a(a3 + (j4 / j5), a5 / j5, j);
            j2 = (long) this.f1670b;
            float[] a6 = m1028a(a4 + (j4 / j2), a5 / j2, j, this.f1671c, a, true);
            float[] fArr2 = new float[9];
            if (!(this.f1669a.mo642a(j5, a2, a6[0], a6[1], 0, fArr2) || fArr == null)) {
                fArr2 = fArr;
            }
            arrayList.add(jdf.m4417a(fArr2));
            i++;
            fArr = fArr2;
        }
        synchronized (this.f1677i) {
            List list = (List) this.f1678j.get();
            for (int i3 = 0; i3 < this.f1670b; i3++) {
                jdf a7;
                jdf a8;
                float[] fArr3 = ((jdf) list.get(i3)).f7718a;
                float f3 = fArr3[0];
                float f4 = fArr3[4];
                float f5 = fArr3[8];
                float f6 = fArr3[5];
                float f7 = fArr3[7];
                float f8 = (f4 * f5) - (f6 * f7);
                float f9 = fArr3[1];
                float f10 = fArr3[3];
                float f11 = fArr3[6];
                double d = ((double) (fArr3[2] * ((f10 * f7) - (f4 * f11)))) + ((((double) (f3 * f8)) + 0.0d) - ((double) (((f10 * f5) - (f6 * f11)) * f9)));
                if (d != 0.0d) {
                    f3 = (float) (1.0d / d);
                    float[] fArr4 = new float[9];
                    fArr4[0] = f8 * f3;
                    fArr4[1] = (-((fArr3[1] * fArr3[8]) - (fArr3[2] * fArr3[7]))) * f3;
                    fArr4[2] = ((fArr3[1] * fArr3[5]) - (fArr3[2] * fArr3[4])) * f3;
                    fArr4[3] = (-((fArr3[3] * fArr3[8]) - (fArr3[5] * fArr3[6]))) * f3;
                    fArr4[4] = ((fArr3[0] * fArr3[8]) - (fArr3[2] * fArr3[6])) * f3;
                    fArr4[5] = (-((fArr3[0] * fArr3[5]) - (fArr3[2] * fArr3[3]))) * f3;
                    fArr4[6] = ((fArr3[3] * fArr3[7]) - (fArr3[4] * fArr3[6])) * f3;
                    fArr4[7] = (-((fArr3[0] * fArr3[7]) - (fArr3[1] * fArr3[6]))) * f3;
                    fArr4[8] = ((fArr3[0] * fArr3[4]) - (fArr3[3] * fArr3[1])) * f3;
                    a7 = jdf.m4417a(fArr4);
                } else {
                    a7 = null;
                }
                if (a7 == null) {
                    bli.m866b("RelativeGyroTransformCalculator", "Inverse could not be computed. Defaulting to identity");
                    a8 = jdf.m4417a(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                } else {
                    a8 = a7;
                }
                a7 = (jdf) arrayList.get(i3);
                float[] a9 = a8.m4418a();
                float[] fArr5 = new float[9];
                for (int i4 = 0; i4 < 3; i4++) {
                    for (int i5 = 0; i5 < 3; i5++) {
                        for (int i6 = 0; i6 < 3; i6++) {
                            int i7 = i4 * 3;
                            int i8 = i7 + i5;
                            fArr5[i8] = (a7.f7718a[i7 + i6] * a9[(i6 * 3) + i5]) + fArr5[i8];
                        }
                    }
                }
                arrayList2.add(jdf.m4417a(fArr5));
            }
            this.f1678j.set(arrayList);
        }
        return arrayList2;
    }

    /* renamed from: a */
    public final float[] m1029a(Rect rect) {
        float[] fArr = new float[]{1.0f, 1.0f};
        if (rect != null) {
            iqp iqp = this.f1675g;
            fArr[0] = ((float) iqp.f7329a) / ((float) (rect.right - rect.left));
            fArr[1] = ((float) iqp.f7330b) / ((float) (rect.bottom - rect.top));
        }
        return fArr;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f1671c);
        String valueOf2 = String.valueOf(this.f1674f);
        int i = this.f1670b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 113) + String.valueOf(valueOf2).length());
        stringBuilder.append("AbsoluteGyroTransformCalculator{imageSize=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", sensorSize=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", timeoutMs=");
        stringBuilder.append(0);
        stringBuilder.append(", numOfStrips=");
        stringBuilder.append(i);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
