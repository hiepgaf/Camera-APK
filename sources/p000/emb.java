package p000;

import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;

/* compiled from: PG */
/* renamed from: emb */
public final class emb implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ boolean f3961a;
    /* renamed from: b */
    private final /* synthetic */ int f3962b;
    /* renamed from: c */
    private final /* synthetic */ PhotoSphereMessageOverlay f3963c;

    public emb(PhotoSphereMessageOverlay photoSphereMessageOverlay, boolean z, int i) {
        this.f3963c = photoSphereMessageOverlay;
        this.f3961a = z;
        this.f3962b = i;
    }

    public final void run() {
        TextView textView = (TextView) this.f3963c.findViewById(R.id.long_message_overlay);
        if (this.f3961a) {
            textView.setVisibility(0);
            switch (this.f3962b) {
                case 0:
                    textView.setText(R.string.photosphere_calibration_step_one);
                    return;
                case 1:
                    textView.setText(R.string.photosphere_calibration_step_two);
                    return;
                case 2:
                    textView.setText(R.string.photosphere_calibration_step_three);
                    return;
                case 3:
                    textView.setText(R.string.photosphere_calibration_finished);
                    return;
                default:
                    return;
            }
        }
        textView.setVisibility(4);
    }
}
