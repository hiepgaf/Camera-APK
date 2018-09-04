package p000;

/* compiled from: PG */
/* renamed from: fad */
public final class fad implements kwk {
    /* renamed from: a */
    private final kwk f15823a;

    private fad(kwk kwk) {
        this.f15823a = kwk;
    }

    /* renamed from: a */
    public static fad m10146a(kwk kwk) {
        return new fad(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object fjt;
        kbg kbg = (kbg) this.f15823a.mo345a();
        if (kbg.mo2084b()) {
            fjt fjt2 = (fjt) kbg.mo2081a();
        } else {
            fjt = new fjt();
        }
        return (fjt) ktm.m13963a(fjt, "Cannot return null from a non-@Nullable @Provides method");
    }
}
