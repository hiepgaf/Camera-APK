package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kpt */
public final class kpt extends kps implements kpn {
    /* renamed from: a */
    private final ScheduledExecutorService f23434a;

    public kpt(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f23434a = (ScheduledExecutorService) jri.m13152b((Object) scheduledExecutorService);
    }

    public final /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        Object a = kqb.m18060a(runnable, null);
        return new kpu(a, this.f23434a.schedule(a, j, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        Object a = kqb.m18061a(callable);
        return new kpu(a, this.f23434a.schedule(a, j, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Object kpv = new kpv(runnable);
        return new kpu(kpv, this.f23434a.scheduleAtFixedRate(kpv, j, j2, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Object kpv = new kpv(runnable);
        return new kpu(kpv, this.f23434a.scheduleWithFixedDelay(kpv, j, j2, timeUnit));
    }
}
