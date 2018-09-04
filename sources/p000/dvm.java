package p000;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import com.google.android.apps.camera.stats.CameraCaptureSessionInstrumentationSession;
import com.google.android.apps.camera.stats.CameraDeviceInstrumentationSession;
import com.google.android.apps.camera.stats.Instrumentation;
import java.util.List;

/* compiled from: PG */
/* renamed from: dvm */
public final class dvm implements iwl {
    /* renamed from: a */
    private final iwl f21189a;

    public dvm(iwl iwl, CameraDeviceInstrumentationSession cameraDeviceInstrumentationSession) {
        jri.m13152b((Object) iwl);
        jri.m13152b((Object) cameraDeviceInstrumentationSession);
        this.f21189a = iwl;
    }

    public final void close() {
        this.f21189a.close();
    }

    /* renamed from: a */
    public final iwn mo2986a(int i) {
        return this.f21189a.mo2986a(i);
    }

    /* renamed from: a */
    public final void mo2989a(iwu iwu) {
        CameraCaptureSessionInstrumentationSession cameraCaptureSessionInstrumentationSession = (CameraCaptureSessionInstrumentationSession) Instrumentation.instance().captureSession().create();
        iwv f = iwu.mo1950f();
        f.f7524d = new dvn(iwu.mo1949e(), cameraCaptureSessionInstrumentationSession);
        this.f21189a.mo2989a(f.m4301a());
    }

    /* renamed from: a */
    public final void mo2990a(List list, iwi iwi, Handler handler) {
        this.f21189a.mo2990a(list, new dvn(iwi, (CameraCaptureSessionInstrumentationSession) Instrumentation.instance().captureSession().create()), handler);
    }

    /* renamed from: b */
    public final void mo2993b(List list, iwi iwi, Handler handler) {
        this.f21189a.mo2993b(list, new dvn(iwi, (CameraCaptureSessionInstrumentationSession) Instrumentation.instance().captureSession().create()), handler);
    }

    /* renamed from: a */
    public final void mo2991a(List list, iwk iwk, Handler handler) {
        this.f21189a.mo2991a(list, iwk, handler);
    }

    /* renamed from: a */
    public final iwn mo2987a(iwp iwp) {
        return this.f21189a.mo2987a(iwp);
    }

    /* renamed from: a */
    public final void mo2988a(InputConfiguration inputConfiguration, List list, iwi iwi, Handler handler) {
        this.f21189a.mo2988a(inputConfiguration, list, new dvn(iwi, (CameraCaptureSessionInstrumentationSession) Instrumentation.instance().captureSession().create()), handler);
    }

    /* renamed from: b */
    public final void mo2992b(InputConfiguration inputConfiguration, List list, iwi iwi, Handler handler) {
        this.f21189a.mo2992b(inputConfiguration, list, new dvn(iwi, (CameraCaptureSessionInstrumentationSession) Instrumentation.instance().captureSession().create()), handler);
    }
}
