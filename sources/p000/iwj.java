package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: iwj */
public final class iwj implements iwg {
    /* renamed from: a */
    private final CameraConstrainedHighSpeedCaptureSession f21793a;

    public iwj(CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession) {
        this.f21793a = cameraConstrainedHighSpeedCaptureSession;
    }

    /* renamed from: a */
    public final void mo2980a() {
        try {
            this.f21793a.abortCaptures();
        } catch (Throwable e) {
            throw new iwf(e);
        }
    }

    /* renamed from: a */
    public final int mo2979a(List list, iwh iwh, Handler handler) {
        try {
            return this.f21793a.captureBurst(ion.m3963b(list), new itm(iwh), handler);
        } catch (Throwable e) {
            throw new iwf(e);
        }
    }

    public final void close() {
        this.f21793a.close();
    }

    /* renamed from: a */
    public final List m16175a(iwo iwo) {
        try {
            List createHighSpeedRequestList = this.f21793a.createHighSpeedRequestList((CaptureRequest) ion.m3945a((iwe) iwo));
            List arrayList = new ArrayList(createHighSpeedRequestList.size());
            for (int i = 0; i < createHighSpeedRequestList.size(); i++) {
                arrayList.add(new itq((CaptureRequest) createHighSpeedRequestList.get(i)));
            }
            return arrayList;
        } catch (Throwable e) {
            throw new iwf(e);
        }
    }

    /* renamed from: a */
    public final void mo2981a(List list) {
        hsx.m3353a(this.f21793a, ion.m3963b(list));
    }

    /* renamed from: b */
    public final iwl mo2983b() {
        CameraDevice device = this.f21793a.getDevice();
        itt itt = new itt();
        return new itn(device);
    }

    /* renamed from: c */
    public final Surface mo2984c() {
        return this.f21793a.getInputSurface();
    }

    /* renamed from: b */
    public final int mo2982b(List list, iwh iwh, Handler handler) {
        try {
            return this.f21793a.setRepeatingBurst(ion.m3963b(list), new itm(iwh), handler);
        } catch (Throwable e) {
            throw new iwf(e);
        }
    }

    /* renamed from: d */
    public final void mo2985d() {
        try {
            this.f21793a.stopRepeating();
        } catch (Throwable e) {
            throw new iwf(e);
        }
    }
}
