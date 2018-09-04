package p000;

/* compiled from: PG */
/* renamed from: fur */
public final class fur implements kwk {
    /* renamed from: a */
    private final kwk f16547a;
    /* renamed from: b */
    private final kwk f16548b;

    private fur(kwk kwk, kwk kwk2) {
        this.f16547a = kwk;
        this.f16548b = kwk2;
    }

    /* renamed from: a */
    public static fur m10785a(kwk kwk, kwk kwk2) {
        return new fur(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f16547a;
        ftx ftx = (ftx) kwk.mo345a();
        return (fuc) ktm.m13963a(new fuc(ftx, ftx, (fuh) this.f16548b.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
