package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fgb */
public final class fgb implements kwk {
    /* renamed from: a */
    private final kwk f15973a;

    private fgb(kwk kwk) {
        this.f15973a = kwk;
    }

    /* renamed from: a */
    public static fgb m10313a(kwk kwk) {
        return new fgb(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ilp) ktm.m13963a(fds.m10246a(CaptureRequest.CONTROL_SCENE_MODE, (fgn) this.f15973a.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
