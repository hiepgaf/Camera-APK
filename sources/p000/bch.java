package p000;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: bch */
public final class bch implements kwk {
    /* renamed from: a */
    private final kwk f10661a;

    public bch(kwk kwk) {
        this.f10661a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object kpt;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f10661a.mo345a();
        if (scheduledExecutorService instanceof kpn) {
            kpn kpn = (kpn) scheduledExecutorService;
        } else {
            kpt = new kpt(scheduledExecutorService);
        }
        return (kpn) ktm.m13963a(kpt, "Cannot return null from a non-@Nullable @Provides method");
    }
}
