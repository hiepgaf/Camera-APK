package p000;

/* compiled from: PG */
/* renamed from: atr */
public final class atr implements kwk {
    /* renamed from: a */
    private final kwk f10222a;
    /* renamed from: b */
    private final kwk f10223b;
    /* renamed from: c */
    private final kwk f10224c;

    private atr(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f10222a = kwk;
        this.f10223b = kwk2;
        this.f10224c = kwk3;
    }

    /* renamed from: a */
    public static atr m6991a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new atr(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object obj;
        kwk kwk = this.f10222a;
        kwk kwk2 = this.f10223b;
        kwk kwk3 = this.f10224c;
        if (((ffc) kwk.mo345a()).mo1937s()) {
            asn asn = (asn) kwk3.mo345a();
        } else {
            obj = (asn) kwk2.mo345a();
        }
        return (asn) ktm.m13963a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
