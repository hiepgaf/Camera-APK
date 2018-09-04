package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: fcw */
public final class fcw implements kwk {
    /* renamed from: a */
    private final kwk f15872a;
    /* renamed from: b */
    private final kwk f15873b;

    private fcw(kwk kwk, kwk kwk2) {
        this.f15872a = kwk;
        this.f15873b = kwk2;
    }

    /* renamed from: a */
    public static fcw m10207a(kwk kwk, kwk kwk2) {
        return new fcw(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ikp) ktm.m13963a(new ikp((ScheduledExecutorService) this.f15872a.mo345a(), (long) ((Integer) this.f15873b.mo345a()).intValue(), TimeUnit.SECONDS), "Cannot return null from a non-@Nullable @Provides method");
    }
}
