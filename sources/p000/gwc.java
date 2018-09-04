package p000;

import com.google.android.apps.camera.bottombar.RoundedThumbnailView.Callback;

/* compiled from: PG */
/* renamed from: gwc */
final class gwc implements Callback {
    /* renamed from: a */
    private final /* synthetic */ gwa f17460a;

    gwc(gwa gwa) {
        this.f17460a = gwa;
    }

    public final void onHitStateFinished() {
        gwa gwa = this.f17460a;
        if (gwa.f17454c) {
            gwa.f17452a.m708a();
            return;
        }
        for (gvu a : gwa.f17453b) {
            a.mo1118a();
        }
    }
}
