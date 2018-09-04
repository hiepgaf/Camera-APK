package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CameraCharacteristics;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: axm */
public final class axm {
    /* renamed from: a */
    public final int f1011a;
    /* renamed from: b */
    public final boolean f1012b;
    /* renamed from: c */
    private final gbv f1013c;

    public axm(gbv gbv, int i, boolean z) {
        this.f1011a = i;
        this.f1012b = z;
        this.f1013c = gbv;
    }

    public axm(gbv gbv, ffc ffc) {
        boolean z;
        int o = ffc.mo1933o();
        if (ffc.mo1921c() == iut.FRONT) {
            z = true;
        } else {
            z = false;
        }
        this(gbv, o, z);
    }

    /* renamed from: a */
    public final iqm m735a() {
        return iqm.m4037a(axm.m733a(this.f1011a, this.f1013c.f5045e.f7326e, this.f1012b));
    }

    /* renamed from: a */
    public static int m733a(int i, int i2, boolean z) {
        if (z) {
            i2 = (360 - i2) % 360;
        }
        return (i + i2) % 360;
    }

    /* renamed from: a */
    public static int m734a(int i, ffc ffc) {
        if (i == -1) {
            return 0;
        }
        Integer num = (Integer) ffc.mo1913a(CameraCharacteristics.LENS_FACING);
        Integer num2 = (Integer) ffc.mo1913a(CameraCharacteristics.SENSOR_ORIENTATION);
        if (num == null || num2 == null) {
            return 0;
        }
        boolean z;
        if (num.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        return axm.m733a(num2.intValue(), i, z);
    }

    /* renamed from: b */
    public final ilp m736b() {
        return ilq.m3817a(new gcc(this.f1013c), new axn(this));
    }
}
