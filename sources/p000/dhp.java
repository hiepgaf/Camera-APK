package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;

/* compiled from: PG */
/* renamed from: dhp */
final class dhp extends BottomBarListener {
    /* renamed from: a */
    private final /* synthetic */ BottomBarController f21027a;
    /* renamed from: b */
    private final /* synthetic */ dho f21028b;

    dhp(dho dho, BottomBarController bottomBarController) {
        this.f21028b = dho;
        this.f21027a = bottomBarController;
    }

    public final void onFpsSwitch(int i) {
        synchronized (this.f21028b.j) {
            if (this.f21028b.m == dii.CAMCORDER_OPENED) {
                this.f21027a.setClickable(false);
                inc inc = inc.FPS_120;
                if (i == 0) {
                    inc = inc.FPS_120;
                } else if (i == 1) {
                    inc = inc.FPS_240;
                }
                this.f21028b.m17065a(inc);
                return;
            }
            String str = dho.f23455c;
            String valueOf = String.valueOf(this.f21028b.m);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
            stringBuilder.append("Do nothing onFpsSwitch. mState=");
            stringBuilder.append(valueOf);
            bli.m873e(str, stringBuilder.toString());
        }
    }

    public final void onThumbnailButtonClicked() {
        synchronized (this.f21028b.j) {
            dho dho = this.f21028b;
            if (dho.n != null) {
                dho.n.mo2970e();
            }
        }
    }
}
