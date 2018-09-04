package p000;

/* compiled from: PG */
/* renamed from: drw */
public final class drw implements fwl {
    /* renamed from: a */
    private final fyt f14336a;
    /* renamed from: b */
    private final fwl f14337b;
    /* renamed from: c */
    private final iqz f14338c;
    /* renamed from: d */
    private final ilp f14339d;

    public drw(fyt fyt, ira ira, dsh dsh, bxg bxg) {
        this.f14336a = fyt;
        this.f14338c = ira.mo511a("GoudaCptrCmd");
        fwl a = dsh.f3264c.m1671a(bxg, dsh.f3265d, dsh.f3267f.m2275a(bxg.f1694i));
        ira ira2 = dsh.f3262a;
        ilp ilp = dsh.f3263b;
        fwl fwl = dsh.f3266e;
        this.f14337b = new drq(ira2, new drk(ilp, a, fwl, a, fwl, a));
        ilp b = ilq.m3832b(fyt.mo1430c(), Integer.valueOf(1));
        this.f14339d = ilq.m3834b(this.f14337b.mo1170a(), b);
    }

    /* renamed from: a */
    public final ilp mo1170a() {
        return this.f14339d;
    }

    /* renamed from: b */
    public final ilp mo1172b() {
        return this.f14337b.mo1172b();
    }

    /* renamed from: a */
    public final void mo1171a(fwm fwm, fwa fwa) {
        iqo d = this.f14336a.mo1431d();
        iqz iqz = this.f14338c;
        String valueOf = String.valueOf(this.f14336a.mo1430c().mo2860b());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
        stringBuilder.append("Remaining tickets: ");
        stringBuilder.append(valueOf);
        iqz.mo514b(stringBuilder.toString());
        if (d == null) {
            this.f14338c.mo520f("Ticket not available");
            return;
        }
        fwa.f4752a.f4451g.mo1879a(d);
        this.f14337b.mo1171a(fwm, fwa);
    }
}
