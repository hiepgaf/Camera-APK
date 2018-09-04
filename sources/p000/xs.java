package p000;

import android.hardware.camera2.CameraCharacteristics;

/* compiled from: PG */
/* renamed from: xs */
final class xs extends abh {
    /* renamed from: a */
    private CameraCharacteristics f19695a;

    xs(CameraCharacteristics cameraCharacteristics) {
        this.f19695a = cameraCharacteristics;
    }

    /* renamed from: a */
    public final int mo2551a() {
        return ((Integer) this.f19695a.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
    }

    /* renamed from: b */
    public final boolean mo2552b() {
        return ((Integer) this.f19695a.get(CameraCharacteristics.LENS_FACING)).equals(Integer.valueOf(1));
    }

    /* renamed from: c */
    public final boolean mo2553c() {
        return ((Integer) this.f19695a.get(CameraCharacteristics.LENS_FACING)).equals(Integer.valueOf(0));
    }
}
