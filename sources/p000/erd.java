package p000;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: erd */
final class erd implements iqo {
    /* renamed from: a */
    public final eqw f15422a;
    /* renamed from: b */
    public final ilb f15423b;
    /* renamed from: c */
    private final Collection f15424c;

    erd(eqw eqw, ilb ilb, Collection collection) {
        this.f15422a = eqw;
        this.f15423b = ilb;
        this.f15424c = collection;
    }

    public final void close() {
        for (iqo close : this.f15424c) {
            close.close();
        }
    }
}
