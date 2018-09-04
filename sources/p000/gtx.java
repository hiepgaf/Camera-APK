package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gtx */
public final class gtx {
    /* renamed from: a */
    public final guf f5689a;
    /* renamed from: b */
    public final ScheduledExecutorService f5690b;
    /* renamed from: c */
    public volatile long f5691c = -1;
    /* renamed from: d */
    private final Object f5692d = new Object();
    /* renamed from: e */
    private ScheduledFuture f5693e;

    public gtx(guf guf, ScheduledExecutorService scheduledExecutorService) {
        this.f5689a = guf;
        this.f5690b = scheduledExecutorService;
    }

    /* renamed from: a */
    private final Runnable m2825a(gua gua) {
        return new gty(this, gua);
    }

    /* renamed from: a */
    public final void m2827a(long j, gua gua) {
        synchronized (this.f5692d) {
            ScheduledFuture scheduledFuture = this.f5693e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f5693e = this.f5690b.scheduleAtFixedRate(m2825a(gua), 0, j, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public final void m2826a() {
        synchronized (this.f5692d) {
            ScheduledFuture scheduledFuture = this.f5693e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.f5693e = null;
            }
        }
    }

    /* renamed from: b */
    public final void m2828b() {
        this.f5690b.execute(m2825a(null));
    }
}
