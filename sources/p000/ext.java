package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: ext */
public final class ext implements kwk {
    /* renamed from: a */
    private final kwk f15721a;
    /* renamed from: b */
    private final kwk f15722b;

    private ext(kwk kwk, kwk kwk2) {
        this.f15721a = kwk;
        this.f15722b = kwk2;
    }

    /* renamed from: a */
    public static ext m10060a(kwk kwk, kwk kwk2) {
        return new ext(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f15721a;
        ikb ikb = (ikb) kwk.mo345a();
        this.f15722b.mo345a();
        return (Handler) ktm.m13963a(ijy.m3789a(ikb, "MicrovideoQSharedStartup"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
