package p000;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: dua */
public final class dua implements duc {
    /* renamed from: a */
    private static final String f14542a = bli.m862a("BrightnessMtrMetric");
    /* renamed from: b */
    private final int f14543b;
    /* renamed from: c */
    private int f14544c;
    /* renamed from: d */
    private final gjk f14545d;
    /* renamed from: e */
    private float f14546e = -1.0f;

    public dua(int i, gjk gjk) {
        this.f14543b = i;
        this.f14545d = gjk;
    }

    /* renamed from: a */
    public final float mo1174a(iwp iwp) {
        Object valueOf;
        String str;
        int i;
        String valueOf2;
        String valueOf3;
        StringBuilder stringBuilder;
        float longValue;
        float intValue;
        float floatValue;
        int intValue2 = ((Integer) iwp.mo3143a(CaptureResult.CONTROL_AE_MODE)).intValue();
        if (intValue2 == 0 || intValue2 == 5 || !this.f14545d.f16978c.isDone()) {
            return this.f14546e;
        }
        Long l = (Long) iwp.mo3143a(CaptureResult.SENSOR_TIMESTAMP);
        try {
            valueOf = Long.valueOf(((gkc) this.f14545d.f16978c.get()).f5280a);
            try {
                if (((float) this.f14544c) >= 20.0f) {
                    str = f14542a;
                    i = this.f14544c;
                    StringBuilder stringBuilder2 = new StringBuilder(41);
                    stringBuilder2.append("Timeout after skipping ");
                    stringBuilder2.append(i);
                    stringBuilder2.append(" frames");
                    bli.m863a(str, stringBuilder2.toString());
                    this.f14545d.f16978c.cancel(false);
                } else if (l != null) {
                    if (l.longValue() < valueOf.longValue() + 500000000) {
                        this.f14544c++;
                        return this.f14546e;
                    }
                }
            } catch (InterruptedException e) {
                try {
                    bli.m866b(f14542a, "Selfie flash off future interrupted, continuing to compute BMM");
                    if (this.f14544c > 0) {
                        str = f14542a;
                        i = this.f14544c;
                        valueOf2 = String.valueOf(valueOf);
                        valueOf3 = String.valueOf(l);
                        stringBuilder = new StringBuilder((String.valueOf(valueOf2).length() + 60) + String.valueOf(valueOf3).length());
                        stringBuilder.append("skipped ");
                        stringBuilder.append(i);
                        stringBuilder.append(", selfie flash off time: ");
                        stringBuilder.append(valueOf2);
                        stringBuilder.append(", current time: ");
                        stringBuilder.append(valueOf3);
                        bli.m863a(str, stringBuilder.toString());
                    }
                    this.f14544c = 0;
                    longValue = (float) ((Long) iwp.mo3143a(CaptureResult.SENSOR_EXPOSURE_TIME)).longValue();
                    intValue = ((float) ((Integer) iwp.mo3143a(CaptureResult.SENSOR_SENSITIVITY)).intValue()) * (((float) ((Integer) iwp.mo3143a(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)).intValue()) / 100.0f);
                    floatValue = ((Float) iwp.mo3143a(CaptureResult.LENS_APERTURE)).floatValue();
                    floatValue = (floatValue * ((((float) this.f14543b) * 1.80000013E9f) * floatValue)) / (longValue * intValue);
                    this.f14546e = floatValue;
                    return floatValue;
                } catch (NullPointerException e2) {
                    return -1.0f;
                }
            } catch (ExecutionException e3) {
                bli.m866b(f14542a, "Selfie flash off future interrupted, continuing to compute BMM");
                if (this.f14544c > 0) {
                    str = f14542a;
                    i = this.f14544c;
                    valueOf2 = String.valueOf(valueOf);
                    valueOf3 = String.valueOf(l);
                    stringBuilder = new StringBuilder((String.valueOf(valueOf2).length() + 60) + String.valueOf(valueOf3).length());
                    stringBuilder.append("skipped ");
                    stringBuilder.append(i);
                    stringBuilder.append(", selfie flash off time: ");
                    stringBuilder.append(valueOf2);
                    stringBuilder.append(", current time: ");
                    stringBuilder.append(valueOf3);
                    bli.m863a(str, stringBuilder.toString());
                }
                this.f14544c = 0;
                longValue = (float) ((Long) iwp.mo3143a(CaptureResult.SENSOR_EXPOSURE_TIME)).longValue();
                intValue = ((float) ((Integer) iwp.mo3143a(CaptureResult.SENSOR_SENSITIVITY)).intValue()) * (((float) ((Integer) iwp.mo3143a(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)).intValue()) / 100.0f);
                floatValue = ((Float) iwp.mo3143a(CaptureResult.LENS_APERTURE)).floatValue();
                floatValue = (floatValue * ((((float) this.f14543b) * 1.80000013E9f) * floatValue)) / (longValue * intValue);
                this.f14546e = floatValue;
                return floatValue;
            }
        } catch (InterruptedException e4) {
            valueOf = null;
            bli.m866b(f14542a, "Selfie flash off future interrupted, continuing to compute BMM");
            if (this.f14544c > 0) {
                str = f14542a;
                i = this.f14544c;
                valueOf2 = String.valueOf(valueOf);
                valueOf3 = String.valueOf(l);
                stringBuilder = new StringBuilder((String.valueOf(valueOf2).length() + 60) + String.valueOf(valueOf3).length());
                stringBuilder.append("skipped ");
                stringBuilder.append(i);
                stringBuilder.append(", selfie flash off time: ");
                stringBuilder.append(valueOf2);
                stringBuilder.append(", current time: ");
                stringBuilder.append(valueOf3);
                bli.m863a(str, stringBuilder.toString());
            }
            this.f14544c = 0;
            longValue = (float) ((Long) iwp.mo3143a(CaptureResult.SENSOR_EXPOSURE_TIME)).longValue();
            intValue = ((float) ((Integer) iwp.mo3143a(CaptureResult.SENSOR_SENSITIVITY)).intValue()) * (((float) ((Integer) iwp.mo3143a(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)).intValue()) / 100.0f);
            floatValue = ((Float) iwp.mo3143a(CaptureResult.LENS_APERTURE)).floatValue();
            floatValue = (floatValue * ((((float) this.f14543b) * 1.80000013E9f) * floatValue)) / (longValue * intValue);
            this.f14546e = floatValue;
            return floatValue;
        } catch (ExecutionException e5) {
            valueOf = null;
            bli.m866b(f14542a, "Selfie flash off future interrupted, continuing to compute BMM");
            if (this.f14544c > 0) {
                str = f14542a;
                i = this.f14544c;
                valueOf2 = String.valueOf(valueOf);
                valueOf3 = String.valueOf(l);
                stringBuilder = new StringBuilder((String.valueOf(valueOf2).length() + 60) + String.valueOf(valueOf3).length());
                stringBuilder.append("skipped ");
                stringBuilder.append(i);
                stringBuilder.append(", selfie flash off time: ");
                stringBuilder.append(valueOf2);
                stringBuilder.append(", current time: ");
                stringBuilder.append(valueOf3);
                bli.m863a(str, stringBuilder.toString());
            }
            this.f14544c = 0;
            longValue = (float) ((Long) iwp.mo3143a(CaptureResult.SENSOR_EXPOSURE_TIME)).longValue();
            intValue = ((float) ((Integer) iwp.mo3143a(CaptureResult.SENSOR_SENSITIVITY)).intValue()) * (((float) ((Integer) iwp.mo3143a(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)).intValue()) / 100.0f);
            floatValue = ((Float) iwp.mo3143a(CaptureResult.LENS_APERTURE)).floatValue();
            floatValue = (floatValue * ((((float) this.f14543b) * 1.80000013E9f) * floatValue)) / (longValue * intValue);
            this.f14546e = floatValue;
            return floatValue;
        }
        if (this.f14544c > 0) {
            str = f14542a;
            i = this.f14544c;
            valueOf2 = String.valueOf(valueOf);
            valueOf3 = String.valueOf(l);
            stringBuilder = new StringBuilder((String.valueOf(valueOf2).length() + 60) + String.valueOf(valueOf3).length());
            stringBuilder.append("skipped ");
            stringBuilder.append(i);
            stringBuilder.append(", selfie flash off time: ");
            stringBuilder.append(valueOf2);
            stringBuilder.append(", current time: ");
            stringBuilder.append(valueOf3);
            bli.m863a(str, stringBuilder.toString());
        }
        this.f14544c = 0;
        longValue = (float) ((Long) iwp.mo3143a(CaptureResult.SENSOR_EXPOSURE_TIME)).longValue();
        intValue = ((float) ((Integer) iwp.mo3143a(CaptureResult.SENSOR_SENSITIVITY)).intValue()) * (((float) ((Integer) iwp.mo3143a(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)).intValue()) / 100.0f);
        floatValue = ((Float) iwp.mo3143a(CaptureResult.LENS_APERTURE)).floatValue();
        floatValue = (floatValue * ((((float) this.f14543b) * 1.80000013E9f) * floatValue)) / (longValue * intValue);
        this.f14546e = floatValue;
        return floatValue;
    }
}
