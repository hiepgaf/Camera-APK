package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;

/* compiled from: PG */
/* renamed from: avw */
public final class avw extends aue {
    /* renamed from: a */
    private final fdu f22603a;

    public avw(fcm fcm, fdu fdu) {
        super(fcm, fdu);
        this.f22603a = fdu;
    }

    /* renamed from: b */
    protected final kbg mo3368b(iwp iwp) {
        boolean z;
        boolean z2 = true;
        MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) jri.m13152b((MeteringRectangle[]) iwp.mo3143a(CaptureResult.CONTROL_AF_REGIONS));
        if (meteringRectangleArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        MeteringRectangle meteringRectangle = meteringRectangleArr[0];
        if (meteringRectangle.getRect().isEmpty()) {
            return kau.f19138a;
        }
        PointF a = this.f22603a.m2263a(meteringRectangle, (Rect) iwp.mo3143a(CaptureResult.SCALER_CROP_REGION));
        int[] iArr = (int[]) jri.m13152b((int[]) iwp.mo3143a(hsz.f6613g));
        if (iArr.length <= 0) {
            z2 = false;
        }
        jri.m13143a(z2);
        return kbg.m4745c(fcj.m2246a().m2251a(a).m2250a(iArr[0]).m2249a());
    }
}
