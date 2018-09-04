package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: irf */
final class irf extends StateCallback {
    /* renamed from: a */
    private final iri f7346a;
    /* renamed from: b */
    private final String f7347b;

    irf(iri iri, String str) {
        this.f7346a = (iri) jri.m13152b((Object) iri);
        this.f7347b = (String) jri.m13152b((Object) str);
    }

    public final void onClosed(CameraDevice cameraDevice) {
        jri.m13152b((Object) cameraDevice);
        jri.m13143a(cameraDevice.getId().equals(this.f7347b));
        this.f7346a.mo1150a();
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        jri.m13152b((Object) cameraDevice);
        jri.m13143a(cameraDevice.getId().equals(this.f7347b));
        this.f7346a.mo1153b();
        cameraDevice.close();
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        jri.m13152b((Object) cameraDevice);
        jri.m13143a(cameraDevice.getId().equals(this.f7347b));
        this.f7346a.mo1151a(i);
        cameraDevice.close();
    }

    public final void onOpened(CameraDevice cameraDevice) {
        jri.m13152b((Object) cameraDevice);
        jri.m13143a(cameraDevice.getId().equals(this.f7347b));
        iri iri = this.f7346a;
        itt itt = new itt();
        iri.mo1152a(new itn(cameraDevice));
    }
}
