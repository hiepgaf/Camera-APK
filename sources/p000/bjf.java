package p000;

/* compiled from: PG */
/* renamed from: bjf */
enum bjf {
    FPS_30(20000001, 33333333, 1.0f),
    FPS_60(0, 20000000, 1.5f);
    
    /* renamed from: c */
    public final float f1204c;
    /* renamed from: d */
    private final long f1205d;
    /* renamed from: e */
    private final long f1206e;

    private bjf(long j, long j2, float f) {
        this.f1205d = j;
        this.f1206e = j2;
        this.f1204c = f;
    }

    /* renamed from: a */
    final boolean m839a(long j) {
        return j >= this.f1205d && j <= this.f1206e;
    }
}
