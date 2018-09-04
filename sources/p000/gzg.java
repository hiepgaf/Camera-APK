package p000;

/* compiled from: PG */
/* renamed from: gzg */
public final class gzg {
    /* renamed from: a */
    public float f5853a;
    /* renamed from: b */
    public float f5854b;
    /* renamed from: c */
    private final float f5855c;
    /* renamed from: d */
    private final float f5856d;
    /* renamed from: e */
    private float f5857e;

    public gzg() {
        this((byte) 0);
    }

    private gzg(byte b) {
        this.f5853a = 0.0f;
        this.f5857e = 0.0f;
        this.f5854b = 0.0f;
        this.f5856d = 200.0f;
        this.f5855c = 3.75f;
    }

    /* renamed from: a */
    public final boolean m2950a() {
        return Math.abs(this.f5857e) >= 0.01f || Math.abs(this.f5853a - this.f5854b) >= 0.01f;
    }

    /* renamed from: b */
    public final void m2951b() {
        this.f5853a = this.f5854b;
        this.f5857e = 0.0f;
    }

    /* renamed from: a */
    public final float m2949a(float f) {
        float f2 = (f / this.f5856d) * this.f5855c;
        if (f2 > 1.0f || f2 < 0.0f) {
            m2951b();
            return this.f5854b;
        }
        float f3 = this.f5853a;
        float f4 = this.f5854b;
        float f5 = this.f5857e;
        this.f5857e = (((f3 - f4) - (f5 + f5)) * f2) + f5;
        this.f5854b = (f2 * this.f5857e) + f4;
        if (!m2950a()) {
            m2951b();
        }
        return this.f5854b;
    }
}
