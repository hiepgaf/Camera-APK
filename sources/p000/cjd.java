package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: cjd */
public final class cjd implements kwk {
    /* renamed from: a */
    private final kwk f12062a;
    /* renamed from: b */
    private final kwk f12063b;
    /* renamed from: c */
    private final kwk f12064c;

    private cjd(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f12062a = kwk;
        this.f12063b = kwk2;
        this.f12064c = kwk3;
    }

    /* renamed from: a */
    public static cjd m8244a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new cjd(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f12062a;
        kwk kwk2 = this.f12063b;
        boa boa = (boa) kwk.mo345a();
        Set set = (Set) kwk2.mo345a();
        iqz a = ((ira) this.f12064c.mo345a()).mo511a("Burst");
        return (bnn) ktm.m13963a(new bnt(new bnp(boa, set, new ikc()), a, new iqx(a, "BurstSaveBroker throughput")), "Cannot return null from a non-@Nullable @Provides method");
    }
}
