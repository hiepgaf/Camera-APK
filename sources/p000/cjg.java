package p000;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: cjg */
public final class cjg implements kwk {
    /* renamed from: a */
    private final kwk f12086a;
    /* renamed from: b */
    private final kwk f12087b;

    private cjg(kwk kwk, kwk kwk2) {
        this.f12086a = kwk;
        this.f12087b = kwk2;
    }

    /* renamed from: a */
    public static cjg m8250a(kwk kwk, kwk kwk2) {
        return new cjg(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ckl) ktm.m13963a(new ckl((fre) this.f12086a.mo345a(), (Collection) this.f12087b.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
