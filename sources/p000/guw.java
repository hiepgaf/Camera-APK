package p000;

/* compiled from: PG */
/* renamed from: guw */
public final class guw implements kwk {
    /* renamed from: a */
    private final kwk f17381a;
    /* renamed from: b */
    private final kwk f17382b;

    private guw(kwk kwk, kwk kwk2) {
        this.f17381a = kwk;
        this.f17382b = kwk2;
    }

    /* renamed from: a */
    public static guw m11559a(kwk kwk, kwk kwk2) {
        return new guw(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object c;
        kwk kwk = this.f17381a;
        kbg kbg = (kbg) kwk.mo345a();
        this.f17382b.mo345a();
        if (kbg.mo2084b()) {
            c = kbg.m4745c(((gup) kbg.mo2081a()).m2836a());
        } else {
            c = kau.f19138a;
        }
        return (kbg) ktm.m13963a(c, "Cannot return null from a non-@Nullable @Provides method");
    }
}
