package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: khf */
class khf extends khi implements Map {
    public static final long serialVersionUID = 0;
    /* renamed from: b */
    private transient Set f19208b;
    /* renamed from: c */
    private transient Collection f19209c;
    /* renamed from: d */
    private transient Set f19210d;

    khf(Map map, Object obj) {
        super(map, obj);
    }

    public void clear() {
        synchronized (this.a) {
            mo3244b().clear();
        }
    }

    public boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.a) {
            containsKey = mo3244b().containsKey(obj);
        }
        return containsKey;
    }

    public boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.a) {
            containsValue = mo3244b().containsValue(obj);
        }
        return containsValue;
    }

    /* renamed from: a */
    /* synthetic */ Object mo2169a() {
        return mo3244b();
    }

    /* renamed from: b */
    Map mo3244b() {
        return (Map) super.mo2169a();
    }

    public Set entrySet() {
        Set set;
        synchronized (this.a) {
            if (this.f19210d == null) {
                this.f19210d = khb.m4888b(mo3244b().entrySet(), this.a);
            }
            set = this.f19210d;
        }
        return set;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        boolean equals;
        synchronized (this.a) {
            equals = mo3244b().equals(obj);
        }
        return equals;
    }

    public Object get(Object obj) {
        Object obj2;
        synchronized (this.a) {
            obj2 = mo3244b().get(obj);
        }
        return obj2;
    }

    public int hashCode() {
        int hashCode;
        synchronized (this.a) {
            hashCode = mo3244b().hashCode();
        }
        return hashCode;
    }

    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.a) {
            isEmpty = mo3244b().isEmpty();
        }
        return isEmpty;
    }

    public Set keySet() {
        Set set;
        synchronized (this.a) {
            if (this.f19208b == null) {
                this.f19208b = khb.m4888b(mo3244b().keySet(), this.a);
            }
            set = this.f19208b;
        }
        return set;
    }

    public Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.a) {
            put = mo3244b().put(obj, obj2);
        }
        return put;
    }

    public void putAll(Map map) {
        synchronized (this.a) {
            mo3244b().putAll(map);
        }
    }

    public Object remove(Object obj) {
        Object remove;
        synchronized (this.a) {
            remove = mo3244b().remove(obj);
        }
        return remove;
    }

    public int size() {
        int size;
        synchronized (this.a) {
            size = mo3244b().size();
        }
        return size;
    }

    public Collection values() {
        Collection collection;
        synchronized (this.a) {
            if (this.f19209c == null) {
                this.f19209c = new khd(mo3244b().values(), this.a);
            }
            collection = this.f19209c;
        }
        return collection;
    }
}
