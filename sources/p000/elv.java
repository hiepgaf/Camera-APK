package p000;

import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;

/* compiled from: PG */
/* renamed from: elv */
public final class elv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ int f3952a;
    /* renamed from: b */
    private final /* synthetic */ PhotoSphereMessageOverlay f3953b;

    public elv(PhotoSphereMessageOverlay photoSphereMessageOverlay, int i) {
        this.f3953b = photoSphereMessageOverlay;
        this.f3952a = i;
    }

    public final void run() {
        TextView textView = (TextView) this.f3953b.findViewById(R.id.short_info_message);
        textView.setText(this.f3952a);
        textView.setVisibility(0);
    }
}
