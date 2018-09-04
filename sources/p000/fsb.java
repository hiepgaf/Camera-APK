package p000;

/* compiled from: PG */
/* renamed from: fsb */
public final class fsb implements kwk {
    /* renamed from: a */
    private final kwk f16486a;
    /* renamed from: b */
    private final kwk f16487b;

    private fsb(kwk kwk, kwk kwk2) {
        this.f16486a = kwk;
        this.f16487b = kwk2;
    }

    /* renamed from: a */
    public static fsb m10724a(kwk kwk, kwk kwk2) {
        return new fsb(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f16486a;
        return (fsa) ktm.m13963a(new fsc((fuc) this.f16487b.mo345a(), (frw) kwk.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
