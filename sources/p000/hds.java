package p000;

import com.google.android.apps.camera.ui.toyboxmenu.ToyboxMenuButton;

/* renamed from: hds */
public final /* synthetic */ class hds implements Runnable {
    /* renamed from: a */
    private final ToyboxMenuButton f6067a;

    public hds(ToyboxMenuButton toyboxMenuButton) {
        this.f6067a = toyboxMenuButton;
    }

    public final void run() {
        this.f6067a.setVisibility(0);
    }
}
