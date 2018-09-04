package p000;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kps */
public class kps extends knx {
    /* renamed from: a */
    private final ExecutorService f22460a;

    public kps(ExecutorService executorService) {
        this.f22460a = (ExecutorService) jri.m13152b((Object) executorService);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f22460a.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f22460a.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.f22460a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f22460a.isTerminated();
    }

    public final void shutdown() {
        this.f22460a.shutdown();
    }

    public final List shutdownNow() {
        return this.f22460a.shutdownNow();
    }
}
