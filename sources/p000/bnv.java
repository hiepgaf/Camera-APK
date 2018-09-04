package p000;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: bnv */
public final class bnv {
    /* renamed from: a */
    public final bcy f1349a;
    /* renamed from: b */
    public final AtomicReference f1350b = new AtomicReference();
    /* renamed from: c */
    private final hcd f1351c;
    /* renamed from: d */
    private boolean f1352d = false;

    public bnv(hcd hcd, bcy bcy) {
        this.f1351c = hcd;
        this.f1349a = bcy;
    }

    /* renamed from: a */
    public final synchronized void m923a() {
        this.f1351c.m3025a(hbf.PHOTO_IDLE);
    }

    /* renamed from: a */
    public final synchronized void m924a(boolean z) {
        if (this.f1352d) {
            this.f1351c.m3025a(hbf.PHOTO_IDLE);
            if (z) {
                this.f1349a.mo696a();
            }
            this.f1352d = false;
        }
    }

    /* renamed from: b */
    public final synchronized void m925b(boolean z) {
        if (!this.f1352d) {
            this.f1351c.m3025a(hbf.PHOTO_BURST);
            if (z) {
                this.f1349a.mo698a(true);
            }
            this.f1352d = true;
        }
    }
}
