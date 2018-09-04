package p000;

import android.hardware.SensorManager;

/* compiled from: PG */
/* renamed from: bwn */
public final class bwn implements kwk {
    /* renamed from: a */
    private final kwk f11365a;
    /* renamed from: b */
    private final kwk f11366b;

    public bwn(kwk kwk, kwk kwk2) {
        this.f11365a = kwk;
        this.f11366b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object ccq;
        kwk kwk = this.f11365a;
        kbg kbg = (kbg) kwk.mo345a();
        SensorManager sensorManager = (SensorManager) this.f11366b.mo345a();
        if (kbg.mo2084b()) {
            bwo bwo = (bwo) kbg.mo2081a();
        } else {
            ccq = new ccq(sensorManager);
        }
        return (bwo) ktm.m13963a(ccq, "Cannot return null from a non-@Nullable @Provides method");
    }
}
