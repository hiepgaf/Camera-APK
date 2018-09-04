package p000;

/* compiled from: PG */
/* renamed from: gzm */
final class gzm {
    /* renamed from: a */
    public final float f5862a;
    /* renamed from: b */
    public final float f5863b;
    /* renamed from: c */
    public final float f5864c;

    public gzm(float f, float f2) {
        this.f5862a = f * 3.0f;
        float f3 = this.f5862a;
        this.f5864c = ((f2 - f) * 3.0f) - f3;
        this.f5863b = (1.0f - f3) - this.f5864c;
    }

    /* renamed from: a */
    public final float m2954a(float f) {
        return ((((this.f5863b * f) + this.f5864c) * f) + this.f5862a) * f;
    }
}
