package p000;

import android.app.ActionBar;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.stats.CameraActivitySession;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: cgg */
public final class cgg implements kwk {
    /* renamed from: A */
    private final kwk f11830A;
    /* renamed from: B */
    private final kwk f11831B;
    /* renamed from: C */
    private final kwk f11832C;
    /* renamed from: D */
    private final kwk f11833D;
    /* renamed from: E */
    private final kwk f11834E;
    /* renamed from: F */
    private final kwk f11835F;
    /* renamed from: G */
    private final kwk f11836G;
    /* renamed from: H */
    private final kwk f11837H;
    /* renamed from: I */
    private final kwk f11838I;
    /* renamed from: J */
    private final kwk f11839J;
    /* renamed from: K */
    private final kwk f11840K;
    /* renamed from: L */
    private final kwk f11841L;
    /* renamed from: M */
    private final kwk f11842M;
    /* renamed from: N */
    private final kwk f11843N;
    /* renamed from: O */
    private final kwk f11844O;
    /* renamed from: P */
    private final kwk f11845P;
    /* renamed from: Q */
    private final kwk f11846Q;
    /* renamed from: R */
    private final kwk f11847R;
    /* renamed from: S */
    private final kwk f11848S;
    /* renamed from: T */
    private final kwk f11849T;
    /* renamed from: U */
    private final kwk f11850U;
    /* renamed from: V */
    private final kwk f11851V;
    /* renamed from: W */
    private final kwk f11852W;
    /* renamed from: X */
    private final kwk f11853X;
    /* renamed from: Y */
    private final kwk f11854Y;
    /* renamed from: Z */
    private final kwk f11855Z;
    /* renamed from: a */
    private final kwk f11856a;
    private final kwk aA;
    private final kwk aB;
    private final kwk aC;
    private final kwk aD;
    private final kwk aE;
    private final kwk aF;
    private final kwk aG;
    private final kwk aH;
    private final kwk aI;
    private final kwk aJ;
    private final kwk aa;
    private final kwk ab;
    private final kwk ac;
    private final kwk ad;
    private final kwk ae;
    private final kwk af;
    private final kwk ag;
    private final kwk ah;
    private final kwk ai;
    private final kwk aj;
    private final kwk ak;
    private final kwk al;
    private final kwk am;
    private final kwk an;
    private final kwk ao;
    private final kwk ap;
    private final kwk aq;
    private final kwk ar;
    private final kwk as;
    private final kwk at;
    private final kwk au;
    private final kwk av;
    private final kwk aw;
    private final kwk ax;
    private final kwk ay;
    private final kwk az;
    /* renamed from: b */
    private final kwk f11857b;
    /* renamed from: c */
    private final kwk f11858c;
    /* renamed from: d */
    private final kwk f11859d;
    /* renamed from: e */
    private final kwk f11860e;
    /* renamed from: f */
    private final kwk f11861f;
    /* renamed from: g */
    private final kwk f11862g;
    /* renamed from: h */
    private final kwk f11863h;
    /* renamed from: i */
    private final kwk f11864i;
    /* renamed from: j */
    private final kwk f11865j;
    /* renamed from: k */
    private final kwk f11866k;
    /* renamed from: l */
    private final kwk f11867l;
    /* renamed from: m */
    private final kwk f11868m;
    /* renamed from: n */
    private final kwk f11869n;
    /* renamed from: o */
    private final kwk f11870o;
    /* renamed from: p */
    private final kwk f11871p;
    /* renamed from: q */
    private final kwk f11872q;
    /* renamed from: r */
    private final kwk f11873r;
    /* renamed from: s */
    private final kwk f11874s;
    /* renamed from: t */
    private final kwk f11875t;
    /* renamed from: u */
    private final kwk f11876u;
    /* renamed from: v */
    private final kwk f11877v;
    /* renamed from: w */
    private final kwk f11878w;
    /* renamed from: x */
    private final kwk f11879x;
    /* renamed from: y */
    private final kwk f11880y;
    /* renamed from: z */
    private final kwk f11881z;

