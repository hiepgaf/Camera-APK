package p000;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;

/* renamed from: iyg */
final /* synthetic */ class iyg implements OnFrameAvailableListener {
    /* renamed from: a */
    private final iye f7548a;

    iyg(iye iye) {
        this.f7548a = iye;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        iye iye = this.f7548a;
        synchronized (iye.f18683m) {
            if (!iye.f18688r && iye.f18684n.mo2084b()) {
                iye.f18672b.execute(new iyh(iye));
            }
        }
    }
}
