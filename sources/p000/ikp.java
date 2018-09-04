package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ikp */
public final class ikp implements iqo, Executor {
    /* renamed from: a */
    private final ScheduledExecutorService f18327a;
    /* renamed from: b */
    private final long f18328b;
    /* renamed from: c */
    private final TimeUnit f18329c;
    /* renamed from: d */
    private final Object f18330d = new Object();
    /* renamed from: e */
    private ScheduledFuture f18331e;
    /* renamed from: f */
    private boolean f18332f = false;

    public ikp(ScheduledExecutorService scheduledExecutorService, long j, TimeUnit timeUnit) {
        this.f18327a = scheduledExecutorService;
        this.f18328b = j;
        this.f18329c = timeUnit;
    }

    public final void close() {
        synchronized (this.f18330d) {
            if (this.f18332f) {
                return;
            }
            this.f18332f = true;
            this.f18327a.shutdownNow();
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f18330d) {
            if (this.f18332f) {
                return;
            }
            m12262a();
            this.f18331e = this.f18327a.schedule(runnable, this.f18328b, this.f18329c);
        }
    }

    /* renamed from: a */
    public final void m12262a() {
        synchronized (this.f18330d) {
            ScheduledFuture scheduledFuture = this.f18331e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
        }
    }
}
