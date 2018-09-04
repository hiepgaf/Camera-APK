package p000;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fya */
final class fya implements fyr {
    /* renamed from: a */
    private final AtomicBoolean f21433a = new AtomicBoolean(false);
    /* renamed from: b */
    private final List f21434b;

    fya(List list) {
        this.f21434b = list;
    }

    public final void close() {
        if (!this.f21433a.getAndSet(true)) {
            for (fyr close : this.f21434b) {
                close.close();
            }
        }
    }
}
