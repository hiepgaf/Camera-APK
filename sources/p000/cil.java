package p000;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: cil */
final class cil implements Callable {
    /* renamed from: a */
    private final /* synthetic */ jmr f2060a;
    /* renamed from: b */
    private final /* synthetic */ kpk f2061b;
    /* renamed from: c */
    private final /* synthetic */ bcy f2062c;
    /* renamed from: d */
    private final /* synthetic */ chi f2063d;
    /* renamed from: e */
    private final /* synthetic */ cjo f2064e;
    /* renamed from: f */
    private final /* synthetic */ gkr f2065f;
    /* renamed from: g */
    private final /* synthetic */ boolean f2066g;
    /* renamed from: h */
    private final /* synthetic */ UUID f2067h;
    /* renamed from: i */
    private final /* synthetic */ chv f2068i;
    /* renamed from: j */
    private final /* synthetic */ cig f2069j;

    cil(cig cig, jmr jmr, kpk kpk, bcy bcy, chi chi, cjo cjo, gkr gkr, boolean z, UUID uuid, chv chv) {
        this.f2069j = cig;
        this.f2060a = jmr;
        this.f2061b = kpk;
        this.f2062c = bcy;
        this.f2063d = chi;
        this.f2064e = cjo;
        this.f2065f = gkr;
        this.f2066g = z;
        this.f2067h = uuid;
        this.f2068i = chv;
    }

    public final /* synthetic */ Object call() {
        chf chf = (chf) this.f2069j.f2045l.get();
        if (chf == null) {
            throw new NullPointerException("Attempting to start burst, but BurstCaptureCommand is null!");
        }
        grw grw = new grw();
        this.f2069j.f2043j.set(grw);
        grw.m2767a(chf.f11942a);
        cig cig = this.f2069j;
        Context context = cig.f2035b;
        jmr jmr = this.f2060a;
        kpk kpk = this.f2061b;
        cig.f2040g.get();
        bcy bcy = this.f2062c;
        chi chi = this.f2063d;
        cjn cjn = new cjn(this.f2069j, this.f2064e);
        gkr gkr = this.f2065f;
        cig cig2 = this.f2069j;
        gln gln = cig2.f2037d;
        gev b = cig2.f2027A;
        cig cig3 = this.f2069j;
        chh chj = new chj(context, jmr, kpk, bcy, chi, cjn, gkr, gln, b, grw, cig3.f2053t, this.f2066g, cig3.f2049p, this.f2067h, cig3.f2051r, cig3.f2055v, this.f2069j.f2056w);
        this.f2069j.f2044k.set(chj);
        jwa a = chj.mo685a();
        chj.mo686a(chf.f11943b, this.f2068i.f2001b);
        return a;
    }
}
