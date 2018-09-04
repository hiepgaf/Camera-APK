package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: kep */
final class kep extends ken {
    /* renamed from: a */
    private final transient ken f22014a;

    kep(ken ken) {
        this.f22014a = ken;
    }

    public final boolean contains(Object obj) {
        return this.f22014a.contains(obj);
    }

    public final Object get(int i) {
        jri.m13138a(i, size());
        return this.f22014a.get(m16495b(i));
    }

    public final int indexOf(Object obj) {
        int lastIndexOf = this.f22014a.lastIndexOf(obj);
        return lastIndexOf >= 0 ? m16495b(lastIndexOf) : -1;
    }

    /* renamed from: b */
    final boolean mo3227b() {
        return this.f22014a.mo3227b();
    }

    public final int lastIndexOf(Object obj) {
        int indexOf = this.f22014a.indexOf(obj);
        return indexOf >= 0 ? m16495b(indexOf) : -1;
    }

    /* renamed from: f */
    public final ken mo3234f() {
        return this.f22014a;
    }

    /* renamed from: b */
    private final int m16495b(int i) {
        return (size() - 1) - i;
    }

    public final int size() {
        return this.f22014a.size();
    }

    /* renamed from: a */
    public final ken mo3233a(int i, int i2) {
        jri.m13142a(i, i2, size());
        return this.f22014a.mo3233a(size() - i2, size() - i).mo3234f();
    }

    public final /* synthetic */ List subList(int i, int i2) {
        return mo3233a(i, i2);
    }
}
