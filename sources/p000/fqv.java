package p000;

import java.util.UUID;

/* compiled from: PG */
/* renamed from: fqv */
public final class fqv implements fux {
    /* renamed from: a */
    public final gkr f21402a;
    /* renamed from: b */
    public final UUID f21403b;
    /* renamed from: c */
    public boolean f21404c;
    /* renamed from: d */
    public boolean f21405d;
    /* renamed from: e */
    public final /* synthetic */ fqu f21406e;
    /* renamed from: f */
    private boolean f21407f;

    public fqv(fqu fqu, gkr gkr, UUID uuid) {
        this.f21406e = fqu;
        this.f21402a = gkr;
        this.f21403b = uuid;
    }

    /* renamed from: a */
    public final void mo2642a(iwz iwz, kpk kpk) {
        throw new RuntimeException("Should not call RawModeImageSaver.addFullSizeImage()");
    }

    public final synchronized void close() {
        if (!this.f21407f) {
            this.f21407f = true;
            this.f21402a.mo2879f();
        }
    }

    /* renamed from: a */
    public final synchronized void m15719a(ikb ikb) {
        if (this.f21404c && this.f21405d) {
            this.f21407f = true;
            this.f21402a.mo2879f();
            ikb.close();
        }
    }
}
