package p000;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cht */
public final class cht {
    /* renamed from: a */
    private static Object f1998a = new Object();
    /* renamed from: b */
    private static ExecutorService f1999b = null;

    /* renamed from: a */
    public static Executor m1129a() {
        return cht.m1130a(2);
    }

    /* renamed from: b */
    public static Executor m1131b() {
        return cht.m1130a(1);
    }

    /* renamed from: c */
    public static ExecutorService m1132c() {
        return Executors.newFixedThreadPool(2);
    }

    /* renamed from: a */
    private static ExecutorService m1130a(int i) {
        return new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new jzm(), new cks());
    }

    /* renamed from: a */
    public static ijx m1128a(HandlerThread handlerThread) {
        jri.m13152b((Object) handlerThread);
        return new ijx(new Handler(handlerThread.getLooper()));
    }

    /* renamed from: d */
    public static ExecutorService m1133d() {
        return cht.m1130a(2);
    }

    /* renamed from: e */
    public static ExecutorService m1134e() {
        synchronized (f1998a) {
            if (f1999b == null) {
                f1999b = Executors.newFixedThreadPool(2);
            }
        }
        return f1999b;
    }
}
