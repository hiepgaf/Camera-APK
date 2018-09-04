package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: evw */
public final class evw implements kwk {
    /* renamed from: a */
    private final kwk f15619a;
    /* renamed from: b */
    private final kwk f15620b;
    /* renamed from: c */
    private final kwk f15621c;

    private evw(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f15619a = kwk;
        this.f15620b = kwk2;
        this.f15621c = kwk3;
    }

    /* renamed from: a */
    public static evw m9994a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new evw(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object etm;
        kwk kwk = this.f15619a;
        kwk kwk2 = this.f15620b;
        kwk kwk3 = this.f15621c;
        kbg kbg = (kbg) kwk.mo345a();
        if (kbg.mo2084b()) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) kwk3.mo345a();
            etm = new etm((jfp) kwk2.mo345a(), (exb) kbg.mo2081a(), TimeUnit.MICROSECONDS.convert(33333, TimeUnit.MICROSECONDS), scheduledExecutorService);
        } else {
            etm = new evt();
        }
        return (etl) ktm.m13963a(etm, "Cannot return null from a non-@Nullable @Provides method");
    }
}
