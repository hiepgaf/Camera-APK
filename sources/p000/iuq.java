package p000;

import android.hardware.camera2.CameraManager;

/* compiled from: PG */
/* renamed from: iuq */
public final class iuq implements kwk {
    /* renamed from: a */
    private final kwk f18597a;
    /* renamed from: b */
    private final kwk f18598b;
    /* renamed from: c */
    private final kwk f18599c;

    private iuq(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f18597a = kwk;
        this.f18598b = kwk2;
        this.f18599c = kwk3;
    }

    /* renamed from: a */
    public static iuq m12509a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new iuq(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return new iup((CameraManager) this.f18597a.mo345a(), (iui) this.f18598b.mo345a(), (iqz) this.f18599c.mo345a());
    }
}
