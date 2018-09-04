package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* compiled from: PG */
/* renamed from: dgs */
final class dgs extends BottomBarListener {
    /* renamed from: a */
    private final /* synthetic */ dgl f21025a;

    dgs(dgl dgl) {
        this.f21025a = dgl;
    }

    public final void onCameraSwitch(int i) {
        dgl dgl = this.f21025a;
        if (!dgl.f21022x) {
            dgl.f21000b.m1695a(i);
            czp czp = dgl.f20978E;
            if (czp != null) {
                czp.m8906a(dgl.f21000b.m1697c() ^ 1);
            }
            bli.m871d(dgl.f20973a, "Switching Camera...");
            dgl.m15400g();
        }
    }

    public final void onThumbnailButtonClicked() {
    }
}
