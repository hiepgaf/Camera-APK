package p000;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: jwg */
final class jwg implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ String f8033a;
    /* renamed from: b */
    private final /* synthetic */ long f8034b;
    /* renamed from: c */
    private final /* synthetic */ jwf f8035c;

    jwg(jwf jwf, String str, long j) {
        this.f8035c = jwf;
        this.f8033a = str;
        this.f8034b = j;
    }

    public final void run() {
        try {
            this.f8035c.f21987a.write(String.format("%d,%s,%d%n", new Object[]{Long.valueOf(SystemClock.elapsedRealtimeNanos()), this.f8033a, Long.valueOf(this.f8034b)}));
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
        }
    }
}
