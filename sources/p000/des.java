package p000;

import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.SensorManager;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.util.concurrent.ExecutionException;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* renamed from: des */
public final class des extends cvs implements bwg, cvx {
    /* renamed from: Q */
    private static boolean f22791Q;
    /* renamed from: c */
    public static final String f22792c = bli.m862a("PanoramaModule");
    /* renamed from: A */
    public int f22793A;
    /* renamed from: B */
    public int f22794B;
    /* renamed from: C */
    public final ehp f22795C;
    /* renamed from: D */
    public final Handler f22796D = new dfz(this);
    /* renamed from: E */
    public ezy f22797E;
    /* renamed from: F */
    public final bvm f22798F;
    /* renamed from: G */
    public final bus f22799G;
    /* renamed from: H */
    public boolean f22800H = false;
    /* renamed from: I */
    public Handler f22801I;
    /* renamed from: J */
    public bwb f22802J;
    /* renamed from: K */
    public AlertDialog f22803K;
    /* renamed from: L */
    public AlertDialog f22804L;
    /* renamed from: M */
    public final OnTouchListener f22805M = new dfi(this);
    /* renamed from: N */
    public int f22806N = 0;
    /* renamed from: O */
    public long f22807O = 0;
    /* renamed from: P */
    public int f22808P = 2;
    /* renamed from: R */
    private final gev f22809R;
    /* renamed from: S */
    private final gtf f22810S;
    /* renamed from: T */
    private final gtl f22811T;
    /* renamed from: U */
    private final BottomBarController f22812U;
    /* renamed from: V */
    private final hcd f22813V;
    /* renamed from: W */
    private final BottomBarListener f22814W;
    /* renamed from: X */
    private int f22815X = go.ag;
    /* renamed from: Y */
    private Context f22816Y;
    /* renamed from: Z */
    private bkw f22817Z;
    private final Runnable aA = new dfn(this);
    private ViewGroup aa;
    private View ab;
    private elq ac;
    private DisplayListener ad;
    private ekr ae;
    private PhotoSphereMessageOverlay af;
    private irs ag;
    private boolean ah = true;
    private final ilp ai;
    private ikb aj;
    private final boolean ak;
    private final gmn al;
    private final gnu am;
    private final gci an;
    private final ilp ao;
    private HandlerThread ap;
    private final OnClickListener aq = new det(this);
    private final haq ar = new dfs(this);
    private final iqt as = new dft(this);
    private final emc at = new dfu(this);
    private final emc au = new dfv(this);
    private final emc av = new dhg(this);
    private final eak aw = new dfy("panorama_upgrade_version");
    private final hny ax;
    private final hnz ay = new dqr(this);
    private final Runnable az = new dfm(this);
    /* renamed from: d */
    public final eld f22818d;
    /* renamed from: e */
    public final boolean f22819e;
    /* renamed from: f */
    public final gey f22820f;
    /* renamed from: g */
    public final gpn f22821g;
    /* renamed from: h */
    public final hch f22822h;
    /* renamed from: i */
    public ejx f22823i;
    /* renamed from: j */
    public eje f22824j;
    /* renamed from: k */
    public boolean f22825k;
    /* renamed from: l */
    public boolean f22826l;
    /* renamed from: m */
    public boolean f22827m;
    /* renamed from: n */
    public elo f22828n;
    /* renamed from: o */
    public eln f22829o;
    /* renamed from: p */
    public cfh f22830p;
    /* renamed from: q */
    public cbr f22831q;
    /* renamed from: r */
    public boolean f22832r = false;
    /* renamed from: s */
    public int f22833s = 0;
    /* renamed from: t */
    public eki f22834t;
    /* renamed from: u */
    public boolean f22835u = true;
    /* renamed from: v */
    public ejy f22836v;
    /* renamed from: w */
    public final cfh f22837w;
    /* renamed from: x */
    public final hat f22838x;
    /* renamed from: y */
    public Thread f22839y;
    /* renamed from: z */
    public int f22840z;

