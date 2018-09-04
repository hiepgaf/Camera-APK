package p000;

/* compiled from: PG */
/* renamed from: drq */
public final class drq implements fwl {
    /* renamed from: a */
    private final ilp f14315a;
    /* renamed from: b */
    private final iqz f14316b;
    /* renamed from: c */
    private final ilp f14317c = ilq.m3814a(ilq.m3817a(this.f14315a, new dta()));
    /* renamed from: d */
    private final ilp f14318d = ilq.m3814a(ilq.m3817a(this.f14315a, new drr()));

    public drq(ira ira, ilp ilp) {
        this.f14315a = ilp;
        this.f14316b = ira.mo511a("ImgCptrSwitch");
    }

    /* renamed from: a */
    public final ilp mo1170a() {
        return this.f14317c;
    }

    /* renamed from: b */
    public final ilp mo1172b() {
        return this.f14318d;
    }

    /* renamed from: a */
    public final void mo1171a(fwm fwm, fwa fwa) {
        fwl fwl = (fwl) this.f14315a.mo2860b();
        iqz iqz = this.f14316b;
        String valueOf = String.valueOf(fwl.toString());
        String str = "Running command: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        iqz.mo514b(valueOf);
        fwl.mo1171a(fwm, fwa);
    }

    public final String toString() {
        kbd b = jqk.m13098b((Object) this);
        b.m4743a().f8185b = this.f14315a;
        return b.toString();
    }
}
