package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* renamed from: knq */
final class knq extends knl {
    /* renamed from: a */
    public final AtomicReferenceFieldUpdater f19229a;
    /* renamed from: b */
    public final AtomicReferenceFieldUpdater f19230b;
    /* renamed from: c */
    public final AtomicReferenceFieldUpdater f19231c;
    /* renamed from: d */
    public final AtomicReferenceFieldUpdater f19232d;
    /* renamed from: e */
    public final AtomicReferenceFieldUpdater f19233e;

    knq(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f19229a = atomicReferenceFieldUpdater;
        this.f19230b = atomicReferenceFieldUpdater2;
        this.f19231c = atomicReferenceFieldUpdater3;
        this.f19232d = atomicReferenceFieldUpdater4;
        this.f19233e = atomicReferenceFieldUpdater5;
    }

    /* renamed from: a */
    final boolean mo2195a(knk knk, knp knp, knp knp2) {
        return this.f19232d.compareAndSet(knk, knp, knp2);
    }

    /* renamed from: a */
    final boolean mo2194a(knk knk, Object obj, Object obj2) {
        return this.f19233e.compareAndSet(knk, obj, obj2);
    }

    /* renamed from: a */
    final boolean mo2196a(knk knk, knw knw, knw knw2) {
        return this.f19231c.compareAndSet(knk, knw, knw2);
    }

    /* renamed from: a */
    final void mo2193a(knw knw, knw knw2) {
        this.f19230b.lazySet(knw, knw2);
    }

    /* renamed from: a */
    final void mo2192a(knw knw, Thread thread) {
        this.f19229a.lazySet(knw, thread);
    }
}