    public des(bag bag, bah bah, cfh cfh, boolean z, gpn gpn, bkw bkw, gey gey, gev gev, gtf gtf, iji iji, ikd ikd, ilp ilp, hny hny, ehp ehp, gtl gtl, BottomBarController bottomBarController, hcd hcd, irs irs, bvm bvm, bus bus, boolean z2, gmn gmn, gnu gnu, gci gci, ilp ilp2) {
        super(bag, bah);
        jri.m13152b((Object) bah);
        this.f22837w = (cfh) jri.m13152b((Object) cfh);
        this.f22838x = (hat) jri.m13152b(cfh.mo2771z());
        this.f22819e = z;
        this.f22821g = (gpn) jri.m13152b((Object) gpn);
        this.f22817Z = (bkw) jri.m13152b((Object) bkw);
        this.f22820f = (gey) jri.m13152b((Object) gey);
        this.f22809R = gev;
        this.f22810S = (gtf) jri.m13152b((Object) gtf);
        this.ax = (hny) jri.m13152b((Object) hny);
        this.f22795C = (ehp) jri.m13152b((Object) ehp);
        this.f22811T = gtl;
        this.ai = ilp;
        this.f22812U = (BottomBarController) jri.m13152b((Object) bottomBarController);
        this.f22813V = (hcd) jri.m13152b((Object) hcd);
        this.ag = irs;
        this.f22798F = bvm;
        this.f22799G = bus;
        this.ak = z2;
        this.al = gmn;
        this.am = gnu;
        this.an = gci;
        this.ao = ilp2;
        this.f22818d = new eld(bah);
        this.aw.m1737a(this.f22837w.mo2727B(), null);
        iji.mo1879a(ilp.mo2859a(this.as, ikd));
        this.f22814W = new deu(this);
        this.f22822h = new dev(this, ehp);
    }

    /* renamed from: v */
    private final void m17025v() {
        if (!this.ak && this.f22835u) {
            int i;
            Context context = this.f22816Y;
            if (this.ao.mo2860b() == hhx.PHOTO_SPHERE) {
                i = R.string.mode_photosphere;
            } else {
                i = R.string.mode_panorama;
            }
            if (!this.f22837w.mo2757l().m9605a(new els(context, i, new dfo(this)), LayoutInflater.from(this.f22816Y))) {
                this.f22835u = false;
                mo2836a(0);
            }
            m17046m();
        }
    }

    /* renamed from: m */
    final void m17046m() {
        int i = this.f22833s;
        this.f22837w.mo2757l().m9600a();
        if (i != 0) {
            this.an.mo1445c();
        } else {
            this.an.mo1449g();
        }
    }

    /* renamed from: n */
    final void m17047n() {
        m17039c(false);
        m17027x();
        if (this.f22823i.isInterrupted() || !this.f22823i.isAlive()) {
            this.f22796D.sendEmptyMessage(105);
        } else {
            this.f22823i.m1817a(new dfa(this));
        }
        m17022d(true);
        m17046m();
    }

    public final void close() {
    }

    /* renamed from: o */
    final synchronized void m17048o() {
        if (this.ap == null) {
            this.ap = new HandlerThread("PhotoSphereGLThread");
            this.ap.start();
            this.f22801I = new dga(this, this.ap.getLooper());
        }
    }

