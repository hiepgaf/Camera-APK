package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.stats.Instrumentation;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: cyd */
public final class cyd extends cvs implements chy, cvx, fbl, hfk, hob {
    /* renamed from: c */
    public static final String f22726c = bli.m862a("CaptureModule");
    /* renamed from: A */
    public bqq f22727A;
    /* renamed from: B */
    public czp f22728B;
    /* renamed from: C */
    public bsn f22729C;
    /* renamed from: D */
    public AccessibilityManager f22730D;
    /* renamed from: E */
    public final kwk f22731E;
    /* renamed from: F */
    public boolean f22732F = true;
    /* renamed from: G */
    public boolean f22733G = true;
    /* renamed from: H */
    public boolean f22734H = false;
    /* renamed from: I */
    public boolean f22735I = false;
    /* renamed from: J */
    public final cws f22736J;
    /* renamed from: K */
    public volatile boolean f22737K = false;
    /* renamed from: L */
    public ikb f22738L;
    /* renamed from: M */
    public volatile boolean f22739M = false;
    /* renamed from: N */
    public volatile boolean f22740N = false;
    /* renamed from: O */
    public Executor f22741O = new bbv("FilterHDR+Ind", 150);
    /* renamed from: P */
    public final Instrumentation f22742P;
    /* renamed from: Q */
    public iqo f22743Q;
    /* renamed from: R */
    public final eby f22744R;
    /* renamed from: S */
    public final gho f22745S;
    /* renamed from: T */
    public final irs f22746T;
    /* renamed from: U */
    public final ilb f22747U = new ilb(Boolean.valueOf(true));
    /* renamed from: V */
    public ilb f22748V;
    /* renamed from: W */
    public final asu f22749W;
    /* renamed from: X */
    private final Executor f22750X;
    /* renamed from: Y */
    private final czg f22751Y;
    /* renamed from: Z */
    private final aws f22752Z;
    private long aA = 0;
    private final gvt aB;
    private final hek aC;
    private final gal aD;
    private final hjf aE;
    private final hny aF;
    private final hnz aG = new cyh(this);
    private final iqt aH = new cyr(this);
    private final haq aI = new cyw();
    private final fbm aJ = new cyx(this);
    private final Resources aa;
    private final fhc ab;
    private final fbn ac;
    private final gbv ad;
    private final SensorManager ae;
    private final ird af;
    private final awr ag;
    private final hat ah;
    private final BottomBarController ai;
    private final BottomBarListener aj;
    private final bpt ak;
    private final gwp al;
    private final ecd am;
    private final gjk an;
    private final czm ao;
    private final kbg ap;
    private final chx aq;
    private czb ar;
    private gke as;
    private final kwk at;
    private final ilp au;
    private final edk av;
    private boolean aw = false;
    private final ikb ax;
    private ikb ay;
    private Executor az = new bbv("DelHDR+Ind", 1000);
    /* renamed from: d */
    public final fxe f22753d;
    /* renamed from: e */
    public final ikd f22754e;
    /* renamed from: f */
    public final gci f22755f;
    /* renamed from: g */
    public final gos f22756g;
    /* renamed from: h */
    public final cjp f22757h;
    /* renamed from: i */
    public final cwa f22758i;
    /* renamed from: j */
    public final hoc f22759j;
    /* renamed from: k */
    public final hcd f22760k;
    /* renamed from: l */
    public final hch f22761l;
    /* renamed from: m */
    public final how f22762m;
    /* renamed from: n */
    public final bmb f22763n;
    /* renamed from: o */
    public final dzh f22764o;
    /* renamed from: p */
    public final kbg f22765p;
    /* renamed from: q */
    public final czw f22766q;
    /* renamed from: r */
    public final ise f22767r;
    /* renamed from: s */
    public cfh f22768s;
    /* renamed from: t */
    public gpn f22769t;
    /* renamed from: u */
    public cwc f22770u;
    /* renamed from: v */
    public kpk f22771v;
    /* renamed from: w */
    public fbj f22772w;
    /* renamed from: x */
    public ffc f22773x;
    /* renamed from: y */
    public fha f22774y;
    /* renamed from: z */
    public cze f22775z;

