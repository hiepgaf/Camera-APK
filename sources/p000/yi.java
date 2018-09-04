package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.StateCallback;

/* compiled from: PG */
/* renamed from: yi */
final class yi extends StateCallback {
    /* renamed from: a */
    private final /* synthetic */ ye f9537a;

    yi(ye yeVar) {
        this.f9537a = yeVar;
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        aat aat = this.f9537a.f19719k;
        if (aat != null) {
            aat.mo4a();
            this.f9537a.f19719k = null;
        }
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        abx.m87b(xq.f19682a, "Failed to configure the camera for capture");
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        ye yeVar = this.f9537a;
        yeVar.f19717i = cameraCaptureSession;
        yeVar.m14566a(8);
    }
}
