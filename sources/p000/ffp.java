package p000;

import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: ffp */
public final class ffp implements Runnable {
    /* renamed from: a */
    private final fff f4532a;
    /* renamed from: b */
    private final ffe f4533b;
    /* renamed from: c */
    private final Object f4534c = new Object();
    /* renamed from: d */
    private Future f4535d = kow.m13617a(new Object());

    public ffp(fff fff, ffe ffe) {
        this.f4532a = fff;
        this.f4533b = ffe;
    }

    public final void run() {
        synchronized (this.f4534c) {
            this.f4535d.cancel(true);
            this.f4535d = this.f4532a.m2273a(this.f4533b);
        }
    }
}
