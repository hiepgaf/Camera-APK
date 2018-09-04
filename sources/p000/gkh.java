package p000;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* compiled from: PG */
/* renamed from: gkh */
public final class gkh {
    /* renamed from: a */
    private final SensorManager f5307a;
    /* renamed from: b */
    private final Sensor f5308b;

    public gkh(Context context) {
        this.f5307a = (SensorManager) context.getSystemService("sensor");
        for (Sensor sensor : this.f5307a.getSensorList(-1)) {
            if ("Double Twist".equals(sensor.getName()) && "Google".equals(sensor.getVendor())) {
                break;
            }
        }
        Sensor sensor2 = null;
        this.f5308b = sensor2;
    }

    /* renamed from: a */
    public final boolean m2586a(SensorEventListener sensorEventListener) {
        Sensor sensor = this.f5308b;
        if (sensor == null || !this.f5307a.registerListener(sensorEventListener, sensor, 3)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void m2587b(SensorEventListener sensorEventListener) {
        Sensor sensor = this.f5308b;
        if (sensor != null) {
            this.f5307a.unregisterListener(sensorEventListener, sensor);
        }
    }
}
