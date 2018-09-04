package p000;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: eju */
public final class eju {
    /* renamed from: a */
    public boolean f3694a = true;
    /* renamed from: b */
    private long f3695b;
    /* renamed from: c */
    private double f3696c;
    /* renamed from: d */
    private final double f3697d = 6.5d;

    /* renamed from: a */
    public final double m1809a() {
        if (this.f3694a) {
            return 1.0d;
        }
        double min = Math.min(this.f3696c, ((double) (SystemClock.elapsedRealtimeNanos() - this.f3695b)) / 1.0E9d) / this.f3696c;
        if (Math.abs(-1.0d + min) < 1.0E-4d) {
            this.f3694a = true;
        }
        return 1.0d - Math.exp(min * (-this.f3697d));
    }

    /* renamed from: b */
    public final void m1810b() {
        this.f3695b = SystemClock.elapsedRealtimeNanos();
        this.f3696c = 0.7d;
        this.f3694a = false;
    }
}
