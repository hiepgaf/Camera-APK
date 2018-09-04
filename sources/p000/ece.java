package p000;

import android.graphics.drawable.AnimatedVectorDrawable;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.ui.modeswitch.ViewfinderCover;

/* compiled from: PG */
/* renamed from: ece */
class ece extends gqj {
    /* renamed from: a */
    private final /* synthetic */ ecd f21220a;

    ece(ecd ecd) {
        this.f21220a = ecd;
        super(null);
    }

    /* renamed from: a */
    public final void mo1562a() {
        boolean z = true;
        bli.m863a(ecd.f21209a, "enter Back camera state");
        ecd ecd = this.f21220a;
        ffc ffc = ecd.f21211c;
        if (ffc != null) {
            boolean z2;
            ecd.f21214f.f16979d = ffc.v_();
            gal gal = ecd.f21216h;
            if (ffc.mo1921c() == iut.FRONT) {
                z2 = true;
            } else {
                z2 = false;
            }
            gal.f4994l = z2;
            if (!(ffc.mo1940v() || gal.f4994l)) {
                z = false;
            }
            gal.f4992j = z;
            gal.f4993k = ffc.w_();
            gal.m2460a((hhx) gal.f4985c.mo2860b());
            ecd.f21213e.mo1493a(ffc);
            ecd.f21218j.mo1753a(ffc);
            ecd.f21219k.mo402f();
            this.f21220a.f21217i.resetCameraSwitch(0);
            this.f21220a.f21210b.m15509a(ece.class);
            return;
        }
        bli.m873e(ecd.f21209a, "Trying to enter Back camera state but back camera does not exist.");
        if (this.f21220a.f21212d != null) {
            bli.m869c(ecd.f21209a, "Open front camera instead.");
            mo2996n();
        }
    }

    /* renamed from: b */
    public final void mo1563b() {
        this.f21220a.f21210b.m15510b(ece.class);
        this.f21220a.f21218j.mo1760e();
        this.f21220a.f21218j.mo1764i();
    }

    /* renamed from: n */
    public void mo2996n() {
    }

    /* renamed from: o */
    public void mo2997o() {
        ViewfinderCover viewfinderCover = this.f21220a.f21215g;
        viewfinderCover.f12342c = (AnimatedVectorDrawable) viewfinderCover.getResources().getDrawable(R.drawable.camera_back_front_animation, null);
        viewfinderCover.f12341b.setImageDrawable(viewfinderCover.f12342c);
        viewfinderCover.f12341b.setVisibility(0);
        this.f21220a.f21215g.m8431a();
        this.f21220a.f21215g.f12342c.start();
    }
}
