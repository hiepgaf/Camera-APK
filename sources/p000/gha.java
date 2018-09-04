package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gha */
public final class gha extends ggr {
    /* renamed from: a */
    private final gfz f16907a;
    /* renamed from: b */
    private final iqb f16908b;
    /* renamed from: i */
    private final ggc f16909i;
    /* renamed from: j */
    private final epl f16910j;
    /* renamed from: k */
    private final ird f16911k;

    public gha(gfw gfw, Executor executor, gfv gfv, gfz gfz, get get, iqb iqb, ggc ggc, epl epl, ird ird) {
        super(gfw, executor, gfv, go.aS, get);
        this.f16907a = gfz;
        this.f16908b = iqb;
        this.f16909i = ggc;
        this.f16910j = epl;
        this.f16911k = ird;
    }

    public final void run() {
        this.f16911k.mo1903a("LuckyShot");
        this.f16908b.mo369a(this);
        klb klb = new klb();
        klb.f22316a = SystemClock.elapsedRealtimeNanos();
        ggd a = this.f16909i.mo1478a((gfw) jri.m13152b(this.g));
        klb.f22317b = SystemClock.elapsedRealtimeNanos();
        epl epl = this.f16910j;
        synchronized (epl.f4032a) {
            if (epl.f4037f == null) {
                epl.f4037f = new ArrayList();
            }
            epl.f4037f.add(klb);
        }
        gfw a2 = this.f16907a.m17362a(this.g, a.f5158a);
        if (a.f5159b.mo2084b()) {
            epl = this.f16910j;
            epk epk = (epk) a.f5159b.mo2081a();
            kkz kkz = new kkz();
            kkz.f22307a = -1;
            kkz.f22308b = epk.f4030b;
            kkz.f22309c = 0.0f;
            kkz.f22310d = 0.0f;
            kkz.f22311e = epk.f4031c;
            epm epm = epk.f4029a;
            synchronized (epl.f4032a) {
                epl.f4033b.add(kkz);
                epl.f4034c.add(epm);
            }
        }
        if (a2 != null) {
            this.c.mo1472a(a2.f5149b, this.d);
        }
        this.f16911k.mo1904b();
    }
}
