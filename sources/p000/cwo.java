package p000;

/* compiled from: PG */
/* renamed from: cwo */
final class cwo implements kov {
    /* renamed from: a */
    private final /* synthetic */ cwj f12737a;

    cwo(cwj cwj) {
        this.f12737a = cwj;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        this.f12737a.f12705a.mo513a("Cannot start burst", th);
        synchronized (this.f12737a.f12707c) {
            this.f12737a.m8843d();
        }
        ((chy) this.f12737a.f12714j.mo345a()).h_();
    }

    public final /* synthetic */ void b_(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            this.f12737a.f12705a.mo514b("Burst was not started.");
            synchronized (this.f12737a.f12707c) {
                this.f12737a.m8843d();
            }
        }
    }
}