    /* renamed from: p */
    final void m17049p() {
        eki eki = this.f22834t;
        if (eki != null && eki.f3798s) {
            bli.m873e(f22792c, "Not finishing capture since photo taking is in progress.");
            return;
        }
        this.f22821g.mo1548a(R.raw.staged_shot_complete);
        m17046m();
        m17039c(false);
        String d = this.f22830p.mo2727B().mo1543d("default_scope", "pref_lightcycle_quality_key");
        if (this.f22816Y.getResources().getString(R.string.camera_quality_low).equals(d)) {
            LightCycle.m1317p();
        } else if (this.f22816Y.getResources().getString(R.string.camera_quality_high).equals(d)) {
            LightCycle.m1316o();
        } else if (this.f22816Y.getResources().getString(R.string.camera_quality_max).equals(d)) {
            LightCycle.m1315n();
        } else {
            LightCycle.m1316o();
        }
        elq elq = this.ac;
        View view = this.ab;
        ObjectAnimator objectAnimator = elq.f3944a;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            elq.f3944a.cancel();
        }
        elq.f3944a = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.3f, 0.0f});
        elq.f3944a.setDuration(300);
        elq.f3944a.addListener(new elr(elq, view));
        elq.f3944a.start();
        this.f22839y = new dfh(this);
        this.f22839y.start();
        m17027x();
        this.f22823i.m1817a(new dfj(this));
    }

    public final fha f_() {
        return new dex();
    }

    /* renamed from: w */
    private final int m17026w() {
        String d = this.f22830p.mo2727B().mo1543d("default_scope", "pref_lightcycle_quality_key");
        if (this.f22816Y.getResources().getString(R.string.camera_quality_low).equals(d)) {
            return go.at;
        }
        if (this.f22816Y.getResources().getString(R.string.camera_quality_high).equals(d)) {
            return go.as;
        }
        if (this.f22816Y.getResources().getString(R.string.camera_quality_max).equals(d)) {
            return go.ar;
        }
        return go.as;
    }

    /* renamed from: b */
    public final String mo2846b() {
        int i;
        switch (this.f22815X - 1) {
            case 0:
                i = R.string.photosphere_accessibility_peek;
                break;
            case 1:
                i = R.string.horizontal_panorama_accessibility_peek;
                break;
            case 2:
                i = R.string.vertical_panorama_accessibility_peek;
                break;
            case 3:
                i = R.string.wide_angle_accessibility_peek;
                break;
            case 4:
                i = R.string.fisheye_accessibility_peek;
                break;
            default:
                i = R.string.media_accessibility_peek;
                break;
        }
        return this.f22837w.mo2756k().getResources().getString(i);
    }

    /* renamed from: a */
    public final void mo2844a(gos gos) {
    }

    /* renamed from: a */
    public final void mo2843a(cfh cfh, ezy ezy) {
        this.f22830p = cfh;
        this.f22831q = cfh.mo2752c();
        this.f22816Y = cfh.mo2756k();
        this.f22797E = ezy;
        this.f22837w.mo2727B().mo1533a("pref_lightcycle_quality_key", this.f22816Y.getResources().getString(R.string.camera_quality_high), this.f22816Y.getResources().getStringArray(R.array.pref_lightcycle_quality_entryvalues));
        try {
            iqm b;
            eio.f3643a = new ell(this.f20801a.f1041a, this.f22810S, this.al, this.am);
            this.f22828n = eio.f3643a;
            m17039c(false);
            m15206i();
            this.aa = this.f22830p.mo2757l().f14915h;
            LayoutInflater.from(this.f22816Y).inflate(R.layout.pano_module, (ViewGroup) this.aa.findViewById(R.id.module_layout), true);
            this.f22830p.mo2743a(this.ar, false);
            switch (this.f22831q.m1098a().getDefaultDisplay().getRotation()) {
                case 0:
                    b = iqm.m4039b(0);
                    break;
                case 1:
                    b = iqm.m4039b(90);
                    break;
                case 2:
                    b = iqm.m4039b(MediaDecoder.ROTATE_180);
                    break;
                case 3:
                    b = iqm.m4039b(MediaDecoder.ROTATE_90_LEFT);
                    break;
                default:
                    b = iqm.CLOCKWISE_0;
                    break;
            }
            this.f22794B = b.m4041a();
            this.af = (PhotoSphereMessageOverlay) this.aa.findViewById(R.id.photosphere_calibration_overlay);
            this.af.m1322a(this.f22794B);
            this.ab = this.aa.findViewById(R.id.flash_overlay);
            this.f22835u = this.f22830p.mo2727B().mo1536a("default_scope", "photosphere_show_help_overlay", true);
            this.ac = new elq();
            m17025v();
            switch (this.f22831q.m1098a().getDefaultDisplay().getRotation()) {
                case 0:
                    b = iqm.m4039b(0);
                    break;
                case 1:
                    b = iqm.m4039b(90);
                    break;
                case 2:
                    b = iqm.m4039b(MediaDecoder.ROTATE_180);
                    break;
                case 3:
                    b = iqm.m4039b(MediaDecoder.ROTATE_90_LEFT);
                    break;
                default:
                    b = iqm.CLOCKWISE_0;
                    break;
            }
            this.f22794B = b.m4041a();
            this.ad = new dew(this);
            ((grt) Instrumentation.instance().modeSwitch().getCurrentSession()).m11410b();
        } catch (Throwable e) {
            throw new IllegalStateException("Cannot instantiate PanoramaModule.", e);
        }
    }

    /* renamed from: c */
    public final boolean mo2849c() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo2838e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo2839f() {
        if (this.f22827m) {
            m17050q();
            return true;
        }
        this.f22795C.mo3014H();
        return false;
    }

    /* renamed from: a */
    public final void mo2842a(aah aah) {
        this.f22830p.mo2759n();
        this.f22824j = new eje(aah, this.f22796D);
        if (!f22791Q) {
            bli.m869c(f22792c, "Initializing Lightcycle");
            abw b = ejh.m1770b(aah.mo2567e());
            float a = ejh.m1765a(aah);
            Point point = b.f178a;
            int i = point.x;
            int i2 = point.y;
            synchronized (LightCycle.f2376a) {
                LightCycleNative.Init(i, i2, a, LightCycle.f2379d);
                LightCycle.f2377b = Boolean.valueOf(false);
            }
            f22791Q = true;
        }
        bli.m863a(f22792c, "Camera available.");
        if (this.f22802J == null) {
            ebd l = this.f22830p.mo2757l();
            SurfaceTexture surfaceTexture = l.f14892I;
            if (surfaceTexture != null) {
                aah.mo2572j();
                this.ar.onSurfaceTextureAvailable(surfaceTexture, l.f14893J, l.f14894K);
                bli.m863a(f22792c, "Reusing an existing surface texture.");
                return;
            }
            bli.m863a(f22792c, "Awaiting renderer initialization.");
            return;
        }
        m17054u();
        this.f22837w.mo2757l();
        ebd.m9598i();
    }

    /* renamed from: q */
    final void m17050q() {
        this.f22796D.post(new dfb(this));
    }

    /* renamed from: r */
    final void m17051r() {
        if (!this.f22825k) {
            return;
        }
        if (this.f22815X != go.ak) {
            m17049p();
            return;
        }
        if (LightCycle.m1307f() < LightCycle.m1308g()) {
            this.f22796D.post(new dfe(this));
        } else {
            m17049p();
        }
    }

    /* renamed from: a */
    public final void mo3407a(GL10 gl10) {
        eki eki = this.f22834t;
        if (eki != null) {
            eki.onDrawFrame(gl10);
        }
    }

    /* renamed from: a */
    public final boolean mo2845a(int i, KeyEvent keyEvent) {
        switch (i) {
            case 23:
                this.f22822h.onShutterButtonClick();
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final boolean mo2848b(int i, KeyEvent keyEvent) {
        switch (i) {
            case 82:
                return this.f22827m;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final void mo2847b(boolean z) {
        iqm b;
        String str = f22792c;
        StringBuilder stringBuilder = new StringBuilder(46);
        stringBuilder.append("onLayoutOrientationChanged, isLandscape: ");
        stringBuilder.append(z);
        bli.m871d(str, stringBuilder.toString());
        switch (this.f22831q.m1098a().getDefaultDisplay().getRotation()) {
            case 0:
                b = iqm.m4039b(0);
                break;
            case 1:
                b = iqm.m4039b(90);
                break;
            case 2:
                b = iqm.m4039b(MediaDecoder.ROTATE_180);
                break;
            case 3:
                b = iqm.m4039b(MediaDecoder.ROTATE_90_LEFT);
                break;
            default:
                b = iqm.CLOCKWISE_0;
                break;
        }
        this.f22794B = b.m4041a();
        this.af.m1322a(this.f22794B);
        m17046m();
        m17025v();
    }

    /* renamed from: a */
    final void m17033a(String str) {
        if (!this.ah && !this.f22827m) {
            ejy ejy;
            eki eki;
            if (str.equals(this.f22816Y.getString(R.string.pano_orientation_horizontal))) {
                if (this.f22815X != go.ah) {
                    this.f22815X = go.ah;
                    ejy = this.f22836v;
                    if (ejy != null) {
                        ejy.m1821a(this.f22815X);
                    }
                    eki = this.f22834t;
                    if (eki != null) {
                        eki.m1836a(this.f22815X);
                    }
                }
            } else if (str.equals(this.f22816Y.getString(R.string.pano_orientation_vertical))) {
                if (this.f22815X != go.ai) {
                    this.f22815X = go.ai;
                    ejy = this.f22836v;
                    if (ejy != null) {
                        ejy.m1821a(this.f22815X);
                    }
                    eki = this.f22834t;
                    if (eki != null) {
                        eki.m1836a(this.f22815X);
                    }
                }
            } else if (str.equals(this.f22816Y.getString(R.string.pano_orientation_wide))) {
                if (this.f22815X != go.aj) {
                    this.f22815X = go.aj;
                    ejy = this.f22836v;
                    if (ejy != null) {
                        ejy.m1821a(this.f22815X);
                    }
                    eki = this.f22834t;
                    if (eki != null) {
                        eki.m1836a(this.f22815X);
                    }
                }
            } else if (str.equals(this.f22816Y.getString(R.string.pano_orientation_fisheye))) {
                if (this.f22815X != go.ak) {
                    this.f22815X = go.ak;
                    ejy = this.f22836v;
                    if (ejy != null) {
                        ejy.m1821a(this.f22815X);
                    }
                    eki = this.f22834t;
                    if (eki != null) {
                        eki.m1836a(this.f22815X);
                    }
                }
            } else if (str.equals(this.f22816Y.getString(R.string.pano_orientation_photosphere)) && this.f22815X != go.ag) {
                this.f22815X = go.ag;
                ejy = this.f22836v;
                if (ejy != null) {
                    ejy.m1821a(this.f22815X);
                }
                eki = this.f22834t;
                if (eki != null) {
                    eki.m1836a(this.f22815X);
                }
            }
            eln eln = this.f22829o;
            if (eln != null) {
                eln.f3941g = this.f22815X;
            }
        }
    }

    /* renamed from: a */
    public final void mo2836a(int i) {
        boolean z = true;
        this.f22808P = i;
        eki eki = this.f22834t;
        if (eki != null) {
            boolean z2;
            if (i == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            eki.f3800u = z2;
            if (!(z2 || i == 1 || this.f22835u)) {
                z = false;
            }
            eki.f3801v = z;
        }
    }

    public final void m_() {
    }

    /* renamed from: x */
    private final void m17027x() {
        ejy ejy = this.f22836v;
        if (ejy != null) {
            ejy.m1824d();
        }
        this.f22818d.m1860d();
        knk d = kpw.m18056d();
        Handler handler = this.f22801I;
        if (handler != null) {
            handler.post(new dfk(this, d));
        }
        try {
            d.get();
            return;
        } catch (InterruptedException e) {
        } catch (ExecutionException e2) {
        }
        bli.m866b(f22792c, "Fail to wait freeGLMemory to finish");
    }

    /* renamed from: d */
    private final void m17022d(boolean z) {
        this.f22833s = 0;
        if (z) {
            this.aA.run();
        } else {
            this.az.run();
        }
        this.f22796D.postDelayed(new dez(this), 1400);
        this.f22827m = false;
        ilp ilp = this.ai;
        if (ilp != null) {
            m17033a((String) ilp.mo2860b());
        }
    }

    /* renamed from: s */
    final synchronized void m17052s() {
        if (!this.ah) {
            m17028y();
            m17054u();
        }
    }

    /* renamed from: j */
    public final void mo2851j() {
        this.f22811T.mo1632f(this.aq);
    }

    /* renamed from: c */
    final void m17039c(boolean z) {
        this.f22837w.mo2757l().m9611c(z);
        this.f22825k = z;
    }

    /* renamed from: t */
    final void m17053t() {
        m17028y();
        int a = this.f20802b.mo671a();
        if (a != -1) {
            this.f20802b.mo681c(a);
        }
        ejy ejy = this.f22836v;
        if (ejy != null) {
            ejy.f3711C.quitSafely();
            this.f22836v = null;
        }
        bwb bwb = this.f22802J;
        if (bwb != null) {
            bwb.f1648i.post(new bwd(bwb));
            this.f22802J = null;
        }
    }

    /* renamed from: k */
    public final void mo2852k() {
        this.ah = false;
        this.aj = new ikb();
        this.aj.mo1879a(this.f22813V.m3023a(this.f22822h));
        this.aj.mo1879a(this.f22795C.f21288j.mo2859a(new dfp(this), kpq.f8410a));
        this.f22812U.addListener(this.f22814W);
        this.f22837w.mo2743a(this.ar, false);
        m15206i();
        m17048o();
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(" (");
        stringBuilder.append(str2);
        stringBuilder.append(")");
        str = String.valueOf(stringBuilder.toString());
        str2 = "Model is: ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str2.concat(str);
        }
        if (this.f22830p.mo2759n().mo671a() != -1) {
            Process.setThreadPriority(-19);
            this.f22828n.mo1232a(gtu.m2823a().mo1624b());
            ((DisplayManager) this.f22837w.mo2756k().getSystemService("display")).registerDisplayListener(this.ad, null);
            this.ae = new ekr();
            this.ax.m11922a(this.ay);
            return;
        }
        mo2853l();
        Builder builder = new Builder(this.f22830p.mo2748b(), 16974546);
        builder.setMessage(R.string.photosphere_no_back_camera).setCancelable(false).setPositiveButton(R.string.ok, new dfl(this));
        builder.create().show();
    }

    /* renamed from: u */
    final void m17054u() {
        boolean z = true;
        if (this.f22824j == null) {
            bli.m873e(f22792c, "startCapture: camera device not open yet.");
            return;
        }
        if (this.f22826l) {
            m17028y();
        }
        this.f22833s = 0;
        this.f22838x.mo1701c();
        this.f22806N = 0;
        try {
            int i;
            this.f22829o = this.f22828n.mo1230a();
            eln eln = this.f22829o;
            String str = eln.f3939e;
            String str2 = eln.f3940f;
            String str3 = eln.f3937c;
            String str4 = eln.f3935a;
            String str5 = eln.f3938d;
            int length = String.valueOf(str).length();
            int length2 = String.valueOf(str2).length();
            int length3 = String.valueOf(str3).length();
            StringBuilder stringBuilder = new StringBuilder(((((length + 14) + length2) + length3) + String.valueOf(str4).length()) + String.valueOf(str5).length());
            stringBuilder.append("storage : ");
            stringBuilder.append(str);
            stringBuilder.append(" ");
            stringBuilder.append(str2);
            stringBuilder.append(" ");
            stringBuilder.append(str3);
            stringBuilder.append(" ");
            stringBuilder.append(str4);
            stringBuilder.append(" ");
            stringBuilder.append(str5);
            this.f22829o.f3941g = this.f22815X;
            this.f22823i = new ejx();
            this.f22834t = new eki(this.f22816Y, this.ae, this.af, this.f22837w.mo2769x());
            this.f22834t.m1836a(this.f22815X);
            eld eld = this.f22818d;
            Context context = this.f22816Y;
            bkw bkw = this.f22817Z;
            if (!eld.f3917r) {
                eld.f3917r = true;
                bah bah = eld.f3902c;
                eld.f3914o = (float) bah.mo677b(bah.mo671a()).mo2551a();
                str3 = String.valueOf(Build.MODEL);
                str4 = "Model is ";
                if (str3.length() == 0) {
                    str3 = new String(str4);
                } else {
                    str4.concat(str3);
                }
                if (Build.MODEL.startsWith("Nexus 7")) {
                    eld.f3914o = 90.0f;
                }
                if (bkw.m849a(bkw.f1255a, "camera:use_gyro_sensor_delay_fastest_for_panorama", false)) {
                    bli.m871d(eld.f3900a, "Using GServices Override SENSOR_DELAY_FASTEST for Gyro");
                    i = 0;
                } else {
                    i = 1;
                }
                eld.f3903d = (SensorManager) context.getSystemService("sensor");
                eld.f3918s = new ele(eld, "sensor thread", i);
                eld.f3918s.start();
                eld.f3906g = false;
                eld.m1859c();
                eld.f3913n.m1853b();
            }
            this.f22836v = new ejy(this.f22816Y, this.f22824j, this.f22818d, this.f22829o, this.f22823i, this.f22834t, this.f22830p.mo2766u(), this.f22831q);
            ejy ejy = this.f22836v;
            ejy.f3713E = this.at;
            ejy.f3747w = this.f22802J;
            ejy.f3750z = this.au;
            ejy.f3709A = this.av;
            Window d = this.f22830p.mo2754d();
            LayoutParams attributes = d.getAttributes();
            attributes.systemUiVisibility = 1;
            d.setAttributes(attributes);
            if (this.ao.mo2860b() != hhx.PHOTO_SPHERE) {
                length = go.ar;
            } else {
                length = m17026w();
            }
            abw a = this.f22824j.m1761a(this.f22831q.m1098a(), this.f22816Y, this.f22836v.f3720L, true, length);
            this.f22836v.m1826f();
            ejy ejy2 = this.f22836v;
            Point point = a.f178a;
            i = point.x;
            int i2 = point.y;
            eki eki = ejy2.f3726b;
            eki.f3757D = i;
            eki.f3758E = i2;
            i2 = this.f22815X;
            if (ejy2.f3727c != null) {
                ejg a2;
                PackageInfo packageInfo;
                if (ejy2.m1822b() <= 0.0f) {
                    i2 = go.al;
                }
                aaz e = ejy2.f3727c.f3657b.mo2567e();
                if (i2 == go.ag || i2 == go.al || i2 == go.ak) {
                    a2 = ejf.m1763a(e, length);
                } else {
                    a2 = ejf.m1762a(e);
                }
                i = a2.f3668b.f178a.x;
                ejy2.f3726b.m1836a(i2);
                ejy2.m1821a(i2);
                try {
                    packageInfo = ejy2.f3741q.getPackageManager().getPackageInfo(ejy2.f3741q.getPackageName(), 0);
                } catch (NameNotFoundException e2) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    str5 = packageInfo.versionName;
                    str = String.valueOf(str5);
                    str3 = "Setting version to ";
                    if (str.length() == 0) {
                        str = new String(str3);
                    } else {
                        str3.concat(str);
                    }
                    LightCycle.m1298b(str5);
                }
                ejy2.m1823c();
            } else {
                z = false;
            }
            if (z) {
                this.f22824j.f3657b.m7a(this.f22796D, new dey(this));
                return;
            }
            bli.m873e(f22792c, "Can't setup LightCycleController for startPreview.");
        } catch (Throwable e3) {
            bli.m867b(f22792c, "Cannot start capture, local session storage not ready.", e3);
        }
    }

    /* renamed from: l */
    public final void mo2853l() {
        if (this.ah) {
            bli.m873e(f22792c, "Cannot pause already paused PanoramaModule");
            return;
        }
        this.aj.close();
        this.f22812U.removeListener(this.f22814W);
        this.ah = true;
        m17022d(true);
        ((DisplayManager) this.f22837w.mo2756k().getSystemService("display")).unregisterDisplayListener(this.ad);
        m17053t();
        HandlerThread handlerThread = this.ap;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.ap = null;
            this.f22801I = null;
        }
        this.f22818d.m1860d();
        ejx ejx = this.f22823i;
        if (!(ejx == null || ejx.isInterrupted())) {
            this.f22823i.interrupt();
        }
        this.f22796D.post(new dfr(this));
        this.f22824j = null;
        this.ax.m11924b(this.ay);
    }

    /* renamed from: y */
    private final void m17028y() {
        this.f22832r = false;
        gev gev = this.f22809R;
        synchronized (gev.f5118b) {
            iqz iqz = gev.f5117a;
            int size = gev.f5119c.size();
            StringBuilder stringBuilder = new StringBuilder(42);
            stringBuilder.append("Resume processing. Queue size: ");
            stringBuilder.append(size);
            iqz.mo514b(stringBuilder.toString());
            if (gev.f5122f) {
                gev.f5122f = false;
                if (!gev.f5119c.isEmpty()) {
                    gev.m2509a();
                }
            }
        }
        ejy ejy = this.f22836v;
        if (ejy != null) {
            ejy.m1824d();
        }
        this.f22833s = 0;
        this.f22826l = false;
        m17022d(false);
        this.f22830p.mo2771z().mo1701c();
        if (this.f22837w.mo2757l() != null) {
            m17046m();
        }
    }
}
