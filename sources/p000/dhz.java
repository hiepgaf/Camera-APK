package p000;

import android.app.AlertDialog;
import android.content.res.Resources;
import android.view.KeyEvent;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;

/* compiled from: PG */
/* renamed from: dhz */
public abstract class dhz extends cvs {
    /* renamed from: d */
    public static final String f22887d = bli.m862a("CdrFastVid2Mod");
    /* renamed from: A */
    private final bkg f22888A;
    /* renamed from: B */
    private ikb f22889B;
    /* renamed from: C */
    private ebd f22890C;
    /* renamed from: D */
    private final hny f22891D;
    /* renamed from: E */
    private final hnz f22892E = new dib(this);
    /* renamed from: F */
    private final ipv f22893F = new dic(this);
    /* renamed from: G */
    private final haq f22894G = new die();
    /* renamed from: c */
    private final ilp f22895c;
    /* renamed from: e */
    public final ikd f22896e;
    /* renamed from: f */
    public final ikb f22897f;
    /* renamed from: g */
    public final String f22898g;
    /* renamed from: h */
    public final hch f22899h;
    /* renamed from: i */
    public final how f22900i;
    /* renamed from: j */
    public final Object f22901j = new Object();
    /* renamed from: k */
    public hkv f22902k;
    /* renamed from: l */
    public final awr f22903l;
    /* renamed from: m */
    public dii f22904m = dii.UNINITED;
    /* renamed from: n */
    public dil f22905n;
    /* renamed from: o */
    public kpk f22906o;
    /* renamed from: p */
    private final ilb f22907p;
    /* renamed from: q */
    private final bpq f22908q;
    /* renamed from: r */
    private final String f22909r;
    /* renamed from: s */
    private final dhs f22910s;
    /* renamed from: t */
    private final kwk f22911t;
    /* renamed from: u */
    private final BottomBarListener f22912u;
    /* renamed from: v */
    private final BottomBarController f22913v;
    /* renamed from: w */
    private final hcd f22914w;
    /* renamed from: x */
    private final ecd f22915x;
    /* renamed from: y */
    private final dzh f22916y;
    /* renamed from: z */
    private final bja f22917z;

    /* renamed from: a */
    public abstract BottomBarListener mo3559a(BottomBarController bottomBarController, hcd hcd);

    public dhz(ilp ilp, bag bag, bah bah, bpq bpq, ikd ikd, Resources resources, kwk kwk, ilp ilp2, hny hny, ilp ilp3, BottomBarController bottomBarController, hcd hcd, dzh dzh, ecd ecd, dht dht, bja bja, how how, awr awr, bkg bkg, bsn bsn) {
        super(bag, bah);
        bli.m863a(f22887d, "New instance created.");
        this.f22897f = new ikb();
        this.f22908q = bpq;
        this.f22896e = ikd;
        this.f22895c = ilp;
        this.f22907p = new ilb((inc) this.f22895c.mo2860b());
        this.f22909r = resources.getString(R.string.video_accessibility_peek);
        this.f22898g = resources.getString(R.string.pref_camera_video_flashmode_torch);
        this.f22916y = dzh;
        this.f22915x = ecd;
        this.f22911t = kwk;
        this.f22914w = hcd;
        this.f22891D = hny;
        this.f22917z = bja;
        this.f22900i = how;
        this.f22903l = awr;
        this.f22888A = bkg;
        this.f22897f.mo1879a(ilp2.mo2859a(new dih(this), ikd));
        this.f22897f.mo1879a(bkg);
        this.f22910s = dht.mo1146a(ilp3, this.f22893F, bsn);
        this.f22899h = new did(this);
        this.f22913v = bottomBarController;
        this.f22912u = mo3559a(this.f22913v, this.f22914w);
    }

