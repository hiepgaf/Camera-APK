package p000;

import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: PG */
/* renamed from: ele */
public final class ele extends HandlerThread {
    /* renamed from: a */
    private Handler f3922a = null;
    /* renamed from: b */
    private final /* synthetic */ int f3923b;
    /* renamed from: c */
    private final /* synthetic */ eld f3924c;

    public ele(eld eld, String str, int i) {
        this.f3924c = eld;
        this.f3923b = i;
        super(str);
    }

    protected final void onLooperPrepared() {
        this.f3922a = new Handler(getLooper());
        eld eld = this.f3924c;
        SensorManager sensorManager = eld.f3903d;
        sensorManager.registerListener(eld.f3919t, sensorManager.getDefaultSensor(1), 1, this.f3922a);
        eld = this.f3924c;
        sensorManager = eld.f3903d;
        sensorManager.registerListener(eld.f3919t, sensorManager.getDefaultSensor(4), this.f3923b, this.f3922a);
        eld = this.f3924c;
        sensorManager = eld.f3903d;
        sensorManager.registerListener(eld.f3919t, sensorManager.getDefaultSensor(2), 3, this.f3922a);
    }
}
