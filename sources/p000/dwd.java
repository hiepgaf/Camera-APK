package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextWatcher;
import android.view.GestureDetector.OnGestureListener;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.refocus.RefocusProgressView;
import com.google.android.apps.refocus.capture.TrackerStats;
import com.google.android.apps.refocus.image.ColorImage;
import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.android.apps.refocus.processing.ProcessingNative;
import com.google.android.apps.refocus.processing.SelectedFrame;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: dwd */
public final class dwd extends cvs implements cvx, dxm, gek, gww, haq {
    /* renamed from: d */
    public static final String f23020d = bli.m862a("RefocusModule");
    /* renamed from: A */
    public boolean f23021A = false;
    /* renamed from: B */
    public ExecutorService f23022B;
    /* renamed from: C */
    public final AtomicInteger f23023C = new AtomicInteger(0);
    /* renamed from: D */
    public final ilb f23024D = new ilb(Integer.valueOf(0));
    /* renamed from: E */
    public final Runnable f23025E = new dwe(this);
    /* renamed from: F */
    public final Runnable f23026F = new dwr(this);
    /* renamed from: G */
    public final how f23027G;
    /* renamed from: H */
    private final bkw f23028H;
    /* renamed from: I */
    private final hjf f23029I;
    /* renamed from: J */
    private final gtf f23030J;
    /* renamed from: K */
    private final cbu f23031K;
    /* renamed from: L */
    private final Context f23032L;
    /* renamed from: M */
    private final gtl f23033M;
    /* renamed from: N */
    private final BottomBarController f23034N;
    /* renamed from: O */
    private final hcd f23035O;
    /* renamed from: P */
    private final BottomBarListener f23036P;
    /* renamed from: Q */
    private final ecd f23037Q;
    /* renamed from: R */
    private cbr f23038R;
    /* renamed from: S */
    private ezy f23039S;
    /* renamed from: T */
    private ViewGroup f23040T;
    /* renamed from: U */
    private hrm f23041U;
    /* renamed from: V */
    private float f23042V = 0.0f;
    /* renamed from: W */
    private cwd f23043W;
    /* renamed from: X */
    private final dwz f23044X = new dwz(this);
    /* renamed from: Y */
    private final dxa f23045Y = new dxa(this);
    /* renamed from: Z */
    private hjw f23046Z;
    private Location aa = null;
    private aaz ab;
    private abi ac;
    private ikb ad;
    private final int ae;
    private final gho af;
    private final irs ag;
    private final aat ah = new dws(this);
    private final TextWatcher ai = new dwt(this);
    private final eak aj = new dwv("refocus_upgrade_version");
    private final OnClickListener ak = new dww(this);
    private final hny al;
    private final hnz am = new dwx(this);
    private final atb an;
    private final gnu ao;
    private final gnf ap;
    private final OnGestureListener aq = new dwj(this);
    /* renamed from: c */
    public final gey f23047c;
    /* renamed from: e */
    public final gpn f23048e;
    /* renamed from: f */
    public final gev f23049f;
    /* renamed from: g */
    public final ehm f23050g;
    /* renamed from: h */
    public final hch f23051h;
    /* renamed from: i */
    public final dzh f23052i;
    /* renamed from: j */
    public cfh f23053j;
    /* renamed from: k */
    public cfh f23054k;
    /* renamed from: l */
    public Handler f23055l;
    /* renamed from: m */
    public dxj f23056m = null;
    /* renamed from: n */
    public RefocusProgressView f23057n;
    /* renamed from: o */
    public ImageView f23058o;
    /* renamed from: p */
    public TextView f23059p = null;
    /* renamed from: q */
    public hrj f23060q = null;
    /* renamed from: r */
    public gwv f23061r;
    /* renamed from: s */
    public hrg f23062s = null;
    /* renamed from: t */
    public final hrl f23063t = new hrl();
    /* renamed from: u */
    public dxo f23064u;
    /* renamed from: v */
    public ColorImage f23065v;
    /* renamed from: w */
    public int f23066w;
    /* renamed from: x */
    public int f23067x;
    /* renamed from: y */
    public final hru f23068y = new hru();
    /* renamed from: z */
    public dxn f23069z;

