package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kgb */
class kgb extends kdx implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final kft f23418a;
    /* renamed from: b */
    private transient Set f23419b;
    /* renamed from: c */
    private transient Set f23420c;

    kgb(kft kft) {
        this.f23418a = kft;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final int mo2106a(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    Set mo3597c() {
        return Collections.unmodifiableSet(this.f23418a.mo2112e());
    }

    /* renamed from: f */
    protected kft mo3509f() {
        return this.f23418a;
    }

    protected /* synthetic */ Object F_() {
        return mo3509f();
    }

    /* renamed from: b */
    protected /* synthetic */ Collection mo3225b() {
        return mo3509f();
    }

    /* renamed from: e */
    public Set mo2112e() {
        Set set = this.f23419b;
        if (set != null) {
            return set;
        }
        set = mo3597c();
        this.f23419b = set;
        return set;
    }

    /* renamed from: g */
    public final Set mo2114g() {
        Set set = this.f23420c;
        if (set != null) {
            return set;
        }
        set = Collections.unmodifiableSet(this.f23418a.mo2114g());
        this.f23420c = set;
        return set;
    }

    public Iterator iterator() {
        return khb.m4901d(this.f23418a.iterator());
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final int mo2109b(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final int mo2110c(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo2107a(Object obj, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
