package p000;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kos */
public abstract class kos extends kdy implements Future {
    protected kos() {
    }

    /* renamed from: b */
    protected abstract Future mo3251b();

    public boolean cancel(boolean z) {
        return mo3251b().cancel(z);
    }

    protected /* synthetic */ Object F_() {
        return mo3251b();
    }

    public Object get() {
        return mo3251b().get();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return mo3251b().get(j, timeUnit);
    }

    public boolean isCancelled() {
        return mo3251b().isCancelled();
    }

    public boolean isDone() {
        return mo3251b().isDone();
    }
}
