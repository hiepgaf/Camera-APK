package p000;

/* compiled from: PG */
/* renamed from: bjm */
final class bjm implements kov {
    /* renamed from: a */
    private final /* synthetic */ iop f10959a;
    /* renamed from: b */
    private final /* synthetic */ kpw f10960b;
    /* renamed from: c */
    private final /* synthetic */ bjl f10961c;

    bjm(bjl bjl, iop iop, kpw kpw) {
        this.f10961c = bjl;
        this.f10959a = iop;
        this.f10960b = kpw;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        this.f10960b.m17780a(th);
    }

    public final /* synthetic */ void b_(Object obj) {
        try {
            synchronized (this.f10961c.f20092b) {
                if (this.f10961c.f20093c) {
                    return;
                }
                this.f10961c.f20091a.mo461a(this.f10959a);
                this.f10960b.mo3557a(null);
            }
        } catch (Throwable e) {
            this.f10960b.m17780a(e);
        }
    }
}
