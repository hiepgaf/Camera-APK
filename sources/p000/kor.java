package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kor */
final class kor extends koq {
    /* renamed from: a */
    private final kpk f23431a;

    kor(kpk kpk) {
        this.f23431a = (kpk) jri.m13152b((Object) kpk);
    }

    /* renamed from: a */
    public final void mo1985a(Runnable runnable, Executor executor) {
        this.f23431a.mo1985a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.f23431a.cancel(z);
    }

    public final Object get() {
        return this.f23431a.get();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.f23431a.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.f23431a.isCancelled();
    }

    public final boolean isDone() {
        return this.f23431a.isDone();
    }
}
