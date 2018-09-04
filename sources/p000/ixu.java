package p000;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: ixu */
public final class ixu implements ixq {
    /* renamed from: a */
    private final ixr f18658a;
    /* renamed from: b */
    private final Object f18659b = new Object();
    /* renamed from: c */
    private final float[] f18660c = new float[3];

    public ixu(ixr ixr) {
        this.f18658a = ixr;
    }

    /* renamed from: b */
    private final float m12667b(iwp iwp) {
        Long l = (Long) iwp.mo3143a(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return Float.NaN;
        }
        synchronized (this.f18659b) {
            if (this.f18658a.m4328a(l.longValue(), this.f18660c)) {
                float[] fArr = this.f18660c;
                float f = fArr[0];
                f *= f;
                float f2 = fArr[1];
                f += f2 * f2;
                float f3 = fArr[2];
                f3 = (float) Math.sqrt((double) ((f3 * f3) + f));
                return f3;
            }
            return Float.NaN;
        }
    }

    /* renamed from: a */
    public final float mo1961a(iwp iwp) {
        float longValue;
        Long l = (Long) iwp.mo3143a(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            longValue = (float) l.longValue();
        } else {
            longValue = Float.NaN;
        }
        return (float) Math.exp((double) ((longValue * -5.0E-7f) * m12667b(iwp)));
    }
}
