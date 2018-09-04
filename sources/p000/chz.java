package p000;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.libraries.smartburst.filterfw.SurfaceTexTransform;
import com.google.android.libraries.smartburst.filterfw.SurfaceTextureStreamer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: chz */
public final class chz implements chu {
    /* renamed from: d */
    private static final String f11998d = bli.m862a("BurstFacadeImpl");
    /* renamed from: e */
    private static final iqp f11999e = new iqp(640, 480);
    /* renamed from: f */
    private static final iqp f12000f = new iqp(640, 360);
    /* renamed from: a */
    public final AtomicReference f12001a = new AtomicReference();
    /* renamed from: b */
    public volatile SurfaceTextureStreamer f12002b;
    /* renamed from: c */
    public cig f12003c = null;
    /* renamed from: g */
    private final AtomicReference f12004g = new AtomicReference(f11999e);
    /* renamed from: h */
    private volatile chv f12005h;
    /* renamed from: i */
    private final Context f12006i;
    /* renamed from: j */
    private final ilp f12007j;
    /* renamed from: k */
    private final dod f12008k;
    /* renamed from: l */
    private final bcz f12009l = new bcz();
    /* renamed from: m */
    private final ilp f12010m = ilq.m3816a(this.f12009l, Integer.valueOf(0));
    /* renamed from: n */
    private final gsp f12011n;
    /* renamed from: o */
    private final gsl f12012o;
    /* renamed from: p */
    private final gev f12013p;
    /* renamed from: q */
    private final ird f12014q;
    /* renamed from: r */
    private final Instrumentation f12015r;
    /* renamed from: s */
    private final irs f12016s;
    /* renamed from: t */
    private final gqw f12017t;
    /* renamed from: u */
    private final glj f12018u;

    public chz(Context context, gev gev, gsl gsl, ilp ilp, ilp ilp2, bkw bkw, gsp gsp, ird ird, Instrumentation instrumentation, irs irs, glj glj) {
        this.f12006i = (Context) jri.m13152b((Object) context);
        this.f12013p = (gev) jri.m13152b((Object) gev);
        this.f12012o = (gsl) jri.m13152b((Object) gsl);
        this.f12011n = (gsp) jri.m13152b((Object) gsp);
        this.f12014q = ird;
        this.f12015r = instrumentation;
        this.f12016s = irs;
        this.f12018u = glj;
        this.f12007j = ilp;
        this.f12008k = new dod(bkw.m854f(), ilp2);
        this.f12002b = null;
        this.f12017t = new gqw(new cia(irs));
    }

    /* renamed from: a */
    public final Surface mo688a() {
        if (this.f12001a.get() == null) {
            return null;
        }
        return ((clh) this.f12001a.get()).f12153b;
    }

    /* renamed from: a */
    public final synchronized void mo691a(SurfaceTexture surfaceTexture, List list, fyy fyy) {
        iqp iqp;
        jri.m13152b((Object) surfaceTexture);
        this.f12014q.mo1903a("BurstFacadeRunner#initialize");
        float d = fyy.f4833d.m4050d();
        if (Math.abs(f11999e.m4050d() - d) < Math.abs(f12000f.m4050d() - d)) {
            iqp = f11999e;
        } else {
            iqp = f12000f;
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("No valid sizes for SmartBurst preview stream.");
        }
        iqp iqp2;
        if (list.contains(iqp)) {
            iqp2 = iqp;
        } else {
            iqp iqp3;
            Comparator cie = new cie(iqp);
            iqp2 = (iqp) Collections.min(list, cie);
            Collection arrayList = new ArrayList();
            for (iqp iqp32 : list) {
                int i = iqp32.f7329a;
                int i2 = iqp.f7330b;
                if (i >= i2 && iqp32.f7330b >= i2) {
                    arrayList.add(iqp32);
                }
            }
            if (!arrayList.isEmpty()) {
                iqp32 = (iqp) Collections.min(arrayList, cie);
                float a = (float) iqp.m4046a();
                if (((float) iqp32.m4046a()) <= a + a) {
                    iqp2 = iqp32;
                }
            }
        }
        this.f12004g.set(iqp2);
        surfaceTexture.setDefaultBufferSize(iqp2.f7329a, iqp2.f7330b);
        surfaceTexture.detachFromGLContext();
        this.f12002b = new SurfaceTextureStreamer(surfaceTexture, iqp2.f7329a, iqp2.f7330b, SurfaceTexTransform.create(0, false, true));
        this.f12001a.set(new clh(surfaceTexture));
        clh clh = (clh) this.f12001a.get();
        cic cic = new cic(this);
        synchronized (clh.f12152a) {
            clh.f12154c.add(cic);
        }
        this.f12014q.mo1904b();
    }

