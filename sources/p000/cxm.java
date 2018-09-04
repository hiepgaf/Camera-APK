package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cxm */
public final class cxm implements ijk {
    /* renamed from: a */
    public static final String f12804a = bli.m862a("CaptureModeStartup");
    /* renamed from: b */
    public final ird f12805b;
    /* renamed from: c */
    public final cwc f12806c;
    /* renamed from: d */
    public final kpk f12807d;
    /* renamed from: e */
    public final kpw f12808e;
    /* renamed from: f */
    public final kwa f12809f;
    /* renamed from: g */
    public final gjk f12810g;
    /* renamed from: h */
    private final Executor f12811h;
    /* renamed from: i */
    private final irh f12812i;
    /* renamed from: j */
    private final ced f12813j;

    public cxm(irh irh, Executor executor, ced ced, cwc cwc, kpk kpk, kpw kpw, kwa kwa, ird ird, gjk gjk) {
        this.f12811h = executor;
        this.f12812i = irh;
        this.f12813j = ced;
        this.f12806c = cwc;
        this.f12807d = kpk;
        this.f12808e = kpw;
        this.f12809f = kwa;
        this.f12805b = ird;
        this.f12810g = gjk;
    }

    /* renamed from: a */
    public final kpk mo385a() {
        this.f12805b.mo1903a("CaptureModeStartup");
        this.f12805b.mo1903a("CameraDevice#prewarm");
        this.f12812i.m4080a(this.f12813j.f1860a, new isl());
        this.f12805b.mo1905b("OneCameraCreator#resolve");
        kpk d = kpw.m18056d();
        this.f12811h.execute(new cxp(this, d));
        this.f12805b.mo1905b("OneCameraCreator#setupCreateAndStart");
        kow.m13622a(kny.m18046a(d, new cxn(this), kpq.f8410a), new cxo(this), kpq.f8410a);
        this.f12805b.mo1904b();
        this.f12805b.mo1904b();
        return kow.m13617a(Boolean.valueOf(true));
    }
}
