package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* compiled from: PG */
/* renamed from: gyw */
final class gyw extends BottomBarListener {
    /* renamed from: a */
    private final /* synthetic */ irs f21561a;
    /* renamed from: b */
    private final /* synthetic */ gyz f21562b;

    gyw(gyz gyz, irs irs) {
        this.f21562b = gyz;
        this.f21561a = irs;
    }

    public final void onPhotoSwitchButtonClicked() {
        this.f21561a.mo1601c(1);
        this.f21562b.m2930a(this.f21562b.m2928a(go.bo));
        this.f21562b.m2929a(0.0f, go.bo);
    }

    public final void onVideoSwitchButtonClicked() {
        this.f21561a.mo1601c(2);
        this.f21562b.m2930a(this.f21562b.m2928a(go.bn));
        this.f21562b.m2929a(0.0f, go.bn);
    }
}
