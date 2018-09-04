package p000;

import com.google.android.apps.refocus.image.RGBZ;

/* compiled from: PG */
/* renamed from: hsk */
public final class hsk {
    /* renamed from: b */
    private static final String f6577b = bli.m862a("LensController");
    /* renamed from: a */
    public float f6578a = 1.0f;
    /* renamed from: c */
    private float[] f6579c = new float[64];
    /* renamed from: d */
    private float f6580d = 1.0f;
    /* renamed from: e */
    private float f6581e = (this.f6580d + 1.0E-6f);

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hsk(com.google.android.apps.refocus.image.RGBZ r12) {
        /*
        r11 = this;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 0;
        r11.<init>();
        r0 = 64;
        r0 = new float[r0];
        r11.f6579c = r0;
        r11.f6578a = r1;
        r11.f6580d = r1;
        r0 = r11.f6580d;
        r1 = 897988541; // 0x358637bd float:1.0E-6 double:4.436652885E-315;
        r0 = r0 + r1;
        r11.f6581e = r0;
        if (r12 != 0) goto L_0x001b;
    L_0x001a:
        return;
    L_0x001b:
        if (r12 == 0) goto L_0x0023;
    L_0x001d:
        r0 = r12.getDepthTransform();
        if (r0 != 0) goto L_0x00a1;
    L_0x0023:
        r0 = f6577b;
        r1 = "The RGBZ was invalid or had no depth!";
        p000.bli.m866b(r0, r1);
    L_0x002a:
        r1 = r11.f6580d;
        r2 = r11.f6581e;
        r4 = r12.getWidth();
        r6 = r12.getHeight();
        r0 = r12;
        r5 = r3;
        r0 = p000.hsk.m3344a(r0, r1, r2, r3, r4, r5, r6);
        r11.f6579c = r0;
        r5 = r11.f6580d;
        r6 = r11.f6581e;
        r0 = r12.getWidth();
        r1 = r12.getHeight();
        r0 = java.lang.Math.max(r0, r1);
        r0 = (float) r0;
        r1 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r0 = r0 * r1;
        r0 = (int) r0;
        r0 = r0 / 2;
        r1 = r12.getWidth();
        r1 = r1 / 2;
        r7 = r1 - r0;
        r1 = r12.getWidth();
        r1 = r1 / 2;
        r8 = r1 + r0;
        r1 = r12.getHeight();
        r1 = r1 / 2;
        r9 = r1 - r0;
        r1 = r12.getHeight();
        r1 = r1 / 2;
        r10 = r1 + r0;
        r4 = r12;
        r2 = p000.hsk.m3344a(r4, r5, r6, r7, r8, r9, r10);
        r0 = r2.length;
        r1 = r0 + -1;
        r0 = 0;
    L_0x007f:
        r4 = r2.length;
        if (r3 >= r4) goto L_0x008f;
    L_0x0082:
        r7 = r2[r3];
        r0 = r0 + r7;
        r7 = 1053609165; // 0x3ecccccd float:0.4 double:5.205520926E-315;
        r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r7 > 0) goto L_0x0090;
    L_0x008c:
        r3 = r3 + 1;
        goto L_0x007f;
    L_0x008f:
        r3 = r1;
    L_0x0090:
        r0 = r6 * r5;
        r1 = r6 - r5;
        r2 = (float) r3;
        r1 = r1 * r2;
        r2 = r4 + -1;
        r2 = (float) r2;
        r1 = r1 / r2;
        r1 = r6 - r1;
        r0 = r0 / r1;
        r11.f6578a = r0;
        goto L_0x001a;
    L_0x00a1:
        r0 = r12.getDepthTransform();
        r0 = r0.getNear();
        r11.f6580d = r0;
        r0 = r12.getDepthTransform();
        r0 = r0.getFar();
        r11.f6581e = r0;
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: hsk.<init>(com.google.android.apps.refocus.image.RGBZ):void");
    }

    /* renamed from: a */
    public final float m3346a(float f, float f2, float f3) {
        float a = m3345a(f, f2);
        return a == 0.0f ? f3 : f3 / a;
    }

    /* renamed from: a */
    public final float m3345a(float f, float f2) {
        float f3 = f * (1.0f - f2);
        float f4 = f * (f2 + 1.0f);
        float f5 = 0.0f;
        for (int i = 0; i < 64; i++) {
            float f6 = this.f6581e;
            float f7 = this.f6580d;
            f6 = (f6 * f7) / (f6 - (((f6 - f7) * ((float) i)) / 63.0f));
            f5 += ((Math.max(f3 - f6, 0.0f) + Math.max(f6 - f4, 0.0f)) * this.f6579c[i]) / f6;
        }
        return f5;
    }

    /* renamed from: a */
    private static float[] m3344a(RGBZ rgbz, float f, float f2, int i, int i2, int i3, int i4) {
        int i5 = (i / 10) * 10;
        int i6 = (i3 / 10) * 10;
        rgbz.getWidth();
        float[] fArr = new float[64];
        for (int i7 = i6; i7 < i4; i7 += 10) {
            for (i6 = i5; i6 < i2; i6 += 10) {
                float depth = rgbz.getDepth(i6, i7);
                if (depth > 0.0f) {
                    int i8 = (int) (((f2 - ((f * f2) / depth)) / (f2 - f)) * 63.0f);
                    fArr[i8] = fArr[i8] + 1.0f;
                }
            }
        }
        float f3 = 0.0f;
        for (i6 = 0; i6 < 64; i6++) {
            f3 += fArr[i6];
        }
        if (f3 > 0.0f) {
            for (i6 = 0; i6 < 64; i6++) {
                fArr[i6] = fArr[i6] / f3;
            }
        }
        return fArr;
    }

    /* renamed from: a */
    public static float m3343a() {
        return 0.1f;
    }
}
