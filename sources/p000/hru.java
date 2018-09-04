package p000;

/* compiled from: PG */
/* renamed from: hru */
public final class hru {
    /* renamed from: a */
    public hrk f6522a = new hrk(0.9f);
    /* renamed from: b */
    public long f6523b;
    /* renamed from: c */
    private long f6524c;
    /* renamed from: d */
    private long f6525d;

    public hru() {
        m3314b();
        this.f6522a.m3308a(0.0f);
    }

    /* renamed from: a */
    public final float m3312a() {
        return ((float) (this.f6525d - this.f6524c)) / 1.0E9f;
    }

    /* renamed from: b */
    public final void m3314b() {
        this.f6523b = 0;
        this.f6524c = 0;
        this.f6525d = 0;
    }

    /* renamed from: a */
    public final void m3313a(long j) {
        float f = 1.0E9f / ((float) (j - this.f6525d));
        long j2 = this.f6523b;
        if (j2 == 0) {
            this.f6524c = j;
        } else if (j2 == 1) {
            this.f6522a.m3308a(f);
        } else {
            this.f6522a.m3309b(f);
        }
        this.f6525d = j;
        this.f6523b++;
    }
}
