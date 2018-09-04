package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* renamed from: kea */
public abstract class kea extends kdz implements SortedSet {
    protected kea() {
    }

    /* renamed from: d */
    protected abstract SortedSet mo3592d();

    public Comparator comparator() {
        return mo3592d().comparator();
    }

    protected /* synthetic */ Object F_() {
        return mo3592d();
    }

    /* renamed from: b */
    protected /* synthetic */ Collection mo3225b() {
        return mo3592d();
    }

    /* renamed from: c */
    protected /* synthetic */ Set mo3513c() {
        return mo3592d();
    }

    public Object first() {
        return mo3592d().first();
    }

    public SortedSet headSet(Object obj) {
        return mo3592d().headSet(obj);
    }

    public Object last() {
        return mo3592d().last();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return mo3592d().subSet(obj, obj2);
    }

    public SortedSet tailSet(Object obj) {
        return mo3592d().tailSet(obj);
    }
}
