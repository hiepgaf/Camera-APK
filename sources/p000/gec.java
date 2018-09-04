package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gec */
public final class gec implements kwk {
    /* renamed from: a */
    private final kwk f16840a;

    public gec(kwk kwk) {
        this.f16840a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ikq) ktm.m13963a(new ikq(new ikp((ScheduledExecutorService) this.f16840a.mo345a(), 10, TimeUnit.SECONDS)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
