package p000;

import android.hardware.HardwareBuffer;
import android.hardware.Sensor;
import android.hardware.SensorDirectChannel;
import android.hardware.SensorManager;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bxq */
public final class bxq implements bwo {
    /* renamed from: a */
    public cci f11418a = null;
    /* renamed from: b */
    private final SensorManager f11419b;
    /* renamed from: c */
    private final Set f11420c = new HashSet();

    public bxq(SensorManager sensorManager) {
        this.f11419b = sensorManager;
    }

    /* renamed from: a */
    public final synchronized void m7851a(bwp bwp) {
        if (this.f11420c.remove(bwp) && this.f11420c.isEmpty()) {
            m7849a();
        }
    }

    /* renamed from: b */
    public final synchronized bwp mo606b() {
        bwp bwh;
        if (this.f11420c.isEmpty()) {
            m7850c();
        }
        bwh = new bwh(this);
        this.f11420c.add(bwh);
        return bwh;
    }

    /* renamed from: a */
    private final synchronized void m7849a() {
        cci cci = this.f11418a;
        if (cci != null) {
            cci.f11636b.configure(cci.f11637c, 0);
            cci.f11636b.close();
            cci.f11635a.f1847a.close();
            this.f11418a = null;
        } else {
            bli.m873e("FastGyroProvider", "Tried to close sensor hardware which was already stopped");
        }
    }

    /* renamed from: c */
    private final synchronized void m7850c() {
        if (this.f11418a != null) {
            bli.m873e("FastGyroProvider", "Tried to open sensor hardware which was already running");
        } else {
            HardwareBuffer create = HardwareBuffer.create(41600, 1, 33, 1, 25165827);
            cdi cdi = new cdi(create);
            ccl ccl = new ccl(cdi);
            SensorDirectChannel createDirectChannel = this.f11419b.createDirectChannel(create);
            if (createDirectChannel == null) {
                throw new RuntimeException("Unable to open SensorDirectChannel");
            }
            Sensor defaultSensor = this.f11419b.getDefaultSensor(4);
            if (defaultSensor == null) {
                throw new RuntimeException("Unable to retrieve gyro sensor");
            } else if (createDirectChannel.configure(defaultSensor, 2) == 0) {
                throw new RuntimeException("Unable to start direct channel");
            } else {
                this.f11418a = new cci(cdi, createDirectChannel, defaultSensor, ccl);
            }
        }
    }
}
