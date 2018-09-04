package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fzb */
public final class fzb implements kaw {
    fzb() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        fzd fzd = (fzd) obj;
        return fds.m10240a(Arrays.asList(new fin[]{new fin(CaptureRequest.SCALER_CROP_REGION, fzd.f4837a), new fin(CaptureRequest.LENS_FOCAL_LENGTH, Float.valueOf(fzd.f4838b))}));
    }

    /* renamed from: a */
    public static int m10902a(iqp iqp, iqp iqp2) {
        int min = Math.min(iqp.f7329a / iqp2.f7329a, iqp.f7330b / iqp2.f7330b);
        if (min <= 0) {
            return 1;
        }
        while (min > 0) {
            if (fzb.m10903a(iqp.f7329a, min) && fzb.m10903a(iqp.f7330b, min)) {
                return min;
            }
            min--;
        }
        return 1;
    }

    /* renamed from: a */
    public static boolean m10903a(int i, int i2) {
        return i % (i2 + i2) == 0;
    }
}
