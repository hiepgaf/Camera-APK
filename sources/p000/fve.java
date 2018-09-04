package p000;

import com.google.googlex.gcam.androidutils.camera2.BlockingCameraManager;

/* compiled from: PG */
/* renamed from: fve */
public final class fve implements kwk {
    /* renamed from: a */
    private final kwk f16557a;

    private fve(kwk kwk) {
        this.f16557a = kwk;
    }

    /* renamed from: a */
    public static fve m10805a(kwk kwk) {
        return new fve(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        fvh fvh = (fvh) this.f16557a.mo345a();
        ikb ikb = new ikb();
        iqo b = fvh.mo1880b();
        b.mo1879a(new bbx(new bbv("DelLifetime", BlockingCameraManager.OPEN_TIME_OUT_MS), ikb));
        ikb.mo1879a(b);
        return (ikb) ktm.m13963a(ikb, "Cannot return null from a non-@Nullable @Provides method");
    }
}
