package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: PG */
/* renamed from: elf */
final class elf implements SensorEventListener {
    /* renamed from: a */
    private final /* synthetic */ eld f3925a;

    elf(eld eld) {
        this.f3925a = eld;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        eld eld;
        float f;
        if (sensorEvent.sensor.getType() == 1) {
            eld = this.f3925a;
            eld.f3904e.m1784a(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
            if (eld.f3906g) {
                f = eld.f3907h;
                float f2 = 1.0f - f;
                ejk ejk = eld.f3905f;
                ejk.f3675a = (sensorEvent.values[0] * f) + (ejk.f3675a * f2);
                ejk.f3676b = (sensorEvent.values[1] * f) + (ejk.f3676b * f2);
                ejk.f3677c = (f * sensorEvent.values[2]) + (f2 * ejk.f3677c);
            } else {
                eld.f3905f.m1784a(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
                eld.f3906g = true;
            }
            eld = this.f3925a;
            if (eld.f3901b) {
                eld.f3913n.m1852a(sensorEvent.values, sensorEvent.timestamp);
            }
        } else if (sensorEvent.sensor.getType() == 2) {
            r0 = this.f3925a.f3908i;
            r0[0] = sensorEvent.values[0];
            r0[1] = sensorEvent.values[1];
            r0[2] = sensorEvent.values[2];
        } else if (sensorEvent.sensor.getType() == 4) {
            r0 = sensorEvent.values;
            f = r0[0];
            eld eld2 = this.f3925a;
            float[] fArr = eld2.f3911l;
            r0[0] = f - fArr[0];
            r0 = sensorEvent.values;
            r0[1] = r0[1] - fArr[1];
            r0 = sensorEvent.values;
            r0[2] = r0[2] - fArr[2];
            eld2.f3916q = ((sensorEvent.values[0] * sensorEvent.values[0]) + (sensorEvent.values[1] * sensorEvent.values[1])) + (sensorEvent.values[2] * sensorEvent.values[2]);
            emc emc = eld2.f3915p;
            if (emc != null) {
                emc.mo1141a(Float.valueOf(eld2.f3916q));
            }
            eld eld3 = this.f3925a;
            long j = eld3.f3909j;
            if (j != 0) {
                float f3 = ((float) (sensorEvent.timestamp - j)) * 1.0E-9f;
                synchronized (eld3) {
                    float[] fArr2 = eld3.f3910k;
                    fArr2[0] = fArr2[0] + (sensorEvent.values[0] * f3);
                    fArr2[1] = fArr2[1] + (sensorEvent.values[1] * f3);
                    fArr2[2] = (f3 * sensorEvent.values[2]) + fArr2[2];
                    eld3.f3912m++;
                }
            }
            eld3.f3909j = sensorEvent.timestamp;
            eld = this.f3925a;
            if (eld.f3901b) {
                eld.f3913n.m1854b(sensorEvent.values, sensorEvent.timestamp);
            }
        }
    }
}
