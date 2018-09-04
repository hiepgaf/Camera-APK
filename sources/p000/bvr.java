package p000;

/* compiled from: PG */
/* renamed from: bvr */
public final class bvr implements kwk {
    /* renamed from: a */
    private final kwk f11335a;
    /* renamed from: b */
    private final kwk f11336b;

    public bvr(kwk kwk, kwk kwk2) {
        this.f11335a = kwk;
        this.f11336b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object obj;
        kwk kwk = this.f11335a;
        kwk kwk2 = this.f11336b;
        if (((bmb) kwk.mo345a()).m884b()) {
            obj = (bvm) kwk2.mo345a();
        } else {
            obj = new bvd();
        }
        return (bvm) ktm.m13963a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
