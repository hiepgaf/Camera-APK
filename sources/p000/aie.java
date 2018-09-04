package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: aie */
public final class aie implements ExecutorService {
    /* renamed from: a */
    public static final long f487a = TimeUnit.SECONDS.toMillis(10);
    /* renamed from: b */
    private static volatile int f488b;
    /* renamed from: c */
    private final ExecutorService f489c;

    public aie(ExecutorService executorService) {
        this.f489c = executorService;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f489c.awaitTermination(j, timeUnit);
    }

    /* renamed from: a */
    public static int m300a() {
        if (f488b == 0) {
            f488b = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f488b;
    }

    public final void execute(Runnable runnable) {
        this.f489c.execute(runnable);
    }

    public final List invokeAll(Collection collection) {
        return this.f489c.invokeAll(collection);
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f489c.invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection) {
        return this.f489c.invokeAny(collection);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f489c.invokeAny(collection, j, timeUnit);
    }

    public final boolean isShutdown() {
        return this.f489c.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f489c.isTerminated();
    }

    /* renamed from: b */
    public static aie m301b() {
        int i;
        if (aie.m300a() >= 4) {
            i = 2;
        } else {
            i = 1;
        }
        return new aie(new ThreadPoolExecutor(0, i, f487a, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new aif("animation", aih.f496b, true)));
    }

    /* renamed from: c */
    public static aie m302c() {
        aih aih = aih.f496b;
        return new aie(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new aif("disk-cache", aih, true)));
    }

    public final void shutdown() {
        this.f489c.shutdown();
    }

    public final List shutdownNow() {
        return this.f489c.shutdownNow();
    }

    public final Future submit(Runnable runnable) {
        return this.f489c.submit(runnable);
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.f489c.submit(runnable, obj);
    }

    public final Future submit(Callable callable) {
        return this.f489c.submit(callable);
    }

    public final String toString() {
        return this.f489c.toString();
    }
}
