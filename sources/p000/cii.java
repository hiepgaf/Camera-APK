package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: cii */
final class cii implements kov {
    /* renamed from: a */
    private final /* synthetic */ cig f12033a;

    cii(cig cig) {
        this.f12033a = cig;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        cig cig = this.f12033a;
        cjo cjo = (cjo) cig.f2039f.get();
        bli.m867b(cig.f2026a, "Exception while running the burst", th);
        gqw gqw = cig.f2054u;
        if (gqw.f5643b != null) {
            gqw.m2742b();
        } else {
            gqw.f5643b = new klu();
            klu klu = gqw.f5643b;
            klu.f22401a = false;
            klu.f22404d = true;
            gqw.m2740a();
        }
        new Handler(cig.f2035b.getMainLooper()).post(new cim(cjo));
        gkr gkr = (gkr) cig.f2048o.getAndSet(null);
        if (gkr != null) {
            gkr.mo2861a();
        }
        cig.m1154a();
    }

    public final /* synthetic */ void b_(Object obj) {
        gqw gqw = this.f12033a.f2054u;
        if (gqw.f5643b != null) {
            gqw.m2742b();
            return;
        }
        gqw.f5643b = new klu();
        gqw.f5643b.f22401a = true;
    }
}
