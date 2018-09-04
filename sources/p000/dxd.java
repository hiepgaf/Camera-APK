package p000;

import com.google.android.apps.camera.legacy.app.refocus.ViewerActivity;
import com.google.android.apps.refocus.processing.EditingFinishedListener;

/* compiled from: PG */
/* renamed from: dxd */
public final class dxd implements EditingFinishedListener {
    /* renamed from: a */
    public final /* synthetic */ ViewerActivity f14680a;

    public dxd(ViewerActivity viewerActivity) {
        this.f14680a = viewerActivity;
    }

    public final void onDone() {
        this.f14680a.f20378h = false;
        new dxe(this).execute(new Void[0]);
    }
}
