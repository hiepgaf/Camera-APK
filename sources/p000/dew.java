package p000;

import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Handler;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;

/* compiled from: PG */
/* renamed from: dew */
final class dew implements DisplayListener {
    /* renamed from: a */
    private final /* synthetic */ des f3020a;

    dew(des des) {
        this.f3020a = des;
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        iqm b;
        switch (this.f3020a.f22831q.m1098a().getDefaultDisplay().getRotation()) {
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
        String str = des.f22792c;
        int i2 = this.f3020a.f22794B;
        StringBuilder stringBuilder = new StringBuilder(50);
        stringBuilder.append("onDisplayChange (old:new): ");
        stringBuilder.append(i2);
        stringBuilder.append(":");
        stringBuilder.append(a);
        bli.m871d(str, stringBuilder.toString());
        des des = this.f3020a;
        if (((a - des.f22794B) + 360) % 360 == MediaDecoder.ROTATE_180) {
            Handler handler = des.f22801I;
            if (handler != null) {
                handler.sendEmptyMessage(3);
            }
        }
        this.f3020a.f22794B = a;
    }

    public final void onDisplayRemoved(int i) {
    }
}
