package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fgs */
public final class fgs implements kwk {
    /* renamed from: a */
    private final kwk f15999a;

    private fgs(kwk kwk) {
        this.f15999a = kwk;
    }

    /* renamed from: a */
    public static fgs m10340a(kwk kwk) {
        return new fgs(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ilp) ktm.m13963a(fds.m10246a(CaptureRequest.CONTROL_AE_LOCK, ((fbr) this.f15999a.mo345a()).f4462a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
