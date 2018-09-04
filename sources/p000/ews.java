package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ews */
public final class ews implements kwk {
    /* renamed from: a */
    private final kwk f15678a;
    /* renamed from: b */
    private final kwk f15679b;
    /* renamed from: c */
    private final kwk f15680c;
    /* renamed from: d */
    private final kwk f15681d;
    /* renamed from: e */
    private final kwk f15682e;

    private ews(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f15678a = kwk;
        this.f15679b = kwk2;
        this.f15680c = kwk3;
        this.f15681d = kwk4;
        this.f15682e = kwk5;
    }

    /* renamed from: a */
    public static ews m10019a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new ews(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f15678a;
        kwk kwk2 = this.f15679b;
        kwk kwk3 = this.f15680c;
        kwk kwk4 = this.f15681d;
        ccr ccr = (ccr) kwk.mo345a();
        exd exd = (exd) kwk2.mo345a();
        Executor executor = (Executor) kwk3.mo345a();
        exf evo = new evo(ccr, exd, executor, ccr.m8018c(), (iqp) kwk4.mo345a(), (bmb) this.f15682e.mo345a());
        exd.m2184a(evo, executor);
        return (evo) ktm.m13963a(evo, "Cannot return null from a non-@Nullable @Provides method");
    }
}
