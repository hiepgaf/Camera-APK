package p000;

import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bhn */
final /* synthetic */ class bhn implements Runnable {
    /* renamed from: a */
    private final bhm f1149a;
    /* renamed from: b */
    private final Surface f1150b;
    /* renamed from: c */
    private final Surface f1151c;
    /* renamed from: d */
    private final kpw f1152d;

    bhn(bhm bhm, Surface surface, Surface surface2, kpw kpw) {
        this.f1149a = bhm;
        this.f1150b = surface;
        this.f1151c = surface2;
        this.f1152d = kpw;
    }

    public final void run() {
        bhm bhm = this.f1149a;
        Surface surface = this.f1150b;
        Surface surface2 = this.f1151c;
        knk knk = this.f1152d;
        bli.m863a(bhm.f10882a, "Execute CameraCaptureSession-creation task on camera handler thread.");
        List arrayList = new ArrayList();
        arrayList.add(surface);
        arrayList.add(surface2);
        try {
            bhm.f10883b.mo2991a(arrayList, new iwk(knk), null);
        } catch (isr e) {
            bli.m863a(bhm.f10882a, "CameraDeviceProxy has been closed. (ResourceUnavailableException)");
            knk.mo3557a(null);
        }
    }
}
