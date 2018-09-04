package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fyq */
final class fyq implements iqo {
    /* renamed from: a */
    private final AtomicBoolean f16648a = new AtomicBoolean(false);
    /* renamed from: b */
    private final fyl f16649b;
    /* renamed from: c */
    private final /* synthetic */ fyk f16650c;

    fyq(fyk fyk, fyl fyl) {
        this.f16650c = fyk;
        this.f16649b = fyl;
    }

    public final void close() {
        if (!this.f16648a.getAndSet(true)) {
            synchronized (this.f16650c.f16640a) {
                this.f16650c.f16641b.remove(this.f16649b);
                fyk fyk = this.f16650c;
                fyk.f16642c.f21744b = new ArrayList(fyk.f16641b);
            }
            this.f16650c.f16642c.f21743a.m16083a();
        }
    }
}
