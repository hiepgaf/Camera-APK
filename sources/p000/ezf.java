package p000;

/* compiled from: PG */
/* renamed from: ezf */
public final class ezf implements ezi {
    /* renamed from: a */
    private final long f15803a;
    /* renamed from: b */
    private final eyn f15804b;
    /* renamed from: c */
    private final exk f15805c;
    /* renamed from: d */
    private volatile float f15806d = Float.MAX_VALUE;
    /* renamed from: e */
    private volatile float f15807e;

    public ezf(exk exk, eyn eyn) {
        this.f15804b = eyn;
        this.f15805c = exk;
        this.f15803a = (long) ((((double) eyn.f4359a) * 1.0E9d) / 30.0d);
        this.f15807e = eyn.f4362d;
    }

    /* renamed from: a */
    public final String mo1321a() {
        return "adaptive distance";
    }

    /* renamed from: a */
    public final boolean mo1322a(gid gid, gid gid2) {
        float a = this.f15805c.mo1318a(gid, gid2);
        long abs = Math.abs(gid2.f16923a - gid.f16923a);
        if (abs <= this.f15803a) {
            this.f15806d = Math.min(this.f15806d, (float) ((((double) a) * 1.0E9d) / ((double) abs)));
            float f = this.f15806d;
            eyn eyn = this.f15804b;
            if (f <= eyn.f4360b) {
                float f2 = eyn.f4363e;
                if (f < f2) {
                    f = eyn.f4361c;
                } else {
                    float f3 = eyn.f4364f;
                    if (f > f3) {
                        f = eyn.f4362d;
                    } else {
                        float f4 = eyn.f4361c;
                        f = (((f - f2) * (eyn.f4362d - f4)) / (f3 - f2)) + f4;
                    }
                }
            } else {
                f = 0.0f;
            }
            this.f15807e = f;
        }
        return a > this.f15807e;
    }
}
