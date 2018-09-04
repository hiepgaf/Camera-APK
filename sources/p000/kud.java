package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kud */
class kud extends AbstractSet {
    /* renamed from: a */
    private final /* synthetic */ ktu f8570a;

    kud(ktu ktu) {
        this.f8570a = ktu;
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f8570a.m5286a((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f8570a.clear();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f8570a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value) {
            return true;
        }
        if (obj2 != null && obj2.equals(value)) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return new kuc(this.f8570a);
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f8570a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f8570a.size();
    }
}
