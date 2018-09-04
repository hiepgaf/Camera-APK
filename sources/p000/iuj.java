package p000;

import android.hardware.camera2.CameraManager;

/* compiled from: PG */
/* renamed from: iuj */
public final class iuj implements kwk {
    /* renamed from: a */
    private final kwk f18583a;
    /* renamed from: b */
    private final kwk f18584b;

    private iuj(kwk kwk, kwk kwk2) {
        this.f18583a = kwk;
        this.f18584b = kwk2;
    }

    /* renamed from: a */
    public static iuj m12464a(kwk kwk, kwk kwk2) {
        return new iuj(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return new iui((CameraManager) this.f18583a.mo345a(), (iuk) this.f18584b.mo345a());
    }
}