    public dwd(Context context, bag bag, bah bah, gos gos, gpn gpn, bkw bkw, hjf hjf, cbu cbu, gey gey, gci gci, gev gev, gtf gtf, hny hny, ehm ehm, gtl gtl, BottomBarController bottomBarController, hcd hcd, ecd ecd, gho gho, irs irs, dzh dzh, atb atb, how how, gnu gnu, gnf gnf) {
        super(bag, bah);
        this.f23032L = context;
        this.f23048e = (gpn) jri.m13152b((Object) gpn);
        this.f23028H = (bkw) jri.m13152b((Object) bkw);
        this.f23029I = (hjf) jri.m13152b((Object) hjf);
        this.f23047c = (gey) jri.m13152b((Object) gey);
        this.f23030J = (gtf) jri.m13152b((Object) gtf);
        this.f23049f = (gev) jri.m13152b((Object) gev);
        this.f23031K = (cbu) jri.m13152b((Object) cbu);
        this.al = (hny) jri.m13152b((Object) hny);
        this.f23050g = ehm;
        this.f23033M = gtl;
        this.f23034N = bottomBarController;
        this.f23035O = hcd;
        this.f23037Q = ecd;
        this.af = gho;
        this.ag = irs;
        this.f23052i = dzh;
        this.an = atb;
        this.f23027G = how;
        this.ao = gnu;
        this.ap = gnf;
        this.f23043W = new cwd(gci);
        this.aj.m1737a(gos, null);
        this.f23036P = new dwy(this);
        this.f23051h = new dwf(this);
        this.ae = ije.m3772a(bkw.f1255a, "camera:max_lens_blur_count", 3);
    }

    /* renamed from: x */
    private final void m17112x() {
        hrm hrm = this.f23041U;
        if (hrm != null) {
            hrm.mo1775c();
            this.f23041U = null;
        }
        if (this.f23021A) {
            this.f23041U = new hrm(new dwo(this), this.f23054k.mo2756k());
            if (!this.f23054k.mo2757l().m9605a(this.f23041U, LayoutInflater.from(this.f23032L))) {
                this.f23021A = false;
            }
        }
    }

