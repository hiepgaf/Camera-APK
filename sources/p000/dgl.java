package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.accessibility.AccessibilityManager;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import java.util.Timer;

/* compiled from: PG */
/* renamed from: dgl */
public final class dgl implements ezx, hfk {
    /* renamed from: a */
    public static final String f20973a = bli.m862a("GoudaModule");
    /* renamed from: A */
    public ikb f20974A;
    /* renamed from: B */
    public BottomBarController f20975B;
    /* renamed from: C */
    public hcd f20976C;
    /* renamed from: D */
    public gdl f20977D;
    /* renamed from: E */
    public czp f20978E;
    /* renamed from: F */
    public ilp f20979F;
    /* renamed from: G */
    public final hjm f20980G = new hjm(5);
    /* renamed from: H */
    public final cze f20981H;
    /* renamed from: I */
    public final ilp f20982I;
    /* renamed from: J */
    public final BottomBarListener f20983J = new dgs(this);
    /* renamed from: K */
    public iqt f20984K = new dgm(this);
    /* renamed from: L */
    public final hnz f20985L = new dgv(this);
    /* renamed from: M */
    private final ird f20986M;
    /* renamed from: N */
    private final cwy f20987N;
    /* renamed from: O */
    private final czg f20988O;
    /* renamed from: P */
    private final czm f20989P;
    /* renamed from: Q */
    private final fbg f20990Q;
    /* renamed from: R */
    private final gvr f20991R;
    /* renamed from: S */
    private final fbn f20992S;
    /* renamed from: T */
    private final hjf f20993T;
    /* renamed from: U */
    private Timer f20994U;
    /* renamed from: V */
    private cwi f20995V;
    /* renamed from: W */
    private final ilp f20996W;
    /* renamed from: X */
    private final dha f20997X;
    /* renamed from: Y */
    private final edk f20998Y;
    /* renamed from: Z */
    private final fbl f20999Z = new dgt(this);
    private final fbm aa = dgn.f13178a;
    /* renamed from: b */
    public final dzh f21000b;
    /* renamed from: c */
    public final cfh f21001c;
    /* renamed from: d */
    public final ikd f21002d;
    /* renamed from: e */
    public final hch f21003e;
    /* renamed from: f */
    public final gpn f21004f;
    /* renamed from: g */
    public final gds f21005g;
    /* renamed from: h */
    public final asu f21006h;
    /* renamed from: i */
    public final hny f21007i;
    /* renamed from: j */
    public final hdm f21008j;
    /* renamed from: k */
    public final kbg f21009k;
    /* renamed from: l */
    public final ilb f21010l;
    /* renamed from: m */
    public final Context f21011m;
    /* renamed from: n */
    public final eby f21012n;
    /* renamed from: o */
    public final bmb f21013o;
    /* renamed from: p */
    public final bsn f21014p;
    /* renamed from: q */
    public final gci f21015q;
    /* renamed from: r */
    public final AccessibilityManager f21016r;
    /* renamed from: s */
    public final bqq f21017s;
    /* renamed from: t */
    public final brp f21018t;
    /* renamed from: u */
    public final gdj f21019u;
    /* renamed from: v */
    public final how f21020v;
    /* renamed from: w */
    public final ilb f21021w;
    /* renamed from: x */
    public boolean f21022x = true;
    /* renamed from: y */
    public boolean f21023y;
    /* renamed from: z */
    public cwh f21024z;

    public dgl(ird ird, dzh dzh, cwy cwy, cfh cfh, czg czg, ikd ikd, czm czm, gpn gpn, kbg kbg, fbg fbg, asu asu, hny hny, hdm hdm, kbg kbg2, Context context, eby eby, bmb bmb, bsn bsn, gci gci, AccessibilityManager accessibilityManager, bqq bqq, brp brp, gdj gdj, gvr gvr, how how, ilp ilp, ena ena, ilp ilp2, cze cze, edk edk, fbn fbn, hjf hjf) {
        Object valueOf = Boolean.valueOf(false);
        this.f21010l = new ilb(valueOf);
        this.f21021w = new ilb(valueOf);
        this.f20986M = ird;
        this.f20987N = cwy;
        this.f21000b = dzh;
        this.f21001c = cfh;
        this.f20988O = czg;
        this.f21002d = ikd;
        this.f20989P = czm;
        this.f21004f = gpn;
        this.f20990Q = fbg;
        this.f21006h = asu;
        this.f21007i = hny;
        this.f21008j = hdm;
        this.f21009k = kbg2;
        this.f21011m = context;
        this.f21012n = eby;
        this.f21013o = bmb;
        this.f21014p = bsn;
        this.f21015q = gci;
        this.f21016r = accessibilityManager;
        this.f21017s = bqq;
        this.f21018t = brp;
        this.f21019u = gdj;
        this.f20991R = gvr;
        this.f21020v = how;
        this.f20996W = ilp;
        this.f20982I = ilp2;
        this.f20981H = cze;
        this.f20998Y = edk;
        this.f20992S = fbn;
        this.f20993T = hjf;
        jri.m13143a(kbg.mo2084b());
        this.f21005g = (gds) kbg.mo2081a();
        this.f20997X = new dha(this.f21005g);
        ena.m1906a(this.f20997X);
        this.f21003e = new dgw(this);
    }

    /* renamed from: a */
    final void m15392a() {
        if (this.f20981H.f2852c.m11791b()) {
            this.f20998Y.mo3003t();
            this.f20981H.f2852c.m11788a();
        }
    }

