package p000;

import android.content.ContentResolver;
import android.location.Location;
import com.google.android.apps.camera.stats.BurstSessionStatistics;
import com.google.android.apps.camera.stats.Instrumentation;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cwj */
public class cwj implements chx {
    /* renamed from: A */
    private iqo f12704A;
    /* renamed from: a */
    public final iqz f12705a;
    /* renamed from: b */
    public final ikd f12706b;
    /* renamed from: c */
    public final Object f12707c = new Object();
    /* renamed from: d */
    public final gtf f12708d;
    /* renamed from: e */
    public final bmb f12709e;
    /* renamed from: f */
    public final bag f12710f;
    /* renamed from: g */
    public final gpn f12711g;
    /* renamed from: h */
    public final glj f12712h;
    /* renamed from: i */
    public final hjw f12713i;
    /* renamed from: j */
    public final kwa f12714j;
    /* renamed from: k */
    public final Map f12715k = new HashMap();
    /* renamed from: l */
    public bnv f12716l;
    /* renamed from: m */
    public cwc f12717m;
    /* renamed from: n */
    public final ilb f12718n;
    /* renamed from: o */
    public final AtomicBoolean f12719o = new AtomicBoolean(false);
    /* renamed from: p */
    private final chu f12720p;
    /* renamed from: q */
    private final bna f12721q;
    /* renamed from: r */
    private final Instrumentation f12722r;
    /* renamed from: s */
    private final gci f12723s;
    /* renamed from: t */
    private final gkp f12724t;
    /* renamed from: u */
    private final czw f12725u;
    /* renamed from: v */
    private cfh f12726v;
    /* renamed from: w */
    private cze f12727w;
    /* renamed from: x */
    private gbv f12728x;
    /* renamed from: y */
    private axm f12729y;
    /* renamed from: z */
    private ffc f12730z;

    public cwj(czg czg, iqz iqz, ikd ikd, gtf gtf, bmb bmb, Instrumentation instrumentation, gci gci, bag bag, gpn gpn, gkp gkp, glj glj, hjw hjw, czw czw, kwa kwa) {
        this.f12705a = iqz.mo512a(bli.m862a(cwj.class.getSimpleName()));
        this.f12706b = ikd;
        this.f12708d = gtf;
        this.f12709e = bmb;
        this.f12722r = instrumentation;
        this.f12723s = gci;
        this.f12710f = bag;
        this.f12711g = gpn;
        this.f12724t = gkp;
        this.f12712h = glj;
        this.f12713i = hjw;
        this.f12725u = czw;
        this.f12714j = kwa;
        this.f12718n = new ilb(Boolean.valueOf(true));
        this.f12720p = czg.f2855b;
        this.f12721q = czg.f2856c;
    }

    /* renamed from: a */
    public final /* synthetic */ ilp mo1107a() {
        return this.f12718n;
    }

    /* renamed from: a */
    public final iqp m8836a(iqp iqp) {
        if (gcb.m2471a(this.f12723s.mo1446d())) {
            return iqp.m4048b();
        }
        return iqp.m4049c();
    }

    /* renamed from: a */
    public final void mo1110a(cfh cfh, cze cze, hcd hcd, gbv gbv) {
        this.f12726v = cfh;
        this.f12727w = cze;
        this.f12716l = new bnv(hcd, this.f12726v.mo2757l().f14910c);
        this.f12728x = gbv;
    }

    /* renamed from: b */
    public final void mo1112b() {
        mo1109a(chw.FORCE_STOP, false);
    }

    /* renamed from: a */
    public final kpk mo1108a(chw chw) {
        if (this.f12719o.compareAndSet(false, true)) {
            kpk b = m8834b(chw);
            kow.m13622a(b, new cwm(this), this.f12706b);
            return b;
        }
        this.f12705a.mo520f("Burst not started as one is running already.");
        return kow.m13617a(Boolean.FALSE);
    }

