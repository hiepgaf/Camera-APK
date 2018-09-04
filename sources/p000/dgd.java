package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;
import java.io.File;

/* compiled from: PG */
/* renamed from: dgd */
public final class dgd implements kwk {
    /* renamed from: a */
    private final kwk f13113a;
    /* renamed from: b */
    private final kwk f13114b;
    /* renamed from: c */
    private final kwk f13115c;
    /* renamed from: d */
    private final kwk f13116d;
    /* renamed from: e */
    private final kwk f13117e;
    /* renamed from: f */
    private final kwk f13118f;
    /* renamed from: g */
    private final kwk f13119g;
    /* renamed from: h */
    private final kwk f13120h;
    /* renamed from: i */
    private final kwk f13121i;
    /* renamed from: j */
    private final kwk f13122j;
    /* renamed from: k */
    private final kwk f13123k;
    /* renamed from: l */
    private final kwk f13124l;
    /* renamed from: m */
    private final kwk f13125m;
    /* renamed from: n */
    private final kwk f13126n;
    /* renamed from: o */
    private final kwk f13127o;
    /* renamed from: p */
    private final kwk f13128p;
    /* renamed from: q */
    private final kwk f13129q;
    /* renamed from: r */
    private final kwk f13130r;
    /* renamed from: s */
    private final kwk f13131s;
    /* renamed from: t */
    private final kwk f13132t;
    /* renamed from: u */
    private final kwk f13133u;
    /* renamed from: v */
    private final kwk f13134v;
    /* renamed from: w */
    private final kwk f13135w;

    public dgd(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10, kwk kwk11, kwk kwk12, kwk kwk13, kwk kwk14, kwk kwk15, kwk kwk16, kwk kwk17, kwk kwk18, kwk kwk19, kwk kwk20, kwk kwk21, kwk kwk22, kwk kwk23) {
        this.f13113a = kwk;
        this.f13114b = kwk2;
        this.f13115c = kwk3;
        this.f13116d = kwk4;
        this.f13117e = kwk5;
        this.f13118f = kwk6;
        this.f13119g = kwk7;
        this.f13120h = kwk8;
        this.f13121i = kwk9;
        this.f13122j = kwk10;
        this.f13123k = kwk11;
        this.f13124l = kwk12;
        this.f13125m = kwk13;
        this.f13126n = kwk14;
        this.f13127o = kwk15;
        this.f13128p = kwk16;
        this.f13129q = kwk17;
        this.f13130r = kwk18;
        this.f13131s = kwk19;
        this.f13132t = kwk20;
        this.f13133u = kwk21;
        this.f13134v = kwk22;
        this.f13135w = kwk23;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return new dgb((bag) this.f13113a.mo345a(), (bah) this.f13114b.mo345a(), (gtf) this.f13115c.mo345a(), (gpn) this.f13116d.mo345a(), (bkw) this.f13117e.mo345a(), (gey) this.f13118f.mo345a(), (gev) this.f13119g.mo345a(), (ilp) this.f13120h.mo345a(), (aws) this.f13121i.mo345a(), (ikd) this.f13122j.mo345a(), (hny) this.f13123k.mo345a(), (ehp) this.f13124l.mo345a(), (gtl) this.f13125m.mo345a(), (BottomBarController) this.f13126n.mo345a(), (hcd) this.f13127o.mo345a(), (irs) this.f13128p.mo345a(), (bvm) this.f13129q.mo345a(), (bus) this.f13130r.mo345a(), ((Boolean) this.f13131s.mo345a()).booleanValue(), (gmn) this.f13132t.mo345a(), (gnu) this.f13133u.mo345a(), (gci) this.f13134v.mo345a(), (ilp) this.f13135w.mo345a());
    }

    /* renamed from: a */
    public static boolean m9046a(erj erj, err err) {
        File file = new File(err.mo1033g().f4154g);
        boolean e = jxr.m4678a().mo2066e(file);
        if (!e && file.isDirectory()) {
            for (File e2 : file.listFiles()) {
                e = jxr.m4678a().mo2066e(e2);
                if (e) {
                    break;
                }
            }
        }
        erj.f4128n = e;
        return e;
    }
}
