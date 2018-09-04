package p000;

/* compiled from: PG */
/* renamed from: iqy */
public final class iqy implements kwk {
    /* renamed from: a */
    private final kwk f18516a;

    private iqy(kwk kwk) {
        this.f18516a = kwk;
    }

    /* renamed from: a */
    public static iqy m12398a(kwk kwk) {
        return new iqy(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return iqy.m12399a((kbg) this.f18516a.mo345a());
    }

    /* renamed from: a */
    public static iqz m12399a(kbg kbg) {
        Object obj;
        if (kbg.mo2084b()) {
            obj = (iqz) kbg.mo2081a();
        } else {
            obj = new iqw("libcamera").mo509a("libcamera");
        }
        return (iqz) ktm.m13963a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
