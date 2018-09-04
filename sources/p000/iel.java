package p000;

import android.location.Location;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: iel */
public final class iel {
    /* renamed from: a */
    public static void m3719a(kpk kpk, iqb iqb, Executor executor) {
        kow.m13622a(kpk, new ijt(iqb), executor);
    }

    /* renamed from: a */
    public static Executor m3714a() {
        return new ikf(new ikd());
    }

    /* renamed from: a */
    public static Location m3712a(huq huq) {
        try {
            return ieo.m3725a(huq).f23545m.m3729a();
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static kpk m3718a(kpk kpk, kpk kpk2, iqg iqg) {
        return iel.m3716a(kpk, kpk2, new ijw(iqg));
    }

    /* renamed from: a */
    public static kpk m3716a(kpk kpk, kpk kpk2, iju iju) {
        Iterable arrayList = new ArrayList(2);
        arrayList.add(kpk);
        arrayList.add(kpk2);
        return kny.m18046a(kow.m13616a(arrayList), new ifc(iju), kpq.f8410a);
    }

    /* renamed from: a */
    public static kpk m3717a(kpk kpk, kpk kpk2, iju iju, Executor executor) {
        Iterable arrayList = new ArrayList(2);
        arrayList.add(kpk);
        arrayList.add(kpk2);
        return kny.m18046a(kow.m13616a(arrayList), new ifd(iju), executor);
    }

    /* renamed from: a */
    public static ExecutorService m3715a(String str, int i) {
        return Executors.newFixedThreadPool(i, iel.m3722d(str, 0));
    }

    /* renamed from: b */
    public static ExecutorService m3720b(String str, int i) {
        return Executors.newFixedThreadPool(2, iel.m3722d(str, i));
    }

    /* renamed from: c */
    public static ThreadFactory m3721c(String str, int i) {
        return new ikl(i, str);
    }

    /* renamed from: d */
    public static ThreadFactory m3722d(String str, int i) {
        boolean z;
        if (str.length() <= 13) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        return new ikk(i, str);
    }

    /* renamed from: e */
    public static ScheduledExecutorService m3723e(String str, int i) {
        return Executors.newScheduledThreadPool(i, iel.m3722d(str, 0));
    }

    /* renamed from: a */
    public static Object m3713a(kpk kpk) {
        Object obj = null;
        if (kpk.isDone() && !kpk.isCancelled()) {
            Object obj2 = null;
            while (true) {
                try {
                    obj = kpk.get();
                    break;
                } catch (InterruptedException e) {
                    obj2 = 1;
                } catch (ExecutionException e2) {
                    if (obj2 != null) {
                        Thread.currentThread().interrupt();
                    }
                } catch (Throwable th) {
                    if (obj2 != null) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            if (obj2 != null) {
                Thread.currentThread().interrupt();
            }
        }
        return obj;
    }
}
