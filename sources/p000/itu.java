package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: itu */
public final class itu extends StateCallback {
    /* renamed from: a */
    private final iwk f7464a;

    itu(iwk iwk) {
        this.f7464a = iwk;
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        iwj iwj = new iwj((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession);
        bli.m863a(bhm.f10882a, "onActive");
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        iwj iwj = new iwj((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession);
        bli.m863a(bhm.f10882a, "onClosed");
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession = (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession;
        iwk iwk = this.f7464a;
        iwj iwj = new iwj(cameraConstrainedHighSpeedCaptureSession);
        bli.m866b(bhm.f10882a, "onConfigureFailed");
        iwk.f7519a.m17780a(new isr("CameraCaptureSession.onConfigureFailed"));
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession = (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession;
        iwk iwk = this.f7464a;
        iwg iwj = new iwj(cameraConstrainedHighSpeedCaptureSession);
        bli.m863a(bhm.f10882a, "onConfigured");
        iwk.f7519a.mo3557a(new bhj(iwj));
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        iwj iwj = new iwj((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession);
        bli.m863a(bhm.f10882a, "onReady");
    }

    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        itk itk = new itk(cameraCaptureSession);
    }
}
