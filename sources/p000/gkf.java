package p000;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: gkf */
final /* synthetic */ class gkf implements Runnable {
    /* renamed from: a */
    private final gke f5305a;

    gkf(gke gke) {
        this.f5305a = gke;
    }

    public final void run() {
        SensorEventListener sensorEventListener = this.f5305a;
        Sensor sensor = sensorEventListener.f5299c;
        if (sensor != null) {
            sensorEventListener.f5298b.registerListener(sensorEventListener, sensor, 3);
        }
        sensor = sensorEventListener.f5300d;
        if (sensor != null) {
            sensorEventListener.f5298b.registerListener(sensorEventListener, sensor, 3);
        }
    }
}