    public cgg(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10, kwk kwk11, kwk kwk12, kwk kwk13, kwk kwk14, kwk kwk15, kwk kwk16, kwk kwk17, kwk kwk18, kwk kwk19, kwk kwk20, kwk kwk21, kwk kwk22, kwk kwk23, kwk kwk24, kwk kwk25, kwk kwk26, kwk kwk27, kwk kwk28, kwk kwk29, kwk kwk30, kwk kwk31, kwk kwk32, kwk kwk33, kwk kwk34, kwk kwk35, kwk kwk36, kwk kwk37, kwk kwk38, kwk kwk39, kwk kwk40, kwk kwk41, kwk kwk42, kwk kwk43, kwk kwk44, kwk kwk45, kwk kwk46, kwk kwk47, kwk kwk48, kwk kwk49, kwk kwk50, kwk kwk51, kwk kwk52, kwk kwk53, kwk kwk54, kwk kwk55, kwk kwk56, kwk kwk57, kwk kwk58, kwk kwk59, kwk kwk60, kwk kwk61, kwk kwk62, kwk kwk63, kwk kwk64, kwk kwk65, kwk kwk66, kwk kwk67, kwk kwk68, kwk kwk69, kwk kwk70, kwk kwk71, kwk kwk72, kwk kwk73, kwk kwk74, kwk kwk75, kwk kwk76, kwk kwk77, kwk kwk78, kwk kwk79, kwk kwk80, kwk kwk81, kwk kwk82, kwk kwk83, kwk kwk84, kwk kwk85, kwk kwk86, kwk kwk87, kwk kwk88) {
        this.f11856a = kwk;
        this.f11857b = kwk2;
        this.f11858c = kwk3;
        this.f11859d = kwk4;
        this.f11860e = kwk5;
        this.f11861f = kwk6;
        this.f11862g = kwk7;
        this.f11863h = kwk8;
        this.f11864i = kwk9;
        this.f11865j = kwk10;
        this.f11866k = kwk11;
        this.f11867l = kwk12;
        this.f11868m = kwk13;
        this.f11869n = kwk14;
        this.f11870o = kwk15;
        this.f11871p = kwk16;
        this.f11872q = kwk17;
        this.f11873r = kwk18;
        this.f11874s = kwk19;
        this.f11875t = kwk20;
        this.f11876u = kwk21;
        this.f11877v = kwk22;
        this.f11878w = kwk23;
        this.f11879x = kwk24;
        this.f11880y = kwk25;
        this.f11881z = kwk26;
        this.f11830A = kwk27;
        this.f11831B = kwk28;
        this.f11832C = kwk29;
        this.f11833D = kwk30;
        this.f11834E = kwk31;
        this.f11835F = kwk32;
        this.f11836G = kwk33;
        this.f11837H = kwk34;
        this.f11838I = kwk35;
        this.f11839J = kwk36;
        this.f11840K = kwk37;
        this.f11841L = kwk38;
        this.f11842M = kwk39;
        this.f11843N = kwk40;
        this.f11844O = kwk41;
        this.f11845P = kwk42;
        this.f11846Q = kwk43;
        this.f11847R = kwk44;
        this.f11848S = kwk45;
        this.f11849T = kwk46;
        this.f11850U = kwk47;
        this.f11851V = kwk48;
        this.f11852W = kwk49;
        this.f11853X = kwk50;
        this.f11854Y = kwk51;
        this.f11855Z = kwk52;
        this.aa = kwk53;
        this.ab = kwk54;
        this.ac = kwk55;
        this.ad = kwk56;
        this.ae = kwk57;
        this.af = kwk58;
        this.ag = kwk59;
        this.ah = kwk60;
        this.ai = kwk61;
        this.aj = kwk62;
        this.ak = kwk63;
        this.al = kwk64;
        this.am = kwk65;
        this.an = kwk66;
        this.ao = kwk67;
        this.ap = kwk68;
        this.aq = kwk69;
        this.ar = kwk70;
        this.as = kwk71;
        this.at = kwk72;
        this.au = kwk73;
        this.av = kwk74;
        this.aw = kwk75;
        this.ax = kwk76;
        this.ay = kwk77;
        this.az = kwk78;
        this.aA = kwk79;
        this.aB = kwk80;
        this.aC = kwk81;
        this.aD = kwk82;
        this.aE = kwk83;
        this.aF = kwk84;
        this.aG = kwk85;
        this.aH = kwk86;
        this.aI = kwk87;
        this.aJ = kwk88;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f11856a;
        kwk kwk2 = this.f11857b;
        kwk kwk3 = this.f11858c;
        kwk kwk4 = this.f11859d;
        kwk kwk5 = this.f11860e;
        kwk kwk6 = this.f11861f;
        kwk kwk7 = this.f11862g;
        kwk kwk8 = this.f11863h;
        kwk kwk9 = this.f11864i;
        kwk kwk10 = this.f11865j;
        kwk kwk11 = this.f11866k;
        kwk kwk12 = this.f11867l;
        kwk kwk13 = this.f11868m;
        kwk kwk14 = this.f11869n;
        kwk kwk15 = this.f11870o;
        kwk kwk16 = this.f11871p;
        kwk kwk17 = this.f11872q;
        kwk kwk18 = this.f11873r;
        kwk kwk19 = this.f11874s;
        kwk kwk20 = this.f11875t;
        kwk kwk21 = this.f11876u;
        kwk kwk22 = this.f11877v;
        kwk kwk23 = this.f11878w;
        kwk kwk24 = this.f11879x;
        kwk kwk25 = this.f11880y;
        kwk kwk26 = this.f11881z;
        kwk kwk27 = this.f11830A;
        kwk kwk28 = this.f11831B;
        kwk kwk29 = this.f11832C;
        kwk kwk30 = this.f11833D;
        kwk kwk31 = this.f11834E;
        kwk kwk32 = this.f11835F;
        kwk kwk33 = this.f11836G;
        kwk kwk34 = this.f11837H;
        kwk kwk35 = this.f11838I;
        kwk kwk36 = this.f11839J;
        kwk kwk37 = this.f11840K;
        kwk kwk38 = this.f11841L;
        kwk kwk39 = this.f11842M;
        kwk kwk40 = this.f11843N;
        kwk kwk41 = this.f11844O;
        kwk kwk42 = this.f11845P;
        kwk kwk43 = this.f11846Q;
        kwk kwk44 = this.f11847R;
        kwk kwk45 = this.f11848S;
        kwk kwk46 = this.f11849T;
        kwk kwk47 = this.f11850U;
        kwk kwk48 = this.f11851V;
        kwk kwk49 = this.f11852W;
        kwk kwk50 = this.f11853X;
        kwk kwk51 = this.f11854Y;
        kwk kwk52 = this.f11855Z;
        kwk kwk53 = this.aa;
        kwk kwk54 = this.ab;
        kwk kwk55 = this.ac;
        kwk kwk56 = this.ad;
        kwk kwk57 = this.ae;
        kwk kwk58 = this.af;
        kwk kwk59 = this.ag;
        kwk kwk60 = this.ah;
        kwk kwk61 = this.ai;
        kwk kwk62 = this.aj;
        kwk kwk63 = this.ak;
        kwk kwk64 = this.al;
        kwk kwk65 = this.am;
        kwk kwk66 = this.an;
        kwk kwk67 = this.ao;
        return new cfk((Context) kwk.mo345a(), (Context) kwk2.mo345a(), (Resources) kwk3.mo345a(), (Window) kwk4.mo345a(), (ContentResolver) kwk5.mo345a(), (LayoutInflater) kwk6.mo345a(), (Handler) kwk7.mo345a(), (awr) kwk8.mo345a(), (hkg) kwk9.mo345a(), (enr) kwk10.mo345a(), (Activity) kwk11.mo345a(), (aws) kwk12.mo345a(), (awi) kwk13.mo345a(), (ikd) kwk14.mo345a(), (WindowManager) kwk15.mo345a(), (cvy) kwk16.mo345a(), (fhc) kwk17.mo345a(), (hat) kwk18.mo345a(), ((Boolean) kwk19.mo345a()).booleanValue(), (gci) kwk20.mo345a(), (fbn) kwk21.mo345a(), (chz) kwk22.mo345a(), (cgu) kwk23.mo345a(), (erh) kwk24.mo345a(), (irh) kwk25.mo345a(), (hjw) kwk26.mo345a(), (gos) kwk27.mo345a(), (gor) kwk28.mo345a(), (gsp) kwk29.mo345a(), (gyi) kwk30.mo345a(), (gln) kwk31.mo345a(), (glj) kwk32.mo345a(), (bag) kwk33.mo345a(), (hek) kwk34.mo345a(), (het) kwk35.mo345a(), (ActionBar) kwk36.mo345a(), kwc.m14016a(kwk37), (dzg) kwk38.mo345a(), (bpq) kwk39.mo345a(), (ScheduledExecutorService) kwk40.mo345a(), (gst) kwk41.mo345a(), (Executor) kwk42.mo345a(), (bfk) kwk43.mo345a(), (gvr) kwk44.mo345a(), (hjf) kwk45.mo345a(), (awm) kwk46.mo345a(), (gev) kwk47.mo345a(), (cqb) kwk48.mo345a(), (cqm) kwk49.mo345a(), (cqx) kwk50.mo345a(), kwk51, (cbu) kwk52.mo345a(), (cbr) kwk53.mo345a(), (ird) kwk54.mo345a(), (CameraActivitySession) kwk55.mo345a(), kwk56, kwk57, (edb) kwk58.mo345a(), (edf) kwk59.mo345a(), (edo) kwk60.mo345a(), (ecd) kwk61.mo345a(), (ehu) kwk62.mo345a(), (gwo) kwk63.mo345a(), (hhj) kwk64.mo345a(), (cwd) kwk65.mo345a(), (Intent) kwk66.mo345a(), (BottomBarController) kwk67.mo345a(), this.ap, (bmb) this.aq.mo345a(), (ebq) this.ar.mo345a(), (kbg) this.as.mo345a(), (hny) this.at.mo345a(), (irs) this.au.mo345a(), (bkw) this.av.mo345a(), (kbg) this.aw.mo345a(), (gyz) this.ax.mo345a(), (gwp) this.ay.mo345a(), (ebm) this.az.mo345a(), (gal) this.aA.mo345a(), (gzy) this.aB.mo345a(), (ilp) this.aC.mo345a(), (ilp) this.aD.mo345a(), (ilp) this.aE.mo345a(), (cdq) this.aF.mo345a(), (kbg) this.aG.mo345a(), (gnh) this.aH.mo345a(), (gyl) this.aI.mo345a(), (kbg) this.aJ.mo345a());
    }
}
