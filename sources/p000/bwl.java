package p000;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.google.android.apps.camera.jni.gyro.ReadHardwareBufferJniFunctions;

/* compiled from: PG */
/* renamed from: bwl */
public final class bwl implements kwk {
    /* renamed from: a */
    private final kwk f11362a;
    /* renamed from: b */
    private final kwk f11363b;

    public bwl(kwk kwk, kwk kwk2) {
        this.f11362a = kwk;
        this.f11363b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object c;
        SensorManager sensorManager = (SensorManager) this.f11362a.mo345a();
        if (((ivx) this.f11363b.mo345a()).f7502c) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(4);
            Object obj = defaultSensor != null ? defaultSensor.isDirectChannelTypeSupported(2) ? defaultSensor.getHighestDirectReportRateLevel() >= 2 ? ReadHardwareBufferJniFunctions.isSupported() ? 1 : null : null : null : null;
            if (obj != null) {
                c = kbg.m4745c(new bxq(sensorManager));
                return (kbg) ktm.m13963a(c, "Cannot return null from a non-@Nullable @Provides method");
            }
        }
        c = kau.f19138a;
        return (kbg) ktm.m13963a(c, "Cannot return null from a non-@Nullable @Provides method");
    }
}
