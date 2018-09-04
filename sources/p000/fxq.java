package p000;

import android.hardware.camera2.CaptureResult;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: fxq */
public final class fxq {
    /* renamed from: a */
    public static boolean m2413a(iwp iwp) {
        if (iwp == null) {
            return false;
        }
        Integer num = (Integer) iwp.mo3143a(CaptureResult.CONTROL_AE_STATE);
        Integer num2 = (Integer) iwp.mo3143a(CaptureResult.CONTROL_AF_STATE);
        if (num == null || num2 == null) {
            return false;
        }
        if (Objects.equals(Integer.valueOf(0), num) || Objects.equals(Integer.valueOf(5), num)) {
            return false;
        }
        if (Objects.equals(Integer.valueOf(3), num2)) {
            return false;
        }
        return true;
    }
}
