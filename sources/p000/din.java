package p000;

import com.google.android.apps.camera.stats.CameraDeviceInstrumentationSession;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: din */
public final class din implements dil {
    /* renamed from: a */
    public static final String f21031a = bli.m862a("CdrOpenedFastDev");
    /* renamed from: A */
    public final hjf f21032A;
    /* renamed from: B */
    public final fbr f21033B;
    /* renamed from: C */
    public final djq f21034C;
    /* renamed from: D */
    public final ilp f21035D;
    /* renamed from: E */
    public final fer f21036E;
    /* renamed from: F */
    public final kbg f21037F;
    /* renamed from: G */
    public final gal f21038G;
    /* renamed from: H */
    public final kwk f21039H;
    /* renamed from: I */
    public final Object f21040I = new Object();
    /* renamed from: J */
    public dis f21041J = dis.NO_SESSION;
    /* renamed from: K */
    public dix f21042K;
    /* renamed from: L */
    public final gnh f21043L;
    /* renamed from: M */
    private final ilb f21044M;
    /* renamed from: N */
    private final bpq f21045N;
    /* renamed from: O */
    private final hfz f21046O;
    /* renamed from: P */
    private final gci f21047P;
    /* renamed from: Q */
    private final gxz f21048Q;
    /* renamed from: R */
    private final heo f21049R;
    /* renamed from: S */
    private final irh f21050S;
    /* renamed from: T */
    private final ipv f21051T;
    /* renamed from: U */
    private final hek f21052U;
    /* renamed from: V */
    private ikb f21053V = new ikb();
    /* renamed from: b */
    public final bez f21054b;
    /* renamed from: c */
    public final bfe f21055c;
    /* renamed from: d */
    public final ilp f21056d;
    /* renamed from: e */
    public final bbv f21057e;
    /* renamed from: f */
    public final Executor f21058f;
    /* renamed from: g */
    public final ikd f21059g;
    /* renamed from: h */
    public final iut f21060h;
    /* renamed from: i */
    public final cqm f21061i;
    /* renamed from: j */
    public final hat f21062j;
    /* renamed from: k */
    public final cqx f21063k;
    /* renamed from: l */
    public final djo f21064l;
    /* renamed from: m */
    public final dju f21065m;
    /* renamed from: n */
    public final djz f21066n;
    /* renamed from: o */
    public final dkd f21067o;
    /* renamed from: p */
    public final erk f21068p;
    /* renamed from: q */
    public final ehx f21069q;
    /* renamed from: r */
    public final eqa f21070r;
    /* renamed from: s */
    public final gsp f21071s;
    /* renamed from: t */
    public final bcv f21072t;
    /* renamed from: u */
    public final asu f21073u;
    /* renamed from: v */
    public final hks f21074v;
    /* renamed from: w */
    public final dkb f21075w;
    /* renamed from: x */
    public final inc f21076x;
    /* renamed from: y */
    public final ine f21077y;
    /* renamed from: z */
    public final iur f21078z;

    public din(ilp ilp, bpq bpq, Executor executor, hfz hfz, ikd ikd, gci gci, cqm cqm, hat hat, cqx cqx, djo djo, dju dju, dkd dkd, erk erk, ehx ehx, gxz gxz, eqa eqa, gsp gsp, bcv bcv, hek hek, hks hks, dkb dkb, irh irh, hjf hjf, fbr fbr, djq djq, fer fer, gal gal, kwk kwk, gnh gnh, bez bez, bfe bfe, ilb ilb, iut iut, djz djz, inc inc, ine ine, asu asu, heo heo, iur iur, ipv ipv, ilp ilp2, kbg kbg) {
        this.f21054b = bez;
        this.f21055c = bfe;
        this.f21044M = ilb;
        this.f21056d = ilp;
        this.f21057e = new bbv("V2CamDev", ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS);
        this.f21045N = bpq;
        this.f21058f = executor;
        this.f21046O = hfz;
        this.f21059g = ikd;
        this.f21060h = iut;
        this.f21047P = gci;
        this.f21061i = cqm;
        this.f21062j = hat;
        this.f21063k = cqx;
        this.f21064l = djo;
        this.f21065m = dju;
        this.f21066n = djz;
        this.f21067o = dkd;
        this.f21068p = erk;
        this.f21069q = ehx;
        this.f21048Q = gxz;
        this.f21070r = eqa;
        this.f21071s = gsp;
        this.f21072t = bcv;
        this.f21073u = asu;
        this.f21052U = hek;
        this.f21049R = heo;
        this.f21074v = hks;
        this.f21075w = dkb;
        this.f21076x = inc;
        this.f21077y = ine;
        this.f21078z = iur;
        this.f21050S = irh;
        this.f21051T = ipv;
        this.f21032A = hjf;
        this.f21033B = fbr;
        this.f21034C = djq;
        this.f21035D = ilp2;
        this.f21036E = fer;
        this.f21037F = kbg;
        this.f21038G = gal;
        this.f21039H = kwk;
        this.f21043L = gnh;
        this.f21053V.mo1879a(bfe);
        this.f21053V.mo1879a(this.f21057e);
    }

