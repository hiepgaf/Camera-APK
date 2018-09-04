package p000;

/* compiled from: PG */
/* renamed from: jvr */
public final class jvr implements jvs {
    /* renamed from: a */
    private final int f19072a = 2;
    /* renamed from: b */
    private final int f19073b = 1;
    /* renamed from: c */
    private final float f19074c;
    /* renamed from: d */
    private final float f19075d;

    public jvr(float f, float f2) {
        jri.m13143a(true);
        jri.m13143a(true);
        this.f19074c = f;
        this.f19075d = f2;
    }

    /* renamed from: a */
    public final float mo2055a(juh juh, long j) {
        if (j < juh.f7986c || j > juh.f7987d) {
            throw new IllegalArgumentException("No threshold for timestamp outside frame segment.");
        }
        int indexOf = ken.m13458a(juh.f7984a).indexOf(Long.valueOf(j));
        if (indexOf < this.f19072a || indexOf >= juh.m4648d() - this.f19073b) {
            return this.f19074c;
        }
        return this.f19075d;
    }

    public final String toString() {
        float f = this.f19074c;
        float f2 = this.f19075d;
        int i = this.f19072a;
        int i2 = this.f19073b;
        StringBuilder stringBuilder = new StringBuilder(190);
        stringBuilder.append("DifferentStartEndThresholdGenerator[threshold for start/end frames=");
        stringBuilder.append(f);
        stringBuilder.append(", threshold for middle frames=");
        stringBuilder.append(f2);
        stringBuilder.append(", start frames count=");
        stringBuilder.append(i);
        stringBuilder.append(", end frames count=");
        stringBuilder.append(i2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
