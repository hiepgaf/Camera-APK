package p000;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: kdw */
public abstract class kdw extends kdv implements List {
    /* renamed from: c */
    public abstract List mo3373c();

    public void add(int i, Object obj) {
        mo3373c().add(i, obj);
    }

    public boolean addAll(int i, Collection collection) {
        return mo3373c().addAll(i, collection);
    }

    public /* synthetic */ Object F_() {
        return mo3373c();
    }

    /* renamed from: b */
    public /* synthetic */ Collection mo3225b() {
        return mo3373c();
    }

    public boolean equals(Object obj) {
        return obj == this || mo3373c().equals(obj);
    }

    public Object get(int i) {
        return mo3373c().get(i);
    }

    public int hashCode() {
        return mo3373c().hashCode();
    }

    public int indexOf(Object obj) {
        return mo3373c().indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        return mo3373c().lastIndexOf(obj);
    }

    public ListIterator listIterator() {
        return mo3373c().listIterator();
    }

    public ListIterator listIterator(int i) {
        return mo3373c().listIterator(i);
    }

    public Object remove(int i) {
        return mo3373c().remove(i);
    }

    public Object set(int i, Object obj) {
        return mo3373c().set(i, obj);
    }

    public List subList(int i, int i2) {
        return mo3373c().subList(i, i2);
    }
}
