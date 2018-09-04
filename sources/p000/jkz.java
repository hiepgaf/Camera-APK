package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: PG */
/* renamed from: jkz */
public final class jkz implements Iterator {
    /* renamed from: a */
    private final int[] f7904a;
    /* renamed from: b */
    private int f7905b;
    /* renamed from: c */
    private final /* synthetic */ jkx f7906c;

    jkz(jkx jkx, AtomicIntegerArray atomicIntegerArray, int i) {
        this.f7906c = jkx;
        this.f7904a = new int[atomicIntegerArray.length()];
        for (int i2 = 0; i2 < atomicIntegerArray.length(); i2++) {
            this.f7904a[i2] = atomicIntegerArray.get(i2);
        }
        this.f7905b = i;
    }

    public final boolean hasNext() {
        return true;
    }

    /* renamed from: a */
    public final boolean m4528a() {
        Iterator it = this.f7906c.f18905a.iterator();
        while (it.hasNext()) {
            if (this.f7905b <= this.f7904a[((jza) it.next()).f8131z]) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        jky jky = new jky(this.f7906c, this.f7904a, this.f7905b);
        this.f7905b++;
        return jky;
    }

    public final void remove() {
        throw new UnsupportedOperationException("RowIterator does not allow removing rows!");
    }
}