    public cyd(ikd ikd, Executor executor, Resources resources, aws aws, SensorManager sensorManager, ird ird, bag bag, bah bah, fhc fhc, fbn fbn, gos gos, gci gci, gbv gbv, czb czb, gpn gpn, czg czg, cwa cwa, ilp ilp, fxe fxe, hoc hoc, Instrumentation instrumentation, gvt gvt, eby eby, hny hny, hek hek, bsn bsn, AccessibilityManager accessibilityManager, bqq bqq, edk edk, kwk kwk, kwk kwk2, awr awr, hat hat, BottomBarController bottomBarController, hcd hcd, how how, bpt bpt, gal gal, gwp gwp, ecd ecd, gjk gjk, gho gho, irs irs, bmb bmb, kbg kbg, asu asu, dzh dzh, kbg kbg2, czm czm, ise ise, chx chx, czw czw, hjf hjf, cze cze) {
        super(bag, bah);
        this.ab = (fhc) jri.m13152b((Object) fhc);
        this.ac = (fbn) jri.m13152b((Object) fbn);
        this.ar = (czb) jri.m13152b((Object) czb);
        this.f22754e = ikd;
        this.f22750X = executor;
        this.f22752Z = aws;
        this.aa = resources;
        this.ae = sensorManager;
        this.af = ird;
        this.f22755f = gci;
        this.ad = gbv;
        this.f22756g = gos;
        this.f22769t = gpn;
        this.f22751Y = czg;
        this.au = ilp;
        this.f22753d = fxe;
        this.f22758i = cwa;
        this.f22759j = hoc;
        this.f22742P = instrumentation;
        this.aB = gvt;
        this.f22744R = eby;
        this.aF = hny;
        this.aC = hek;
        this.f22729C = bsn;
        this.f22730D = accessibilityManager;
        this.f22727A = bqq;
        this.av = edk;
        this.f22731E = kwk;
        this.at = kwk2;
        this.ag = awr;
        this.ah = hat;
        this.ai = bottomBarController;
        this.f22760k = hcd;
        this.f22762m = how;
        this.ak = bpt;
        this.al = gwp;
        this.aD = gal;
        this.am = ecd;
        this.an = gjk;
        this.f22745S = gho;
        this.f22746T = irs;
        this.f22763n = bmb;
        this.f22749W = asu;
        this.f22764o = dzh;
        this.f22765p = kbg2;
        this.ao = czm;
        this.ap = kbg;
        this.aq = chx;
        this.f22766q = czw;
        this.f22748V = new ilb(Boolean.valueOf(false));
        this.f22767r = ise;
        this.ax = new ikb();
        this.f22736J = new cws();
        this.f22757h = new cjp(chx);
        this.f22738L = ise.m4140b();
        this.aE = hjf;
        this.f22775z = cze;
        Object bbv = new bbv("FilterHDR+Ind", 150);
        Object bbv2 = new bbv("DelHDR+Ind", 1000);
        this.f22752Z.mo373a().mo1879a(bbv);
        this.f22752Z.mo373a().mo1879a(bbv2);
        this.f22741O = bbv;
        this.az = bbv2;
        this.ax.mo1879a(this.f22736J);
        this.ax.mo1879a(this.f22736J.mo2859a(new cys(this), this.f22754e));
        cws cws = this.f22736J;
        cws.f20810b.execute(new cwu(cws, chx.mo1107a()));
        this.ax.mo1879a(fxe.mo2859a(this.aH, this.f22754e));
        this.aj = new cyt(this);
        this.f22761l = new cyu(this, chx);
    }

    /* renamed from: m */
    final void m16992m() {
        if (awl.m711a(this.ag)) {
            m16970c(awl.m713b(this.ag.f989a.getIntent()));
            Intent intent = new Intent();
            intent.setAction(this.ag.f989a.getIntent().getAction());
            this.ag.m719a(intent);
        }
    }

