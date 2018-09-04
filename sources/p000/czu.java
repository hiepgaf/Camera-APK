package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.hardware.SensorManager;
import android.location.Location;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: czu */
public final class czu implements czm {
    /* renamed from: a */
    private final hjw f12994a;
    /* renamed from: b */
    private final gtf f12995b;
    /* renamed from: c */
    private final gln f12996c;
    /* renamed from: d */
    private final gci f12997d;
    /* renamed from: e */
    private final gke f12998e;
    /* renamed from: f */
    private final Context f12999f;
    /* renamed from: g */
    private final ilp f13000g;
    /* renamed from: h */
    private final ilp f13001h;
    /* renamed from: i */
    private final ilp f13002i;
    /* renamed from: j */
    private final ilp f13003j;
    /* renamed from: k */
    private final ilp f13004k;
    /* renamed from: l */
    private final ilp f13005l;
    /* renamed from: m */
    private final gos f13006m;
    /* renamed from: n */
    private final gmt f13007n;

    public czu(hjw hjw, gtf gtf, gln gln, gci gci, SensorManager sensorManager, Context context, ilp ilp, ilp ilp2, ilp ilp3, ilp ilp4, ilp ilp5, ilp ilp6, gos gos, gmt gmt) {
        this.f12994a = hjw;
        this.f12995b = gtf;
        this.f12996c = gln;
        this.f12997d = gci;
        this.f12998e = new gke(sensorManager);
        this.f12999f = context;
        this.f13000g = ilp;
        this.f13001h = ilp2;
        this.f13002i = ilp3;
        this.f13003j = ilp4;
        this.f13004k = ilp5;
        this.f13005l = ilp6;
        this.f13006m = gos;
        this.f13007n = gmt;
    }

    /* renamed from: a */
    public final kpk mo1130a(fbj fbj, cwc cwc, fbl fbl, fbm fbm, ffc ffc, boolean z) {
        throw new UnsupportedOperationException("Method is Deprecated");
    }

    /* renamed from: a */
    public final kpk mo1129a(cwh cwh, fbl fbl, fbm fbm, boolean z) {
        boolean z2;
        boolean z3;
        kbg c;
        cwc cwc = cwh.f20805b;
        glw glw = glw.PORTRAIT;
        long currentTimeMillis = System.currentTimeMillis();
        Location d = this.f12994a.mo1244d();
        gmt gmt = this.f13007n;
        gkr gms = new gms((ContentResolver) gmt.m2627a((ContentResolver) gmt.f5461a.mo345a(), 1), (glt) gmt.m2627a((glt) gmt.f5462b.mo345a(), 2), (gmp) gmt.m2627a((gmp) gmt.f5463c.mo345a(), 3), (eqa) gmt.m2627a((eqa) gmt.f5464d.mo345a(), 4), (gsp) gmt.m2627a((gsp) gmt.f5465e.mo345a(), 5), (gtg) gmt.m2627a((gtg) gmt.f5466f.mo345a(), 6), (gsx) gmt.m2627a((gsx) gmt.f5467g.mo345a(), 7), (gsl) gmt.m2627a((gsl) gmt.f5468h.mo345a(), 8), (grg) gmt.m2627a((grg) gmt.f5469i.mo345a(), 9), (bcv) gmt.m2627a((bcv) gmt.f5470j.mo345a(), 10), (ixv) gmt.m2627a((ixv) gmt.f5471k.mo345a(), 11), (ird) gmt.m2627a((ird) gmt.f5472l.mo345a(), 12), (bvm) gmt.m2627a((bvm) gmt.f5473m.mo345a(), 13), (gnh) gmt.m2627a((gnh) gmt.f5474n.mo345a(), 14), (irs) gmt.m2627a((irs) gmt.f5475o.mo345a(), 15), (String) gmt.m2627a(this.f12995b.m2812a(currentTimeMillis), 16), (kbg) gmt.m2627a(kbg.m4744b(d), 17), (iut) gmt.m2627a(cwc.f2816b, 18), currentTimeMillis, (Executor) gmt.m2627a(cht.m1134e(), 20), (gev) gmt.m2627a((gev) gmt.f5476p.mo345a(), 21));
        iqp iqp = cwc.f2818d.f6105a;
        if (gcb.m2471a(this.f12997d.mo1446d())) {
            iqp = iqp.m4048b();
        } else {
            iqp = iqp.m4049c();
        }
        this.f12996c.mo1504a(gms);
        gms.mo2872a(iqp, glw);
        int i = this.f12997d.mo1441a().f7326e;
        this.f12999f.getExternalCacheDir();
        int i2 = this.f12998e.f5297a;
        iut c2 = cwh.f20806c.mo1921c();
        ((Float) this.f13003j.mo2860b()).floatValue();
        fbk fbk = new fbk(i, fbl, fbm, i2, c2, cwh.f20806c.mo1931m(), imh.m3845a(Boolean.valueOf(false)));
        cwc cwc2 = cwh.f20805b;
        ffc ffc = cwh.f20806c;
        String d2 = this.f13006m.mo1543d(gos.m2669a(cwc2.f2815a.f7482b), "pref_camera_hdr_plus_key");
        if (((Integer) this.f13002i.mo2860b()).intValue() != gxk.OFF.f5765e) {
            z2 = true;
        } else {
            z2 = false;
        }
        fbp a = cwh.mo2855a();
        grg h = gms.mo1482h();
        eps a2 = epr.m1954o().m1971a(1);
        String valueOf = String.valueOf(gms.mo2886n());
        String valueOf2 = String.valueOf(ixx.JPEG.f7546j);
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        a2 = a2.m1974a(valueOf2);
        if (ffc.mo1921c() == iut.FRONT) {
            z3 = true;
        } else {
            z3 = false;
        }
        eps a3 = a2.m1976a(z3).m1983c(((Boolean) this.f13000g.mo2860b()).booleanValue()).m1977b(((Float) this.f13003j.mo2860b()).floatValue()).m1979b((String) this.f13005l.mo2860b()).m1982c(d2).m1981b(z2).m1970a((float) ((Integer) this.f13001h.mo2860b()).intValue()).m1980b(kbg.m4744b(null)).m1978b(Boolean.valueOf(z)).m1972a(ffc.mo1932n());
        if (a != null) {
            c = kbg.m4745c((klf) a.f4459g.mo2860b());
        } else {
            c = kau.f19138a;
        }
        h.mo1514a(a3.m1975a(c).m1973a((Boolean) this.f13004k.mo2860b()).m1969a());
        return cwh.mo2856a(fbk, gms);
    }
}
