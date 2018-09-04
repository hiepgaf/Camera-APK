package p000;

import android.app.NotificationManager;
import android.os.PowerManager;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import com.google.android.apps.camera.legacy.app.settings.ManagedSwitchPreference;
import com.google.android.apps.camera.prewarm.NoOpPrewarmService;
import com.google.android.apps.camera.prewarm.ProcessingBoostService;
import com.google.android.apps.camera.processing.ProcessingService;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cgn */
public final class cgn implements cgm {
    /* renamed from: a */
    public static final kwk f22650a = kwd.m14019a(kau.f19138a);
    /* renamed from: A */
    public kwk f22651A;
    /* renamed from: B */
    public kwk f22652B;
    /* renamed from: C */
    public kwk f22653C;
    /* renamed from: D */
    public kwk f22654D;
    /* renamed from: E */
    public kwk f22655E;
    /* renamed from: F */
    public kwk f22656F;
    /* renamed from: G */
    public kwk f22657G;
    /* renamed from: H */
    public kwk f22658H;
    /* renamed from: I */
    public kwk f22659I;
    /* renamed from: J */
    public kwk f22660J;
    /* renamed from: K */
    public kwk f22661K;
    /* renamed from: L */
    public kwk f22662L;
    /* renamed from: M */
    public kwk f22663M;
    /* renamed from: N */
    public kwk f22664N;
    /* renamed from: O */
    public kwk f22665O;
    /* renamed from: P */
    public bpb f22666P;
    /* renamed from: Q */
    public cch f22667Q;
    /* renamed from: R */
    public kwk f22668R;
    /* renamed from: S */
    public gow f22669S;
    /* renamed from: T */
    public kwk f22670T;
    /* renamed from: U */
    public bak f22671U;
    /* renamed from: V */
    public kwk f22672V;
    /* renamed from: W */
    public kwk f22673W;
    /* renamed from: X */
    public kwk f22674X;
    /* renamed from: Y */
    public bcg f22675Y;
    /* renamed from: Z */
    public kwk f22676Z;
    public ccd aA;
    public kwk aB;
    public kwk aC;
    public kwk aD;
    public kwk aE;
    public kwk aF;
    public kwk aG;
    public kwk aH;
    public kwk aI;
    public kwk aJ;
    public kwk aK;
    public kwk aL;
    public kwk aM;
    public kwk aN;
    public kwk aO;
    public kwk aP;
    public kwk aQ;
    public brh aR;
    public kwk aS;
    public kwk aT;
    public ccx aU;
    public gur aV;
    public kwk aW;
    public kwk aX;
    public kwk aY;
    public kwk aZ;
    public kwk aa;
    public dov ab;
    public cco ac;
    public kwk ad;
    public kwk ae;
    public kwk af;
    public kwk ag;
    public gtj ah;
    public kwk ai;
    public kwk aj;
    public gmr ak;
    public kwk al;
    public gri am;
    public kwk an;
    public gls ao;
    public kwk ap;
    public kwk aq;
    public kwk ar;
    public kwk as;
    public dow at;
    public ccm au;
    public kwk av;
    public kwk aw;
    public kwk ax;
    public cbz ay;
    public kwk az;
    /* renamed from: b */
    public cbw f22677b;
    public kwk bA;
    public kwk bB;
    public gph bC;
    public kwk bD;
    public ivi bE;
    public kwk bF;
    public kwk bG;
    public kwk bH;
    public bmj bI;
    public bpc bJ;
    public kwk bK;
    public kwk bL;
    public kwk bM;
    public kwk bN;
    public kwk bO;
    public kwk bP;
    public kwk bQ;
    public kwk bR;
    public kwk bS;
    public kwk bT;
    public gtv bU;
    public bre bV;
    public kwk bW;
    public bri bX;
    public kwk bY;
    public guq bZ;
    public ete ba;
    public kwk bb;
    public eqk bc;
    public kwk bd;
    public kwk be;
    public kwk bf;
    public gud bg;
    public kwk bh;
    public ccf bi;
    public cck bj;
    public kwk bk;
    public kwk bl;
    public kwk bm;
    public kwk bn;
    public kwk bo;
    public kwk bp;
    public hkb bq;
    public kwk br;
    public kwk bs;
    public gdq bt;
    public kwk bu;
    public kwk bv;
    public kwk bw;
    public kwk bx;
    public erg by;
    public kwk bz;
    /* renamed from: c */
    public enp f22678c;
    private kwk cA;
    private kwk cB;
    private blt cC;
    private blv cD;
    private kwk cE;
    private kwk cF;
    private irr cG;
    private bpa cH;
    private bch cI;
    private doq cJ;
    private kwk cK;
    private gll cL;
    private kwk cM;
    private gbz cN;
    private kwk cO;
    private kwk cP;
    private azu cQ;
    private azs cR;
    private kwk cS;
    private kwk cT;
    private kwk cU;
    private aym cV;
    private kwk cW;
    private kwk cX;
    private bqs cY;
    private kwk cZ;
    public kwk ca;
    private brw cb = brw.m7701a(this.f22679d);
    private bsp cc;
    private kwk cd;
    private kwk ce;
    private kwk cf;
    private kwk cg;
    private bss ch;
    private ccg ci;
    private kwk cj;
    private iuv ck;
    private kwk cl;
    private kwk cm;
    private bum cn;
    private kwk co;
    private dxr cp;
    private hjr cq;
    private kwk cr;
    private kwk cs;
    private kwk ct;
    private gcn cu;
    private kwk cv;
    private cfj cw;
    private kwk cx;
    private kwk cy;
    private kwk cz;
    /* renamed from: d */
    public kwk f22679d = kwh.m14023a(iwb.f18634a);
    private kwk dA;
    private kwk dB;
    private kwk dC;
    private cce dD;
    private kwk dE;
    private kwk dF;
    private eta dG;
    private kwk dH;
    private iua dI;
    private bpp dJ;
    private bqu dK;
    private kwk dL;
    private kwk dM;
    private kwk da;
    private kwk db;
    private kwk dc;
    private ccj dd;
    private kwk de;
    private epb df;
    private enq dg;
    private kwk dh;
    private kwk di;
    private epz dj;
    private eqo dk;
    private equ dl;
    private eqs dm;
    private eqe dn;
    /* renamed from: do */
    private ccn f22680do;
    private guc dp;
    private bvl dq;
    private kwk dr;
    private bvj ds;
    private bvq dt;
    private bvo du;
    private kwk dv;
    private buv dw;
    private gct dx;
    private gcs dy;
    private gcr dz;
    /* renamed from: e */
    public cbx f22681e;
    /* renamed from: f */
    public cby f22682f;
    /* renamed from: g */
    public iqy f22683g;
    /* renamed from: h */
    public blg f22684h;
    /* renamed from: i */
    public kwk f22685i;
    /* renamed from: j */
    public kwk f22686j;
    /* renamed from: k */
    public kwk f22687k;
    /* renamed from: l */
    public bcb f22688l;
    /* renamed from: m */
    public kwk f22689m;
    /* renamed from: n */
    public kwk f22690n;
    /* renamed from: o */
    public kwk f22691o;
    /* renamed from: p */
    public kwk f22692p;
    /* renamed from: q */
    public kwk f22693q;
    /* renamed from: r */
    public kwk f22694r;
    /* renamed from: s */
    public kwk f22695s;
    /* renamed from: t */
    public hjz f22696t;
    /* renamed from: u */
    public bmc f22697u;
    /* renamed from: v */
    public hjs f22698v;
    /* renamed from: w */
    public kwk f22699w;
    /* renamed from: x */
    public kwk f22700x;
    /* renamed from: y */
    public kwk f22701y;
    /* renamed from: z */
    public kwk f22702z;

