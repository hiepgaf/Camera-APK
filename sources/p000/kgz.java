package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* compiled from: PG */
/* renamed from: kgz */
class kgz extends kfx implements SortedSet {
    /* renamed from: a */
    public final kgx f22055a;

    kgz(kgx kgx) {
        this.f22055a = kgx;
    }

    public Comparator comparator() {
        return this.f22055a.mo3216a();
    }

    public Object first() {
        kfu k = this.f22055a.mo3221k();
        if (k != null) {
            return k.mo3240b();
        }
        throw new NoSuchElementException();
    }

    public SortedSet headSet(Object obj) {
        return this.f22055a.mo3507a(obj, kcy.OPEN).mo3220j();
    }

    public Iterator iterator() {
        return khb.m4887b(this.f22055a.mo2114g().iterator());
    }

    public Object last() {
        kfu l = this.f22055a.mo3222l();
        if (l != null) {
            return l.mo3240b();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    final /* synthetic */ kft mo3214a() {
        return this.f22055a;
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return this.f22055a.mo3217a(obj, kcy.CLOSED, obj2, kcy.OPEN).mo3220j();
    }

    public SortedSet tailSet(Object obj) {
        return this.f22055a.mo3508b(obj, kcy.CLOSED).mo3220j();
    }
}
