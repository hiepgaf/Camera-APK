package p000;

/* compiled from: PG */
/* renamed from: cjh */
public final class cjh implements kwk {
    /* renamed from: a */
    private final kwk f12088a;

    private cjh(kwk kwk) {
        this.f12088a = kwk;
    }

    /* renamed from: a */
    public static cjh m8252a(kwk kwk) {
        return new cjh(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        ixt a = new ixt().m4329a(new ixu((ixr) this.f12088a.mo345a()), 0.6f).m4329a(new ixp(), 0.15f).m4329a(new ixo(), 0.25f);
        jri.m13153b(a.f7530a.isEmpty() ^ 1);
        return (ixq) ktm.m13963a(new ixs(a.f7530a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
