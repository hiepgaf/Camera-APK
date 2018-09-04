package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* renamed from: khh */
final class khh extends khl implements NavigableSet {
    public static final long serialVersionUID = 0;
    /* renamed from: b */
    private transient NavigableSet f23576b;

    khh(NavigableSet navigableSet, Object obj) {
        super(navigableSet, obj);
    }

    public final Object ceiling(Object obj) {
        Object ceiling;
        synchronized (this.a) {
            ceiling = ((NavigableSet) super.mo3593d()).ceiling(obj);
        }
        return ceiling;
    }

    /* renamed from: a */
    final /* synthetic */ Object mo2169a() {
        return (NavigableSet) super.mo3593d();
    }

    /* renamed from: b */
    final /* synthetic */ Collection mo3243b() {
        return (NavigableSet) super.mo3593d();
    }

    /* renamed from: c */
    final /* synthetic */ Set mo3523c() {
        return (NavigableSet) super.mo3593d();
    }

    /* renamed from: d */
    final /* synthetic */ SortedSet mo3593d() {
        return (NavigableSet) super.mo3593d();
    }

    public final Iterator descendingIterator() {
        return ((NavigableSet) super.mo3593d()).descendingIterator();
    }

    public final NavigableSet descendingSet() {
        NavigableSet navigableSet;
        synchronized (this.a) {
            navigableSet = this.f23576b;
            if (navigableSet != null) {
            } else {
                navigableSet = khb.m4870a(((NavigableSet) super.mo3593d()).descendingSet(), this.a);
                this.f23576b = navigableSet;
            }
        }
        return navigableSet;
    }

    public final Object floor(Object obj) {
        Object floor;
        synchronized (this.a) {
            floor = ((NavigableSet) super.mo3593d()).floor(obj);
        }
        return floor;
    }

    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        NavigableSet a;
        synchronized (this.a) {
            a = khb.m4870a(((NavigableSet) super.mo3593d()).headSet(obj, z), this.a);
        }
        return a;
    }

    public final Object higher(Object obj) {
        Object higher;
        synchronized (this.a) {
            higher = ((NavigableSet) super.mo3593d()).higher(obj);
        }
        return higher;
    }

    public final Object lower(Object obj) {
        Object lower;
        synchronized (this.a) {
            lower = ((NavigableSet) super.mo3593d()).lower(obj);
        }
        return lower;
    }

    public final Object pollFirst() {
        Object pollFirst;
        synchronized (this.a) {
            pollFirst = ((NavigableSet) super.mo3593d()).pollFirst();
        }
        return pollFirst;
    }

    public final Object pollLast() {
        Object pollLast;
        synchronized (this.a) {
            pollLast = ((NavigableSet) super.mo3593d()).pollLast();
        }
        return pollLast;
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        NavigableSet a;
        synchronized (this.a) {
            a = khb.m4870a(((NavigableSet) super.mo3593d()).subSet(obj, z, obj2, z2), this.a);
        }
        return a;
    }

    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        NavigableSet a;
        synchronized (this.a) {
            a = khb.m4870a(((NavigableSet) super.mo3593d()).tailSet(obj, z), this.a);
        }
        return a;
    }
}
