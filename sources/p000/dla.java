package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.KeyEvent;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.stats.Instrumentation;

/* compiled from: PG */
/* renamed from: dla */
public final class dla extends cvs implements ing {
    /* renamed from: A */
    private final BottomBarController f22960A;
    /* renamed from: B */
    private final hcd f22961B;
    /* renamed from: C */
    private final BottomBarListener f22962C;
    /* renamed from: D */
    private final ilp f22963D;
    /* renamed from: E */
    private ikb f22964E;
    /* renamed from: F */
    private final ecd f22965F;
    /* renamed from: G */
    private final gxz f22966G;
    /* renamed from: H */
    private final asu f22967H;
    /* renamed from: I */
    private final hat f22968I;
    /* renamed from: J */
    private final irs f22969J;
    /* renamed from: K */
    private final dkb f22970K;
    /* renamed from: L */
    private final djo f22971L;
    /* renamed from: M */
    private final imy f22972M;
    /* renamed from: N */
    private cfh f22973N;
    /* renamed from: O */
    private fbn f22974O;
    /* renamed from: P */
    private Intent f22975P;
    /* renamed from: Q */
    private final div f22976Q;
    /* renamed from: R */
    private final kwk f22977R;
    /* renamed from: S */
    private final hny f22978S;
    /* renamed from: T */
    private final hnz f22979T = new dlb(this);
    /* renamed from: U */
    private final dzh f22980U;
    /* renamed from: V */
    private final haq f22981V = new dle();
    /* renamed from: W */
    private final hnr f22982W = new dlh(this);
    /* renamed from: c */
    public boolean f22983c;
    /* renamed from: d */
    public buh f22984d;
    /* renamed from: e */
    public hin f22985e;
    /* renamed from: f */
    public final gtl f22986f;
    /* renamed from: g */
    public final hch f22987g;
    /* renamed from: h */
    public AlertDialog f22988h;
    /* renamed from: i */
    public final how f22989i;
    /* renamed from: j */
    private dli f22990j;
    /* renamed from: k */
    private cfh f22991k;
    /* renamed from: l */
    private final ikd f22992l;
    /* renamed from: m */
    private final hek f22993m;
    /* renamed from: n */
    private final heq f22994n;
    /* renamed from: o */
    private final gpn f22995o;
    /* renamed from: p */
    private final irh f22996p;
    /* renamed from: q */
    private final bfk f22997q;
    /* renamed from: r */
    private final cbu f22998r;
    /* renamed from: s */
    private final bpq f22999s;
    /* renamed from: t */
    private final ilp f23000t;
    /* renamed from: u */
    private final fer f23001u;
    /* renamed from: v */
    private final ehx f23002v;
    /* renamed from: w */
    private final eid f23003w;
    /* renamed from: x */
    private final hnh f23004x;
    /* renamed from: y */
    private final fbr f23005y;
    /* renamed from: z */
    private final ilp f23006z;

    static {
        bli.m862a("VideoIntentModule");
    }

    public dla(bfk bfk, bag bag, bah bah, cfh cfh, cbu cbu, fbn fbn, Intent intent, gyi gyi, ikd ikd, gpn gpn, hek hek, heq heq, irh irh, bpq bpq, gtl gtl, hny hny, ilp ilp, fer fer, ehx ehx, eid eid, hnh hnh, fbr fbr, ilp ilp2, BottomBarController bottomBarController, hcd hcd, ilp ilp3, bpt bpt, hnf hnf, ecd ecd, gxz gxz, asu asu, hat hat, dzh dzh, irs irs, dkb dkb, djo djo, imy imy, how how, hjf hjf, div div, ilp ilp4, kwk kwk) {
        super(bag, bah);
        this.f22997q = bfk;
        this.f22973N = cfh;
        this.f22998r = cbu;
        this.f22974O = fbn;
        this.f22975P = intent;
        this.f22992l = ikd;
        this.f22995o = gpn;
        this.f22993m = hek;
        this.f22994n = heq;
        this.f22996p = irh;
        this.f22999s = bpq;
        this.f22986f = gtl;
        this.f22978S = hny;
        this.f23002v = ehx;
        this.f23003w = eid;
        this.f23000t = ilp;
        this.f23001u = fer;
        this.f23004x = hnh;
        this.f23005y = fbr;
        this.f23006z = ilp2;
        this.f22960A = bottomBarController;
        this.f22961B = hcd;
        this.f22963D = ilp3;
        this.f22965F = ecd;
        this.f22966G = gxz;
        this.f22967H = asu;
        this.f22968I = hat;
        this.f22980U = dzh;
        this.f22969J = irs;
        this.f22970K = dkb;
        this.f22971L = djo;
        this.f22972M = imy;
        this.f22989i = how;
        this.f22976Q = div;
        this.f22977R = kwk;
        this.f22962C = new dlc(this);
        this.f22987g = new dld(this);
    }

