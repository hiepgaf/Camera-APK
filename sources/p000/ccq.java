package p000;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ccq */
public final class ccq implements bwo, kwk {
    /* renamed from: a */
    public final List f11654a = new ArrayList(400);
    /* renamed from: b */
    public final iqr f11655b;
    /* renamed from: c */
    public int f11656c;
    /* renamed from: d */
    private final SensorManager f11657d;
    /* renamed from: e */
    private final Set f11658e;
    /* renamed from: f */
    private final SensorEventListener f11659f;
    /* renamed from: g */
    private final Sensor f11660g;

    public ccq(SensorManager sensorManager) {
        this.f11657d = sensorManager;
        this.f11660g = sensorManager.getDefaultSensor(4);
        for (int i = 0; i < 400; i++) {
            this.f11654a.add(new bwr(104, 1, 4, 0, -1, 0.0f, 0.0f, 0.0f));
        }
        this.f11656c = 0;
        this.f11659f = new bwu(this);
        this.f11658e = new HashSet();
        this.f11655b = new iqr(bws.f11367a, 400);
    }

    /* renamed from: a */
    public final synchronized void m8010a(bwp bwp) {
        if (this.f11658e.remove(bwp) && this.f11658e.isEmpty()) {
            m8007c();
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public final synchronized bwp mo606b() {
        bwp bwt;
        if (this.f11658e.isEmpty()) {
            m8008d();
        }
        bwt = new bwt(this);
        this.f11658e.add(bwt);
        return bwt;
    }

    /* renamed from: a */
    public static String m8006a(ccp ccp) {
        return (String) ktm.m13963a(ccp.f1841a.authority, "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    private final synchronized void m8007c() {
        this.f11657d.unregisterListener(this.f11659f);
    }

    /* renamed from: d */
    private final synchronized void m8008d() {
        this.f11657d.registerListener(this.f11659f, this.f11660g, 0);
    }
}
