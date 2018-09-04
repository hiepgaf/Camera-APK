package p000;

import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Surface;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.OneCameraSession;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: czg */
public final class czg {
    /* renamed from: a */
    public static final String f2854a = bli.m862a("Capture1CC");
    /* renamed from: b */
    public final chu f2855b;
    /* renamed from: c */
    public final bnb f2856c;
    /* renamed from: d */
    public final ilp f2857d;
    /* renamed from: e */
    public final Object f2858e = new Object();
    /* renamed from: f */
    public kpk f2859f;
    /* renamed from: g */
    private final ikd f2860g;
    /* renamed from: h */
    private final kpm f2861h;
    /* renamed from: i */
    private final fxe f2862i;
    /* renamed from: j */
    private final ilp f2863j;
    /* renamed from: k */
    private final gor f2864k;
    /* renamed from: l */
    private final fbn f2865l;
    /* renamed from: m */
    private final fhc f2866m;
    /* renamed from: n */
    private final don f2867n;
    /* renamed from: o */
    private final DisplayMetrics f2868o;
    /* renamed from: p */
    private final ird f2869p;
    /* renamed from: q */
    private final Instrumentation f2870q;
    /* renamed from: r */
    private final ilp f2871r;
    /* renamed from: s */
    private final doz f2872s;
    /* renamed from: t */
    private hek f2873t;
    /* renamed from: u */
    private cza f2874u;
    /* renamed from: v */
    private fbj f2875v;
    /* renamed from: w */
    private bcl f2876w;
    /* renamed from: x */
    private Future f2877x;

    public czg(ikd ikd, kpm kpm, gor gor, fxe fxe, ilp ilp, fhc fhc, fbn fbn, don don, DisplayMetrics displayMetrics, chz chz, bnb bnb, Instrumentation instrumentation, ird ird, ilp ilp2, ilp ilp3, doz doz) {
        this.f2860g = ikd;
        this.f2861h = kpm;
        this.f2862i = fxe;
        this.f2863j = ilp;
        this.f2864k = gor;
        this.f2866m = fhc;
        this.f2865l = fbn;
        this.f2867n = don;
        this.f2868o = displayMetrics;
        this.f2855b = new ckt(chz);
        this.f2856c = bnb;
        this.f2870q = instrumentation;
        this.f2869p = ird;
        this.f2857d = ilp2;
        this.f2871r = ilp3;
        this.f2872s = doz;
    }

    /* renamed from: b */
    private final kpk m1558b(cwc cwc) {
        this.f2865l.m10176b(cwc.f2815a);
        cza a = cza.m1552a(cwc);
        synchronized (this.f2858e) {
            cza cza = this.f2874u;
            if (cza != null && a.equals(cza)) {
                bcl bcl;
                kpk a2;
                if (this.f2875v != null && this.f2859f == null) {
                    bcl = this.f2876w;
                    if (bcl != null) {
                        if (!bcl.f10662a.get()) {
                            try {
                                Future future = this.f2877x;
                                if (future == null || (future.isDone() && !((Surface) this.f2877x.get()).isValid())) {
                                    bli.m869c(f2854a, "Camera with the same configuration is already open but surface is invalid");
                                    m1561a();
                                } else {
                                    bli.m869c(f2854a, "Camera with the same configuration is already open, returning it.");
                                    a2 = kow.m13617a(this.f2875v);
                                    return a2;
                                }
                            } catch (InterruptedException e) {
                            } catch (ExecutionException e2) {
                            }
                        }
                    }
                }
                if (this.f2859f != null) {
                    bcl = this.f2876w;
                    if (!(bcl == null || bcl.f10662a.get())) {
                        bli.m869c(f2854a, "Camera with the same configuration is opening, returning Future.");
                        a2 = this.f2859f;
                        return a2;
                    }
                }
                bli.m869c(f2854a, "Camera with the same configuration exists, but has not been closed. Stopping and starting over.");
                m1561a();
            } else if (!(this.f2874u == null || (this.f2875v == null && this.f2859f == null))) {
                m1561a();
            }
            this.f2874u = a;
            return null;
        }
    }

    /* renamed from: a */
    public final kpk m1559a(cwc cwc, kpk kpk, gjk gjk, etg etg) {
        return kow.m13619a(new czh(this, cwc, kpk, gjk, etg), this.f2861h);
    }

