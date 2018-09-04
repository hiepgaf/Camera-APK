package p000;

import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;

/* compiled from: PG */
/* renamed from: ys */
final class ys implements abg {
    /* renamed from: a */
    private final CameraInfo[] f19752a;
    /* renamed from: b */
    private final int f19753b;

    private ys(CameraInfo[] cameraInfoArr, int i) {
        this.f19752a = cameraInfoArr;
        this.f19753b = i;
    }

    /* renamed from: b */
    public static ys m14588b() {
        try {
            int i;
            int numberOfCameras = Camera.getNumberOfCameras();
            CameraInfo[] cameraInfoArr = new CameraInfo[numberOfCameras];
            for (i = 0; i < numberOfCameras; i++) {
                cameraInfoArr[i] = new CameraInfo();
                Camera.getCameraInfo(i, cameraInfoArr[i]);
            }
            i = -1;
            for (numberOfCameras--; numberOfCameras >= 0; numberOfCameras--) {
                CameraInfo cameraInfo = cameraInfoArr[numberOfCameras];
                if (cameraInfo.facing == 0) {
                    i = numberOfCameras;
                } else if (cameraInfo.facing == 1) {
                }
            }
            return new ys(cameraInfoArr, i);
        } catch (Throwable e) {
            abx.m85a(yo.f19743a, "Exception while creating CameraDeviceInfo", e);
            return null;
        }
    }

    /* renamed from: a */
    public final abh mo2550a(int i) {
        CameraInfo cameraInfo = this.f19752a[i];
        return cameraInfo != null ? new yt(cameraInfo) : null;
    }

    /* renamed from: a */
    public final int mo2549a() {
        return this.f19753b;
    }
}
