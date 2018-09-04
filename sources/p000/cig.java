package p000;

import android.content.Context;
import android.location.Location;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.libraries.smartburst.filterfw.SurfaceTexTransform;
import com.google.android.libraries.smartburst.filterfw.SurfaceTextureStreamer;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: cig */
public final class cig {
    /* renamed from: a */
    public static final String f2026a = bli.m862a("BurstFacadeRun");
    /* renamed from: A */
    private final gev f2027A;
    /* renamed from: B */
    private final iqm f2028B;
    /* renamed from: C */
    private final int f2029C;
    /* renamed from: D */
    private final dod f2030D;
    /* renamed from: E */
    private final bcy f2031E;
    /* renamed from: F */
    private final ilp f2032F;
    /* renamed from: G */
    private final iqp f2033G;
    /* renamed from: H */
    private kpk f2034H = null;
    /* renamed from: b */
    public final Context f2035b;
    /* renamed from: c */
    public final chv f2036c;
    /* renamed from: d */
    public final gln f2037d;
    /* renamed from: e */
    public final iut f2038e;
    /* renamed from: f */
    public final AtomicReference f2039f;
    /* renamed from: g */
    public final AtomicReference f2040g;
    /* renamed from: h */
    public kpk f2041h = null;
    /* renamed from: i */
    public final AtomicReference f2042i = new AtomicReference();
    /* renamed from: j */
    public final AtomicReference f2043j = new AtomicReference();
    /* renamed from: k */
    public final AtomicReference f2044k = new AtomicReference();
    /* renamed from: l */
    public final AtomicReference f2045l = new AtomicReference();
    /* renamed from: m */
    public final kpw f2046m = kpw.m18056d();
    /* renamed from: n */
    public final iqo f2047n;
    /* renamed from: o */
    public final AtomicReference f2048o = new AtomicReference();
    /* renamed from: p */
    public final gsp f2049p;
    /* renamed from: q */
    public final gsl f2050q;
    /* renamed from: r */
    public final ird f2051r;
    /* renamed from: s */
    public final Instrumentation f2052s;
    /* renamed from: t */
    public final SurfaceTextureStreamer f2053t;
    /* renamed from: u */
    public final gqw f2054u;
    /* renamed from: v */
    public final irs f2055v;
    /* renamed from: w */
    public final glj f2056w;
    /* renamed from: x */
    public volatile long f2057x = 0;
    /* renamed from: y */
    private final iqp f2058y;
    /* renamed from: z */
    private final gks f2059z;

    public cig(Context context, iqp iqp, chv chv, gks gks, gln gln, gev gev, iqm iqm, iut iut, int i, dod dod, bcy bcy, cjo cjo, ilp ilp, AtomicReference atomicReference, SurfaceTextureStreamer surfaceTextureStreamer, iqo iqo, gsp gsp, gsl gsl, ird ird, Instrumentation instrumentation, irs irs, iqp iqp2, glj glj) {
        this.f2035b = (Context) jri.m13152b((Object) context);
        this.f2058y = (iqp) jri.m13152b((Object) iqp);
        this.f2036c = (chv) jri.m13152b((Object) chv);
        this.f2059z = (gks) jri.m13152b((Object) gks);
        this.f2037d = (gln) jri.m13152b((Object) gln);
        this.f2027A = (gev) jri.m13152b((Object) gev);
        this.f2028B = (iqm) jri.m13152b((Object) iqm);
        this.f2038e = (iut) jri.m13152b((Object) iut);
        this.f2029C = i;
        this.f2030D = (dod) jri.m13152b((Object) dod);
        this.f2031E = (bcy) jri.m13152b((Object) bcy);
        this.f2032F = (ilp) jri.m13152b((Object) ilp);
        this.f2040g = (AtomicReference) jri.m13152b((Object) atomicReference);
        this.f2039f = new AtomicReference(cjo);
        this.f2047n = (iqo) jri.m13152b((Object) iqo);
        this.f2049p = (gsp) jri.m13152b((Object) gsp);
        this.f2050q = (gsl) jri.m13152b((Object) gsl);
        this.f2051r = ird;
        this.f2052s = instrumentation;
        this.f2053t = surfaceTextureStreamer;
        this.f2055v = irs;
        this.f2033G = iqp2;
        this.f2056w = glj;
        this.f2054u = new gqw(new cih(irs));
    }

    /* renamed from: a */
    public final void m1154a() {
        jli.m12940a(m1156c()).mo1977a(khx.m4940a(), new cin(this)).mo1980a(izw.f18704a);
    }

