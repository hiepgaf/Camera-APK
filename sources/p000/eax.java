package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: eax */
final /* synthetic */ class eax implements Runnable {
    /* renamed from: a */
    private final AtomicReference f3479a;

    eax(AtomicReference atomicReference) {
        this.f3479a = atomicReference;
    }

    public final void run() {
        ((gkr) this.f3479a.get()).mo2880g();
    }
}
