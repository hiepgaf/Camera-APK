package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fgh */
public final class fgh implements kwk {
    /* renamed from: a */
    private final kwk f15979a;

    private fgh(kwk kwk) {
        this.f15979a = kwk;
    }

    /* renamed from: a */
    public static fgh m10323a(kwk kwk) {
        return new fgh(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ilp) ktm.m13963a(fds.m10246a(CaptureRequest.JPEG_ORIENTATION, ((axm) this.f15979a.mo345a()).m736b()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
