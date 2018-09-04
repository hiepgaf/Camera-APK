package p000;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: ktu */
class ktu extends AbstractMap {
    /* renamed from: a */
    public List f8549a;
    /* renamed from: b */
    public Map f8550b;
    /* renamed from: c */
    public boolean f8551c;
    /* renamed from: d */
    public Map f8552d;
    /* renamed from: e */
    private final int f8553e;
    /* renamed from: f */
    private volatile kud f8554f;
    /* renamed from: g */
    private volatile ktx f8555g;

    private ktu(int i) {
        this.f8553e = i;
        this.f8549a = Collections.emptyList();
        this.f8550b = Collections.emptyMap();
        this.f8552d = Collections.emptyMap();
    }

    /* renamed from: a */
    private final int m5283a(Comparable comparable) {
        int compareTo;
        int i = 0;
        int size = this.f8549a.size() - 1;
        if (size >= 0) {
            compareTo = comparable.compareTo(((kub) this.f8549a.get(size)).f8563a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            compareTo = comparable.compareTo(((kub) this.f8549a.get(i2)).f8563a);
            if (compareTo < 0) {
                compareTo = i2 - 1;
                size = i;
            } else if (compareTo <= 0) {
                return i2;
            } else {
                int i3 = size;
                size = i2 + 1;
                compareTo = i3;
            }
            i = size;
            size = compareTo;
        }
        return -(i + 1);
    }

    /* renamed from: a */
    final void m5288a() {
        if (this.f8551c) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        m5288a();
        if (!this.f8549a.isEmpty()) {
            this.f8549a.clear();
        }
        if (!this.f8550b.isEmpty()) {
            this.f8550b.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m5283a(comparable) >= 0 || this.f8550b.containsKey(comparable);
    }

    /* renamed from: b */
    final Set m5289b() {
        if (this.f8555g == null) {
            this.f8555g = new ktx(this);
        }
        return this.f8555g;
    }

    public Set entrySet() {
        if (this.f8554f == null) {
            this.f8554f = new kud(this);
        }
        return this.f8554f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktu)) {
            return super.equals(obj);
        }
        ktu ktu = (ktu) obj;
        int size = size();
        if (size != ktu.size()) {
            return false;
        }
        int c = m5290c();
        if (c != ktu.m5290c()) {
            return entrySet().equals(ktu.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!m5287a(i).equals(ktu.m5287a(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f8550b.equals(ktu.f8550b);
        }
        return true;
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m5283a(comparable);
        if (a >= 0) {
            return ((kub) this.f8549a.get(a)).getValue();
        }
        return this.f8550b.get(comparable);
    }

    /* renamed from: a */
    public final Entry m5287a(int i) {
        return (Entry) this.f8549a.get(i);
    }

    /* renamed from: c */
    public final int m5290c() {
        return this.f8549a.size();
    }

    /* renamed from: d */
    public final Iterable m5292d() {
        if (this.f8550b.isEmpty()) {
            return kty.f8560b;
        }
        return this.f8550b.entrySet();
    }

    /* renamed from: f */
    private final SortedMap m5285f() {
        m5288a();
        if (this.f8550b.isEmpty() && !(this.f8550b instanceof TreeMap)) {
            this.f8550b = new TreeMap();
            this.f8552d = ((TreeMap) this.f8550b).descendingMap();
        }
        return (SortedMap) this.f8550b;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < m5290c(); i2++) {
            i += ((kub) this.f8549a.get(i2)).hashCode();
        }
        if (this.f8550b.size() > 0) {
            return this.f8550b.hashCode() + i;
        }
        return i;
    }

    /* renamed from: e */
    public void mo2305e() {
        if (!this.f8551c) {
            Map emptyMap;
            if (this.f8550b.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.f8550b);
            }
            this.f8550b = emptyMap;
            if (this.f8552d.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.f8552d);
            }
            this.f8552d = emptyMap;
            this.f8551c = true;
        }
    }

    /* renamed from: b */
    static ktu m5284b(int i) {
        return new ktv(i);
    }

    /* renamed from: a */
    public final Object m5286a(Comparable comparable, Object obj) {
        m5288a();
        int a = m5283a(comparable);
        if (a >= 0) {
            return ((kub) this.f8549a.get(a)).setValue(obj);
        }
        m5288a();
        if (this.f8549a.isEmpty() && !(this.f8549a instanceof ArrayList)) {
            this.f8549a = new ArrayList(this.f8553e);
        }
        int i = -(a + 1);
        if (i >= this.f8553e) {
            return m5285f().put(comparable, obj);
        }
        a = this.f8549a.size();
        int i2 = this.f8553e;
        if (a == i2) {
            kub kub = (kub) this.f8549a.remove(i2 - 1);
            m5285f().put(kub.f8563a, kub.getValue());
        }
        this.f8549a.add(i, new kub(this, comparable, obj));
        return null;
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return m5286a((Comparable) obj, obj2);
    }

    public Object remove(Object obj) {
        m5288a();
        Comparable comparable = (Comparable) obj;
        int a = m5283a(comparable);
        if (a >= 0) {
            return m5291c(a);
        }
        if (this.f8550b.isEmpty()) {
            return null;
        }
        return this.f8550b.remove(comparable);
    }

    /* renamed from: c */
    final Object m5291c(int i) {
        m5288a();
        Object value = ((kub) this.f8549a.remove(i)).getValue();
        if (!this.f8550b.isEmpty()) {
            Iterator it = m5285f().entrySet().iterator();
            this.f8549a.add(new kub(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public int size() {
        return this.f8549a.size() + this.f8550b.size();
    }
}
