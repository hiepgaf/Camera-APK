package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fga */
public final class fga implements kwk {
    /* renamed from: a */
    private final kwk f15972a;

    private fga(kwk kwk) {
        this.f15972a = kwk;
    }

    /* renamed from: a */
    public static fga m10311a(kwk kwk) {
        return new fga(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ilp) ktm.m13963a(fds.m10246a(CaptureRequest.CONTROL_MODE, (fgl) this.f15972a.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
