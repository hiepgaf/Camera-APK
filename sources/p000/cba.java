package p000;

import com.google.googlex.gcam.InterleavedReadViewU8;

/* compiled from: PG */
/* renamed from: cba */
final class cba implements fow {
    /* renamed from: a */
    private final /* synthetic */ InterleavedReadViewU8 f11593a;
    /* renamed from: b */
    private final /* synthetic */ int f11594b;
    /* renamed from: c */
    private final /* synthetic */ cau f11595c;

    cba(cau cau, InterleavedReadViewU8 interleavedReadViewU8, int i) {
        this.f11595c = cau;
        this.f11593a = interleavedReadViewU8;
        this.f11594b = i;
    }

    /* renamed from: a */
    public final kpk mo568a() {
        kpk d = kpw.m18056d();
        cau cau = this.f11595c;
        car car = cau.f22638n;
        car.f20179e.execute(new cas(car, this.f11593a, d, cau.f22627c, cau.f22628d, this.f11594b));
        return d;
    }

    /* renamed from: b */
    public final kpk mo569b() {
        return kow.m13618a(new isr("RGB image couldn't be encoded into jpeg."));
    }
}
