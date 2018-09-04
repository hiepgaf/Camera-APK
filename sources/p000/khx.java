package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

@Deprecated
/* compiled from: PG */
/* renamed from: khx */
public class khx {
    /* renamed from: a */
    public static boolean m4942a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static Object m4936a(Future future) {
        Object obj;
        Object obj2 = null;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException e) {
                obj2 = 1;
            } catch (Throwable th) {
                if (obj2 != null) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (obj2 != null) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: b */
    private static int m4944b(long[] jArr, long j, int i, int i2) {
        for (int i3 = i; i3 < i2; i3++) {
            if (jArr[i3] == j) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static kpm m4941a(ExecutorService executorService) {
        if (executorService instanceof kpm) {
            return (kpm) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            return new kpt((ScheduledExecutorService) executorService);
        }
        return new kps(executorService);
    }

    /* renamed from: a */
    public static kpm m4940a() {
        return new kpr();
    }

    /* renamed from: a */
    public static Executor m4939a(Executor executor, knk knk) {
        jri.m13152b((Object) executor);
        jri.m13152b((Object) knk);
        return executor == kpq.f8410a ? executor : new kpo(executor, knk);
    }

    /* renamed from: a */
    public static int m4934a(long j) {
        if (j > 2147483647L) {
            return LfuScheduler.MAX_PRIORITY;
        }
        if (j < -2147483648L) {
            return kvl.UNSET_ENUM_VALUE;
        }
        return (int) j;
    }

    /* renamed from: a */
    public static long[] m4943a(Collection collection) {
        if (collection instanceof kmk) {
            kmk kmk = (kmk) collection;
            return Arrays.copyOfRange(kmk.f8342a, kmk.f8343b, kmk.f8344c);
        }
        Object[] toArray = collection.toArray();
        int length = toArray.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = ((Number) jri.m13152b(toArray[i])).longValue();
        }
        return jArr;
    }

    /* renamed from: a */
    public static String m4937a(byte b) {
        jri.m13145a(true, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", 10);
        return Integer.toString(b & Illuminant.kOther, 10);
    }

    /* renamed from: a */
    public static String m4938a(int i) {
        return Long.toString(((long) i) & 4294967295L, 10);
    }
}
