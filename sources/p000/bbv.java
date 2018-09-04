package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bbv */
public final class bbv implements iqo, Executor {
    /* renamed from: a */
    public final Executor f10647a = new ikd();
    /* renamed from: b */
    private final int f10648b;
    /* renamed from: c */
    private final ScheduledExecutorService f10649c;

    public bbv(String str, int i) {
        this.f10648b = i;
        this.f10649c = Executors.newSingleThreadScheduledExecutor(iel.m3721c(str, 0));
    }

    public final void close() {
        this.f10649c.shutdown();
    }

    public final void execute(Runnable runnable) {
        try {
            this.f10649c.schedule(new bbw(this, runnable), (long) this.f10648b, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
        }
    }
}
