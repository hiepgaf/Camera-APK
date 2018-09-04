package p000;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: kch */
class kch extends kcf implements List {
    /* renamed from: d */
    public final /* synthetic */ kbv f19160d;

    kch(kbv kbv, Object obj, List list, kcf kcf) {
        this.f19160d = kbv;
        super(kbv, obj, list, kcf);
    }

    public void add(int i, Object obj) {
        m4763b();
        boolean isEmpty = this.f8200b.isEmpty();
        ((List) this.f8200b).add(i, obj);
        this.f19160d.f22004b = this.f19160d.f22004b + 1;
        if (isEmpty) {
            m4762a();
        }
    }

    public boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f8200b).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        kbv.m16438a(this.f19160d, this.f8200b.size() - size);
        if (size != 0) {
            return addAll;
        }
        m4762a();
        return addAll;
    }

    public Object get(int i) {
        m4763b();
        return ((List) this.f8200b).get(i);
    }

    public int indexOf(Object obj) {
        m4763b();
        return ((List) this.f8200b).indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        m4763b();
        return ((List) this.f8200b).lastIndexOf(obj);
    }

    public ListIterator listIterator() {
        m4763b();
        return new kci(this);
    }

    public ListIterator listIterator(int i) {
        m4763b();
        return new kci(this, i);
    }

    public Object remove(int i) {
        m4763b();
        Object remove = ((List) this.f8200b).remove(i);
        this.f19160d.f22004b = this.f19160d.f22004b - 1;
        m4764c();
        return remove;
    }

    public Object set(int i, Object obj) {
        m4763b();
        return ((List) this.f8200b).set(i, obj);
    }

    public List subList(int i, int i2) {
        kcf kcf;
        m4763b();
        kbv kbv = this.f19160d;
        Object obj = this.f8199a;
        List subList = ((List) this.f8200b).subList(i, i2);
        kcf kcf2 = this.f8201c;
        if (kcf2 != null) {
            kcf = kcf2;
        }
        return kbv.m16444a(obj, subList, kcf);
    }
}
