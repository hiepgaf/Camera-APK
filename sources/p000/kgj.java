package p000;

import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kgj */
final class kgj extends keu {
    /* renamed from: a */
    public final transient Object[] f22035a;
    /* renamed from: b */
    public final transient int f22036b;
    /* renamed from: c */
    public final transient int f22037c;
    /* renamed from: d */
    private final transient kes f22038d;

    kgj(kes kes, Object[] objArr, int i, int i2) {
        this.f22038d = kes;
        this.f22035a = objArr;
        this.f22036b = i;
        this.f22037c = i2;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.f22038d.get(key))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    final int mo2142a(Object[] objArr, int i) {
        return mo2143a().mo2142a(objArr, i);
    }

    /* renamed from: e */
    final ken mo3242e() {
        return new kgk(this);
    }

    /* renamed from: b */
    final boolean mo3227b() {
        return true;
    }

    /* renamed from: c */
    public final khy mo2144c() {
        return mo2143a().m13468a(0);
    }

    public final /* synthetic */ Iterator iterator() {
        return mo2144c();
    }

    public final int size() {
        return this.f22037c;
    }
}
