package p000;

/* compiled from: PG */
/* renamed from: cyb */
final class cyb implements kov {
    /* renamed from: a */
    private final /* synthetic */ cxz f12834a;

    cyb(cxz cxz) {
        this.f12834a = cxz;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m874e(cxz.f20816d, "Failed to start OneCamera!", th);
        this.f12834a.m7269b();
    }

    public final /* synthetic */ void b_(Object obj) {
        bli.m871d(cxz.f20816d, "onSurfaceDrawn called; completing CaptureModeUiStartup");
        this.f12834a.f20818f.mo1904b();
        this.f12834a.m7269b();
    }
}
