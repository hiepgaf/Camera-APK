package p000;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: gkg */
final /* synthetic */ class gkg implements Runnable {
    /* renamed from: a */
    private final gke f5306a;

    gkg(gke gke) {
        this.f5306a = gke;
    }

    public final void run() {
        SensorEventListener sensorEventListener = this.f5306a;
        Sensor sensor = sensorEventListener.f5299c;
        if (sensor != null) {
            sensorEventListener.f5298b.unregisterListener(sensorEventListener, sensor);
        }
        sensor = sensorEventListener.f5300d;
        if (sensor != null) {
            sensorEventListener.f5298b.unregisterListener(sensorEventListener, sensor);
        }
    }
}
