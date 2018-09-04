package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: d */
public final class C0153d extends C0119e {
    /* renamed from: a */
    private final Object f13023a = new Object();
    /* renamed from: b */
    private ExecutorService f13024b = Executors.newFixedThreadPool(2);
    /* renamed from: c */
    private volatile Handler f13025c;

    /* renamed from: a */
    public final void mo1a(Runnable runnable) {
        this.f13024b.execute(runnable);
    }

    /* renamed from: b */
    public final boolean mo3b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: b */
    public final void mo2b(Runnable runnable) {
        if (this.f13025c == null) {
            synchronized (this.f13023a) {
                if (this.f13025c == null) {
                    this.f13025c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f13025c.post(runnable);
    }
}
