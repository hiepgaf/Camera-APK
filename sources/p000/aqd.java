package p000;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: aqd */
public final class aqd implements aqa, aqf, Runnable {
    /* renamed from: a */
    private static final aqe f22588a = new aqe();
    /* renamed from: b */
    private final Handler f22589b;
    /* renamed from: c */
    private final int f22590c;
    /* renamed from: d */
    private final int f22591d;
    /* renamed from: e */
    private final boolean f22592e;
    /* renamed from: f */
    private Object f22593f;
    /* renamed from: g */
    private aqb f22594g;
    /* renamed from: h */
    private boolean f22595h;
    /* renamed from: i */
    private boolean f22596i;
    /* renamed from: j */
    private boolean f22597j;
    /* renamed from: k */
    private agg f22598k;

    public aqd(Handler handler, int i, int i2) {
        this(handler, i, i2, (byte) 0);
    }

    private aqd(Handler handler, int i, int i2, byte b) {
        this.f22589b = handler;
        this.f22590c = i;
        this.f22591d = i2;
        this.f22592e = true;
    }

    public final synchronized boolean cancel(boolean z) {
        boolean z2 = true;
        synchronized (this) {
            if (isDone()) {
                z2 = false;
            } else {
                this.f22595h = true;
                notifyAll();
                if (z) {
                    this.f22589b.post(this);
                }
            }
        }
        return z2;
    }

    /* renamed from: a */
    private final synchronized Object m16858a(Long l) {
        Object obj;
        if (this.f22592e && !isDone() && (arq.m655b() ^ 1) == 0) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        } else if (this.f22595h) {
            throw new CancellationException();
        } else if (this.f22597j) {
            throw new ExecutionException(this.f22598k);
        } else if (this.f22596i) {
            obj = this.f22593f;
        } else {
            if (l == null) {
                wait(0);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    wait(longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f22597j) {
                throw new ExecutionException(this.f22598k);
            } else if (this.f22595h) {
                throw new CancellationException();
            } else if (this.f22596i) {
                obj = this.f22593f;
            } else {
                throw new TimeoutException();
            }
        }
        return obj;
    }

    public final Object get() {
        try {
            return m16858a(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return m16858a(Long.valueOf(timeUnit.toMillis(j)));
    }

    /* renamed from: a */
    public final aqb mo2628a() {
        return this.f22594g;
    }

    /* renamed from: a */
    public final void mo3363a(aqr aqr) {
        aqr.mo320a(this.f22590c, this.f22591d);
    }

    public final synchronized boolean isCancelled() {
        return this.f22595h;
    }

    public final synchronized boolean isDone() {
        boolean z;
        z = this.f22595h || this.f22596i || this.f22597j;
        return z;
    }

    /* renamed from: b */
    public final void mo8b() {
    }

    /* renamed from: a */
    public final void mo2629a(Drawable drawable) {
    }

    /* renamed from: b */
    public final synchronized void mo2631b(Drawable drawable) {
    }

    /* renamed from: a */
    public final synchronized boolean mo3365a(agg agg) {
        this.f22597j = true;
        this.f22598k = agg;
        notifyAll();
        return false;
    }

    /* renamed from: c */
    public final void mo2632c(Drawable drawable) {
    }

    /* renamed from: a */
    public final synchronized void mo3364a(Object obj, ara ara) {
    }

    /* renamed from: a */
    public final synchronized boolean mo3366a(Object obj) {
        this.f22596i = true;
        this.f22593f = obj;
        notifyAll();
        return false;
    }

    /* renamed from: c */
    public final void mo9c() {
    }

    /* renamed from: d */
    public final void mo10d() {
    }

    /* renamed from: b */
    public final void mo3367b(aqr aqr) {
    }

    public final void run() {
        aqb aqb = this.f22594g;
        if (aqb != null) {
            aqb.mo325c();
            this.f22594g = null;
        }
    }

    /* renamed from: a */
    public final void mo2630a(aqb aqb) {
        this.f22594g = aqb;
    }
}
