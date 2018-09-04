package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fxs */
final class fxs implements fyr {
    /* renamed from: a */
    private final AtomicBoolean f21429a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ fxr f21430b;

    public fxs(fxr fxr) {
        this.f21430b = fxr;
    }

    public final void close() {
        if (!this.f21429a.getAndSet(true)) {
            fxr fxr = this.f21430b;
            synchronized (fxr.f16620b) {
                fxr.f16623e++;
                fxr.f16622d.f21744b = Integer.valueOf(fxr.m10862b());
            }
            fxr.f16622d.f21743a.m16083a();
            do {
            } while (fxr.m10865e());
        }
    }
}
