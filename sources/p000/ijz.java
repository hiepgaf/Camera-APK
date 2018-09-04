package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: ijz */
public final class ijz implements iqo {
    /* renamed from: a */
    private final HandlerThread f18318a;
    /* renamed from: b */
    private final AtomicBoolean f18319b = new AtomicBoolean(false);

    public ijz(HandlerThread handlerThread) {
        this.f18318a = handlerThread;
    }

    public final void close() {
        if (!this.f18319b.getAndSet(true)) {
            Looper looper = this.f18318a.getLooper();
            if (looper != null) {
                Handler handler = new Handler(looper);
                HandlerThread handlerThread = this.f18318a;
                handlerThread.getClass();
                handler.postDelayed(new ika(handlerThread), 5000);
            }
        }
    }
}
