package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: gps */
public final class gps implements gqd {
    /* renamed from: a */
    private final ird f17200a;
    /* renamed from: b */
    private final gpn f17201b;
    /* renamed from: c */
    private final AtomicBoolean f17202c = new AtomicBoolean(false);

    gps(gpn gpn, ird ird) {
        this.f17201b = gpn;
        this.f17200a = ird;
    }

    public final void run() {
        if (!this.f17202c.getAndSet(true)) {
            this.f17200a.mo1903a("AudioInit");
            this.f17201b.mo1552e();
            this.f17200a.mo1904b();
        }
    }
}
