package p000;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import com.google.googlex.gcam.hdrplus.MetadataConverter;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: hs */
public final class hs {
    /* renamed from: a */
    public final Object f6538a = new Object();
    /* renamed from: b */
    public HandlerThread f6539b;
    /* renamed from: c */
    public Handler f6540c;
    /* renamed from: d */
    public final int f6541d;
    /* renamed from: e */
    private int f6542e;
    /* renamed from: f */
    private Callback f6543f = new ht(this);
    /* renamed from: g */
    private final int f6544g;
    /* renamed from: h */
    private final String f6545h;

    public hs(String str) {
        this.f6545h = str;
        this.f6544g = 10;
        this.f6541d = MetadataConverter.COLOR_SPACE_TRANSFORM_MATRIX_RATIONAL_DENOMINATOR;
        this.f6542e = 0;
    }

    /* renamed from: a */
    final void m3330a(Runnable runnable) {
        synchronized (this.f6538a) {
            if (this.f6539b == null) {
                this.f6539b = new HandlerThread(this.f6545h, this.f6544g);
                this.f6539b.start();
                this.f6540c = new Handler(this.f6539b.getLooper(), this.f6543f);
                this.f6542e++;
            }
            this.f6540c.removeMessages(0);
            Handler handler = this.f6540c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    /* renamed from: a */
    public final Object m3329a(Callable callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        m3330a(new hw(atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            Object obj;
            if (atomicBoolean.get()) {
                long toNanos = TimeUnit.MILLISECONDS.toNanos((long) i);
                while (true) {
                    try {
                        toNanos = newCondition.awaitNanos(toNanos);
                    } catch (InterruptedException e) {
                    }
                    if (!atomicBoolean.get()) {
                        break;
                    } else if (toNanos <= 0) {
                        throw new InterruptedException("timeout");
                    }
                }
                obj = atomicReference.get();
                reentrantLock.unlock();
            } else {
                obj = atomicReference.get();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
