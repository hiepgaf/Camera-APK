package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fgd */
public final class fgd implements kwk {
    /* renamed from: a */
    private final kwk f15975a;

    private fgd(kwk kwk) {
        this.f15975a = kwk;
    }

    /* renamed from: a */
    public static fgd m10316a(kwk kwk) {
        return new fgd(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ilp) ktm.m13963a(fds.m10246a(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, ((fbr) this.f15975a.mo345a()).f4463b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
