package p000;

/* compiled from: PG */
/* renamed from: ato */
public final class ato implements kwk {
    /* renamed from: a */
    private final kwk f10217a;
    /* renamed from: b */
    private final kwk f10218b;
    /* renamed from: c */
    private final kwk f10219c;

    private ato(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f10217a = kwk;
        this.f10218b = kwk2;
        this.f10219c = kwk3;
    }

    /* renamed from: a */
    public static ato m6985a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new ato(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object obj;
        kwk kwk = this.f10217a;
        kwk kwk2 = this.f10218b;
        kwk kwk3 = this.f10219c;
        if (((ffc) kwk.mo345a()).mo1937s()) {
            obj = (fiw) kwk2.mo345a();
        } else {
            fiw fiw = (fiw) kwk3.mo345a();
        }
        return (fiw) ktm.m13963a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
