package p000;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.FeatureInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import android.support.v4.app.ActionBarDrawerToggle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.C0042R;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.faceboxes.FaceView;
import com.google.android.apps.camera.legacy.app.activity.TrampolineActivity;
import com.google.android.apps.camera.legacy.app.filmstrip.FilmstripFragmentImpl;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.ExternalViewerButton;
import com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity;
import com.google.android.apps.camera.stats.CameraActivitySession;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.ui.tutorialoverlay.TutorialOverlayWrapper;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;
import com.google.android.apps.camera.ui.wirers.PreviewOverlay;
import com.google.android.apps.camera.videoplayer.VideoPlayerActivity;
import com.google.common.io.ByteStreams;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: cfk */
public final class cfk implements cfh, csf, emm, emn, emp, emq, emr, emy, eny, enz, eoa, eob, eoc, eoe, eof, eog, eoh, eoj, eok, eol, gyr {
    /* renamed from: a */
    public static final String f20249a = bli.m862a("CameraActivity");
    /* renamed from: A */
    public csh f20250A;
    /* renamed from: B */
    public het f20251B;
    /* renamed from: C */
    public ebd f20252C;
    /* renamed from: D */
    public csw f20253D;
    /* renamed from: E */
    public FrameLayout f20254E;
    /* renamed from: F */
    public cqb f20255F;
    /* renamed from: G */
    public hfz f20256G;
    /* renamed from: H */
    public cvx f20257H;
    /* renamed from: I */
    public eja f20258I;
    /* renamed from: J */
    public cqm f20259J;
    /* renamed from: K */
    public cqx f20260K;
    /* renamed from: L */
    public hfy f20261L;
    /* renamed from: M */
    public csp f20262M;
    /* renamed from: N */
    public crt f20263N;
    /* renamed from: O */
    public final ecd f20264O;
    /* renamed from: P */
    public final ScheduledExecutorService f20265P;
    /* renamed from: Q */
    public final irs f20266Q;
    /* renamed from: R */
    public hhx f20267R;
    /* renamed from: S */
    public boolean f20268S = false;
    /* renamed from: T */
    public boolean f20269T = false;
    /* renamed from: U */
    public boolean f20270U = false;
    /* renamed from: V */
    public boolean f20271V = false;
    /* renamed from: W */
    public boolean f20272W = false;
    /* renamed from: X */
    public boolean f20273X;
    /* renamed from: Y */
    public boolean f20274Y;
    /* renamed from: Z */
    public boolean f20275Z;
    private final Resources aA;
    private final hat aB;
    private final gor aC;
    private final Window aD;
    private final WindowManager aE;
    private final enr aF;
    private final bfk aG;
    private final gvr aH;
    private final awm aI;
    private final kwk aJ;
    private final kwk aK;
    private final cwd aL;
    private final kwk aM;
    private final bmb aN;
    private hdm aO;
    private ActionBar aP;
    private kwa aQ;
    private cpl aR;
    private cpl aS;
    private FragmentManager aT;
    private kbg aU;
    private Menu aV;
    private int aW;
    private gev aX;
    private iqo aY;
    private final edb aZ;
    public boolean aa;
    public final ebq ab;
    public final Runnable ac = new cfn(this);
    public final iqt ad = new cfp(this);
    public final glq ae = new cfr(this);
    private final cbr af;
    private final awi ag;
    private final cbu ah;
    private final dzg ai;
    private final BottomBarController aj;
    private final kwk ak;
    private final cgu al;
    private final gyi am;
    private final glj an;
    private final hkg ao;
    private final ContentResolver ap;
    private final bpq aq;
    private final awr ar;
    private final LayoutInflater as;
    private final hjw at;
    private final Looper au;
    private final cvy av;
    private final fhc aw;
    private final fbn ax;
    private final gci ay;
    private final hek az;
    /* renamed from: b */
    public final chu f20276b;
    private final ilp bA;
    private final cdq bB;
    private final gnh bC;
    private final gyl bD;
    private final boolean bE;
    private final crx bF = new crx(this);
    private final csj bG = new csz(new cgf(this));
    private final cst bH = new cst(this);
    private final cqc bI = new cqc(this);
    private final abn bJ = new cfv(this);
    private final edf ba;
    private final edo bb;
    private final ehu bc;
    private final gwo bd;
    private final hhj be;
    private final kbg bf;
    private hny bg;
    private final bkw bh;
    private final gal bi;
    private hhx bj;
    private boolean bk = false;
    private boolean bl;
    private boolean bm;
    private boolean bn = true;
    private boolean bo = false;
    private final boolean bp;
    private iqo bq;
    private boolean br = false;
    private boolean bs = false;
    private abi bt;
    private final gyz bu;
    private final gwp bv;
    private ebm bw;
    private final gzy bx;
    private final ilp by;
    private final ilp bz;
    /* renamed from: c */
    public final bag f20277c;
    /* renamed from: d */
    public final gln f20278d;
    /* renamed from: e */
    public final Context f20279e;
    /* renamed from: f */
    public final Context f20280f;
    /* renamed from: g */
    public final ikd f20281g;
    /* renamed from: h */
    public final Handler f20282h;
    /* renamed from: i */
    public final Instrumentation f20283i = Instrumentation.instance();
    /* renamed from: j */
    public final CameraActivitySession f20284j;
    /* renamed from: k */
    public final erh f20285k;
    /* renamed from: l */
    public final irh f20286l;
    /* renamed from: m */
    public final gos f20287m;
    /* renamed from: n */
    public final gsp f20288n;
    /* renamed from: o */
    public final ird f20289o;
    /* renamed from: p */
    public final AtomicBoolean f20290p = new AtomicBoolean(false);
    /* renamed from: q */
    public final Uri[] f20291q = new Uri[1];
    /* renamed from: r */
    public final WeakReference f20292r;
    /* renamed from: s */
    public final aws f20293s;
    /* renamed from: t */
    public final gst f20294t;
    /* renamed from: u */
    public final Executor f20295u;
    /* renamed from: v */
    public final ikp f20296v;
    /* renamed from: w */
    public final Intent f20297w;
    /* renamed from: x */
    public final boolean f20298x;
    /* renamed from: y */
    public gvt f20299y;
    /* renamed from: z */
    public crw f20300z;

