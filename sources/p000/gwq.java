package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: gwq */
final class gwq implements SensorEventListener {
    /* renamed from: a */
    private final /* synthetic */ Vibrator f5731a;
    /* renamed from: b */
    private final /* synthetic */ BottomBarController f5732b;
    /* renamed from: c */
    private final /* synthetic */ gwp f5733c;

    gwq(gwp gwp, Vibrator vibrator, BottomBarController bottomBarController) {
        this.f5733c = gwp;
        this.f5731a = vibrator;
        this.f5732b = bottomBarController;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f5733c.f17484h.mo1609j();
        if (this.f5731a.hasVibrator()) {
            this.f5731a.vibrate(gwp.f17477a, -1);
        }
        this.f5732b.switchCamera();
    }
}