    /* renamed from: a */
    public final void m17065a(inc inc) {
        inc inc2 = (inc) this.f22907p.f21734c;
        if (inc == inc2) {
            String str = f22887d;
            String valueOf = String.valueOf(inc);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 66);
            stringBuilder.append("changeCaptureRate() do nothing since captureRate[");
            stringBuilder.append(valueOf);
            stringBuilder.append("] does not change");
            bli.m866b(str, stringBuilder.toString());
            return;
        }
        valueOf = f22887d;
        str = String.valueOf(inc2);
        String valueOf2 = String.valueOf(inc);
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(valueOf2).length());
        stringBuilder2.append("changeCaptureRate() from:");
        stringBuilder2.append(str);
        stringBuilder2.append("to: ");
        stringBuilder2.append(valueOf2);
        bli.m863a(valueOf, stringBuilder2.toString());
        this.f22907p.mo348a(inc);
        this.f22895c.mo348a(inc);
        this.f22902k.mo1159c();
        this.f22902k.m3234a(inc);
        synchronized (this.f22901j) {
            mo2841h();
            m17064a(this.f22902k);
        }
    }

    /* renamed from: m */
    final void m17078m() {
        synchronized (this.f22901j) {
            this.f22904m = dii.ERROR;
            if (this.f22905n != null) {
                bli.m871d(f22887d, "Leave the CamcorderDevice opened in the fatal error state");
            }
        }
    }

    public void close() {
        synchronized (this.f22901j) {
            bli.m863a(f22887d, "closing");
            m17058n();
            this.f22897f.close();
        }
    }

    public final fha f_() {
        return null;
    }

    /* renamed from: b */
    public final String mo2846b() {
        return this.f22909r;
    }

    /* renamed from: a */
    public final void mo2844a(gos gos) {
    }

    /* renamed from: a */
    public final void mo2843a(cfh cfh, ezy ezy) {
        synchronized (this.f22901j) {
            String str = f22887d;
            String valueOf = String.valueOf(this.f22904m);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 11);
            stringBuilder.append("init state=");
            stringBuilder.append(valueOf);
            bli.m863a(str, stringBuilder.toString());
            if (this.f22904m == dii.UNINITED) {
                this.f22904m = dii.BACKGROUND;
                this.f22890C = cfh.mo2757l();
            } else if (this.f22904m == dii.BACKGROUND) {
                bli.m863a(f22887d, "init when the module is already in BACKGROUND");
            } else {
                bli.m863a(f22887d, "init when the module is not pause()");
            }
        }
    }

    /* renamed from: c */
    public final boolean mo2849c() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo2838e() {
        return true;
    }

    /* renamed from: f */
    public final boolean mo2839f() {
        synchronized (this.f22901j) {
            if (this.f22902k.f6318d.mo1561N()) {
                this.f22899h.onShutterButtonClick();
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo2842a(aah aah) {
    }

    /* renamed from: a */
    public final boolean mo2845a(int i, KeyEvent keyEvent) {
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
        synchronized (this.f22901j) {
            if (this.f22904m.equals(dii.CAMCORDER_OPENED)) {
                boolean z;
                jri.m13152b(this.f22905n);
                dil dil = this.f22905n;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                dil.mo2966b(z);
                return;
            }
        }
    }

    /* renamed from: a */
    final void m17064a(hkv hkv) {
        bli.m863a(f22887d, "openCamcorderDevice");
        synchronized (this.f22901j) {
            jri.m13143a(this.f22904m.equals(dii.OPENING_CAMCORDER) ^ 1);
            this.f22904m = dii.OPENING_CAMCORDER;
            if (this.f22906o == null) {
                mo2840g();
            }
            kow.m13622a(this.f22906o, new dig(this, hkv), this.f22896e);
        }
    }

    public final void m_() {
    }

    /* renamed from: g */
    public final void mo2840g() {
        bli.m863a(f22887d, "prewarm");
        synchronized (this.f22901j) {
            mo2841h();
            this.f22906o = this.f22910s.mo1145a();
            kow.m13622a(this.f22906o, new dif(this), kpq.f8410a);
        }
    }

    /* renamed from: h */
    public final void mo2841h() {
        synchronized (this.f22901j) {
            if (this.f22906o != null) {
                bli.m863a(f22887d, "prewarmCancel: cancel futureStateCamcorderDeviceOpened");
                this.f22906o.cancel(true);
                this.f22906o = null;
            }
            if (this.f22905n != null) {
                bli.m863a(f22887d, "prewarmCancel: close openedCamcorderDevice");
                this.f22905n.close();
                this.f22905n = null;
            }
            this.f22917z.m838a();
        }
    }

    /* renamed from: j */
    public final void mo2851j() {
    }

    /* renamed from: k */
    public final void mo2852k() {
        synchronized (this.f22901j) {
            String str = f22887d;
            String valueOf = String.valueOf(this.f22904m);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 12);
            stringBuilder.append("start state=");
            stringBuilder.append(valueOf);
            bli.m863a(str, stringBuilder.toString());
            if (this.f22904m != dii.BACKGROUND) {
                bli.m866b(f22887d, "do nothing. only resume when state is BACKGROUND");
                return;
            }
            this.f22889B = new ikb();
            this.f22889B.mo1879a(this.f22914w.m3023a(this.f22899h));
            this.f22913v.addListener(this.f22912u);
            this.f22902k = (hkv) this.f22911t.mo345a();
            this.f22902k.f6321g = this.f22890C;
            jri.m13153b(true);
            hkv hkv = this.f22902k;
            hkv.f6321g.m9601a(ebk.SURFACE_VIEW, this.f22894G);
            this.f22915x.m15518a(this.f22916y.m1696b());
            m17064a(this.f22902k);
            this.f22902k.m3234a((inc) this.f22895c.mo2860b());
            this.f22891D.m11922a(this.f22892E);
            this.f22888A.mo2688a();
        }
    }

    /* renamed from: l */
    public final void mo2853l() {
        synchronized (this.f22901j) {
            String str = f22887d;
            String valueOf = String.valueOf(this.f22904m);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 11);
            stringBuilder.append("stop state=");
            stringBuilder.append(valueOf);
            bli.m863a(str, stringBuilder.toString());
            if (this.f22904m == dii.BACKGROUND) {
                return;
            }
            m17058n();
        }
    }

    /* renamed from: n */
    private final void m17058n() {
        synchronized (this.f22901j) {
            this.f22913v.removeListener(this.f22912u);
            this.f22913v.cancelRecording();
            this.f22904m = dii.BACKGROUND;
            if (this.f22906o != null) {
                bli.m863a(f22887d, "stop: close futureStateCamcorderDeviceOpened");
                this.f22906o.cancel(true);
                this.f22906o = null;
            }
            if (this.f22905n != null) {
                bli.m863a(f22887d, "stop: close openedCamcorderDevice");
                this.f22905n.close();
                this.f22905n = null;
            }
            this.f22902k.m3234a(null);
            hkv hkv = this.f22902k;
            AlertDialog alertDialog = hkv.f6322h;
            if (alertDialog != null && alertDialog.isShowing()) {
                hkv.f6322h.dismiss();
            }
            hkv.f6321g.m9619j();
            this.f22891D.m11924b(this.f22892E);
            this.f22889B.close();
            this.f22917z.m838a();
            this.f22888A.mo2689b();
        }
    }
}
