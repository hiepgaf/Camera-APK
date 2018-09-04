package p000;

/* compiled from: PG */
/* renamed from: kw */
final class kw {
    /* renamed from: a */
    public int f8724a;
    /* renamed from: b */
    public int f8725b;
    /* renamed from: c */
    public float f8726c;
    /* renamed from: d */
    public float f8727d;
    /* renamed from: e */
    public long f8728e = Long.MIN_VALUE;
    /* renamed from: f */
    public long f8729f = 0;
    /* renamed from: g */
    public int f8730g = 0;
    /* renamed from: h */
    public long f8731h = -1;
    /* renamed from: i */
    public float f8732i;
    /* renamed from: j */
    public int f8733j;

    kw() {
    }

    /* renamed from: a */
    final float m5474a(long j) {
        long j2 = this.f8728e;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f8731h;
        if (j3 < 0 || j < j3) {
            return kv.m5364a(((float) (j - j2)) / ((float) this.f8724a), 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f8732i;
        return (kv.m5364a(((float) (j - j3)) / ((float) this.f8733j), 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
