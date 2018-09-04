package p000;

import com.google.android.apps.camera.bottombar.RoundedThumbnailView;

/* renamed from: cjz */
final /* synthetic */ class cjz implements Runnable {
    /* renamed from: a */
    private final RoundedThumbnailView f2090a;

    cjz(RoundedThumbnailView roundedThumbnailView) {
        this.f2090a = roundedThumbnailView;
    }

    public final void run() {
        this.f2090a.stopFlashThumbnail();
    }
}
