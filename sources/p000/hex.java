package p000;

import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: hex */
public final class hex implements kwk {
    /* renamed from: a */
    private final hev f17734a;
    /* renamed from: b */
    private final kwk f17735b;
    /* renamed from: c */
    private final kwk f17736c;

    public hex(hev hev, kwk kwk, kwk kwk2) {
        this.f17734a = hev;
        this.f17735b = kwk;
        this.f17736c = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        hev hev = this.f17734a;
        kwk kwk = this.f17735b;
        ikd ikd = (ikd) kwk.mo345a();
        ird ird = (ird) this.f17736c.mo345a();
        Future d = kpw.m18056d();
        ikd.m12261a(new hew(hev, ird, d));
        return (hes) ktm.m13963a((hes) kow.m13625c(d), "Cannot return null from a non-@Nullable @Provides method");
    }
}
