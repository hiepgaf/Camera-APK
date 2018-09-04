package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fdi */
public final class fdi implements kwk {
    /* renamed from: a */
    private final kwk f15883a;

    private fdi(kwk kwk) {
        this.f15883a = kwk;
    }

    /* renamed from: a */
    public static fdi m10225a(kwk kwk) {
        return new fdi(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ilp) ktm.m13963a(fds.m10246a(CaptureRequest.CONTROL_AF_MODE, ilq.m3817a((ilb) this.f15883a.mo345a(), new fcq())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
