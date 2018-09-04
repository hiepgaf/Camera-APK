package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import java.util.HashMap;
import java.util.Map;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: iui */
final class iui {
    /* renamed from: a */
    private final Object f7469a = new Object();
    /* renamed from: b */
    private final Map f7470b = new HashMap();
    /* renamed from: c */
    private final CameraManager f7471c;
    /* renamed from: d */
    private final iuk f7472d;

    iui(CameraManager cameraManager, iuk iuk) {
        this.f7471c = cameraManager;
        this.f7472d = iuk;
    }

    /* renamed from: a */
    public final iun m4211a(iur iur) {
        try {
            iun iun;
            synchronized (this.f7469a) {
                iun = (iun) this.f7470b.get(iur);
                if (iun == null) {
                    CameraCharacteristics cameraCharacteristics = this.f7471c.getCameraCharacteristics(iur.f7482b);
                    iuk iuk = this.f7472d;
                    ium ium = new ium(new iul(iur, cameraCharacteristics, iuk.f7473a, iuk.f7475c, iuk.f7476d), iuk.f7474b);
                    this.f7470b.put(iur, ium);
                    iun = ium;
                }
            }
            return iun;
        } catch (Throwable e) {
            throw new IllegalStateException("Unable to get camera characteristics.", e);
        }
    }
}
