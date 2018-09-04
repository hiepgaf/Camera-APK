package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gke */
public final class gke implements SensorEventListener {
    /* renamed from: e */
    private static final String f5296e = bli.m862a("HeadingSensor");
    /* renamed from: a */
    public int f5297a;
    /* renamed from: b */
    public final SensorManager f5298b;
    /* renamed from: c */
    public final Sensor f5299c;
    /* renamed from: d */
    public final Sensor f5300d;
    /* renamed from: f */
    private final gki f5301f;
    /* renamed from: g */
    private final float[] f5302g;
    /* renamed from: h */
    private final float[] f5303h;
    /* renamed from: i */
    private final float[] f5304i;

    public gke(SensorManager sensorManager) {
        this(sensorManager, kpq.f8410a);
    }

    public gke(SensorManager sensorManager, Executor executor) {
        this.f5297a = -1;
        this.f5302g = new float[3];
        this.f5303h = new float[3];
        this.f5304i = new float[16];
        this.f5298b = sensorManager;
        this.f5301f = new gki(executor);
        this.f5299c = this.f5298b.getDefaultSensor(1);
        this.f5300d = this.f5298b.getDefaultSensor(2);
    }

    /* renamed from: a */
    public final void m2584a() {
        this.f5301f.execute(new gkf(this));
    }

    /* renamed from: b */
    public final void m2585b() {
        this.f5301f.execute(new gkg(this));
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            fArr = this.f5302g;
        } else if (type == 2) {
            fArr = this.f5303h;
        } else {
            bli.m873e(f5296e, String.format(null, "Unexpected sensor type %s", new Object[]{sensorEvent.sensor.getName()}));
            return;
        }
        for (int i = 0; i < 3; i++) {
            fArr[i] = sensorEvent.values[i];
        }
        fArr = new float[3];
        SensorManager.getRotationMatrix(this.f5304i, new float[3], this.f5302g, this.f5303h);
        SensorManager.getOrientation(this.f5304i, fArr);
        this.f5297a = ((int) (((double) (fArr[0] * 180.0f)) / 3.141592653589793d)) % 360;
        type = this.f5297a;
        if (type < 0) {
            this.f5297a = type + 360;
        }
    }
}
