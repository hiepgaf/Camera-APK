package p000;

/* compiled from: PG */
/* renamed from: buw */
public final class buw implements kwk {
    /* renamed from: a */
    private final kwk f11312a;
    /* renamed from: b */
    private final kwk f11313b;

    public buw(kwk kwk, kwk kwk2) {
        this.f11312a = kwk;
        this.f11313b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object obj;
        kwk kwk = this.f11312a;
        kwk kwk2 = this.f11313b;
        if (((bmb) kwk.mo345a()).m884b()) {
            obj = (bus) kwk2.mo345a();
        } else {
            obj = new bun();
        }
        return (bus) ktm.m13963a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
