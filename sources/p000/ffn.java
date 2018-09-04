package p000;

/* compiled from: PG */
/* renamed from: ffn */
public final class ffn implements kwk {
    /* renamed from: a */
    private final kwk f15953a;
    /* renamed from: b */
    private final kwk f15954b;
    /* renamed from: c */
    private final kwk f15955c;
    /* renamed from: d */
    private final kwk f15956d;
    /* renamed from: e */
    private final kwk f15957e;
    /* renamed from: f */
    private final kwk f15958f;

    private ffn(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f15953a = kwk;
        this.f15954b = kwk2;
        this.f15955c = kwk3;
        this.f15956d = kwk4;
        this.f15957e = kwk5;
        this.f15958f = kwk6;
    }

    /* renamed from: a */
    public static ffn m10297a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        return new ffn(kwk, kwk2, kwk3, kwk4, kwk5, kwk6);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f15953a;
        kwk kwk2 = this.f15954b;
        ikb ikb = (ikb) kwk.mo345a();
        ikb ikb2 = (ikb) kwk2.mo345a();
        fff fff = new fff((ira) this.f15956d.mo345a(), (ird) this.f15957e.mo345a(), (ikd) this.f15958f.mo345a(), this.f15955c);
        fff.getClass();
        ikb.mo1879a(new ffi(fff));
        fff.getClass();
        ikb2.mo1879a(new ffj(fff));
        return (fff) ktm.m13963a(fff, "Cannot return null from a non-@Nullable @Provides method");
    }
}