    public cgn(cgp cgp) {
        this.f22681e = cbx.m7967a(cgp.f1949a);
        this.cc = bsp.m7717a(this.f22681e);
        this.f22682f = cby.m7970a(cgp.f1949a);
        this.cd = kwc.m14017b(cca.m7975a(this.f22682f));
        this.ce = kwh.m14023a(blf.m7508a(cgp.f1950b));
        this.cf = new cgs(this.ce);
        this.f22683g = iqy.m12398a(this.cf);
        this.f22684h = blg.m7510a(cgp.f1950b, this.f22683g);
        this.cg = kwc.m14017b(bsm.m7715a(this.cb, this.cc, this.cd, this.f22684h));
        this.ch = bss.m7721a(this.cg);
        this.f22685i = kwc.m14017b(bsr.m7719a(this.ch));
        this.f22686j = kwc.m14017b(ccc.m7977a(this.f22682f));
        this.f22687k = kwc.m14017b(bcc.f10656a);
        this.f22688l = bcb.m7254a(this.f22687k);
        this.f22689m = kwh.m14023a(bci.m7264a(cgp.f1951c));
        this.f22690n = kwh.m14023a(new bca(this.f22688l, this.f22689m));
        this.ci = ccg.m7984a(this.f22686j);
        this.cj = kwh.m14023a(ivz.f18632a);
        this.f22691o = kwh.m14023a(iwa.f18633a);
        this.f22692p = kwc.m14017b(bma.m7537a(this.f22685i));
        this.ck = iuv.m12544a(this.cj, this.f22691o, this.f22692p, this.f22683g);
        this.cl = kwc.m14017b(iuj.m12464a(this.ci, this.ck));
        this.cm = kwc.m14017b(iuq.m12509a(this.ci, this.cl, this.f22683g));
        this.f22693q = kwc.m14017b(hjp.f17909a);
        this.f22694r = kwc.m14017b(fbo.m10182a(this.cm, this.f22693q));
        this.f22695s = kwc.m14017b(bky.m7506a(cgp.f1952d, this.f22681e, this.f22693q, this.cd));
        this.f22696t = hjz.m11869a(this.f22682f);
        this.cn = bum.m7754a(this.f22696t);
        this.f22697u = bmc.m7539a(this.f22685i, this.f22693q, this.cn, this.f22695s);
        this.co = kwc.m14017b(dxu.m9521a(this.f22682f, this.f22697u));
        this.cp = dxr.m9517a(this.f22682f);
        this.f22698v = hjs.m11866a(this.f22682f);
        this.cq = hjr.m11864a(this.f22698v, this.f22682f);
        this.f22699w = kwc.m14017b(dyz.m9561a(this.f22682f, this.co, this.cp, bsv.f11242a, this.cq));
        this.f22700x = kwh.m14023a(bcd.m7257a(cgp.f1951c));
        this.f22701y = kwc.m14017b(new bms(this.ci, this.f22699w, this.f22700x, this.f22690n));
        this.f22702z = kwc.m14017b(new dot(this.f22695s, this.f22701y, this.f22693q, this.f22692p));
        this.f22651A = kwc.m14017b(cbv.m7965a(this.f22682f));
        this.cr = kwc.m14017b(new eqz(this.f22695s, this.f22693q, this.f22651A));
        this.f22652B = kwc.m14017b(new ere(this.cr, erf.f15427a));
        this.f22653C = kwc.m14017b(new bxi(this.f22695s, this.f22697u, this.f22693q, this.f22679d, this.f22685i));
        this.f22654D = kwc.m14017b(dou.f13659a);
        this.f22655E = kwc.m14017b(new byi(this.f22695s, this.f22652B, this.f22653C, this.f22654D, bsv.f11242a));
        this.cs = kwc.m14017b(new cbe(this.f22683g, this.f22692p, this.f22682f));
        this.ct = f22650a;
        this.cu = new gcn(this.ct, this.f22693q);
        this.f22656F = kwc.m14017b(new byj(this.f22694r, this.f22702z, this.f22655E, this.f22692p, this.cs, this.f22685i, this.f22654D, this.cu));
        this.cv = kwc.m14017b(new byl(this.f22656F, this.f22702z, this.f22692p));
        this.cw = new cfj(this.f22694r, this.f22692p);
        this.cx = kwc.m14017b(new gwh(this.f22682f, this.f22690n));
        this.f22657G = kwc.m14017b(gwk.f17470a);
        this.f22658H = kwc.m14017b(new gwi(this.cx, this.f22657G, this.f22684h));
        this.cy = kwc.m14017b(new gwj(this.f22658H, this.f22684h));
        this.cz = f22650a;
        this.f22677b = cgp.f1949a;
        this.f22659I = kwc.m14017b(new grm(this.f22699w));
        this.f22660J = kwc.m14017b(new gec(this.f22687k));
        this.f22661K = kwc.m14017b(new gem(this.f22684h, this.f22682f));
        this.cA = f22650a;
        this.cB = kwc.m14017b(new blq(this.cA));
        this.cC = new blt(this.f22682f, this.cB, this.f22683g);
        this.cD = new blv(bsv.f11242a);
        this.f22662L = kwc.m14017b(new blu(this.cC, this.cD, this.f22685i));
        this.f22663M = kwc.m14017b(new bxn(this.f22656F, this.f22687k));
        this.cE = kwc.m14017b(new bal(this.f22687k, this.f22689m));
        this.f22678c = cgp.f1953e;
        this.f22664N = kwc.m14017b(dyy.m9559a(this.f22682f, this.cd, this.f22699w));
        this.f22665O = kwc.m14017b(bpk.f11185a);
        this.f22666P = new bpb(this.f22665O);
        this.f22667Q = new cch(this.f22686j);
        this.f22668R = kwc.m14017b(gse.f17294a);
        this.f22669S = gow.m11278a(this.f22664N, this.f22684h);
        this.f22670T = kwc.m14017b(new dxx(this.f22669S));
        this.f22671U = new bak(this.cE);
        this.f22672V = kwc.m14017b(new isf(this.f22687k));
        this.cF = kwc.m14017b(irk.f18522a);
        this.f22673W = kwc.m14017b(irj.f18521a);
        this.cG = new irr(this.cF, this.f22673W, this.ci, this.f22699w, this.f22692p, ixy.f18663a);
        this.cH = new bpa(this.f22665O);
        this.f22674X = kwc.m14017b(new isp(this.cG, this.cF, this.cH, bmw.f11037a, this.f22672V, this.f22692p, this.f22683g));
        this.cI = new bch(this.f22687k);
        this.f22675Y = new bcg(this.cI);
        this.f22676Z = kwc.m14017b(fxf.m10854a(this.f22669S));
        this.aa = kwc.m14017b(new dyo(this.f22669S));
        this.cJ = new doq(this.f22672V, this.f22702z, this.f22694r, this.f22674X, this.f22692p);
        this.ab = new dov(this.cJ);
        this.ac = new cco(this.f22686j);
        this.ad = kwc.m14017b(new dxs(this.f22669S));
        this.ae = kwc.m14017b(new dxt(this.f22669S));
        this.cK = kwc.m14017b(epx.f15358a);
        this.af = kwc.m14017b(gth.f17316a);
        this.ag = kwc.m14017b(gtw.f17343a);
        this.ah = gtj.m11504a(this.af, this.ag);
        this.ai = kwc.m14017b(new gtt(gsk.f17299a, this.cK, this.ah));
        this.aj = new kwb();
        this.ak = new gmr(this.f22682f, this.ai);
        this.al = kwc.m14017b(new hjv(this.f22693q, this.f22685i));
        this.am = new gri(this.f22699w);
        this.an = kwc.m14017b(new gnz(this.f22681e, this.ag, this.af, gsn.f17301a));
        this.ao = new gls(gsn.f17301a, this.f22682f);
        this.cL = gll.m11166a(this.aj, this.ak, this.f22690n, this.ai, gsn.f17301a, this.al, this.am, this.an, this.ao);
        this.ap = kwc.m14017b(new glx(this.cL, this.f22699w, this.ao));
        this.aq = kwc.m14017b(gmw.f17095a);
        kwb kwb = (kwb) this.aj;
        this.aj = kwc.m14017b(new gnt(this.f22689m, this.ap, this.aq));
        kwb.m14015a(this.aj);
        this.ar = kwc.m14017b(dzf.f14769a);
        this.as = kwc.m14017b(new dyx(this.f22669S));
        this.cM = kwd.m14019a(this);
        this.at = new dow(this.cM);
        this.au = new ccm(this.f22686j);
        this.av = kwc.m14017b(bmx.f11038a);
        this.cN = new gbz(this.f22689m, this.f22682f, this.f22684h);
        this.aw = kwc.m14017b(new gca(this.cN));
        this.ax = kwc.m14017b(new dxy(this.f22669S));
        this.ay = new cbz(cgp.f1949a);
        this.az = kwc.m14017b(new dzd(this.f22669S, this.ay));
        this.aA = new ccd(this.f22686j);
        this.cO = kwc.m14017b(azi.f10565a);
        this.cP = kwc.m14017b(new azq(this.f22669S, this.cO, this.f22685i));
        this.cQ = new azu(cgp.f1954f, this.cO);
        this.cR = new azs(this.cQ, this.f22685i);
        this.cS = kwc.m14017b(azc.f10559a);
        this.cT = kwc.m14017b(new dyc(this.f22669S));
        this.cU = kwc.m14017b(new azo(this.cO, this.cP, this.cR, this.cS, this.ay, this.cT, this.f22699w, this.f22685i, this.f22671U, this.ci));
        this.cV = new aym(this.f22685i, this.cU);
        this.cW = kwf.m14021a(0, 1).m5477a(this.cV).m5476a();
        this.aB = kwc.m14017b(new ayl(this.cW, this.f22685i, this.f22671U));
        this.cX = new cgo(this);
        this.aC = kwc.m14017b(bfq.m7325a(this.cX));
        this.aD = kwc.m14017b(dyq.f14740a);
        this.aE = kwc.m14017b(new dyg(this.f22669S));
        this.aF = kwc.m14017b(dyn.m9545a(this.f22669S));
        this.aG = kwc.m14017b(dyv.m9555a(this.f22669S));
        this.aH = kwc.m14017b(dyu.m9553a(this.f22669S));
        this.aI = kwc.m14017b(new dzb(this.f22669S, this.ay));
        this.aJ = kwc.m14017b(new dza(this.f22669S));
        this.aK = kwc.m14017b(new dzc(this.f22669S));
        this.aL = kwc.m14017b(new dyr(this.f22669S));
        this.aM = kwc.m14017b(new dxv(this.f22669S, this.ay));
        this.aN = kwc.m14017b(new dxw(this.f22669S, this.ay));
        this.aO = kwc.m14017b(dyf.m9536a(this.f22669S));
        this.aP = kwc.m14017b(goj.f17160a);
        this.cY = new bqs(this.f22689m);
        this.cZ = kwc.m14017b(new brc(bqt.f11194a, this.cY));
        this.da = new cgs(this.cZ);
        this.aQ = kwc.m14017b(brf.m7692a(this.f22693q));
        this.aR = new brh(this.da, this.f22685i, this.aQ);
        this.aS = kwc.m14017b(dze.f14768a);
        this.aT = kwc.m14017b(fbs.f15852a);
        this.db = f22650a;
        this.aU = new ccx(this.db, this.f22697u);
        this.dc = f22650a;
        this.aV = new gur(this.dc, this.f22697u);
        this.aW = kwc.m14017b(dye.f14728a);
        this.dd = new ccj(this.f22686j);
        this.de = kwc.m14017b(new dyp(this.f22669S));
        this.df = new epb(this.f22682f, this.f22664N, this.dd, this.de, this.f22692p);
        this.dg = new enq(cgp.f1953e);
        this.aX = kwc.m14017b(new eoz(this.df, this.dg, this.f22689m));
        this.aY = kwc.m14017b(esc.f15442a);
        this.dh = kwc.m14017b(esb.f15441a);
        this.aZ = kwc.m14017b(new esp(this.aY, this.dh, gsk.f17299a, gsn.f17301a, this.ah, this.f22682f, eui.f15562a, this.f22689m, this.aL));
        this.di = new cgs(this.aZ);
        this.ba = new ete(this.di, this.f22697u);
        this.bb = kwc.m14017b(new dyh(this.f22669S));
        this.dj = new epz(this.cK);
        this.dk = new eqo(this.f22681e, eqg.f15383a, this.dj);
        this.dl = new equ(this.cK);
        this.dm = new eqs(this.f22681e, eqh.f15384a, this.dl);
        this.bc = new eqk(this.cK);
        this.dn = new eqe(eqf.f15382a, this.f22681e, this.ah, this.dk, this.dm, this.bc, this.f22692p, this.f22675Y);
        this.bd = kwc.m14017b(this.dn);
        this.be = kwc.m14017b(glr.f17030a);
        this.f22680do = ccn.m8002a(this.f22686j);
        this.dp = guc.m11542a(this.f22680do, this.cj);
        this.bf = kwc.m14017b(gue.m11545a(this.f22688l, this.ag, this.f22680do, this.dp));
        this.bg = new gud(this.ag, this.f22687k, this.bf);
        this.bh = kwc.m14017b(bcf.f10659a);
        this.bi = ccf.m7982a(this.f22686j);
        this.bj = new cck(this.f22686j);
        this.bk = kwc.m14017b(gog.f17159a);
        this.bl = kwc.m14017b(new aui(this.aW, this.bk, this.f22671U, hkf.f17918a));
        this.bm = kwc.m14017b(new dyd(this.f22669S, this.ay));
        this.bn = kwc.m14017b(new gen(this.f22652B, this.cr, this.f22661K));
        this.dq = new bvl(this.f22682f);
        this.dr = kwh.m14023a(bce.m7259a(this.bh, this.f22689m));
        this.ds = new bvj(this.dq, this.dr);
        this.dt = new bvq(this.f22681e, this.ag, this.f22692p);
        this.du = new bvo(this.ds, this.dt);
        this.bo = kwc.m14017b(new bvr(this.f22697u, this.du));
        this.dv = kwc.m14017b(bur.f11299a);
        this.dw = new buv(this.dv, this.f22681e, this.ai, this.bo, this.aj);
        this.bp = kwc.m14017b(new buw(this.f22697u, this.dw));
        this.bq = new hkb(cgp.f1955g, this.f22682f);
        this.dx = new gct(cgp.f1956h);
        this.dy = new gcs(cgp.f1956h);
        this.dz = new gcr(cgp.f1956h, this.f22689m);
        this.br = kwh.m14023a(new goz(this.cd, hkf.f17918a));
        this.bs = f22650a;
        this.dA = kwc.m14017b(new gdf(this.dx, this.dy, this.dz, this.br, this.bq, this.f22685i, this.f22682f, this.bs));
        this.dB = kwc.m14017b(new gcq(cgp.f1956h, this.dA));
        this.dC = new cgs(this.dB);
        this.bt = new gdq(this.dC, this.f22685i, this.f22693q);
        this.bu = kwc.m14017b(new foj(cgp.f1957i, this.f22693q));
        this.bv = kwc.m14017b(new dyk(this.f22669S));
        this.bw = kwc.m14017b(new dyj(this.f22669S));
        this.bx = kwc.m14017b(new dyi(this.f22669S));
        this.dD = new cce(this.f22686j);
        this.by = new erg(this.dD);
        this.bz = kwc.m14017b(new dym(this.f22669S));
        this.bA = kwc.m14017b(new dys(this.aS, this.f22676Z, this.aI, this.f22693q));
        this.bB = kwc.m14017b(new dyl(this.f22669S));
        this.dE = f22650a;
        this.bC = new gph(this.f22697u, this.dE);
        this.dF = kwc.m14017b(new esy(this.ai, this.ah, this.f22682f));
        this.dG = new eta(this.dF, this.f22697u);
        this.bD = kwc.m14017b(new bcr(this.f22692p, this.f22685i));
        this.dH = kwc.m14017b(new fnt(cgp.f1958j, this.f22695s, this.f22671U));
        this.dI = iua.m12462a(this.cj);
        this.bE = ivi.m12548a(this.dI, this.f22692p, this.f22683g);
        this.bF = kwc.m14017b(new fms(this.dH, this.bE));
        this.bG = kwc.m14017b(new dxq(this.f22669S));
        this.bH = kwc.m14017b(new gfg(this.f22661K, this.ay, this.f22692p));
        this.bI = bmj.m7541a(this.f22682f, this.f22689m);
        this.dJ = new bpp(this.f22682f, this.f22685i, this.bI, this.f22684h);
        this.bJ = new bpc(this.dJ);
        this.bK = kwc.m14017b(new fpt(fpu.f16341a, this.al, this.f22692p));
        this.bL = kwc.m14017b(new bwl(this.au, this.cj));
        this.bM = kwc.m14017b(new bwn(this.bL, this.au));
        this.bN = kwc.m14017b(cdg.f11703a);
        this.bO = kwc.m14017b(brg.f11220a);
        this.bP = kwc.m14017b(bro.f11231a);
        this.bQ = kwc.m14017b(new fmv(this.bE));
        this.bR = kwc.m14017b(bwm.f11364a);
        this.bS = kwc.m14017b(frt.f16470a);
        this.bT = kwc.m14017b(frs.f16469a);
        this.bU = new gtv(this.f22682f);
        this.bV = new bre(this.aJ, this.aQ, this.f22685i);
        this.bW = kwc.m14017b(new dyw(this.f22669S, this.bs));
        this.dK = new bqu(this.cZ);
        this.dL = new cgs(this.dK);
        this.bX = new bri(this.dL, this.f22685i, this.aQ);
        this.bY = kwc.m14017b(new etk(this.ba));
        this.dM = f22650a;
        this.bZ = new guq(this.dM, this.f22697u);
        this.ca = kwc.m14017b(new gdr(this.f22695s));
    }

