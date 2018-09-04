package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ccz */
public final class ccz implements kwk {
    /* renamed from: a */
    private final kwk f11689a;
    /* renamed from: b */
    private final kwk f11690b;

    private ccz(kwk kwk, kwk kwk2) {
        this.f11689a = kwk;
        this.f11690b = kwk2;
    }

    /* renamed from: a */
    public static ccz m8027a(kwk kwk, kwk kwk2) {
        return new ccz(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f11689a;
        kwk kwk2 = this.f11690b;
        kwk.mo345a();
        return (Executor) ktm.m13963a(new ijx(ijy.m3789a((ikb) kwk2.mo345a(), "IrisQ")), "Cannot return null from a non-@Nullable @Provides method");
    }
}
