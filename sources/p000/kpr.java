package p000;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kpr */
public final class kpr extends knx {
    /* renamed from: a */
    private final Object f22457a = new Object();
    /* renamed from: b */
    private int f22458b = 0;
    /* renamed from: c */
    private boolean f22459c = false;

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        long toNanos = timeUnit.toNanos(j);
        synchronized (this.f22457a) {
            while (true) {
                if (this.f22459c && this.f22458b == 0) {
                    return true;
                } else if (toNanos <= 0) {
                    return false;
                } else {
                    long nanoTime = System.nanoTime();
                    TimeUnit.NANOSECONDS.timedWait(this.f22457a, toNanos);
                    toNanos -= System.nanoTime() - nanoTime;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m16617a() {
        synchronized (this.f22457a) {
            int i = this.f22458b - 1;
            this.f22458b = i;
            if (i == 0) {
                this.f22457a.notifyAll();
            }
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f22457a) {
            if (this.f22459c) {
                throw new RejectedExecutionException("Executor already shutdown");
            }
            this.f22458b++;
        }
        try {
            runnable.run();
        } finally {
            m16617a();
        }
    }

    public final boolean isShutdown() {
        boolean z;
        synchronized (this.f22457a) {
            z = this.f22459c;
        }
        return z;
    }

    public final boolean isTerminated() {
        boolean z = false;
        synchronized (this.f22457a) {
            if (this.f22459c && this.f22458b == 0) {
                z = true;
            }
        }
        return z;
    }

    public final void shutdown() {
        synchronized (this.f22457a) {
            this.f22459c = true;
            if (this.f22458b == 0) {
                this.f22457a.notifyAll();
            }
        }
    }

    public final List shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
