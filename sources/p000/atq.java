package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: atq */
public final class atq implements kwk {
    /* renamed from: a */
    private final kwk f10221a;

    private atq(kwk kwk) {
        this.f10221a = kwk;
    }

    /* renamed from: a */
    public static atq m6989a(kwk kwk) {
        return new atq(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ilp) ktm.m13963a(fds.m10246a(CaptureRequest.CONTROL_AF_REGIONS, (fch) this.f10221a.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
