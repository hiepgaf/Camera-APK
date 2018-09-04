package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: exq */
public final class exq implements kwk {
    /* renamed from: a */
    private final kwk f15711a;
    /* renamed from: b */
    private final kwk f15712b;

    private exq(kwk kwk, kwk kwk2) {
        this.f15711a = kwk;
        this.f15712b = kwk2;
    }

    /* renamed from: a */
    public static exq m10054a(kwk kwk, kwk kwk2) {
        return new exq(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f15711a;
        ikb ikb = (ikb) kwk.mo345a();
        this.f15712b.mo345a();
        return (Handler) ktm.m13963a(ijy.m3789a(ikb, "MicrovideoFrameQ"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