    /* renamed from: n */
    final void m16993n() {
        if (this.f22775z.f2852c.m11791b()) {
            this.av.mo3003t();
            this.f22775z.f2852c.m11788a();
            this.f22768s.mo2757l().m9616f(false);
        }
    }

    public final void close() {
        this.ax.close();
    }

    /* renamed from: a */
    public final void mo3402a() {
        this.f22747U.mo348a(Boolean.valueOf(true));
        how how = this.f22762m;
        if (how != null) {
            how.mo1750a();
        }
        bpt bpt = this.ak;
        if (bpt != null) {
            ((bqo) jqk.m13079a(bpt.f1419c, "EvCompViewController must be first initialized", new Object[0])).f1449b = true;
        }
        this.f22768s.mo2757l().f14919l.setSideButtonsClickable(false);
        this.aD.f4984b.m15085b();
        this.f22768s.mo2757l().f14927t.setClickable(false);
        this.f22768s.mo2757l().m9608b(false);
        this.al.m11618a(false);
        this.f22775z.f2850a.f2449d = false;
    }

    /* renamed from: o */
    final void m16994o() {
        this.f22768s.mo2757l().m9621l();
    }

    public final fha f_() {
        return this.f22774y;
    }

    /* renamed from: b */
    public final String mo2846b() {
        return this.aa.getString(R.string.photo_accessibility_peek);
    }

    /* renamed from: a */
    public final void mo2844a(gos gos) {
    }

    /* renamed from: a */
    public final void mo2843a(cfh cfh, ezy ezy) {
        if (!this.aw) {
            this.aw = true;
            this.af.mo1903a("CaptureModule#initialize");
            this.f22768s = cfh;
            this.as = new gke(this.ae, this.f22750X);
            ((ayb) this.f22731E.mo345a()).mo394a((ayx) this.at.mo345a());
            this.ax.mo1879a(new cye(this));
            this.ax.mo1879a(this.aB.mo1656a(new cyv(this)));
            this.aq.mo1110a(cfh, this.f22775z, this.f22760k, this.ad);
            ((grt) this.f22742P.modeSwitch().getCurrentSession()).m11410b();
            this.af.mo1904b();
        }
    }

    /* renamed from: p */
    final void m16995p() {
        this.f22739M = false;
        m16978a(fxo.NORMAL);
        this.az.execute(new cyz(this));
    }

    /* renamed from: c */
    public final boolean mo2849c() {
        return true;
    }

    /* renamed from: e */
    public final boolean mo2838e() {
        return true;
    }

    public final boolean g_() {
        return this.f22737K;
    }

    /* renamed from: x */
    private final void m16972x() {
        this.f22754e.execute(new cyp(this));
    }

    /* renamed from: a */
    public final void mo2842a(aah aah) {
    }

    /* renamed from: q */
    public final void mo1139q() {
        this.f22768s.mo2757l().m9616f(false);
        if (!this.f22732F) {
            if (this.ap.mo2084b()) {
                ((cdb) this.ap.mo2081a()).m1107a();
            }
            this.av.mo3003t();
            m16973y();
        }
    }

    /* renamed from: r */
    public final void mo1140r() {
        if (!this.f22732F) {
            if (this.ap.mo2084b()) {
                ((cdb) this.ap.mo2081a()).m1108b();
            }
            this.av.mo3004u();
            this.f22769t.mo1548a(R.raw.timer_start);
        }
    }

