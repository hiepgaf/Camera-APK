package p000;

import com.google.android.apps.camera.bottombar.RoundedThumbnailView;

/* renamed from: cjs */
final /* synthetic */ class cjs implements Runnable {
    /* renamed from: a */
    private final RoundedThumbnailView f2088a;

    cjs(RoundedThumbnailView roundedThumbnailView) {
        this.f2088a = roundedThumbnailView;
    }

    public final void run() {
        this.f2088a.flashThumbnail();
    }
}
