package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kcp */
abstract class kcp extends AbstractCollection implements kft {
    /* renamed from: a */
    private transient Set f19167a;
    /* renamed from: b */
    private transient Set f19168b;

    kcp() {
    }

    /* renamed from: c */
    abstract int mo3524c();

    /* renamed from: d */
    abstract Iterator mo3525d();

    /* renamed from: f */
    abstract Iterator mo3526f();

    public final boolean add(Object obj) {
        mo2106a(obj, 1);
        return true;
    }

    /* renamed from: a */
    public int mo2106a(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        jri.m13152b((Object) this);
        jri.m13152b((Object) collection);
        if (collection instanceof kft) {
            kft kft = (kft) collection;
            if (kft instanceof kck) {
                if (((kck) kft).isEmpty()) {
                    return false;
                }
                throw new NoSuchMethodError();
            } else if (kft.isEmpty()) {
                return false;
            } else {
                for (kfu kfu : kft.mo2114g()) {
                    mo2106a(kfu.mo3240b(), kfu.mo3239a());
                }
                return true;
            }
        } else if (collection.isEmpty()) {
            return false;
        } else {
            return khb.m4878a((Collection) this, collection.iterator());
        }
    }

    public boolean contains(Object obj) {
        return mo3226a(obj) > 0;
    }

    /* renamed from: b */
    Set mo3218b() {
        return new kcq(this);
    }

    /* renamed from: e */
    public Set mo2112e() {
        Set set = this.f19167a;
        if (set != null) {
            return set;
        }
        set = mo3218b();
        this.f19167a = set;
        return set;
    }

    /* renamed from: g */
    public Set mo2114g() {
        Set set = this.f19168b;
        if (set != null) {
            return set;
        }
        set = new kcr(this);
        this.f19168b = set;
        return set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kft) {
            kft kft = (kft) obj;
            if (size() != kft.size() || mo2114g().size() != kft.mo2114g().size()) {
                return false;
            }
            for (kfu kfu : kft.mo2114g()) {
                if (mo3226a(kfu.mo3240b()) != kfu.mo3239a()) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return mo2114g().hashCode();
    }

    public boolean isEmpty() {
        return mo2114g().isEmpty();
    }

    public final boolean remove(Object obj) {
        return mo2109b(obj, 1) > 0;
    }

    /* renamed from: b */
    public int mo2109b(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        if (collection instanceof kft) {
            collection = ((kft) collection).mo2112e();
        }
        return mo2112e().removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        jri.m13152b((Object) collection);
        if (collection instanceof kft) {
            collection = ((kft) collection).mo2112e();
        }
        return mo2112e().retainAll(collection);
    }

    /* renamed from: c */
    public int mo2110c(Object obj, int i) {
        khb.m4859a(i, "count");
        int a = mo3226a(obj);
        int i2 = i - a;
        if (i2 > 0) {
            mo2106a(obj, i2);
        } else if (i2 < 0) {
            mo2109b(obj, -i2);
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo2107a(Object obj, int i, int i2) {
        khb.m4859a(i, "oldCount");
        khb.m4859a(i2, "newCount");
        if (mo3226a(obj) != i) {
            return false;
        }
        mo2110c(obj, i2);
        return true;
    }

    public final String toString() {
        return mo2114g().toString();
    }
}
