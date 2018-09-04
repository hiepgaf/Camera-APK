package p000;

import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.jni.gyro.ReadHardwareBufferJniFunctions;

/* compiled from: PG */
/* renamed from: cdi */
public final class cdi {
    /* renamed from: a */
    public final HardwareBuffer f1847a;

    public cdi(HardwareBuffer hardwareBuffer) {
        this.f1847a = hardwareBuffer;
    }

    /* renamed from: a */
    public final boolean m1114a(byte[] bArr, int i, int i2, int i3) {
        return ReadHardwareBufferJniFunctions.readHardwareBuffer(this.f1847a, bArr, i, i2, i3);
    }
}
