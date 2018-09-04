package p000;

import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: PG */
/* renamed from: gbx */
final class gbx extends OrientationEventListener {
    /* renamed from: a */
    private final /* synthetic */ gbv f5048a;

    public gbx(gbv gbv, Context context) {
        this.f5048a = gbv;
        super(context);
    }

    public final void onOrientationChanged(int i) {
        boolean z = false;
        if (i != -1) {
            iqm a;
            gbv gbv = this.f5048a;
            if (i >= 0 && i < 360) {
                z = true;
            }
            jri.m13143a(z);
            int abs = Math.abs(i - gbv.f5045e.f7326e);
            if (Math.min(abs, 360 - abs) >= 50) {
                a = iqm.m4037a((((i + 45) / 90) * 90) % 360);
            } else {
                a = gbv.f5045e;
            }
            gbv gbv2 = this.f5048a;
            iqm iqm = gbv2.f5045e;
            if (a != iqm) {
                iqz iqz = gbv2.f5046f;
                String valueOf = String.valueOf(iqm);
                String valueOf2 = String.valueOf(a);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 38) + String.valueOf(valueOf2).length());
                stringBuilder.append("DeviceOrientation changing (from:to) ");
                stringBuilder.append(valueOf);
                stringBuilder.append(":");
                stringBuilder.append(valueOf2);
                iqz.mo514b(stringBuilder.toString());
                gbv2 = this.f5048a;
                gbv2.f5045e = a;
                for (gbw gby : gbv2.f5041a) {
                    this.f5048a.f5043c.execute(new gby(gby, a));
                }
            }
        }
    }
}
