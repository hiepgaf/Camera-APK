package p000;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: g */
public class C0121g implements Iterable {
    /* renamed from: b */
    public C0123j f4945b;
    /* renamed from: c */
    public C0123j f4946c;
    /* renamed from: d */
    public WeakHashMap f4947d = new WeakHashMap();
    /* renamed from: e */
    public int f4948e = 0;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0121g)) {
            return false;
        }
        C0121g c0121g = (C0121g) obj;
        if (this.f4948e != c0121g.f4948e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0121g.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = it2.next();
            if (entry == null) {
                if (next != null) {
                    return false;
                }
            }
            if (entry != null && !entry.equals(next)) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* renamed from: b */
    protected C0123j mo1332b(Object obj) {
        C0123j c0123j = this.f4945b;
        while (c0123j != null && !c0123j.f7593a.equals(obj)) {
            c0123j = c0123j.f7595c;
        }
        return c0123j;
    }

    public Iterator iterator() {
        Iterator c0163h = new C0163h(this.f4945b, this.f4946c);
        this.f4947d.put(c0163h, Boolean.valueOf(false));
        return c0163h;
    }

    /* renamed from: a */
    public final C0156k m2448a() {
        C0156k c0156k = new C0156k(this);
        this.f4947d.put(c0156k, Boolean.valueOf(false));
        return c0156k;
    }

    /* renamed from: b */
    protected final C0123j m2450b(Object obj, Object obj2) {
        C0123j c0123j = new C0123j(obj, obj2);
        this.f4948e++;
        C0123j c0123j2 = this.f4946c;
        if (c0123j2 == null) {
            this.f4945b = c0123j;
            this.f4946c = this.f4945b;
        } else {
            c0123j2.f7595c = c0123j;
            c0123j.f7596d = c0123j2;
            this.f4946c = c0123j;
        }
        return c0123j;
    }

    /* renamed from: a */
    public Object mo1331a(Object obj, Object obj2) {
        C0123j b = mo1332b(obj);
        if (b != null) {
            return b.f7594b;
        }
        m2450b(obj, obj2);
        return null;
    }

    /* renamed from: c */
    public Object mo1333c(Object obj) {
        C0123j b = mo1332b(obj);
        if (b == null) {
            return null;
        }
        this.f4948e--;
        if (!this.f4947d.isEmpty()) {
            for (C0124m a_ : this.f4947d.keySet()) {
                a_.a_(b);
            }
        }
        C0123j c0123j = b.f7596d;
        if (c0123j != null) {
            c0123j.f7595c = b.f7595c;
        } else {
            this.f4945b = b.f7595c;
        }
        C0123j c0123j2 = b.f7595c;
        if (c0123j2 != null) {
            c0123j2.f7596d = c0123j;
        } else {
            this.f4946c = c0123j;
        }
        b.f7595c = null;
        b.f7596d = null;
        return b.f7594b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            stringBuilder.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
