package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fgk */
public final class fgk implements kwk {
    /* renamed from: a */
    private final kwk f15982a;

    private fgk(kwk kwk) {
        this.f15982a = kwk;
    }

    /* renamed from: a */
    public static fgk m10329a(kwk kwk) {
        return new fgk(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ilp) ktm.m13963a(fds.m10246a(CaptureRequest.CONTROL_AWB_MODE, ((fer) this.f15982a.mo345a()).f23177a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
