package p000;

import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: iqh */
public final class iqh {
    /* renamed from: a */
    private final ArrayDeque f7315a = new ArrayDeque();
    /* renamed from: b */
    private final long f7316b = 1000000;
    /* renamed from: c */
    private float f7317c = 0.0f;

    /* renamed from: a */
    public final synchronized float m4036a(iqi iqi) {
        jri.m13144a(true, (Object) "Sample cannot be null");
        this.f7317c += iqi.f7319b;
        this.f7315a.add(iqi);
        Iterator it = this.f7315a.iterator();
        while (it.hasNext()) {
            iqi iqi2 = (iqi) it.next();
            if (iqi2.f7318a + this.f7316b < iqi.f7318a) {
                it.remove();
                this.f7317c -= iqi2.f7319b;
            }
        }
        return this.f7317c;
    }
}
