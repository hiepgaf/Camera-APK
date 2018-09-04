package p000;

import android.hardware.Sensor;
import android.hardware.SensorDirectChannel;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: cci */
public final class cci implements kwk {
    /* renamed from: a */
    public final cdi f11635a;
    /* renamed from: b */
    public final SensorDirectChannel f11636b;
    /* renamed from: c */
    public final Sensor f11637c;
    /* renamed from: d */
    public final ccl f11638d;

    public cci(cdi cdi, SensorDirectChannel sensorDirectChannel, Sensor sensor, ccl ccl) {
        this.f11635a = cdi;
        this.f11636b = sensorDirectChannel;
        this.f11637c = sensor;
        this.f11638d = ccl;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public static float m7987a(byte[] bArr, int i) {
        return Float.intBitsToFloat(cci.m7988b(bArr, i));
    }

    /* renamed from: b */
    public static int m7988b(byte[] bArr, int i) {
        return (((bArr[i] & Illuminant.kOther) | ((bArr[i + 1] & Illuminant.kOther) << 8)) | ((bArr[i + 2] & Illuminant.kOther) << 16)) | ((bArr[i + 3] & Illuminant.kOther) << 24);
    }

    /* renamed from: c */
    public static long m7989c(byte[] bArr, int i) {
        return ((long) cci.m7988b(bArr, i + 12)) & 4294967295L;
    }

    /* renamed from: d */
    public static long m7990d(byte[] bArr, int i) {
        int i2 = i + 16;
        return (((long) (bArr[i2 + 7] & Illuminant.kOther)) << 56) + ((((((((long) (bArr[i2] & Illuminant.kOther)) + (((long) (bArr[i2 + 1] & Illuminant.kOther)) << 8)) + (((long) (bArr[i2 + 2] & Illuminant.kOther)) << 16)) + (((long) (bArr[i2 + 3] & Illuminant.kOther)) << 24)) + (((long) (bArr[i2 + 4] & Illuminant.kOther)) << 32)) + (((long) (bArr[i2 + 5] & Illuminant.kOther)) << 40)) + (((long) (bArr[i2 + 6] & Illuminant.kOther)) << 48));
    }
}
