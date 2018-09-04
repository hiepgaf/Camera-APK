package p000;

import android.os.SystemClock;
import android.view.Surface;
import com.google.android.apps.camera.stats.CameraActivitySession;
import com.google.android.apps.camera.stats.CameraCaptureSessionInstrumentationSession;
import com.google.android.apps.camera.stats.Instrumentation;

/* compiled from: PG */
/* renamed from: dvl */
final class dvl implements iwh {
    /* renamed from: a */
    private final iwh f14615a;
    /* renamed from: b */
    private final CameraCaptureSessionInstrumentationSession f14616b;

    dvl(iwh iwh, CameraCaptureSessionInstrumentationSession cameraCaptureSessionInstrumentationSession) {
        this.f14615a = iwh;
        this.f14616b = cameraCaptureSessionInstrumentationSession;
    }

    /* renamed from: a */
    public final void mo444a(iwo iwo, Surface surface, long j) {
        this.f14615a.mo444a(iwo, surface, j);
    }

    /* renamed from: a */
    public final void mo446a(iwo iwo, iwp iwp) {
        CameraCaptureSessionInstrumentationSession cameraCaptureSessionInstrumentationSession = this.f14616b;
        int i = cameraCaptureSessionInstrumentationSession.f12316a;
        iya iya;
        if (i == 0) {
            iya = cameraCaptureSessionInstrumentationSession.m;
            cameraCaptureSessionInstrumentationSession.f12319d = SystemClock.elapsedRealtimeNanos();
            epf a = epf.m1944a();
            if (a.f4004d == 0) {
                a.f4004d = SystemClock.elapsedRealtimeNanos();
            }
            CameraActivitySession cameraActivitySession = (CameraActivitySession) Instrumentation.instance().cameraActivity().getCurrentSession();
            long j = cameraCaptureSessionInstrumentationSession.f12319d;
            if (cameraActivitySession.f12310g == 0) {
                cameraActivitySession.f12310g = j;
            }
            cameraCaptureSessionInstrumentationSession.m1328a("First capture request sent", cameraCaptureSessionInstrumentationSession.f12318c, "first capture result received", j);
            cameraCaptureSessionInstrumentationSession.f12316a = 1;
        } else if (i == 1) {
            iya = cameraCaptureSessionInstrumentationSession.m;
            cameraCaptureSessionInstrumentationSession.f12320e = SystemClock.elapsedRealtimeNanos();
            cameraCaptureSessionInstrumentationSession.m1328a("first capture result received", cameraCaptureSessionInstrumentationSession.f12319d, "second capture result received", cameraCaptureSessionInstrumentationSession.f12320e);
            cameraCaptureSessionInstrumentationSession.f12316a = 2;
        }
        this.f14615a.mo446a(iwo, iwp);
    }

    /* renamed from: a */
    public final void mo445a(iwo iwo, iwm iwm) {
        this.f14615a.mo445a(iwo, iwm);
    }

    /* renamed from: b */
    public final void mo447b(iwo iwo, iwp iwp) {
        this.f14615a.mo447b(iwo, iwp);
    }

    /* renamed from: a */
    public final void mo441a(int i) {
        this.f14615a.mo441a(i);
    }

    /* renamed from: a */
    public final void mo442a(int i, long j) {
        this.f14615a.mo442a(i, j);
    }

    /* renamed from: a */
    public final void mo443a(iwo iwo, long j, long j2) {
        this.f14615a.mo443a(iwo, j, j2);
    }
}
