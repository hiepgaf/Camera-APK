package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fxx */
final class fxx implements fyr {
    /* renamed from: a */
    private final AtomicBoolean f21431a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ fxv f21432b;

    fxx(fxv fxv) {
        this.f21432b = fxv;
        fxv.f16626a.incrementAndGet();
    }

    public final void close() {
        if (!this.f21431a.getAndSet(true)) {
            this.f21432b.f16626a.decrementAndGet();
        }
    }
}
