package p000;

/* compiled from: PG */
/* renamed from: fcr */
public final class fcr implements kwk {
    /* renamed from: a */
    private final kwk f15865a;
    /* renamed from: b */
    private final kwk f15866b;
    /* renamed from: c */
    private final kwk f15867c;

    private fcr(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f15865a = kwk;
        this.f15866b = kwk2;
        this.f15867c = kwk3;
    }

    /* renamed from: a */
    public static fcr m10199a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new fcr(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object obj;
        fde fde;
        kwk kwk = this.f15865a;
        kwk kwk2 = this.f15866b;
        kwk kwk3 = this.f15867c;
        hjf hjf = (hjf) kwk.mo345a();
        ivy ivy = hjf.f6267b;
        if (ivy.f7508d) {
            obj = 1;
        } else if (ivy.f7509e) {
            r0 = 1;
        } else if (hjf.m3195c()) {
            r0 = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            fde = (fde) kwk3.mo345a();
        } else {
            fde = (fde) kwk2.mo345a();
        }
        return (fde) ktm.m13963a(new fdj(fde), "Cannot return null from a non-@Nullable @Provides method");
    }
}
