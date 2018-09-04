package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* renamed from: khl */
class khl extends khj implements SortedSet {
    public static final long serialVersionUID = 0;

    khl(SortedSet sortedSet, Object obj) {
        super(sortedSet, obj);
    }

    public Comparator comparator() {
        Comparator comparator;
        synchronized (this.a) {
            comparator = mo3593d().comparator();
        }
        return comparator;
    }

    /* renamed from: a */
    /* synthetic */ Object mo2169a() {
        return mo3593d();
    }

    /* renamed from: b */
    /* synthetic */ Collection mo3243b() {
        return mo3593d();
    }

    /* renamed from: c */
    /* synthetic */ Set mo3523c() {
        return mo3593d();
    }

    /* renamed from: d */
    SortedSet mo3593d() {
        return (SortedSet) super.mo3523c();
    }

    public Object first() {
        Object first;
        synchronized (this.a) {
            first = mo3593d().first();
        }
        return first;
    }

    public SortedSet headSet(Object obj) {
        SortedSet khl;
        synchronized (this.a) {
            khl = new khl(mo3593d().headSet(obj), this.a);
        }
        return khl;
    }

    public Object last() {
        Object last;
        synchronized (this.a) {
            last = mo3593d().last();
        }
        return last;
    }

    public SortedSet subSet(Object obj, Object obj2) {
        SortedSet khl;
        synchronized (this.a) {
            khl = new khl(mo3593d().subSet(obj, obj2), this.a);
        }
        return khl;
    }

    public SortedSet tailSet(Object obj) {
        SortedSet khl;
        synchronized (this.a) {
            khl = new khl(mo3593d().tailSet(obj), this.a);
        }
        return khl;
    }
}
