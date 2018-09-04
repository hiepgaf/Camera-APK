package p000;

import java.util.Iterator;
import java.util.NavigableSet;

/* compiled from: PG */
/* renamed from: kha */
final class kha extends kgz implements NavigableSet {
    kha(kgx kgx) {
        super(kgx);
    }

    public final Object ceiling(Object obj) {
        kfu k = this.f22055a.mo3508b(obj, kcy.CLOSED).mo3221k();
        return k != null ? k.mo3240b() : null;
    }

    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public final NavigableSet descendingSet() {
        return new kha(this.f22055a.mo3219i());
    }

    public final Object floor(Object obj) {
        kfu l = this.f22055a.mo3507a(obj, kcy.CLOSED).mo3222l();
        return l != null ? l.mo3240b() : null;
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return new kha(this.f22055a.mo3507a(obj, kcy.m4767a(z)));
    }

    public final Object higher(Object obj) {
        kfu k = this.f22055a.mo3508b(obj, kcy.OPEN).mo3221k();
        return k != null ? k.mo3240b() : null;
    }

    public final Object lower(Object obj) {
        kfu l = this.f22055a.mo3507a(obj, kcy.OPEN).mo3222l();
        return l != null ? l.mo3240b() : null;
    }

    public final Object pollFirst() {
        kfu m = this.f22055a.mo3223m();
        return m != null ? m.mo3240b() : null;
    }

    public final Object pollLast() {
        kfu n = this.f22055a.mo3224n();
        return n != null ? n.mo3240b() : null;
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new kha(this.f22055a.mo3217a(obj, kcy.m4767a(z), obj2, kcy.m4767a(z2)));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return new kha(this.f22055a.mo3508b(obj, kcy.m4767a(z)));
    }
}
