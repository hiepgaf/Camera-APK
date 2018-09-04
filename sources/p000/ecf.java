package p000;

import android.graphics.drawable.AnimatedVectorDrawable;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.ui.modeswitch.ViewfinderCover;

/* compiled from: PG */
/* renamed from: ecf */
class ecf extends gqj {
    /* renamed from: a */
    private final /* synthetic */ ecd f21221a;

    ecf(ecd ecd) {
        this.f21221a = ecd;
        super(null);
    }

    /* renamed from: a */
    public final void mo1562a() {
        boolean z = false;
        bli.m863a(ecd.f21209a, "enter Front camera state");
        ecd ecd = this.f21221a;
        ffc ffc = ecd.f21212d;
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
            if (ffc.mo1940v()) {
                z = true;
            } else if (gal.f4994l) {
                z = true;
            }
            gal.f4992j = z;
            gal.f4993k = ffc.w_();
            gal.m2460a((hhx) gal.f4985c.mo2860b());
            ecd.f21213e.mo1493a(ffc);
            ecd.f21218j.mo1753a(ffc);
            ecd.f21219k.mo402f();
            this.f21221a.f21217i.resetCameraSwitch(1);
            return;
        }
        bli.m873e(ecd.f21209a, "Trying to enter Front camera state but front camera does not exist.");
        if (this.f21221a.f21211c != null) {
            bli.m869c(ecd.f21209a, "Open back camera instead.");
            mo2998p();
        }
    }

    /* renamed from: b */
    public final void mo1563b() {
        bli.m863a(ecd.f21209a, "exit Front camera state");
        this.f21221a.f21218j.mo1760e();
        this.f21221a.f21218j.mo1764i();
    }

    /* renamed from: p */
    public void mo2998p() {
    }

    /* renamed from: o */
    public void mo2997o() {
        ViewfinderCover viewfinderCover = this.f21221a.f21215g;
        viewfinderCover.f12342c = (AnimatedVectorDrawable) viewfinderCover.getResources().getDrawable(R.drawable.camera_front_back_animation, null);
        viewfinderCover.f12341b.setImageDrawable(viewfinderCover.f12342c);
        viewfinderCover.f12341b.setVisibility(0);
        this.f21221a.f21215g.m8431a();
        this.f21221a.f21215g.f12342c.start();
    }
}
