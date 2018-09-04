package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kfq */
abstract class kfq extends AbstractMap {
    /* renamed from: a */
    private transient Set f8274a;
    /* renamed from: b */
    private transient Set f8275b;
    /* renamed from: c */
    private transient Collection f8276c;

    kfq() {
    }

    /* renamed from: a */
    abstract Set mo2097a();

    public Set entrySet() {
        Set set = this.f8274a;
        if (set != null) {
            return set;
        }
        set = mo2097a();
        this.f8274a = set;
        return set;
    }

    public Set keySet() {
        Set set = this.f8275b;
        if (set != null) {
            return set;
        }
        set = new kfo(this);
        this.f8275b = set;
        return set;
    }

    public Collection values() {
        Collection collection = this.f8276c;
        if (collection != null) {
            return collection;
        }
        collection = new kfp(this);
        this.f8276c = collection;
        return collection;
    }
}
