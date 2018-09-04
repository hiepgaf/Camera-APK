package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: bcb */
public final class bcb implements kwk {
    /* renamed from: a */
    private final kwk f10655a;

    private bcb(kwk kwk) {
        this.f10655a = kwk;
    }

    /* renamed from: a */
    public static bcb m7254a(kwk kwk) {
        return new bcb(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ExecutorService) ktm.m13963a((ScheduledExecutorService) this.f10655a.mo345a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
