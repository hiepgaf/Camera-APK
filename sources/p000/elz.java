package p000;

import android.widget.ImageView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;

/* compiled from: PG */
/* renamed from: elz */
public final class elz implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ boolean f3958a;
    /* renamed from: b */
    private final /* synthetic */ PhotoSphereMessageOverlay f3959b;

    public elz(PhotoSphereMessageOverlay photoSphereMessageOverlay, boolean z) {
        this.f3959b = photoSphereMessageOverlay;
        this.f3958a = z;
    }

    public final void run() {
        PhotoSphereMessageOverlay photoSphereMessageOverlay = this.f3959b;
        boolean z = photoSphereMessageOverlay.f2385f;
        boolean z2 = this.f3958a;
        if (z != z2) {
            int i;
            photoSphereMessageOverlay.f2385f = z2;
            ImageView imageView = (ImageView) photoSphereMessageOverlay.findViewById(R.id.rotate_device_icon);
            if (this.f3958a) {
                i = R.drawable.ic_pano_rotate_error_cw;
            } else {
                i = R.drawable.ic_pano_rotate_error_ccw;
            }
            imageView.setImageResource(i);
        }
        photoSphereMessageOverlay = this.f3959b;
        if (!photoSphereMessageOverlay.f2384e) {
            photoSphereMessageOverlay.f2384e = true;
            photoSphereMessageOverlay.findViewById(R.id.rotate_device_icon).setVisibility(0);
        }
    }
}
