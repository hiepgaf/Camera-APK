package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: etm */
public final class etm implements etl {
    /* renamed from: a */
    private final jfp f21325a;
    /* renamed from: b */
    private final exb f21326b;
    /* renamed from: c */
    private final ScheduledExecutorService f21327c;
    /* renamed from: d */
    private final long f21328d;
    /* renamed from: e */
    private ScheduledFuture f21329e = null;

    public etm(jfp jfp, exb exb, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f21325a = jfp;
        this.f21326b = exb;
        this.f21328d = j;
        this.f21327c = scheduledExecutorService;
    }

    public final synchronized void close() {
        ScheduledFuture scheduledFuture = this.f21329e;
        if (scheduledFuture == null) {
            bli.m873e("AudioSampler", "Sampler already stopped.");
        } else {
            scheduledFuture.cancel(false);
            this.f21329e = null;
            this.f21325a.m4451b();
        }
        this.f21325a.close();
    }

    /* renamed from: a */
    public final synchronized void mo3028a() {
        if (this.f21329e != null) {
            bli.m873e("AudioSampler", "Sampler already started.");
        } else {
            this.f21325a.m4450a();
            ScheduledExecutorService scheduledExecutorService = this.f21327c;
            exb exb = this.f21326b;
            exb.getClass();
            this.f21329e = scheduledExecutorService.scheduleAtFixedRate(new etn(exb), 0, this.f21328d, TimeUnit.MICROSECONDS);
        }
    }
}
