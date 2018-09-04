package p000;

import android.view.Surface;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bgr */
final class bgr implements kov {
    /* renamed from: a */
    private final /* synthetic */ biw f10807a;
    /* renamed from: b */
    private final /* synthetic */ bhs f10808b;
    /* renamed from: c */
    private final /* synthetic */ bhr f10809c;
    /* renamed from: d */
    private final /* synthetic */ bhu f10810d;
    /* renamed from: e */
    private final /* synthetic */ Surface f10811e;
    /* renamed from: f */
    private final /* synthetic */ ffc f10812f;
    /* renamed from: g */
    private final /* synthetic */ ilb f10813g;
    /* renamed from: h */
    private final /* synthetic */ ilb f10814h;
    /* renamed from: i */
    private final /* synthetic */ ilp f10815i;
    /* renamed from: j */
    private final /* synthetic */ imw f10816j;
    /* renamed from: k */
    private final /* synthetic */ ilp f10817k;
    /* renamed from: l */
    private final /* synthetic */ ilb f10818l;
    /* renamed from: m */
    private final /* synthetic */ kwk f10819m;
    /* renamed from: n */
    private final /* synthetic */ bhl f10820n;
    /* renamed from: o */
    private final /* synthetic */ ilp f10821o;
    /* renamed from: p */
    private final /* synthetic */ ilp f10822p;
    /* renamed from: q */
    private final /* synthetic */ ilp f10823q;
    /* renamed from: r */
    private final /* synthetic */ iqt f10824r;
    /* renamed from: s */
    private final /* synthetic */ fiw f10825s;
    /* renamed from: t */
    private final /* synthetic */ kpw f10826t;
    /* renamed from: u */
    private final /* synthetic */ bgp f10827u;

    bgr(bgp bgp, biw biw, bhs bhs, bhr bhr, bhu bhu, Surface surface, ffc ffc, ilb ilb, ilb ilb2, ilp ilp, imw imw, ilp ilp2, ilp ilp3, ilb ilb3, kwk kwk, bhl bhl, ilp ilp4, ilp ilp5, ilp ilp6, iqt iqt, fiw fiw, kpw kpw) {
        this.f10827u = bgp;
        this.f10807a = biw;
        this.f10808b = bhs;
        this.f10809c = bhr;
        this.f10810d = bhu;
        this.f10811e = surface;
        this.f10812f = ffc;
        this.f10813g = ilb;
        this.f10814h = ilb2;
        this.f10815i = ilp;
        this.f10816j = imw;
        this.f10817k = ilp2;
        this.f10818l = ilb3;
        this.f10819m = kwk;
        this.f10820n = bhl;
        this.f10821o = ilp4;
        this.f10822p = ilp5;
        this.f10823q = ilp6;
        this.f10824r = iqt;
        this.f10825s = fiw;
        this.f10826t = kpw;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        String str = bgp.f20042a;
        String valueOf = String.valueOf(th);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 55);
        stringBuilder.append("CamcorderCaptureSession-initialization sequence fails: ");
        stringBuilder.append(valueOf);
        bli.m869c(str, stringBuilder.toString());
        this.f10826t.m17780a(th);
    }

    public final /* synthetic */ void b_(Object obj) {
        bhj bhj = (bhj) obj;
        if (bhj != null) {
            synchronized (this.f10827u.f20054m) {
                bli.m869c(bgp.f20042a, "Preview-starting task is done successfully.");
                boolean z = this.f10827u.f20056o;
                if (z) {
                    bli.m873e(bgp.f20042a, "CamcorderDevice has been closed.");
                    return;
                }
                bjr bjr;
                bhe bie;
                jri.m13153b(z ^ 1);
                jri.m13152b(this.f10807a);
                jri.m13152b(this.f10808b);
                bic bic = new bic(this.f10809c, this.f10810d, this.f10827u.f20046e, this.f10811e);
                bjl bjl = new bjl(this.f10807a, bic);
                if (this.f10827u.f20047f.mo2683b()) {
                    bjr = new bjr(this.f10827u.f20044c, this.f10807a, new bhx(this.f10827u.f20051j, bhj, this.f10811e, this.f10808b));
                } else {
                    bgp bgp = this.f10827u;
                    Object bjo = new bjo(bgp.f20046e, bgp.f20044c, this.f10807a);
                }
                bjj bjj = new bjj(this.f10807a);
                bjg bjh = new bjh(this.f10807a);
                bgw bgx = new bgx(this.f10809c, this.f10810d, this.f10827u.f20046e, this.f10812f, new fdy(), this.f10813g, this.f10814h, this.f10815i);
                if (this.f10816j.mo1887d()) {
                    bgw bgw = bgx;
                    bie = new bie(bgw, this.f10827u.f20052k, new ikp(iel.m3723e("CamcorderEx", 1), 2, TimeUnit.SECONDS), this.f10813g, this.f10814h, this.f10817k, this.f10815i, this.f10818l, (aug) this.f10819m.mo345a());
                } else {
                    bie = new bhf(bgx, new ikp(iel.m3723e("CamcorderEx", 1), 8, TimeUnit.SECONDS), this.f10813g, this.f10814h);
                }
                this.f10827u.f20053l.mo1903a(String.valueOf(bgp.f20042a).concat("#CamcorderCaptureSessionImpl"));
                Object obj2 = this.f10827u;
                obj2.f20055n = new bea(obj2, bie, obj2.f20043b, this.f10820n, obj2.f20044c, obj2.f20045d, obj2.f20047f, bjl, bjr, bjj, bjh, this.f10821o, this.f10822p, obj2.f20048g, obj2.f20049h, this.f10823q, obj2.f20050i, obj2.f20051j, bic, this.f10811e, this.f10824r, bhj, this.f10808b, this.f10807a, this.f10825s);
                this.f10827u.f20053l.mo1904b();
                this.f10826t.mo3557a(kbg.m4745c(this.f10827u.f20055n));
                return;
            }
        }
        bli.m873e(bgp.f20042a, "Preview-starting task is failed.");
    }
}
