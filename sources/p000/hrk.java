package p000;

/* compiled from: PG */
/* renamed from: hrk */
public final class hrk {
    /* renamed from: a */
    public float f6498a = 0.0f;
    /* renamed from: b */
    public float f6499b = this.f6498a;
    /* renamed from: c */
    private float f6500c;

    public hrk(float f) {
        this.f6500c = f;
    }

    /* renamed from: a */
    public final void m3308a(float f) {
        this.f6498a = f;
        this.f6499b = f;
    }

    /* renamed from: b */
    public final void m3309b(float f) {
        float f2 = this.f6498a;
        this.f6499b = f2;
        float f3 = this.f6500c;
        this.f6498a = (f2 * f3) + ((1.0f - f3) * f);
    }
}
