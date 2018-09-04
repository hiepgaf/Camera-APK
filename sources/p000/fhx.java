package p000;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fhx */
final class fhx implements fhh {
    /* renamed from: a */
    private final AtomicBoolean f21359a = new AtomicBoolean(false);
    /* renamed from: b */
    private final fhh f21360b;
    /* renamed from: c */
    private final /* synthetic */ fhw f21361c;

    fhx(fhw fhw, fhh fhh) {
        this.f21361c = fhw;
        this.f21360b = fhh;
    }

    public final void close() {
        boolean z = true;
        if (!this.f21359a.getAndSet(true)) {
            int decrementAndGet = this.f21361c.f16041a.decrementAndGet();
            ilb ilb = this.f21361c.f16042b;
            if (decrementAndGet != 0) {
                z = false;
            }
            ilb.mo348a(Boolean.valueOf(z));
            this.f21360b.close();
        }
    }

    /* renamed from: a */
    public final void mo1381a(List list, fiv fiv) {
        this.f21360b.mo1381a(list, fiv);
    }
}
