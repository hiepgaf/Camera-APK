package p000;

import com.google.googlex.gcam.InterleavedReadViewU8;

/* compiled from: PG */
/* renamed from: cay */
final class cay implements kov {
    /* renamed from: a */
    private final /* synthetic */ long f11585a;
    /* renamed from: b */
    private final /* synthetic */ hjo f11586b;
    /* renamed from: c */
    private final /* synthetic */ InterleavedReadViewU8 f11587c;
    /* renamed from: d */
    private final /* synthetic */ cau f11588d;

    cay(cau cau, long j, hjo hjo, InterleavedReadViewU8 interleavedReadViewU8) {
        this.f11588d = cau;
        this.f11585a = j;
        this.f11586b = hjo;
        this.f11587c = interleavedReadViewU8;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m866b(car.f20175a, "Error upsampling original image.");
        this.f11588d.m16914a(this.f11585a, this.f11587c, gdy.m2498c().m2501a(), 0, cat.ORIGINAL, null, this.f11586b);
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f11588d.m16914a(this.f11585a, (InterleavedReadViewU8) jri.m13152b((InterleavedReadViewU8) obj), gdy.m2498c().m2501a(), 0, cat.ORIGINAL, null, this.f11586b);
    }
}
