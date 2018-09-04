package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: its */
public final class its extends StateCallback {
    /* renamed from: a */
    private final iwi f7463a;

    its(iwi iwi) {
        this.f7463a = iwi;
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f7463a.mo449a(new itk(cameraCaptureSession));
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f7463a.mo451b(new itk(cameraCaptureSession));
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f7463a.mo452c(new itk(cameraCaptureSession));
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.f7463a.mo453d(new itk(cameraCaptureSession));
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f7463a.mo454e(new itk(cameraCaptureSession));
    }

    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.f7463a.mo450a(new itk(cameraCaptureSession), surface);
    }
}
