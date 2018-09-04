package p000;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: arm */
public final class arm {
    /* renamed from: a */
    private static final double f915a = (1.0d / Math.pow(10.0d, 6.0d));

    /* renamed from: a */
    public static double m629a(long j) {
        return ((double) (SystemClock.elapsedRealtimeNanos() - j)) * f915a;
    }

    @TargetApi(17)
    /* renamed from: a */
    public static long m630a() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
