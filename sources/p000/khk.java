package p000;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;

/* compiled from: PG */
/* renamed from: khk */
class khk extends khf implements SortedMap {
    public static final long serialVersionUID = 0;

    khk(SortedMap sortedMap, Object obj) {
        super(sortedMap, obj);
    }

    public Comparator comparator() {
        Comparator comparator;
        synchronized (this.a) {
            comparator = mo3518c().comparator();
        }
        return comparator;
    }

    /* renamed from: a */
    /* synthetic */ Object mo2169a() {
        return mo3518c();
    }

    /* renamed from: b */
    /* synthetic */ Map mo3244b() {
        return mo3518c();
    }

    /* renamed from: c */
    SortedMap mo3518c() {
        return (SortedMap) super.mo3244b();
    }

    public Object firstKey() {
        Object firstKey;
        synchronized (this.a) {
            firstKey = mo3518c().firstKey();
        }
        return firstKey;
    }

    public SortedMap headMap(Object obj) {
        SortedMap a;
        synchronized (this.a) {
            a = khb.m4871a(mo3518c().headMap(obj), this.a);
        }
        return a;
    }

    public Object lastKey() {
        Object lastKey;
        synchronized (this.a) {
            lastKey = mo3518c().lastKey();
        }
        return lastKey;
    }

    public SortedMap subMap(Object obj, Object obj2) {
        SortedMap a;
        synchronized (this.a) {
            a = khb.m4871a(mo3518c().subMap(obj, obj2), this.a);
        }
        return a;
    }

    public SortedMap tailMap(Object obj) {
        SortedMap a;
        synchronized (this.a) {
            a = khb.m4871a(mo3518c().tailMap(obj), this.a);
        }
        return a;
    }
}
