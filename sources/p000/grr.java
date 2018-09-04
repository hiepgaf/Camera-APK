package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.stats.InstrumentationSession;
import com.google.android.apps.common.proguard.UsedByReflection;

/* compiled from: PG */
/* renamed from: grr */
public final class grr extends InstrumentationSession {
    /* renamed from: a */
    public long f17268a;
    /* renamed from: b */
    private long f17269b;

    grr(iya iya) {
        super(iya, "MedRecInstrSes");
    }

    @UsedByReflection
    public final long getMediaRecorderPrepareEndNs() {
        return this.f17269b;
    }

    @UsedByReflection
    public final long getMediaRecorderPrepareStartNs() {
        return this.f17268a;
    }

    /* renamed from: a */
    public static kwk m11406a() {
        return new grs();
    }

    /* renamed from: b */
    public final void m11407b() {
        this.f17269b = SystemClock.elapsedRealtimeNanos();
        m1326a("MediaRecorder Prepare End", this.f17269b);
    }
}
