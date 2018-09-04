package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: kff */
class kff extends AbstractList {
    /* renamed from: a */
    public final List f8265a;

    kff(List list) {
        this.f8265a = (List) jri.m13152b((Object) list);
    }

    public void add(int i, Object obj) {
        this.f8265a.add(m4819a(i), obj);
    }

    public void clear() {
        this.f8265a.clear();
    }

    public Object get(int i) {
        return this.f8265a.get(m4818b(i));
    }

    public Iterator iterator() {
        return listIterator();
    }

    public ListIterator listIterator(int i) {
        return new kfg(this, this.f8265a.listIterator(m4819a(i)));
    }

    public Object remove(int i) {
        return this.f8265a.remove(m4818b(i));
    }

    protected void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    /* renamed from: b */
    private final int m4818b(int i) {
        int size = size();
        jri.m13138a(i, size);
        return (size - 1) - i;
    }

    /* renamed from: a */
    final int m4819a(int i) {
        int size = size();
        jri.m13151b(i, size);
        return size - i;
    }

    public Object set(int i, Object obj) {
        return this.f8265a.set(m4818b(i), obj);
    }

    public int size() {
        return this.f8265a.size();
    }

    public List subList(int i, int i2) {
        jri.m13142a(i, i2, size());
        return khb.m4867a(this.f8265a.subList(m4819a(i2), m4819a(i)));
    }
}
