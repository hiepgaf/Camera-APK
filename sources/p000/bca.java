package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: bca */
public final class bca implements kwk {
    /* renamed from: a */
    private final kwk f10653a;
    /* renamed from: b */
    private final kwk f10654b;

    public bca(kwk kwk, kwk kwk2) {
        this.f10653a = kwk;
        this.f10654b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f10653a;
        return (Executor) ktm.m13963a(new ikh((ikd) this.f10654b.mo345a(), (ExecutorService) kwk.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
