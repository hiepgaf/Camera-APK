package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kbv */
abstract class kbv extends kcm implements Serializable {
    public static final long serialVersionUID = 2447537837011683357L;
    /* renamed from: a */
    public transient Map f22003a;
    /* renamed from: b */
    public transient int f22004b;

    protected kbv(Map map) {
        jri.m13143a(map.isEmpty());
        this.f22003a = map;
    }

    /* renamed from: a */
    abstract Collection mo3504a();

    /* renamed from: a */
    static /* synthetic */ int m16438a(kbv kbv, int i) {
        int i2 = kbv.f22004b + i;
        kbv.f22004b = i2;
        return i2;
    }

    /* renamed from: b */
    static /* synthetic */ int m16440b(kbv kbv, int i) {
        int i2 = kbv.f22004b - i;
        kbv.f22004b = i2;
        return i2;
    }

    /* renamed from: c */
    public void mo3200c() {
        for (Collection clear : this.f22003a.values()) {
            clear.clear();
        }
        this.f22003a.clear();
        this.f22004b = 0;
    }

    /* renamed from: d */
    final Map mo3201d() {
        return new kby(this, this.f22003a);
    }

    /* renamed from: e */
    final Collection mo3202e() {
        if (this instanceof kgq) {
            return new kcn(this);
        }
        return new kfs(this);
    }

    /* renamed from: f */
    final Set mo3203f() {
        return new kcc(this, this.f22003a);
    }

    /* renamed from: g */
    final Collection mo3204g() {
        return new kco(this);
    }

    /* renamed from: h */
    final Iterator mo3205h() {
        return new kbx(this);
    }

    /* renamed from: a */
    public Collection mo3199a(Object obj) {
        Collection collection = (Collection) this.f22003a.get(obj);
        if (collection == null) {
            collection = mo3504a();
        }
        return mo3505a(obj, collection);
    }

    /* renamed from: a */
    public boolean mo2100a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f22003a.get(obj);
        if (collection == null) {
            collection = mo3504a();
            if (collection.add(obj2)) {
                this.f22004b++;
                this.f22003a.put(obj, collection);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.f22004b++;
            return true;
        }
    }

    /* renamed from: a */
    final void m16445a(Map map) {
        this.f22003a = map;
        this.f22004b = 0;
        for (Collection collection : map.values()) {
            jri.m13143a(collection.isEmpty() ^ 1);
            this.f22004b = collection.size() + this.f22004b;
        }
    }

    /* renamed from: i */
    public int mo3206i() {
        return this.f22004b;
    }

    /* renamed from: j */
    final Iterator mo3207j() {
        return new kbw(this);
    }

    /* renamed from: a */
    Collection mo3505a(Object obj, Collection collection) {
        return new kcf(this, obj, collection, null);
    }

    /* renamed from: a */
    final List m16444a(Object obj, List list, kcf kcf) {
        if (list instanceof RandomAccess) {
            return new kce(this, obj, list, kcf);
        }
        return new kch(this, obj, list, kcf);
    }
}
