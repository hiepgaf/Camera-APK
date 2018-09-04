package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: aha */
final class aha {
    /* renamed from: a */
    public final Object f454a;
    /* renamed from: b */
    public List f455b;
    /* renamed from: c */
    public aha f456c;
    /* renamed from: d */
    public aha f457d;

    aha() {
        this(null);
    }

    aha(Object obj) {
        this.f457d = this;
        this.f456c = this;
        this.f454a = obj;
    }

    /* renamed from: a */
    public final Object m277a() {
        int b = m278b();
        return b > 0 ? this.f455b.remove(b - 1) : null;
    }

    /* renamed from: b */
    public final int m278b() {
        List list = this.f455b;
        return list != null ? list.size() : 0;
    }
}