    public final void close() {
        synchronized (this.f21040I) {
            if (this.f21041J.equals(dis.CLOSED)) {
                return;
            }
            this.f21041J = dis.CLOSED;
            bli.m863a(f21031a, "close");
            this.f21066n.close();
            dix dix = this.f21042K;
            if (dix != null) {
                dix.close();
                this.f21042K = null;
            }
            this.f21059g.execute(new dip(this));
            this.f21053V.close();
        }
    }

    /* renamed from: a */
    public final void mo2963a(hkv hkv, boolean z) {
        synchronized (this.f21040I) {
            if (this.f21041J.equals(dis.CLOSED)) {
                bli.m873e(f21031a, "has been closed");
                return;
            }
            jri.m13143a(this.f21041J.equals(dis.NO_SESSION));
            this.f21041J = dis.CREATING_SESSION;
            kpk d = kpw.m18056d();
            CameraDeviceInstrumentationSession cameraDeviceInstrumentationSession = (CameraDeviceInstrumentationSession) Instrumentation.instance().cameraDevice().create();
            cameraDeviceInstrumentationSession.m8424b();
            this.f21050S.m4080a(this.f21078z, new diq(this, cameraDeviceInstrumentationSession, d));
            kow.m13622a(iel.m3717a(d, this.f21052U.m3096a(this.f21049R), new dio(this), kpq.f8410a), new dir(this, hkv, z), this.f21059g);
        }
    }

    /* renamed from: a */
    public final void mo2964a(boolean z) {
        this.f21044M.mo348a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final boolean mo2965a() {
        synchronized (this.f21040I) {
            dix dix = this.f21042K;
            if (dix != null) {
                boolean d = dix.m9126d();
                return d;
            }
            return false;
        }
    }

    /* renamed from: b */
    public final void mo2966b(boolean z) {
        synchronized (this.f21040I) {
            if (this.f21042K != null) {
                if (z) {
                    this.f21044M.mo348a(Boolean.valueOf(this.f21075w.m1642a(this.f21076x, this.f21077y, this.f21054b.m804a())));
                } else {
                    this.f21044M.mo348a(Boolean.FALSE);
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo2967b() {
        synchronized (this.f21040I) {
            dix dix = this.f21042K;
            if (dix != null) {
                boolean e = dix.m9127e();
                return e;
            }
            return false;
        }
    }

    /* renamed from: c */
    public final void mo2968c() {
        synchronized (this.f21040I) {
            dix dix = this.f21042K;
            if (dix != null) {
                ikd.m12259a();
                synchronized (dix.f13471l) {
                    if (dix.f13479t.equals(djn.STARTING_RECORDING)) {
                    } else {
                        if (dix.f13479t == djn.RECORDING) {
                            dix.m9130h();
                        } else if (dix.f13479t == djn.NO_RECORDING) {
                            synchronized (dix.f13471l) {
                                if (dix.f13474o) {
                                    dix.f13474o = false;
                                } else {
                                    dix.f13479t = djn.STARTING_RECORDING;
                                    bli.m863a(dix.f13456a, "startRecording");
                                    dix.f13465f.mo1700b();
                                    dix.f13464e.mo1445c();
                                    dix.f13468i.m9149a();
                                    dix.f13469j.mo1162b();
                                    hkv hkv = dix.f13467h;
                                    hkv.mo1157a(false);
                                    hkv.f6320f.m2909b();
                                    hkv.f6318d.mo1565z();
                                    hkv.f6315a.mo1661a(true);
                                    eiu eiu = hkv.f6321g.f14886C;
                                    ikd.m12259a();
                                    eiu.f3644a.setVisibility(8);
                                    dix.f13462c.execute(new djg(dix));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo2969d() {
        synchronized (this.f21040I) {
            dix dix = this.f21042K;
            if (dix != null) {
                ikd.m12259a();
                synchronized (dix.f13471l) {
                    hkk hkk = dix.f13476q;
                    if (hkk != null) {
                        bli.m863a(hkk.f6290a, "onSnapshotButtonClicked");
                        ikd.m12259a();
                        synchronized (hkk.f6296g) {
                            if (hkk.f6299j == go.bz || hkk.f6299j == go.bA) {
                                hkk.f6294e.m3241d(false);
                                jri.m13152b(hkk.f6291b);
                                bjv l = hkk.f6291b.mo2678l();
                                kow.m13622a(l.f1223a, new hkp(hkk), hkk.f6292c);
                                kow.m13622a(l.f1224b, new hkq(hkk), hkk.f6292c);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo2970e() {
        synchronized (this.f21040I) {
            dix dix = this.f21042K;
            if (dix != null) {
                synchronized (dix.f13471l) {
                    dix.f13474o = true;
                }
            }
        }
    }
}
