package p000;

import android.hardware.camera2.CameraCharacteristics;

/* compiled from: PG */
/* renamed from: duy */
public final class duy implements kwk {
    /* renamed from: a */
    private final kwk f14602a;
    /* renamed from: b */
    private final kwk f14603b;

    private duy(kwk kwk, kwk kwk2) {
        this.f14602a = kwk;
        this.f14603b = kwk2;
    }

    /* renamed from: a */
    public static duy m9432a(kwk kwk, kwk kwk2) {
        return new duy(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f14602a;
        return (duc) ktm.m13963a(new dua(((Integer) ((ffc) kwk.mo345a()).mo1913a(CameraCharacteristics.SENSOR_INFO_WHITE_LEVEL)).intValue(), (gjk) this.f14603b.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
