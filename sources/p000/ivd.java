package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: ivd */
final class ivd extends iww {
    /* renamed from: a */
    private final AtomicBoolean f23373a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ ivb f23374b;

    ivd(ivb ivb, iwz iwz) {
        this.f23374b = ivb;
        super(iwz);
    }

    public final void close() {
        if (!this.f23373a.getAndSet(true)) {
            super.close();
            this.f23374b.m17599i();
        }
    }

    public final void finalize() {
        close();
        super.finalize();
    }
}
