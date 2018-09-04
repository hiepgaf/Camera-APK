package p000;

import android.os.SystemClock;
import com.google.android.libraries.smartburst.utils.Feature;

/* compiled from: PG */
/* renamed from: jle */
final class jle implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ long f7907a;
    /* renamed from: b */
    private final /* synthetic */ Feature f7908b;
    /* renamed from: c */
    private final /* synthetic */ jld f7909c;

    jle(jld jld, long j, Feature feature) {
        this.f7909c = jld;
        this.f7907a = j;
        this.f7908b = feature;
    }

    public final void run() {
        try {
            this.f7909c.f18923a.write(String.format("%d,%d,%s%n", new Object[]{Long.valueOf(this.f7907a), Long.valueOf(SystemClock.elapsedRealtimeNanos()), this.f7908b.getType().name()}));
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
        }
    }
}
