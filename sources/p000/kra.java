package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: kra */
public final class kra implements Iterator {
    /* renamed from: a */
    private int f8432a = 0;
    /* renamed from: b */
    private final int f8433b = this.f8434c.mo3268b();
    /* renamed from: c */
    private final /* synthetic */ kqx f8434c;

    kra(kqx kqx) {
        this.f8434c = kqx;
    }

    public final boolean hasNext() {
        return this.f8432a < this.f8433b;
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(m5070a());
    }

    /* renamed from: a */
    private final byte m5070a() {
        try {
            kqx kqx = this.f8434c;
            int i = this.f8432a;
            this.f8432a = i + 1;
            return kqx.mo3262a(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