    public cfk(Context context, Context context2, Resources resources, Window window, ContentResolver contentResolver, LayoutInflater layoutInflater, Handler handler, awr awr, hkg hkg, enr enr, Activity activity, aws aws, awi awi, ikd ikd, WindowManager windowManager, cvy cvy, fhc fhc, hat hat, boolean z, gci gci, fbn fbn, chz chz, cgu cgu, erh erh, irh irh, hjw hjw, gos gos, gor gor, gsp gsp, gyi gyi, gln gln, glj glj, bag bag, hek hek, het het, ActionBar actionBar, kwa kwa, dzg dzg, bpq bpq, ScheduledExecutorService scheduledExecutorService, gst gst, Executor executor, bfk bfk, gvr gvr, hjf hjf, awm awm, gev gev, cqb cqb, cqm cqm, cqx cqx, kwk kwk, cbu cbu, cbr cbr, ird ird, CameraActivitySession cameraActivitySession, kwk kwk2, kwk kwk3, edb edb, edf edf, edo edo, ecd ecd, ehu ehu, gwo gwo, hhj hhj, cwd cwd, Intent intent, BottomBarController bottomBarController, kwk kwk4, bmb bmb, ebq ebq, kbg kbg, hny hny, irs irs, bkw bkw, kbg kbg2, gyz gyz, gwp gwp, ebm ebm, gal gal, gzy gzy, ilp ilp, ilp ilp2, ilp ilp3, cdq cdq, kbg kbg3, gnh gnh, gyl gyl, kbg kbg4) {
        this.f20280f = (Context) jri.m13152b((Object) context);
        this.f20279e = (Context) jri.m13152b((Object) context2);
        this.aA = (Resources) jri.m13152b((Object) resources);
        this.aD = (Window) jri.m13152b((Object) window);
        this.aj = bottomBarController;
        this.ak = kwk4;
        this.ap = (ContentResolver) jri.m13152b((Object) contentResolver);
        this.f20281g = (ikd) jri.m13152b((Object) ikd);
        this.as = (LayoutInflater) jri.m13152b((Object) layoutInflater);
        this.f20282h = (Handler) jri.m13152b((Object) handler);
        this.au = (Looper) jri.m13152b(handler.getLooper());
        this.ar = (awr) jri.m13152b((Object) awr);
        this.ao = (hkg) jri.m13152b((Object) hkg);
        this.aE = (WindowManager) jri.m13152b((Object) windowManager);
        this.aT = (FragmentManager) jri.m13152b(activity.getFragmentManager());
        this.aB = (hat) jri.m13152b((Object) hat);
        this.av = (cvy) jri.m13152b((Object) cvy);
        this.aw = (fhc) jri.m13152b((Object) fhc);
        this.f20293s = (aws) jri.m13152b((Object) aws);
        this.aF = (enr) jri.m13152b((Object) enr);
        this.ag = (awi) jri.m13152b((Object) awi);
        this.f20298x = z;
        this.ay = (gci) jri.m13152b((Object) gci);
        this.ax = (fbn) jri.m13152b((Object) fbn);
        this.al = (cgu) jri.m13152b((Object) cgu);
        this.aH = (gvr) jri.m13152b((Object) gvr);
        this.f20285k = (erh) jri.m13152b((Object) erh);
        this.f20286l = (irh) jri.m13152b((Object) irh);
        this.at = (hjw) jri.m13152b((Object) hjw);
        this.f20287m = (gos) jri.m13152b((Object) gos);
        this.aC = (gor) jri.m13152b((Object) gor);
        this.f20288n = (gsp) jri.m13152b((Object) gsp);
        this.am = (gyi) jri.m13152b((Object) gyi);
        this.f20277c = (bag) jri.m13152b((Object) bag);
        this.f20278d = (gln) jri.m13152b((Object) gln);
        this.an = (glj) jri.m13152b((Object) glj);
        this.az = (hek) jri.m13152b((Object) hek);
        this.ai = (dzg) jri.m13152b((Object) dzg);
        this.aq = (bpq) jri.m13152b((Object) bpq);
        this.f20294t = (gst) jri.m13152b((Object) gst);
        this.f20295u = (Executor) jri.m13152b((Object) executor);
        this.aG = (bfk) jri.m13152b((Object) bfk);
        this.aP = (ActionBar) jri.m13152b((Object) actionBar);
        this.f20251B = (het) jri.m13152b((Object) het);
        this.aQ = (kwa) jri.m13152b((Object) kwa);
        this.aZ = (edb) jri.m13152b((Object) edb);
        this.ba = (edf) jri.m13152b((Object) edf);
        this.bb = (edo) jri.m13152b((Object) edo);
        this.f20264O = (ecd) jri.m13152b((Object) ecd);
        this.bd = (gwo) jri.m13152b((Object) gwo);
        this.be = (hhj) jri.m13152b((Object) hhj);
        this.bc = (ehu) jri.m13152b((Object) ehu);
        this.f20276b = (chu) jri.m13152b((Object) chz);
        jri.m13152b((Object) hjf);
        this.aI = (awm) jri.m13152b((Object) awm);
        this.aX = (gev) jri.m13152b((Object) gev);
        this.f20255F = (cqb) jri.m13152b((Object) cqb);
        this.f20259J = (cqm) jri.m13152b((Object) cqm);
        this.f20260K = (cqx) jri.m13152b((Object) cqx);
        this.aJ = (kwk) jri.m13152b((Object) kwk);
        this.ah = (cbu) jri.m13152b((Object) cbu);
        this.f20289o = (ird) jri.m13152b((Object) ird);
        this.af = (cbr) jri.m13152b((Object) cbr);
        this.f20284j = cameraActivitySession;
        this.aK = (kwk) jri.m13152b((Object) kwk2);
        this.aM = (kwk) jri.m13152b((Object) kwk3);
        this.aL = cwd;
        this.f20297w = intent;
        this.f20275Z = intent.getBooleanExtra("open_filmstrip", false);
        this.aN = bmb;
        this.ab = ebq;
        this.bf = kbg;
        this.bg = (hny) jri.m13152b((Object) hny);
        this.f20265P = scheduledExecutorService;
        this.f20266Q = irs;
        this.bh = bkw;
        this.bu = gyz;
        this.bv = gwp;
        this.bw = ebm;
        this.bi = gal;
        this.bx = gzy;
        this.by = ilp;
        this.bz = ilp2;
        this.bA = ilp3;
        this.bB = cdq;
        this.bD = gyl;
        this.bp = kbg3.mo2084b();
        this.bC = gnh;
        this.bE = kbg4.mo2084b();
        this.f20292r = new WeakReference(activity);
        this.f20296v = new ikp(scheduledExecutorService, 1000, TimeUnit.MILLISECONDS);
        this.bt = new abi(this.bJ, handler);
        gyz.f5828b = this;
        this.bj = hhx.UNINITIALIZED;
    }

    /* renamed from: a */
    public static /* synthetic */ void m14941a(cfk cfk, err err) {
        String str;
        if (err.mo1037k().f4114b.f4121g) {
            str = "application/vnd.google.panorama360+jpg";
        } else {
            str = err.mo1033g().f4151d;
        }
        Intent addFlags = new Intent("android.intent.action.EDIT").setDataAndType(err.mo1033g().f4155h, str).addFlags(1).addFlags(65536);
        try {
            cfk.mo2749b(addFlags);
        } catch (ActivityNotFoundException e) {
            cfk.mo2749b(Intent.createChooser(addFlags, cfk.aA.getString(R.string.edit_with)));
        }
    }

    /* renamed from: a */
    static /* synthetic */ boolean m14943a(err err, glw glw) {
        return (err instanceof cou) && glw == glw.BURST;
    }

    /* renamed from: a */
    public final void mo2742a(ham ham) {
        this.f20252C.m9602a(ham);
    }

    /* renamed from: G */
    public final void m14962G() {
        ikd.m12259a();
        bli.m871d(f20249a, "cancelPreviewStop");
        this.f20270U = false;
        this.f20271V = false;
        this.f20296v.m12262a();
    }

    /* renamed from: a */
    final void m14984a(cvx cvx) {
        cvx.m_();
        cvx.mo2853l();
        ebd ebd = this.f20252C;
        FrameLayout frameLayout = ebd.f14917j;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        ebd.f14921n.m1333a();
        ebd.m9611c(true);
        ebd.f14930w = null;
        PreviewOverlay previewOverlay = ebd.f14924q;
        previewOverlay.f2446a = null;
        previewOverlay.f2447b = null;
    }

    /* renamed from: H */
    public final int m14963H() {
        int i;
        if (this.f20267R != hhx.PHOTO) {
            i = 0;
        } else {
            i = 1;
        }
        if (this.f20267R == hhx.VIDEO) {
            i = 8;
        }
        if (this.f20267R == hhx.LENS_BLUR) {
            i = 6;
        }
        if (this.f20267R == hhx.PHOTO_SPHERE) {
            i = 5;
        }
        if (this.f20267R == hhx.PANORAMA) {
            i = 11;
        }
        if (this.f20267R == hhx.PORTRAIT) {
            i = 21;
        }
        if (this.f20267R == hhx.IMAGE_INTENT) {
            i = 19;
        }
        if (this.f20267R == hhx.VIDEO_INTENT) {
            i = 20;
        }
        if (m14936V()) {
            return 2;
        }
        return i;
    }

