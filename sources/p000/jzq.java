package p000;

import android.util.LongSparseArray;
import java.util.AbstractList;

/* compiled from: PG */
/* renamed from: jzq */
public final class jzq extends AbstractList {
    /* renamed from: a */
    private final /* synthetic */ LongSparseArray f8151a;

    public jzq(LongSparseArray longSparseArray) {
        this.f8151a = longSparseArray;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(this.f8151a.keyAt(i));
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            return this.f8151a.indexOfKey(((Long) obj).longValue());
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        if (i < 0 || i > this.f8151a.size()) {
            int size = this.f8151a.size();
            StringBuilder stringBuilder = new StringBuilder(47);
            stringBuilder.append(i);
            stringBuilder.append(" is not in the range [0,");
            stringBuilder.append(size - 1);
            stringBuilder.append("]");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        Long valueOf = Long.valueOf(this.f8151a.keyAt(i));
        this.f8151a.removeAt(i);
        return valueOf;
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        this.f8151a.removeAt(indexOf);
        return true;
    }

    public final int size() {
        return this.f8151a.size();
    }
}
