package p000;

import android.os.SystemClock;
import android.view.Surface;
import com.google.android.apps.camera.stats.CameraCaptureSessionInstrumentationSession;
import com.google.android.apps.camera.stats.InstrumentationSession;

/* compiled from: PG */
/* renamed from: dvn */
public final class dvn implements iwi {
    /* renamed from: a */
    private final iwi f14617a;
    /* renamed from: b */
    private final CameraCaptureSessionInstrumentationSession f14618b;

    protected dvn(iwi iwi, CameraCaptureSessionInstrumentationSession cameraCaptureSessionInstrumentationSession) {
        this.f14617a = iwi;
        this.f14618b = cameraCaptureSessionInstrumentationSession;
    }

    /* renamed from: a */
    public final void mo449a(iwg iwg) {
        this.f14617a.mo449a(new dvk(iwg, this.f14618b));
    }

    /* renamed from: b */
    public final void mo451b(iwg iwg) {
        this.f14617a.mo451b(new dvk(iwg, this.f14618b));
    }

    /* renamed from: c */
    public final void mo452c(iwg iwg) {
        this.f14617a.mo452c(new dvk(iwg, this.f14618b));
    }

    /* renamed from: d */
    public final void mo453d(iwg iwg) {
        InstrumentationSession instrumentationSession = this.f14618b;
        iya iya = instrumentationSession.m;
        instrumentationSession.f12317b = SystemClock.elapsedRealtimeNanos();
        instrumentationSession.m1327a("Create", instrumentationSession.f2411k, instrumentationSession.f12317b);
        this.f14617a.mo453d(new dvk(iwg, this.f14618b));
    }

    /* renamed from: e */
    public final void mo454e(iwg iwg) {
        this.f14617a.mo454e(new dvk(iwg, this.f14618b));
    }

    /* renamed from: a */
    public final void mo450a(iwg iwg, Surface surface) {
        this.f14617a.mo450a(new dvk(iwg, this.f14618b), surface);
    }
}