    /* renamed from: a */
    private final void m14942a(hhx hhx, int i) {
        if (this.bk || this.f20267R != hhx) {
            this.bk = false;
            this.f20283i.modeSwitch().create();
            if ((this.f20267R == hhx.PHOTO || this.f20267R == hhx.VIDEO || this.f20267R == hhx.PORTRAIT || this.f20267R == hhx.LENS_BLUR) && (hhx == hhx.PHOTO || hhx == hhx.VIDEO || hhx == hhx.PORTRAIT || hhx == hhx.LENS_BLUR)) {
                this.f20287m.mo1531a("default_scope", "pref_mode_switch_camera_id_key", i);
            }
            m14984a(this.f20257H);
            if (!m14954d(this.f20267R) && m14954d(hhx)) {
                String str = f20249a;
                String valueOf = String.valueOf(hhx);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 52);
                stringBuilder.append("cameraDeviceManager is shutdown as selected mode is ");
                stringBuilder.append(valueOf);
                bli.m863a(str, stringBuilder.toString());
                this.f20286l.m4082a(true);
            }
            m14955e(hhx);
            if (!this.f20257H.mo2838e()) {
                hek hek = this.az;
                synchronized (hek.f6091a) {
                    hek.m3097a();
                }
            }
            m14948b(this.f20257H);
            if (((Boolean) this.by.mo2860b()).booleanValue()) {
                this.bx.af();
            }
        }
    }

    /* renamed from: b */
    public static float m14944b(cre cre) {
        if (cre == cre.f2587c) {
            return 0.0f;
        }
        return ((float) (System.currentTimeMillis() - new File(cre.mo1066e().mo1033g().f4154g).lastModified())) * 0.001f;
    }

    /* renamed from: c */
    public static String m14951c(cre cre) {
        if (cre == cre.f2587c) {
            return "";
        }
        return new File(cre.mo1066e().mo1033g().f4154g).getName();
    }

    /* renamed from: a */
    public final void mo2735a() {
        m14940a(0, new Intent());
    }

    /* renamed from: a */
    public final void mo2737a(Intent intent) {
        m14940a(-1, intent);
    }

    /* renamed from: a */
    private final void m14940a(int i, Intent intent) {
        awr awr = this.ar;
        jri.m13152b((Object) intent);
        awr.f989a.setResult(i, intent);
        mo2745a("CameraActivityController: Intent completed with a valid result. Closing activity.");
    }

    /* renamed from: a */
    public final void mo2745a(String str) {
        this.ag.m707a(str);
    }

    /* renamed from: b */
    public final Context mo2748b() {
        return this.f20279e;
    }

    /* renamed from: c */
    public final cbr mo2752c() {
        return this.af;
    }

    /* renamed from: d */
    public final Window mo2754d() {
        return this.aD;
    }

    /* renamed from: e */
    public final WindowManager mo2755e() {
        return this.aE;
    }

    /* renamed from: k */
    public final Context mo2756k() {
        return this.f20280f;
    }

    /* renamed from: R */
    private final hhx m14932R() {
        String action = this.ar.f989a.getIntent().getAction();
        if ("android.media.action.VIDEO_CAMERA".equals(action)) {
            return hhx.VIDEO;
        }
        if ("android.media.action.VIDEO_CAPTURE".equals(action)) {
            return hhx.VIDEO_INTENT;
        }
        if ("android.media.action.IMAGE_CAPTURE".equals(action) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(action)) {
            return hhx.IMAGE_INTENT;
        }
        if (!this.bl && !"android.media.action.STILL_IMAGE_CAMERA".equals(action) && !"android.media.action.STILL_IMAGE_CAMERA_SECURE".equals(action) && !"android.media.action.IMAGE_CAPTURE_SECURE".equals(action)) {
            return m14935U();
        }
        hhx U = m14935U();
        if (this.f20287m.mo1535a("default_scope", "pref_user_selected_aspect_ratio")) {
            return U;
        }
        return m14935U();
    }

    /* renamed from: l */
    public final ebd mo2757l() {
        return this.f20252C;
    }

    /* renamed from: m */
    public final fhc mo2758m() {
        return this.aw;
    }

    /* renamed from: n */
    public final bah mo2759n() {
        return this.al;
    }

    /* renamed from: o */
    public final String mo2760o() {
        return gos.m2669a(this.al.f11918e.mo521a().f7482b);
    }

    /* renamed from: p */
    public final hkg mo2761p() {
        return this.ao;
    }

    /* renamed from: q */
    public final ContentResolver mo2762q() {
        return this.ap;
    }

    /* renamed from: r */
    public final hhx mo2763r() {
        return this.f20267R;
    }

    /* renamed from: s */
    public final cvx mo2764s() {
        return this.f20257H;
    }

    /* renamed from: S */
    private final synchronized kbg m14933S() {
        if (this.aU == null) {
            this.aU = axh.m730a(this.f20280f);
        }
        return this.aU;
    }

    /* renamed from: t */
    public final LayoutInflater mo2765t() {
        return this.as;
    }

    /* renamed from: u */
    public final hjw mo2766u() {
        return this.at;
    }

    /* renamed from: v */
    public final Looper mo2767v() {
        return this.au;
    }

    /* renamed from: c */
    private final cvx m14950c(hhx hhx) {
        Throwable e;
        cvx cvx = null;
        ikd.m12259a();
        if (mo2729D()) {
            cvz a = this.av.mo1102a(hhx);
            if (a != null) {
                try {
                    cvx = (cvx) a.mo1105a().get();
                } catch (InterruptedException e2) {
                    e = e2;
                    throw new IllegalStateException(e);
                } catch (ExecutionException e3) {
                    e = e3;
                    throw new IllegalStateException(e);
                }
            }
        }
        return cvx;
    }

    /* renamed from: w */
    public final String mo2768w() {
        return gos.m2671b(this.av.mo1102a(this.f20267R).mo1106b().f2813b);
    }

    /* renamed from: x */
    public final gci mo2769x() {
        return this.ay;
    }

    /* renamed from: T */
    private final int m14934T() {
        if (this.f20269T) {
            return 2;
        }
        return 0;
    }

    /* renamed from: y */
    public final Resources mo2770y() {
        return this.aA;
    }

    /* renamed from: z */
    public final hat mo2771z() {
        return this.aB;
    }

    /* renamed from: A */
    public final bag mo2726A() {
        return this.f20277c;
    }

    /* renamed from: B */
    public final gos mo2727B() {
        return this.f20287m;
    }

    /* renamed from: U */
    private final hhx m14935U() {
        try {
            hhx hhx = (hhx) awl.m710a(this.ar.f989a.getIntent()).mo2083a(cfl.f11820a).mo2082a(hhx.PHOTO);
            if (hhx.m3150a(hhx, this.bp)) {
                return hhx;
            }
            bli.m873e(f20249a, String.format("Cannot launch directly into %s mode, defaulting to PHOTO", new Object[]{hhx.PHOTO}));
            return hhx.PHOTO;
        } catch (Throwable e) {
            bli.m867b(f20249a, "Error deserializing mode from Intent extra", e);
            return hhx.PHOTO;
        }
    }

    /* renamed from: C */
    public final WeakReference mo2728C() {
        return this.f20292r;
    }

    /* renamed from: I */
    public final void m14964I() {
        crt crt = this.f20263N;
        crt.f2603b = false;
        crt.m1438a();
    }

    /* renamed from: D */
    public final boolean mo2729D() {
        ikd.m12259a();
        if (!(this.bo || this.f20293s.mo377e())) {
            Object obj;
            String string;
            boolean z;
            this.bo = true;
            bli.m869c(f20249a, "Begin initializeOnce() of CameraActivityController");
            this.f20289o.mo1903a("CameraActivityController#init");
            this.f20289o.mo1903a("CameraActivityUi#inflate");
            hes hes = (hes) this.aQ.mo345a();
            this.f20289o.mo1905b("AppUpgrader#upgrade");
            this.ai.m1737a(this.f20287m, this.ax);
            gos gos = this.f20287m;
            Context context = this.f20280f;
            fbn fbn = this.ax;
            bfk bfk = this.aG;
            gos.mo1530a("pref_camera_countdown_duration_key", 0, context.getResources().getIntArray(R.array.pref_countdown_duration));
            for (FeatureInfo featureInfo : context.getPackageManager().getSystemAvailableFeatures()) {
                if (featureInfo.name != null && featureInfo.name.equals("org.chromium.arc")) {
                    obj = 1;
                    break;
                }
            }
            obj = null;
            if (obj != null) {
                string = context.getString(R.string.pref_camera_id_default_arc);
            } else {
                string = context.getString(R.string.pref_camera_id_default);
            }
            gos.mo1533a("pref_camera_id_key", string, context.getResources().getStringArray(R.array.camera_id_entryvalues));
            gos.mo1533a("pref_camera_scenemode_key", context.getString(R.string.pref_camera_scenemode_default), context.getResources().getStringArray(R.array.pref_camera_scenemode_entryvalues));
            gos.mo1533a("pref_camera_flashmode_key", context.getString(R.string.pref_camera_flashmode_default), context.getResources().getStringArray(R.array.pref_camera_flashmode_entryvalues));
            gos.mo1533a("pref_hdr_support_mode_back_camera", context.getString(R.string.pref_camera_hdr_supportmode_none), context.getResources().getStringArray(R.array.pref_camera_hdr_supportmode_entryvalues));
            gos.mo1534a("pref_camera_hdr_key", false);
            gos.mo1534a("pref_camera_selfie_flashmode_key", false);
            iur b = fbn.mo1346b(iut.BACK);
            if (b != null) {
                fbn.m10176b(b);
                gos.mo1533a("pref_camera_hdr_plus_key", context.getString(R.string.pref_camera_hdr_plus_default_auto), context.getResources().getStringArray(R.array.pref_camera_hdrplus_entryvalues));
            } else {
                gos.mo1533a("pref_camera_hdr_plus_key", context.getString(R.string.pref_camera_hdr_plus_default), context.getResources().getStringArray(R.array.pref_camera_hdrplus_entryvalues));
            }
            gos.mo1534a("pref_camera_first_use_hint_shown_key", true);
            gos.mo1533a("pref_camera_focusmode_key", context.getString(R.string.pref_camera_focusmode_default), context.getResources().getStringArray(R.array.pref_camera_focusmode_entryvalues));
            String string2 = context.getString(R.string.pref_video_quality_large);
            if (b != null) {
                kbg b2 = bfk.mo2670b(b);
                string = b2.mo2084b() ? ((bez) b2.mo2081a()).m805a(inc.FPS_30, ine.RES_2160P) ? context.getResources().getString(R.string.pref_video_quality_medium) : string2 : string2;
            } else {
                string = string2;
            }
            gos.mo1533a("pref_video_quality_back_key", string, context.getResources().getStringArray(R.array.pref_video_quality_entryvalues));
            if (!gos.mo1544e("default_scope", "pref_video_quality_back_key")) {
                gos.mo1546g("default_scope", "pref_video_quality_back_key");
            }
            gos.mo1533a("pref_video_quality_front_key", context.getResources().getString(R.string.pref_video_quality_large), context.getResources().getStringArray(R.array.pref_video_quality_entryvalues));
            if (!gos.mo1544e("default_scope", "pref_video_quality_front_key")) {
                gos.mo1546g("default_scope", "pref_video_quality_front_key");
            }
            gos.mo1534a("pref_video_stabilization_key", true);
            gos.mo1533a("pref_video_encoding_key", context.getResources().getString(R.string.pref_video_encoding_default), context.getResources().getStringArray(R.array.pref_video_encoding_entryvalues));
            gos.mo1533a("pref_camera_jpegquality_key", context.getString(R.string.pref_camera_jpeg_quality_normal), context.getResources().getStringArray(R.array.pref_camera_jpeg_quality_entryvalues));
            gos.mo1533a("pref_camera_video_flashmode_key", context.getString(R.string.pref_camera_video_flashmode_default), context.getResources().getStringArray(R.array.pref_camera_video_flashmode_entryvalues));
            gos.mo1533a("pref_video_fps_key", gom.FPS_30.name(), new String[]{gom.FPS_30.name(), gom.FPS_60.name(), gom.FPS_AUTO.name()});
            gos.mo1533a("pref_video_effect_key", context.getString(R.string.pref_video_effect_default), context.getResources().getStringArray(R.array.pref_video_effect_entryvalues));
            gos.mo1534a("pref_video_first_use_hint_shown_key", true);
            gos.mo1533a("pref_camera_pano_orientation", context.getString(R.string.pano_orientation_horizontal), context.getResources().getStringArray(R.array.pref_camera_pano_orientation_entryvalues));
            gos.mo1533a("pref_camera_photosphere_orientation", context.getString(R.string.pano_orientation_photosphere), context.getResources().getStringArray(R.array.pref_camera_pano_orientation_entryvalues));
            gos.mo1534a("pref_camera_grid_lines", false);
            gos.mo1530a("pref_camera_grid_lines_mode", gxk.OFF.f5765e, gxk.m2867a());
            gos.mo1534a("pref_should_show_refocus_viewer_cling", true);
            gos.mo1534a("pref_should_show_settings_button_cling", true);
            gos.mo1534a("pref_dirty_lens_detector_key", true);
            gos.mo1534a("pref_auto_generate_artifacts", true);
            this.f20289o.mo1905b("UiWirer#wire");
            this.be.mo1729a();
            this.f20289o.mo1905b("UiControllerInitializer#init");
            gwo gwo = this.bd;
            switch (gwo.f5730i.ordinal()) {
                case 9:
                    gwo.f5724c.mo345a();
                    gwo.f5723b.mo345a();
                    efk efk = (efk) gwo.f5726e.mo345a();
                    efp efp = efk.f3593a;
                    efp.f3597b.m1749a();
                    efp.f3596a.mo3429a(efp.f3598c, efp.f3599d, efp.f3600e, efp.f3601f, efp.f3602g, efp.f3603h, efp.f3604i);
                    efk.f3594b.m1748a();
                    efk.f3595c.m9869b();
                    ((gqj) gwo.f5727f.mo345a()).mo1562a();
                    break;
                case 10:
                    gwo.f5724c.mo345a();
                    gwo.f5723b.mo345a();
                    egp egp = (egp) gwo.f5728g.mo345a();
                    egp.f3624a.m1750a();
                    egv egv = egp.f3625b;
                    egv.f3627a.mo3561a(egv.f3628b, egv.f3629c, egv.f3630d, egv.f3631e, egv.f3632f, egv.f3633g, egv.f3634h);
                    egp.f3626c.m9869b();
                    ((eia) gwo.f5729h.mo345a()).mo1562a();
                    break;
                default:
                    edw edw = (edw) gwo.f5722a.mo345a();
                    eek eek = edw.f3535a;
                    eer eer = eek.f3543b;
                    efc efc = eer.f3552b;
                    efu efu = efc.f3574b;
                    efu.f3605a.mo3430a(efu.f3606b, efu.f3607c, efu.f3608d, efu.f3609e);
                    egg egg = efc.f3575c;
                    egg.f3615b.m1749a();
                    ehe ehe = egg.f3616c;
                    ehe.f3635a.mo3562a(ehe.f3636b, ehe.f3637c, ehe.f3638d, ehe.f3639e, ehe.f3640f, ehe.f3641g, ehe.f3642h);
                    egg.f3614a.mo3432a(egg.f3617d, egg.f3618e, egg.f3619f, egg.f3620g);
                    gzt gzt = efc.f3576d;
                    gzt.f5869a.mo3453a(gzt.f5870b);
                    efc.f3577e.m1749a();
                    efc.f3573a.mo3560a(efc.f3578f, efc.f3579g, efc.f3580h, efc.f3581i, efc.f3582j, efc.f3583k, efc.f3584l, efc.f3585m, efc.f3586n, efc.f3587o);
                    eer.f3553c.m9869b();
                    egb egb = eer.f3554d;
                    egb.f3610a.mo3431a(egb.f3611b, egb.f3612c, egb.f3613d);
                    efh efh = eer.f3555e;
                    efh.f3588a.mo3428a(efh.f3589b, efh.f3590c, efh.f3591d, efh.f3592e);
                    eer.f3551a.mo3426a(eer.f3556f, eer.f3557g, eer.f3558h, eer.f3559i, eer.f3560j, eer.f3561k, eer.f3562l, eer.f3563m);
                    eek.f3542a.mo3421a(eek.f3544c, eek.f3545d, eek.f3546e, eek.f3547f, eek.f3548g, eek.f3549h, eek.f3550i);
                    edw.f3536b.m1748a();
                    edw.f3537c.m1750a();
                    ((gqj) gwo.f5725d.mo345a()).mo1562a();
                    break;
            }
            this.f20289o.mo1905b("CameraController#init");
            cgu cgu = this.al;
            if (cgu.f11919f == null) {
                z = true;
            } else {
                z = false;
            }
            jri.m13153b(z);
            cgu.f11919f = this;
            this.al.mo675a(this.bt);
            this.f20289o.mo1905b("FilmstripData#init");
            this.f20256G = (hfz) this.aJ.mo345a();
            this.f20256G.mo1003a(this.bI);
            this.f20256G.mo1006a(this.bG);
            this.f20262M = (FilmstripFragmentImpl) jri.m13152b(this.aT.findFragmentById(R.id.filmstrip_fragment));
            cpx cpx = new cpx(this);
            this.f20262M.mo764h();
            this.f20300z = this.f20262M.mo754a();
            this.f20263N = this.f20262M.mo758b();
            this.f20250A = this.f20262M.mo760d();
            this.f20289o.mo1905b("FilmstripUi#init");
            this.f20262M.mo756a(this, cpx, this.f20256G, this.f20251B.f6127g);
            this.f20253D = this.f20262M.mo761e();
            this.f20254E = hes.f6113c;
            this.f20289o.mo1905b("Filmstrip#observers");
            this.aR = new cpl();
            this.aS = new cpl();
            this.ap.registerContentObserver(Media.EXTERNAL_CONTENT_URI, true, this.aR);
            this.ap.registerContentObserver(Video.Media.EXTERNAL_CONTENT_URI, true, this.aS);
            this.f20289o.mo1905b("CameraAppUI#init");
            this.f20299y = (gvt) this.aK.mo345a();
            this.aO = (hdm) this.aM.mo345a();
            this.f20300z.f2614c = this.bF;
            this.az.f6092b = new hen(this);
            this.f20252C = new ebd(this, this.f20251B.f6123c, hes, this.am, this.az, this.aH, this.f20293s, (DisplayManager) cbu.m1099a(this.ah.f1837a, "display"), this.aE, awl.m714b(this.ar), this.f20299y, this.aO, this.ba, this.bb, this.aL, this.f20262M, this.aj, (hcd) this.ak.mo345a(), this.bg, this.ab, this.bh, this.f20266Q, this.bu, this.bv, this.bw, this.bi, this.bB, this.bz, this.bA, this.bD);
            ebd ebd = this.f20252C;
            obj = this.f20251B;
            jri.m13152b(obj);
            jri.m13152b(ebd.f14911d);
            ebd.f14918k = (ShutterButton) obj.f6128h.m3223a((int) R.id.shutter_button);
            hkg a = hkg.m3221a(ebd.f14911d);
            hkg a2 = hkg.m3221a(ebd.f14912e);
            ebd.f14917j = (FrameLayout) a.m3223a((int) R.id.module_layout);
            ebd.f14924q = (PreviewOverlay) a.m3223a((int) R.id.preview_overlay);
            ebd.f14921n = (TutorialOverlayWrapper) a2.m3223a((int) R.id.tutorials_placeholder_wrapper);
            ebd.f14925r = (CaptureAnimationOverlay) a.m3223a((int) R.id.capture_animation_overlay);
            ebd.f14920m = new brp((FaceView) a.m3223a((int) R.id.face_view));
            ebd.f14890G = ebu.m9641a(ebd.f14915h, ebd, ebd.f14896M, ebd.f14933z, ebd.f14884A);
            ebd.f14887D = ebd.f14890G;
            ebd.f14888E = new hao("Viewfinder", new hap(ebd.f14891H));
            ebd.f14889F = ebd.f14888E;
            if (((Boolean) this.by.mo2860b()).booleanValue()) {
                this.bx.ae();
            }
            this.bC.m2639a(this.ae);
            this.f20289o.mo1905b("PanoramaViewHelper#init");
            this.f20258I = new eja(this, (Activity) this.f20292r.get(), this.f20266Q);
            eja eja = this.f20258I;
            eja.f15198b = new hji(new hur(eja.f15201e.mo2756k(), eja, eja).m3486a(ifq.f6987b).m3485a());
            hfz hfz = this.f20256G;
            this.f20261L = new hfy(hfz, hfz);
            this.f20252C.f14931x.mo771a(this.bH);
            this.f20289o.mo1905b("Settings#config");
            this.bl = true;
            m14937W();
            m14938X();
            m14955e(m14932R());
            this.aj.resetCameraSwitch(this.f20287m.mo1541c(mo2768w(), "pref_camera_id_key"));
            this.aj.addListener(new cfx(this));
            this.f20289o.mo1905b("CameraUi#prepareModuleUi");
            ebd ebd2 = this.f20252C;
            obj = this.f20251B;
            jri.m13152b(obj);
            jri.m13152b(ebd2.f14911d);
            hkg hkg = obj.f6128h;
            ViewStub viewStub = (ViewStub) hkg.m3223a((int) R.id.burst_chip_viewstub);
            RoundedThumbnailView roundedThumbnailView = (RoundedThumbnailView) hkg.m3223a(C0042R.id.thumbnail_button);
            ebd2.f14887D.mo1212a(ebd2.f14932y);
            cjq cjq = ebd2.f14910c;
            cjq.f12095b = viewStub;
            cjq.f12097d = roundedThumbnailView;
            ebd2.f14886C = new eiu(ebd2.f14885B, ebd2.f14897N);
            if (ebd2.f14909b.mo2763r() == hhx.PHOTO) {
                ebd2.m9608b(true);
                ebd2.m9613d(true);
            } else if (ebd2.f14909b.mo2763r() == hhx.VIDEO) {
                ebd2.m9608b(true);
                ebd2.m9613d(false);
            } else {
                ebd2.m9608b(false);
            }
            if (!(ebd2.f14909b.mo2763r() == hhx.PHOTO || ebd2.f14909b.mo2763r() == hhx.VIDEO)) {
                ebd2.m9607b(ebd2.f14909b.mo2763r());
            }
            if (!(this.f20298x || awl.m714b(this.ar) || this.f20293s.mo377e())) {
                this.f20256G.mo1007a(new cfy(this));
            }
            this.f20289o.mo1905b("MemoryQuery#runMemoryReport");
            this.f20265P.execute(new cfz(this));
            if (!awl.m714b(this.ar)) {
                if (!this.f20298x) {
                    Executor a3;
                    this.f20289o.mo1905b("CaptureIndicator#load");
                    kpk a4 = this.f20294t.m2800a();
                    if (a4.isDone()) {
                        a3 = khx.m4940a();
                    } else {
                        a3 = this.f20281g;
                    }
                    kow.m13622a(a4, new cga(this), a3);
                }
                epf a5 = epf.m1944a();
                if (a5.f4003c == 0) {
                    a5.f4003c = SystemClock.elapsedRealtimeNanos();
                }
            }
            this.f20289o.mo1905b("ActivityUi#initCallbacks");
            ((ShutterButton) this.f20251B.f6128h.m3223a((int) R.id.shutter_button)).setOnDrawListener(new hbe(this));
            this.f20289o.mo1905b("ActivityLifecycle#observe");
            this.aF.m1906a((eol) this);
            this.f20289o.mo1904b();
            this.f20289o.mo1904b();
            bli.m869c(f20249a, "CameraActivityController initialization completed");
            CameraActivitySession cameraActivitySession = this.f20284j;
            if (cameraActivitySession.f12311h == 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13154b(z, (Object) "Accidental session reuse.");
            iya iya = cameraActivitySession.m;
            cameraActivitySession.f12311h = SystemClock.elapsedRealtimeNanos();
            cameraActivitySession.m1326a("CameraActivity Initialized", cameraActivitySession.f12311h);
        }
        return this.bo;
    }

    /* renamed from: V */
    private final boolean m14936V() {
        if (this.aN.m884b()) {
            return this.ab.f14942c;
        }
        return this.f20273X;
    }

    /* renamed from: E */
    public final boolean mo2730E() {
        return this.f20274Y;
    }

    /* renamed from: b */
    public final void mo2749b(Intent intent) {
        this.bn = false;
        intent.addFlags(ByteStreams.ZERO_COPY_CHUNK_SIZE);
        this.aI.mo372b(intent);
    }

    /* renamed from: d */
    private final boolean m14954d(hhx hhx) {
        Object a = this.av.mo1102a(hhx);
        jri.m13152b(a);
        return a.mo1106b().f2814c;
    }

    /* renamed from: J */
    public final boolean mo1208J() {
        boolean z = true;
        ebd ebd = this.f20252C;
        if (ebd.f14916i.mo767k()) {
            z = ebd.f14931x.mo773b();
        } else if (ebd.f14926s.f17673a.m5503c() || ebd.f14928u.f4984b.f20400e != null) {
            ebd.f14926s.m11769a();
            ebd.f14928u.f4984b.m15076a();
        } else if (!ebd.f14909b.mo2764s().mo2839f()) {
            if (ebd.f14929v.getVisibility() == 0) {
                ebd.m9606b();
            } else {
                z = false;
            }
        }
        if (z) {
            return z;
        }
        return this.f20257H.mo2839f();
    }

    /* renamed from: a */
    public final void mo672a(int i) {
        String str = f20249a;
        StringBuilder stringBuilder = new StringBuilder(28);
        stringBuilder.append("Camera disabled: ");
        stringBuilder.append(i);
        bli.m873e(str, stringBuilder.toString());
        this.aq.mo2692a();
    }

    /* renamed from: a */
    public final void mo674a(aah aah) {
        bli.m871d(f20249a, "onCameraOpened");
        if (this.f20274Y) {
            bli.m871d(f20249a, "received onCameraOpened but activity is stopped, closing Camera");
            this.al.m8173a(false);
        } else if (this.av.mo1102a(this.f20267R).mo1106b().f2814c) {
            if (this.f20257H == null) {
                bli.m871d(f20249a, "mCurrentModule null, not invoking onCameraAvailable");
            } else {
                abo i = aah.mo2571i();
                i.f149o = 0;
                aah.mo2562a(i);
                try {
                    this.f20257H.mo2842a(aah);
                } catch (Throwable e) {
                    bli.m867b(f20249a, "Error connecting to camera", e);
                    this.aq.mo2693a(e);
                }
            }
            bli.m871d(f20249a, "invoking onChangeCamera");
            this.f20252C.m9617g();
        } else {
            this.al.m8173a(false);
            throw new IllegalStateException("Camera opened but the module shouldn't be requesting");
        }
    }

    /* renamed from: a */
    public final void mo1144a(Configuration configuration) {
        int e = this.ay.mo1447e();
        if (this.aW != e) {
            cvx cvx = this.f20257H;
            if (cvx != null) {
                this.aW = e;
                cvx.mo2847b(gcb.m2471a(this.aW));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo2747a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.tiny_planet_editor) {
            crx crx = this.bF;
            cre a = crx.m1450a();
            if (a != cre.f2587c) {
                err e = a.mo1066e();
                Object obj = crx.f2631a;
                eaq eaq = new eaq(obj, obj.f20278d, obj.an);
                Bundle bundle = new Bundle();
                bundle.putString("uri", e.mo1033g().f4155h.toString());
                bundle.putString(NotificationCompatJellybean.KEY_TITLE, e.mo1033g().f4150c);
                eaq.setArguments(bundle);
                eaq.show(((Activity) obj.f20292r.get()).getFragmentManager(), "tiny_planet");
            } else {
                bli.m873e(f20249a, "Cannot edit tiny planet on INVALID node.");
            }
            return true;
        } else if (itemId != R.id.photo_editor) {
            return false;
        } else {
            this.bF.m1451b();
            return true;
        }
    }

    /* renamed from: K */
    public final void mo1490K() {
        this.aB.mo1701c();
    }

    /* renamed from: a */
    public final void mo2740a(ContextMenu contextMenu) {
        ((Activity) this.f20292r.get()).getMenuInflater().inflate(R.menu.filmstrip_context_menu, contextMenu);
    }

    /* renamed from: a */
    public final boolean mo2746a(Menu menu) {
        ((Activity) this.f20292r.get()).getMenuInflater().inflate(R.menu.filmstrip_menu, menu);
        this.aV = menu;
        if (!this.f20298x) {
            axh.m731a(this.f20280f, menu, m14933S());
        }
        return true;
    }

    /* renamed from: f */
    public final void mo378f() {
        cgu cgu = this.al;
        cgu.f11919f = null;
        cgu.mo679b(this.bt);
        this.ap.unregisterContentObserver(this.aR);
        this.ap.unregisterContentObserver(this.aS);
        this.bC.m2641b(this.ae);
        ebd ebd = this.f20252C;
        ebd.f14895L.unregisterDisplayListener(ebd.f14922o);
        aay.m29a(go.f5567e);
        aay.m29a(go.f5566d);
    }

    /* renamed from: a */
    public final void mo673a(int i, String str) {
        String str2 = f20249a;
        String valueOf = String.valueOf(str);
        String str3 = "Camera open failure: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str3);
        } else {
            valueOf = str3.concat(valueOf);
        }
        bli.m873e(str2, valueOf);
        this.aq.mo2693a(null);
    }

    /* renamed from: b */
    public final void mo678b(int i, String str) {
        String str2 = f20249a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 33);
        stringBuilder.append("Camera open already: ");
        stringBuilder.append(i);
        stringBuilder.append(",");
        stringBuilder.append(str);
        bli.m873e(str2, stringBuilder.toString());
        this.aq.mo2695c();
    }

    /* renamed from: a */
    public final boolean mo1748a(int i, KeyEvent keyEvent) {
        if (!this.f20273X) {
            if (this.f20257H.mo2845a(i, keyEvent)) {
                return true;
            }
            if ((i == 84 || i == 82) && keyEvent.isLongPress()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo1749b(int i, KeyEvent keyEvent) {
        if (this.f20273X) {
            if (i == 22) {
                this.f20253D.mo1078d();
                return true;
            } else if (i == 21) {
                if (this.f20253D.mo1079e()) {
                    return true;
                }
                this.f20262M.mo763g();
                return true;
            }
        } else if (this.f20257H.mo2848b(i, keyEvent) || i == 82 || i == 21) {
            return true;
        } else {
            if (i == 22) {
                this.f20262M.mo768l();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo2744a(hhx hhx) {
        if (!this.bm) {
            gqj gqj;
            switch (hhx.ordinal()) {
                case 1:
                    gqj = this.bc;
                    if (gqj.f21302k) {
                        gqj.mo3016K();
                        break;
                    }
                    return;
                case 2:
                    gqj = this.bc;
                    if (gqj.f21302k) {
                        gqj.mo3015L();
                        break;
                    }
                    return;
                case 3:
                    if (!this.bE) {
                        this.ba.mo2999a(true);
                        break;
                    } else {
                        this.ba.mo3000q();
                        break;
                    }
                case 5:
                    this.ba.mo2999a(false);
                    break;
                case 6:
                    this.ba.mo3001r();
                    break;
                case 7:
                    this.bb.o_();
                    break;
                case 8:
                    this.bb.p_();
                    break;
                default:
                    return;
            }
            int c = this.f20287m.mo1541c(mo2768w(), "pref_camera_id_key");
            this.f20289o.mo1903a("doSelectMode");
            m14942a(hhx, c);
            this.f20289o.mo1904b();
            this.bj = hhx.UNINITIALIZED;
        }
    }

    /* renamed from: c */
    public final void mo2753c(Intent intent) {
        int c;
        this.ar.m719a(intent);
        String action = intent.getAction();
        bli.m869c(f20249a, "Resetting to default settings");
        this.bl = true;
        this.bn = true;
        TrampolineActivity.m1237a();
        this.aZ.mo1563b();
        gqh.m2725a(this.aZ);
        this.aZ.mo1562a();
        if (this.f20287m.mo1541c(mo2768w(), "pref_camera_id_key") == 1 || awl.m715c(intent)) {
            this.bk = true;
        }
        hhx R = m14932R();
        if (R == hhx.PHOTO || R == hhx.VIDEO) {
            this.f20252C.m9608b(true);
        }
        if (R == hhx.VIDEO) {
            this.f20252C.m9615e(false);
            this.bk = true;
        }
        m14937W();
        Object a = this.av.mo1102a(R);
        jri.m13152b(a);
        iur b = m14946b(gos.m2671b(a.mo1106b().f2813b));
        if (b == null) {
            c = this.f20287m.mo1541c(mo2768w(), "pref_camera_id_key");
        } else {
            c = b.m4255a();
        }
        m14942a(R, c);
        this.f20252C.m9613d(true);
        if (!this.f20274Y && this.bn) {
            this.f20252C.m9620k();
            this.bn = false;
        }
        ShortcutManager shortcutManager = (ShortcutManager) this.f20279e.getSystemService(ShortcutManager.class);
        if (awl.m716d(this.ar.f989a.getIntent())) {
            shortcutManager.reportShortcutUsed("selfie");
        }
        if (action != null && action.equals("android.media.action.VIDEO_CAMERA")) {
            shortcutManager.reportShortcutUsed("video");
        }
    }

    /* renamed from: b */
    public final boolean mo2751b(MenuItem menuItem) {
        if (menuItem.getItemId() != ActionBarDrawerToggle.ID_HOME) {
            return false;
        }
        mo1208J();
        return true;
    }

    /* renamed from: g */
    public final void mo379g() {
        this.f20289o.mo1903a("CameraActivityController.onPause");
        this.bm = true;
        if (!(m14936V() || this.am.f17564a.isInMultiWindowMode() || this.f20298x || this.f20257H.mo2838e())) {
            bli.m871d(f20249a, "Covering preview on SurfaceView preview transitions.");
            ebd ebd = this.f20252C;
            ebd.f14914g.f12341b.setVisibility(8);
            ebd.f14914g.m8431a();
            this.br = true;
            this.f20289o.mo1902a();
        }
        TutorialOverlayWrapper tutorialOverlayWrapper = this.f20252C.f14921n;
        tutorialOverlayWrapper.f2427a = tutorialOverlayWrapper.getVisibility();
        tutorialOverlayWrapper.setVisibility(8);
        cpl cpl = this.aR;
        cpl.f2541a = null;
        cpl.m1391a(true);
        this.aS.m1391a(true);
        this.f20257H.m_();
        this.f20289o.mo1904b();
    }

    /* renamed from: L */
    public final boolean mo2732L() {
        return true;
    }

    /* renamed from: a */
    public final void mo676a(zs zsVar, String str) {
        String str2 = f20249a;
        String valueOf = String.valueOf(str);
        String str3 = "Camera reconnection failure:";
        if (valueOf.length() == 0) {
            valueOf = new String(str3);
        } else {
            valueOf = str3.concat(valueOf);
        }
        bli.m873e(str2, valueOf);
        this.aq.mo2694b();
    }

    /* renamed from: h */
    public final void mo380h() {
        this.f20289o.mo1903a("CameraActivityController.onResume");
        this.bm = false;
        TutorialOverlayWrapper tutorialOverlayWrapper = this.f20252C.f14921n;
        tutorialOverlayWrapper.setVisibility(tutorialOverlayWrapper.f2427a);
        ebq ebq = this.ab;
        String str = ebq.f14940a;
        boolean z = ebq.f14942c;
        StringBuilder stringBuilder = new StringBuilder(48);
        stringBuilder.append("onResumeReceived called, gallery visible = ");
        stringBuilder.append(z);
        bli.m863a(str, stringBuilder.toString());
        if (ebq.f14942c) {
            ((csp) ((FragmentManager) jri.m13152b(ebq.f14943d.getFragmentManager())).findFragmentById(R.id.filmstrip_fragment)).mo763g();
            ebq.f14942c = false;
        }
        this.aZ.mo3424x();
        if (!(m14936V() || this.f20272W)) {
            if (this.aa) {
                this.f20257H.mo2852k();
            }
            this.f20257H.mo2851j();
        }
        this.aa = false;
        if (this.br) {
            bli.m863a(f20249a, "Explicitly hiding mode cover in onResume()");
            this.f20252C.m9618h();
            this.br = false;
        }
        this.f20300z.m1448e(true);
        if (!this.bn) {
            cre a = this.f20253D.mo1070a();
            if (a != cre.f2587c) {
                this.f20256G.mo1021d(a.mo1066e().mo1033g().f4155h);
            }
        }
        this.bn = false;
        if (!((!this.aS.f2542b && !this.aR.f2542b) || this.f20293s.mo377e() || this.f20298x)) {
            this.f20256G.mo1022e();
        }
        this.aR.m1391a(false);
        this.aS.m1391a(false);
        if (this.bs) {
            ((Activity) this.f20279e).overridePendingTransition(0, 0);
        }
        this.f20289o.mo1904b();
    }

    /* renamed from: M */
    public final void mo2733M() {
        String str = f20249a;
        String valueOf = String.valueOf(this.bj);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
        stringBuilder.append("Select mode : ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" canceled");
        bli.m863a(str, stringBuilder.toString());
        if (this.bj != hhx.UNINITIALIZED) {
            cvx c = m14950c(this.bj);
            if (c != null) {
                c.mo2841h();
                this.bj = hhx.UNINITIALIZED;
            }
        }
    }

    /* renamed from: F */
    public final void mo2731F() {
        this.f20266Q.mo1567a(5);
        this.aI.mo372b(new Intent(this.f20280f, CameraSettingsActivity.class));
    }

    /* renamed from: i */
    public final void mo381i() {
        this.f20289o.mo1903a("CameraActivityController.onStart");
        this.f20274Y = false;
        if (mo2729D()) {
            if (this.bn || !m14936V()) {
                if (this.f20272W) {
                    m14937W();
                    m14938X();
                    m14955e(m14932R());
                    m14970O();
                }
                this.f20252C.m9620k();
            }
            this.aB.mo1701c();
            this.f20289o.mo1903a("CameraActivityController.start");
            String str = f20249a;
            String valueOf = String.valueOf(Build.DISPLAY);
            String str2 = "Build info: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m871d(str, valueOf);
            this.aW = this.ay.mo1447e();
            m14933S();
            this.aP.setDisplayShowHomeEnabled(false);
            this.f20289o.mo1902a();
            this.f20257H.mo2844a(this.f20287m);
            if (!(this.f20273X || this.f20272W)) {
                this.aZ.mo3424x();
                this.f20257H.mo2852k();
            }
            this.f20266Q.mo1568a(m14963H(), 1);
            this.f20289o.mo1902a();
            if (!this.f20298x) {
                this.aR.f2541a = new cpm();
            }
            Activity activity = (Activity) this.f20292r.get();
            if (this.aV == null && activity != null) {
                activity.invalidateOptionsMenu();
            }
            eja eja = this.f20258I;
            eja.f15200d = hud.m11988b(eja.f15201e.mo2756k());
            hji hji = eja.f15198b;
            if (hji != null && eja.f15199c == null) {
                eja.f15199c = hji.m11858a();
            }
            this.f20289o.mo1902a();
            if (this.bf.mo2084b() && !this.f20266Q.mo1599b()) {
                bof bof = (bof) this.bf.mo2081a();
                this.aC.m2668b("pref_release_dialog_last_shown_version", "");
                bof.m928a();
            }
            m14952c(m14934T());
            this.aY = this.f20276b.mo693b().mo2859a(this.ad, this.f20281g);
            this.f20289o.mo1904b();
            this.f20289o.mo1904b();
        }
    }

    /* renamed from: j */
    public final void mo382j() {
        this.f20289o.mo1903a("CameraActivityController.onStop");
        this.br = false;
        this.f20274Y = true;
        this.f20289o.mo1902a();
        this.f20257H.mo2853l();
        this.aa = false;
        this.f20289o.mo1902a();
        this.f20252C.m9619j();
        this.f20261L.m3111a();
        iqo iqo = this.aY;
        if (iqo != null) {
            iqo.close();
        }
        if (this.f20268S) {
            mo2745a("CameraActivityController: Fatal error during onPause!");
        } else {
            bli.m871d(f20249a, "onPause closing camera");
            this.al.m8173a(true);
            this.f20289o.mo1902a();
            if (this.f20270U) {
                this.f20272W = true;
                m14962G();
            }
            epf.m1944a().f4007g.m1945a(eph.f4014h);
        }
        this.bl = false;
        this.f20289o.mo1902a();
        eja eja = this.f20258I;
        kpk kpk = eja.f15199c;
        if (kpk != null) {
            kow.m13622a(kpk, new ejb(eja), kpq.f8410a);
        }
        this.f20289o.mo1904b();
    }

    /* renamed from: a */
    public final void mo1652a(boolean z) {
        cvx cvx = this.f20257H;
        if (cvx != null) {
            cvx.a_(z);
        }
    }

    /* renamed from: b */
    private final void m14948b(cvx cvx) {
        cvx.mo2844a(this.f20287m);
        eiu eiu = this.f20252C.f14886C;
        ikd.m12259a();
        eiu.f3644a.setVisibility(8);
        if (!this.f20274Y) {
            cvx.mo2852k();
            cvx.mo2851j();
            iqo iqo = this.bq;
            if (iqo != null) {
                iqo.close();
                this.bq = null;
            }
            int H = m14963H();
            if (H == 1 || H == 8) {
                AtomicReference atomicReference = new AtomicReference();
                atomicReference.set(ilq.m3823a(this.f20252C.f14918k.getClickEnabledObservable(), new cfw(this, H, atomicReference)));
                this.bq = (iqo) atomicReference.get();
                this.f20293s.mo374b().mo1879a(this.bq);
            } else {
                this.f20266Q.mo1568a(m14963H(), 1);
            }
            m14972Q();
        }
    }

    /* renamed from: a */
    public final void mo2738a(Uri uri) {
        this.f20258I.m9711a((Activity) this.f20279e, uri);
    }

    /* renamed from: a */
    public final void mo2739a(Uri uri, String str) {
        try {
            if (this.f20298x) {
                this.f20279e.startActivity(new Intent(this.f20279e, VideoPlayerActivity.class).setDataAndType(uri, "video/*"));
                ((Activity) this.f20279e).overridePendingTransition(0, 0);
                this.bs = true;
                return;
            }
            Intent putExtra = awl.m709a(uri).putExtra("android.intent.extra.TITLE", str).putExtra("treat-up-as-back", true);
            this.bn = false;
            this.aI.mo372b(putExtra);
            ((Activity) this.f20279e).overridePendingTransition(0, 0);
            this.bs = true;
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this.f20279e, this.aA.getString(R.string.video_err), 0).show();
        }
    }

    /* renamed from: N */
    public final void mo2734N() {
        this.f20294t.m2802b();
    }

    /* renamed from: W */
    private final void m14937W() {
        for (cvz b : this.av.mo1103a()) {
            this.f20287m.mo1546g(gos.m2671b(b.mo1106b().f2813b), "pref_camera_id_key");
        }
        this.f20287m.mo1546g("default_scope", "pref_camera_countdown_duration_key");
    }

    /* renamed from: O */
    public final void m14970O() {
        ikd.m12259a();
        this.f20270U = false;
        if (this.f20272W) {
            bli.m871d(f20249a, "restartPreviewWhenLeavingFilmstrip");
            this.f20283i.modeSwitch().create();
            this.f20272W = false;
            m14955e(this.f20267R);
            m14948b(this.f20257H);
        }
    }

    /* renamed from: e */
    private final void m14955e(hhx hhx) {
        Throwable e;
        ikd.m12259a();
        int c = this.f20287m.mo1541c(mo2768w(), "pref_camera_id_key");
        if (mo2729D()) {
            cvz a = this.av.mo1102a(hhx);
            if (a != null) {
                String str;
                String valueOf;
                if (!m14954d(hhx)) {
                    str = f20249a;
                    valueOf = String.valueOf(hhx);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                    stringBuilder.append("Closing v1 Camera before using mode ");
                    stringBuilder.append(valueOf);
                    bli.m863a(str, stringBuilder.toString());
                    this.al.m8173a(true);
                }
                hhx hhx2 = this.f20267R;
                valueOf = f20249a;
                str = String.valueOf(hhx2);
                String valueOf2 = String.valueOf(hhx);
                StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 53) + String.valueOf(valueOf2).length());
                stringBuilder2.append("Change Capture Mode from:");
                stringBuilder2.append(str);
                stringBuilder2.append(" to:");
                stringBuilder2.append(valueOf2);
                stringBuilder2.append(" with camera ");
                stringBuilder2.append(c);
                bli.m869c(valueOf, stringBuilder2.toString());
                this.f20267R = hhx;
                try {
                    this.f20257H = (cvx) a.mo1105a().get();
                    this.f20293s.mo373a().mo1879a(this.f20257H);
                    this.f20257H.mo2843a((cfh) this, new ezy(this));
                    if (this.f20267R == hhx.VIDEO) {
                        this.bc.mo3015L();
                    }
                } catch (InterruptedException e2) {
                    e = e2;
                    throw new IllegalStateException(e);
                } catch (ExecutionException e3) {
                    e = e3;
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2743a(haq haq, boolean z) {
        if (z && haq.n_()) {
            this.f20252C.m9601a(ebk.SURFACE_VIEW, haq);
        } else {
            this.f20252C.m9601a(ebk.TEXTURE_VIEW_LEGACY, haq);
        }
    }

    /* renamed from: X */
    private final iur m14938X() {
        return m14946b(mo2768w());
    }

    /* renamed from: b */
    private final iur m14946b(String str) {
        iur iur = null;
        if (awl.m715c(this.ar.f989a.getIntent())) {
            if (awl.m716d(this.ar.f989a.getIntent())) {
                iur = this.ax.mo1346b(iut.FRONT);
                this.f20264O.mo2996n();
            }
            if (iur == null) {
                iur = this.ax.mo1346b(iut.BACK);
            }
            jri.m13152b(r0);
            this.f20287m.mo1532a(str, "pref_camera_id_key", r0.f7482b);
        }
        return iur;
    }

    /* renamed from: a */
    public final void mo2741a(cre cre) {
        csh csh = this.f20250A;
        cop ckx = new ckx(csh.f2645g, csh.f2646h, new File(cre.mo1066e().mo1033g().f4154g), csh.f2642d, csh.f2644f, csh.f2648j, csh.f2649k);
        if (csh.f2647i.findFragmentByTag("burst_editor_fragment") == null) {
            ckx.mo709b();
            cls cls = (cls) csh.f2640b.mo345a();
            ikd.m12259a();
            if (cre.mo1066e() instanceof cou) {
                cls.f12174r = cre;
                cls.f12162f = ckx;
                cls.f12160d = new gqy(cls.m8339c().f12515e.f4154g, cls.f12173q);
                cls.f12167k = new cmp(cls.f12165i);
                cls.f12164h = cls.m8339c().m15142b();
                cls.f12167k.f2170k = cls.f12170n;
                try {
                    ((cls) csh.f2640b.mo345a()).show(csh.f2647i, "burst_editor_fragment");
                    return;
                } catch (IllegalStateException e) {
                    String str = csh.f2639a;
                    String valueOf = String.valueOf(e.getMessage());
                    String str2 = "showBurstEditor ";
                    if (valueOf.length() == 0) {
                        valueOf = new String(str2);
                    } else {
                        valueOf = str2.concat(valueOf);
                    }
                    bli.m873e(str, valueOf);
                    return;
                }
            }
            throw new RuntimeException("Burst editor opened for non-burst");
        }
    }

    /* renamed from: a */
    public final void m14985a(err err) {
        int i;
        cum cum;
        this.f20300z.m1446c(err.mo1032f().f4133a.contains(ert.CAN_EDIT));
        this.f20300z.m1447d(err.mo1032f().m2073b());
        this.f20300z.m1443a(err.mo1032f().m2072a());
        if (err.mo1032f().m2076e()) {
            this.f20300z.m1445b(false);
        } else {
            this.f20300z.m1445b(err.mo1036j().mo2084b());
        }
        Uri uri = err.mo1033g().f4155h;
        gln gln = this.f20277c.f1041a;
        this.f20300z.m1444b();
        gkr b = gln.mo1506b(uri);
        if (b != null) {
            i = b.mo2881i();
            if (i < 0) {
                m14964I();
            } else {
                this.f20263N.m1440a(b.mo2882j().mo1726a(this.f20280f.getResources()));
                this.f20300z.m1444b();
                crt crt = this.f20263N;
                crt.f2603b = true;
                crt.m1438a();
                m14996b(i);
            }
        } else {
            m14964I();
        }
        if (err.mo1037k().f4114b.f4122h) {
            cum = cum.PHOTO_SPHERE;
        } else if (err.mo1037k().f4114b.f4123i) {
            cum = cum.REFOCUS;
        } else {
            cum = cum.INVISIBLE;
        }
        this.f20300z.f2620i = err.mo1037k().f4114b.f4121g;
        crw crw = this.f20300z;
        ExternalViewerButton externalViewerButton = crw.f2616e;
        externalViewerButton.f2334b = cum;
        if (cum != cum.INVISIBLE) {
            externalViewerButton.setImageResource(ExternalViewerButton.m1250a(cum));
            i = 0;
        } else {
            i = 8;
        }
        if (i != externalViewerButton.getVisibility()) {
            externalViewerButton.setVisibility(i);
        } else if (i == 0) {
            externalViewerButton.m1251a();
        }
        if (cum == cum.INVISIBLE) {
            crw.f2617f.setVisibility(8);
        } else {
            crw.f2617f.setVisibility(0);
        }
    }

    /* renamed from: P */
    public final void m14971P() {
        ikd.m12259a();
        if (this.f20256G.mo1019d() == 0) {
            this.f20300z.m1442a();
        } else {
            this.f20300z.f2615d.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo2736a(float f) {
        this.f20252C.f14887D.mo1210a(f);
    }

    /* renamed from: c */
    private final void m14952c(int i) {
        if (i == 2) {
            this.f20252C.f14911d.setVisibility(4);
        } else {
            this.f20252C.f14911d.setVisibility(0);
        }
    }

    /* renamed from: Q */
    public final void m14972Q() {
        if (this.f20257H != null) {
            int T = m14934T();
            m14952c(T);
            this.f20257H.mo2836a(T);
        }
    }

    /* renamed from: b */
    final void m14996b(int i) {
        boolean z;
        crt crt = this.f20263N;
        if (i < 0) {
            z = false;
        } else if (i <= 100) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (i > 0) {
            crt.f2602a.setIndeterminate(false);
            crt.f2602a.setProgress(i);
            return;
        }
        crt.f2602a.setIndeterminate(true);
    }

    /* renamed from: b */
    public final void mo2750b(hhx hhx) {
        cvx c = m14950c(hhx);
        if (c == null) {
            String str = f20249a;
            String valueOf = String.valueOf(hhx);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
            stringBuilder.append("Fail to obtain module for mode ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
            return;
        }
        if ((this.f20267R == hhx.PHOTO || this.f20267R == hhx.VIDEO || this.f20267R == hhx.PORTRAIT) && (hhx == hhx.PHOTO || hhx == hhx.VIDEO || hhx == hhx.PORTRAIT)) {
            this.f20287m.mo1531a("default_scope", "pref_mode_switch_camera_id_key", this.f20287m.mo1541c(mo2768w(), "pref_camera_id_key"));
        }
        this.f20289o.mo1903a(String.valueOf(f20249a).concat("#prewarm"));
        c.mo2840g();
        this.bj = hhx;
        this.f20289o.mo1904b();
    }
}