    /* renamed from: b */
    final kpk m1563b(cwc cwc, kpk kpk, gjk gjk, etg etg) {
        kpk b = m1558b(cwc);
        if (b != null) {
            bli.m863a(f2854a, "Not opening camera because config did not change");
        } else {
            boolean z;
            kpk a = kny.m18046a(kpk, new czi(this, cwc), this.f2860g);
            OneCameraSession oneCameraSession = (OneCameraSession) this.f2870q.oneCamera().create();
            if (oneCameraSession.f12328a == 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13154b(z, (Object) "Accidental session reuse.");
            iya iya = oneCameraSession.m;
            oneCameraSession.f12328a = SystemClock.elapsedRealtimeNanos();
            this.f2869p.mo1903a("OneCamera#create");
            fbj a2 = m1557a(cwc, a, oneCameraSession, gjk, etg);
            if (oneCameraSession.f12330c == 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13154b(z, (Object) "Accidental session reuse.");
            iya = oneCameraSession.m;
            oneCameraSession.f12330c = SystemClock.elapsedRealtimeNanos();
            oneCameraSession.m1327a("OneCamera Created", oneCameraSession.f12329b, oneCameraSession.f12330c);
            this.f2869p.mo1905b("OneCamera#start");
            bli.m869c(f2854a, "Starting OneCamera");
            if (oneCameraSession.f12331d == 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13154b(z, (Object) "Accidental session reuse.");
            iya = oneCameraSession.m;
            oneCameraSession.f12331d = SystemClock.elapsedRealtimeNanos();
            oneCameraSession.m1328a("OneCamera Created", oneCameraSession.f12330c, "OneCamera Start", oneCameraSession.f12331d);
            b = kny.m18045a(a2.mo2858d(), new czj(this, oneCameraSession, a2), this.f2861h);
            synchronized (this.f2858e) {
                this.f2875v = a2;
                this.f2859f = b;
            }
            this.f2869p.mo1904b();
        }
        return b;
    }

    /* renamed from: a */
    private final fbj m1557a(cwc cwc, kpk kpk, OneCameraSession oneCameraSession, gjk gjk, etg etg) {
        boolean z;
        fbj a;
        String a2 = gos.m2669a(cwc.f2815a.f7482b);
        ffc b = this.f2865l.m10176b(cwc.f2815a);
        fha czd = new czd(this.f2866m, cwc, b);
        fxg a3 = fxg.m2410a(cwc.f2817c, this.f2862i, this.f2863j, new fxd(this.f2864k.m2663a(a2, "pref_camera_flashmode_key"), b, fxi.AUTO), czd, this.f2871r);
        iqp iqp = cwc.f2818d.f6105a;
        chu chu = this.f2855b;
        bnb bnb = this.f2856c;
        dad dad = new dad();
        dof dof = new dof(iqp, kpk, chu, bnb, this.f2868o, gjk, etg);
        if (oneCameraSession.f12329b == 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13154b(z, (Object) "Accidental session reuse.");
        iya iya = oneCameraSession.m;
        oneCameraSession.f12329b = SystemClock.elapsedRealtimeNanos();
        oneCameraSession.m1328a("OneCamera Initialize", oneCameraSession.f12328a, "OneCamera Create", oneCameraSession.f12329b);
        synchronized (this.f2858e) {
            this.f2876w = new bcl();
            a = this.f2867n.mo1165a(cwc.f2815a, this.f2876w, dof, a3, this.f2872s);
        }
        return a;
    }

    /* renamed from: a */
    public final boolean m1562a(cwc cwc) {
        boolean z = false;
        this.f2865l.m10176b(cwc.f2815a);
        cza a = cza.m1552a(cwc);
        synchronized (this.f2858e) {
            cza cza = this.f2874u;
            if (cza != null && a.equals(cza)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    final kpk m1560a(heo heo, hek hek) {
        Object a;
        ikd.m12259a();
        jri.m13152b((Object) heo);
        jri.m13152b((Object) hek);
        synchronized (this.f2858e) {
            this.f2873t = hek;
            a = this.f2873t.m3096a(heo);
            jri.m13152b(a);
            this.f2877x = a;
        }
        return a;
    }

    /* renamed from: a */
    public final void m1561a() {
        synchronized (this.f2858e) {
            this.f2874u = null;
            if (this.f2859f != null) {
                bli.m873e(f2854a, "Active camera open future currently exists. Aborting the previous open.");
                this.f2859f.cancel(true);
                this.f2859f = null;
            }
            fbj fbj = this.f2875v;
            if (fbj != null) {
                fbj.close();
                this.f2875v = null;
            }
        }
    }
}
