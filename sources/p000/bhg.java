package p000;

/* compiled from: PG */
/* renamed from: bhg */
final class bhg implements kov {
    /* renamed from: a */
    private final /* synthetic */ kpw f10867a;
    /* renamed from: b */
    private final /* synthetic */ Runnable f10868b;
    /* renamed from: c */
    private final /* synthetic */ bhf f10869c;

    bhg(bhf bhf, kpw kpw, Runnable runnable) {
        this.f10869c = bhf;
        this.f10867a = kpw;
        this.f10868b = runnable;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bhf bhf = this.f10869c;
        Runnable runnable = this.f10868b;
        bli.m863a(bhf.f10862a, "Execute AF reset runnable");
        bhf.f10864c.mo348a(fdp.m10231a());
        bhf.f10865d.mo348a(fdp.m10231a());
        runnable.run();
    }

    public final /* synthetic */ void b_(Object obj) {
        jri.m13152b((aua) obj);
        this.f10869c.f10863b.execute(new bhh(this.f10867a));
    }
}
