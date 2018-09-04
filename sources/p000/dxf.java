package p000;

import com.google.android.apps.camera.legacy.app.refocus.ViewerActivity;
import com.google.android.apps.refocus.viewer.RGBZFocusControls;

/* compiled from: PG */
/* renamed from: dxf */
public final class dxf implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ViewerActivity f3336a;

    public dxf(ViewerActivity viewerActivity) {
        this.f3336a = viewerActivity;
    }

    public final void run() {
        ViewerActivity viewerActivity = this.f3336a;
        RGBZFocusControls rGBZFocusControls = viewerActivity.f20375e;
        hsp a = viewerActivity.f20376f;
        rGBZFocusControls.f12359f = a;
        rGBZFocusControls.post(new hsl(rGBZFocusControls, a));
    }
}