    /* renamed from: b */
    public final synchronized kpk m1155b() {
        boolean z;
        this.f2051r.mo1903a("BurstFacadeRunner#run");
        HandlerThread handlerThread = new HandlerThread("burst_handler");
        this.f2042i.set(handlerThread);
        handlerThread.start();
        ijx a = cht.m1128a(handlerThread);
        UUID randomUUID = UUID.randomUUID();
        cwj cwj = this.f2059z.f5336a;
        long currentTimeMillis = System.currentTimeMillis();
        Location d = cwj.f12713i.mo1244d();
        String a2 = cwj.f12708d.m2812a(currentTimeMillis);
        gln gln = cwj.f12710f.f1041a;
        gkr a3 = cwj.f12712h.m2590a(a2, currentTimeMillis, kbg.m4744b(d));
        iqp a4 = cwj.m8836a(cwj.f12717m.f2818d.f6105a);
        gln.mo1504a(a3);
        a3.mo2872a(a4, glw.BURST);
        a3.mo2875b(0);
        a3.mo2871a(hci.m11749a((int) R.string.burst_process_start, new Object[0]));
        this.f2048o.set(a3);
        cjo cjo = (cjo) this.f2039f.get();
        ikd.m12259a();
        if (!cjo.f2081c) {
            cjo.f2079a.mo1445c();
            cjo.f2080b.m1157a(false);
            cjo.f2081c = true;
        }
        jmr jmr = (jmr) this.f2030D.mo2860b();
        boolean booleanValue = ((Boolean) this.f2032F.mo2860b()).booleanValue();
        String str = f2026a;
        int i = this.f2028B.f7326e;
        int i2 = this.f2029C;
        String valueOf = String.valueOf(jmr);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 116);
        stringBuilder.append("Starting burst. Device orientation: ");
        stringBuilder.append(i);
        stringBuilder.append(" image orientation: ");
        stringBuilder.append(i2);
        stringBuilder.append(" mode: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" auto generate artifacts: ");
        stringBuilder.append(booleanValue);
        bli.m863a(str, stringBuilder.toString());
        iqp iqp = this.f2058y;
        i = iqp.f7329a;
        i2 = iqp.f7330b;
        int i3 = this.f2029C;
        if (this.f2038e == iut.FRONT) {
            z = true;
        } else {
            z = false;
        }
        chi chi = new chi(i, i2, i3, z, this.f2028B.f7326e);
        Object d2 = kpw.m18056d();
        this.f2053t.setTransform(SurfaceTexTransform.create(chi.f1990d, chi.f1991e, true));
        jmr jmr2 = jmr;
        chi chi2 = chi;
        kpk a5 = kpl.m13628a(new cil(this, jmr2, d2, this.f2031E, chi2, (cjo) this.f2039f.get(), a3, booleanValue, randomUUID, this.f2036c));
        this.f2041h = kow.m13617a(Boolean.valueOf(true));
        try {
            Object obj;
            ckj ckr;
            ckl ckl = this.f2036c.f2003d;
            iqm a6 = iqm.m4037a(this.f2029C);
            if (jmr == jmr.HYBRID_BURST) {
                obj = 1;
            } else if (jmr != jmr.FIXED_FPS) {
                obj = null;
            } else {
                obj = 1;
            }
            if (obj != null) {
                ckj cke = new cke(ckl.f2108a, ckl.f2109b, d2, a6);
            } else {
                ckr = new ckr();
            }
            AtomicReference atomicReference = this.f2045l;
            chg chg = this.f2036c.f2000a;
            iqp iqp2 = this.f2033G;
            jri.m13152b(chg.f1982e);
            atomicReference.set(new chf(chg.f1978a, chg.f1981d, (fxi) chg.f1979b.mo2860b(), chg.f1980c, chg.f1982e, a5, ckr, chg.f1983f, 8, 14, chg.f1986i, jmr, randomUUID, iqp2));
            a.execute(a5);
            this.f2036c.f2002c.m2273a((ffe) this.f2045l.get());
        } catch (Throwable e) {
            this.f2041h = kow.m13618a(e);
        }
        this.f2041h = cig.m1152a(kow.m13621a(this.f2041h, cig.m1152a(a5)));
        this.f2041h = kny.m18045a(this.f2041h, new cip(this, d2), (Executor) a);
        kow.m13622a(this.f2041h, new cii(this), kpq.f8410a);
        this.f2051r.mo1904b();
        return this.f2041h;
    }

    /* renamed from: c */
    public final synchronized kpk m1156c() {
        kpk kpk;
        kpk = this.f2034H;
        if (kpk == null) {
            if (this.f2041h == null) {
                this.f2034H = kow.m13618a(new IllegalStateException("Running burst had no start future"));
                kpk = this.f2034H;
            } else {
                Executor ikd = new ikd();
                this.f2057x = SystemClock.elapsedRealtime();
                this.f2034H = kny.m18046a(this.f2041h, new cij(this, ikd), ikd);
                kpk = this.f2034H;
            }
        }
        return kpk;
    }

    /* renamed from: a */
    private static kpk m1152a(kpk kpk) {
        return kny.m18045a(kpk, new cio(), kpq.f8410a);
    }
}
