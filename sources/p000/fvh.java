package p000;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fvh */
public final class fvh extends ikb {
    /* renamed from: a */
    private final Set f21416a;
    /* renamed from: b */
    private final AtomicBoolean f21417b = new AtomicBoolean(false);

    fvh(Set set, ikv ikv) {
        super(ikv);
        this.f21416a = set;
    }

    public final void close() {
        if (!this.f21417b.getAndSet(true)) {
            for (fvg run : this.f21416a) {
                run.run();
            }
            super.close();
        }
    }

    /* renamed from: a */
    public final boolean mo3049a() {
        return this.f21417b.get();
    }
}
