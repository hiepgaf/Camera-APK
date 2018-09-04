package p000;

import android.content.Context;
import android.hardware.SensorManager;
import android.location.Location;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: czs */
public final class czs implements czm {
    /* renamed from: a */
    private final hjw f12957a;
    /* renamed from: b */
    private final kbg f12958b;
    /* renamed from: c */
    private final gtf f12959c;
    /* renamed from: d */
    private final gln f12960d;
    /* renamed from: e */
    private final gci f12961e;
    /* renamed from: f */
    private final gke f12962f;
    /* renamed from: g */
    private final Context f12963g;
    /* renamed from: h */
    private final fxe f12964h;
    /* renamed from: i */
    private final ilp f12965i;
    /* renamed from: j */
    private final ilp f12966j;
    /* renamed from: k */
    private final ilp f12967k;
    /* renamed from: l */
    private final ilp f12968l;
    /* renamed from: m */
    private final ilp f12969m;
    /* renamed from: n */
    private final ilp f12970n;
    /* renamed from: o */
    private final gos f12971o;
    /* renamed from: p */
    private final bmb f12972p;
    /* renamed from: q */
    private final gmg f12973q;

    public czs(hjw hjw, kbg kbg, gtf gtf, gln gln, gci gci, SensorManager sensorManager, Context context, fxe fxe, ilp ilp, ilp ilp2, ilp ilp3, ilp ilp4, ilp ilp5, ilp ilp6, ilp ilp7, gos gos, ilp ilp8, bmb bmb, gmg gmg, gmx gmx) {
        this.f12957a = hjw;
        this.f12958b = kbg;
        this.f12959c = gtf;
        this.f12960d = gln;
        this.f12961e = gci;
        this.f12962f = new gke(sensorManager);
        this.f12963g = context;
        this.f12964h = fxe;
        this.f12965i = ilp;
        this.f12966j = ilp2;
        this.f12967k = ilp3;
        this.f12968l = ilp4;
        this.f12969m = ilp5;
        this.f12970n = ilp7;
        this.f12971o = gos;
        this.f12972p = bmb;
        this.f12973q = gmg;
    }

    /* renamed from: a */
    public final kpk mo1130a(fbj fbj, cwc cwc, fbl fbl, fbm fbm, ffc ffc, boolean z) {
        glw glw;
        boolean z2;
        boolean z3;
        kbg c;
        ilb ilb = new ilb(Boolean.valueOf(false));
        glw glw2 = glw.NORMAL;
        if (this.f12964h.mo2860b() == fxj.ON) {
            glw = glw.HDR_PLUS;
        } else if (this.f12964h.mo2860b() == fxj.AUTO) {
            glw = glw.HDR_PLUS_AUTO;
        } else {
            glw = glw2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Location d = this.f12957a.mo1244d();
        String a = this.f12959c.m2812a(currentTimeMillis);
        gmg gmg = this.f12973q;
        gkr gmb = new gmb((Executor) gmg.m2616a((Executor) gmg.f5420a.mo345a(), 1), (gmp) gmg.m2616a((gmp) gmg.f5421b.mo345a(), 2), (glt) gmg.m2616a((glt) gmg.f5422c.mo345a(), 3), (eqa) gmg.m2616a((eqa) gmg.f5423d.mo345a(), 4), (gsi) gmg.m2616a((gsi) gmg.f5424e.mo345a(), 5), (gtf) gmg.m2616a((gtf) gmg.f5425f.mo345a(), 6), (gsp) gmg.m2616a((gsp) gmg.f5426g.mo345a(), 7), (grg) gmg.m2616a((grg) gmg.f5427h.mo345a(), 8), (bcv) gmg.m2616a((bcv) gmg.f5428i.mo345a(), 9), (ird) gmg.m2616a((ird) gmg.f5429j.mo345a(), 10), (bls) gmg.m2616a((bls) gmg.f5430k.mo345a(), 11), (hju) gmg.m2616a((hju) gmg.f5431l.mo345a(), 12), (gev) gmg.m2616a((gev) gmg.f5432m.mo345a(), 13), (gnh) gmg.m2616a((gnh) gmg.f5433n.mo345a(), 14), (String) gmg.m2616a(a, 15), (kbg) gmg.m2616a(kbg.m4744b(d), 16), currentTimeMillis, (kbg) gmg.m2616a(this.f12958b, 18), (ilp) gmg.m2616a(ilb, 19));
        iqp iqp = cwc.f2818d.f6105a;
        if (gcb.m2471a(this.f12961e.mo1446d())) {
            iqp = iqp.m4048b();
        } else {
            iqp = iqp.m4049c();
        }
        this.f12960d.mo1504a(gmb);
        gmb.mo2872a(iqp, glw);
        int i = this.f12961e.mo1441a().f7326e;
        this.f12963g.getExternalCacheDir();
        int i2 = this.f12962f.f5297a;
        iut c2 = ffc.mo1921c();
        ((Float) this.f12968l.mo2860b()).floatValue();
        fbk fbk = new fbk(i, fbl, fbm, i2, c2, ffc.mo1931m(), ilb);
        String d2 = this.f12971o.mo1543d(gos.m2669a(cwc.f2815a.f7482b), "pref_camera_hdr_plus_key");
        if (((Integer) this.f12967k.mo2860b()).intValue() != gxk.OFF.f5765e) {
            z2 = true;
        } else {
            z2 = false;
        }
        fbp a2 = fbj.mo2855a();
        grg h = gmb.mo1482h();
        eps a3 = epr.m1954o().m1971a(1);
        String valueOf = String.valueOf(gmb.mo2886n());
        String valueOf2 = String.valueOf(ixx.JPEG.f7546j);
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        a3 = a3.m1974a(valueOf2);
        if (ffc.mo1921c() == iut.FRONT) {
            z3 = true;
        } else {
            z3 = false;
        }
        eps a4 = a3.m1976a(z3).m1983c(((Boolean) this.f12965i.mo2860b()).booleanValue()).m1977b(((Float) this.f12968l.mo2860b()).floatValue()).m1979b((String) this.f12970n.mo2860b()).m1982c(d2).m1981b(z2).m1970a((float) ((Integer) this.f12966j.mo2860b()).intValue()).m1980b(kbg.m4744b(null)).m1978b(Boolean.valueOf(z)).m1972a(ffc.mo1932n());
        if (a2 != null) {
            c = kbg.m4745c((klf) a2.f4459g.mo2860b());
        } else {
            c = kau.f19138a;
        }
        h.mo1514a(a4.m1975a(c).m1973a((Boolean) this.f12969m.mo2860b()).m1969a());
        return fbj.mo2856a(fbk, gmb);
    }

    /* renamed from: a */
    public final kpk mo1129a(cwh cwh, fbl fbl, fbm fbm, boolean z) {
        return mo1130a(cwh, cwh.f20805b, fbl, fbm, cwh.f20806c, z);
    }
}
