package p000;

import android.hardware.camera2.CaptureResult;
import android.location.Location;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.camera.exif.ExifInterface;

/* compiled from: PG */
/* renamed from: itg */
public final class itg {
    /* renamed from: b */
    private static final double f7453b = Math.log(2.0d);
    /* renamed from: c */
    private static final Long f7454c = Long.valueOf(1000);
    /* renamed from: a */
    public final ExifInterface f7455a;

    public itg(ExifInterface exifInterface) {
        this.f7455a = exifInterface;
    }

    /* renamed from: a */
    private final void m4198a(int i, Object obj) {
        if (obj != null) {
            ExifInterface exifInterface = this.f7455a;
            exifInterface.m8480a(exifInterface.m8479a(i, obj));
        }
    }

    /* renamed from: a */
    public final void m4200a(Location location) {
        Object obj;
        ExifInterface exifInterface = this.f7455a;
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        ite a = exifInterface.m8479a(ExifInterface.f12371E, ExifInterface.m8473a(latitude));
        ite a2 = exifInterface.m8479a(ExifInterface.f12373G, ExifInterface.m8473a(longitude));
        int i = ExifInterface.f12370D;
        if (latitude >= 0.0d) {
            obj = "N";
        } else {
            obj = "S";
        }
        ite a3 = exifInterface.m8479a(i, obj);
        int i2 = ExifInterface.f12372F;
        if (longitude >= 0.0d) {
            obj = "E";
        } else {
            obj = "W";
        }
        ite a4 = exifInterface.m8479a(i2, obj);
        if (!(a == null || a2 == null || a3 == null || a4 == null)) {
            exifInterface.m8480a(a);
            exifInterface.m8480a(a2);
            exifInterface.m8480a(a3);
            exifInterface.m8480a(a4);
        }
        ExifInterface exifInterface2 = this.f7455a;
        long time = location.getTime();
        ite a5 = exifInterface2.m8479a(ExifInterface.f12379M, exifInterface2.f12417Q.format(Long.valueOf(time)));
        if (a5 != null) {
            exifInterface2.m8480a(a5);
            exifInterface2.f12418R.setTimeInMillis(time);
            a5 = exifInterface2.m8479a(ExifInterface.f12376J, new iqn[]{new iqn((long) exifInterface2.f12418R.get(11), 1), new iqn((long) exifInterface2.f12418R.get(12), 1), new iqn((long) exifInterface2.f12418R.get(13), 1)});
            if (a5 != null) {
                exifInterface2.m8480a(a5);
            }
        }
        if (location.hasAltitude()) {
            byte b;
            exifInterface = this.f7455a;
            latitude = location.getAltitude();
            ite a6 = exifInterface.m8479a(ExifInterface.f12375I, new iqn((long) ((int) (Math.abs(latitude) * ((double) ExifInterface.f12380O.longValue()))), ExifInterface.f12380O.longValue()));
            if (latitude >= 0.0d) {
                b = (byte) 0;
            } else {
                b = (byte) 1;
            }
            a4 = exifInterface.m8479a(ExifInterface.f12374H, Byte.valueOf(b));
            if (a6 != null && a4 != null) {
                exifInterface.m8480a(a6);
                exifInterface.m8480a(a4);
            }
        }
    }

    /* renamed from: a */
    public static itg m4197a() {
        return new itg(new ExifInterface());
    }

    /* renamed from: a */
    public static ExifInterface m4194a(byte[] bArr) {
        ExifInterface exifInterface = new ExifInterface();
        try {
            exifInterface.m8485a(bArr);
        } catch (Throwable e) {
            Log.w("CAM_CameraExif", "Failed to read EXIF data", e);
        }
        return exifInterface;
    }

