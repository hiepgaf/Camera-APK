package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kcm */
abstract class kcm implements kfr {
    /* renamed from: a */
    private transient Collection f19163a;
    /* renamed from: b */
    private transient Set f19164b;
    /* renamed from: c */
    private transient Collection f19165c;
    /* renamed from: d */
    private transient Map f19166d;

    kcm() {
    }

    /* renamed from: d */
    abstract Map mo3201d();

    /* renamed from: e */
    abstract Collection mo3202e();

    /* renamed from: f */
    abstract Set mo3203f();

    /* renamed from: g */
    abstract Collection mo3204g();

    /* renamed from: h */
    abstract Iterator mo3205h();

    /* renamed from: k */
    public Map mo2103k() {
        Map map = this.f19166d;
        if (map != null) {
            return map;
        }
        map = mo3201d();
        this.f19166d = map;
        return map;
    }

    /* renamed from: b */
    public boolean mo2101b(Object obj, Object obj2) {
        Collection collection = (Collection) mo2103k().get(obj);
        return collection != null && collection.contains(obj2);
    }

    /* renamed from: c */
    public boolean mo3605c(Object obj) {
        for (Collection contains : mo2103k().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public Collection mo3506l() {
        Collection collection = this.f19163a;
        if (collection != null) {
            return collection;
        }
        collection = mo3202e();
        this.f19163a = collection;
        return collection;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kfr)) {
            return false;
        }
        return mo2103k().equals(((kfr) obj).mo2103k());
    }

    public int hashCode() {
        return mo2103k().hashCode();
    }

    /* renamed from: m */
    public boolean mo3608m() {
        return mo3206i() == 0;
    }

    /* renamed from: n */
    public Set mo2104n() {
        Set set = this.f19164b;
        if (set != null) {
            return set;
        }
        set = mo3203f();
        this.f19164b = set;
        return set;
    }

    /* renamed from: a */
    public boolean mo2100a(Object obj, Object obj2) {
        return mo3199a(obj).add(obj2);
    }

    /* renamed from: c */
    public boolean mo2102c(Object obj, Object obj2) {
        Collection collection = (Collection) mo2103k().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return mo2103k().toString();
    }

    /* renamed from: j */
    Iterator mo3207j() {
        return khb.m4904e(mo3506l().iterator());
    }

    /* renamed from: o */
    public Collection mo2105o() {
        Collection collection = this.f19165c;
        if (collection != null) {
            return collection;
        }
        collection = mo3204g();
        this.f19165c = collection;
        return collection;
    }
}
