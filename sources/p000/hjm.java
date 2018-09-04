package p000;

/* compiled from: PG */
/* renamed from: hjm */
public final class hjm {
    /* renamed from: a */
    public float f6274a = 0.0f;
    /* renamed from: b */
    private final float f6275b;
    /* renamed from: c */
    private float f6276c = 0.0f;

    public hjm(int i) {
        this.f6275b = (float) i;
    }

    /* renamed from: a */
    public final void m3208a(float f) {
        float f2 = this.f6276c;
        float f3 = this.f6275b;
        if (f2 != f3) {
            f3 = f2 + 1.0f;
        }
        this.f6276c = f3;
        f3 = 1.0f / this.f6276c;
        this.f6274a = (f3 * f) + (this.f6274a * (1.0f - f3));
    }
}
