package p000;

import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;

/* compiled from: PG */
/* renamed from: elw */
public final class elw implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ PhotoSphereMessageOverlay f3954a;

    public elw(PhotoSphereMessageOverlay photoSphereMessageOverlay) {
        this.f3954a = photoSphereMessageOverlay;
    }

    public final void run() {
        ((TextView) this.f3954a.findViewById(R.id.short_info_message)).setVisibility(4);
    }
}
