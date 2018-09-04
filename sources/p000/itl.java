package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: itl */
final class itl extends CaptureCallback {
    /* renamed from: a */
    private final iwh f7461a;

    itl(iwh iwh) {
        this.f7461a = iwh;
    }

    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        try {
            this.f7461a.mo444a(new itq(captureRequest), surface, j);
        } catch (Throwable th) {
            iks.m3802a(th);
        }
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        try {
            this.f7461a.mo446a(new itq(captureRequest), new iuf(totalCaptureResult));
        } catch (Throwable th) {
            iks.m3802a(th);
        }
    }

    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        try {
            this.f7461a.mo445a(new itq(captureRequest), new itp(captureFailure));
        } catch (Throwable th) {
            iks.m3802a(th);
        }
    }

    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        try {
            this.f7461a.mo447b(new itq(captureRequest), new itr(captureResult));
        } catch (Throwable th) {
            iks.m3802a(th);
        }
    }

    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        try {
            this.f7461a.mo441a(i);
        } catch (Throwable th) {
            iks.m3802a(th);
        }
    }

    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        try {
            this.f7461a.mo442a(i, j);
        } catch (Throwable th) {
            iks.m3802a(th);
        }
    }

    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        try {
            this.f7461a.mo443a(new itq(captureRequest), j, j2);
        } catch (Throwable th) {
            iks.m3802a(th);
        }
    }
}
