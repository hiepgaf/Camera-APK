package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: ezb */
public final class ezb implements kwk {
    /* renamed from: a */
    private final kwk f15792a;
    /* renamed from: b */
    private final kwk f15793b;

    private ezb(kwk kwk, kwk kwk2) {
        this.f15792a = kwk;
        this.f15793b = kwk2;
    }

    /* renamed from: a */
    public static ezb m10105a(kwk kwk, kwk kwk2) {
        return new ezb(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f15792a;
        exk exk = (exk) kwk.mo345a();
        this.f15793b.mo345a();
        return (List) ktm.m13963a(eza.m2197a(exk), "Cannot return null from a non-@Nullable @Provides method");
    }
}