    /* renamed from: a */
    static void m17110a(boolean z, View view) {
        float f = 1.0f;
        float f2 = 0.0f;
        if (z) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
        } else {
            f2 = 1.0f;
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, f});
        ofFloat.setDuration(500);
        ofFloat.setInterpolator(axl.f1008a);
        ofFloat.addUpdateListener(new dwp(view));
        ofFloat.addListener(new dwq(z, view));
        ofFloat.start();
    }

    /* renamed from: m */
    public final void mo3410m() {
        dxj dxj = this.f23056m;
        if (dxj != null && dxj.f14688b != null) {
            if (this.f23066w == go.af) {
                this.f23056m.f14688b.mo2558a(this.f23055l, this.f23044X);
            } else {
                this.f23061r.m11630a(false);
            }
        }
    }

    /* renamed from: n */
    public final void mo3411n() {
        dxj dxj = this.f23056m;
        if (dxj != null) {
            aah aah = dxj.f14688b;
            if (aah != null) {
                aah.mo2563b().sendMessageAtFrontOfQueue(aah.mo2563b().obtainMessage(302));
                aah.mo2563b().sendEmptyMessage(305);
                abo abo = this.f23056m.f14692f;
                gwv gwv = this.f23061r;
                gwv.f17501m = null;
                abo.f151q = gwv.m11624a(abo.f151q);
                this.f23056m.m9508a(abo);
            }
        }
    }

    /* renamed from: o */
    public final boolean mo3412o() {
        if (this.f23066w != go.af) {
            return false;
        }
        aas dwk = new dwk(this);
        aaf dwl = new dwl(this);
        this.f23066w = go.ad;
        this.f23065v = null;
        this.f23056m.m9510a(false);
        dxj dxj = this.f23056m;
        synchronized (dxj.f14695i) {
            if (dxj.f14690d) {
                new dxl(dxj, dwk, dwl).start();
            }
        }
        return true;
    }

    public final void close() {
    }

    /* renamed from: y */
    private final DepthmapTask m17113y() {
        try {
            hri a = hri.m3303a(this.f20801a.f1041a.mo1502a("refocus"), this.f23030J);
            era era = this.f23053j.mo2726A().f1042b;
            List a2 = this.f23060q.m3307a();
            ColorImage colorImage = this.f23065v;
            dxj dxj = this.f23056m;
            return new DepthmapTask(era, a, a2, colorImage, axm.m733a(dxj.f14689c.mo2551a(), dxj.f14693g.mo2769x().mo1441a().f7326e, dxj.f14689c.mo2553c()), this.f23056m.m9512b(), this.f23056m.f14689c.mo2553c(), m17104A(), this.aa, this.f20801a.f1041a, new eqy(this.f23028H, this.f23029I, this.f23031K), this.f23028H, this.ag, this.ao, this.ap);
        } catch (IOException e) {
            bli.m866b(f23020d, e.getMessage());
            return null;
        }
    }

    /* renamed from: z */
    private final void m17114z() {
        this.f23060q = null;
        this.f23065v = null;
        this.f23069z = null;
    }

    /* renamed from: A */
    private final String m17104A() {
        try {
            PackageInfo packageInfo = this.f23053j.mo2756k().getPackageManager().getPackageInfo(this.f23053j.mo2756k().getPackageName(), 128);
            String str = packageInfo.packageName;
            String str2 = packageInfo.versionName;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length());
            stringBuilder.append(str);
            stringBuilder.append(" ");
            stringBuilder.append(str2);
            return stringBuilder.toString();
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: a */
    public final OnGestureListener mo1119a() {
        return this.aq;
    }

    public final fha f_() {
        aaz aaz = this.ab;
        if (aaz == null) {
            return null;
        }
        fhc m = this.f23054k.mo2758m();
        this.f23054k.mo2759n().mo677b(this.f23067x).mo2553c();
        return new fhb(aaz, m);
    }

    /* renamed from: b */
    public final String mo2846b() {
        return "";
    }

    public final OnTouchListener k_() {
        return null;
    }

    /* renamed from: a */
    public final void mo2844a(gos gos) {
    }

    /* renamed from: B */
    private final void m17105B() {
        this.f23048e.mo1548a(R.raw.staged_shot_complete);
        this.f23034N.announceAccessibilityForThumbnail(this.f23032L.getResources().getString(R.string.refocus_accessibility_peek));
    }

    /* renamed from: a */
    public final void mo2843a(cfh cfh, ezy ezy) {
        this.f23066w = go.ac;
        this.f23053j = cfh;
        this.f23038R = cfh.mo2752c();
        this.f23054k = cfh;
        this.f23039S = ezy;
        this.f23055l = new Handler(Looper.getMainLooper());
        m17106C();
        this.f23040T = this.f23054k.mo2757l().f14915h;
        this.f23053j.mo2765t().inflate(R.layout.refocus_module, (ViewGroup) this.f23040T.findViewById(R.id.module_layout), true);
        this.f23057n = (RefocusProgressView) this.f23040T.findViewById(R.id.refocus_progress);
        this.f23058o = (ImageView) this.f23040T.findViewById(R.id.refocus_success_indicator);
        this.f23057n.setVisibility(8);
        this.f23058o.setVisibility(8);
        this.f23059p = (TextView) this.f23040T.findViewById(R.id.refocus_instructions);
        this.f23059p.setTypeface(Typeface.create("sans-serif-light", 0));
        this.f23059p.setVisibility(4);
        this.f23046Z = this.f23053j.mo2766u();
        this.f23021A = this.f23053j.mo2727B().mo1536a("default_scope", "refocus_show_tutorial", true);
        m17137r();
        ((grt) Instrumentation.instance().modeSwitch().getCurrentSession()).m11410b();
        this.f23047c.mo1467a((gek) this);
        this.af.mo1487c();
        m17142w();
        this.f23024D.mo2859a(new dwg(this), kpq.f8410a);
    }

    /* renamed from: c */
    public final boolean mo2849c() {
        return false;
    }

    /* renamed from: p */
    final boolean m17135p() {
        String str = f23020d;
        int i = this.ae;
        int b = this.f23047c.mo1470b();
        int i2 = this.f23023C.get();
        StringBuilder stringBuilder = new StringBuilder(83);
        stringBuilder.append("max queue size=");
        stringBuilder.append(i);
        stringBuilder.append(", tasks in queue=");
        stringBuilder.append(b);
        stringBuilder.append(", tasks to submit=");
        stringBuilder.append(i2);
        bli.m863a(str, stringBuilder.toString());
        return this.ae > this.f23047c.mo1470b() + this.f23023C.get();
    }

    /* renamed from: e */
    public final boolean mo2838e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo2839f() {
        return false;
    }

    /* renamed from: a */
    public final void mo2842a(aah aah) {
        int i = 5;
        this.f23067x = aah.mo2565c();
        bkw bkw = this.f23028H;
        hjf hjf = bkw.f1256b;
        ivy ivy = hjf.f6267b;
        if (!(ivy.f7508d || ivy.f7509e || hjf.m3195c() || bkw.f1256b.m3196d())) {
            i = 3;
        }
        i = ije.m3772a(bkw.f1255a, "lens_blur_megapixels", i);
        String str = f23020d;
        StringBuilder stringBuilder = new StringBuilder(42);
        stringBuilder.append("Selected Lens Blur megapixels: ");
        stringBuilder.append(i);
        bli.m869c(str, stringBuilder.toString());
        this.f23038R.m1098a();
        this.f23056m = new dxj(this.f23053j, this.f23055l, aah, i);
        aah aah2 = this.f23056m.f14688b;
        if (aah2 == null) {
            Toast.makeText(this.f23053j.mo2748b(), R.string.error_cannot_connect_camera, 0).show();
            return;
        }
        this.ab = aah2.mo2567e();
        abo abo = this.f23056m.f14692f;
        abo.mo2577a(1.0f);
        this.f23056m.m9508a(abo);
        this.f23056m.f14691e = this;
        gwv gwv = this.f23061r;
        if (gwv == null) {
            boolean c = this.f23053j.mo2759n().mo677b(this.f23067x).mo2553c();
            String[] stringArray = this.f23053j.mo2770y().getStringArray(R.array.pref_camera_focusmode_default_array);
            List arrayList = new ArrayList();
            abe abe = this.ab.f69w;
            for (String b : stringArray) {
                abc b2 = abe.m47b(b);
                if (b2 != null && this.ab.m34a(b2)) {
                    arrayList.add(b2);
                }
            }
            this.f23061r = new gwv(this.f23053j.mo2727B(), this.f23053j.mo2760o(), arrayList, this.ab, this, c, this.f23053j.mo2767v(), this.an, this.ag);
        } else {
            gwv.f17502n.removeMessages(0);
        }
        this.f23054k.mo2742a(this.f23061r);
        this.f23061r.m11628a(this.ab);
        if (abo.f151q == abc.CONTINUOUS_PICTURE) {
            aah.mo2559a(this.f23055l, this.f23045Y);
        }
        abw c2 = this.f23056m.f14692f.m70c();
        Point point = c2.f178a;
        float f = ((float) point.x) / ((float) point.y);
        if (f < 1.0f) {
            f = 1.0f / f;
        }
        this.f23054k.mo2757l().m9600a();
        if (this.f23042V != f) {
            this.f23042V = f;
            this.f23054k.mo2736a(f);
        }
        ezy ezy = this.f23039S;
        Point point2 = c2.f178a;
        ezy.m2207a(point2.x, point2.y, false);
        m17107D();
        this.f23062s = new hrg(this.f23040T.findViewById(R.id.shutter_view));
        SurfaceTexture surfaceTexture = this.f23054k.mo2757l().f14892I;
        if (surfaceTexture != null) {
            this.f23056m.m9509a(surfaceTexture, this.ah);
        }
    }

    /* renamed from: a */
    public final void mo3409a(ColorImage colorImage, long j) {
        this.f23068y.m3313a(SystemClock.elapsedRealtimeNanos());
        if (this.f23066w == go.ae) {
            boolean z;
            Object obj;
            dxo dxo = this.f23064u;
            ProcessingNative.TrackFrame(colorImage);
            dxo.f3364d = ProcessingNative.RefineRotationAndGetParallax(dxo.f3361a) / dxo.f3365e;
            ProcessingNative.GetTrackerStats(dxo.f3367g);
            hrl hrl = this.f23063t;
            float f = this.f23064u.f3364d;
            hrl.f6503c.m3313a(j);
            hrl.f6501a.m3309b(f / 0.006f);
            if (hrl.f6503c.f6523b >= 2) {
                hrk hrk = hrl.f6501a;
                f = Math.max(0.0f, hrk.f6498a - hrk.f6499b);
                hru hru = hrl.f6503c;
                float f2 = hru.f6522a.f6498a * f;
                if (hru.f6523b == 2) {
                    hrl.f6502b.m3308a(f2);
                } else {
                    hrl.f6502b.m3309b(f2);
                }
                if (!hrl.f6508h) {
                    if (hrl.f6502b.f6498a < 0.6666667f) {
                        hrl.f6509i.m3314b();
                    } else {
                        hrl.f6509i.m3313a(j);
                        if (((float) hrl.f6509i.f6523b) >= 3.0f) {
                            hrl.f6508h = true;
                        }
                    }
                }
                if (hrl.f6508h) {
                    hrk hrk2 = hrl.f6501a;
                    if (hrk2.f6498a >= 0.2f) {
                        f2 = hrl.f6506f;
                        if (f2 <= 2.0f && f2 / hrl.f6502b.f6498a <= 1.5f) {
                            hrl.f6506f = (float) (Math.min(((((double) f) * 0.5d) / ((double) hrk2.f6499b)) + 1.0d, 1.0499999523162842d) * ((double) f2));
                            hrl.f6506f = Math.min(hrl.f6506f, 2.0f);
                        }
                    }
                }
            }
            hrl.f6507g = 1.0f / (hrl.f6501a.f6498a / hrl.f6503c.m3312a());
            f = hrl.f6501a.f6498a;
            if (f < 1.0f) {
                hrl.f6504d = (float) Math.pow((double) f, 1.399999976158142d);
            } else {
                hrl.f6504d = f;
            }
            hrl.f6505e = Math.max(hrl.f6505e, hrl.m3310a());
            this.f23057n.m1348a(this.f23063t.m3310a());
            dxn dxn = this.f23069z;
            TrackerStats trackerStats = dxn.f3342a.f3367g;
            if (trackerStats.numInitialTracks < 15 || trackerStats.inactiveTracksRatio > 0.8f) {
                dxn.f3350i = true;
            }
            if (trackerStats.averageMotionRatio > 0.2f) {
                dxn.f3351j = true;
            }
            if (trackerStats.inactiveTracksRatio > 0.6f && trackerStats.inactiveTracksBoundaryRatio <= 0.6f) {
                dxn.f3352k = true;
            }
            if (dxn.f3343b.m3312a() > 8.0f && dxn.f3345d.f6507g > 20.0f) {
                dxn.f3349h = true;
            }
            if (trackerStats.averageMotionRatio > 0.1f) {
                z = true;
            } else if (trackerStats.inactiveTracksRatio <= 0.6f) {
                z = false;
            } else if (trackerStats.inactiveTracksBoundaryRatio <= 0.6f) {
                z = false;
            } else {
                z = true;
            }
            dxn.f3356o = z;
            if (trackerStats.frameAverageMotionRatio > 0.01f) {
                z = true;
            } else {
                z = false;
            }
            dxn.f3353l = z;
            boolean z2 = dxn.f3353l;
            if (z2) {
                z = true;
            } else if (trackerStats.frameInactiveTracksRatio <= 0.2f) {
                z = false;
            } else {
                z = true;
            }
            dxn.f3355n = z;
            int i = dxn.f3346e;
            if (i != 0) {
                z = false;
            } else if (dxn.f3343b.f6522a.f6498a < 15.0f) {
                z = true;
            } else {
                z = false;
            }
            dxn.f3354m = z;
            if (dxn.f3357p) {
                z = true;
            } else if (dxn.f3356o) {
                z = true;
            } else {
                z = false;
            }
            dxn.f3357p = z;
            if (dxn.f3358q) {
                z = true;
            } else if (z2) {
                z = true;
            } else {
                z = false;
            }
            dxn.f3358q = z;
            if (dxn.f3359r) {
                z = true;
            } else if (dxn.f3354m) {
                z = true;
            } else {
                z = false;
            }
            dxn.f3359r = z;
            if (dxn.f3355n) {
                dxn.f3347f++;
            }
            dxn.f3346e = i + 1;
            dxn = this.f23069z;
            if (dxn.f3354m) {
                obj = 1;
            } else if (dxn.f3353l) {
                obj = 1;
            } else if (dxn.f3356o) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                this.f23057n.f2459a = true;
                if (dxn.f3356o) {
                    this.f23059p.setText(R.string.warning_viewport);
                }
                if (this.f23069z.f3353l) {
                    this.f23059p.setText(R.string.warning_fast_motion);
                    this.f23057n.f2459a = true;
                }
                if (this.f23069z.f3354m) {
                    this.f23059p.setText(R.string.warning_low_light_motion);
                    this.f23057n.f2459a = true;
                }
                this.f23055l.removeCallbacks(this.f23026F);
                this.f23055l.postDelayed(this.f23026F, 1500);
            }
            if (this.f23069z.m1692a()) {
                m17120a(true, true);
                return;
            }
            if ((this.f23069z.f3355n ^ 1) != 0) {
                hrj hrj = this.f23060q;
                float f3 = this.f23063t.f6504d;
                float ImageGradientMeasure = ProcessingNative.ImageGradientMeasure(colorImage);
                if (hrj.f6496b.size() < hrj.f6495a) {
                    hrj.f6496b.add(new SelectedFrame(f3, ImageGradientMeasure, colorImage));
                } else {
                    SelectedFrame selectedFrame;
                    hrj.f6497c.update(f3, ImageGradientMeasure);
                    hrj.f6496b.add(hrj.f6497c);
                    Collections.sort(hrj.f6496b);
                    int i2 = 0;
                    int i3 = LfuScheduler.MAX_PRIORITY;
                    float f4 = Float.MAX_VALUE;
                    while (i2 < hrj.f6496b.size() - 1) {
                        int i4;
                        SelectedFrame selectedFrame2 = (SelectedFrame) hrj.f6496b.get(i2);
                        i = i2 + 1;
                        selectedFrame = (SelectedFrame) hrj.f6496b.get(i);
                        float f5 = selectedFrame.progress - selectedFrame2.progress;
                        if (f5 < f4) {
                            if (selectedFrame2.gradient >= selectedFrame.gradient) {
                                i4 = i;
                            } else {
                                i4 = i2;
                            }
                            f = f5;
                        } else {
                            i4 = i3;
                            f = f4;
                        }
                        i2++;
                        i3 = i4;
                        f4 = f;
                    }
                    selectedFrame = (SelectedFrame) hrj.f6496b.get(i3);
                    if (selectedFrame != hrj.f6497c) {
                        selectedFrame.update(f3, ImageGradientMeasure, colorImage);
                    }
                    hrj.f6496b.remove(hrj.f6497c);
                }
            }
            if (this.f23063t.m3310a() > 0.99f) {
                m17120a(true, true);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo2845a(int i, KeyEvent keyEvent) {
        switch (i) {
            case 23:
                if (this.f23066w == go.af) {
                    this.f23051h.onShutterButtonClick();
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final boolean mo2848b(int i, KeyEvent keyEvent) {
        switch (i) {
            case 82:
                if (this.f23066w != go.af) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final void mo2847b(boolean z) {
        dxj dxj = this.f23056m;
        if (dxj != null) {
            dxj.m9506a();
        }
        m17137r();
        m17112x();
    }

    public final void l_() {
        dxj dxj = this.f23056m;
        if (dxj != null) {
            dxj.m9506a();
        }
    }

    /* renamed from: d */
    public final void mo1120d() {
        m17107D();
    }

    /* renamed from: q */
    public final void mo3413q() {
        if (this.f23066w == go.af) {
            this.f23055l.post(new dwu(this));
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        dxj dxj = this.f23056m;
        if (dxj != null) {
            dxj.m9509a(surfaceTexture, this.ah);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        dxj dxj = this.f23056m;
        if (dxj != null) {
            dxj.m9514d();
        }
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void m_() {
    }

    /* renamed from: C */
    private final void m17106C() {
        int i;
        iut b = this.f23052i.m1696b();
        dzh dzh = this.f23052i;
        if (b != iut.BACK) {
            i = dzh.f3382b;
        } else {
            i = dzh.f3381a;
        }
        this.f23067x = i;
        this.f23037Q.m15518a(b);
        this.f23054k.mo2727B().mo1531a(this.f23053j.mo2768w(), "pref_camera_id_key", this.f23067x);
        this.f23054k.mo2759n().mo682d(this.f23067x);
    }

    /* renamed from: j */
    public final void mo2851j() {
        this.f23033M.mo1632f(this.ak);
    }

    /* renamed from: r */
    final void m17137r() {
        iqm b;
        switch (this.f23038R.m1098a().getDefaultDisplay().getRotation()) {
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
        int a = this.f23053j.mo2759n().mo677b(this.f23067x).m54a(b.m4041a(), true);
        gwv gwv = this.f23061r;
        if (gwv != null) {
            gwv.f17498j = a;
            gwv.m11632c();
        }
    }

    /* renamed from: s */
    public final void mo3414s() {
        if (this.f23056m != null) {
            m17141v();
        }
    }

    /* renamed from: k */
    public final void mo2852k() {
        this.f23066w = go.ac;
        this.ad = new ikb();
        this.ad.mo1879a(this.f23035O.m3023a(this.f23051h));
        this.f23034N.addListener(this.f23036P);
        this.f23054k.mo2743a((haq) this, false);
        m17106C();
        this.f23022B = Executors.newSingleThreadExecutor();
        m17112x();
        this.f23059p.addTextChangedListener(this.ai);
        this.al.m11922a(this.am);
        if (this.ac == null) {
            this.ac = new abi(new dwi(this), this.f23055l);
            this.f20802b.mo675a(this.ac);
        }
    }

    /* renamed from: t */
    public final void mo3415t() {
    }

    /* renamed from: l */
    public final void mo2853l() {
        this.ad.close();
        m17120a(false, false);
        this.f23034N.removeListener(this.f23036P);
        this.af.mo1486b();
        this.f23022B.shutdownNow();
        if (this.f23056m != null) {
            mo3411n();
            this.f23056m.m9514d();
            this.f23056m.m9513c();
            this.f23056m = null;
            this.f23054k.mo2759n().mo681c(this.f23067x);
            this.f23061r.f17493e = 0;
        }
        this.f23066w = go.ac;
        hrm hrm = this.f23041U;
        if (hrm != null) {
            hrm.mo1775c();
            this.f23041U = null;
        }
        this.f23059p.removeTextChangedListener(this.ai);
        this.f23042V = 0.0f;
        this.al.m11924b(this.am);
        this.f20802b.mo679b(this.ac);
        this.ac = null;
    }

    /* renamed from: a */
    final void m17120a(boolean z, boolean z2) {
        long j = 3000;
        if (this.f23066w == go.ae) {
            this.f23050g.mo3008E();
            this.f23066w = go.af;
            this.f23056m.m9510a(true);
            dxn dxn = this.f23069z;
            if (!dxn.m1692a() && (((float) dxn.f3347f) / ((float) dxn.f3346e) > 0.1f || dxn.f3344c.m3307a().size() < 7)) {
                dxn.f3348g = true;
            }
            ProcessingNative.StopTracker();
            mo3411n();
            this.f23057n.setVisibility(8);
            if (this.f23069z.m1692a()) {
                int i;
                if (z2) {
                    this.f23048e.mo1548a(R.raw.staged_shot_cancelled);
                    this.f23034N.announceAccessibilityForThumbnail(this.f23032L.getResources().getString(R.string.photo_accessibility_shot_canceled));
                }
                dxn = this.f23069z;
                if (dxn.f3360s) {
                    i = -1;
                    j = 500;
                } else {
                    i = !dxn.f3348g ? !dxn.f3349h ? !dxn.f3350i ? !dxn.f3352k ? dxn.f3351j ? R.string.error_viewport : R.string.capture_error : R.string.error_scene : R.string.error_tracking_failed : R.string.error_slow_motion : R.string.error_fast_motion;
                }
                this.f23055l.removeCallbacks(this.f23026F);
                if (i >= 0) {
                    this.f23059p.setText(i);
                }
                this.f23058o.setImageResource(R.drawable.refocus_unsuccessful);
                dwd.m17110a(true, this.f23059p);
                dwd.m17110a(true, this.f23058o);
                this.f23055l.postDelayed(this.f23025E, j);
            } else {
                dxn = this.f23069z;
                boolean z3 = !dxn.f3359r ? !dxn.f3358q ? dxn.f3357p : true : true;
                if (z3) {
                    if (z2) {
                        m17105B();
                    }
                    dxn = this.f23069z;
                    if (dxn.f3358q) {
                        this.f23059p.setText(R.string.had_warning_fast_motion);
                    } else if (dxn.f3357p) {
                        this.f23059p.setText(R.string.had_warning_viewport);
                    } else if (dxn.f3359r) {
                        this.f23059p.setText(R.string.had_warning_low_light);
                    }
                    this.f23055l.removeCallbacks(this.f23026F);
                    this.f23058o.setImageResource(R.drawable.ic_warning_graphic);
                    dwd.m17110a(true, this.f23059p);
                    dwd.m17110a(true, this.f23058o);
                    this.f23055l.postDelayed(this.f23025E, 3000);
                } else {
                    if (z2) {
                        m17105B();
                    }
                    this.f23055l.removeCallbacks(this.f23026F);
                    this.f23058o.setImageResource(R.drawable.refocus_successful);
                    dwd.m17110a(false, this.f23059p);
                    dwd.m17110a(true, this.f23058o);
                    this.f23055l.postDelayed(this.f23025E, 1000);
                }
            }
            this.aa = this.f23046Z.mo1244d();
            irs irs = this.ag;
            dxn dxn2 = this.f23069z;
            boolean z4 = dxn2.f3348g;
            irs.mo1594a(z4, dxn2.f3349h, dxn2.f3350i, dxn2.f3351j, dxn2.f3352k, dxn2.f3360s, dxn2.f3357p, z4, dxn2.f3359r);
            this.f23024D.mo348a(Integer.valueOf(this.f23023C.incrementAndGet()));
            this.f23054k.mo2757l().f14925r.m1335a();
            if (z) {
                new Thread(new dwn(this, m17113y(), this.f23069z.m1692a())).start();
                m17114z();
                return;
            }
            m17114z();
            this.f23024D.mo348a(Integer.valueOf(this.f23023C.decrementAndGet()));
        }
    }

    /* renamed from: u */
    public final void mo3416u() {
    }

    public final boolean n_() {
        return false;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    /* renamed from: v */
    final void m17141v() {
        dxj dxj = this.f23056m;
        abo abo = dxj.f14692f;
        aaz e = dxj.f14688b.mo2567e();
        if (e.m32a(aba.FOCUS_AREA)) {
            Collection collection = this.f23061r.f17499k;
            abo.f139e.clear();
            if (collection != null) {
                abo.f139e.addAll(collection);
            }
        }
        if (e.m32a(aba.METERING_AREA)) {
            Collection collection2 = this.f23061r.f17500l;
            abo.f138d.clear();
            if (collection2 != null) {
                abo.f138d.addAll(collection2);
            }
        }
        gwv gwv = this.f23061r;
        gwv.f17501m = null;
        abo.f151q = gwv.m11624a(abo.f151q);
        this.f23056m.m9508a(abo);
    }

    /* renamed from: D */
    private final void m17107D() {
        if (this.f23056m != null) {
            this.f23054k.mo2757l().f14887D.mo1211a(this.f23043W.m1547a(new iqp(this.f23040T.getWidth(), this.f23040T.getHeight()), new iqp(this.f23056m.f14692f.m70c().f178a.x, this.f23056m.f14692f.m70c().f178a.y)));
        }
    }

    /* renamed from: w */
    final void m17142w() {
        if (m17135p()) {
            this.af.mo1488d();
            this.f23035O.m3028c(true);
            return;
        }
        this.af.mo1489e();
        this.f23035O.m3028c(false);
    }
}
