package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.stats.Instrumentation;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: daf */
public final class daf extends cvs {
    /* renamed from: c */
    public boolean f22776c;
    /* renamed from: d */
    public buh f22777d;
    /* renamed from: e */
    public final hch f22778e;
    /* renamed from: f */
    public hin f22779f;
    /* renamed from: g */
    public final how f22780g;
    /* renamed from: h */
    private dak f22781h;
    /* renamed from: i */
    private ikb f22782i;
    /* renamed from: j */
    private final BottomBarController f22783j;
    /* renamed from: k */
    private final hcd f22784k;
    /* renamed from: l */
    private final BottomBarListener f22785l;
    /* renamed from: m */
    private final dbv f22786m;
    /* renamed from: n */
    private final hny f22787n;
    /* renamed from: o */
    private final hnz f22788o = new dag(this);
    /* renamed from: p */
    private final haq f22789p = new daj();

    static {
        bli.m862a("ImgIntModule");
    }

    public daf(Context context, fbn fbn, don don, hjw hjw, gci gci, cbu cbu, gyi gyi, bpt bpt, gtf gtf, gsl gsl, bkw bkw, awr awr, ikd ikd, gpn gpn, cbr cbr, hek hek, heq heq, bpq bpq, hny hny, eby eby, ehj ehj, aws aws, ilp ilp, hnh hnh, hnf hnf, gos gos, gor gor, BottomBarController bottomBarController, hcd hcd, edk edk, ecd ecd, kbg kbg, ilp ilp2, gjk gjk, asu asu, dzh dzh, irs irs, grg grg, dpa dpa, ilp ilp3, how how, bmb bmb, ise ise, gnh gnh, bag bag, bah bah, Executor executor, bqq bqq, AccessibilityManager accessibilityManager, bsn bsn) {
        super(bag, bah);
        eae eae = new eae(gos, fbn, bkw);
        dae dae = new dae();
        HandlerThread handlerThread = new HandlerThread("ImageCaptureIntentModule.CameraHandler");
        handlerThread.start();
        dbv dbv = new dbv((byte) 0);
        dbv.f2976u = handlerThread;
        dbv.f2975t = new Handler(handlerThread.getLooper());
        Intent intent = awr.f989a.getIntent();
        if (intent == null) {
            throw new NullPointerException("Null intent");
        }
        dbv.f2957b = intent;
        if (ikd == null) {
            throw new NullPointerException("Null mainThread");
        }
        dbv.f2959d = ikd;
        if (context == null) {
            throw new NullPointerException("Null androidContext");
        }
        dbv.f2960e = context;
        if (bpt == null) {
            throw new NullPointerException("Null evCompViewController");
        }
        dbv.f2961f = bpt;
        if (gtf == null) {
            throw new NullPointerException("Null fileNamer");
        }
        dbv.f2962g = gtf;
        if (gsl == null) {
            throw new NullPointerException("Null filesProxy");
        }
        dbv.f2963h = gsl;
        if (gyi == null) {
            throw new NullPointerException("Null captureLayoutHelper");
        }
        dbv.f2964i = gyi;
        if (don == null) {
            throw new NullPointerException("Null oneCameraOpener");
        }
        dbv.f2966k = don;
        if (fbn == null) {
            throw new NullPointerException("Null oneCameraManager");
        }
        dbv.f2965j = fbn;
        if (hjw == null) {
            throw new NullPointerException("Null locationProvider");
        }
        dbv.f2967l = hjw;
        if (gci == null) {
            throw new NullPointerException("Null orientationManager");
        }
        dbv.f2968m = gci;
        if (gor == null) {
            throw new NullPointerException("Null settings");
        }
        dbv.f2969n = gor;
        if (gos == null) {
            throw new NullPointerException("Null settingsManager");
        }
        dbv.f2970o = gos;
        if (gpn == null) {
            throw new NullPointerException("Null cameraSoundPlayer");
        }
        dbv.f2977v = gpn;
        if (dzh == null) {
            throw new NullPointerException("Null cameraFacingSetting");
        }
        dbv.f2971p = dzh;
        dbv.f2972q = eae;
        if (bpq == null) {
            throw new NullPointerException("Null fatalErrorHandler");
        }
        dbv.f2979x = bpq;
        DisplayMetrics a = eag.m1727a(cbr.m1098a());
        if (a == null) {
            throw new NullPointerException("Null displayMetrics");
        }
        dbv.f2980y = a;
        if (hek == null) {
            throw new NullPointerException("Null viewfinder");
        }
        dbv.f2973r = hek;
        if (heq == null) {
            throw new NullPointerException("Null viewfinderSizeSelector");
        }
        dbv.f2974s = heq;
        dbv.f2981z = dae;
        if (cbu == null) {
            throw new NullPointerException("Null androidServices");
        }
        dbv.f2978w = cbu;
        if (eby == null) {
            throw new NullPointerException("Null cameraDeviceStatechart");
        }
        dbv.f2933A = eby;
        if (ehj == null) {
            throw new NullPointerException("Null imageIntentStatechart");
        }
        dbv.f2934B = ehj;
        if (aws == null) {
            throw new NullPointerException("Null activityLifetime");
        }
        dbv.f2937E = aws;
        if (ilp == null) {
            throw new NullPointerException("Null gridLinesProperty");
        }
        dbv.f2938F = ilp;
        if (hnh == null) {
            throw new NullPointerException("Null previewTapListener");
        }
        dbv.f2939G = hnh;
        if (hnf == null) {
            throw new NullPointerException("Null previewLongPressListener");
        }
        dbv.f2940H = hnf;
        if (edk == null) {
            throw new NullPointerException("Null countdownStatechart");
        }
        dbv.f2935C = edk;
        if (ecd == null) {
            throw new NullPointerException("Null cameraFacingStatechart");
        }
        dbv.f2936D = ecd;
        if (kbg == null) {
            throw new NullPointerException("Null flashIndicatorChipOptional");
        }
        dbv.f2941I = kbg;
        if (ilp2 == null) {
            throw new NullPointerException("Null flashMode");
        }
        dbv.f2942J = ilp2;
        if (gjk == null) {
            throw new NullPointerException("Null selfieFlashTorchSwitch");
        }
        dbv.f2943K = gjk;
        if (asu == null) {
            throw new NullPointerException("Null focusControllerFactory");
        }
        dbv.f2944L = asu;
        if (irs == null) {
            throw new NullPointerException("Null usageStatistics");
        }
        dbv.f2945M = irs;
        if (grg == null) {
            throw new NullPointerException("Null captureSessionStatsCollector");
        }
        dbv.f2946N = grg;
        if (dpa == null) {
            throw new NullPointerException("Null oneCameraSelector");
        }
        dbv.f2947O = dpa;
        if (ilp3 == null) {
            throw new NullPointerException("Null zoomProperty");
        }
        dbv.f2949Q = ilp3;
        if (bmb == null) {
            throw new NullPointerException("Null debugPropertyHelper");
        }
        dbv.f2950R = bmb;
        if (ise == null) {
            throw new NullPointerException("Null cameraWakeLock");
        }
        dbv.f2951S = ise;
        if (gnh == null) {
            throw new NullPointerException("Null sessionNotifier");
        }
        dbv.f2948P = gnh;
        if (executor == null) {
            throw new NullPointerException("Null executor");
        }
        dbv.f2952T = executor;
        if (bqq == null) {
            throw new NullPointerException("Null faceAnnouncer");
        }
        dbv.f2953U = bqq;
        if (accessibilityManager == null) {
            throw new NullPointerException("Null accessibilityManager");
        }
        dbv.f2954V = accessibilityManager;
        if (bsn == null) {
            throw new NullPointerException("Null flags");
        }
        dbv.f2955W = bsn;
        this.f22786m = dbv;
        this.f22787n = hny;
        this.f22783j = bottomBarController;
        this.f22784k = hcd;
        this.f22785l = new dah(this);
        this.f22778e = new dai(this);
        this.f22780g = how;
    }

