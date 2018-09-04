package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kgl */
final class kgl extends keu {
    /* renamed from: a */
    private final transient kes f22040a;
    /* renamed from: b */
    private final transient ken f22041b;

    kgl(kes kes, ken ken) {
        this.f22040a = kes;
        this.f22041b = ken;
    }

    /* renamed from: a */
    public final ken mo2143a() {
        return this.f22041b;
    }

    public final boolean contains(Object obj) {
        return this.f22040a.get(obj) != null;
    }

    /* renamed from: a */
    final int mo2142a(Object[] objArr, int i) {
        return this.f22041b.mo2142a(objArr, i);
    }

    /* renamed from: b */
    final boolean mo3227b() {
        return true;
    }

    /* renamed from: c */
    public final khy mo2144c() {
        return this.f22041b.m13468a(0);
    }

    public final /* synthetic */ Iterator iterator() {
        return mo2144c();
    }

    public final int size() {
        return this.f22040a.size();
    }
}
