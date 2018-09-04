package p000;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ffl */
public final /* synthetic */ class ffl implements iqo {
    /* renamed from: a */
    private final ScheduledExecutorService f15951a;

    public ffl(ScheduledExecutorService scheduledExecutorService) {
        this.f15951a = scheduledExecutorService;
    }

    public final void close() {
        this.f15951a.shutdownNow();
    }
}
