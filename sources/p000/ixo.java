package p000;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: ixo */
public final class ixo implements ixq {
    /* renamed from: a */
    public final float mo1961a(iwp iwp) {
        Integer num = (Integer) iwp.mo3143a(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return Float.NaN;
        }
        Object obj;
        int i;
        if (num.intValue() == 2) {
            i = 1;
        } else if (num.intValue() != 3) {
            obj = null;
        } else {
            i = 1;
        }
        return obj == null ? 0.0f : 1.0f;
    }
}
