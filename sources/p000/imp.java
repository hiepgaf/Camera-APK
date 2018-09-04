package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: imp */
final class imp implements iqo {
    /* renamed from: a */
    private final AtomicBoolean f18368a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ imn f18369b;

    imp(imn imn) {
        this.f18369b = imn;
    }

    public final void close() {
        if (!this.f18368a.getAndSet(true)) {
            imn imn = this.f18369b;
            synchronized (imn.f21746b) {
                imn.f21747c--;
                imn.f21745a.f21744b = Integer.valueOf(imn.f21747c);
            }
            imn.f21745a.f21743a.m16083a();
        }
    }
}
