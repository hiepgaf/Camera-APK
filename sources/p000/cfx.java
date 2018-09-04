package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* compiled from: PG */
/* renamed from: cfx */
final class cfx extends BottomBarListener {
    /* renamed from: a */
    private final /* synthetic */ cfk f20301a;

    cfx(cfk cfk) {
        this.f20301a = cfk;
    }

    public final void onCameraSwitch(int i) {
        this.f20301a.f20264O.mo2997o();
        cfk cfk = this.f20301a;
        cfk.f20287m.mo1539b(cfk.mo2768w(), "pref_camera_id_key", i);
    }
}
