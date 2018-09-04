package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jhw */
final class jhw implements Iterator {
    /* renamed from: a */
    private int f7845a = 0;
    /* renamed from: b */
    private final /* synthetic */ jhv f7846b;

    jhw(jhv jhv) {
        this.f7846b = jhv;
    }

    public final boolean hasNext() {
        return this.f7845a < this.f7846b.f7844a.length;
    }

    public final /* synthetic */ Object next() {
        int[] iArr = this.f7846b.f7844a;
        int i = this.f7845a;
        this.f7845a = i + 1;
        return Integer.valueOf(iArr[i]);
    }

    public final void remove() {
        throw new UnsupportedOperationException("IntSets are immutable!");
    }
}
