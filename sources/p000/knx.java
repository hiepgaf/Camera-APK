package p000;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* renamed from: knx */
public abstract class knx extends AbstractExecutorService implements kpm {
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return kqb.m18060a(runnable, obj);
    }

    protected final RunnableFuture newTaskFor(Callable callable) {
        return kqb.m18061a(callable);
    }

    /* renamed from: a */
    public final kpk mo2197a(Runnable runnable) {
        return (kpk) super.submit(runnable);
    }

    public /* synthetic */ Future submit(Runnable runnable) {
        return mo2197a(runnable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (kpk) super.submit(runnable, obj);
    }

    /* renamed from: a */
    public final kpk mo2198a(Callable callable) {
        return (kpk) super.submit(callable);
    }

    public /* synthetic */ Future submit(Callable callable) {
        return mo2198a(callable);
    }
}
