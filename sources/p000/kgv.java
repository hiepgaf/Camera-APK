package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* renamed from: kgv */
final class kgv extends kea implements Serializable, NavigableSet {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final NavigableSet f23573a;
    /* renamed from: b */
    private final SortedSet f23574b;
    /* renamed from: c */
    private transient kgv f23575c;

    kgv(NavigableSet navigableSet) {
        this.f23573a = (NavigableSet) jri.m13152b((Object) navigableSet);
        this.f23574b = Collections.unmodifiableSortedSet(navigableSet);
    }

    public final Object ceiling(Object obj) {
        return this.f23573a.ceiling(obj);
    }

    protected final /* synthetic */ Object F_() {
        return this.f23574b;
    }

    /* renamed from: b */
    protected final /* synthetic */ Collection mo3225b() {
        return this.f23574b;
    }

    /* renamed from: c */
    protected final /* synthetic */ Set mo3513c() {
        return this.f23574b;
    }

    /* renamed from: d */
    protected final SortedSet mo3592d() {
        return this.f23574b;
    }

    public final Iterator descendingIterator() {
        return khb.m4901d(this.f23573a.descendingIterator());
    }

    public final NavigableSet descendingSet() {
        NavigableSet navigableSet = this.f23575c;
        if (navigableSet != null) {
            return navigableSet;
        }
        navigableSet = new kgv(this.f23573a.descendingSet());
        this.f23575c = navigableSet;
        navigableSet.f23575c = this;
        return navigableSet;
    }

    public final Object floor(Object obj) {
        return this.f23573a.floor(obj);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return khb.m4869a(this.f23573a.headSet(obj, z));
    }

    public final Object higher(Object obj) {
        return this.f23573a.higher(obj);
    }

    public final Object lower(Object obj) {
        return this.f23573a.lower(obj);
    }

    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return khb.m4869a(this.f23573a.subSet(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return khb.m4869a(this.f23573a.tailSet(obj, z));
    }
}