    /* renamed from: a */
    public final void m4199a(int i, int i2, iqm iqm, kbg kbg) {
        m4198a(ExifInterface.f12392d, Build.MANUFACTURER);
        m4198a(ExifInterface.f12393e, Build.MODEL);
        ExifInterface exifInterface = this.f7455a;
        int i3 = ExifInterface.f12412x;
        Object valueOf = Integer.valueOf(i);
        exifInterface.m8480a(exifInterface.m8479a(i3, valueOf));
        exifInterface = this.f7455a;
        i3 = ExifInterface.f12413y;
        Object valueOf2 = Integer.valueOf(i2);
        exifInterface.m8480a(exifInterface.m8479a(i3, valueOf2));
        exifInterface = this.f7455a;
        exifInterface.m8480a(exifInterface.m8479a(ExifInterface.f12389a, valueOf));
        exifInterface = this.f7455a;
        exifInterface.m8480a(exifInterface.m8479a(ExifInterface.f12390b, valueOf2));
        exifInterface = this.f7455a;
        exifInterface.m8480a(exifInterface.m8479a(ExifInterface.f12395g, Short.valueOf(isx.m4160a(iqm).f7408b)));
        if (kbg.mo2084b()) {
            iwp iwp = (iwp) kbg.mo2081a();
            Long valueOf3 = Long.valueOf(1000000000);
            Long valueOf4 = Long.valueOf(100);
            Long valueOf5 = Long.valueOf(1000);
            Long l = (Long) iwp.mo3143a(CaptureResult.SENSOR_EXPOSURE_TIME);
            int i4 = ExifInterface.f12402n;
            if (l != null) {
                valueOf = new iqn(l.longValue(), valueOf3.longValue());
            } else {
                valueOf = null;
            }
            m4198a(i4, valueOf);
            if (l != null) {
                m4198a(ExifInterface.f12405q, itg.m4195a(Double.valueOf(Math.log(Double.valueOf(((double) l.longValue()) / ((double) valueOf3.longValue())).doubleValue()) / f7453b), valueOf4));
            }
            Object obj = (Integer) iwp.mo3143a(CaptureResult.SENSOR_SENSITIVITY);
            if (obj != null) {
                Integer num = (Integer) iwp.mo3143a(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
                if (num != null) {
                    obj = Integer.valueOf(obj.intValue() * (num.intValue() / 100));
                }
                m4198a(ExifInterface.f12404p, obj);
            }
            Float f = (Float) iwp.mo3143a(CaptureResult.LENS_APERTURE);
            m4198a(ExifInterface.f12403o, itg.m4196a(f, valueOf4));
            if (f != null) {
                if (f != null) {
                    obj = Double.valueOf(Math.log((double) f.floatValue()) / f7453b);
                } else {
                    obj = null;
                }
                double doubleValue = ((Double) jri.m13152b(obj)).doubleValue();
                m4198a(ExifInterface.f12406r, itg.m4195a(Double.valueOf(doubleValue + doubleValue), valueOf4));
            }
            m4198a(ExifInterface.f12410v, itg.m4196a((Float) iwp.mo3143a(CaptureResult.LENS_FOCAL_LENGTH), valueOf5));
            Integer num2 = (Integer) iwp.mo3143a(CaptureResult.FLASH_STATE);
            if (num2 == null || num2.intValue() != 3) {
                m4198a(ExifInterface.f12409u, Short.valueOf((short) 0));
            } else {
                m4198a(ExifInterface.f12409u, Short.valueOf((short) 1));
            }
            Float f2 = (Float) iwp.mo3143a(CaptureResult.LENS_FOCUS_DISTANCE);
            if (f2 != null) {
                short s;
                if (f2.floatValue() > 1.0E-6f) {
                    float floatValue = 1.0f / f2.floatValue();
                    obj = itg.m4196a(Float.valueOf(floatValue), f7454c);
                    s = floatValue >= 1.0f ? floatValue >= 3.0f ? (short) 3 : (short) 2 : (short) 1;
                } else if (f2.floatValue() >= 0.0f) {
                    obj = new iqn(-1, 1);
                    s = (short) 3;
                } else {
                    obj = new iqn(0, 1);
                    s = (short) 0;
                }
                m4198a(ExifInterface.f12408t, obj);
                m4198a(ExifInterface.f12369C, Short.valueOf(s));
            }
        }
    }

    /* renamed from: a */
    private static iqn m4195a(Double d, Long l) {
        return (d == null || l == null) ? null : new iqn((long) (d.doubleValue() * ((double) l.longValue())), l.longValue());
    }

    /* renamed from: a */
    private static iqn m4196a(Float f, Long l) {
        return (f == null || l == null) ? null : new iqn((long) (f.floatValue() * ((float) l.longValue())), l.longValue());
    }
}
