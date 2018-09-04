package p000;

import android.os.Handler;
import com.google.android.apps.camera.stats.BurstSessionStatistics;

@Deprecated
/* compiled from: PG */
/* renamed from: cjn */
public final class cjn {
    /* renamed from: a */
    public final /* synthetic */ cig f2077a;
    /* renamed from: b */
    private final /* synthetic */ cjo f2078b;

    cjn(cig cig, cjo cjo) {
        this.f2077a = cig;
        this.f2078b = cjo;
    }

    /* renamed from: a */
    public final void m1159a(Exception exception) {
        this.f2077a.f2047n.close();
        this.f2077a.f2046m.mo3557a(null);
        cig cig = this.f2077a;
        cjo cjo = this.f2078b;
        bli.m867b(cig.f2026a, "Exception while running the burst", exception);
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

    /* renamed from: a */
    public final void m1158a() {
        ((BurstSessionStatistics) this.f2077a.f2052s.burstStats().getCurrentSession()).m8416h();
        bli.m871d(cig.f2026a, "onBurstPreviewAvailable");
        this.f2077a.f2046m.mo3557a(null);
    }
}
