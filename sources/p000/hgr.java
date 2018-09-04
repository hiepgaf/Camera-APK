package p000;

import android.widget.ImageButton;

/* renamed from: hgr */
final /* synthetic */ class hgr implements Runnable {
    /* renamed from: a */
    private final hgo f6190a;

    hgr(hgo hgo) {
        this.f6190a = hgo;
    }

    public final void run() {
        hgo hgo = this.f6190a;
        if (hgo.f17818c.mo2084b()) {
            ImageButton imageButton = (ImageButton) hgo.f17824i.get();
            if (imageButton != null) {
                imageButton.performClick();
            }
        }
    }
}
