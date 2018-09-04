package p000;

/* compiled from: PG */
/* renamed from: cxv */
public final class cxv implements kwk {
    /* renamed from: a */
    private final kwk f12822a;

    public cxv(kwk kwk) {
        this.f12822a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        cec cec = (cec) this.f12822a.mo345a();
        iut iut = iut.BACK;
        if (awl.m716d(cec.f1859c)) {
            iut = iut.FRONT;
        }
        iur b = cec.f1857a.mo1346b(iut);
        if (b == null) {
            b = cec.f1857a.mo1348c();
        }
        jri.m13139a((Object) b, (Object) "There does not appear to be a camera!");
        return (ced) ktm.m13963a(new ced(cec.f1858b, b, cec.f1857a.m10176b(b).mo1921c()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
