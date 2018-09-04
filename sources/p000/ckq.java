package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: ckq */
final class ckq extends fkp {
    /* renamed from: a */
    public final fkp f23451a;
    /* renamed from: c */
    private final AtomicInteger f23452c;
    /* renamed from: d */
    private final AtomicBoolean f23453d = new AtomicBoolean(false);

    public ckq(fkp fkp, AtomicInteger atomicInteger) {
        super((iwz) fkp, fkp.m17318h());
        this.f23451a = fkp;
        this.f23452c = atomicInteger;
        this.f23452c.incrementAndGet();
    }

    public final void close() {
        if (!this.f23453d.getAndSet(true)) {
            this.f23451a.close();
            if (this.f23452c.decrementAndGet() < 0) {
                throw new IllegalStateException("Image count negative.");
            }
        }
    }
}