    /* renamed from: a */
    public static cgp m16921a() {
        return new cgp();
    }

    /* renamed from: a */
    public final dpl mo3387a(fjf fjf, dof dof, fxh fxh, fyz fyz) {
        return new dpl(this, fjf, dof, fxh, fyz);
    }

    /* renamed from: a */
    public final ceo mo3386a(ceg ceg, cbh cbh, gqr gqr) {
        return new ceo(this, ceg, cbh, gqr);
    }

    /* renamed from: a */
    public final blb mo3385a(ccp ccp) {
        return new blb(this, ccp);
    }

    /* renamed from: a */
    public final dxi mo3388a(ceg ceg) {
        return new dxi(this, ceg);
    }

    /* renamed from: b */
    public final ivw m16935b() {
        return bak.m7226a(this.cE.mo345a());
    }

    /* renamed from: c */
    public final bmb m16936c() {
        return new bmb((bsn) this.f22685i.mo345a(), (hjf) this.f22693q.mo345a(), new bul(new hjy(cby.m7971b(this.f22677b))), (bkw) this.f22695s.mo345a());
    }

    /* renamed from: d */
    private final NotificationManager m16923d() {
        return cck.m7993a(this.f22686j.mo345a());
    }

    /* renamed from: a */
    public final void mo3389a(cef cef) {
        cef.f11738a = (ird) this.f22692p.mo345a();
        cef.f11739b = m16935b();
        cef.f11740c = enq.m9771a(this.f22678c);
    }

