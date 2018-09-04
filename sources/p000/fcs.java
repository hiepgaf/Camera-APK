package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fcs */
public final class fcs implements kwk {
    /* renamed from: a */
    private final kwk f15868a;

    private fcs(kwk kwk) {
        this.f15868a = kwk;
    }

    /* renamed from: a */
    public static fcs m10201a(kwk kwk) {
        return new fcs(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ilp) ktm.m13963a(fds.m10246a(CaptureRequest.CONTROL_AE_REGIONS, (fbu) this.f15868a.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
