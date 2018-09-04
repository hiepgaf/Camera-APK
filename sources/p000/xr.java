package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;

/* compiled from: PG */
/* renamed from: xr */
final class xr implements abg {
    /* renamed from: a */
    private final CameraManager f19692a;
    /* renamed from: b */
    private final String[] f19693b;
    /* renamed from: c */
    private final int f19694c;

    public xr(CameraManager cameraManager, String[] strArr) {
        this.f19692a = cameraManager;
        this.f19693b = strArr;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            try {
                int intValue = ((Integer) cameraManager.getCameraCharacteristics(strArr[i3]).get(CameraCharacteristics.LENS_FACING)).intValue();
                if (i2 == -1 && intValue == 1) {
                    i2 = i3;
                }
                if (i == -1 && intValue == 0) {
                    i = i3;
                }
            } catch (Throwable e) {
                aby aby = xq.f19682a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Couldn't get characteristics of camera '");
                stringBuilder.append(i3);
                stringBuilder.append("'");
                abx.m88b(aby, stringBuilder.toString(), e);
            }
        }
        this.f19694c = i2;
    }

    /* renamed from: a */
    public final abh mo2550a(int i) {
        try {
            return new xs(this.f19692a.getCameraCharacteristics(this.f19693b[i]));
        } catch (CameraAccessException e) {
            return null;
        }
    }

    /* renamed from: a */
    public final int mo2549a() {
        return this.f19694c;
    }
}
