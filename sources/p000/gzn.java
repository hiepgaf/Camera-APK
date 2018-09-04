package p000;

/* compiled from: PG */
/* renamed from: gzn */
public final class gzn {
    /* renamed from: a */
    public final gzm f5865a;
    /* renamed from: b */
    public final gzm f5866b = new gzm(0.0f, 1.0f);

    public gzn(float f, float f2) {
        this.f5865a = new gzm(f, f2);
    }

    /* renamed from: a */
    static float m2955a(float f, gzm gzm) {
        float f2 = 1.0f;
        float f3 = 0.0f;
        int i = 0;
        float f4 = f;
        while (i < 8) {
            float a = gzm.m2954a(f4) - f;
            if (Math.abs(a) >= 1.0E-6f) {
                float f5 = gzm.f5863b;
                float f6 = gzm.f5864c;
                f5 = ((((f5 * 3.0f) * f4) + (f6 + f6)) * f4) + gzm.f5862a;
                if (Math.abs(f5) < 1.0E-6f) {
                    break;
                }
                i++;
                f4 -= a / f5;
            } else {
                return f4;
            }
        }
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        f4 = f;
        while (f3 < f2) {
            float a2 = gzm.m2954a(f4);
            if (Math.abs(a2 - f) < 1.0E-6f) {
                return f4;
            }
            if (f <= a2) {
                f2 = f4;
            }
            if (f <= a2) {
                f4 = f3;
            }
            float f7 = f4;
            f4 = ((f2 - f4) * 0.5f) + f4;
            f3 = f7;
        }
        return f4;
    }

    /* renamed from: a */
    public final float m2956a(float f) {
        return this.f5866b.m2954a(gzn.m2955a(f, this.f5865a));
    }
}
