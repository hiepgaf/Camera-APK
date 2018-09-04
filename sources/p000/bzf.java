package p000;

import com.google.googlex.gcam.ProgressCallback;

/* compiled from: PG */
/* renamed from: bzf */
final class bzf extends ProgressCallback {
    /* renamed from: a */
    private final /* synthetic */ bzx f11525a;

    bzf(bzx bzx) {
        this.f11525a = bzx;
    }

    public final void Run(int i, float f) {
        jri.m13153b(this.f11525a.mo601g().mo2084b());
        caf caf = (caf) this.f11525a.mo601g().mo2081a();
        ccy ccy = caf.f1790a;
        fwa fwa = caf.f1791b;
        if (ccy.f11682d.mo2084b()) {
            ccy.f11682d.mo2081a();
            f *= 0.5f;
        }
        fwa.f4755d.mo3050a(f);
    }
}
