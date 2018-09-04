package p000;

/* compiled from: PG */
/* renamed from: ejb */
public final class ejb implements kov {
    /* renamed from: a */
    private final /* synthetic */ eja f15204a;

    public ejb(eja eja) {
        this.f15204a = eja;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m873e(eja.f15197a, "Fail to connect to GoogleApiClient");
        this.f15204a.f15199c = null;
    }

    public final /* synthetic */ void b_(Object obj) {
        hjk hjk = (hjk) obj;
        bli.m869c(eja.f15197a, "Disconnecting");
        hut hut = hjk.f6271a;
        hut.f17906a.mo1830b((hus) hut);
        hut.f17906a.mo1831b(hut);
        hut.f17906a.mo1832c();
        this.f15204a.f15199c = null;
    }
}
