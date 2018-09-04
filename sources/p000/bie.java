package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: bie */
public final class bie implements bhe {
    /* renamed from: a */
    public static final String f10918a = bli.m862a("CdrAfScanner");
    /* renamed from: b */
    public final ikp f10919b;
    /* renamed from: c */
    public final iqt f10920c;
    /* renamed from: d */
    public final iqt f10921d;
    /* renamed from: e */
    public final ilp f10922e;
    /* renamed from: f */
    public final ilp f10923f;
    /* renamed from: g */
    public final iqt f10924g;
    /* renamed from: h */
    public final aug f10925h;
    /* renamed from: i */
    public Runnable f10926i;
    /* renamed from: j */
    public kpw f10927j;
    /* renamed from: k */
    public final Runnable f10928k = new bih(this);
    /* renamed from: l */
    private final bgw f10929l;
    /* renamed from: m */
    private final fcm f10930m;

    public bie(bgw bgw, fcm fcm, ikp ikp, iqt iqt, iqt iqt2, ilp ilp, ilp ilp2, iqt iqt3, aug aug) {
        this.f10929l = bgw;
        this.f10930m = fcm;
        this.f10919b = ikp;
        this.f10920c = iqt;
        this.f10921d = iqt2;
        this.f10922e = ilp;
        this.f10923f = ilp2;
        this.f10925h = aug;
        this.f10924g = iqt3;
    }

    /* renamed from: a */
    public final aub mo440a(bhj bhj, bhs bhs, boolean z, asw asw, List list, Runnable runnable) {
        this.f10919b.m12262a();
        this.f10926i = runnable;
        this.f10924g.mo348a(Boolean.valueOf(false));
        bhs.m7399a(this.f10925h);
        kpk a = this.f10929l.mo438a(bhj, bhs, z, asw.f949a, list);
        jqk.m13102c(a);
        kow.m13622a(a, new bif(this), kpq.f8410a);
        kpw d = kpw.m18056d();
        this.f10927j = d;
        return new big(this, a, d, asw);
    }
}