    /* renamed from: a */
    public final void mo3390a(CameraActivity cameraActivity) {
        cameraActivity.f11738a = (ird) this.f22692p.mo345a();
        cameraActivity.f11739b = m16935b();
        cameraActivity.f11740c = enq.m9771a(this.f22678c);
        cameraActivity.f20368d = (bsn) this.f22685i.mo345a();
        cameraActivity.f20369e = (bls) this.f22662L.mo345a();
        cameraActivity.f20370f = (blx) this.cB.mo345a();
    }

    /* renamed from: a */
    public final void mo3391a(CameraApp cameraApp) {
        cameraApp.f12222a = new blw((bsn) this.f22685i.mo345a(), blg.m7511a(iqy.m12399a(kbg.m4745c((iqz) this.ce.mo345a()))));
        cameraApp.f12223b = m16923d();
        bsv.m7723b();
        Executor executor = (Executor) this.f22690n.mo345a();
        kwk kwk = this.cv;
        kwk kwk2 = this.cw;
        kwk kwk3 = this.cy;
        kwk kwk4 = this.cz;
        bsn bsn = m16936c().f1307a;
        cameraApp.f12224c = new cgz(executor, kwk, kwk2, kwk3, (kbg) ktm.m13963a((kbg) kwk4.mo345a(), "Cannot return null from a non-@Nullable @Provides method"));
        cameraApp.f12225d = this.f22659I;
        this.f22685i.mo345a();
        cameraApp.f12226e = (irs) this.f22699w.mo345a();
    }

