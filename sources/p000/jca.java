package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: jca */
final class jca implements kpk {
    /* renamed from: a */
    private final jbj f18729a;

    public jca(jbj jbj) {
        this.f18729a = jbj;
    }

    /* renamed from: a */
    public final void mo1985a(Runnable runnable, Executor executor) {
        if (this.f18729a.mo1983c()) {
            executor.execute(runnable);
            return;
        }
        synchronized (this.f18729a) {
            if (this.f18729a.mo1983c()) {
                executor.execute(runnable);
                return;
            }
            this.f18729a.m12761a(executor, runnable, jcd.f18731b);
        }
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final Object get() {
        try {
            return this.f18729a.mo1982b();
        } catch (Throwable e) {
            throw new ExecutionException(e);
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        Object obj;
        synchronized (this.f18729a) {
            if (!isDone()) {
                timeUnit.timedWait(this.f18729a, j);
                if (!isDone()) {
                    throw new TimeoutException();
                }
            }
            jbj jbj = this.f18729a;
            obj = jbj.f18721a;
            if (obj != null) {
            } else {
                throw new ExecutionException(jbj.f18722b);
            }
        }
        return obj;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return this.f18729a.mo1983c();
    }
}
