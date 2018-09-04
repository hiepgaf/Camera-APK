package p000;

import android.os.Handler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: gk */
public abstract class gk {
    /* renamed from: a */
    private static final ThreadFactory f5270a = new gl();
    /* renamed from: b */
    public static final Executor f5271b;
    /* renamed from: h */
    private static final BlockingQueue f5272h = new LinkedBlockingQueue(10);
    /* renamed from: i */
    private static gn f5273i;
    /* renamed from: j */
    private static volatile Executor f5274j;
    /* renamed from: c */
    public final gp f5275c = new gp(this);
    /* renamed from: d */
    public final FutureTask f5276d = new gm(this, this.f5275c);
    /* renamed from: e */
    public volatile int f5277e = go.f5563a;
    /* renamed from: f */
    public final AtomicBoolean f5278f = new AtomicBoolean();
    /* renamed from: g */
    public final AtomicBoolean f5279g = new AtomicBoolean();

    static {
        Executor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f5272h, f5270a);
        f5271b = threadPoolExecutor;
        f5274j = threadPoolExecutor;
    }

    /* renamed from: a */
    protected abstract Object mo1457a();

    gk() {
    }

    /* renamed from: d */
    private static Handler m2573d() {
        Handler handler;
        synchronized (gk.class) {
            if (f5273i == null) {
                f5273i = new gn();
            }
            handler = f5273i;
        }
        return handler;
    }

    /* renamed from: b */
    protected void mo1459b() {
    }

    /* renamed from: a */
    protected void mo1458a(Object obj) {
    }

    /* renamed from: c */
    protected static void m2572c() {
    }

    /* renamed from: b */
    final Object m2576b(Object obj) {
        gk.m2573d().obtainMessage(1, new ll(this, obj)).sendToTarget();
        return obj;
    }

    /* renamed from: c */
    final void m2578c(Object obj) {
        if (!this.f5279g.get()) {
            m2576b(obj);
        }
    }
}
