package p000;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: dpv */
public final class dpv implements kwk {
    /* renamed from: a */
    private final kwk f14225a;
    /* renamed from: b */
    private final kwk f14226b;

    private dpv(kwk kwk, kwk kwk2) {
        this.f14225a = kwk;
        this.f14226b = kwk2;
    }

    /* renamed from: a */
    public static dpv m9240a(kwk kwk, kwk kwk2) {
        return new dpv(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (fre) ktm.m13963a(new frf((fre) this.f14225a.mo345a(), (Collection) this.f14226b.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
