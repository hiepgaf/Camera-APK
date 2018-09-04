package p000;

import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: j */
public final class C0123j implements Entry {
    /* renamed from: a */
    public final Object f7593a;
    /* renamed from: b */
    public final Object f7594b;
    /* renamed from: c */
    public C0123j f7595c;
    /* renamed from: d */
    public C0123j f7596d;

    C0123j(Object obj, Object obj2) {
        this.f7593a = obj;
        this.f7594b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0123j)) {
            return false;
        }
        C0123j c0123j = (C0123j) obj;
        if (this.f7593a.equals(c0123j.f7593a) && this.f7594b.equals(c0123j.f7594b)) {
            return true;
        }
        return false;
    }

    public final Object getKey() {
        return this.f7593a;
    }

    public final Object getValue() {
        return this.f7594b;
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f7593a);
        stringBuilder.append("=");
        stringBuilder.append(this.f7594b);
        return stringBuilder.toString();
    }
}
