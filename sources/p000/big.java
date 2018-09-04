package p000;

/* compiled from: PG */
/* renamed from: big */
final class big implements aub {
    /* renamed from: a */
    private final /* synthetic */ kpk f10932a;
    /* renamed from: b */
    private final /* synthetic */ kpw f10933b;
    /* renamed from: c */
    private final /* synthetic */ asw f10934c;
    /* renamed from: d */
    private final /* synthetic */ bie f10935d;

    big(bie bie, kpk kpk, kpw kpw, asw asw) {
        this.f10935d = bie;
        this.f10932a = kpk;
        this.f10933b = kpw;
        this.f10934c = asw;
    }

    /* renamed from: a */
    public final void mo355a() {
        this.f10935d.f10923f.mo348a(Boolean.valueOf(true));
    }

    /* renamed from: b */
    public final ilp mo356b() {
        return new ilb(this.f10934c.f949a);
    }

    /* renamed from: c */
    public final kpk mo357c() {
        return this.f10932a;
    }

    /* renamed from: d */
    public final kpk mo358d() {
        return this.f10933b;
    }

    /* renamed from: e */
    public final void mo359e() {
        bie bie = this.f10935d;
        bli.m863a(bie.f10918a, "reset AF");
        bie.f10924g.mo348a(Boolean.valueOf(true));
        bie.f10920c.mo348a(fdp.m10231a());
        bie.f10921d.mo348a(fdp.m10231a());
        bli.m863a(bie.f10918a, "reset AE");
        bie.f10922e.mo348a(Integer.valueOf(0));
        bie.f10923f.mo348a(Boolean.valueOf(false));
        ((Runnable) jqk.m13102c(bie.f10926i)).run();
    }
}
