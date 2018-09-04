package p000;

/* compiled from: PG */
/* renamed from: evu */
public final class evu implements kwk {
    /* renamed from: a */
    private final kwk f15616a;

    private evu(kwk kwk) {
        this.f15616a = kwk;
    }

    /* renamed from: a */
    public static evu m9990a(kwk kwk) {
        return new evu(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kbg kbg = (kbg) this.f15616a.mo345a();
        if (kbg.mo2084b()) {
            return (exb) ktm.m13963a((exb) kbg.mo2081a(), "Cannot return null from a non-@Nullable @Provides method");
        }
        throw new RuntimeException("Requested audio frame store not found");
    }
}
