package p000;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: PG */
/* renamed from: khg */
final class khg extends khk implements NavigableMap {
    public static final long serialVersionUID = 0;
    /* renamed from: b */
    private transient NavigableSet f23421b;
    /* renamed from: c */
    private transient NavigableMap f23422c;
    /* renamed from: d */
    private transient NavigableSet f23423d;

    khg(NavigableMap navigableMap, Object obj) {
        super(navigableMap, obj);
    }

    public final Entry ceilingEntry(Object obj) {
        Entry khe;
        synchronized (this.a) {
            Entry ceilingEntry = ((NavigableMap) super.mo3518c()).ceilingEntry(obj);
            Object obj2 = this.a;
            if (ceilingEntry != null) {
                khe = new khe(ceilingEntry, obj2);
            } else {
                khe = null;
            }
        }
        return khe;
    }

    public final Object ceilingKey(Object obj) {
        Object ceilingKey;
        synchronized (this.a) {
            ceilingKey = ((NavigableMap) super.mo3518c()).ceilingKey(obj);
        }
        return ceilingKey;
    }

    /* renamed from: a */
    final /* synthetic */ Object mo2169a() {
        return (NavigableMap) super.mo3518c();
    }

    /* renamed from: b */
    final /* synthetic */ Map mo3244b() {
        return (NavigableMap) super.mo3518c();
    }

    /* renamed from: c */
    final /* synthetic */ SortedMap mo3518c() {
        return (NavigableMap) super.mo3518c();
    }

    public final NavigableSet descendingKeySet() {
        NavigableSet navigableSet;
        synchronized (this.a) {
            navigableSet = this.f23421b;
            if (navigableSet != null) {
            } else {
                navigableSet = khb.m4870a(((NavigableMap) super.mo3518c()).descendingKeySet(), this.a);
                this.f23421b = navigableSet;
            }
        }
        return navigableSet;
    }

    public final NavigableMap descendingMap() {
        NavigableMap navigableMap;
        synchronized (this.a) {
            navigableMap = this.f23422c;
            if (navigableMap != null) {
            } else {
                navigableMap = khb.m4868a(((NavigableMap) super.mo3518c()).descendingMap(), this.a);
                this.f23422c = navigableMap;
            }
        }
        return navigableMap;
    }

    public final Entry firstEntry() {
        Entry khe;
        synchronized (this.a) {
            Entry firstEntry = ((NavigableMap) super.mo3518c()).firstEntry();
            Object obj = this.a;
            if (firstEntry != null) {
                khe = new khe(firstEntry, obj);
            } else {
                khe = null;
            }
        }
        return khe;
    }

    public final Entry floorEntry(Object obj) {
        Entry khe;
        synchronized (this.a) {
            Entry floorEntry = ((NavigableMap) super.mo3518c()).floorEntry(obj);
            Object obj2 = this.a;
            if (floorEntry != null) {
                khe = new khe(floorEntry, obj2);
            } else {
                khe = null;
            }
        }
        return khe;
    }

    public final Object floorKey(Object obj) {
        Object floorKey;
        synchronized (this.a) {
            floorKey = ((NavigableMap) super.mo3518c()).floorKey(obj);
        }
        return floorKey;
    }

    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final NavigableMap headMap(Object obj, boolean z) {
        NavigableMap a;
        synchronized (this.a) {
            a = khb.m4868a(((NavigableMap) super.mo3518c()).headMap(obj, z), this.a);
        }
        return a;
    }

    public final Entry higherEntry(Object obj) {
        Entry khe;
        synchronized (this.a) {
            Entry higherEntry = ((NavigableMap) super.mo3518c()).higherEntry(obj);
            Object obj2 = this.a;
            if (higherEntry != null) {
                khe = new khe(higherEntry, obj2);
            } else {
                khe = null;
            }
        }
        return khe;
    }

    public final Object higherKey(Object obj) {
        Object higherKey;
        synchronized (this.a) {
            higherKey = ((NavigableMap) super.mo3518c()).higherKey(obj);
        }
        return higherKey;
    }

    public final Set keySet() {
        return navigableKeySet();
    }

    public final Entry lastEntry() {
        Entry khe;
        synchronized (this.a) {
            Entry lastEntry = ((NavigableMap) super.mo3518c()).lastEntry();
            Object obj = this.a;
            if (lastEntry != null) {
                khe = new khe(lastEntry, obj);
            } else {
                khe = null;
            }
        }
        return khe;
    }

    public final Entry lowerEntry(Object obj) {
        Entry khe;
        synchronized (this.a) {
            Entry lowerEntry = ((NavigableMap) super.mo3518c()).lowerEntry(obj);
            Object obj2 = this.a;
            if (lowerEntry != null) {
                khe = new khe(lowerEntry, obj2);
            } else {
                khe = null;
            }
        }
        return khe;
    }

    public final Object lowerKey(Object obj) {
        Object lowerKey;
        synchronized (this.a) {
            lowerKey = ((NavigableMap) super.mo3518c()).lowerKey(obj);
        }
        return lowerKey;
    }

    public final NavigableSet navigableKeySet() {
        NavigableSet navigableSet;
        synchronized (this.a) {
            navigableSet = this.f23423d;
            if (navigableSet != null) {
            } else {
                navigableSet = khb.m4870a(((NavigableMap) super.mo3518c()).navigableKeySet(), this.a);
                this.f23423d = navigableSet;
            }
        }
        return navigableSet;
    }

    public final Entry pollFirstEntry() {
        Entry khe;
        synchronized (this.a) {
            Entry pollFirstEntry = ((NavigableMap) super.mo3518c()).pollFirstEntry();
            Object obj = this.a;
            if (pollFirstEntry != null) {
                khe = new khe(pollFirstEntry, obj);
            } else {
                khe = null;
            }
        }
        return khe;
    }

    public final Entry pollLastEntry() {
        Entry khe;
        synchronized (this.a) {
            Entry pollLastEntry = ((NavigableMap) super.mo3518c()).pollLastEntry();
            Object obj = this.a;
            if (pollLastEntry != null) {
                khe = new khe(pollLastEntry, obj);
            } else {
                khe = null;
            }
        }
        return khe;
    }

    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        NavigableMap a;
        synchronized (this.a) {
            a = khb.m4868a(((NavigableMap) super.mo3518c()).subMap(obj, z, obj2, z2), this.a);
        }
        return a;
    }

    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final NavigableMap tailMap(Object obj, boolean z) {
        NavigableMap a;
        synchronized (this.a) {
            a = khb.m4868a(((NavigableMap) super.mo3518c()).tailMap(obj, z), this.a);
        }
        return a;
    }
}
