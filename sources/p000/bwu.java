package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: PG */
/* renamed from: bwu */
public final class bwu implements SensorEventListener {
    /* renamed from: a */
    private long f1665a = 1;
    /* renamed from: b */
    private final /* synthetic */ ccq f1666b;

    public bwu(ccq ccq) {
        this.f1666b = ccq;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor != null && sensorEvent.sensor.getType() == 4) {
            float[] fArr = sensorEvent.values;
            synchronized (this.f1666b) {
                ccq ccq = this.f1666b;
                bwr bwr = (bwr) ccq.f11654a.get(ccq.f11656c);
                long j = this.f1665a;
                this.f1665a = 1 + j;
                bwr.f1660d = j;
                bwr.f1661e = sensorEvent.timestamp;
                bwr.f1662f = fArr[0];
                bwr.f1663g = fArr[1];
                bwr.f1664h = fArr[2];
                ccq = this.f1666b;
                ccq.f11656c = (ccq.f11656c + 1) % 400;
            }
        }
    }
}
