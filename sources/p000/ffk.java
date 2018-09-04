package p000;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ffk */
public final /* synthetic */ class ffk implements iqo {
    /* renamed from: a */
    private final ScheduledExecutorService f15950a;

    public ffk(ScheduledExecutorService scheduledExecutorService) {
        this.f15950a = scheduledExecutorService;
    }

    public final void close() {
        this.f15950a.shutdown();
    }
}
