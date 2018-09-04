package p000;

import com.google.android.apps.camera.ui.toyboxmenu.ToyboxMenuButton;

/* renamed from: hdr */
public final /* synthetic */ class hdr implements Runnable {
    /* renamed from: a */
    private final ToyboxMenuButton f6065a;
    /* renamed from: b */
    private final boolean f6066b;

    public hdr(ToyboxMenuButton toyboxMenuButton, boolean z) {
        this.f6065a = toyboxMenuButton;
        this.f6066b = z;
    }

    public final void run() {
        ToyboxMenuButton toyboxMenuButton = this.f6065a;
        if (this.f6066b) {
            toyboxMenuButton.setClickable(true);
        } else {
            toyboxMenuButton.setVisibility(8);
        }
    }
}
