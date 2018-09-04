package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: auu */
public final class auu implements kwk {
    /* renamed from: a */
    private final kwk f10318a;

    private auu(kwk kwk) {
        this.f10318a = kwk;
    }

    /* renamed from: a */
    public static auu m7035a(kwk kwk) {
        return new auu(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ilp) ktm.m13963a(fds.m10246a(CaptureRequest.CONTROL_AF_REGIONS, (fch) this.f10318a.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
