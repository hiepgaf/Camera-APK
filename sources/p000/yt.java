package p000;

import android.hardware.Camera.CameraInfo;

/* compiled from: PG */
/* renamed from: yt */
final class yt extends abh {
    /* renamed from: a */
    private CameraInfo f19754a;

    yt(CameraInfo cameraInfo) {
        this.f19754a = cameraInfo;
    }

    /* renamed from: a */
    public final int mo2551a() {
        return this.f19754a.orientation;
    }

    /* renamed from: b */
    public final boolean mo2552b() {
        return this.f19754a.facing == 0;
    }

    /* renamed from: c */
    public final boolean mo2553c() {
        return this.f19754a.facing == 1;
    }
}
