package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: gpl */
public final class gpl implements gqd {
    /* renamed from: a */
    private final ird f17184a;
    /* renamed from: b */
    private final gpn f17185b;
    /* renamed from: c */
    private final AtomicBoolean f17186c = new AtomicBoolean(false);

    gpl(gpn gpn, ird ird) {
        this.f17185b = gpn;
        this.f17184a = ird;
    }

    public final void run() {
        if (!this.f17186c.getAndSet(true)) {
            this.f17184a.mo1903a("AllAudioInit");
            this.f17185b.mo1551d();
            this.f17184a.mo1904b();
        }
    }
}
