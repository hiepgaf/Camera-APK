package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: PG */
/* renamed from: kes */
public abstract class kes implements Serializable, Map {
    /* renamed from: a */
    private transient keu f8256a;
    /* renamed from: b */
    private transient keu f8257b;
    /* renamed from: c */
    private transient keh f8258c;

    kes() {
    }

    /* renamed from: b */
    abstract keh mo2131b();

    /* renamed from: f */
    abstract keu mo2153f();

    /* renamed from: g */
    abstract keu mo2154g();

    public abstract Object get(Object obj);

    /* renamed from: i */
    abstract boolean mo2156i();

    /* renamed from: e */
    public static khb m4809e() {
        return new khb();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return mo2132d().contains(obj);
    }

    /* renamed from: a */
    public static kes m4806a(Map map) {
        if (!(map instanceof kes) || (map instanceof SortedMap)) {
            int size;
            Iterable entrySet = map.entrySet();
            if (entrySet instanceof Collection) {
                size = ((Collection) entrySet).size();
            } else {
                size = 4;
            }
            khb khb = new khb(size);
            khb.mo2136a(entrySet);
            return khb.mo2135a();
        }
        kes kes = (kes) map;
        kes.mo2156i();
        return kes;
    }

    /* renamed from: h */
    public final keu m4814h() {
        keu keu = this.f8256a;
        if (keu != null) {
            return keu;
        }
        keu = mo2153f();
        this.f8256a = keu;
        return keu;
    }

    public /* synthetic */ Set entrySet() {
        return m4814h();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public int hashCode() {
        return khb.m4860a(m4814h());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public final keu m4816j() {
        keu keu = this.f8257b;
        if (keu != null) {
            return keu;
        }
        keu = mo2154g();
        this.f8257b = keu;
        return keu;
    }

    public /* synthetic */ Set keySet() {
        return m4816j();
    }

    /* renamed from: b */
    public static kes m4807b(Object obj, Object obj2, Object obj3, Object obj4) {
        khb.m4892b(obj, obj2);
        khb.m4892b(obj3, obj4);
        return kgi.m13503a(2, new Object[]{obj, obj2, obj3, obj4});
    }

    /* renamed from: b */
    public static kes m4808b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        khb.m4892b(obj, obj2);
        khb.m4892b(obj3, obj4);
        khb.m4892b(obj5, obj6);
        return kgi.m13503a(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
    }

    /* renamed from: a */
    public static kes m4805a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        khb.m4892b(obj, obj2);
        khb.m4892b(obj3, obj4);
        khb.m4892b(obj5, obj6);
        khb.m4892b(obj7, obj8);
        return kgi.m13503a(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        khb.m4859a(size, "size");
        StringBuilder stringBuilder = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824));
        stringBuilder.append('{');
        Object obj = 1;
        for (Entry entry : entrySet()) {
            if (obj == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(entry.getKey());
            stringBuilder.append('=');
            stringBuilder.append(entry.getValue());
            obj = null;
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: d */
    public keh mo2132d() {
        keh keh = this.f8258c;
        if (keh != null) {
            return keh;
        }
        keh = mo2131b();
        this.f8258c = keh;
        return keh;
    }

    public /* synthetic */ Collection values() {
        return mo2132d();
    }

    Object writeReplace() {
        return new ket(this);
    }
}
