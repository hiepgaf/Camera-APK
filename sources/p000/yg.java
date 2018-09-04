package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* compiled from: PG */
/* renamed from: yg */
final class yg extends CaptureCallback {
    /* renamed from: a */
    private boolean f9533a = false;
    /* renamed from: b */
    private final /* synthetic */ yl f9534b;
    /* renamed from: c */
    private final /* synthetic */ ye f9535c;

    yg(ye yeVar, yl ylVar) {
        this.f9535c = yeVar;
        this.f9534b = ylVar;
    }

    /* renamed from: a */
    private final void m6249a(CaptureResult captureResult) {
        if (captureResult.get(CaptureResult.CONTROL_AE_STATE) != null && !this.f9533a) {
            this.f9533a = true;
            ye yeVar = this.f9535c;
            yeVar.f19721m = this.f9534b;
            yeVar.f19724p.mo2575a(captureResult);
        }
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        m6249a(totalCaptureResult);
    }

    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        aby aby = xq.f19682a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Autoexposure and capture failed with reason ");
        stringBuilder.append(captureFailure.getReason());
        abx.m87b(aby, stringBuilder.toString());
    }

    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        m6249a(captureResult);
    }
}
