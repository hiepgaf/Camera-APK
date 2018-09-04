package p000;

import java.util.HashMap;

/* compiled from: PG */
/* renamed from: f */
public final class C0155f extends C0121g {
    /* renamed from: a */
    public HashMap f15821a = new HashMap();

    /* renamed from: a */
    public final boolean m10141a(Object obj) {
        return this.f15821a.containsKey(obj);
    }

    /* renamed from: b */
    protected final C0123j mo1332b(Object obj) {
        return (C0123j) this.f15821a.get(obj);
    }

    /* renamed from: a */
    public final Object mo1331a(Object obj, Object obj2) {
        C0123j b = mo1332b(obj);
        if (b != null) {
            return b.f7594b;
        }
        this.f15821a.put(obj, m2450b(obj, obj2));
        return null;
    }

    /* renamed from: c */
    public final Object mo1333c(Object obj) {
        Object c = super.mo1333c(obj);
        this.f15821a.remove(obj);
        return c;
    }
}
