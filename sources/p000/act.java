package p000;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* renamed from: act */
final class act implements ThreadFactory {
    act() {
    }

    public final synchronized Thread newThread(Runnable runnable) {
        Thread thread;
        thread = new Thread(runnable, "glide-disk-lru-cache-thread");
        thread.setPriority(1);
        return thread;
    }
}
