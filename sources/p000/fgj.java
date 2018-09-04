package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fgj */
public final class fgj implements kwk {
    /* renamed from: a */
    private final kwk f15981a;

    private fgj(kwk kwk) {
        this.f15981a = kwk;
    }

    /* renamed from: a */
    public static fgj m10327a(kwk kwk) {
        return new fgj(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ilp) ktm.m13963a(fds.m10246a(CaptureRequest.STATISTICS_FACE_DETECT_MODE, (fgy) this.f15981a.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
