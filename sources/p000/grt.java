package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.stats.InstrumentationSession;

/* compiled from: PG */
/* renamed from: grt */
public final class grt extends InstrumentationSession {
    /* renamed from: a */
    public long f17270a;

    public grt(iya iya) {
        super(iya, "ModeSwitch");
    }

    /* renamed from: a */
    public static kwk m11409a() {
        return new gru();
    }

    /* renamed from: b */
    public final void m11410b() {
        this.f17270a = SystemClock.elapsedRealtimeNanos();
        m1327a("Mode Switch", this.f2411k, this.f17270a);
    }
}
