package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* compiled from: PG */
/* renamed from: dlc */
final class dlc extends BottomBarListener {
    /* renamed from: a */
    private final /* synthetic */ dla f21082a;

    dlc(dla dla) {
        this.f21082a = dla;
    }

    public final void onCameraSwitch(int i) {
        this.f21082a.f22984d.mo573a(new dbj());
    }

    public final void onRetakeButtonPressed() {
        this.f21082a.f22984d.mo573a(new dlr());
    }

    public final void onReviewPlayButtonPressed() {
        this.f21082a.f22984d.mo573a(new dls());
    }
}
