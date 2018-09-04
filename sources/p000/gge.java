package p000;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: gge */
public final class gge implements ggc {
    /* renamed from: a */
    private static final String f16892a = bli.m862a("LSDefaultMetricJni");
    /* renamed from: b */
    private final ird f16893b;

    public gge(ird ird, iya iya) {
        this.f16893b = ird;
    }

    /* renamed from: a */
    public final ggd mo1478a(gfw gfw) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.f16893b.mo1903a("LuckyShotScore");
        double a = ggg.m2542a(gfw);
        this.f16893b.mo1904b();
        String str = f16892a;
        StringBuilder stringBuilder = new StringBuilder(46);
        stringBuilder.append("LS metric (default) = ");
        stringBuilder.append(a);
        bli.m871d(str, stringBuilder.toString());
        if (a <= 0.0d) {
            bli.m873e(f16892a, "invalid metric value from LS metric calculation.");
        }
        elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
        str = f16892a;
        stringBuilder = new StringBuilder(42);
        stringBuilder.append("LS calculation time = ");
        stringBuilder.append(elapsedRealtimeNanos / 1000000);
        bli.m871d(str, stringBuilder.toString());
        return new ggd(a, new epk(epm.LUCKY_SHOT_DEFAULT_METRIC, (float) a, elapsedRealtimeNanos));
    }
}
