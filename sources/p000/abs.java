package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: abs */
public final class abs extends Thread {
    /* renamed from: c */
    private static final aby f170c = new aby("DispatchThread");
    /* renamed from: a */
    public final Queue f171a = new LinkedList();
    /* renamed from: b */
    public Boolean f172b = new Boolean(false);
    /* renamed from: d */
    private Handler f173d;
    /* renamed from: e */
    private HandlerThread f174e;

    public abs(Handler handler, HandlerThread handlerThread) {
        super("Camera Job Dispatch Thread");
        this.f173d = handler;
        this.f174e = handlerThread;
    }

    /* renamed from: a */
    private final boolean m79a() {
        boolean booleanValue;
        synchronized (this.f172b) {
            booleanValue = this.f172b.booleanValue();
        }
        return booleanValue;
    }

    public final void run() {
        while (true) {
            synchronized (this.f171a) {
                while (this.f171a.size() == 0 && !m79a()) {
                    try {
                        this.f171a.wait();
                    } catch (InterruptedException e) {
                        abx.m91e(f170c, "Dispatcher thread wait() interrupted, exiting");
                    }
                }
                Runnable runnable = (Runnable) this.f171a.poll();
            }
            if (runnable != null) {
                runnable.run();
                synchronized (this) {
                    this.f173d.post(new abt(this));
                    try {
                        wait();
                    } catch (InterruptedException e2) {
                    }
                }
            } else if (m79a()) {
                this.f174e.quitSafely();
                return;
            }
        }
    }

    /* renamed from: a */
    public final void m80a(Runnable runnable) {
        if (m79a()) {
            throw new IllegalStateException("Trying to run job on interrupted dispatcher thread");
        }
        synchronized (this.f171a) {
            if (((long) this.f171a.size()) == 256) {
                throw new RuntimeException("Camera master thread job queue full");
            }
            this.f171a.add(runnable);
            this.f171a.notifyAll();
        }
    }

    /* renamed from: a */
    public final void m81a(Runnable runnable, Object obj, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Timeout waiting ");
        stringBuilder.append(3500);
        stringBuilder.append("ms for ");
        stringBuilder.append(str);
        String stringBuilder2 = stringBuilder.toString();
        synchronized (obj) {
            long uptimeMillis = SystemClock.uptimeMillis() + 3500;
            try {
                m80a(runnable);
                obj.wait(3500);
                if (SystemClock.uptimeMillis() > uptimeMillis) {
                    throw new IllegalStateException(stringBuilder2);
                }
            } catch (InterruptedException e) {
                if (SystemClock.uptimeMillis() > uptimeMillis) {
                    throw new IllegalStateException(stringBuilder2);
                }
            }
        }
    }
}