    /* renamed from: b */
    public final ilp mo693b() {
        return this.f12010m;
    }

    /* renamed from: c */
    public final void mo694c() {
        ikd.m12259a();
        jli.m12940a(mo689a(chw.FORCE_STOP)).mo1977a(khx.m4940a(), new cid(this)).mo1980a(izw.f18704a);
    }

    /* renamed from: a */
    public final void mo692a(chv chv) {
        this.f12005h = chv;
    }

    /* renamed from: a */
    public final kpk mo690a(chw chw, gks gks, gln gln, iqm iqm, iut iut, int i, bcy bcy, cjo cjo, iqp iqp) {
        ikd.m12259a();
        this.f12017t.f5642a = kbg.m4745c(Long.valueOf(System.currentTimeMillis()));
        if (this.f12001a.get() == null) {
            bli.m866b(f11998d, "Burst not started, null surface.");
            this.f12017t.m2743c();
            return kow.m13617a(Boolean.FALSE);
        } else if (this.f12003c != null) {
            bli.m866b(f11998d, "Burst not started: A burst runner already exists");
            this.f12017t.m2743c();
            return kow.m13617a(Boolean.FALSE);
        } else {
            chv chv = this.f12005h;
            if (chv == null) {
                bli.m866b(f11998d, "Burst not started due to missing injected fields.");
                this.f12017t.m2743c();
                return kow.m13617a(Boolean.FALSE);
            }
            Object obj;
            chg chg = chv.f2000a;
            if (chg.f1982e == null) {
                obj = null;
            } else if (chf.m8191a(chg.f1980c, 8)) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj == null) {
                bli.m866b(f11998d, "Burst not started because the factory told us not to start one.");
                gqw gqw = this.f12017t;
                if (gqw.f5643b != null) {
                    gqw.m2742b();
                } else {
                    gqw.f5643b = new klu();
                    klu klu = gqw.f5643b;
                    klu.f22401a = false;
                    klu.f22402b = true;
                    gqw.m2740a();
                }
                return kow.m13617a(Boolean.FALSE);
            }
            this.f12014q.mo1903a("BurstFacadeRunner#startBurst");
            this.f12003c = new cig(this.f12006i, (iqp) this.f12004g.get(), chv, gks, gln, this.f12013p, iqm, iut, i, this.f12008k, bcy, cjo, this.f12007j, this.f12001a, this.f12002b, this.f12009l.m16884a(), this.f12011n, this.f12012o, this.f12014q, this.f12015r, this.f12016s, iqp, this.f12018u);
            this.f12003c.f2046m.mo1985a(new cib(this), new ikd());
            kpk b = this.f12003c.m1155b();
            this.f12014q.mo1904b();
            return b;
        }
    }

    /* renamed from: a */
    public final kpk mo689a(chw chw) {
        ikd.m12259a();
        cig cig = this.f12003c;
        if (cig == null) {
            return kow.m13617a(Boolean.TRUE);
        }
        this.f12014q.mo1903a("BurstFacadeRunner#stopBurst");
        kpk c = cig.m1156c();
        this.f12014q.mo1904b();
        return c;
    }
}
