package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: gqg */
public final class gqg implements gqd {
    /* renamed from: a */
    private final Runnable f17223a;
    /* renamed from: b */
    private final AtomicBoolean f17224b = new AtomicBoolean(false);

    public gqg(Runnable runnable) {
        this.f17223a = runnable;
    }

    public final void run() {
        if (!this.f17224b.getAndSet(true)) {
            this.f17223a.run();
        }
    }
}