    /* renamed from: b */
    private final kpk m8834b(chw chw) {
        boolean g_ = ((chy) this.f12714j.mo345a()).g_();
        if (this.f12727w.f2852c.m11791b() || g_) {
            iqz iqz = this.f12705a;
            boolean b = this.f12727w.f2852c.m11791b();
            StringBuilder stringBuilder = new StringBuilder(81);
            stringBuilder.append("Burst cannot start in this state [timer-on: ");
            stringBuilder.append(b);
            stringBuilder.append(", switching-to-filmstrip: ");
            stringBuilder.append(g_);
            stringBuilder.append("]");
            iqz.mo520f(stringBuilder.toString());
            return kow.m13617a(Boolean.FALSE);
        }
        cfh cfh = this.f12726v;
        if (cfh == null || cfh.mo2757l().f14914g.getVisibility() != 0) {
            Object obj;
            czw czw = this.f12725u;
            long j = czw.f2895c.f5691c;
            if (j == -1) {
                obj = null;
            } else if (j < 120000000) {
                iqz iqz2 = czw.f2899g;
                StringBuilder stringBuilder2 = new StringBuilder(70);
                stringBuilder2.append("Burst not started due to low storage: ");
                stringBuilder2.append(j);
                stringBuilder2.append(" bytes free.");
                iqz2.mo520f(stringBuilder2.toString());
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                this.f12716l.m923a();
                ((chy) this.f12714j.mo345a()).i_();
                return kow.m13617a(Boolean.FALSE);
            }
            kpk a;
            this.f12705a.mo514b("startBurst invoked");
            ((chy) this.f12714j.mo345a()).mo3402a();
            BurstSessionStatistics burstSessionStatistics = (BurstSessionStatistics) this.f12722r.burstStats().create();
            burstSessionStatistics.m8419k();
            synchronized (this.f12707c) {
                czw = this.f12725u;
                czw.f2895c.m2827a(1000, czw.f2898f);
                this.f12704A = new daa(czw);
                cjo cjo = new cjo(this.f12723s, new cjm(this));
                boolean a2 = this.f12709e.m883a();
                if (a2) {
                    this.f12705a.mo514b("Starting burst (lightweight).");
                    bna bna = this.f12721q;
                    long currentTimeMillis = System.currentTimeMillis();
                    Location d = this.f12713i.mo1244d();
                    String a3 = this.f12708d.m2812a(currentTimeMillis);
                    gln gln = this.f12710f.f1041a;
                    gkp gkp = this.f12724t;
                    gkr gkk = new gkk((ContentResolver) gkp.m2588a((ContentResolver) gkp.f5317a.mo345a(), 1), (glt) gkp.m2588a((glt) gkp.f5318b.mo345a(), 2), (gmp) gkp.m2588a((gmp) gkp.f5319c.mo345a(), 3), (eqa) gkp.m2588a((eqa) gkp.f5320d.mo345a(), 4), (gsi) gkp.f5321e.mo345a(), (gtf) gkp.f5322f.mo345a(), (gsp) gkp.m2588a((gsp) gkp.f5323g.mo345a(), 7), (gtg) gkp.m2588a((gtg) gkp.f5324h.mo345a(), 8), (gsx) gkp.m2588a((gsx) gkp.f5325i.mo345a(), 9), (gsl) gkp.m2588a((gsl) gkp.f5326j.mo345a(), 10), (grg) gkp.m2588a((grg) gkp.f5327k.mo345a(), 11), (bcv) gkp.m2588a((bcv) gkp.f5328l.mo345a(), 12), (ixv) gkp.m2588a((ixv) gkp.f5329m.mo345a(), 13), (ird) gkp.m2588a((ird) gkp.f5330n.mo345a(), 14), (bls) gkp.f5331o.mo345a(), (hju) gkp.f5332p.mo345a(), (gnh) gkp.m2588a((gnh) gkp.f5333q.mo345a(), 17), (irs) gkp.m2588a((irs) gkp.f5334r.mo345a(), 18), (String) gkp.m2588a(a3, 19), (kbg) gkp.m2588a(kbg.m4744b(d), 20), (iut) gkp.m2588a(this.f12730z.mo1921c(), 21), currentTimeMillis, (Executor) gkp.m2588a(cht.m1134e(), 23), (gev) gkp.m2588a((gev) gkp.f5335s.mo345a(), 24));
                    iqp a4 = m8836a(this.f12717m.f2818d.f6105a);
                    gln.mo1504a(gkk);
                    gkk.mo2872a(a4, glw.BURST);
                    iqm a5 = this.f12729y.m735a();
                    bnv bnv = this.f12716l;
                    bnx bnw = new bnw(bnv);
                    bnw bnw2 = (bnw) bnv.f1350b.getAndSet(bnw);
                    if (bnw2 != null) {
                        bnw2.f11114a = false;
                    }
                    a = bna.mo524a(gkk, a5, new cwk(this, bnw), this.f12717m.f2817c);
                    this.f12721q.mo527c();
                    this.f12721q.mo526b();
                    this.f12721q.mo528d();
                } else {
                    this.f12705a.mo514b("Starting burst (legacy).");
                    a = this.f12720p.mo690a(chw, new gks(this), this.f12710f.f1041a, this.f12723s.mo1441a(), this.f12730z.mo1921c(), this.f12729y.m735a().f7326e, this.f12726v.mo2757l().f14910c, cjo, this.f12717m.f2817c);
                }
                a = kny.m18045a(a, new cwn(this, a2, burstSessionStatistics), this.f12706b);
                kow.m13622a(a, new cwo(this), this.f12706b);
                this.f12715k.put(chw, a);
            }
            return a;
        }
        this.f12705a.mo520f("Burst cannot start when app is not available / visible.");
        return kow.m13617a(Boolean.FALSE);
    }

    /* renamed from: a */
    public final void mo1111a(cwc cwc, ffc ffc) {
        boolean z;
        this.f12717m = cwc;
        this.f12730z = ffc;
        gbv gbv = this.f12728x;
        int o = ffc.mo1933o();
        if (ffc.mo1921c() == iut.FRONT) {
            z = true;
        } else {
            z = false;
        }
        this.f12729y = new axm(gbv, o, z);
    }

    /* renamed from: c */
    public final void mo1113c() {
        this.f12720p.mo694c();
    }

    /* renamed from: a */
    public final kpk mo1109a(chw chw, boolean z) {
        kpk a;
        if (z) {
            ((chy) this.f12714j.mo345a()).h_();
        }
        this.f12705a.mo514b("burst stopped");
        BurstSessionStatistics burstSessionStatistics = (BurstSessionStatistics) this.f12722r.burstStats().getCurrentSession();
        burstSessionStatistics.m8411c();
        synchronized (this.f12707c) {
            m8843d();
            if (this.f12709e.m883a()) {
                this.f12721q.mo529e();
                this.f12721q.mo530f();
                this.f12721q.mo525a();
                a = kow.m13617a(Boolean.valueOf(true));
            } else {
                a = this.f12720p.mo689a(chw);
            }
            kow.m13622a(a, new cwp(this, chw, burstSessionStatistics), this.f12706b);
        }
        return a;
    }

    /* renamed from: d */
    final void m8843d() {
        iqo iqo = this.f12704A;
        if (iqo != null) {
            iqo.close();
            this.f12704A = null;
        }
    }
}
