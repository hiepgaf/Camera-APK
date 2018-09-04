package p000;

import android.hardware.camera2.CameraAccessException;

/* renamed from: ivq */
final /* synthetic */ class ivq implements iqo {
    /* renamed from: a */
    private final iwg f18629a;

    ivq(iwg iwg) {
        this.f18629a = iwg;
    }

    public final void close() {
        try {
            this.f18629a.mo2985d();
        } catch (CameraAccessException e) {
        } catch (iwf e2) {
        }
    }
}
