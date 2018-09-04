package p000;

import android.hardware.display.DisplayManager.DisplayListener;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;

/* compiled from: PG */
/* renamed from: ebh */
final class ebh implements DisplayListener {
    /* renamed from: a */
    private final /* synthetic */ ebd f3503a;

    ebh(ebd ebd) {
        this.f3503a = ebd;
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        iqm b;
        switch (this.f3503a.f14896M.getDefaultDisplay().getRotation()) {
            case 0:
                b = iqm.m4039b(0);
                break;
            case 1:
                b = iqm.m4039b(90);
                break;
            case 2:
                b = iqm.m4039b(MediaDecoder.ROTATE_180);
                break;
            case 3:
                b = iqm.m4039b(MediaDecoder.ROTATE_90_LEFT);
                break;
            default:
                b = iqm.CLOCKWISE_0;
                break;
        }
        int a = b.m4041a();
        ebd ebd = this.f3503a;
        if (((a - ebd.f14923p) + 360) % 360 == MediaDecoder.ROTATE_180) {
            haq haq = ebd.f14930w;
            if (haq != null) {
                haq.l_();
                this.f3503a.f14887D.mo1219f();
            }
        }
        this.f3503a.f14923p = a;
    }

    public final void onDisplayRemoved(int i) {
    }
}
