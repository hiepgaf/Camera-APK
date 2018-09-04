package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: bce */
public final class bce implements kwk {
    /* renamed from: a */
    private final kwk f10657a;
    /* renamed from: b */
    private final kwk f10658b;

    private bce(kwk kwk, kwk kwk2) {
        this.f10657a = kwk;
        this.f10658b = kwk2;
    }

    /* renamed from: a */
    public static bce m7259a(kwk kwk, kwk kwk2) {
        return new bce(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f10657a;
        return (Executor) ktm.m13963a(new ikh((ikd) this.f10658b.mo345a(), (ExecutorService) kwk.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
