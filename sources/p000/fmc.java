package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: fmc */
final class fmc extends iww {
    /* renamed from: a */
    private AtomicBoolean f23203a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ AtomicInteger f23204b;
    /* renamed from: c */
    private final /* synthetic */ fyr f23205c;

    fmc(iwz iwz, AtomicInteger atomicInteger, fyr fyr) {
        this.f23204b = atomicInteger;
        this.f23205c = fyr;
        super(iwz);
    }

    public final void close() {
        if (!this.f23203a.getAndSet(true)) {
            super.close();
            if (this.f23204b.decrementAndGet() == 0) {
                this.f23205c.close();
            }
        }
    }
}
