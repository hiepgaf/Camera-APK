package p000;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: kpy */
public final class kpy implements ThreadFactory {
    /* renamed from: a */
    private final /* synthetic */ ThreadFactory f8413a;
    /* renamed from: b */
    private final /* synthetic */ String f8414b;
    /* renamed from: c */
    private final /* synthetic */ AtomicLong f8415c;
    /* renamed from: d */
    private final /* synthetic */ Boolean f8416d = null;
    /* renamed from: e */
    private final /* synthetic */ Integer f8417e = null;
    /* renamed from: f */
    private final /* synthetic */ UncaughtExceptionHandler f8418f = null;

    public kpy(ThreadFactory threadFactory, String str, AtomicLong atomicLong) {
        this.f8413a = threadFactory;
        this.f8414b = str;
        this.f8415c = atomicLong;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f8413a.newThread(runnable);
        String str = this.f8414b;
        if (str != null) {
            newThread.setName(kpx.m5041a(str, Long.valueOf(this.f8415c.getAndIncrement())));
        }
        return newThread;
    }
}
