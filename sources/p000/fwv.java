package p000;

/* compiled from: PG */
/* renamed from: fwv */
public final class fwv implements kwk {
    /* renamed from: a */
    private final kwk f16590a;
    /* renamed from: b */
    private final kwk f16591b;
    /* renamed from: c */
    private final kwk f16592c;

    private fwv(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f16590a = kwk;
        this.f16591b = kwk2;
        this.f16592c = kwk3;
    }

    /* renamed from: a */
    public static fwv m10838a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new fwv(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f16590a;
        return (ijk) ktm.m13963a(aqe.m583a(new fwq((ikb) this.f16591b.mo345a(), (fwl) this.f16592c.mo345a(), ((ira) kwk.mo345a()).mo511a("ImgCptrCmdReady"))), "Cannot return null from a non-@Nullable @Provides method");
    }
}
