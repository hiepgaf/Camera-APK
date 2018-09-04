package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fwm */
public final class fwm implements iqo {
    /* renamed from: a */
    private final AtomicBoolean f16573a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ kpw f16574b;
    /* renamed from: c */
    private final /* synthetic */ fvy f16575c;

    public fwm(fvy fvy, kpw kpw) {
        this.f16575c = fvy;
        this.f16574b = kpw;
    }

    public final void close() {
        if (!this.f16573a.getAndSet(true)) {
            boolean z;
            fvy fvy = this.f16575c;
            ilb ilb = fvy.f4743e;
            if (fvy.f4744f.decrementAndGet() > 0) {
                z = true;
            } else {
                z = false;
            }
            ilb.mo348a(Boolean.valueOf(z));
            this.f16575c.f4742d.m16083a();
            this.f16574b.mo3557a(Boolean.valueOf(true));
        }
    }
}
