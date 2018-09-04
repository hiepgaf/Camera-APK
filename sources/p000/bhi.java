package p000;

/* compiled from: PG */
/* renamed from: bhi */
final class bhi implements aub {
    /* renamed from: a */
    private final /* synthetic */ kpk f10870a;
    /* renamed from: b */
    private final /* synthetic */ kpw f10871b;
    /* renamed from: c */
    private final /* synthetic */ Runnable f10872c;
    /* renamed from: d */
    private final /* synthetic */ asw f10873d;
    /* renamed from: e */
    private final /* synthetic */ bhf f10874e;

    bhi(bhf bhf, kpk kpk, kpw kpw, Runnable runnable, asw asw) {
        this.f10874e = bhf;
        this.f10870a = kpk;
        this.f10871b = kpw;
        this.f10872c = runnable;
        this.f10873d = asw;
    }

    /* renamed from: a */
    public final void mo355a() {
    }

    /* renamed from: b */
    public final ilp mo356b() {
        return new ilb(this.f10873d.f949a);
    }

    /* renamed from: c */
    public final kpk mo357c() {
        return this.f10870a;
    }

    /* renamed from: d */
    public final kpk mo358d() {
        return this.f10871b;
    }

    /* renamed from: e */
    public final void mo359e() {
        bhf bhf = this.f10874e;
        Runnable runnable = this.f10872c;
        bli.m863a(bhf.f10862a, "Execute AF reset runnable");
        bhf.f10864c.mo348a(fdp.m10231a());
        bhf.f10865d.mo348a(fdp.m10231a());
        runnable.run();
    }
}
