package p000;

import android.hardware.camera2.CameraManager;

/* compiled from: PG */
/* renamed from: ccg */
public final class ccg implements kwk {
    /* renamed from: a */
    private final kwk f11633a;

    private ccg(kwk kwk) {
        this.f11633a = kwk;
    }

    /* renamed from: a */
    public static ccg m7984a(kwk kwk) {
        return new ccg(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (CameraManager) ktm.m13963a((CameraManager) ((ccb) this.f11633a.mo345a()).m1103a("camera"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
