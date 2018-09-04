package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* compiled from: PG */
/* renamed from: yf */
final class yf extends CaptureCallback {
    /* renamed from: a */
    private boolean f9530a = false;
    /* renamed from: b */
    private final /* synthetic */ zw f9531b;
    /* renamed from: c */
    private final /* synthetic */ ye f9532c;

    yf(ye yeVar, zw zwVar) {
        this.f9532c = yeVar;
        this.f9531b = zwVar;
    }

    /* renamed from: a */
    private final void m6248a(CaptureResult captureResult) {
        if (captureResult.get(CaptureResult.CONTROL_AF_STATE) != null && !this.f9530a) {
            this.f9530a = true;
            ye yeVar = this.f9532c;
            yeVar.f19720l = this.f9531b;
            yeVar.f19724p.mo2575a(captureResult);
        }
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        m6248a(totalCaptureResult);
    }

    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        aby aby = xq.f19682a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Focusing failed with reason ");
        stringBuilder.append(captureFailure.getReason());
        abx.m87b(aby, stringBuilder.toString());
        this.f9531b.mo1199a(false, this.f9532c.f19713e);
    }

    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        m6248a(captureResult);
    }
}