    public final void close() {
    }

    public final fha f_() {
        return null;
    }

    /* renamed from: b */
    public final String mo2846b() {
        return null;
    }

    /* renamed from: a */
    public final void mo2844a(gos gos) {
    }

    /* renamed from: a */
    public final void mo2843a(cfh cfh, ezy ezy) {
        this.f22990j = new dli(cfh, this.f22973N.mo2757l().f14915h, this.f22973N.mo2757l(), this.f22966G);
        this.f22991k = cfh;
        HandlerThread handlerThread = new HandlerThread("VideoIntentModule.CameraHandler");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        ilb ilb = new ilb(null);
        Intent intent = this.f22975P;
        dli dli = this.f22990j;
        ikd ikd = new ikd();
        Context k = this.f22973N.mo2756k();
        fbn fbn = this.f22974O;
        hjw u = this.f22973N.mo2766u();
        gci x = this.f22973N.mo2769x();
        this.f22973N.mo2727B();
        this.f22984d = new bui(new doa(intent, dli, ikd, k, fbn, u, x, this.f22995o, this.f22980U, this.f22973N, this.f22998r, this.f22999s, this.f22991k.mo2770y(), this.f22991k.mo2762q(), this.f22970K, this.f22993m, this.f22994n, this.f22996p, this.f22997q, this.f22971L, this, this.f23000t, this.f23001u, this.f23002v, this.f23003w, this.f23005y, this.f23006z, this.f22963D, this.f22965F, this.f22967H, this.f22968I, this.f22969J, handlerThread, ilb, this.f22972M, this.f22976Q, this.f22977R));
        buh buh = this.f22984d;
        buh.mo574a(new dlv(buh));
        ((grt) Instrumentation.instance().modeSwitch().getCurrentSession()).m11410b();
        ((doa) this.f22984d.mo572a()).f13623p.mo2860b();
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
    public final void mo2961a(boolean z) {
        this.f22992l.execute(new dlf(this));
    }

    public final void m_() {
        this.f22984d.mo573a(new daz());
        this.f22989i.mo1754a(kau.f19138a);
    }

    /* renamed from: j */
    public final void mo2851j() {
        this.f22989i.mo1754a(kbg.m4744b(inc.FPS_30));
    }

    /* renamed from: k */
    public final void mo2852k() {
        this.f22964E = new ikb();
        this.f22964E.mo1879a(this.f22961B.m3023a(this.f22987g));
        dli.m1654c();
        this.f22960A.addListener(this.f22962C);
        this.f22984d.mo573a(new dbc());
        ((doa) this.f22984d.mo572a()).f13606K.mo2743a(this.f22981V, true);
        this.f22978S.m11922a(this.f22979T);
        this.f23004x.m11904a(this.f22982W);
    }

    /* renamed from: l */
    public final void mo2853l() {
        dli.m1653b();
        this.f22960A.removeListener(this.f22962C);
        this.f22984d.mo573a(new dbd());
        this.f22964E.close();
        this.f22978S.m11924b(this.f22979T);
        this.f23004x.f17947a = null;
    }
}
