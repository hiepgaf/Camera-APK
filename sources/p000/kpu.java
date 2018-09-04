package p000;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kpu */
final class kpu extends kou implements ScheduledFuture, kpk {
    /* renamed from: a */
    private final ScheduledFuture f23580a;

    public kpu(kpk kpk, ScheduledFuture scheduledFuture) {
        super(kpk);
        this.f23580a = scheduledFuture;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.f23580a.cancel(z);
        }
        return cancel;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.f23580a.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f23580a.getDelay(timeUnit);
    }
}
