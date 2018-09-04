package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fge */
public final class fge implements kwk {
    /* renamed from: a */
    private final kwk f15976a;

    private fge(kwk kwk) {
        this.f15976a = kwk;
    }

    /* renamed from: a */
    public static fge m10318a(kwk kwk) {
        return new fge(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ilp) ktm.m13963a(fds.m10246a(CaptureRequest.CONTROL_AE_MODE, (fgp) this.f15976a.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