    public final void close() {
        m15394a(false);
    }

    /* renamed from: a */
    public final void mo2955a(BottomBarController bottomBarController, hcd hcd) {
        this.f20975B = bottomBarController;
        this.f20976C = hcd;
        this.f21005g.mo1451a();
    }

    /* renamed from: b */
    static final /* synthetic */ void m15390b() {
    }

    /* renamed from: J */
    public final boolean mo1208J() {
        return false;
    }

    /* renamed from: q */
    public final void mo1139q() {
        if (!this.f21022x) {
            this.f20998Y.mo3003t();
            m15401h();
        }
    }

    /* renamed from: r */
    public final void mo1140r() {
        if (!this.f21022x) {
            this.f20998Y.mo3004u();
            this.f21004f.mo1548a(R.raw.timer_start);
        }
    }

    /* renamed from: c */
    public final void mo2956c() {
    }

    /* renamed from: d */
    public final void mo2957d() {
    }

    /* renamed from: e */
    public final void mo2958e() {
        if (this.f21022x) {
            int a;
            this.f20996W.mo348a(Boolean.valueOf(true));
            bli.m863a(f20973a, "Starting Camera...");
            this.f21022x = false;
            this.f20974A = new ikb();
            this.f20986M.mo1903a("GoudaModule#start");
            m15400g();
            m15394a(true);
            this.f20975B.addListener(this.f20983J);
            this.f20974A.mo1879a(new dgo(this));
            this.f20974A.mo1879a(this.f20976C.m3023a(this.f21003e));
            this.f21018t.m947a();
            float f = this.f21011m.getResources().getConfiguration().fontScale;
            DisplayMetrics displayMetrics = this.f21011m.getResources().getDisplayMetrics();
            boolean z;
            if (f > 1.0f) {
                z = false;
            } else if (displayMetrics.densityDpi <= DisplayMetrics.DENSITY_DEVICE_STABLE) {
                a = this.f20991R.m2840a() ^ 1;
            } else {
                z = false;
            }
            this.f20994U = new Timer();
            this.f20977D = new gdl(this.f20990Q, this.f21005g, this.f21002d, this.f21010l, this.f21011m, this.f20994U);
            this.f20974A.mo1879a(this.f20977D);
            this.f21007i.m11922a(this.f20985L);
            this.f20974A.mo1879a(new dgp(this));
            this.f21005g.mo1453a(new gdu(this));
            if (a != 0) {
                this.f21005g.mo1456c();
            }
            this.f20986M.mo1904b();
            return;
        }
        bli.m863a(f20973a, "Attempting to start GoudaModule while it is already started.");
    }

    /* renamed from: f */
    public final void mo2959f() {
        if (this.f21022x) {
            bli.m863a(f20973a, "Attempting to stop GoudaModule while it is already stopped.");
            return;
        }
        this.f21022x = true;
        if (this.f20995V.isDone()) {
            cwh cwh = this.f21024z;
            if (cwh != null) {
                cwh.close();
                this.f21024z = null;
            }
        } else {
            this.f20995V.cancel(true);
        }
        this.f20988O.m1561a();
        m15392a();
        if (this.f21009k.mo2084b()) {
            ((fbd) this.f21009k.mo2081a()).m2215a();
        }
        this.f21018t.m948b();
        this.f20988O.f2857d.mo348a(Float.valueOf(1.0f));
        this.f21005g.mo1453a(null);
        this.f20974A.close();
    }

    /* renamed from: b */
    public final void mo1138b(int i) {
        if (i == 1) {
            this.f21004f.mo1548a(R.raw.timer_final);
        } else if (i == 2 || i == 3) {
            this.f21004f.mo1548a(R.raw.timer_increment);
        }
    }

    /* renamed from: a */
    final void m15394a(boolean z) {
        if (!this.f21022x) {
            this.f21001c.mo2757l().m9604a(z);
            this.f21001c.mo2757l().m9611c(z);
        }
    }

    /* renamed from: g */
    final void m15400g() {
        float a = bmt.m892a(this.f20992S.m10176b(bmt.m894a(this.f20992S, this.f20993T, this.f21000b.m1696b())));
        if (this.f21000b.m1697c()) {
            this.f21020v.mo1758c(a * 1.5f);
            this.f21020v.mo1764i();
        } else {
            this.f21020v.mo1758c(a * 1.2f);
            this.f21020v.mo1764i();
        }
        gdl gdl = this.f20977D;
        if (gdl != null) {
            gdl.m10992a();
        }
        this.f21024z = null;
        this.f20995V = this.f20987N.mo1114a(this.f21000b, this.f20988O);
        kow.m13622a(this.f20995V, new dgx(this), this.f21002d);
    }

    /* renamed from: h */
    final void m15401h() {
        bli.m869c(f20973a, "takePictureNow invoked");
        this.f20986M.mo1903a("GoudaModule#takePictureNow");
        cwh cwh = this.f21024z;
        if (cwh == null) {
            bli.m873e(f20973a, "Not taking picture since Camera is closed.");
        } else if (((Boolean) cwh.m15227b().mo2860b()).booleanValue()) {
            m15394a(false);
            this.f20989P.mo1129a(this.f21024z, this.f20999Z, this.aa, this.f21023y).mo1985a(new dgq(this), this.f21002d);
        } else {
            bli.m873e(f20973a, "Not taking picture since the Camera is not ready to take a picture.");
        }
    }
}