    public final void close() {
    }

    public final fha f_() {
        Object obj = ((dbu) this.f22777d.mo572a()).mo2904C().f2904a;
        jri.m13139a(obj, (Object) "Hardware spec is queried before Camera is open");
        return obj;
    }

    /* renamed from: b */
    public final String mo2846b() {
        return ((dbu) this.f22777d.mo572a()).mo2927c().getResources().getString(R.string.photo_accessibility_peek);
    }

    /* renamed from: a */
    public final void mo2844a(gos gos) {
    }

    /* renamed from: a */
    public final void mo2843a(cfh cfh, ezy ezy) {
        ebd l = cfh.mo2757l();
        gyi gyi = this.f22786m.f2964i;
        if (gyi == null) {
            throw new IllegalStateException("Property \"captureLayoutHelper\" has not been set");
        }
        View view = cfh.mo2757l().f14915h;
        Executor executor = this.f22786m.f2952T;
        if (executor == null) {
            throw new IllegalStateException("Property \"executor\" has not been set");
        }
        this.f22781h = new dak(l, gyi, view, executor);
        dbv dbv = this.f22786m;
        dak dak = this.f22781h;
        if (dak == null) {
            throw new NullPointerException("Null moduleUI");
        }
        dbv.f2958c = dak;
        if (cfh == null) {
            throw new NullPointerException("Null appController");
        }
        dbv.f2956a = cfh;
        String str = "";
        if (dbv.f2956a == null) {
            str = String.valueOf(str).concat(" appController");
        }
        if (dbv.f2957b == null) {
            str = String.valueOf(str).concat(" intent");
        }
        if (dbv.f2958c == null) {
            str = String.valueOf(str).concat(" moduleUI");
        }
        if (dbv.f2959d == null) {
            str = String.valueOf(str).concat(" mainThread");
        }
        if (dbv.f2960e == null) {
            str = String.valueOf(str).concat(" androidContext");
        }
        if (dbv.f2961f == null) {
            str = String.valueOf(str).concat(" evCompViewController");
        }
        if (dbv.f2962g == null) {
            str = String.valueOf(str).concat(" fileNamer");
        }
        if (dbv.f2963h == null) {
            str = String.valueOf(str).concat(" filesProxy");
        }
        if (dbv.f2964i == null) {
            str = String.valueOf(str).concat(" captureLayoutHelper");
        }
        if (dbv.f2965j == null) {
            str = String.valueOf(str).concat(" oneCameraManager");
        }
        if (dbv.f2966k == null) {
            str = String.valueOf(str).concat(" oneCameraOpener");
        }
        if (dbv.f2967l == null) {
            str = String.valueOf(str).concat(" locationProvider");
        }
        if (dbv.f2968m == null) {
            str = String.valueOf(str).concat(" orientationManager");
        }
        if (dbv.f2969n == null) {
            str = String.valueOf(str).concat(" settings");
        }
        if (dbv.f2970o == null) {
            str = String.valueOf(str).concat(" settingsManager");
        }
        if (dbv.f2971p == null) {
            str = String.valueOf(str).concat(" cameraFacingSetting");
        }
        if (dbv.f2972q == null) {
            str = String.valueOf(str).concat(" resolutionSetting");
        }
        if (dbv.f2973r == null) {
            str = String.valueOf(str).concat(" viewfinder");
        }
        if (dbv.f2974s == null) {
            str = String.valueOf(str).concat(" viewfinderSizeSelector");
        }
        if (dbv.f2975t == null) {
            str = String.valueOf(str).concat(" cameraHandler");
        }
        if (dbv.f2976u == null) {
            str = String.valueOf(str).concat(" cameraHandlerThread");
        }
        if (dbv.f2977v == null) {
            str = String.valueOf(str).concat(" cameraSoundPlayer");
        }
        if (dbv.f2978w == null) {
            str = String.valueOf(str).concat(" androidServices");
        }
        if (dbv.f2979x == null) {
            str = String.valueOf(str).concat(" fatalErrorHandler");
        }
        if (dbv.f2980y == null) {
            str = String.valueOf(str).concat(" displayMetrics");
        }
        if (dbv.f2981z == null) {
            str = String.valueOf(str).concat(" imageIntentHardwareSpecProvider");
        }
        if (dbv.f2933A == null) {
            str = String.valueOf(str).concat(" cameraDeviceStatechart");
        }
        if (dbv.f2934B == null) {
            str = String.valueOf(str).concat(" imageIntentStatechart");
        }
        if (dbv.f2935C == null) {
            str = String.valueOf(str).concat(" countdownStatechart");
        }
        if (dbv.f2936D == null) {
            str = String.valueOf(str).concat(" cameraFacingStatechart");
        }
        if (dbv.f2937E == null) {
            str = String.valueOf(str).concat(" activityLifetime");
        }
        if (dbv.f2938F == null) {
            str = String.valueOf(str).concat(" gridLinesProperty");
        }
        if (dbv.f2939G == null) {
            str = String.valueOf(str).concat(" previewTapListener");
        }
        if (dbv.f2940H == null) {
            str = String.valueOf(str).concat(" previewLongPressListener");
        }
        if (dbv.f2942J == null) {
            str = String.valueOf(str).concat(" flashMode");
        }
        if (dbv.f2943K == null) {
            str = String.valueOf(str).concat(" selfieFlashTorchSwitch");
        }
        if (dbv.f2944L == null) {
            str = String.valueOf(str).concat(" focusControllerFactory");
        }
        if (dbv.f2945M == null) {
            str = String.valueOf(str).concat(" usageStatistics");
        }
        if (dbv.f2946N == null) {
            str = String.valueOf(str).concat(" captureSessionStatsCollector");
        }
        if (dbv.f2947O == null) {
            str = String.valueOf(str).concat(" oneCameraSelector");
        }
        if (dbv.f2948P == null) {
            str = String.valueOf(str).concat(" sessionNotifier");
        }
        if (dbv.f2949Q == null) {
            str = String.valueOf(str).concat(" zoomProperty");
        }
        if (dbv.f2950R == null) {
            str = String.valueOf(str).concat(" debugPropertyHelper");
        }
        if (dbv.f2951S == null) {
            str = String.valueOf(str).concat(" cameraWakeLock");
        }
        if (dbv.f2952T == null) {
            str = String.valueOf(str).concat(" executor");
        }
        if (dbv.f2953U == null) {
            str = String.valueOf(str).concat(" faceAnnouncer");
        }
        if (dbv.f2954V == null) {
            str = String.valueOf(str).concat(" accessibilityManager");
        }
        if (dbv.f2955W == null) {
            str = String.valueOf(str).concat(" flags");
        }
        if (str.isEmpty()) {
            this.f22777d = new bui(new dbt(dbv.f2956a, dbv.f2957b, dbv.f2958c, dbv.f2959d, dbv.f2960e, dbv.f2961f, dbv.f2962g, dbv.f2963h, dbv.f2964i, dbv.f2965j, dbv.f2966k, dbv.f2967l, dbv.f2968m, dbv.f2969n, dbv.f2970o, dbv.f2971p, dbv.f2972q, dbv.f2973r, dbv.f2974s, dbv.f2975t, dbv.f2976u, dbv.f2977v, dbv.f2978w, dbv.f2979x, dbv.f2980y, dbv.f2981z, dbv.f2933A, dbv.f2934B, dbv.f2935C, dbv.f2936D, dbv.f2937E, dbv.f2938F, dbv.f2939G, dbv.f2940H, dbv.f2941I, dbv.f2942J, dbv.f2943K, dbv.f2944L, dbv.f2945M, dbv.f2946N, dbv.f2947O, dbv.f2948P, dbv.f2949Q, dbv.f2950R, dbv.f2951S, dbv.f2952T, dbv.f2953U, dbv.f2954V, dbv.f2955W));
            buh buh = this.f22777d;
            buh.mo574a(new dbx(buh, (byte) 0));
            return;
        }
        str = String.valueOf(str);
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: c */
    public final boolean mo2849c() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo2838e() {
        return true;
    }

    /* renamed from: a */
    public final void mo2842a(aah aah) {
    }

    /* renamed from: a */
    public final boolean mo2845a(int i, KeyEvent keyEvent) {
        if (m17016m()) {
            switch (i) {
                case 23:
                case 27:
                    this.f22777d.mo573a(new dau(i, keyEvent));
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
    }

    /* renamed from: a */
    public final void mo2836a(int i) {
    }

    public final void m_() {
        this.f22777d.mo573a(new daz());
    }

    /* renamed from: j */
    public final void mo2851j() {
    }

    /* renamed from: m */
    final boolean m17016m() {
        return this.f22781h.f2906b.m11791b() ^ 1;
    }

    /* renamed from: k */
    public final void mo2852k() {
        this.f22782i = new ikb();
        this.f22782i.mo1879a(this.f22784k.m3023a(this.f22778e));
        this.f22783j.addListener(this.f22785l);
        ((dbu) this.f22777d.mo572a()).mo2929e().mo2743a(this.f22789p, true);
        ((grt) Instrumentation.instance().modeSwitch().getCurrentSession()).m11410b();
        dak dak = this.f22781h;
        ikd.m12259a();
        dak.f2905a.m9602a(dak.f2911g);
        this.f22777d.mo573a(new dbc());
        this.f22787n.m11922a(this.f22788o);
    }

    /* renamed from: l */
    public final void mo2853l() {
        this.f22781h.m1571a(null);
        dak dak = this.f22781h;
        ikd.m12259a();
        ebd ebd = dak.f2905a;
        ebd.f14887D.mo1215b(dak.f2911g);
        this.f22783j.removeListener(this.f22785l);
        this.f22777d.mo573a(new dbd());
        this.f22782i.close();
        this.f22787n.m11924b(this.f22788o);
    }
}
