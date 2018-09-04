package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;

/* compiled from: PG */
/* renamed from: deu */
final class deu extends BottomBarListener {
    /* renamed from: a */
    private final /* synthetic */ des f20969a;

    deu(des des) {
        this.f20969a = des;
    }

    public final void onCancelButtonPressed() {
        this.f20969a.m17050q();
    }

    public final void onRetakeButtonPressed() {
        des des = this.f20969a;
        des.f22806N++;
        if (des.f22833s == 0) {
            bli.m866b(des.f22792c, "Can't undo capture, no images captured.");
        } else if (!LightCycle.m1299b() || this.f20969a.f22824j.f3657b.mo2566d().m74a() == 8) {
            bli.m866b(des.f22792c, "Can't undo capture, LightCycle not ready to undo.");
        } else {
            des = this.f20969a;
            int i = des.f22833s;
            if (i > 0) {
                des.f22833s = i - 1;
                des.f22834t.m1837b();
                this.f20969a.f22796D.sendEmptyMessage(101);
            }
            des = this.f20969a;
            if (des.f22833s == 0) {
                des.m17047n();
            }
        }
    }
}
