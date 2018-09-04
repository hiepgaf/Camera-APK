package p000;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* renamed from: kog */
final class kog extends kof {
    /* renamed from: a */
    private final AtomicReferenceFieldUpdater f19244a;
    /* renamed from: b */
    private final AtomicIntegerFieldUpdater f19245b;

    kog(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f19244a = atomicReferenceFieldUpdater;
        this.f19245b = atomicIntegerFieldUpdater;
    }

    /* renamed from: a */
    final void mo2201a(koe koe, Set set) {
        this.f19244a.compareAndSet(koe, null, set);
    }

    /* renamed from: a */
    final int mo2200a(koe koe) {
        return this.f19245b.decrementAndGet(koe);
    }
}