    /* renamed from: a */
    public final void mo3392a(ManagedSwitchPreference managedSwitchPreference) {
        managedSwitchPreference.f2371a = (gos) this.f22664N.mo345a();
    }

    /* renamed from: a */
    public final void mo3393a(NoOpPrewarmService noOpPrewarmService) {
        noOpPrewarmService.f2388b = (irs) this.f22699w.mo345a();
        noOpPrewarmService.f2389c = (ikq) this.f22660J.mo345a();
    }

    /* renamed from: a */
    public final void mo3394a(ProcessingBoostService processingBoostService) {
        processingBoostService.f2392a = (bxj) this.f22663M.mo345a();
        processingBoostService.f2393b = (Executor) this.f22690n.mo345a();
    }

    /* renamed from: a */
    public final void mo3395a(ProcessingService processingService) {
        processingService.f12280j = m16923d();
        processingService.f12281k = (gev) this.f22661K.mo345a();
        processingService.f12282l = (PowerManager) ktm.m13963a((PowerManager) ((ccb) this.f22686j.mo345a()).m1103a("power"), "Cannot return null from a non-@Nullable @Provides method");
        processingService.f12283m = (gh) ktm.m13963a(gh.m2547a(cby.m7971b(this.f22677b)), "Cannot return null from a non-@Nullable @Provides method");
        processingService.f12284n = (ird) this.f22692p.mo345a();
        processingService.f12285o = (ikd) this.f22689m.mo345a();
        processingService.f12286p = (ivx) this.cj.mo345a();
        processingService.f12287q = (bls) this.f22662L.mo345a();
    }
}
