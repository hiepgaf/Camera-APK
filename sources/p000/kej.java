package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kej */
public abstract class kej {
    kej() {
    }

    /* renamed from: b */
    public abstract kej mo2141b(Object obj);

    /* renamed from: a */
    public kej mo2140a(Iterable iterable) {
        for (Object b : iterable) {
            mo2141b(b);
        }
        return this;
    }

    /* renamed from: a */
    public kej mo3232a(Iterator it) {
        while (it.hasNext()) {
            mo2141b(it.next());
        }
        return this;
    }

    /* renamed from: a */
    static int m4801a(int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i3 = ((i >> 1) + i) + 1;
        if (i3 < i2) {
            i3 = Integer.highestOneBit(i2 - 1);
            i3 += i3;
        }
        if (i3 < 0) {
            return LfuScheduler.MAX_PRIORITY;
        }
        return i3;
    }
}
