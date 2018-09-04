package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kgc */
public final class kgc extends kgd implements Serializable {
    /* renamed from: a */
    public static final kgc f19196a = new kgc();
    public static final long serialVersionUID = 0;

    private kgc() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        obj = (Comparable) obj;
        obj2 = (Comparable) obj2;
        jri.m13152b(obj);
        jri.m13152b(obj2);
        return obj.compareTo(obj2);
    }

    private final Object readResolve() {
        return f19196a;
    }

    /* renamed from: a */
    public final kgd mo2152a() {
        return kgo.f19204a;
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
