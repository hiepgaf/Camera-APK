package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.ImageReader.OnImageAvailableListener;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: yj */
final class yj extends yk {
    /* renamed from: a */
    private int f19733a = -1;
    /* renamed from: b */
    private long f19734b = -1;
    /* renamed from: c */
    private long f19735c = -1;
    /* renamed from: d */
    private final /* synthetic */ ye f19736d;

    yj(ye yeVar) {
        this.f19736d = yeVar;
    }

    /* renamed from: a */
    public final void mo2575a(CaptureResult captureResult) {
        boolean z = true;
        Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (num != null) {
            int intValue = num.intValue();
            if (captureResult.getFrameNumber() > this.f19734b) {
                int i = this.f19733a;
                this.f19733a = intValue;
                this.f19734b = captureResult.getFrameNumber();
                ye yeVar;
                switch (intValue) {
                    case 1:
                    case 2:
                    case 6:
                        if (intValue != i) {
                            yeVar = this.f19736d;
                            zx zxVar = yeVar.f19722n;
                            if (zxVar != null) {
                                if (intValue != 1) {
                                    z = false;
                                }
                                zxVar.mo1201a(z, yeVar.f19713e);
                                break;
                            }
                        }
                        break;
                    case 4:
                    case 5:
                        yeVar = this.f19736d;
                        zw zwVar = yeVar.f19720l;
                        if (zwVar != null) {
                            boolean z2;
                            if (intValue == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zwVar.mo1199a(z2, yeVar.f19713e);
                            this.f19736d.f19720l = null;
                            break;
                        }
                        break;
                }
            }
        }
        num = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
        if (num != null) {
            int intValue2 = num.intValue();
            if (captureResult.getFrameNumber() > this.f19735c) {
                this.f19736d.f19723o = num.intValue();
                this.f19735c = captureResult.getFrameNumber();
                switch (intValue2) {
                    case 2:
                    case 3:
                    case 4:
                        Handler handler = this.f19736d;
                        OnImageAvailableListener onImageAvailableListener = handler.f19721m;
                        if (onImageAvailableListener != null) {
                            handler.f19718j.setOnImageAvailableListener(onImageAvailableListener, handler);
                            try {
                                ye yeVar2 = this.f19736d;
                                CameraCaptureSession cameraCaptureSession = yeVar2.f19717i;
                                CaptureRequest a = yeVar2.f19714f.m94a(yeVar2.f19712d, 2, yeVar2.f19718j.getSurface());
                                Handler handler2 = this.f19736d;
                                cameraCaptureSession.capture(a, handler2.f19721m, handler2);
                                return;
                            } catch (Throwable e) {
                                abx.m85a(xq.f19682a, "Unable to initiate capture", e);
                                return;
                            } finally {
                                this.f19736d.f19721m = null;
                            }
                        } else {
                            return;
                        }
                    default:
                        return;
                }
            }
        }
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        mo2575a(totalCaptureResult);
    }

    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        aby aby = xq.f19682a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Capture attempt failed with reason ");
        stringBuilder.append(captureFailure.getReason());
        abx.m87b(aby, stringBuilder.toString());
    }

    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        mo2575a(captureResult);
    }

    /* renamed from: a */
    public final void mo2574a() {
        this.f19733a = -1;
        this.f19734b = -1;
        this.f19735c = -1;
    }
}
