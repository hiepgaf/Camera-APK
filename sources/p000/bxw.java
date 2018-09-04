package p000;

/* compiled from: PG */
/* renamed from: bxw */
public final class bxw implements kwk {
    /* renamed from: a */
    private final kwk f11430a;
    /* renamed from: b */
    private final kwk f11431b;

    private bxw(kwk kwk, kwk kwk2) {
        this.f11430a = kwk;
        this.f11431b = kwk2;
    }

    /* renamed from: a */
    public static bxw m7860a(kwk kwk, kwk kwk2) {
        return new bxw(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object c;
        kwk kwk = this.f11430a;
        if (((Boolean) ((ilp) this.f11431b.mo345a()).mo2860b()).booleanValue()) {
            c = kbg.m4745c((fqu) kwk.mo345a());
        } else {
            c = kau.f19138a;
        }
        return (kbg) ktm.m13963a(c, "Cannot return null from a non-@Nullable @Provides method");
    }
}