    /* renamed from: a */
    public final boolean mo2845a(int i, KeyEvent keyEvent) {
        if (m17001v()) {
            switch (i) {
                case 23:
                case 27:
                    if (this.f22775z.f2852c.m11791b()) {
                        m16993n();
                    } else if (keyEvent.getRepeatCount() == 0) {
                        this.f22761l.onShutterButtonClick();
                    }
                    return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo2848b(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public final void mo2847b(boolean z) {
        bli.m863a(f22726c, "onLayoutOrientationChanged");
    }

    /* renamed from: s */
    public final void mo1136s() {
        cze cze = this.f22775z;
        hfl hfl = cze.f2851b;
        AnimatorSet animatorSet = hfl.f6157j;
        if (animatorSet != null && animatorSet.isRunning()) {
            hfl.f6157j.cancel();
        }
        hfl.m3105a();
        cze.f2850a.f2449d = true;
        this.f22768s.mo2757l().m9627s();
    }

    /* renamed from: t */
    public final void mo1137t() {
        this.f22754e.execute(new cyj(this));
    }

    /* renamed from: b */
    public final void mo1138b(int i) {
        if (i == 1) {
            this.f22769t.mo1548a(R.raw.timer_final);
        } else if (i == 2 || i == 3) {
            this.f22769t.mo1548a(R.raw.timer_increment);
        }
    }

    /* renamed from: u */
    public final void mo3406u() {
        bli.m863a(f22726c, "onRemoteShutterPress");
        m16973y();
    }

    /* renamed from: a */
    public final void mo1135a(float f) {
        cze cze = this.f22775z;
        int i = (int) (100.0f * f);
        hfl hfl = cze.f2851b;
        int min = Math.min(100, Math.max(i, 0));
        if (min == 0) {
            AnimatorSet animatorSet = hfl.f6158k;
            if (animatorSet != null && animatorSet.isRunning()) {
                hfl.f6158k.cancel();
            }
            hfl.f6156i = 0;
            animatorSet = hfl.f6157j;
            if (animatorSet != null && animatorSet.isRunning()) {
                hfl.f6157j.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{hfl.f6148a, hfl.f6149b});
            ofInt.setDuration(167);
            ofInt.setInterpolator(hfl.f6152e);
            ofInt.addUpdateListener(new hfm(hfl));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (float) hfl.f6150c});
            ofFloat.setDuration(167);
            ofFloat.setInterpolator(hfl.f6152e);
            ofFloat.addUpdateListener(new hfn(hfl));
            hfl.f6157j = new AnimatorSet();
            hfl.f6157j.playTogether(new Animator[]{ofInt, ofFloat});
            hfl.f6157j.addListener(new hfo(hfl));
            hfl.f6157j.start();
        } else {
            AnimatorSet animatorSet2 = hfl.f6157j;
            if (animatorSet2 != null && animatorSet2.isRunning()) {
                hfl.f6157j.cancel();
            }
            hfl.f6153f = go.by;
            hfl.f6156i = (int) (((float) min) * 3.6f);
            hfl.invalidate();
            if (min == 100) {
                hfl.m3105a();
            }
        }
        if (i == 100) {
            cze.f2850a.f2449d = true;
        } else {
            cze.f2850a.f2449d = false;
        }
        if (f == 0.0f) {
            this.f22768s.mo2757l().m9626r();
            bli.m863a(f22726c, "take picture progress started");
        } else if (f == 1.0f) {
            this.f22768s.mo2757l().m9627s();
            this.f22769t.mo1548a(R.raw.camera_shutter);
            this.f22747U.mo348a(Boolean.valueOf(false));
            bli.m863a(f22726c, "take picture progress stopped");
        }
    }

    public final void a_(boolean z) {
        if (z) {
            this.f22737K = false;
        }
    }

    public final void m_() {
        this.aq.mo1112b();
        ((ayb) this.f22731E.mo345a()).mo393a();
    }

    /* renamed from: a */
    final void m16980a(boolean z, boolean z2) {
        bli.m871d(f22726c, "Switching Camera...");
        if (z) {
            m16993n();
        }
        if (!this.f22732F) {
            m16971d(z2);
        }
    }

    public final void h_() {
        this.f22747U.mo348a(Boolean.valueOf(false));
        how how = this.f22762m;
        if (how != null) {
            how.mo1757c();
        }
        bpt bpt = this.ak;
        if (bpt != null) {
            ((bqo) jqk.m13079a(bpt.f1419c, "EvCompViewController must be first initialized", new Object[0])).f1449b = false;
        }
        this.f22775z.f2850a.f2449d = true;
        this.al.m11618a(true);
        this.f22768s.mo2757l().m9608b(true);
        this.f22768s.mo2757l().m9625q();
        this.f22768s.mo2757l().f14919l.setSideButtonsClickable(true);
        this.aD.f4984b.m15087c();
        this.f22768s.mo2757l().m9612d();
    }

    /* renamed from: j */
    public final void mo2851j() {
        boolean z = false;
        bli.m863a(f22726c, "Resuming Camera...");
        this.f22747U.mo348a(Boolean.valueOf(false));
        if (this.f22772w != null && awl.m711a(this.ag)) {
            if (this.f22773x.mo1921c() == iut.FRONT) {
                z = true;
            }
            if (z != awl.m716d(this.ag.f989a.getIntent())) {
                m16980a(true, true);
            } else {
                m16992m();
            }
        }
        fbj fbj = this.f22772w;
        if (fbj != null && fbj.mo2857c()) {
            m16980a(true, true);
        }
        czw czw = this.f22766q;
        gtx gtx = czw.f2895c;
        gtx.f5691c = -1;
        gtx.m2828b();
        czw.m1568a();
        this.al.m11618a(true);
        this.aD.f4984b.m15087c();
        this.f22768s.mo2757l().m9612d();
        ((ayb) this.f22731E.mo345a()).mo397b();
    }

    /* renamed from: c */
    final void m16986c(boolean z) {
        if (!this.f22732F) {
            this.f22768s.mo2757l().m9604a(z);
            this.f22768s.mo2757l().m9611c(z);
        }
    }

    /* renamed from: v */
    final boolean m17001v() {
        this.f22768s.mo2757l();
        ebd.m9597f();
        if (!this.f22736J.m15231a().booleanValue() || this.f22775z.f2852c.m11791b()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final void mo2852k() {
        if (this.f22732F) {
            bli.m863a(f22726c, "Starting Camera...");
            this.ay = new ikb();
            this.ay.mo1879a(this.f22760k.m3023a(this.f22761l));
            this.ai.addListener(this.aj);
            this.f22732F = false;
            this.f22760k.m3027b(false);
            this.af.mo1903a("CaptureModule#resume");
            m16971d(true);
            this.af.mo1903a("RemoteShutterListener#onModuleReady");
            this.f20801a.f1043c.mo3095a((hob) this);
            this.af.mo1904b();
            this.af.mo1903a("CaptureModule#ui-resume");
            this.f22745S.mo1487c();
            this.f22775z.m1554a();
            this.af.mo1904b();
            this.af.mo1903a("Setup CameraAppUI");
            this.f22768s.mo2757l().m9623o();
            ebd l = this.f22768s.mo2757l();
            chx chx = this.aq;
            eiu eiu = l.f14886C;
            if (eiu != null) {
                eiu.f3646c = new chc(chx);
            }
            this.f22768s.mo2757l().f14920m.m947a();
            this.af.mo1904b();
            this.f22768s.mo2743a(this.aI, true);
            this.am.m15518a(this.f22764o.m1696b());
            this.f22762m.mo1760e();
            this.aD.m2458a();
            this.as.m2584a();
            this.aF.m11922a(this.aG);
            this.f22769t.mo1553f();
            this.f22766q.m1568a();
            this.af.mo1904b();
            return;
        }
        bli.m863a(f22726c, "Attempting to start CaptureModule while it is already started.");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    private final void m16971d(boolean r9) {
        /*
        r8 = this;
        r0 = f22726c;
        r1 = new java.lang.StringBuilder;
        r2 = 47;
        r1.<init>(r2);
        r2 = "getOneModuleConfigFromSetting resetZoom = ";
        r1.append(r2);
        r1.append(r9);
        r1 = r1.toString();
        p000.bli.m871d(r0, r1);
        r0 = r8.f22764o;
        r0 = r0.m1696b();
        r1 = r8.ac;
        r2 = r8.aE;
        r0 = p000.bmt.m894a(r1, r2, r0);
        if (r9 == 0) goto L_0x0037;
    L_0x0028:
        r1 = r8.f22762m;
        r2 = r8.ac;
        r2 = r2.mo1343a(r0);
        r2 = p000.bmt.m892a(r2);
        r1.mo1756b(r2);
    L_0x0037:
        r1 = r8.ar;
        r1 = r1.m1553a(r0);
        p000.jri.m13152b(r1);
        r0 = r8.f22732F;
        if (r0 != 0) goto L_0x0062;
    L_0x0044:
        r0 = r8.f22751Y;
        r0 = r0.m1562a(r1);
        if (r0 == 0) goto L_0x0076;
    L_0x004c:
        r0 = r8.f22733G;
        if (r0 != 0) goto L_0x0076;
    L_0x0050:
        r0 = r8.f22738L;
        r0 = r0.mo3049a();
        if (r0 != 0) goto L_0x0076;
    L_0x0058:
        r0 = r8.f22772w;
        if (r0 == 0) goto L_0x0062;
    L_0x005c:
        r0 = r0.mo2857c();
        if (r0 != 0) goto L_0x0076;
    L_0x0062:
        r8.m16972x();
        r8.m16994o();
        r0 = r8.f22753d;
        r0 = r0.mo2860b();
        r1 = p000.fxj.AUTO;
        if (r0 != r1) goto L_0x0075;
    L_0x0072:
        r8.m16995p();
    L_0x0075:
        return;
    L_0x0076:
        r0 = r8.af;
        r2 = "CaptureModule#startCamera";
        r0.mo1903a(r2);
        r0 = r8.f22768s;
        r0 = r0.mo2757l();
        r0 = r0.f14925r;
        r2 = r0.f2432e;
        if (r2 == 0) goto L_0x0094;
    L_0x0089:
        r2 = r2.isRunning();
        if (r2 == 0) goto L_0x0094;
    L_0x008f:
        r2 = r0.f2432e;
        r2.cancel();
    L_0x0094:
        r2 = p000.go.bs;
        r0.f2428a = r2;
        r2 = 4;
        r0.setVisibility(r2);
        r0 = r8.f22738L;
        r0.close();
        r0 = r8.f22765p;
        r0 = r0.mo2084b();
        if (r0 == 0) goto L_0x00b4;
    L_0x00a9:
        r0 = r8.f22765p;
        r0 = r0.mo2081a();
        r0 = (p000.fbd) r0;
        r0.m2215a();
    L_0x00b4:
        r0 = r8.f22767r;
        r0 = r0.m4140b();
        r8.f22738L = r0;
        r8.f22770u = r1;
        r0 = r8.ac;
        r2 = r8.f22770u;
        r2 = r2.f2815a;
        r0 = r0.m10176b(r2);
        r8.f22773x = r0;
        r0 = new czd;
        r2 = r8.ab;
        r3 = r8.f22770u;
        r4 = r8.f22773x;
        r0.<init>(r2, r3, r4);
        r8.f22774y = r0;
        r0 = r8.aq;
        r2 = r8.f22770u;
        r3 = r8.f22773x;
        r0.mo1111a(r2, r3);
        r8.m16972x();
        r0 = r8.f22773x;
        p000.jri.m13152b(r0);
        r0 = r8.f22768s;
        r0 = r0.mo2757l();
        p000.jri.m13152b(r0);
        r2 = r8.f22738L;
        r0 = new bcl;
        r0.<init>();
        r0 = r2.mo1879a(r0);
        r0 = (p000.bcl) r0;
        r3 = r8.f22751Y;
        r4 = r8.aC;
        r4 = p000.kow.m13617a(r4);
        r5 = r8.an;
        r6 = new etg;
        r7 = 1;
        r6.<init>(r7);
        r1 = r3.m1559a(r1, r4, r5, r6);
        r3 = new cyq;
        r3.<init>(r8, r0, r2);
        r0 = r8.f22754e;
        p000.kow.m13622a(r1, r3, r0);
        r8.f22771v = r1;
        r0 = r8.af;
        r0.mo1904b();
        goto L_0x0075;
        */
        throw new UnsupportedOperationException("Method not decompiled: cyd.d(boolean):void");
    }

    /* renamed from: c */
    private final void m16970c(int i) {
        this.f22768s.mo2757l().m9616f(true);
        this.f22775z.m1556a((hfk) this);
        this.f22775z.m1555a(i);
    }

    /* renamed from: l */
    public final void mo2853l() {
        this.af.mo1903a("CaptureModule#stop");
        this.ay.close();
        this.ai.removeListener(this.aj);
        if (((Boolean) this.f22747U.f21734c).booleanValue()) {
            this.f22747U.mo348a(Boolean.valueOf(false));
            mo1136s();
        }
        this.f22745S.mo1486b();
        this.f22734H = false;
        this.f22732F = true;
        m16993n();
        this.as.m2585b();
        this.f20801a.f1043c.mo3094a();
        this.aq.mo1113c();
        this.af.mo1903a("CaptureModule#closeCamera");
        kpk kpk = this.f22771v;
        if (!(kpk == null || kpk.isDone())) {
            this.f22771v.cancel(false);
            this.f22771v = null;
        }
        if (this.f22772w != null) {
            this.af.mo1903a("CameraDevice#close");
            this.f22772w.close();
            this.f22772w = null;
            this.af.mo1904b();
        }
        this.f22751Y.m1561a();
        this.f22736J.m15236c(ilq.m3818a(Boolean.valueOf(false)));
        this.af.mo1903a("CameraLifetime#close");
        this.f22738L.close();
        this.af.mo1904b();
        if (this.f22765p.mo2084b()) {
            ((fbd) this.f22765p.mo2081a()).m2215a();
        }
        this.af.mo1904b();
        this.f22768s.mo2757l().f14920m.m948b();
        this.f22769t.mo1547a();
        this.aF.m11924b(this.aG);
        this.af.mo1904b();
    }

    public final void i_() {
        fbj fbj = this.f22772w;
        if (fbj != null) {
            ilq.m3827a(fbj.mo2855a().f4453a, this.f22738L).mo1985a(new cyf(this), this.f22754e);
        }
    }

    /* renamed from: y */
    private final void m16973y() {
        bli.m869c(f22726c, "takePictureNow invoked");
        this.af.mo1903a("CaptureModule#takePictureNow");
        if (this.f22772w == null) {
            bli.m873e(f22726c, "Not taking picture since Camera is closed.");
            return;
        }
        this.ah.mo1699a();
        if (((Boolean) this.f22772w.mo2855a().f4453a.mo2860b()).booleanValue()) {
            if (this.aA == 0) {
                this.aA = SystemClock.elapsedRealtime();
            } else {
                String str = f22726c;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.aA;
                StringBuilder stringBuilder = new StringBuilder(48);
                stringBuilder.append("Time between capture shots: ");
                stringBuilder.append(elapsedRealtime - j);
                bli.m871d(str, stringBuilder.toString());
                this.aA = SystemClock.elapsedRealtime();
            }
            m16986c(false);
            this.f22747U.mo348a(Boolean.valueOf(true));
            bli.m863a(f22726c, "take picture started");
            this.ao.mo1130a(this.f22772w, this.f22770u, this, this.aJ, this.f22773x, this.f22734H).mo1985a(new cyi(this), this.f22754e);
            this.f22734H = false;
            this.af.mo1904b();
            return;
        }
        bli.m873e(f22726c, "Not taking picture since the Camera is not ready to take a picture.");
    }

    /* renamed from: w */
    final void m17002w() {
        if (this.f22775z.f2852c.m11791b()) {
            m16993n();
            return;
        }
        this.f22768s.mo2757l().f14926s.m11769a();
        int intValue = ((Integer) this.au.mo2860b()).intValue();
        if (intValue > 0) {
            m16970c(intValue);
        } else {
            m16973y();
        }
    }

    /* renamed from: a */
    final void m16978a(fxo fxo) {
        if (!this.f22740N && this.f22753d.mo2860b() == fxj.AUTO) {
            boolean z;
            if (fxo == fxo.HDR_PLUS) {
                z = true;
            } else if (fxo != fxo.HDR_PLUS_WITH_TORCH) {
                z = false;
            } else {
                z = true;
            }
            gal gal = this.aD;
            if (gal.f4987e.mo2860b() == fxj.AUTO && !((Boolean) gal.f4988f.mo2860b()).booleanValue()) {
                gal.f4986d.execute(new gas(gal, z));
            }
        }
    }
}
