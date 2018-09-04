package p000;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kgo */
final class kgo extends kgd implements Serializable {
    /* renamed from: a */
    public static final kgo f19204a = new kgo();
    public static final long serialVersionUID = 0;

    private kgo() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        jri.m13152b((Object) comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2157a(Iterable iterable) {
        return (Comparable) kgc.f19196a.mo2160b(iterable);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2158a(Object obj, Object obj2) {
        return (Comparable) kgc.f19196a.mo2161b((Comparable) obj, (Comparable) obj2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2159a(Iterator it) {
        return (Comparable) kgc.f19196a.mo2162b(it);
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo2160b(Iterable iterable) {
        return (Comparable) kgc.f19196a.mo2157a(iterable);
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo2161b(Object obj, Object obj2) {
        return (Comparable) kgc.f19196a.mo2158a((Comparable) obj, (Comparable) obj2);
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo2162b(Iterator it) {
        return (Comparable) kgc.f19196a.mo2159a(it);
    }

    private final Object readResolve() {
        return f19204a;
    }

    /* renamed from: a */
    public final kgd mo2152a() {
        return kgc.f19196a;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
