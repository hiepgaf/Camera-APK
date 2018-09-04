package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ilt */
final /* synthetic */ class ilt implements iqo {
    /* renamed from: a */
    private final kpw f18354a;
    /* renamed from: b */
    private final AtomicBoolean f18355b;

    ilt(kpw kpw, AtomicBoolean atomicBoolean) {
        this.f18354a = kpw;
        this.f18355b = atomicBoolean;
    }

    public final void close() {
        this.f18354a.mo3557a(Boolean.valueOf(this.f18355b.get()));
    }
}
