package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: fmb */
final class fmb extends iww {
    /* renamed from: a */
    private AtomicBoolean f23200a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ AtomicInteger f23201b;
    /* renamed from: c */
    private final /* synthetic */ fyr f23202c;

    fmb(iwz iwz, AtomicInteger atomicInteger, fyr fyr) {
        this.f23201b = atomicInteger;
        this.f23202c = fyr;
        super(iwz);
    }

    public final void close() {
        if (!this.f23200a.getAndSet(true)) {
            super.close();
            if (this.f23201b.decrementAndGet() == 0) {
                this.f23202c.close();
            }
        }
    }
}
