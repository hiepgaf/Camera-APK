package p000;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: exz */
public final class exz implements exk {
    /* renamed from: a */
    private final ccr f15742a;

    public exz(ccr ccr) {
        this.f15742a = ccr;
    }

    /* renamed from: a */
    public final float mo1318a(gid gid, gid gid2) {
        ccr ccr = this.f15742a;
        if (ccr != null && ccr.m8017b()) {
            this.f15742a.m8014a(Math.max((gid.f16923a + gid.f16924b) + gid.f16925c, (gid2.f16923a + gid2.f16924b) + gid2.f16925c));
            ccr = this.f15742a;
            bwy bwy = ccr.f11662b;
            if (bwy != null) {
                iqp iqp = ccr.f11664d;
                long j = gid.f16924b;
                float f = gid.f16927e;
                float f2 = gid.f16928f;
                float[] a = bwy.m1029a(gid.f16931i);
                long j2 = gid.f16923a;
                long j3 = gid.f16925c;
                long j4 = gid.f16930h;
                long j5 = gid2.f16924b;
                float f3 = gid2.f16927e;
                float f4 = gid2.f16928f;
                float[] a2 = bwy.m1029a(gid2.f16931i);
                long j6 = gid2.f16923a;
                long j7 = gid2.f16925c;
                long j8 = gid2.f16930h;
                long a3 = bwy.m1025a(j2, j3, a);
                long a4 = bwy.m1025a(j4, j3, a);
                j4 = bwy.m1026a(j3, a);
                long a5 = bwy.m1025a(j6, j7, a2);
                long a6 = bwy.m1025a(j8, j7, a2);
                j8 = bwy.m1026a(j7, a2);
                j2 = bwy.m1023a(a3, j4, j);
                float a7 = bwy.m1024a(f, f2, a);
                long a8 = bwy.m1023a(a5, j8, j5);
                float a9 = bwy.m1024a(f3, f4, a2);
                a = bwy.m1028a(a4, j4, j, bwy.f1671c, a, false);
                float[] a10 = bwy.m1028a(a6, j8, j5, bwy.f1671c, a2, false);
                jdf a11 = jdf.m4417a(bwy.f1669a.mo643a(j2, a7, a[0], a[1], a8, a9, a10[0], a10[1], 0));
                ArrayList arrayList = new ArrayList();
                arrayList.add(new float[]{null, null});
                arrayList.add(new float[]{(float) iqp.f7329a, null});
                arrayList.add(new float[]{null, (float) iqp.f7330b});
                arrayList.add(new float[]{(float) iqp.f7329a, (float) iqp.f7330b});
                int size = arrayList.size();
                float f5 = 0.0f;
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    float[] fArr = (float[]) arrayList.get(i);
                    a = a11.f7718a;
                    float f6 = a[6];
                    float f7 = fArr[0];
                    a9 = a[7];
                    float f8 = fArr[1];
                    f6 = ((f6 * f7) + (a9 * f8)) + a[8];
                    float[] fArr2 = new float[2];
                    fArr2[0] = (((f7 * a[0]) + (f8 * a[1])) + a[2]) / f6;
                    fArr2[1] = (a[5] + ((a[3] * fArr[0]) + (a[4] * fArr[1]))) / f6;
                    f5 = (float) Math.max((double) f5, Math.hypot((double) (fArr2[0] - fArr[0]), (double) (fArr2[1] - fArr[1])));
                    i = i2;
                }
                return f5;
            }
        }
        return -1.0f;
    }

    public final String toString() {
        return "GyroFrameDistanceMetric";
    }
}
