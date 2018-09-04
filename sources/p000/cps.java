package p000;

/* compiled from: PG */
/* renamed from: cps */
public final class cps implements kwk {
    /* renamed from: a */
    private final kwk f12495a;
    /* renamed from: b */
    private final kwk f12496b;
    /* renamed from: c */
    private final kwk f12497c;

    public cps(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f12495a = kwk;
        this.f12496b = kwk2;
        this.f12497c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object obj;
        kwk kwk = this.f12495a;
        kwk kwk2 = this.f12496b;
        kwk kwk3 = this.f12497c;
        if (((Boolean) kwk.mo345a()).booleanValue()) {
            obj = (hfz) kwk3.mo345a();
        } else {
            hfz hfz = (hfz) kwk2.mo345a();
        }
        return (hfz) ktm.m13963a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
