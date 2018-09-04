package p000;

import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;

/* compiled from: PG */
/* renamed from: ema */
public final class ema implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ PhotoSphereMessageOverlay f3960a;

    public ema(PhotoSphereMessageOverlay photoSphereMessageOverlay) {
        this.f3960a = photoSphereMessageOverlay;
    }

    public final void run() {
        PhotoSphereMessageOverlay photoSphereMessageOverlay = this.f3960a;
        if (photoSphereMessageOverlay.f2384e) {
            photoSphereMessageOverlay.f2384e = false;
            photoSphereMessageOverlay.findViewById(R.id.rotate_device_icon).setVisibility(4);
        }
    }
}
