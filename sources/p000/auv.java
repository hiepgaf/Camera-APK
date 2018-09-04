package p000;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;

/* compiled from: PG */
/* renamed from: auv */
public class auv extends fiw {
    /* renamed from: a */
    private final fcm f10319a;
    /* renamed from: b */
    private final fdu f10320b;

    public auv(fcm fcm, fdu fdu) {
        super((byte) 0);
        this.f10319a = fcm;
        this.f10320b = fdu;
    }

    /* renamed from: b */
    protected kbg mo3368b(iwp iwp) {
        MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) iwp.mo3143a(CaptureResult.CONTROL_AF_REGIONS);
        if (meteringRectangleArr == null || meteringRectangleArr.length <= 0) {
            return kau.f19138a;
        }
        MeteringRectangle meteringRectangle = meteringRectangleArr[0];
        if (meteringRectangle.getRect().isEmpty()) {
            return kau.f19138a;
        }
        return kbg.m4745c(fcj.m2246a().m2251a(this.f10320b.m2263a(meteringRectangle, (Rect) iwp.mo3143a(CaptureResult.SCALER_CROP_REGION))).m2249a());
    }

    /* renamed from: a */
    protected boolean mo2639a(iwp iwp) {
        return false;
    }

    public final void a_(iwp iwp) {
        int intValue = ((Integer) jri.m13152b((Integer) iwp.mo3143a(CaptureResult.CONTROL_AF_MODE))).intValue();
        Object obj = (gig) gig.f5228d.get(Integer.valueOf(intValue));
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder(35);
            stringBuilder.append("unknown metadata value: ");
            stringBuilder.append(intValue);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        gig gig = (gig) jri.m13152b(obj);
        int intValue2 = ((Integer) jri.m13152b((Integer) iwp.mo3143a(CaptureResult.CONTROL_AF_STATE))).intValue();
        obj = (gih) gih.f5241h.get(Integer.valueOf(intValue2));
        if (obj == null) {
            StringBuilder stringBuilder2 = new StringBuilder(35);
            stringBuilder2.append("unknown metadata value: ");
            stringBuilder2.append(intValue2);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        Float f = (Float) jri.m13152b((Float) iwp.mo3143a(CaptureResult.LENS_FOCUS_DISTANCE));
        this.f10319a.mo348a(new fcl(gig, (gih) jri.m13152b(obj), f.floatValue(), mo2639a(iwp), mo3368b(iwp)));
    }
}
